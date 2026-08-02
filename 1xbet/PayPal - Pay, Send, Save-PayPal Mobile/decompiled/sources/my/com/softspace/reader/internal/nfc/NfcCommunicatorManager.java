package my.com.softspace.reader.internal.nfc;

/* loaded from: classes17.dex */
public class NfcCommunicatorManager {
    private static volatile com.discover.mpos.sdk.card.connectors.CardConnector Camera2StreamConfigurationMap;

    public interface Callback {
        void onNfcTagDetected(my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus nfcConnectStatus, my.com.softspace.reader.internal.nfc.NfcCommunicator nfcCommunicator);
    }

    public enum NfcConnectStatus {
        Successful,
        GeneralFail,
        InvalidTagDetectedFail,
        DuplicateCardFail
    }

    public enum NfcType {
        Payment,
        Suica
    }

    public static java.util.concurrent.CompletableFuture<java.lang.Boolean> startNfcListening(android.app.Activity activity, my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcType nfcType, final my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.Callback callback, my.com.softspace.reader.TEEReaderEngine.NFCProvider nFCProvider) {
        synchronized (my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.class) {
            if (activity == null) {
                throw new java.lang.IllegalArgumentException("Activity cannot be null");
            }
            final java.util.concurrent.CompletableFuture<java.lang.Boolean> completableFuture = new java.util.concurrent.CompletableFuture<>();
            android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(activity);
            if (my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.AnonymousClass1.Camera2StreamConfigurationMap[nfcType.ordinal()] == 1) {
                final my.com.softspace.reader.internal.nfc.PaymentCardCommunicator paymentCardCommunicator = new my.com.softspace.reader.internal.nfc.PaymentCardCommunicator(defaultAdapter);
                Camera2StreamConfigurationMap = paymentCardCommunicator;
                if (paymentCardCommunicator.getTechFlags() != 0) {
                    nFCProvider.enableListening(activity, new java.util.function.BiFunction() { // from class: my.com.softspace.reader.internal.nfc.NfcCommunicatorManager$$ExternalSyntheticLambda0
                        @Override // java.util.function.BiFunction
                        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                            return my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.Camera2StreamConfigurationMap(my.com.softspace.reader.internal.nfc.NfcCommunicator.this, callback, completableFuture, (android.nfc.Tag) obj2);
                        }
                    });
                    return completableFuture;
                }
                completableFuture.complete(java.lang.Boolean.FALSE);
                return completableFuture;
            }
            throw new java.lang.UnsupportedOperationException("Card type is currently unsupported");
        }
    }

    static /* synthetic */ java.lang.Void Camera2StreamConfigurationMap(my.com.softspace.reader.internal.nfc.NfcCommunicator nfcCommunicator, my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.Callback callback, java.util.concurrent.CompletableFuture completableFuture, android.nfc.Tag tag) {
        if (tag != null) {
            java.util.stream.Stream stream = java.util.Arrays.stream(tag.getTechList());
            final java.util.List<java.lang.String> techList = nfcCommunicator.getTechList();
            java.util.Objects.requireNonNull(techList);
            my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus connectCard = stream.anyMatch(new java.util.function.Predicate() { // from class: my.com.softspace.reader.internal.nfc.NfcCommunicatorManager$$ExternalSyntheticLambda1
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return techList.contains((java.lang.String) obj);
                }
            }) ? nfcCommunicator.connectCard(tag) : my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus.InvalidTagDetectedFail;
            if (callback != null) {
                int i = my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.AnonymousClass1.getHighSpeedVideoFpsRangesFor[connectCard.ordinal()];
                if (i == 1) {
                    callback.onNfcTagDetected(my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus.DuplicateCardFail, null);
                } else if (i == 2) {
                    callback.onNfcTagDetected(my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus.InvalidTagDetectedFail, null);
                } else if (i == 3) {
                    callback.onNfcTagDetected(my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus.Successful, nfcCommunicator);
                } else {
                    callback.onNfcTagDetected(my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcConnectStatus.GeneralFail, null);
                }
            }
        }
        completableFuture.complete(java.lang.Boolean.TRUE);
        return null;
    }

    /* renamed from: my.com.softspace.reader.internal.nfc.NfcCommunicatorManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus.DuplicateCardFail.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus.InvalidTagDetectedFail.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus.Successful.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcType.values().length];
            Camera2StreamConfigurationMap = iArr2;
            try {
                iArr2[my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.NfcType.Payment.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public static void disableListening(android.app.Activity activity) {
        synchronized (my.com.softspace.reader.internal.nfc.NfcCommunicatorManager.class) {
            android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(activity);
            if (isEnabled(activity) && !activity.isFinishing()) {
                defaultAdapter.disableReaderMode(activity);
            }
            Camera2StreamConfigurationMap = null;
        }
    }

    public static boolean isEnabled(android.content.Context context) {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }

    public static com.discover.mpos.sdk.card.connectors.CardConnector getDiscoverNfcCommunicator() {
        return Camera2StreamConfigurationMap;
    }
}

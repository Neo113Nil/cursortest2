package com.paypal.android.taptopay.data.thales.replenishment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;", "", "Lcom/paypal/android/taptopay/data/thales/worker/BackgroundSyncWorkerUseCase;", "backgroundSyncWorkerUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/android/taptopay/data/thales/worker/BackgroundSyncWorkerUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCard;", "digitalizedCard", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardStatus;", "digitalizedCardStatus", "", "forceReplenishment", "", "replenishKeysIfNeeded", "(Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCard;Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardStatus;Z)V", "getHighSpeedVideoSizes", "Lcom/paypal/android/taptopay/data/thales/worker/BackgroundSyncWorkerUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardPaymentKeysReplenisher {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase Camera2StreamConfigurationMap;
    private static final byte[] $$c = {48, 87, 118, 14};
    private static final int $$d = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {108, -91, -61, -59, com.google.common.base.Ascii.US, 13, -7, 14, com.visa.cbp.getEncExpo.onUnminimized, -46, 34, 34, -1, -12, -3, 13, -41, 45, 0, -7, 4, -1, com.google.common.base.Ascii.SI, -2, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.DC4, -10, 7, 0, -32, com.google.common.base.Ascii.NAK, 16};
    private static final int $$b = 227;
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighResolutionOutputSizeshNQ4ISI = 1174361068039768134L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(byte b, byte b2, short s) {
        int i;
        int i2 = 4 - (s * 2);
        byte[] bArr = $$c;
        int i3 = b2 * 4;
        int i4 = b + 110;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            i4 = i5;
            int i6 = i2;
            int i7 = 0;
            i4 += i2;
            i2 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new java.lang.String(bArr2, 0);
            }
            int i8 = i + 1;
            i6 = i2;
            i2 = bArr[i2];
            i7 = i8;
            i4 += i2;
            i2 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 28) + 4;
        byte[] bArr = $$a;
        int i5 = 98 - (b * 31);
        int i6 = b2 * 28;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = -1;
            i4++;
            i5 = (i7 + i5) - 1;
            i2 = i8;
            int i9 = i4;
            int i10 = i5;
            i3 = i2 + 1;
            bArr2[i3] = (byte) i10;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4 = i9;
            i5 = bArr[i9];
            i8 = i3;
            i7 = i10;
            i4++;
            i5 = (i7 + i5) - 1;
            i2 = i8;
            int i92 = i4;
            int i102 = i5;
            i3 = i2 + 1;
            bArr2[i3] = (byte) i102;
            if (i3 == i6) {
            }
        } else {
            i2 = -1;
            int i922 = i4;
            int i1022 = i5;
            i3 = i2 + 1;
            bArr2[i3] = (byte) i1022;
            if (i3 == i6) {
            }
        }
    }

    @javax.inject.Inject
    public CardPaymentKeysReplenisher(com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase backgroundSyncWorkerUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundSyncWorkerUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = backgroundSyncWorkerUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CardPaymentKeysReplenisher(com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase backgroundSyncWorkerUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(backgroundSyncWorkerUseCase, coroutineDispatcher);
        if ((i & 2) != 0) {
            int i2 = Camera2StreamConfigurationMap + 81;
            getHighSpeedVideoFpsRanges = i2 % 128;
            int i3 = i2 % 2;
            coroutineDispatcher = kotlinx.coroutines.Dispatchers.getIO();
            int i4 = Camera2StreamConfigurationMap + 83;
            getHighSpeedVideoFpsRanges = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
    }

    public static final /* synthetic */ com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase access$getBackgroundSyncWorkerUseCase$p(com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher) {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = i2 + 119;
        Camera2StreamConfigurationMap = i3 % 128;
        int i4 = i3 % 2;
        com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase backgroundSyncWorkerUseCase = cardPaymentKeysReplenisher.Camera2StreamConfigurationMap;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 51;
        Camera2StreamConfigurationMap = i5 % 128;
        int i6 = i5 % 2;
        return backgroundSyncWorkerUseCase;
    }

    public static /* synthetic */ void replenishKeysIfNeeded$default(com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher, com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus, boolean z, int i, java.lang.Object obj) {
        int i2 = 2 % 2;
        int i3 = getHighSpeedVideoFpsRanges + 81;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0 ? (i & 4) != 0 : (i & 3) != 0) {
            z = false;
        }
        cardPaymentKeysReplenisher.replenishKeysIfNeeded(digitalizedCard, digitalizedCardStatus, z);
        int i4 = Camera2StreamConfigurationMap + 49;
        getHighSpeedVideoFpsRanges = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void replenishKeysIfNeeded(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus digitalizedCardStatus, boolean forceReplenishment) {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRanges + 31;
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i2 % 2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalizedCard, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalizedCardStatus, "");
        if (digitalizedCardStatus.needsReplenishment()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Sending request for payment key replenishment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("forceReplenishment", java.lang.Boolean.valueOf(forceReplenishment)), kotlin.TuplesKt.to("tokenizedCardId", digitalizedCard.getTokenizedCardID()), kotlin.TuplesKt.to("numberOfPaymentsLeft", java.lang.Integer.valueOf(digitalizedCardStatus.getNumberOfPaymentsLeft()))), null, 4, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.getHighResolutionOutputSizeshNQ4ISI), null, null, new com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher$replenishKeysIfNeeded$1(this, digitalizedCard, forceReplenishment, null), 3, null);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Replenishment not needed.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("numberOfPaymentsLeft", java.lang.Integer.valueOf(digitalizedCardStatus.getNumberOfPaymentsLeft()))), null, 4, null);
            int i4 = getHighSpeedVideoFpsRanges + 7;
            Camera2StreamConfigurationMap = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void b(int i, char[] cArr, java.lang.Object[] objArr) {
        int i2 = 2 % 2;
        o.isOutputSupportedFor isoutputsupportedfor = new o.isOutputSupportedFor();
        isoutputsupportedfor.Camera2StreamConfigurationMap = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        isoutputsupportedfor.getHighSpeedVideoSizes = 0;
        while (isoutputsupportedfor.getHighSpeedVideoSizes < cArr.length) {
            int i3 = isoutputsupportedfor.getHighSpeedVideoSizes;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[isoutputsupportedfor.getHighSpeedVideoSizes]), isoutputsupportedfor, isoutputsupportedfor};
                java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-654542938);
                if (Camera2StreamConfigurationMap2 == null) {
                    char deadChar = (char) android.view.KeyEvent.getDeadChar(0, 0);
                    int deadChar2 = android.view.KeyEvent.getDeadChar(0, 0) + 511;
                    int rgb = android.graphics.Color.rgb(0, 0, 0) + 16777228;
                    byte b = (byte) ($$d & 5);
                    byte b2 = (byte) (b - 1);
                    Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(deadChar, deadChar2, rgb, 1174189734, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2)).longValue() ^ (getHighResolutionOutputSizeshNQ4ISI ^ (-5584016317460956119L));
                java.lang.Object[] objArr3 = {isoutputsupportedfor, isoutputsupportedfor};
                java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(2116725884);
                if (Camera2StreamConfigurationMap3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 491, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, -483758724, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        isoutputsupportedfor.getHighSpeedVideoSizes = 0;
        int i4 = $10 + 51;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (isoutputsupportedfor.getHighSpeedVideoSizes < cArr.length) {
            int i6 = $11 + 33;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[isoutputsupportedfor.getHighSpeedVideoSizes] = (char) jArr[isoutputsupportedfor.getHighSpeedVideoSizes];
                try {
                    java.lang.Object[] objArr4 = {isoutputsupportedfor, isoutputsupportedfor};
                    java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(2116725884);
                    if (Camera2StreamConfigurationMap4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 491, android.view.View.MeasureSpec.getMode(0) + 20, -483758724, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr4);
                    throw null;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[isoutputsupportedfor.getHighSpeedVideoSizes] = (char) jArr[isoutputsupportedfor.getHighSpeedVideoSizes];
            java.lang.Object[] objArr5 = {isoutputsupportedfor, isoutputsupportedfor};
            java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(2116725884);
            if (Camera2StreamConfigurationMap5 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 492, 20 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -483758724, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) Camera2StreamConfigurationMap5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] Camera2StreamConfigurationMap(int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher.Camera2StreamConfigurationMap(int, int, int):java.lang.Object[]");
    }
}

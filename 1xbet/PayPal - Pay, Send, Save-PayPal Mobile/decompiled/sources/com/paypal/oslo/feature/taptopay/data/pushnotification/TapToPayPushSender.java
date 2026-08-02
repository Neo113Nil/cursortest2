package com.paypal.oslo.feature.taptopay.data.pushnotification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/pushnotification/TapToPayPushSender;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PAYAIR", "PAYPAL_TSP", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TapToPayPushSender {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender PAYAIR;
    public static final com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender PAYPAL_TSP;
    public static final com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private TapToPayPushSender(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender tapToPayPushSender = new com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender("PAYAIR", 0);
        PAYAIR = tapToPayPushSender;
        com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender tapToPayPushSender2 = new com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender("PAYPAL_TSP", 1);
        PAYPAL_TSP = tapToPayPushSender2;
        com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender tapToPayPushSender3 = new com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender("UNKNOWN", 2);
        UNKNOWN = tapToPayPushSender3;
        com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender[] tapToPayPushSenderArr = {tapToPayPushSender, tapToPayPushSender2, tapToPayPushSender3};
        getHighSpeedVideoFpsRanges = tapToPayPushSenderArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(tapToPayPushSenderArr);
        INSTANCE = new com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/pushnotification/TapToPayPushSender$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/taptopay/data/pushnotification/TapToPayPushSender;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/data/pushnotification/TapToPayPushSender;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender from(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender) obj).name(), value, true)) {
                    break;
                }
            }
            com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender tapToPayPushSender = (com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender) obj;
            return tapToPayPushSender == null ? com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender.UNKNOWN : tapToPayPushSender;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender[] values() {
        return (com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}

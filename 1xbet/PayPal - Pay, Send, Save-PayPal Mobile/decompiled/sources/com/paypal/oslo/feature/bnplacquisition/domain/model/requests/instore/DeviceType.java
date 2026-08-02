package com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PHONE", "WATCH", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType PHONE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType UNKNOWN__;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType WATCH;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType[] getHighSpeedVideoSizes;

    private DeviceType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType("PHONE", 0);
        PHONE = deviceType;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType("WATCH", 1);
        WATCH = deviceType2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType("UNKNOWN__", 2);
        UNKNOWN__ = deviceType3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType[] deviceTypeArr = {deviceType, deviceType2, deviceType3};
        getHighSpeedVideoSizes = deviceTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(deviceTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType) obj;
            return deviceType == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.UNKNOWN__ : deviceType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

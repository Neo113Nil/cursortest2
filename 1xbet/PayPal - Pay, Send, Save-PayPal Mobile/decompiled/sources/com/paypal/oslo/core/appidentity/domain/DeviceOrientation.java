package com.paypal.oslo.core.appidentity.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/core/appidentity/domain/DeviceOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "UNDEFINED", "PORTRAIT", "LANDSCAPE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeviceOrientation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.appidentity.domain.DeviceOrientation.Companion INSTANCE;
    public static final com.paypal.oslo.core.appidentity.domain.DeviceOrientation LANDSCAPE;
    public static final com.paypal.oslo.core.appidentity.domain.DeviceOrientation PORTRAIT;
    public static final com.paypal.oslo.core.appidentity.domain.DeviceOrientation UNDEFINED;
    private static final /* synthetic */ com.paypal.oslo.core.appidentity.domain.DeviceOrientation[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DeviceOrientation(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.appidentity.domain.DeviceOrientation deviceOrientation = new com.paypal.oslo.core.appidentity.domain.DeviceOrientation("UNDEFINED", 0);
        UNDEFINED = deviceOrientation;
        com.paypal.oslo.core.appidentity.domain.DeviceOrientation deviceOrientation2 = new com.paypal.oslo.core.appidentity.domain.DeviceOrientation("PORTRAIT", 1);
        PORTRAIT = deviceOrientation2;
        com.paypal.oslo.core.appidentity.domain.DeviceOrientation deviceOrientation3 = new com.paypal.oslo.core.appidentity.domain.DeviceOrientation("LANDSCAPE", 2);
        LANDSCAPE = deviceOrientation3;
        com.paypal.oslo.core.appidentity.domain.DeviceOrientation[] deviceOrientationArr = {deviceOrientation, deviceOrientation2, deviceOrientation3};
        getHighSpeedVideoFpsRanges = deviceOrientationArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(deviceOrientationArr);
        INSTANCE = new com.paypal.oslo.core.appidentity.domain.DeviceOrientation.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/appidentity/domain/DeviceOrientation$Companion;", "", "<init>", "()V", "", "configOrientation", "Lcom/paypal/oslo/core/appidentity/domain/DeviceOrientation;", "fromConfigOrientation", "(I)Lcom/paypal/oslo/core/appidentity/domain/DeviceOrientation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.core.appidentity.domain.DeviceOrientation fromConfigOrientation(int configOrientation) {
            if (configOrientation == 1) {
                return com.paypal.oslo.core.appidentity.domain.DeviceOrientation.PORTRAIT;
            }
            if (configOrientation == 2) {
                return com.paypal.oslo.core.appidentity.domain.DeviceOrientation.LANDSCAPE;
            }
            return com.paypal.oslo.core.appidentity.domain.DeviceOrientation.UNDEFINED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.core.appidentity.domain.DeviceOrientation[] values() {
        return (com.paypal.oslo.core.appidentity.domain.DeviceOrientation[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.appidentity.domain.DeviceOrientation valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.appidentity.domain.DeviceOrientation) java.lang.Enum.valueOf(com.paypal.oslo.core.appidentity.domain.DeviceOrientation.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.appidentity.domain.DeviceOrientation> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}

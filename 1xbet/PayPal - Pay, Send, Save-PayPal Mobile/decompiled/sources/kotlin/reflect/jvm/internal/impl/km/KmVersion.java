package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmVersion {
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public KmVersion(int i, int i2, int i3) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.Camera2StreamConfigurationMap = i3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.getHighSpeedVideoSizes) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.km.KmVersion)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.km.KmVersion kmVersion = (kotlin.reflect.jvm.internal.impl.km.KmVersion) obj;
        return this.getHighSpeedVideoSizes == kmVersion.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == kmVersion.getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap == kmVersion.Camera2StreamConfigurationMap;
    }

    public final int component3() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int component2() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int component1() {
        return this.getHighSpeedVideoSizes;
    }
}

package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmPropertyAccessorAttributes {
    private int Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighSpeedVideoFpsRanges;

    public KmPropertyAccessorAttributes(int i) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(0);
    }

    public final int getFlags$kotlin_metadata() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public KmPropertyAccessorAttributes() {
        this(0);
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.getHighSpeedVideoFpsRanges;
    }
}

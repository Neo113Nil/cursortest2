package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmEffectExpression {
    private int Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEffectExpression> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(0);
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEffectExpression> getHighSpeedVideoFpsRanges = new java.util.ArrayList(0);
    private kotlin.reflect.jvm.internal.impl.km.KmType getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.km.KmConstantValue getHighSpeedVideoSizes;
    private java.lang.Integer getOutputFormats;

    public final int getFlags$kotlin_metadata() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public final void setParameterIndex(java.lang.Integer num) {
        this.getOutputFormats = num;
    }

    public final void setConstantValue(kotlin.reflect.jvm.internal.impl.km.KmConstantValue kmConstantValue) {
        this.getHighSpeedVideoSizes = kmConstantValue;
    }

    public final void setInstanceType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        this.getHighSpeedVideoFpsRangesFor = kmType;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEffectExpression> getAndArguments() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEffectExpression> getOrArguments() {
        return this.getHighSpeedVideoFpsRanges;
    }
}

package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* loaded from: classes17.dex */
public final class JvmPropertyExtension implements kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension {
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPropertyExtension.Companion Companion = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPropertyExtension.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType TYPE = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPropertyExtension.class));
    private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature Camera2StreamConfigurationMap;
    private kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getHighSpeedVideoSizes;
    private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getInputFormats;

    public final int getJvmFlags() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setJvmFlags(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature getFieldSignature() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setFieldSignature(kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature jvmFieldSignature) {
        this.getHighResolutionOutputSizeshNQ4ISI = jvmFieldSignature;
    }

    public final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getGetterSignature() {
        return this.getHighSpeedVideoSizes;
    }

    public final void setGetterSignature(kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature jvmMethodSignature) {
        this.getHighSpeedVideoSizes = jvmMethodSignature;
    }

    public final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getSetterSignature() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setSetterSignature(kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature jvmMethodSignature) {
        this.Camera2StreamConfigurationMap = jvmMethodSignature;
    }

    public final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getSyntheticMethodForAnnotations() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setSyntheticMethodForAnnotations(kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature jvmMethodSignature) {
        this.getHighSpeedVideoFpsRanges = jvmMethodSignature;
    }

    public final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getSyntheticMethodForDelegate() {
        return this.getInputFormats;
    }

    public final void setSyntheticMethodForDelegate(kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature jvmMethodSignature) {
        this.getInputFormats = jvmMethodSignature;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType getType() {
        return TYPE;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* loaded from: classes17.dex */
public final class JvmFunctionExtension implements kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension {
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmFunctionExtension.Companion Companion = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmFunctionExtension.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType TYPE = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmFunctionExtension.class));
    private java.lang.String Camera2StreamConfigurationMap;
    private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getHighSpeedVideoFpsRangesFor;

    public final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getSignature() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setSignature(kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature jvmMethodSignature) {
        this.getHighSpeedVideoFpsRangesFor = jvmMethodSignature;
    }

    public final java.lang.String getLambdaClassOriginName() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setLambdaClassOriginName(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
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

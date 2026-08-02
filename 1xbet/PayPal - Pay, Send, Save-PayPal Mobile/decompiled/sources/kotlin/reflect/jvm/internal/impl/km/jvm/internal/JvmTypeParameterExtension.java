package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* loaded from: classes17.dex */
public final class JvmTypeParameterExtension implements kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension {
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeParameterExtension.Companion Companion = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeParameterExtension.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType TYPE = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeParameterExtension.class));
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> Camera2StreamConfigurationMap = new java.util.ArrayList();

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.Camera2StreamConfigurationMap;
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

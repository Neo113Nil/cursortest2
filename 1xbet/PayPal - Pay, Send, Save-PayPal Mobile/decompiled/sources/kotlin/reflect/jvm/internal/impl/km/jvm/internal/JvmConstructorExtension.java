package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* loaded from: classes17.dex */
public final class JvmConstructorExtension implements kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension {
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmConstructorExtension.Companion Companion = new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmConstructorExtension.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType TYPE = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmConstructorExtension.class));
    private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getHighResolutionOutputSizeshNQ4ISI;

    public final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getSignature() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setSignature(kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature jvmMethodSignature) {
        this.getHighResolutionOutputSizeshNQ4ISI = jvmMethodSignature;
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

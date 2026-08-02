package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes5.dex */
public interface DescriptorRendererOptions {
    kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy();

    boolean getDebugMode();

    boolean getEnhancedTypes();

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getExcludedTypeAnnotationClasses();

    void setAnnotationArgumentsRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    void setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy classifierNamePolicy);

    void setDebugMode(boolean z);

    void setExcludedTypeAnnotationClasses(java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set);

    void setModifiers(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> set);

    void setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    void setReceiverAfterName(boolean z);

    void setRenderCompanionObjectName(boolean z);

    void setStartFromName(boolean z);

    void setTextFormat(kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat renderingFormat);

    void setVerbose(boolean z);

    void setWithDefinedIn(boolean z);

    void setWithoutSuperTypes(boolean z);

    void setWithoutTypeParameters(boolean z);

    public static final class DefaultImpls {
        public static boolean getIncludeAnnotationArguments(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.getAnnotationArgumentsRenderingPolicy().getIncludeAnnotationArguments();
        }

        public static boolean getIncludeEmptyAnnotationArguments(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.getAnnotationArgumentsRenderingPolicy().getIncludeEmptyAnnotationArguments();
        }
    }
}

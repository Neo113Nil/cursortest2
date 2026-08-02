package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes5.dex */
public final class ErrorModuleDescriptor implements kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor {
    private static final kotlin.Lazy Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorModuleDescriptor INSTANCE = new kotlin.reflect.jvm.internal.impl.types.error.ErrorModuleDescriptor();
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor> getHighSpeedVideoFpsRanges;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor> getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        return null;
    }

    private ErrorModuleDescriptor() {
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name special = kotlin.reflect.jvm.internal.impl.name.Name.special(kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_MODULE.getDebugText());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special, "");
        getHighResolutionOutputSizeshNQ4ISI = special;
        getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.emptyList();
        getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.emptyList();
        getHighSpeedVideoSizes = kotlin.collections.SetsKt.emptySet();
        Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlin.reflect.jvm.internal.impl.types.error.ErrorModuleDescriptor$$Lambda$0
            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns companion;
                companion = kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns.Companion.getInstance();
                return companion;
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getStableName() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor> getExpectedByModules() {
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        return (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns) Camera2StreamConfigurationMap.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final kotlin.reflect.jvm.internal.impl.name.Name getName() {
        return getStableName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        throw new java.lang.IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getOriginal() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final boolean shouldSeeInternalsOf(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final <T> T getCapability(kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<T> moduleCapability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleCapability, "");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptorVisitor, "");
        return null;
    }
}

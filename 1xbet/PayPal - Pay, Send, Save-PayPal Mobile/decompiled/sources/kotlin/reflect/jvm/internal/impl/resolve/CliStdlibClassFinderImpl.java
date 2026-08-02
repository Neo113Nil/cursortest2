package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
final class CliStdlibClassFinderImpl implements kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder {
    public static final kotlin.reflect.jvm.internal.impl.resolve.CliStdlibClassFinderImpl getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.resolve.CliStdlibClassFinderImpl();

    private CliStdlibClassFinderImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findEnumEntriesClass(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getEnumEntries());
    }
}

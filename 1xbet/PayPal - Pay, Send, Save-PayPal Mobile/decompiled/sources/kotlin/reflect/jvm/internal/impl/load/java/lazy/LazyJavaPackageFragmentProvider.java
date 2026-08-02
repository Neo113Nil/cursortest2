package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes3.dex */
public final class LazyJavaPackageFragmentProvider implements kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized {
    private final kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoSizes;

    public LazyJavaPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents javaResolverComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaResolverComponents, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext(javaResolverComponents, kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver.EMPTY.INSTANCE, kotlin.LazyKt.lazyOf(null));
        this.getHighSpeedVideoSizes = lazyJavaResolverContext;
        this.getHighSpeedVideoFpsRangesFor = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final /* bridge */ /* synthetic */ java.util.Collection getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1 function1) {
        return getSubPackagesOf(fqName, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>) function1);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage findPackage$default = kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util.findPackage$default(this.getHighSpeedVideoSizes.getComponents().getFinder(), fqName, false, 2, null);
        if (findPackage$default == null) {
            return null;
        }
        return this.getHighSpeedVideoFpsRangesFor.computeIfAbsent(fqName, new kotlin.jvm.functions.Function0(this, findPackage$default) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
                this.getHighSpeedVideoSizes = findPackage$default;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @kotlin.Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment> getPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return kotlin.collections.CollectionsKt.listOfNotNull(getHighResolutionOutputSizeshNQ4ISI(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void collectPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection, getHighResolutionOutputSizeshNQ4ISI(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean isEmpty(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util.findPackage$default(this.getHighSpeedVideoSizes.getComponents().getFinder(), fqName, false, 2, null) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(fqName);
        java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> subPackageFqNames$descriptors_jvm = highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm == null ? kotlin.collections.CollectionsKt.emptyList() : subPackageFqNames$descriptors_jvm;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LazyJavaPackageFragmentProvider of module ");
        sb.append(this.getHighSpeedVideoSizes.getComponents().getModule());
        return sb.toString();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage javaPackage) {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment(lazyJavaPackageFragmentProvider.getHighSpeedVideoSizes, javaPackage);
    }
}

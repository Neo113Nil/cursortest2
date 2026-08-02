package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes3.dex */
public final class CompositePackageFragmentProvider implements kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositePackageFragmentProvider(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRanges = str;
        list.size();
        kotlin.collections.CollectionsKt.toSet(list).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @kotlin.Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible(it.next(), fqName, arrayList);
        }
        return kotlin.collections.CollectionsKt.toList(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void collectPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible(it.next(), fqName, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean isEmpty(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> list = this.Camera2StreamConfigurationMap;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt.isEmpty((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().getSubPackagesOf(fqName, function1));
        }
        return hashSet;
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges;
    }
}

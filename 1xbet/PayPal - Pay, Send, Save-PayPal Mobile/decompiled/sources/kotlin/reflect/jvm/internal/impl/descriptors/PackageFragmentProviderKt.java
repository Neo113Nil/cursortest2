package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public final class PackageFragmentProviderKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> packageFragments(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        collectPackageFragmentsOptimizedIfPossible(packageFragmentProvider, fqName, arrayList);
        return arrayList;
    }

    public static final boolean isEmpty(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return packageFragmentProvider instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized ? ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized) packageFragmentProvider).isEmpty(fqName) : packageFragments(packageFragmentProvider, fqName).isEmpty();
    }

    public static final void collectPackageFragmentsOptimizedIfPossible(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider, kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        if (packageFragmentProvider instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized) packageFragmentProvider).collectPackageFragments(fqName, collection);
        } else {
            collection.addAll(packageFragmentProvider.getPackageFragments(fqName));
        }
    }
}

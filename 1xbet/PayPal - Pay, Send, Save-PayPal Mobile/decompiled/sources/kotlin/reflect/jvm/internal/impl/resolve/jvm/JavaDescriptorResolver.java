package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* loaded from: classes5.dex */
public final class JavaDescriptorResolver {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache getHighSpeedVideoSizes;

    public JavaDescriptorResolver(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaResolverCache, "");
        this.getHighSpeedVideoFpsRanges = lazyJavaPackageFragmentProvider;
        this.getHighSpeedVideoSizes = javaResolverCache;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider getPackageFragmentProvider() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClass(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment lazyJavaPackageFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = javaClass.getFqName();
        if (fqName != null && javaClass.getLightClassOriginKind() == kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.SOURCE) {
            return this.getHighSpeedVideoSizes.getClassResolvedFromSource(fqName);
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass outerClass = javaClass.getOuterClass();
        if (outerClass == null) {
            if (fqName == null || (lazyJavaPackageFragment = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.getHighSpeedVideoFpsRanges.getPackageFragments(fqName.parent()))) == null) {
                return null;
            }
            return lazyJavaPackageFragment.findClassifierByJavaClass$descriptors_jvm(javaClass);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClass = resolveClass(outerClass);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = resolveClass != null ? resolveClass.getUnsubstitutedInnerClassesScope() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = unsubstitutedInnerClassesScope != null ? unsubstitutedInnerClassesScope.mo23899getContributedClassifier(javaClass.getName(), kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER) : null;
        if (contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
        }
        return null;
    }
}

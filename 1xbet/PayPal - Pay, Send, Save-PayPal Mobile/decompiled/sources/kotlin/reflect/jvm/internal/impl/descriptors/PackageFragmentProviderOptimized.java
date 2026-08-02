package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public interface PackageFragmentProviderOptimized extends kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider {
    void collectPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection);

    boolean isEmpty(kotlin.reflect.jvm.internal.impl.name.FqName fqName);
}

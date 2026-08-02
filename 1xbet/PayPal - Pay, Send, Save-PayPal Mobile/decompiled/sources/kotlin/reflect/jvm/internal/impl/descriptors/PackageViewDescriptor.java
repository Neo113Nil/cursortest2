package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface PackageViewDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor {
    kotlin.reflect.jvm.internal.impl.name.FqName getFqName();

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getFragments();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope();

    kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule();

    boolean isEmpty();
}

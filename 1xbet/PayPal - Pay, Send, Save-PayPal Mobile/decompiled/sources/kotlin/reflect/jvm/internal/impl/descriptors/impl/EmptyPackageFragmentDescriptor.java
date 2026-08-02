package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public final class EmptyPackageFragmentDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyPackageFragmentDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        super(moduleDescriptor, fqName);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getMemberScope() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
    }
}

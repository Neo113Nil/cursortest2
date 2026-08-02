package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class LazyPackageViewDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl.class, "fragments", "getFragments()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl.class, "empty", "getEmpty()Z", 0))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl getOutputMinFrameDuration;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl getModule() {
        return this.getOutputMinFrameDuration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl, kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), fqName.shortNameOrSpecial());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptorImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        this.getOutputMinFrameDuration = moduleDescriptorImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = fqName;
        this.Camera2StreamConfigurationMap = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.List packageFragments;
                packageFragments = kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt.packageFragments(r0.getModule().getPackageFragmentProvider(), this.getHighResolutionOutputSizeshNQ4ISI.getFqName());
                return packageFragments;
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
        this.getHighSpeedVideoFpsRangesFor = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                boolean isEmpty;
                isEmpty = kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt.isEmpty(r0.getModule().getPackageFragmentProvider(), this.Camera2StreamConfigurationMap.getFqName());
                return java.lang.Boolean.valueOf(isEmpty);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        this.getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter(storageManager, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getFragments() {
        return (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.Camera2StreamConfigurationMap, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoSizes[0]);
    }

    protected final boolean getEmpty() {
        return ((java.lang.Boolean) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRangesFor, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoSizes[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        return getModule().getPackage(getFqName().parent());
    }

    public boolean equals(java.lang.Object obj) {
        kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor = obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor) obj : null;
        return packageViewDescriptor != null && kotlin.jvm.internal.Intrinsics.areEqual(getFqName(), packageViewDescriptor.getFqName()) && kotlin.jvm.internal.Intrinsics.areEqual(getModule(), packageViewDescriptor.getModule());
    }

    public int hashCode() {
        return (getModule().hashCode() * 31) + getFqName().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptorVisitor, "");
        return declarationDescriptorVisitor.visitPackageViewDescriptor(this, d);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        if (lazyPackageViewDescriptorImpl.isEmpty()) {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> fragments = lazyPackageViewDescriptorImpl.getFragments();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fragments, 10));
        java.util.Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) it.next()).getMemberScope());
        }
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.impl.SubpackagesScope>) arrayList, new kotlin.reflect.jvm.internal.impl.descriptors.impl.SubpackagesScope(lazyPackageViewDescriptorImpl.getModule(), lazyPackageViewDescriptorImpl.getFqName()));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion companion = kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("package view scope for ");
        sb.append(lazyPackageViewDescriptorImpl.getFqName());
        sb.append(" in ");
        sb.append(lazyPackageViewDescriptorImpl.getModule().getName());
        return companion.create(sb.toString(), plus);
    }
}

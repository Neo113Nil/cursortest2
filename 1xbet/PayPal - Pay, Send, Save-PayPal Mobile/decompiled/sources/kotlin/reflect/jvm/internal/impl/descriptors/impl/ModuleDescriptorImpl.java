package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public final class ModuleDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor {
    private final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider getHighSpeedVideoFpsRanges;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<?>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor> getInputFormats;
    private final kotlin.Lazy getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.platform.TargetPlatform getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.name.Name getOutputMinFrameDuration;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getOutputStallDurationlomOqCM;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final /* bridge */ <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.DefaultImpls.accept(this, declarationDescriptorVisitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        return kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        return this.Camera2StreamConfigurationMap;
    }

    public /* synthetic */ ModuleDescriptorImpl(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.platform.TargetPlatform targetPlatform, java.util.Map map, kotlin.reflect.jvm.internal.impl.name.Name name3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(name2, storageManager, kotlinBuiltIns, (i & 8) != 0 ? null : targetPlatform, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 32) != 0 ? null : name3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.platform.TargetPlatform targetPlatform, java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<?>, ? extends java.lang.Object> map, kotlin.reflect.jvm.internal.impl.name.Name name3) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), name2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getOutputStallDurationlomOqCM = storageManager;
        this.Camera2StreamConfigurationMap = kotlinBuiltIns;
        this.getOutputFormats = targetPlatform;
        this.getOutputMinFrameDuration = name3;
        if (!name2.isSpecial()) {
            throw new java.lang.IllegalArgumentException("Module name must be special: ".concat(java.lang.String.valueOf(name2)));
        }
        this.getHighSpeedVideoFpsRangesFor = map;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory.Default r2 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory) getCapability(kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory.Companion.getCAPABILITY());
        this.getHighSpeedVideoSizesFor = r2 == null ? kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory.Default.INSTANCE : r2;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getInputFormats = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.name.FqName) obj);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getInputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    public final boolean isValid() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void assertValid() {
        if (isValid()) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt.moduleInvalidated(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor> getExpectedByModules() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies moduleDependencies = this.getHighSpeedVideoSizes;
        if (moduleDependencies != null) {
            return moduleDependencies.getDirectExpectedByDependencies();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependencies of module ");
        java.lang.String obj = getName().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        sb.append(obj);
        sb.append(" were not set");
        throw new java.lang.AssertionError(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        assertValid();
        return this.getInputFormats.invoke(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, function1);
    }

    public final void setDependencies(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies moduleDependencies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDependencies, "");
        this.getHighSpeedVideoSizes = moduleDependencies;
    }

    public final void setDependencies(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl... moduleDescriptorImplArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptorImplArr, "");
        setDependencies(kotlin.collections.ArraysKt.toList(moduleDescriptorImplArr));
    }

    public final void setDependencies(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        setDependencies(list, kotlin.collections.SetsKt.emptySet());
    }

    public final void setDependencies(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> list, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        setDependencies(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependenciesImpl(list, set, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.SetsKt.emptySet()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final boolean shouldSeeInternalsOf(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, moduleDescriptor)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies moduleDependencies = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(moduleDependencies);
        return kotlin.collections.CollectionsKt.contains(moduleDependencies.getModulesWhoseInternalsAreVisible(), moduleDescriptor) || getExpectedByModules().contains(moduleDescriptor) || moduleDescriptor.getExpectedByModules().contains(this);
    }

    public final void initialize(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentProvider, "");
        this.getHighSpeedVideoFpsRanges = packageFragmentProvider;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider) this.getInputSizeshNQ4ISI.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final <T> T getCapability(kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<T> moduleCapability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleCapability, "");
        T t = (T) this.getHighSpeedVideoFpsRangesFor.get(moduleCapability);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final java.lang.String toString() {
        java.lang.Class<?> cls;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        if (!isValid()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider = this.getHighSpeedVideoFpsRanges;
        sb.append((packageFragmentProvider == null || (cls = packageFragmentProvider.getClass()) == null) ? null : cls.getSimpleName());
        return sb.toString();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return moduleDescriptorImpl.getHighSpeedVideoSizesFor.compute(moduleDescriptorImpl, fqName, moduleDescriptorImpl.getOutputStallDurationlomOqCM);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies moduleDependencies = moduleDescriptorImpl.getHighSpeedVideoSizes;
        if (moduleDependencies == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependencies of module ");
            java.lang.String obj = moduleDescriptorImpl.getName().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            sb.append(obj);
            sb.append(" were not set before querying module content");
            throw new java.lang.AssertionError(sb.toString());
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
        moduleDescriptorImpl.assertValid();
        allDependencies.contains(moduleDescriptorImpl);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl> list = allDependencies;
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl) it.next()).getHighSpeedVideoFpsRanges;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider2 = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl) it2.next()).getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(packageFragmentProvider2);
            arrayList.add(packageFragmentProvider2);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CompositeProvider@ModuleDescriptor for ");
        sb2.append(moduleDescriptorImpl.getName());
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider(arrayList, sb2.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.platform.TargetPlatform targetPlatform) {
        this(name2, storageManager, kotlinBuiltIns, targetPlatform, null, null, 48, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
    }
}

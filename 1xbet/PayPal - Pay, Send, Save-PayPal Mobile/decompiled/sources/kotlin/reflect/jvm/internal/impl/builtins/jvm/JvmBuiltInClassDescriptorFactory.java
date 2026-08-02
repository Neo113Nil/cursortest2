package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
public final class JvmBuiltInClassDescriptorFactory implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory {
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getInputFormats;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getOutputMinFrameDuration;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.cloneable.shortName();
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.cloneable.toSafe());

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, ? extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getInputFormats = moduleDescriptor;
        this.getOutputMinFrameDuration = function1;
        this.Camera2StreamConfigurationMap = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this, storageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory getHighSpeedVideoFpsRanges;
            private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
                this.getHighSpeedVideoFpsRangesFor = storageManager;
            }
        });
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) obj);
            }
        } : function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final boolean shouldCreateClass(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(name2, getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(fqName, getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(classId, getHighSpeedVideoFpsRangesFor)) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.Camera2StreamConfigurationMap, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0]);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getAllContributedClassesIfPossible(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fqName, getHighSpeedVideoSizes)) {
            return kotlin.collections.SetsKt.setOf((kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.Camera2StreamConfigurationMap, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0]));
        }
        return kotlin.collections.SetsKt.emptySet();
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId getCLONEABLE_CLASS_ID() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.getHighSpeedVideoFpsRangesFor;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl classDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl(jvmBuiltInClassDescriptorFactory.getOutputMinFrameDuration.invoke(jvmBuiltInClassDescriptorFactory.getInputFormats), getHighSpeedVideoFpsRanges, kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE, kotlin.collections.CollectionsKt.listOf(jvmBuiltInClassDescriptorFactory.getInputFormats.getBuiltIns().getAnyType()), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(new kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope(storageManager, classDescriptorImpl), kotlin.collections.SetsKt.emptySet(), null);
        return classDescriptorImpl;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> fragments = moduleDescriptor.getPackage(getHighSpeedVideoSizes).getFragments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fragments) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) kotlin.collections.CollectionsKt.first((java.util.List) arrayList);
    }
}

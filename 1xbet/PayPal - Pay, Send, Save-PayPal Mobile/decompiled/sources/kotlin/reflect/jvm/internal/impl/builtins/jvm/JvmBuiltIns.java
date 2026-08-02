package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
public final class JvmBuiltIns extends kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};
    private kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings> Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind kind) {
        super(storageManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        this.getHighSpeedVideoFpsRangesFor = kind;
        this.getHighSpeedVideoFpsRanges = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this, storageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.storage.StorageManager Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
            }

            {
                this.getHighSpeedVideoSizes = this;
                this.Camera2StreamConfigurationMap = storageManager;
            }
        });
        int i = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i != 1) {
            if (i == 2) {
                createBuiltInsModule(false);
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                createBuiltInsModule(true);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind[] Camera2StreamConfigurationMap;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind FALLBACK;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind FROM_CLASS_LOADER;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind FROM_DEPENDENCIES;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private Kind(java.lang.String str, int i) {
        }

        static {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind kind = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind("FROM_DEPENDENCIES", 0);
            FROM_DEPENDENCIES = kind;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind kind2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind("FROM_CLASS_LOADER", 1);
            FROM_CLASS_LOADER = kind2;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind kind3 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind("FALLBACK", 2);
            FALLBACK = kind3;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind[] kindArr = {kind, kind2, kind3};
            Camera2StreamConfigurationMap = kindArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(kindArr);
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind[] values() {
            return (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind[]) Camera2StreamConfigurationMap.clone();
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.class, str);
        }
    }

    public static final class Settings {
        private final boolean getHighSpeedVideoFpsRanges;
        private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighSpeedVideoFpsRangesFor;

        public Settings(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
            this.getHighSpeedVideoFpsRangesFor = moduleDescriptor;
            this.getHighSpeedVideoFpsRanges = z;
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getOwnerModuleDescriptor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public final void setPostponedSettingsComputation(kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = function0;
    }

    public final void initialize(final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        setPostponedSettingsComputation(new kotlin.jvm.functions.Function0(moduleDescriptor, z) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor Camera2StreamConfigurationMap;
            private final boolean getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
            }

            {
                this.Camera2StreamConfigurationMap = moduleDescriptor;
                this.getHighSpeedVideoFpsRanges = z;
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer getCustomizer() {
        return (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRanges, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoSizes[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> getClassDescriptorFactories() {
        java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> classDescriptorFactories = super.getClassDescriptorFactories();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(classDescriptorFactories, "");
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = getStorageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storageManager, "");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtInsModule, "");
        return kotlin.collections.CollectionsKt.plus(classDescriptorFactories, new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer Camera2StreamConfigurationMap(final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns jvmBuiltIns, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl builtInsModule = jvmBuiltIns.getBuiltInsModule();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtInsModule, "");
        return new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer(builtInsModule, storageManager, new kotlin.jvm.functions.Function0(jvmBuiltIns) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = jvmBuiltIns;
            }
        });
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, boolean z) {
        return new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings(moduleDescriptor, z);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns jvmBuiltIns) {
        kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings> function0 = jvmBuiltIns.Camera2StreamConfigurationMap;
        if (function0 != null) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings invoke = function0.invoke();
            jvmBuiltIns.Camera2StreamConfigurationMap = null;
            return invoke;
        }
        throw new java.lang.AssertionError("JvmBuiltins instance has not been initialized properly");
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FALLBACK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes3.dex */
public final class LazyJavaPackageFragment extends kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName>> getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getOutputFormats;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage javaPackage) {
        super(lazyJavaResolverContext.getModule(), javaPackage.getFqName());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaPackage, "");
        this.getHighSpeedVideoFpsRangesFor = javaPackage;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForClassOrPackage$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForClassOrPackage$default(lazyJavaResolverContext, this, null, 0, 6, null);
        this.Camera2StreamConfigurationMap = childForClassOrPackage$default;
        this.getOutputFormats = lazyJavaResolverContext.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion();
        this.getHighSpeedVideoFpsRanges = childForClassOrPackage$default.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        this.getInputFormats = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope(childForClassOrPackage$default, javaPackage, this);
        this.getHighSpeedVideoSizesFor = childForClassOrPackage$default.getStorageManager().createRecursionTolerantLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        }, kotlin.collections.CollectionsKt.emptyList());
        this.getHighSpeedVideoSizes = childForClassOrPackage$default.getComponents().getJavaTypeEnhancementState().getDisabledDefaultAnnotations() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY() : kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(childForClassOrPackage$default, javaPackage);
        this.getInputSizeshNQ4ISI = childForClassOrPackage$default.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRanges, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackageFqNames$descriptors_jvm() {
        return this.getHighSpeedVideoSizesFor.invoke();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassifierByJavaClass$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        return this.getInputFormats.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope getMemberScope() {
        return this.getInputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Lazy Java package fragment: ");
        sb.append(getFqName());
        sb.append(" of module ");
        sb.append(this.Camera2StreamConfigurationMap.getComponents().getModule());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement(this);
    }

    static /* synthetic */ java.util.Map getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment lazyJavaPackageFragment) {
        java.util.List<java.lang.String> findPackageParts = lazyJavaPackageFragment.Camera2StreamConfigurationMap.getComponents().getPackagePartProvider().findPackageParts(lazyJavaPackageFragment.getFqName().asString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : findPackageParts) {
            kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
            kotlin.reflect.jvm.internal.impl.name.FqName fqNameForTopLevelClassMaybeWithDollars = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqNameForTopLevelClassMaybeWithDollars, "");
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findKotlinClass = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(lazyJavaPackageFragment.Camera2StreamConfigurationMap.getComponents().getKotlinClassFinder(), companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), lazyJavaPackageFragment.getOutputFormats);
            kotlin.Pair pair = findKotlinClass != null ? kotlin.TuplesKt.to(str, findKotlinClass) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.MapsKt.toMap(arrayList);
    }

    static /* synthetic */ java.util.List Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment lazyJavaPackageFragment) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage> subPackages = lazyJavaPackageFragment.getHighSpeedVideoFpsRangesFor.getSubPackages();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subPackages, 10));
        java.util.Iterator<T> it = subPackages.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage) it.next()).getFqName());
        }
        return arrayList;
    }

    static /* synthetic */ java.util.HashMap getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment lazyJavaPackageFragment) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().entrySet()) {
            java.lang.String key = entry.getKey();
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass value = entry.getValue();
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName byInternalName = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName(key);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byInternalName, "");
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader = value.getClassHeader();
            int i = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
            if (i == 1) {
                java.util.HashMap hashMap2 = hashMap;
                java.lang.String multifileClassName = classHeader.getMultifileClassName();
                if (multifileClassName != null) {
                    hashMap2.put(byInternalName, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byInternalName(multifileClassName));
                }
            } else if (i == 2) {
                hashMap.put(byInternalName, byInternalName);
            }
        }
        return hashMap;
    }

    /* loaded from: classes5.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

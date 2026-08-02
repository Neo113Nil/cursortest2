package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
public final class JvmBuiltInsCustomizer implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};
    private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.Pair<java.lang.String, java.lang.String>, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getOutputMinFrameDuration;

    public JvmBuiltInsCustomizer(final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getOutputMinFrameDuration = moduleDescriptor;
        this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE;
        this.getInputFormats = storageManager.createLazyValue(function0);
        final kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName("java.io");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl classDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl(new kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl(moduleDescriptor, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getMemberScope() {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
            }
        }, kotlin.reflect.jvm.internal.impl.name.Name.identifier("Serializable"), kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE, kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.LazyWrappedType(storageManager, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$3
            private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        })), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE, kotlin.collections.SetsKt.emptySet(), null);
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = classDescriptorImpl.getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
        this.getOutputFormats = defaultType;
        this.getHighSpeedVideoFpsRanges = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this, storageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.storage.StorageManager Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
                this.Camera2StreamConfigurationMap = storageManager;
            }
        });
        this.getHighSpeedVideoSizes = storageManager.createCacheWithNotNullValues();
        this.getInputSizeshNQ4ISI = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations create;
                create = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt.createDeprecatedAnnotation$default(this.Camera2StreamConfigurationMap.getOutputMinFrameDuration.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
                return create;
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        this.getHighSpeedVideoFpsRangesFor = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, (kotlin.Pair) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE.isArrayOrPrimitiveArray(fqNameUnsafe) ? kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.types.KotlinType[]{(kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRanges, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[1]), this.getOutputFormats}) : kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE.isSerializableInJava(fqNameUnsafe) ? kotlin.collections.CollectionsKt.listOf(this.getOutputFormats) : kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions(final kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> iterable;
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor;
        kotlin.reflect.jvm.internal.impl.name.Name name3;
        kotlin.reflect.jvm.internal.impl.name.Name name4;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(name2, kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion.getCLONE_NAME()) && (classDescriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor)) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) classDescriptor;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(functionList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> list = functionList;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) it.next()).getName()), kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion.getCLONE_NAME())) {
                        return kotlin.collections.CollectionsKt.emptyList();
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> newCopyBuilder = ((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) kotlin.collections.CollectionsKt.single(((kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRanges, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[1])).getMemberScope().getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS))).newCopyBuilder();
            newCopyBuilder.setOwner(deserializedClassDescriptor);
            newCopyBuilder.setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC);
            newCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
            newCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor build = newCopyBuilder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return kotlin.collections.CollectionsKt.listOf(build);
        }
        if (!((kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputFormats, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0])).isAdditionalBuiltInsFeatureSupported()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1(name2) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$4
            private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = name2;
            }
        };
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(classDescriptor);
        if (Camera2StreamConfigurationMap == null) {
            iterable = kotlin.collections.CollectionsKt.emptyList();
        } else {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = Camera2StreamConfigurationMap;
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> mapPlatformClass = this.Camera2StreamConfigurationMap.mapPlatformClass(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor), kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.getHighResolutionOutputSizeshNQ4ISI.getInstance());
            final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.collections.CollectionsKt.lastOrNull(mapPlatformClass);
            if (classDescriptor2 == null) {
                iterable = kotlin.collections.CollectionsKt.emptyList();
            } else {
                kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion companion = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(mapPlatformClass, 10));
                java.util.Iterator<T> it2 = mapPlatformClass.iterator();
                while (it2.hasNext()) {
                    arrayList.add(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) it2.next()));
                }
                kotlin.reflect.jvm.internal.impl.utils.SmartSet create = companion.create(arrayList);
                boolean isMutable = this.Camera2StreamConfigurationMap.isMutable(classDescriptor);
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = this.getHighSpeedVideoSizes.computeIfAbsent(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor), new kotlin.jvm.functions.Function0(Camera2StreamConfigurationMap, classDescriptor2) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$5
                    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRanges;
                    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor getHighSpeedVideoSizes;

                    @Override // kotlin.jvm.functions.Function0
                    public java.lang.Object invoke() {
                        return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
                    }

                    {
                        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
                        this.getHighSpeedVideoFpsRanges = classDescriptor2;
                    }
                }).getUnsubstitutedMemberScope();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unsubstitutedMemberScope, "");
                java.lang.Iterable iterable2 = (java.lang.Iterable) function1.invoke(unsubstitutedMemberScope);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : iterable2) {
                    kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj;
                    if (simpleFunctionDescriptor2.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor2.getVisibility().isPublicAPI() && !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor2)) {
                        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> overriddenDescriptors = simpleFunctionDescriptor2.getOverriddenDescriptors();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
                        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection = overriddenDescriptors;
                        if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                            java.util.Iterator<T> it3 = collection.iterator();
                            while (it3.hasNext()) {
                                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it3.next()).getContainingDeclaration();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
                                if (create.contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(containingDeclaration))) {
                                    break;
                                }
                            }
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = simpleFunctionDescriptor2.getContainingDeclaration();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration2, "");
                        if (!(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt.signature(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE, (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration2, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor2, false, false, 3, null))) ^ isMutable)) {
                            java.lang.Boolean ifAny = kotlin.reflect.jvm.internal.impl.utils.DFS.ifAny(kotlin.collections.CollectionsKt.listOf(simpleFunctionDescriptor2), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$6
                                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
                                public java.lang.Iterable getNeighbors(java.lang.Object obj2) {
                                    java.lang.Iterable overriddenDescriptors2;
                                    overriddenDescriptors2 = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj2).getOriginal().getOverriddenDescriptors();
                                    return overriddenDescriptors2;
                                }
                            }, new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$7
                                private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer Camera2StreamConfigurationMap;

                                @Override // kotlin.jvm.functions.Function1
                                public java.lang.Object invoke(java.lang.Object obj2) {
                                    return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj2);
                                }

                                {
                                    this.Camera2StreamConfigurationMap = this;
                                }
                            });
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ifAny, "");
                            if (!ifAny.booleanValue()) {
                                arrayList2.add(obj);
                            }
                        }
                    }
                }
                iterable = arrayList2;
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor3 : iterable) {
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration3 = simpleFunctionDescriptor3.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration3, "");
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor substitute = simpleFunctionDescriptor3.substitute(kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt.createMappedTypeParametersSubstitution((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration3, classDescriptor).buildSubstitutor());
            kotlin.jvm.internal.Intrinsics.checkNotNull(substitute, "");
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> newCopyBuilder2 = ((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) substitute).newCopyBuilder();
            newCopyBuilder2.setOwner(classDescriptor);
            newCopyBuilder2.setDispatchReceiverParameter(classDescriptor.getThisAsReceiverParameter());
            newCopyBuilder2.setPreserveSourceElement();
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor4 = simpleFunctionDescriptor3;
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration4 = simpleFunctionDescriptor4.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration4, "");
            final java.lang.String computeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor4, false, false, 3, null);
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            java.lang.Object dfs = kotlin.reflect.jvm.internal.impl.utils.DFS.dfs(kotlin.collections.CollectionsKt.listOf((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration4), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$8
                private final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
                public java.lang.Iterable getNeighbors(java.lang.Object obj2) {
                    return kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) obj2);
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = this;
                }
            }, new kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
                /* JADX WARN: Type inference failed for: r0v13, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
                /* JADX WARN: Type inference failed for: r0v14, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
                /* JADX WARN: Type inference failed for: r0v15, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
                /* JADX WARN: Type inference failed for: r0v16, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public final boolean beforeChildren(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor3) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor3, "");
                    java.lang.String signature = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt.signature(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE, classDescriptor3, computeJvmDescriptor$default);
                    if (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE.getHIDDEN_METHOD_SIGNATURES().contains(signature)) {
                        objectRef.element = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.getHighSpeedVideoFpsRanges;
                    } else if (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE.getVISIBLE_METHOD_SIGNATURES().contains(signature)) {
                        objectRef.element = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.Camera2StreamConfigurationMap;
                    } else if (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE.getDEPRECATED_LIST_METHODS().contains(signature)) {
                        objectRef.element = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.getHighSpeedVideoSizes;
                    } else if (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE.getDROP_LIST_METHOD_SIGNATURES().contains(signature)) {
                        objectRef.element = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.getHighSpeedVideoFpsRangesFor;
                    }
                    return objectRef.element == null;
                }

                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus result() {
                    kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = objectRef.element;
                    return jDKMemberStatus == null ? kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.getHighResolutionOutputSizeshNQ4ISI : jDKMemberStatus;
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dfs, "");
            int i = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.WhenMappings.$EnumSwitchMapping$0[((kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus) dfs).ordinal()];
            if (i == 1) {
                if (!kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt.isFinalClass(classDescriptor)) {
                    newCopyBuilder2.setHiddenForResolutionEverywhereBesideSupercalls();
                    kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor build2 = newCopyBuilder2.build();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(build2);
                    simpleFunctionDescriptor = build2;
                }
                simpleFunctionDescriptor = null;
            } else {
                if (i == 2) {
                    kotlin.reflect.jvm.internal.impl.name.Name name5 = simpleFunctionDescriptor3.getName();
                    name3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizerKt.getHighSpeedVideoSizes;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(name5, name3)) {
                        invoke = this.getHighSpeedVideoFpsRangesFor.invoke(kotlin.TuplesKt.to(simpleFunctionDescriptor3.getName().asString(), "first"));
                    } else {
                        name4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizerKt.getHighSpeedVideoFpsRangesFor;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(name5, name4)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected name: ");
                            sb.append(simpleFunctionDescriptor3.getName());
                            throw new java.lang.IllegalStateException(sb.toString().toString());
                        }
                        invoke = this.getHighSpeedVideoFpsRangesFor.invoke(kotlin.TuplesKt.to(simpleFunctionDescriptor3.getName().asString(), "last"));
                    }
                    newCopyBuilder2.setAdditionalAnnotations(invoke);
                } else if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    simpleFunctionDescriptor = null;
                } else {
                    newCopyBuilder2.setAdditionalAnnotations((kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[2]));
                }
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor build22 = newCopyBuilder2.build();
                kotlin.jvm.internal.Intrinsics.checkNotNull(build22);
                simpleFunctionDescriptor = build22;
            }
            if (simpleFunctionDescriptor != null) {
                arrayList3.add(simpleFunctionDescriptor);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class JDKMemberStatus {
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus Camera2StreamConfigurationMap;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus getHighResolutionOutputSizeshNQ4ISI;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus getHighSpeedVideoFpsRanges;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus getHighSpeedVideoFpsRangesFor;
        public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus getHighSpeedVideoSizes;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus[] getHighSpeedVideoSizesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getInputSizeshNQ4ISI;

        private JDKMemberStatus(java.lang.String str, int i) {
        }

        static {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus("HIDDEN", 0);
            getHighSpeedVideoFpsRanges = jDKMemberStatus;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus("VISIBLE", 1);
            Camera2StreamConfigurationMap = jDKMemberStatus2;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus3 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus("DEPRECATED_LIST_METHODS", 2);
            getHighSpeedVideoSizes = jDKMemberStatus3;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus4 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus("NOT_CONSIDERED", 3);
            getHighResolutionOutputSizeshNQ4ISI = jDKMemberStatus4;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus5 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus("DROP", 4);
            getHighSpeedVideoFpsRangesFor = jDKMemberStatus5;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus[] jDKMemberStatusArr = {jDKMemberStatus, jDKMemberStatus2, jDKMemberStatus3, jDKMemberStatus4, jDKMemberStatus5};
            getHighSpeedVideoSizesFor = jDKMemberStatusArr;
            getInputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(jDKMemberStatusArr);
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus[] values() {
            return (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus[]) getHighSpeedVideoSizesFor.clone();
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.class, str);
        }
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.ClassId mapKotlinToJava;
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName;
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAny(classDescriptor)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = classDescriptor;
        if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnderKotlinPackage(classDescriptor2)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classDescriptor2);
        if (fqNameUnsafe.isSafe() && (mapKotlinToJava = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe)) != null && (asSingleFqName = mapKotlinToJava.asSingleFqName()) != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClassByFqName = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt.resolveClassByFqName(((kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputFormats, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0])).getOwnerModuleDescriptor(), asSingleFqName, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
            if (resolveClassByFqName instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor) {
                return (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor) resolveClassByFqName;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mapJavaToKotlin$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        if (classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS || !((kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputFormats, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0])).isAdditionalBuiltInsFeatureSupported()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(classDescriptor);
        if (Camera2StreamConfigurationMap != null && (mapJavaToKotlin$default = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.mapJavaToKotlin$default(this.Camera2StreamConfigurationMap, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(Camera2StreamConfigurationMap), kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.getHighResolutionOutputSizeshNQ4ISI.getInstance(), null, 4, null)) != null) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = Camera2StreamConfigurationMap;
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor buildSubstitutor = kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt.createMappedTypeParametersSubstitution(mapJavaToKotlin$default, lazyJavaClassDescriptor).buildSubstitutor();
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = Camera2StreamConfigurationMap.getConstructors();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : constructors) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) obj;
                if (classConstructorDescriptor.getVisibility().isPublicAPI()) {
                    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors2 = mapJavaToKotlin$default.getConstructors();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructors2, "");
                    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> collection = constructors2;
                    if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                        for (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor2 : collection) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(classConstructorDescriptor2);
                            if (kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.getBothWaysOverridability(classConstructorDescriptor2, classConstructorDescriptor.substitute(buildSubstitutor)) == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                                break;
                            }
                        }
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor3 = classConstructorDescriptor;
                    if (classConstructorDescriptor3.getValueParameters().size() == 1) {
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = classConstructorDescriptor3.getValueParameters();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) valueParameters)).getType().getConstructor().mo23898getDeclarationDescriptor();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(mo23898getDeclarationDescriptor != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(mo23898getDeclarationDescriptor) : null, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classDescriptor))) {
                        }
                    }
                    if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDeprecated(classConstructorDescriptor) && !kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt.signature(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 3, null)))) {
                        arrayList.add(obj);
                    }
                }
            }
            java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor4 : arrayList2) {
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> newCopyBuilder = classConstructorDescriptor4.newCopyBuilder();
                newCopyBuilder.setOwner(classDescriptor);
                newCopyBuilder.setReturnType(classDescriptor.getDefaultType());
                newCopyBuilder.setPreserveSourceElement();
                newCopyBuilder.setSubstitution(buildSubstitutor.getSubstitution());
                if (!kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt.signature(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor4, false, false, 3, null)))) {
                    newCopyBuilder.setAdditionalAnnotations((kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[2]));
                }
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor build = newCopyBuilder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNull(build, "");
                arrayList3.add((kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) build);
            }
            return arrayList3;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public final boolean isFunctionAvailable(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(classDescriptor);
        if (Camera2StreamConfigurationMap == null || !simpleFunctionDescriptor.getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!((kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputFormats, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0])).isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        java.lang.String computeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope unsubstitutedMemberScope = Camera2StreamConfigurationMap.getUnsubstitutedMemberScope();
        kotlin.reflect.jvm.internal.impl.name.Name name2 = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
        if ((contributedFunctions instanceof java.util.Collection) && contributedFunctions.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = contributedFunctions.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next(), false, false, 3, null), computeJvmDescriptor$default)) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer jvmBuiltInsCustomizer, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue notNullLazyValue = jvmBuiltInsCustomizer.getInputFormats;
        kotlin.reflect.KProperty<java.lang.Object>[] kPropertyArr = getHighResolutionOutputSizeshNQ4ISI;
        return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findNonGenericClassAcrossDependencies(((kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(notNullLazyValue, jvmBuiltInsCustomizer, (kotlin.reflect.KProperty<?>) kPropertyArr[0])).getOwnerModuleDescriptor(), kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID(), new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses(storageManager, ((kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(jvmBuiltInsCustomizer.getInputFormats, jvmBuiltInsCustomizer, (kotlin.reflect.KProperty<?>) kPropertyArr[0])).getOwnerModuleDescriptor())).getDefaultType();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer jvmBuiltInsCustomizer, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = (java.lang.String) pair.component1();
        java.lang.String str2 = (java.lang.String) pair.component2();
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = jvmBuiltInsCustomizer.getOutputMinFrameDuration.getBuiltIns();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
        sb.append(str);
        sb.append("()' member of List is redundant in Kotlin and might be removed soon. Please use '");
        sb.append(str2);
        sb.append("()' stdlib extension instead");
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str2);
        sb2.append("()");
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt.createDeprecatedAnnotation(builtIns, obj, sb2.toString(), "HIDDEN", false)));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType anyType = jvmBuiltInsCustomizer.getOutputMinFrameDuration.getBuiltIns().getAnyType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(anyType, "");
        return anyType;
    }

    static /* synthetic */ java.util.Collection getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberScope, "");
        return memberScope.getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache = kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(javaResolverCache, "");
        return lazyJavaClassDescriptor.copy$descriptors_jvm(javaResolverCache, classDescriptor);
    }

    static /* synthetic */ java.lang.Boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer jvmBuiltInsCustomizer, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        boolean z;
        if (callableMemberDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper javaToKotlinClassMapper = jvmBuiltInsCustomizer.Camera2StreamConfigurationMap;
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
            if (javaToKotlinClassMapper.isMutable((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration)) {
                z = true;
                return java.lang.Boolean.valueOf(z);
            }
        }
        z = false;
        return java.lang.Boolean.valueOf(z);
    }

    static /* synthetic */ java.lang.Iterable getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer jvmBuiltInsCustomizer, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getConstructor().mo23898getDeclarationDescriptor();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor original = mo23898getDeclarationDescriptor != null ? mo23898getDeclarationDescriptor.getOriginal() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = original instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) original : null;
            if (classDescriptor2 != null) {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor Camera2StreamConfigurationMap = jvmBuiltInsCustomizer.Camera2StreamConfigurationMap(classDescriptor2);
                lazyJavaClassDescriptor = Camera2StreamConfigurationMap != null ? Camera2StreamConfigurationMap : classDescriptor2;
            }
            if (lazyJavaClassDescriptor != null) {
                arrayList.add(lazyJavaClassDescriptor);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionsNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope unsubstitutedMemberScope;
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> functionNames;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        if (!((kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Settings) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputFormats, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0])).isAdditionalBuiltInsFeatureSupported()) {
            return kotlin.collections.SetsKt.emptySet();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(classDescriptor);
        return (Camera2StreamConfigurationMap == null || (unsubstitutedMemberScope = Camera2StreamConfigurationMap.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) ? kotlin.collections.SetsKt.emptySet() : functionNames;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.getHighSpeedVideoFpsRanges.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.getHighSpeedVideoSizes.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.getHighSpeedVideoFpsRangesFor.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.Camera2StreamConfigurationMap.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
public abstract class DeserializedMemberScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue getHighSpeedVideoSizes;

    interface Implementation {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);

        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);

        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRanges();

        kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2);

        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRangesFor();

        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoSizes();

        void getHighSpeedVideoSizes(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collection, kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);
    }

    protected abstract void addEnumEntryDescriptors(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    protected abstract kotlin.reflect.jvm.internal.impl.name.ClassId createClassId(kotlin.reflect.jvm.internal.impl.name.Name name2);

    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredClassifierNames();

    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredFunctionNames();

    protected abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredVariableNames();

    protected DeserializedMemberScope(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContext, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> list, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> list2, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> list3, final kotlin.jvm.functions.Function0<? extends java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>> function0) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation optimizedImplementation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRangesFor = deserializationContext;
        if (deserializationContext.getComponents().getConfiguration().getPreserveDeclarationsOrdering()) {
            optimizedImplementation = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation(this, list, list2, list3);
        } else {
            optimizedImplementation = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation(this, list, list2, list3);
        }
        this.Camera2StreamConfigurationMap = optimizedImplementation;
        this.getHighResolutionOutputSizeshNQ4ISI = deserializationContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(function0) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$$Lambda$0
            private final kotlin.jvm.functions.Function0 Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Set set;
                set = kotlin.collections.CollectionsKt.toSet((java.lang.Iterable) this.Camera2StreamConfigurationMap.invoke());
                return set;
            }

            {
                this.Camera2StreamConfigurationMap = function0;
            }
        });
        this.getHighSpeedVideoSizes = deserializationContext.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext getC() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassNames$deserialization() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighResolutionOutputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(name2, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(name2, lookupLocation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> computeDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, function1);
        }
        java.util.ArrayList arrayList2 = arrayList;
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(arrayList2, descriptorKindFilter, function1, lookupLocation);
        if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : getClassNames$deserialization()) {
                if (function1.invoke(name2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList2, this.getHighSpeedVideoFpsRangesFor.getComponents().deserializeClass(createClassId(name2)));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name3 : this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes()) {
                if (function1.invoke(name3).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList2, this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(name3));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        if (!hasClass(name2)) {
            if (this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes().contains(name2)) {
                return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(name2);
            }
            return null;
        }
        return this.getHighSpeedVideoFpsRangesFor.getComponents().deserializeClass(createClassId(name2));
    }

    protected boolean hasClass(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return getClassNames$deserialization().contains(name2);
    }

    final class OptimizedImplementation implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope Camera2StreamConfigurationMap;
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> getHighSpeedVideoFpsRanges;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoFpsRangesFor;
        private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> getHighSpeedVideoSizes;
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> getHighSpeedVideoSizesFor;
        private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>> getInputFormats;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getInputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor> getOutputFormats;
        private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> getOutputMinFrameDuration;

        public OptimizedImplementation(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> list, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> list2, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> list3) {
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> emptyMap;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            this.Camera2StreamConfigurationMap = deserializedMemberScope;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : list) {
                kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj)).getName());
                java.lang.Object obj2 = linkedHashMap.get(name2);
                if (obj2 == null) {
                    obj2 = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(name2, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(linkedHashMap);
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope2 = this.Camera2StreamConfigurationMap;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.lang.Object obj3 : list2) {
                kotlin.reflect.jvm.internal.impl.name.Name name3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj3)).getName());
                java.lang.Object obj4 = linkedHashMap2.get(name3);
                if (obj4 == null) {
                    obj4 = (java.util.List) new java.util.ArrayList();
                    linkedHashMap2.put(name3, obj4);
                }
                ((java.util.List) obj4).add(obj3);
            }
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRanges(linkedHashMap2);
            if (!this.Camera2StreamConfigurationMap.getC().getComponents().getConfiguration().getTypeAliasesAllowed()) {
                emptyMap = kotlin.collections.MapsKt.emptyMap();
            } else {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope3 = this.Camera2StreamConfigurationMap;
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                for (java.lang.Object obj5 : list3) {
                    kotlin.reflect.jvm.internal.impl.name.Name name4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedMemberScope3.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj5)).getName());
                    java.lang.Object obj6 = linkedHashMap3.get(name4);
                    if (obj6 == null) {
                        obj6 = (java.util.List) new java.util.ArrayList();
                        linkedHashMap3.put(name4, obj6);
                    }
                    ((java.util.List) obj6).add(obj5);
                }
                emptyMap = getHighSpeedVideoFpsRanges(linkedHashMap3);
            }
            this.getOutputMinFrameDuration = emptyMap;
            this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap.getC().getStorageManager().createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$0
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj7) {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.name.Name) obj7);
                }

                {
                    this.getHighSpeedVideoSizes = this;
                }
            });
            this.getInputFormats = this.Camera2StreamConfigurationMap.getC().getStorageManager().createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$1
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj7) {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.name.Name) obj7);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = this;
                }
            });
            this.getOutputFormats = this.Camera2StreamConfigurationMap.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$2
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation Camera2StreamConfigurationMap;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj7) {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.name.Name) obj7);
                }

                {
                    this.Camera2StreamConfigurationMap = this;
                }
            });
            kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = this.Camera2StreamConfigurationMap.getC().getStorageManager();
            final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope4 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this, deserializedMemberScope4) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$3
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope getHighResolutionOutputSizeshNQ4ISI;
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.Set plus;
                    plus = kotlin.collections.SetsKt.plus((java.util.Set) this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.keySet(), (java.lang.Iterable) this.getHighResolutionOutputSizeshNQ4ISI.getNonDeclaredFunctionNames());
                    return plus;
                }

                {
                    this.getHighSpeedVideoFpsRanges = this;
                    this.getHighResolutionOutputSizeshNQ4ISI = deserializedMemberScope4;
                }
            });
            kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager2 = this.Camera2StreamConfigurationMap.getC().getStorageManager();
            final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope5 = this.Camera2StreamConfigurationMap;
            this.getInputSizeshNQ4ISI = storageManager2.createLazyValue(new kotlin.jvm.functions.Function0(this, deserializedMemberScope5) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$4
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope getHighSpeedVideoFpsRangesFor;
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.Set plus;
                    plus = kotlin.collections.SetsKt.plus((java.util.Set) this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor.keySet(), (java.lang.Iterable) this.getHighSpeedVideoFpsRangesFor.getNonDeclaredVariableNames());
                    return plus;
                }

                {
                    this.getHighSpeedVideoSizes = this;
                    this.getHighSpeedVideoFpsRangesFor = deserializedMemberScope5;
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRanges() {
            return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRangesFor, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRangesFor() {
            return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoSizes() {
            return this.getOutputMinFrameDuration.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return this.getOutputFormats.invoke(name2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final void getHighSpeedVideoSizes(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collection, kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> set = (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[1]);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.Name name2 : set) {
                    if (function1.invoke(name2).booleanValue()) {
                        arrayList.addAll(getHighResolutionOutputSizeshNQ4ISI(name2, lookupLocation));
                    }
                }
                kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator = kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nameAndTypeMemberComparator, "");
                kotlin.collections.CollectionsKt.sortWith(arrayList, nameAndTypeMemberComparator);
                collection.addAll(arrayList);
            }
            if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> set2 = (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRangesFor, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0]);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.Name name3 : set2) {
                    if (function1.invoke(name3).booleanValue()) {
                        arrayList2.addAll(getHighSpeedVideoFpsRanges(name3, lookupLocation));
                    }
                }
                kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator2 = kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nameAndTypeMemberComparator2, "");
                kotlin.collections.CollectionsKt.sortWith(arrayList2, nameAndTypeMemberComparator2);
                collection.addAll(arrayList2);
            }
        }

        private static java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> getHighSpeedVideoFpsRanges(java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite>> map) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
            java.util.Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.Object key = entry.getKey();
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                java.util.Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(kotlin.Unit.INSTANCE);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static /* synthetic */ java.util.Collection getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation optimizedImplementation, kotlin.reflect.jvm.internal.impl.name.Name name2) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> emptyList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> map = optimizedImplementation.getHighSpeedVideoFpsRanges;
            kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> parser = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parser, "");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope = optimizedImplementation.Camera2StreamConfigurationMap;
            byte[] bArr = map.get(name2);
            if (bArr != null) {
                java.util.List list = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.generateSequence(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(parser, new java.io.ByteArrayInputStream(bArr), optimizedImplementation.Camera2StreamConfigurationMap)));
                if (list != null) {
                    emptyList = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(emptyList.size());
                    for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function : emptyList) {
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = deserializedMemberScope.getC().getMemberDeserializer();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(function);
                        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor loadFunction = memberDeserializer.loadFunction(function);
                        if (!deserializedMemberScope.isDeclaredFunctionAvailable(loadFunction)) {
                            loadFunction = null;
                        }
                        if (loadFunction != null) {
                            arrayList.add(loadFunction);
                        }
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    deserializedMemberScope.computeNonDeclaredFunctions(name2, arrayList2);
                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList2);
                }
            }
            emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(emptyList.size());
            while (r4.hasNext()) {
            }
            java.util.ArrayList arrayList22 = arrayList3;
            deserializedMemberScope.computeNonDeclaredFunctions(name2, arrayList22);
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList22);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static /* synthetic */ java.util.Collection Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation optimizedImplementation, kotlin.reflect.jvm.internal.impl.name.Name name2) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> emptyList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> map = optimizedImplementation.getHighSpeedVideoSizesFor;
            kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> parser = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parser, "");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope = optimizedImplementation.Camera2StreamConfigurationMap;
            byte[] bArr = map.get(name2);
            if (bArr != null) {
                java.util.List list = kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.generateSequence(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(parser, new java.io.ByteArrayInputStream(bArr), optimizedImplementation.Camera2StreamConfigurationMap)));
                if (list != null) {
                    emptyList = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(emptyList.size());
                    for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property : emptyList) {
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer = deserializedMemberScope.getC().getMemberDeserializer();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(property);
                        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor loadProperty$default = kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadProperty$default(memberDeserializer, property, false, 2, null);
                        if (loadProperty$default != null) {
                            arrayList.add(loadProperty$default);
                        }
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    deserializedMemberScope.computeNonDeclaredProperties(name2, arrayList2);
                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList2);
                }
            }
            emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(emptyList.size());
            while (r7.hasNext()) {
            }
            java.util.ArrayList arrayList22 = arrayList3;
            deserializedMemberScope.computeNonDeclaredProperties(name2, arrayList22);
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList22);
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation optimizedImplementation, kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias parseDelimitedFrom;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            byte[] bArr = optimizedImplementation.getOutputMinFrameDuration.get(name2);
            if (bArr == null || (parseDelimitedFrom = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.parseDelimitedFrom(new java.io.ByteArrayInputStream(bArr), optimizedImplementation.Camera2StreamConfigurationMap.getC().getComponents().getExtensionRegistryLite())) == null) {
                return null;
            }
            return optimizedImplementation.Camera2StreamConfigurationMap.getC().getMemberDeserializer().loadTypeAlias(parseDelimitedFrom);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            return !((java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRangesFor, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[0])).contains(name2) ? kotlin.collections.CollectionsKt.emptyList() : this.getHighSpeedVideoSizes.invoke(name2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            return !((java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighResolutionOutputSizeshNQ4ISI[1])).contains(name2) ? kotlin.collections.CollectionsKt.emptyList() : this.getInputFormats.invoke(name2);
        }
    }

    final class NoReorderImplementation implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue Camera2StreamConfigurationMap;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope getHighSpeedVideoFpsRanges;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoSizes;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoSizesFor;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> getInputFormats;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getInputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getOutputFormats;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getOutputMinFrameDuration;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getOutputMinFrameDurationlomOqCM;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getOutputSizes;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> getOutputSizeshNQ4ISI;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> getOutputStallDuration;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getOutputStallDurationlomOqCM;

        public NoReorderImplementation(final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> list, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> list2, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> list3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            this.getHighSpeedVideoFpsRanges = deserializedMemberScope;
            this.getInputFormats = list;
            this.getOutputStallDuration = list2;
            this.getOutputSizeshNQ4ISI = deserializedMemberScope.getC().getComponents().getConfiguration().getTypeAliasesAllowed() ? list3 : kotlin.collections.CollectionsKt.emptyList();
            this.getInputSizeshNQ4ISI = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.getHighSpeedVideoFpsRanges = this;
                }
            });
            this.getHighSpeedVideoSizesFor = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$1
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = this;
                }
            });
            this.Camera2StreamConfigurationMap = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$2
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = this;
                }
            });
            this.getHighResolutionOutputSizeshNQ4ISI = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$3
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = this;
                }
            });
            this.getHighSpeedVideoSizes = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$4
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = this;
                }
            });
            this.getOutputMinFrameDurationlomOqCM = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$5
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.getInputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = this;
                }
            });
            this.getOutputFormats = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$6
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation Camera2StreamConfigurationMap;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.getOutputFormats(this.Camera2StreamConfigurationMap);
                }

                {
                    this.Camera2StreamConfigurationMap = this;
                }
            });
            this.getOutputStallDurationlomOqCM = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$7
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation Camera2StreamConfigurationMap;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.getInputFormats(this.Camera2StreamConfigurationMap);
                }

                {
                    this.Camera2StreamConfigurationMap = this;
                }
            });
            this.getOutputMinFrameDuration = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this, deserializedMemberScope) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$8
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
                }

                {
                    this.getHighSpeedVideoSizes = this;
                    this.Camera2StreamConfigurationMap = deserializedMemberScope;
                }
            });
            this.getOutputSizes = deserializedMemberScope.getC().getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this, deserializedMemberScope) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$9
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope getHighSpeedVideoFpsRanges;
                private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
                }

                {
                    this.getHighSpeedVideoSizes = this;
                    this.getHighSpeedVideoFpsRanges = deserializedMemberScope;
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRanges() {
            return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getOutputMinFrameDuration, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRangesFor() {
            return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getOutputSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[9]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoSizes() {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> list = this.getOutputSizeshNQ4ISI;
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope = this.getHighSpeedVideoFpsRanges;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) it.next())).getName()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final void getHighSpeedVideoSizes(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collection, kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                for (java.lang.Object obj : (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[4])) {
                    kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj).getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                    if (function1.invoke(name2).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                for (java.lang.Object obj2 : (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighResolutionOutputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[3])) {
                    kotlin.reflect.jvm.internal.impl.name.Name name3 = ((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj2).getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
                    if (function1.invoke(name3).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        static /* synthetic */ java.util.List getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> list = noReorderImplementation.getInputFormats;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope = noReorderImplementation.getHighSpeedVideoFpsRanges;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor loadFunction = deserializedMemberScope.getC().getMemberDeserializer().loadFunction((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) it.next()));
                if (!deserializedMemberScope.isDeclaredFunctionAvailable(loadFunction)) {
                    loadFunction = null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = loadFunction;
                if (simpleFunctionDescriptor != null) {
                    arrayList.add(simpleFunctionDescriptor);
                }
            }
            return arrayList;
        }

        static /* synthetic */ java.util.List Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> list = noReorderImplementation.getOutputStallDuration;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope = noReorderImplementation.getHighSpeedVideoFpsRanges;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor loadProperty$default = kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadProperty$default(deserializedMemberScope.getC().getMemberDeserializer(), (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) it.next()), false, 2, null);
                if (loadProperty$default != null) {
                    arrayList.add(loadProperty$default);
                }
            }
            return arrayList;
        }

        static /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> list = noReorderImplementation.getOutputSizeshNQ4ISI;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope = noReorderImplementation.getHighSpeedVideoFpsRanges;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor loadTypeAlias = deserializedMemberScope.getC().getMemberDeserializer().loadTypeAlias((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) it.next()));
                if (loadTypeAlias != null) {
                    arrayList.add(loadTypeAlias);
                }
            }
            return arrayList;
        }

        static /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
            java.util.List list = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(noReorderImplementation.getInputSizeshNQ4ISI, noReorderImplementation, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[0]);
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> nonDeclaredFunctionNames = noReorderImplementation.getHighSpeedVideoFpsRanges.getNonDeclaredFunctionNames();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : nonDeclaredFunctionNames) {
                java.util.List list2 = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(noReorderImplementation.getInputSizeshNQ4ISI, noReorderImplementation, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[0]);
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope = noReorderImplementation.getHighSpeedVideoFpsRanges;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list2) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj).getName(), name2)) {
                        arrayList2.add(obj);
                    }
                }
                java.util.ArrayList arrayList3 = arrayList2;
                int size = arrayList3.size();
                deserializedMemberScope.computeNonDeclaredFunctions(name2, arrayList3);
                kotlin.collections.CollectionsKt.addAll(arrayList, arrayList3.subList(size, arrayList3.size()));
            }
            return kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) arrayList);
        }

        static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
            java.util.List list = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(noReorderImplementation.getHighSpeedVideoSizesFor, noReorderImplementation, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[1]);
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> nonDeclaredVariableNames = noReorderImplementation.getHighSpeedVideoFpsRanges.getNonDeclaredVariableNames();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : nonDeclaredVariableNames) {
                java.util.List list2 = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(noReorderImplementation.getHighSpeedVideoSizesFor, noReorderImplementation, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[1]);
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope = noReorderImplementation.getHighSpeedVideoFpsRanges;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list2) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj).getName(), name2)) {
                        arrayList2.add(obj);
                    }
                }
                java.util.ArrayList arrayList3 = arrayList2;
                int size = arrayList3.size();
                deserializedMemberScope.computeNonDeclaredProperties(name2, arrayList3);
                kotlin.collections.CollectionsKt.addAll(arrayList, arrayList3.subList(size, arrayList3.size()));
            }
            return kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) arrayList);
        }

        static /* synthetic */ java.util.Map getInputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
            java.util.List list = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(noReorderImplementation.Camera2StreamConfigurationMap, noReorderImplementation, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[2]);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (java.lang.Object obj : list) {
                kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) obj).getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                linkedHashMap.put(name2, obj);
            }
            return linkedHashMap;
        }

        static /* synthetic */ java.util.Map getOutputFormats(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
            java.util.List list = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(noReorderImplementation.getHighResolutionOutputSizeshNQ4ISI, noReorderImplementation, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[3]);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : list) {
                kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj).getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                java.lang.Object obj2 = linkedHashMap.get(name2);
                if (obj2 == null) {
                    obj2 = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(name2, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            return linkedHashMap;
        }

        static /* synthetic */ java.util.Map getInputFormats(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
            java.util.List list = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(noReorderImplementation.getHighSpeedVideoSizes, noReorderImplementation, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[4]);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : list) {
                kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj).getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                java.lang.Object obj2 = linkedHashMap.get(name2);
                if (obj2 == null) {
                    obj2 = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(name2, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            return linkedHashMap;
        }

        static /* synthetic */ java.util.Set getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> list = noReorderImplementation.getInputFormats;
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.getHighSpeedVideoFpsRanges;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) it.next())).getName()));
            }
            return kotlin.collections.SetsKt.plus((java.util.Set) linkedHashSet, (java.lang.Iterable) deserializedMemberScope.getNonDeclaredFunctionNames());
        }

        static /* synthetic */ java.util.Set getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.NoReorderImplementation noReorderImplementation, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> list = noReorderImplementation.getOutputStallDuration;
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.getHighSpeedVideoFpsRanges;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) it.next())).getName()));
            }
            return kotlin.collections.SetsKt.plus((java.util.Set) linkedHashSet, (java.lang.Iterable) deserializedMemberScope.getNonDeclaredVariableNames());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue notNullLazyValue = this.getOutputMinFrameDuration;
            kotlin.reflect.KProperty<java.lang.Object>[] kPropertyArr = getHighSpeedVideoFpsRangesFor;
            return (((java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(notNullLazyValue, this, (kotlin.reflect.KProperty<?>) kPropertyArr[8])).contains(name2) && (collection = (java.util.Collection) ((java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getOutputFormats, this, (kotlin.reflect.KProperty<?>) kPropertyArr[6])).get(name2)) != null) ? collection : kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue notNullLazyValue = this.getOutputSizes;
            kotlin.reflect.KProperty<java.lang.Object>[] kPropertyArr = getHighSpeedVideoFpsRangesFor;
            return (((java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(notNullLazyValue, this, (kotlin.reflect.KProperty<?>) kPropertyArr[9])).contains(name2) && (collection = (java.util.Collection) ((java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getOutputStallDurationlomOqCM, this, (kotlin.reflect.KProperty<?>) kPropertyArr[7])).get(name2)) != null) ? collection : kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) ((java.util.Map) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getOutputMinFrameDurationlomOqCM, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRangesFor[5])).get(name2);
        }
    }

    static /* synthetic */ java.util.Set getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope deserializedMemberScope) {
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> nonDeclaredClassifierNames = deserializedMemberScope.getNonDeclaredClassifierNames();
        if (nonDeclaredClassifierNames == null) {
            return null;
        }
        return kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set) deserializedMemberScope.getClassNames$deserialization(), (java.lang.Iterable) deserializedMemberScope.Camera2StreamConfigurationMap.getHighSpeedVideoSizes()), (java.lang.Iterable) nonDeclaredClassifierNames);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[1]);
    }

    protected boolean isDeclaredFunctionAvailable(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
        return true;
    }

    protected void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    protected void computeNonDeclaredFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }
}

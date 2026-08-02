package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public final class LazyJavaStaticClassScope extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope {
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor javaClassDescriptor) {
        super(lazyJavaResolverContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClassDescriptor, "");
        this.getHighSpeedVideoFpsRanges = javaClass;
        this.getHighSpeedVideoFpsRangesFor = javaClassDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor getOwnerDescriptor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex computeMemberIndex() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex(this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> mutableSet = kotlin.collections.CollectionsKt.toMutableSet(getDeclaredMemberIndex().invoke().getMethodNames());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope parentJavaStaticClassScope = kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = kotlin.collections.SetsKt.emptySet();
        }
        mutableSet.addAll(functionNames);
        if (this.getHighSpeedVideoFpsRanges.isEnum()) {
            mutableSet.addAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.Name[]{kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_VALUE_OF, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_VALUES}));
        }
        mutableSet.addAll(getC().getComponents().getSyntheticPartsProvider().getStaticFunctionNames(getOwnerDescriptor(), getC()));
        return mutableSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> mutableSet = kotlin.collections.CollectionsKt.toMutableSet(getDeclaredMemberIndex().invoke().getFieldNames());
        getHighResolutionOutputSizeshNQ4ISI(getOwnerDescriptor(), mutableSet, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) obj);
            }
        });
        if (this.getHighSpeedVideoFpsRanges.isEnum()) {
            mutableSet.add(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_ENTRIES);
        }
        return mutableSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final void computeNonDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope parentJavaStaticClassScope = kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> resolveOverridesForStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForStaticMembers(name2, parentJavaStaticClassScope == null ? kotlin.collections.SetsKt.emptySet() : kotlin.collections.CollectionsKt.toSet(parentJavaStaticClassScope.getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS)), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resolveOverridesForStaticMembers, "");
        collection.addAll(resolveOverridesForStaticMembers);
        if (this.getHighSpeedVideoFpsRanges.isEnum()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(name2, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_VALUE_OF)) {
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createEnumValueOfMethod = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumValueOfMethod(getOwnerDescriptor());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createEnumValueOfMethod, "");
                collection.add(createEnumValueOfMethod);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(name2, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_VALUES)) {
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createEnumValuesMethod = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumValuesMethod(getOwnerDescriptor());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createEnumValuesMethod, "");
                collection.add(createEnumValuesMethod);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final void computeImplicitlyDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        getC().getComponents().getSyntheticPartsProvider().generateStaticFunctions(getOwnerDescriptor(), name2, collection, getC());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final void computeNonDeclaredProperties(final kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Set highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getOwnerDescriptor(), new java.util.LinkedHashSet(), new kotlin.jvm.functions.Function1(name2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.name.Name Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) obj);
            }

            {
                this.Camera2StreamConfigurationMap = name2;
            }
        });
        if (!collection.isEmpty()) {
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> resolveOverridesForStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForStaticMembers(name2, highResolutionOutputSizeshNQ4ISI, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resolveOverridesForStaticMembers, "");
            collection.addAll(resolveOverridesForStaticMembers);
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : highResolutionOutputSizeshNQ4ISI) {
                kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj);
                java.lang.Object obj2 = linkedHashMap.get(highResolutionOutputSizeshNQ4ISI2);
                if (obj2 == null) {
                    obj2 = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(highResolutionOutputSizeshNQ4ISI2, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Collection resolveOverridesForStaticMembers2 = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForStaticMembers(name2, (java.util.Collection) ((java.util.Map.Entry) it.next()).getValue(), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resolveOverridesForStaticMembers2, "");
                kotlin.collections.CollectionsKt.addAll(arrayList, resolveOverridesForStaticMembers2);
            }
            collection.addAll(arrayList);
        }
        if (this.getHighSpeedVideoFpsRanges.isEnum() && kotlin.jvm.internal.Intrinsics.areEqual(name2, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.ENUM_ENTRIES)) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection, kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumEntriesProperty(getOwnerDescriptor()));
        }
    }

    private static <R> java.util.Set<R> getHighResolutionOutputSizeshNQ4ISI(final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, final java.util.Set<R> set, final kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, ? extends java.util.Collection<? extends R>> function1) {
        kotlin.reflect.jvm.internal.impl.utils.DFS.dfs(kotlin.collections.CollectionsKt.listOf(classDescriptor), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$3
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public java.lang.Iterable getNeighbors(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) obj);
            }
        }, new kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2
            /* renamed from: result, reason: collision with other method in class */
            public final void m23896result() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final /* bridge */ /* synthetic */ java.lang.Object result() {
                m23896result();
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final boolean beforeChildren(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor2, "");
                if (classDescriptor2 == kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.this) {
                    return true;
                }
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope staticScope = classDescriptor2.getStaticScope();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(staticScope, "");
                if (!(staticScope instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope)) {
                    return true;
                }
                set.addAll((java.util.Collection) function1.invoke(staticScope));
                return false;
            }
        });
        return set;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection = overriddenDescriptors;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor2 : collection) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(propertyDescriptor2);
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI(propertyDescriptor2));
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.collections.CollectionsKt.single(kotlin.collections.CollectionsKt.distinct(arrayList));
    }

    static /* synthetic */ boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember javaMember) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMember, "");
        return javaMember.isStatic();
    }

    static /* synthetic */ java.util.Collection getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberScope, "");
        return memberScope.getVariableNames();
    }

    static /* synthetic */ java.util.Collection getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberScope, "");
        return memberScope.getContributedVariables(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }

    static /* synthetic */ java.lang.Iterable Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
        return kotlin.sequences.SequencesKt.asIterable(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(supertypes), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$4
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.types.KotlinType) obj);
            }
        }));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return null;
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public final class LazyJavaClassMemberScope extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope {
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor>> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name>> getHighSpeedVideoSizes;
    private final boolean getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name>> getOutputFormats;

    public /* synthetic */ LazyJavaClassMemberScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, boolean z, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z, (i & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final /* bridge */ /* synthetic */ java.util.Set computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1 function1) {
        return computeFunctionNames(descriptorKindFilter, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>) function1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getOwnerDescriptor() {
        return this.getInputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, boolean z, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(lazyJavaResolverContext, lazyJavaClassMemberScope);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        this.getInputSizeshNQ4ISI = classDescriptor;
        this.getHighSpeedVideoFpsRanges = javaClass;
        this.getHighSpeedVideoSizesFor = z;
        this.getHighSpeedVideoFpsRangesFor = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this, lazyJavaResolverContext) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
            }

            {
                this.Camera2StreamConfigurationMap = this;
                this.getHighSpeedVideoSizes = lazyJavaResolverContext;
            }
        });
        this.getOutputFormats = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Set set;
                set = kotlin.collections.CollectionsKt.toSet(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.getInnerClassNames());
                return set;
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        this.getHighSpeedVideoSizes = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(lazyJavaResolverContext, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Set set;
                set = kotlin.collections.CollectionsKt.toSet(r0.getComponents().getSyntheticPartsProvider().getNestedClassNames(this.Camera2StreamConfigurationMap.getOwnerDescriptor(), this.getHighSpeedVideoSizes));
                return set;
            }

            {
                this.getHighSpeedVideoSizes = lazyJavaResolverContext;
                this.Camera2StreamConfigurationMap = this;
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$3
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
        this.getInputFormats = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this, lazyJavaResolverContext) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$4
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.name.Name) obj);
            }

            {
                this.getHighSpeedVideoSizes = this;
                this.Camera2StreamConfigurationMap = lazyJavaResolverContext;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex computeMemberIndex() {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex(this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$5
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.Name> computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
        java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.Name> linkedHashSet = new java.util.LinkedHashSet<>();
        java.util.Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getFunctionNames());
        }
        java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.name.Name> linkedHashSet2 = linkedHashSet;
        linkedHashSet2.addAll(getDeclaredMemberIndex().invoke().getMethodNames());
        linkedHashSet2.addAll(getDeclaredMemberIndex().invoke().getRecordComponentNames());
        linkedHashSet2.addAll(computeClassNames(descriptorKindFilter, function1));
        linkedHashSet2.addAll(getC().getComponents().getSyntheticPartsProvider().getMethodNames(getOwnerDescriptor(), getC()));
        return linkedHashSet2;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final boolean isVisibleAsFunction(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMethodDescriptor, "");
        if (this.getHighSpeedVideoFpsRanges.isAnnotationType()) {
            return false;
        }
        return getHighSpeedVideoSizes(javaMethodDescriptor);
    }

    private final boolean getHighSpeedVideoSizes(final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.Name name2 = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> propertyNamesCandidatesByAccessorName = kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(name2);
        if (!(propertyNamesCandidatesByAccessorName instanceof java.util.Collection) || !propertyNamesCandidatesByAccessorName.isEmpty()) {
            java.util.Iterator<T> it = propertyNamesCandidatesByAccessorName.iterator();
            while (it.hasNext()) {
                java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.name.Name) it.next());
                if (!(highSpeedVideoFpsRangesFor instanceof java.util.Collection) || !highSpeedVideoFpsRangesFor.isEmpty()) {
                    for (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor : highSpeedVideoFpsRangesFor) {
                        if (getHighResolutionOutputSizeshNQ4ISI(propertyDescriptor, new kotlin.jvm.functions.Function1(simpleFunctionDescriptor, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$6
                            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope getHighResolutionOutputSizeshNQ4ISI;
                            private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor getHighSpeedVideoFpsRangesFor;

                            @Override // kotlin.jvm.functions.Function1
                            public java.lang.Object invoke(java.lang.Object obj) {
                                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.name.Name) obj);
                            }

                            {
                                this.getHighSpeedVideoFpsRangesFor = simpleFunctionDescriptor;
                                this.getHighResolutionOutputSizeshNQ4ISI = this;
                            }
                        })) {
                            if (!propertyDescriptor.isVar()) {
                                java.lang.String asString = simpleFunctionDescriptor.getName().asString();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                                if (!kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isSetterName(asString)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (Camera2StreamConfigurationMap(simpleFunctionDescriptor) || getHighSpeedVideoSizesFor(simpleFunctionDescriptor) || getHighSpeedVideoFpsRanges(simpleFunctionDescriptor)) ? false : true;
    }

    private final boolean getHighSpeedVideoSizesFor(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.Name name2 = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name2)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name3 = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(name3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = highSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next());
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                arrayList.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return false;
        }
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (Camera2StreamConfigurationMap(simpleFunctionDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> findMethodsByName = getDeclaredMemberIndex().invoke().findMethodsByName(name2);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(findMethodsByName, 10));
        java.util.Iterator<T> it = findMethodsByName.iterator();
        while (it.hasNext()) {
            arrayList.add(resolveMethodToFunctionDescriptor((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(name2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : highSpeedVideoFpsRanges) {
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj;
            if (!kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) && kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion companion = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion;
        kotlin.reflect.jvm.internal.impl.name.Name name2 = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        kotlin.reflect.jvm.internal.impl.name.Name builtinFunctionNamesByJvmName = companion.getBuiltinFunctionNamesByJvmName(name2);
        if (builtinFunctionNamesByJvmName == null) {
            return false;
        }
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(builtinFunctionNamesByJvmName);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : highSpeedVideoFpsRanges) {
            if (kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(simpleFunctionDescriptor, builtinFunctionNamesByJvmName);
        java.util.ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next(), highResolutionOutputSizeshNQ4ISI)) {
                return true;
            }
        }
        return false;
    }

    private final boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(simpleFunctionDescriptor);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name2 = simpleFunctionDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(name2);
        if (highSpeedVideoFpsRanges.isEmpty()) {
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 : highSpeedVideoFpsRanges) {
            if (simpleFunctionDescriptor2.isSuspend() && getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, simpleFunctionDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName;
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) valueParameters);
        if (valueParameterDescriptor != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = valueParameterDescriptor.getType().getConstructor().mo23898getDeclarationDescriptor();
            if (mo23898getDeclarationDescriptor != null && (fqNameUnsafe = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(mo23898getDeclarationDescriptor)) != null) {
                if (!fqNameUnsafe.isSafe()) {
                    fqNameUnsafe = null;
                }
                if (fqNameUnsafe != null) {
                    fqName = fqNameUnsafe.toSafe();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
                        valueParameterDescriptor = null;
                    }
                    if (valueParameterDescriptor != null) {
                        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters2, "");
                        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor build = newCopyBuilder.setValueParameters(kotlin.collections.CollectionsKt.dropLast(valueParameters2, 1)).setReturnType(valueParameterDescriptor.getType().getArguments().get(0).getType()).build();
                        kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl) build;
                        if (simpleFunctionDescriptorImpl != null) {
                            simpleFunctionDescriptorImpl.setSuspend(true);
                        }
                        return build;
                    }
                }
            }
            fqName = null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
            }
            if (valueParameterDescriptor != null) {
            }
        }
        return null;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        newCopyBuilder.setName(name2);
        newCopyBuilder.setSignatureChange();
        newCopyBuilder.setPreserveSourceElement();
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor build = newCopyBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        return build;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        if (kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.getOriginal();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(functionDescriptor);
        return getHighResolutionOutputSizeshNQ4ISI(functionDescriptor, simpleFunctionDescriptor);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor, true).getResult();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "");
        return result == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor2, callableDescriptor);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor) kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        java.lang.String builtinSpecialPropertyGetterName = propertyGetterDescriptor != null ? kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor) : null;
        if (builtinSpecialPropertyGetterName != null && !kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), propertyGetterDescriptor)) {
            return getHighSpeedVideoSizes(propertyDescriptor, builtinSpecialPropertyGetterName, function1);
        }
        java.lang.String asString = propertyDescriptor.getName().asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        return getHighSpeedVideoSizes(propertyDescriptor, kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.getterName(asString), function1);
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor;
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        java.util.Iterator<T> it = function1.invoke(identifier).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker kotlinTypeChecker = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT;
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor;
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType;
        java.lang.String asString = propertyDescriptor.getName().asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.setterName(asString));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        java.util.Iterator<T> it = function1.invoke(identifier).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnit(returnType)) {
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker kotlinTypeChecker = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor2.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                if (kotlinTypeChecker.equalTypes(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) valueParameters)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        if (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor highSpeedVideoSizes = getHighSpeedVideoSizes(propertyDescriptor, function1);
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(propertyDescriptor, function1);
        if (highSpeedVideoSizes == null) {
            return false;
        }
        if (propertyDescriptor.isVar()) {
            return Camera2StreamConfigurationMap != null && Camera2StreamConfigurationMap.getModality() == highSpeedVideoSizes.getModality();
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final void computeNonDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(name2);
        if (!kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion.getSameAsRenamedInJvmBuiltin(name2) && !kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name2)) {
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> set = highSpeedVideoFpsRanges;
            if (!set.isEmpty()) {
                java.util.Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it.next()).isSuspend()) {
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : set) {
                if (getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            getHighSpeedVideoSizes(collection, name2, arrayList, false);
            return;
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartSet create = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> resolveOverridesForNonStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name2, highSpeedVideoFpsRanges, kotlin.collections.CollectionsKt.emptyList(), getOwnerDescriptor(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter.DO_NOTHING, getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resolveOverridesForNonStaticMembers, "");
        getHighSpeedVideoFpsRangesFor(name2, collection, resolveOverridesForNonStaticMembers, collection, new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        getHighSpeedVideoFpsRangesFor(name2, collection, resolveOverridesForNonStaticMembers, create, new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : highSpeedVideoFpsRanges) {
            if (getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        getHighSpeedVideoSizes(collection, name2, kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList2, (java.lang.Iterable) create), true);
    }

    private final void getHighSpeedVideoSizes(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection2, boolean z) {
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> resolveOverridesForNonStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name2, collection2, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resolveOverridesForNonStaticMembers, "");
        if (!z) {
            collection.addAll(resolveOverridesForNonStaticMembers);
            return;
        }
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection3 = resolveOverridesForNonStaticMembers;
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) collection, (java.lang.Iterable) collection3);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection3, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor : collection3) {
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenSpecialBuiltin(simpleFunctionDescriptor);
            if (simpleFunctionDescriptor2 == null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(simpleFunctionDescriptor);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(simpleFunctionDescriptor);
                simpleFunctionDescriptor = getHighSpeedVideoFpsRangesFor(simpleFunctionDescriptor, simpleFunctionDescriptor2, plus);
            }
            arrayList.add(simpleFunctionDescriptor);
        }
        collection.addAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection2, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection3, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2;
        java.lang.Object obj;
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor3;
        for (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor4 : collection2) {
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor5 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor4);
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor6 = null;
            if (simpleFunctionDescriptor5 != null) {
                java.lang.String jvmMethodNameIfSpecial = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor5);
                kotlin.jvm.internal.Intrinsics.checkNotNull(jvmMethodNameIfSpecial);
                kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(jvmMethodNameIfSpecial);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
                java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> it = function1.invoke(identifier).iterator();
                while (it.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(it.next(), name2);
                    if (getHighSpeedVideoFpsRangesFor(simpleFunctionDescriptor5, highResolutionOutputSizeshNQ4ISI)) {
                        simpleFunctionDescriptor = getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, simpleFunctionDescriptor5, collection);
                        break;
                    }
                }
            }
            simpleFunctionDescriptor = null;
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, simpleFunctionDescriptor);
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor4);
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                kotlin.reflect.jvm.internal.impl.name.Name name3 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
                java.util.Iterator<T> it2 = function1.invoke(name3).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj, overriddenBuiltinFunctionWithErasedValueParametersInJava)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor7 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj;
                if (simpleFunctionDescriptor7 != null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor7.newCopyBuilder();
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = overriddenBuiltinFunctionWithErasedValueParametersInJava.getValueParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it3.next()).getType());
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor7.getValueParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters2, "");
                    newCopyBuilder.setValueParameters(kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt.copyValueParameters(arrayList, valueParameters2, overriddenBuiltinFunctionWithErasedValueParametersInJava));
                    newCopyBuilder.setSignatureChange();
                    newCopyBuilder.setPreserveSourceElement();
                    newCopyBuilder.putUserData(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS, java.lang.Boolean.TRUE);
                    simpleFunctionDescriptor3 = newCopyBuilder.build();
                } else {
                    simpleFunctionDescriptor3 = null;
                }
                if (simpleFunctionDescriptor3 != null) {
                    if (!getHighSpeedVideoSizes(simpleFunctionDescriptor3)) {
                        simpleFunctionDescriptor3 = null;
                    }
                    if (simpleFunctionDescriptor3 != null) {
                        simpleFunctionDescriptor2 = getHighSpeedVideoFpsRangesFor(simpleFunctionDescriptor3, overriddenBuiltinFunctionWithErasedValueParametersInJava, collection);
                        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, simpleFunctionDescriptor2);
                        if (!simpleFunctionDescriptor4.isSuspend()) {
                            kotlin.reflect.jvm.internal.impl.name.Name name4 = simpleFunctionDescriptor4.getName();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name4, "");
                            java.util.Iterator<T> it4 = function1.invoke(name4).iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it4.next());
                                if (highResolutionOutputSizeshNQ4ISI2 == null || !getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2, simpleFunctionDescriptor4)) {
                                    highResolutionOutputSizeshNQ4ISI2 = null;
                                }
                                if (highResolutionOutputSizeshNQ4ISI2 != null) {
                                    simpleFunctionDescriptor6 = highResolutionOutputSizeshNQ4ISI2;
                                    break;
                                }
                            }
                        }
                        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, simpleFunctionDescriptor6);
                    }
                }
            }
            simpleFunctionDescriptor2 = null;
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, simpleFunctionDescriptor2);
            if (!simpleFunctionDescriptor4.isSuspend()) {
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, simpleFunctionDescriptor6);
        }
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection) {
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor2 : collection2) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(simpleFunctionDescriptor, simpleFunctionDescriptor2) && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && getHighResolutionOutputSizeshNQ4ISI(simpleFunctionDescriptor2, callableDescriptor)) {
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor build = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
                kotlin.jvm.internal.Intrinsics.checkNotNull(build);
                return build;
            }
        }
        return simpleFunctionDescriptor;
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = highResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final void computeImplicitlyDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (this.getHighSpeedVideoFpsRanges.isRecord() && getDeclaredMemberIndex().invoke().findRecordComponentByName(name2) != null) {
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection2 = collection;
            if (!collection2.isEmpty()) {
                java.util.Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) it.next()).getValueParameters().isEmpty()) {
                        break;
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent findRecordComponentByName = getDeclaredMemberIndex().invoke().findRecordComponentByName(name2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(findRecordComponentByName);
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor createJavaMethod = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(getC(), findRecordComponentByName), findRecordComponentByName.getName(), getC().getComponents().getSourceElementFactory().source(findRecordComponentByName), true);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createJavaMethod, "");
            createJavaMethod.initialize(null, getDispatchReceiverParameter(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), getC().getTypeResolver().transformJavaType(findRecordComponentByName.getType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, false, null, 6, null)), kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion.convertFromFlags(false, false, true), kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC, null);
            createJavaMethod.setParameterNamesStatus(false, false);
            getC().getComponents().getJavaResolverCache().recordMethod(findRecordComponentByName, createJavaMethod);
            collection.add(createJavaMethod);
        }
        getC().getComponents().getSyntheticPartsProvider().generateMethods(getOwnerDescriptor(), name2, collection, getC());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection) {
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        if (this.getHighSpeedVideoFpsRanges.isAnnotationType() && (javaMethod = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) kotlin.collections.CollectionsKt.singleOrNull(getDeclaredMemberIndex().invoke().findMethodsByName(name2))) != null) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor create = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor.create(getOwnerDescriptor(), kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaMethod), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.toDescriptorVisibility(javaMethod.getVisibility()), false, javaMethod.getName(), getC().getComponents().getSourceElementFactory().source(javaMethod), false);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl createDefaultGetter = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultGetter(create, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createDefaultGetter, "");
            create.initialize(createDefaultGetter, null);
            kotlin.reflect.jvm.internal.impl.types.KotlinType computeMethodReturnType = computeMethodReturnType(javaMethod, kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForMethod$default(getC(), create, javaMethod, 0, 4, null));
            create.setType(computeMethodReturnType, kotlin.collections.CollectionsKt.emptyList(), getDispatchReceiverParameter(), null, kotlin.collections.CollectionsKt.emptyList());
            createDefaultGetter.initialize(computeMethodReturnType);
            collection.add(create);
        }
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(name2);
        if (highSpeedVideoFpsRangesFor.isEmpty()) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartSet create2 = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
        kotlin.reflect.jvm.internal.impl.utils.SmartSet create3 = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
        Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, collection, create2, new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$7
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.name.Name) obj);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        Camera2StreamConfigurationMap(kotlin.collections.SetsKt.minus((java.util.Set) highSpeedVideoFpsRangesFor, (java.lang.Iterable) create2), create3, null, new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$8
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.name.Name) obj);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> resolveOverridesForNonStaticMembers = kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name2, kotlin.collections.SetsKt.plus((java.util.Set) highSpeedVideoFpsRangesFor, (java.lang.Iterable) create3), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resolveOverridesForNonStaticMembers, "");
        collection.addAll(resolveOverridesForNonStaticMembers);
    }

    private final void Camera2StreamConfigurationMap(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> set, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> set2, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor;
        for (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor : set) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = null;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl propertySetterDescriptorImpl = null;
            if (getHighResolutionOutputSizeshNQ4ISI(propertyDescriptor, function1)) {
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor highSpeedVideoSizes = getHighSpeedVideoSizes(propertyDescriptor, function1);
                kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
                if (propertyDescriptor.isVar()) {
                    simpleFunctionDescriptor = Camera2StreamConfigurationMap(propertyDescriptor, function1);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(simpleFunctionDescriptor);
                } else {
                    simpleFunctionDescriptor = null;
                }
                if (simpleFunctionDescriptor != null) {
                    simpleFunctionDescriptor.getModality();
                    highSpeedVideoSizes.getModality();
                }
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor2 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor(getOwnerDescriptor(), highSpeedVideoSizes, simpleFunctionDescriptor, propertyDescriptor);
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = highSpeedVideoSizes.getReturnType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
                javaForKotlinOverridePropertyDescriptor2.setType(returnType, kotlin.collections.CollectionsKt.emptyList(), getDispatchReceiverParameter(), null, kotlin.collections.CollectionsKt.emptyList());
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor3 = javaForKotlinOverridePropertyDescriptor2;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl createGetter = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor3, highSpeedVideoSizes.getAnnotations(), false, false, false, highSpeedVideoSizes.getSource());
                createGetter.setInitialSignatureDescriptor(highSpeedVideoSizes);
                createGetter.initialize(javaForKotlinOverridePropertyDescriptor2.getType());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createGetter, "");
                if (simpleFunctionDescriptor != null) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) valueParameters);
                    if (valueParameterDescriptor == null) {
                        throw new java.lang.AssertionError("No parameter found for ".concat(java.lang.String.valueOf(simpleFunctionDescriptor)));
                    }
                    propertySetterDescriptorImpl = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor3, simpleFunctionDescriptor.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor.getSource());
                    propertySetterDescriptorImpl.setInitialSignatureDescriptor(simpleFunctionDescriptor);
                }
                javaForKotlinOverridePropertyDescriptor2.initialize(createGetter, propertySetterDescriptorImpl);
                javaForKotlinOverridePropertyDescriptor = javaForKotlinOverridePropertyDescriptor2;
            }
            if (javaForKotlinOverridePropertyDescriptor != null) {
                collection.add(javaForKotlinOverridePropertyDescriptor);
                if (set2 != null) {
                    set2.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = highResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> contributedVariables = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getContributedVariables(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(contributedVariables, 10));
            java.util.Iterator<T> it2 = contributedVariables.iterator();
            while (it2.hasNext()) {
                arrayList2.add((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) it2.next());
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, arrayList2);
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighResolutionOutputSizeshNQ4ISI() {
        if (!this.getHighSpeedVideoSizesFor) {
            return getC().getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(getOwnerDescriptor());
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
        return supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData resolveMethodSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature resolvePropagatedSignature = getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(javaMethod, getOwnerDescriptor(), kotlinType, null, list2, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resolvePropagatedSignature, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = resolvePropagatedSignature.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverType = resolvePropagatedSignature.getReceiverType();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = resolvePropagatedSignature.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = resolvePropagatedSignature.getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        boolean hasStableParameterNames = resolvePropagatedSignature.hasStableParameterNames();
        java.util.List<java.lang.String> errors = resolvePropagatedSignature.getErrors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errors, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData(returnType, receiverType, valueParameters, typeParameters, hasStableParameterNames, errors);
    }

    private static boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        java.lang.String computeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original = functionDescriptor.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(original, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(computeJvmDescriptor$default, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) && !getHighResolutionOutputSizeshNQ4ISI(simpleFunctionDescriptor, functionDescriptor);
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = classDescriptor.getVisibility();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(visibility, kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            return visibility;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "");
        return descriptorVisibility;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, int i, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor2 = constructorDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        kotlin.reflect.jvm.internal.impl.name.Name name2 = javaMethod.getName();
        kotlin.reflect.jvm.internal.impl.types.KotlinType makeNotNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeNotNullable, "");
        list.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(constructorDescriptor2, null, i, empty, name2, makeNotNullable, javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 != null ? kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinType2) : null, getC().getComponents().getSourceElementFactory().source(javaMethod)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> memoizedFunctionToNullable;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        mo23903recordLookup(name2, lookupLocation);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope) getMainScope();
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.getInputFormats) == null || (invoke = memoizedFunctionToNullable.invoke(name2)) == null) ? this.getInputFormats.invoke(name2) : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        mo23903recordLookup(name2, lookupLocation);
        return super.getContributedFunctions(name2, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        mo23903recordLookup(name2, lookupLocation);
        return super.getContributedVariables(name2, lookupLocation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        return kotlin.collections.SetsKt.plus((java.util.Set) this.getOutputFormats.invoke(), (java.lang.Iterable) this.getHighResolutionOutputSizeshNQ4ISI.invoke().keySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        if (this.getHighSpeedVideoFpsRanges.isAnnotationType()) {
            return getFunctionNames();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(getDeclaredMemberIndex().invoke().getFieldNames());
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
        java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
        java.util.Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet2, ((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope().getVariableNames());
        }
        return linkedHashSet2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public final void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, getOwnerDescriptor(), name2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Lazy Java member scope for ");
        sb.append(this.getHighSpeedVideoFpsRanges.getFqName());
        return sb.toString();
    }

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        boolean z;
        java.util.ArrayList emptyList;
        kotlin.Pair pair;
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor> constructors = lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges.getConstructors();
        java.util.ArrayList arrayList = new java.util.ArrayList(constructors.size());
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor javaConstructor : constructors) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ownerDescriptor = lazyJavaClassMemberScope.getOwnerDescriptor();
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor javaConstructor2 = javaConstructor;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor createJavaConstructor = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaClassMemberScope.getC(), javaConstructor), false, lazyJavaClassMemberScope.getC().getComponents().getSourceElementFactory().source(javaConstructor2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createJavaConstructor, "");
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForMethod = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForMethod(lazyJavaClassMemberScope.getC(), createJavaConstructor, javaConstructor, ownerDescriptor.getDeclaredTypeParameters().size());
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters resolveValueParameters = lazyJavaClassMemberScope.resolveValueParameters(childForMethod, createJavaConstructor, javaConstructor.getValueParameters());
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = ownerDescriptor.getDeclaredTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = declaredTypeParameters;
            java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
            java.util.Iterator<T> it = typeParameters.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter = childForMethod.getTypeParameterResolver().resolveTypeParameter((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) it.next());
                kotlin.jvm.internal.Intrinsics.checkNotNull(resolveTypeParameter);
                arrayList2.add(resolveTypeParameter);
            }
            createJavaConstructor.initialize(resolveValueParameters.getDescriptors(), kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.toDescriptorVisibility(javaConstructor.getVisibility()), kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) arrayList2));
            createJavaConstructor.setHasStableParameterNames(false);
            createJavaConstructor.setHasSynthesizedParameterNames(resolveValueParameters.getHasSynthesizedNames());
            createJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
            childForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor2, createJavaConstructor);
            arrayList.add(createJavaConstructor);
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptor = null;
        if (lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges.isRecord()) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ownerDescriptor2 = lazyJavaClassMemberScope.getOwnerDescriptor();
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor createJavaConstructor2 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), true, lazyJavaClassMemberScope.getC().getComponents().getSourceElementFactory().source(lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createJavaConstructor2, "");
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptor2 = createJavaConstructor2;
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent> recordComponents = lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges.getRecordComponents();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(recordComponents.size());
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attributes$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, false, null, 6, null);
            int i = 0;
            for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent javaRecordComponent : recordComponents) {
                int i2 = i + 1;
                kotlin.reflect.jvm.internal.impl.types.KotlinType transformJavaType = lazyJavaClassMemberScope.getC().getTypeResolver().transformJavaType(javaRecordComponent.getType(), attributes$default);
                arrayList3.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(javaClassConstructorDescriptor2, null, i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), javaRecordComponent.getName(), transformJavaType, false, false, false, javaRecordComponent.isVararg() ? lazyJavaClassMemberScope.getC().getComponents().getModule().getBuiltIns().getArrayElementType(transformJavaType) : null, lazyJavaClassMemberScope.getC().getComponents().getSourceElementFactory().source(javaRecordComponent)));
                i = i2;
            }
            createJavaConstructor2.setHasSynthesizedParameterNames(false);
            createJavaConstructor2.initialize(arrayList3, getHighSpeedVideoSizes(ownerDescriptor2));
            createJavaConstructor2.setHasStableParameterNames(false);
            createJavaConstructor2.setReturnType(ownerDescriptor2.getDefaultType());
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptor3 = createJavaConstructor2;
            java.lang.String computeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(javaClassConstructorDescriptor3, false, false, 2, null);
            java.util.ArrayList arrayList4 = arrayList;
            if (!arrayList4.isEmpty()) {
                java.util.Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default((kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) it2.next(), false, false, 2, null), computeJvmDescriptor$default)) {
                        break;
                    }
                }
            }
            arrayList.add(javaClassConstructorDescriptor3);
            lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges, javaClassConstructorDescriptor3);
        }
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(lazyJavaClassMemberScope.getOwnerDescriptor(), arrayList, lazyJavaResolverContext);
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement signatureEnhancement = lazyJavaResolverContext.getComponents().getSignatureEnhancement();
        java.util.List list2 = arrayList;
        if (list2.isEmpty()) {
            boolean isAnnotationType = lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges.isAnnotationType();
            if ((!lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges.isInterface() && lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges.hasDefaultConstructor()) || isAnnotationType) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ownerDescriptor3 = lazyJavaClassMemberScope.getOwnerDescriptor();
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor createJavaConstructor3 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), true, lazyJavaClassMemberScope.getC().getComponents().getSourceElementFactory().source(lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createJavaConstructor3, "");
                if (isAnnotationType) {
                    kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor javaClassConstructorDescriptor4 = createJavaConstructor3;
                    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> methods = lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges.getMethods();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(methods.size());
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attributes$default2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, true, false, null, 6, null);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    for (java.lang.Object obj : methods) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) obj).getName(), kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                            arrayList6.add(obj);
                        } else {
                            arrayList7.add(obj);
                        }
                    }
                    kotlin.Pair pair2 = new kotlin.Pair(arrayList6, arrayList7);
                    java.util.List list3 = (java.util.List) pair2.component1();
                    java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> list4 = (java.util.List) pair2.component2();
                    list3.size();
                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) kotlin.collections.CollectionsKt.firstOrNull(list3);
                    if (javaMethod != null) {
                        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType returnType = javaMethod.getReturnType();
                        if (returnType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) {
                            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType javaArrayType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) returnType;
                            pair = new kotlin.Pair(lazyJavaClassMemberScope.getC().getTypeResolver().transformArrayType(javaArrayType, attributes$default2, true), lazyJavaClassMemberScope.getC().getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default2));
                        } else {
                            pair = new kotlin.Pair(lazyJavaClassMemberScope.getC().getTypeResolver().transformJavaType(returnType, attributes$default2), null);
                        }
                        lazyJavaClassMemberScope.getHighResolutionOutputSizeshNQ4ISI(arrayList5, javaClassConstructorDescriptor4, 0, javaMethod, (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component1(), (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component2());
                    }
                    int i3 = javaMethod == null ? 0 : 1;
                    int i4 = 0;
                    for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod2 : list4) {
                        lazyJavaClassMemberScope.getHighResolutionOutputSizeshNQ4ISI(arrayList5, javaClassConstructorDescriptor4, i4 + i3, javaMethod2, lazyJavaClassMemberScope.getC().getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default2), null);
                        i4++;
                    }
                    z = true;
                    emptyList = arrayList5;
                } else {
                    z = true;
                    emptyList = java.util.Collections.emptyList();
                }
                createJavaConstructor3.setHasSynthesizedParameterNames(false);
                createJavaConstructor3.initialize(emptyList, getHighSpeedVideoSizes(ownerDescriptor3));
                createJavaConstructor3.setHasStableParameterNames(z);
                createJavaConstructor3.setReturnType(ownerDescriptor3.getDefaultType());
                lazyJavaClassMemberScope.getC().getComponents().getJavaResolverCache().recordConstructor(lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges, createJavaConstructor3);
                javaClassConstructorDescriptor = createJavaConstructor3;
            }
            list2 = kotlin.collections.CollectionsKt.listOfNotNull(javaClassConstructorDescriptor);
        }
        return kotlin.collections.CollectionsKt.toList(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext, list2));
    }

    static /* synthetic */ java.util.Map getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField> fields = lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges.getFields();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fields) {
            if (((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) obj).isEnumEntry()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (java.lang.Object obj2 : arrayList2) {
            linkedHashMap.put(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRangesFor(final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = null;
        if (lazyJavaClassMemberScope.getOutputFormats.invoke().contains(name2)) {
            kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(lazyJavaClassMemberScope.getOwnerDescriptor());
            kotlin.jvm.internal.Intrinsics.checkNotNull(classId);
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass findClass = finder.findClass(new kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request(classId.createNestedClassId(name2), null, lazyJavaClassMemberScope.getHighSpeedVideoFpsRanges, 2, null));
            if (findClass != null) {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaClassMemberScope.getOwnerDescriptor(), findClass, null, 8, null);
                lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                classDescriptor = lazyJavaClassDescriptor;
            }
            return classDescriptor;
        }
        if (!lazyJavaClassMemberScope.getHighSpeedVideoSizes.invoke().contains(name2)) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField = lazyJavaClassMemberScope.getHighResolutionOutputSizeshNQ4ISI.invoke().get(name2);
            if (javaField != null) {
                classDescriptor = kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.create(lazyJavaResolverContext.getStorageManager(), lazyJavaClassMemberScope.getOwnerDescriptor(), name2, lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(lazyJavaClassMemberScope) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$9
                    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope getHighResolutionOutputSizeshNQ4ISI;

                    @Override // kotlin.jvm.functions.Function0
                    public java.lang.Object invoke() {
                        java.util.Set plus;
                        plus = kotlin.collections.SetsKt.plus((java.util.Set) r0.getFunctionNames(), (java.lang.Iterable) this.getHighResolutionOutputSizeshNQ4ISI.getVariableNames());
                        return plus;
                    }

                    {
                        this.getHighResolutionOutputSizeshNQ4ISI = lazyJavaClassMemberScope;
                    }
                }), kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaField), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaField));
            }
            return classDescriptor;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateNestedClass(lazyJavaClassMemberScope.getOwnerDescriptor(), name2, createListBuilder, lazyJavaResolverContext);
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        int size = build.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.collections.CollectionsKt.single(build);
        }
        throw new java.lang.IllegalStateException("Multiple classes with same name are generated: ".concat(java.lang.String.valueOf(build)).toString());
    }

    static /* synthetic */ boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember javaMember) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMember, "");
        return !javaMember.isStatic();
    }

    static /* synthetic */ java.util.Collection Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(simpleFunctionDescriptor.getName(), name2) ? kotlin.collections.CollectionsKt.listOf(simpleFunctionDescriptor) : kotlin.collections.CollectionsKt.plus((java.util.Collection) lazyJavaClassMemberScope.Camera2StreamConfigurationMap(name2), (java.lang.Iterable) lazyJavaClassMemberScope.getHighSpeedVideoSizes(name2));
    }

    static /* synthetic */ java.util.Collection getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return lazyJavaClassMemberScope.Camera2StreamConfigurationMap(name2);
    }

    static /* synthetic */ java.util.Collection Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return lazyJavaClassMemberScope.getHighSpeedVideoSizes(name2);
    }
}

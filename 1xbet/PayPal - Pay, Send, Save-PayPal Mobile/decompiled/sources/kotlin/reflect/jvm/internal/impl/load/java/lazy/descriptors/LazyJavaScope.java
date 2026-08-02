package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public abstract class LazyJavaScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex> getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> getOutputMinFrameDuration;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>> getOutputMinFrameDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getOutputSizes;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex computeMemberIndex();

    protected abstract void computeNonDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name2);

    protected abstract void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter();

    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getOwnerDescriptor();

    protected abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData resolveMethodSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2);

    public LazyJavaScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope lazyJavaScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        this.getHighSpeedVideoSizes = lazyJavaResolverContext;
        this.getHighSpeedVideoSizesFor = lazyJavaScope;
        this.getHighSpeedVideoFpsRanges = lazyJavaResolverContext.getStorageManager().createRecursionTolerantLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Collection computeDescriptors;
                computeDescriptors = this.Camera2StreamConfigurationMap.computeDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.ALL, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion.getALL_NAME_FILTER());
                return computeDescriptors;
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        }, kotlin.collections.CollectionsKt.emptyList());
        this.getOutputFormats = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex computeMemberIndex;
                computeMemberIndex = this.getHighSpeedVideoSizes.computeMemberIndex();
                return computeMemberIndex;
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getInputFormats = lazyJavaResolverContext.getStorageManager().createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.name.Name) obj);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getHighSpeedVideoFpsRangesFor = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$3
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.name.Name) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.getOutputMinFrameDuration = lazyJavaResolverContext.getStorageManager().createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$4
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.name.Name) obj);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        this.getInputSizeshNQ4ISI = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$5
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Set computeFunctionNames;
                computeFunctionNames = this.getHighSpeedVideoSizes.computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.FUNCTIONS, null);
                return computeFunctionNames;
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getOutputSizes = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$6
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Set computePropertyNames;
                computePropertyNames = this.getHighSpeedVideoFpsRanges.computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.VARIABLES, null);
                return computePropertyNames;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$7
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Set computeClassNames;
                computeClassNames = this.getHighResolutionOutputSizeshNQ4ISI.computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.CLASSIFIERS, null);
                return computeClassNames;
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
        this.getOutputMinFrameDurationlomOqCM = lazyJavaResolverContext.getStorageManager().createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$8
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.name.Name) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    public /* synthetic */ LazyJavaScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope lazyJavaScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i & 2) != 0 ? null : lazyJavaScope);
    }

    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getC() {
        return this.getHighSpeedVideoSizes;
    }

    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getMainScope() {
        return this.getHighSpeedVideoSizesFor;
    }

    protected final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>> getAllDescriptors() {
        return this.getHighSpeedVideoFpsRanges;
    }

    protected final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex> getDeclaredMemberIndex() {
        return this.getOutputFormats;
    }

    protected static final class MethodSignatureData {
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType Camera2StreamConfigurationMap;
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getHighSpeedVideoFpsRangesFor;
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getInputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2, boolean z, java.util.List<java.lang.String> list3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            this.getHighSpeedVideoSizes = kotlinType;
            this.Camera2StreamConfigurationMap = kotlinType2;
            this.getInputSizeshNQ4ISI = list;
            this.getHighSpeedVideoFpsRangesFor = list2;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoFpsRanges = list3;
        }

        public final kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
            return this.getHighSpeedVideoSizes;
        }

        public final kotlin.reflect.jvm.internal.impl.types.KotlinType getReceiverType() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
            return this.getInputSizeshNQ4ISI;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final boolean getHasStableParameterNames() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.util.List<java.lang.String> getErrors() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MethodSignatureData(returnType=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", receiverType=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", valueParameters=");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append(", typeParameters=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", hasStableParameterNames=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", errors=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.getHighSpeedVideoSizes.hashCode();
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.Camera2StreamConfigurationMap;
            return (((((((((hashCode * 31) + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31) + this.getInputSizeshNQ4ISI.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData methodSignatureData = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, methodSignatureData.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, methodSignatureData.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, methodSignatureData.getInputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, methodSignatureData.getHighSpeedVideoFpsRangesFor) && this.getHighResolutionOutputSizeshNQ4ISI == methodSignatureData.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, methodSignatureData.getHighSpeedVideoFpsRanges);
        }
    }

    protected final kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor resolveMethodToFunctionDescriptor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod) {
        java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> emptyMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMethod, "");
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor createJavaMethod = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(this.getHighSpeedVideoSizes, javaMethod), javaMethod.getName(), this.getHighSpeedVideoSizes.getComponents().getSourceElementFactory().source(javaMethod), this.getOutputFormats.invoke().findRecordComponentByName(javaMethod.getName()) != null && javaMethod.getValueParameters().isEmpty());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createJavaMethod, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForMethod$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForMethod$default(this.getHighSpeedVideoSizes, createJavaMethod, javaMethod, 0, 4, null);
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter> typeParameters = javaMethod.getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        java.util.Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter = childForMethod$default.getTypeParameterResolver().resolveTypeParameter((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) it.next());
            kotlin.jvm.internal.Intrinsics.checkNotNull(resolveTypeParameter);
            arrayList.add(resolveTypeParameter);
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters resolveValueParameters = resolveValueParameters(childForMethod$default, createJavaMethod, javaMethod.getValueParameters());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData resolveMethodSignature = resolveMethodSignature(javaMethod, arrayList, computeMethodReturnType(javaMethod, childForMethod$default), resolveValueParameters.getDescriptors());
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverType = resolveMethodSignature.getReceiverType();
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = receiverType != null ? kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(createJavaMethod, receiverType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY()) : null;
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> emptyList = kotlin.collections.CollectionsKt.emptyList();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = resolveMethodSignature.getTypeParameters();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = resolveMethodSignature.getValueParameters();
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = resolveMethodSignature.getReturnType();
        kotlin.reflect.jvm.internal.impl.descriptors.Modality convertFromFlags = kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion.convertFromFlags(false, javaMethod.isAbstract(), true ^ javaMethod.isFinal());
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.toDescriptorVisibility(javaMethod.getVisibility());
        if (resolveMethodSignature.getReceiverType() != null) {
            emptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, kotlin.collections.CollectionsKt.first((java.util.List) resolveValueParameters.getDescriptors())));
        } else {
            emptyMap = kotlin.collections.MapsKt.emptyMap();
        }
        createJavaMethod.initialize(createExtensionReceiverParameterForCallable, dispatchReceiverParameter, emptyList, typeParameters2, valueParameters, returnType, convertFromFlags, descriptorVisibility, emptyMap);
        createJavaMethod.setParameterNamesStatus(resolveMethodSignature.getHasStableParameterNames(), resolveValueParameters.getHasSynthesizedNames());
        if (!resolveMethodSignature.getErrors().isEmpty()) {
            childForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(createJavaMethod, resolveMethodSignature.getErrors());
        }
        return createJavaMethod;
    }

    protected final kotlin.reflect.jvm.internal.impl.types.KotlinType computeMethodReturnType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        return lazyJavaResolverContext.getTypeResolver().transformJavaType(javaMethod.getReturnType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, javaMethod.getContainingClass().isAnnotationType(), false, null, 6, null));
    }

    protected static final class ResolvedValueParameters {
        private final boolean Camera2StreamConfigurationMap;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighResolutionOutputSizeshNQ4ISI = list;
            this.Camera2StreamConfigurationMap = z;
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getDescriptors() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean getHasSynthesizedNames() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters resolveValueParameters(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> list) {
        kotlin.Pair pair;
        kotlin.reflect.jvm.internal.impl.name.Name name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.CollectionsKt.withIndex(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10));
        boolean z = false;
        for (kotlin.collections.IndexedValue indexedValue : withIndex) {
            int index = indexedValue.getIndex();
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter javaValueParameter = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter) indexedValue.component2();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations resolveAnnotations = kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaValueParameter);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attributes$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, false, null, 7, null);
            if (javaValueParameter.isVararg()) {
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType type = javaValueParameter.getType();
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType javaArrayType = type instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType ? (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new java.lang.AssertionError("Vararg parameter should be an array: ".concat(java.lang.String.valueOf(javaValueParameter)));
                }
                kotlin.reflect.jvm.internal.impl.types.KotlinType transformArrayType = lazyJavaResolverContext.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                pair = kotlin.TuplesKt.to(transformArrayType, lazyJavaResolverContext.getModule().getBuiltIns().getArrayElementType(transformArrayType));
            } else {
                pair = kotlin.TuplesKt.to(lazyJavaResolverContext.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component1();
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component2();
            if (kotlin.jvm.internal.Intrinsics.areEqual(functionDescriptor.getName().asString(), "equals") && list.size() == 1 && kotlin.jvm.internal.Intrinsics.areEqual(lazyJavaResolverContext.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("other");
            } else {
                name2 = javaValueParameter.getName();
                if (name2 == null) {
                    z = true;
                }
                if (name2 == null) {
                    name2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("p".concat(java.lang.String.valueOf(index)));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                }
            }
            kotlin.reflect.jvm.internal.impl.name.Name name3 = name2;
            kotlin.jvm.internal.Intrinsics.checkNotNull(name3);
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(functionDescriptor, null, index, resolveAnnotations, name3, kotlinType, false, false, false, kotlinType2, lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaValueParameter)));
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters(kotlin.collections.CollectionsKt.toList(arrayList), z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return !getFunctionNames().contains(name2) ? kotlin.collections.CollectionsKt.emptyList() : this.getOutputMinFrameDuration.invoke(name2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return !getVariableNames().contains(name2) ? kotlin.collections.CollectionsKt.emptyList() : this.getOutputMinFrameDurationlomOqCM.invoke(name2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return this.getHighSpeedVideoFpsRanges.invoke();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> computeDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation noLookupLocation = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : computeClassNames(descriptorKindFilter, function1)) {
                if (function1.invoke(name2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(linkedHashSet, mo23899getContributedClassifier(name2, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !descriptorKindFilter.getExcludes().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name3 : computeFunctionNames(descriptorKindFilter, function1)) {
                if (function1.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(name3, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !descriptorKindFilter.getExcludes().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name4 : computePropertyNames(descriptorKindFilter, function1)) {
                if (function1.invoke(name4).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(name4, noLookupLocation));
                }
            }
        }
        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Lazy scope for ");
        sb.append(getOwnerDescriptor());
        return sb.toString();
    }

    static /* synthetic */ java.util.Collection getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope lazyJavaScope, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope lazyJavaScope2 = lazyJavaScope.getHighSpeedVideoSizesFor;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.getInputFormats.invoke(name2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod : lazyJavaScope.getOutputFormats.invoke().findMethodsByName(name2)) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor resolveMethodToFunctionDescriptor = lazyJavaScope.resolveMethodToFunctionDescriptor(javaMethod);
            if (lazyJavaScope.isVisibleAsFunction(resolveMethodToFunctionDescriptor)) {
                lazyJavaScope.getHighSpeedVideoSizes.getComponents().getJavaResolverCache().recordMethod(javaMethod, resolveMethodToFunctionDescriptor);
                arrayList.add(resolveMethodToFunctionDescriptor);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        lazyJavaScope.computeImplicitlyDeclaredFunctions(arrayList2, name2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getHighSpeedVideoFpsRangesFor(final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope lazyJavaScope, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope lazyJavaScope2 = lazyJavaScope.getHighSpeedVideoSizesFor;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.getHighSpeedVideoFpsRangesFor.invoke(name2);
        }
        final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField findFieldByName = lazyJavaScope.getOutputFormats.invoke().findFieldByName(name2);
        if (findFieldByName == null || findFieldByName.isEnumEntry()) {
            return null;
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor create = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor.create(lazyJavaScope.getOwnerDescriptor(), kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaScope.getHighSpeedVideoSizes, findFieldByName), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.toDescriptorVisibility(findFieldByName.getVisibility()), !findFieldByName.isFinal(), findFieldByName.getName(), lazyJavaScope.getHighSpeedVideoSizes.getComponents().getSourceElementFactory().source(findFieldByName), findFieldByName.isFinal() && findFieldByName.isStatic());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        objectRef.element = create;
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl) objectRef.element).initialize(null, null, null, null);
        kotlin.reflect.jvm.internal.impl.types.KotlinType transformJavaType = lazyJavaScope.getHighSpeedVideoSizes.getTypeResolver().transformJavaType(findFieldByName.getType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, false, null, 7, null));
        if ((kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType(transformJavaType) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(transformJavaType)) && findFieldByName.isFinal() && findFieldByName.isStatic() && findFieldByName.getHasConstantNotNullInitializer()) {
            transformJavaType = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(transformJavaType);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transformJavaType, "");
        }
        ((kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl) objectRef.element).setType(transformJavaType, kotlin.collections.CollectionsKt.emptyList(), lazyJavaScope.getDispatchReceiverParameter(), null, kotlin.collections.CollectionsKt.emptyList());
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor ownerDescriptor = lazyJavaScope.getOwnerDescriptor();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = ownerDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) ownerDescriptor : null;
        if (classDescriptor != null) {
            objectRef.element = lazyJavaScope.getHighSpeedVideoSizes.getComponents().getSyntheticPartsProvider().modifyField(classDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl) objectRef.element, lazyJavaScope.getHighSpeedVideoSizes);
        }
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.shouldRecordInitializerForProperty((kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor) objectRef.element, ((kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl) objectRef.element).getType())) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl) objectRef.element).setCompileTimeInitializerFactory(new kotlin.jvm.functions.Function0(lazyJavaScope, findFieldByName, objectRef) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$10
                private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField getHighResolutionOutputSizeshNQ4ISI;
                private final kotlin.jvm.internal.Ref.ObjectRef getHighSpeedVideoFpsRanges;
                private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue createNullableLazyValue;
                    createNullableLazyValue = r0.getHighSpeedVideoSizes.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$11
                        private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField Camera2StreamConfigurationMap;
                        private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope getHighResolutionOutputSizeshNQ4ISI;
                        private final kotlin.jvm.internal.Ref.ObjectRef getHighSpeedVideoFpsRangesFor;

                        @Override // kotlin.jvm.functions.Function0
                        public java.lang.Object invoke() {
                            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue initializerConstant;
                            initializerConstant = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) this.getHighSpeedVideoFpsRangesFor.element);
                            return initializerConstant;
                        }

                        {
                            this.getHighResolutionOutputSizeshNQ4ISI = r1;
                            this.Camera2StreamConfigurationMap = r2;
                            this.getHighSpeedVideoFpsRangesFor = r3;
                        }
                    });
                    return createNullableLazyValue;
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = lazyJavaScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = findFieldByName;
                    this.getHighSpeedVideoFpsRanges = objectRef;
                }
            });
        }
        lazyJavaScope.getHighSpeedVideoSizes.getComponents().getJavaResolverCache().recordField(findFieldByName, (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) objectRef.element);
        return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) objectRef.element;
    }

    static /* synthetic */ java.util.Collection Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope lazyJavaScope, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(lazyJavaScope.getInputFormats.invoke(name2));
        java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : linkedHashSet2) {
            java.lang.String computeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj, false, false, 2, null);
            java.lang.Object obj2 = linkedHashMap.get(computeJvmDescriptor$default);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(computeJvmDescriptor$default, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        for (java.util.List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                java.util.List list2 = list;
                java.util.Collection selectMostSpecificInEachOverridableGroup = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$9
                    @Override // kotlin.jvm.functions.Function1
                    public java.lang.Object invoke(java.lang.Object obj3) {
                        return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj3);
                    }
                });
                linkedHashSet2.removeAll(list2);
                linkedHashSet2.addAll(selectMostSpecificInEachOverridableGroup);
            }
        }
        java.util.LinkedHashSet linkedHashSet3 = linkedHashSet;
        lazyJavaScope.computeNonDeclaredFunctions(linkedHashSet3, name2);
        return kotlin.collections.CollectionsKt.toList(lazyJavaScope.getHighSpeedVideoSizes.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaScope.getHighSpeedVideoSizes, linkedHashSet3));
    }

    static /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope lazyJavaScope, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList2, lazyJavaScope.getHighSpeedVideoFpsRangesFor.invoke(name2));
        lazyJavaScope.computeNonDeclaredProperties(name2, arrayList2);
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isAnnotationClass(lazyJavaScope.getOwnerDescriptor()) ? kotlin.collections.CollectionsKt.toList(arrayList) : kotlin.collections.CollectionsKt.toList(lazyJavaScope.getHighSpeedVideoSizes.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaScope.getHighSpeedVideoSizes, arrayList2));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
        return simpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighResolutionOutputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) Camera2StreamConfigurationMap[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getInputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) Camera2StreamConfigurationMap[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        return (java.util.Set) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getOutputSizes, this, (kotlin.reflect.KProperty<?>) Camera2StreamConfigurationMap[1]);
    }

    protected boolean isVisibleAsFunction(kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMethodDescriptor, "");
        return true;
    }

    protected void computeImplicitlyDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
    }
}

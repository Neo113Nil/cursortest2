package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public final class TypeAliasConstructorDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor {
    private kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getHighSpeedVideoSizes;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion Companion = new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion(null);

    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getTypeAliasDescriptor() {
        return this.getHighSpeedVideoSizes;
    }

    private TypeAliasConstructorDescriptorImpl(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(typeAliasDescriptor, typeAliasConstructorDescriptor, annotations, kotlin.reflect.jvm.internal.impl.name.SpecialNames.INIT, kind, sourceElement);
        this.getHighSpeedVideoFpsRanges = storageManager;
        this.getHighSpeedVideoSizes = typeAliasDescriptor;
        setActual(getTypeAliasDescriptor().isActual());
        this.getHighSpeedVideoFpsRangesFor = storageManager.createNullableLazyValue(new kotlin.jvm.functions.Function0(this, classConstructorDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
                this.getHighResolutionOutputSizeshNQ4ISI = classConstructorDescriptor;
            }
        });
        this.Camera2StreamConfigurationMap = classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor getUnderlyingConstructorDescriptor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final boolean isPrimary() {
        return getUnderlyingConstructorDescriptor().isPrimary();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getContainingDeclaration() {
        return getTypeAliasDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getConstructedClass() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor constructedClass = getUnderlyingConstructorDescriptor().getConstructedClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructedClass, "");
        return constructedClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = super.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
        return returnType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original = super.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkNotNull(original, "");
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor) original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor substitute = super.substitute(typeSubstitutor);
        kotlin.jvm.internal.Intrinsics.checkNotNull(substitute, "");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl) substitute;
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(typeAliasConstructorDescriptorImpl.getReturnType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor substitute2 = getUnderlyingConstructorDescriptor().getOriginal().substitute(create);
        if (substitute2 == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.Camera2StreamConfigurationMap = substitute2;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modality, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorVisibility, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor build = newCopyBuilder().setOwner(declarationDescriptor).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z).build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build, "");
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor) build;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl createSubstitutedCopy(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        if (kind != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind2 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl(this.getHighSpeedVideoFpsRanges, getTypeAliasDescriptor(), getUnderlyingConstructorDescriptor(), this, annotations, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
    }

    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor access$getTypeSubstitutorForUnderlyingClass(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion companion, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor) {
            if (typeAliasDescriptor.getClassDescriptor() == null) {
                return null;
            }
            return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(typeAliasDescriptor.getExpandedType());
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor createIfAvailable(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor substitute;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> emptyList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAliasDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classConstructorDescriptor, "");
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create = typeAliasDescriptor.getClassDescriptor() == null ? null : kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(typeAliasDescriptor.getExpandedType());
            if (create == null || (substitute = classConstructorDescriptor.substitute(create)) == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = classConstructorDescriptor.getAnnotations();
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = classConstructorDescriptor.getKind();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kind, "");
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = typeAliasDescriptor.getSource();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(source, "");
            kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, substitute, null, annotations, kind, source, null);
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> substitutedValueParameters = kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.getSubstitutedValueParameters(typeAliasConstructorDescriptorImpl, classConstructorDescriptor.getValueParameters(), create);
            if (substitutedValueParameters == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType lowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(substitute.getReturnType().unwrap());
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = typeAliasDescriptor.getDefaultType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
            kotlin.reflect.jvm.internal.impl.types.SimpleType withAbbreviation = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.withAbbreviation(lowerIfFlexible, defaultType);
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = classConstructorDescriptor.getDispatchReceiverParameter();
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = dispatchReceiverParameter != null ? kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(typeAliasConstructorDescriptorImpl, create.safeSubstitute(dispatchReceiverParameter.getType(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY()) : null;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = typeAliasDescriptor.getClassDescriptor();
            if (classDescriptor != null) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceiverParameters = classConstructorDescriptor.getContextReceiverParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list = contextReceiverParameters;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                int i = 0;
                for (java.lang.Object obj : list) {
                    if (i < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) obj;
                    kotlin.reflect.jvm.internal.impl.types.KotlinType safeSubstitute = create.safeSubstitute(receiverParameterDescriptor.getType(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue value = receiverParameterDescriptor.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                    arrayList.add(kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createContextReceiverParameterForClass(classDescriptor, safeSubstitute, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver) value).getCustomLabelName(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), i));
                    i++;
                }
                emptyList = arrayList;
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            typeAliasConstructorDescriptorImpl.initialize(createExtensionReceiverParameterForCallable, null, emptyList, typeAliasDescriptor.getDeclaredTypeParameters(), substitutedValueParameters, withAbbreviation, kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, typeAliasDescriptor.getVisibility());
            return typeAliasConstructorDescriptorImpl;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = classConstructorDescriptor.getAnnotations();
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind = classConstructorDescriptor.getKind();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(kind, "");
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor().getSource();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(source, "");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl(typeAliasConstructorDescriptorImpl.getHighSpeedVideoFpsRanges, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor(), classConstructorDescriptor, typeAliasConstructorDescriptorImpl, annotations, kind, source);
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor access$getTypeSubstitutorForUnderlyingClass = kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion.access$getTypeSubstitutorForUnderlyingClass(Companion, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor());
        if (access$getTypeSubstitutorForUnderlyingClass == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = classConstructorDescriptor.getDispatchReceiverParameter();
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor substitute = dispatchReceiverParameter != null ? dispatchReceiverParameter.substitute(access$getTypeSubstitutorForUnderlyingClass) : null;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceiverParameters = classConstructorDescriptor.getContextReceiverParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list = contextReceiverParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) it.next()).substitute(access$getTypeSubstitutorForUnderlyingClass));
        }
        typeAliasConstructorDescriptorImpl2.initialize(null, substitute, arrayList, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor().getDeclaredTypeParameters(), typeAliasConstructorDescriptorImpl.getValueParameters(), typeAliasConstructorDescriptorImpl.getReturnType(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor().getVisibility());
        return typeAliasConstructorDescriptorImpl2;
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind kind, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptor, annotations, kind, sourceElement);
    }
}

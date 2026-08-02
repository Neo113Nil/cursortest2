package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class AbstractTypeAliasDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl implements kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1 Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoFpsRanges;
    private java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getHighSpeedVideoSizesFor;

    protected abstract java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeConstructorTypeParameters();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        super(declarationDescriptor, annotations, name2, sourceElement);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorVisibility, "");
        this.getHighResolutionOutputSizeshNQ4ISI = storageManager;
        this.getHighSpeedVideoSizesFor = descriptorVisibility;
        this.getHighSpeedVideoFpsRanges = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Collection typeAliasConstructors;
                typeAliasConstructors = this.getHighSpeedVideoFpsRanges.getTypeAliasConstructors();
                return typeAliasConstructors;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.types.TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final boolean isDenotable() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* renamed from: getDeclarationDescriptor */
            public final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor mo23898getDeclarationDescriptor() {
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.this.getTypeConstructorTypeParameters();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes() {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = mo23898getDeclarationDescriptor().getUnderlyingType().getConstructor().getSupertypes();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
                return supertypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(mo23898getDeclarationDescriptor());
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("[typealias ");
                sb.append(mo23898getDeclarationDescriptor().getName().asString());
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
                return this;
            }
        };
    }

    protected final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void initialize(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptorVisitor, "");
        return declarationDescriptorVisitor.visitTypeAliasDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(getUnderlyingType(), new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor> getTypeAliasConstructors() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructors, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(classConstructorDescriptor);
            kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor createIfAvailable = kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion.createIfAvailable(this.getHighResolutionOutputSizeshNQ4ISI, this, classConstructorDescriptor);
            if (createIfAvailable != null) {
                arrayList.add(createIfAvailable);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        java.util.List list = this.getHighSpeedVideoSizes;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("typealias ");
        sb.append(getName().asString());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource original = super.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkNotNull(original, "");
        return (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) original;
    }

    protected final kotlin.reflect.jvm.internal.impl.types.SimpleType computeDefaultType() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty empty;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = this;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null || (empty = classDescriptor.getUnsubstitutedMemberScope()) == null) {
            empty = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType makeUnsubstitutedType = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeUnsubstitutedType(abstractTypeAliasDescriptor, empty, (kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.SimpleType>) new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeUnsubstitutedType, "");
        return makeUnsubstitutedType;
    }

    static /* synthetic */ java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNull(unwrappedType);
        if (!kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(unwrappedType)) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = unwrappedType.getConstructor().mo23898getDeclarationDescriptor();
            if ((mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && !kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor).getContainingDeclaration(), abstractTypeAliasDescriptor)) {
                z = true;
                return java.lang.Boolean.valueOf(z);
            }
        }
        z = false;
        return java.lang.Boolean.valueOf(z);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor refineDescriptor = kotlinTypeRefiner.refineDescriptor(abstractTypeAliasDescriptor);
        if (refineDescriptor != null) {
            return refineDescriptor.getDefaultType();
        }
        return null;
    }
}

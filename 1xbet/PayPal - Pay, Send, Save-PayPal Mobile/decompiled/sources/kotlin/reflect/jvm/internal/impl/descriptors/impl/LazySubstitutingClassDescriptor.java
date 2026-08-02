package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class LazySubstitutingClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor {
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor Camera2StreamConfigurationMap;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.types.TypeConstructor getHighSpeedVideoSizes;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getInputFormats;

    public LazySubstitutingClassDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor moduleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        this.getHighSpeedVideoFpsRangesFor = moduleAwareClassDescriptor;
        this.Camera2StreamConfigurationMap = typeSubstitutor;
    }

    private kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            if (this.Camera2StreamConfigurationMap.isEmpty()) {
                this.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap;
            } else {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = this.getHighSpeedVideoFpsRangesFor.getTypeConstructor().getParameters();
                this.getInputFormats = new java.util.ArrayList(parameters.size());
                this.getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor.substituteTypeParameters(parameters, this.Camera2StreamConfigurationMap.getSubstitution(), this, this.getInputFormats);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.filter(this.getInputFormats, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
                        return java.lang.Boolean.valueOf(!typeParameterDescriptor.isCapturedFromOuterDeclaration());
                    }
                });
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.getHighSpeedVideoFpsRangesFor.getTypeConstructor();
        if (this.Camera2StreamConfigurationMap.isEmpty()) {
            if (typeConstructor == null) {
                getHighSpeedVideoFpsRangesFor(0);
            }
            return typeConstructor;
        }
        if (this.getHighSpeedVideoSizes == null) {
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = typeConstructor.getSupertypes();
            java.util.ArrayList arrayList = new java.util.ArrayList(supertypes.size());
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(highSpeedVideoFpsRangesFor.substitute(it.next(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT));
            }
            this.getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl(this, this.getInputFormats, arrayList, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = this.getHighSpeedVideoSizes;
        if (typeConstructor2 == null) {
            getHighSpeedVideoFpsRangesFor(1);
        }
        return typeConstructor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            getHighSpeedVideoFpsRangesFor(5);
        }
        if (kotlinTypeRefiner == null) {
            getHighSpeedVideoFpsRangesFor(6);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = this.getHighSpeedVideoFpsRangesFor.getMemberScope(typeSubstitution, kotlinTypeRefiner);
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope(memberScope, getHighSpeedVideoFpsRangesFor());
        }
        if (memberScope == null) {
            getHighSpeedVideoFpsRangesFor(7);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            getHighSpeedVideoFpsRangesFor(10);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = getMemberScope(typeSubstitution, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getKotlinTypeRefiner(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(this)));
        if (memberScope == null) {
            getHighSpeedVideoFpsRangesFor(11);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getKotlinTypeRefiner(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(this.getHighSpeedVideoFpsRangesFor)));
        if (unsubstitutedMemberScope == null) {
            getHighSpeedVideoFpsRangesFor(12);
        }
        return unsubstitutedMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            getHighSpeedVideoFpsRangesFor(13);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = this.getHighSpeedVideoFpsRangesFor.getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope(unsubstitutedMemberScope, getHighSpeedVideoFpsRangesFor());
        }
        if (unsubstitutedMemberScope == null) {
            getHighSpeedVideoFpsRangesFor(14);
        }
        return unsubstitutedMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope staticScope = this.getHighSpeedVideoFpsRangesFor.getStaticScope();
        if (staticScope == null) {
            getHighSpeedVideoFpsRangesFor(15);
        }
        return staticScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeWithNonTrivialMemberScope = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator.INSTANCE.toAttributes(getAnnotations(), null, null), getTypeConstructor(), kotlin.reflect.jvm.internal.impl.types.TypeUtils.getDefaultTypeProjections(getTypeConstructor().getParameters()), false, getUnsubstitutedMemberScope());
        if (simpleTypeWithNonTrivialMemberScope == null) {
            getHighSpeedVideoFpsRangesFor(16);
        }
        return simpleTypeWithNonTrivialMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getThisAsReceiverParameter() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceivers() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighSpeedVideoFpsRangesFor(17);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = this.getHighSpeedVideoFpsRangesFor.getConstructors();
        java.util.ArrayList arrayList = new java.util.ArrayList(constructors.size());
        for (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) classConstructorDescriptor.newCopyBuilder().setOriginal(classConstructorDescriptor.getOriginal()).setModality(classConstructorDescriptor.getModality()).setVisibility(classConstructorDescriptor.getVisibility()).setKind(classConstructorDescriptor.getKind()).setCopyOverrides(false).build()).substitute(getHighSpeedVideoFpsRangesFor()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = this.getHighSpeedVideoFpsRangesFor.getAnnotations();
        if (annotations == null) {
            getHighSpeedVideoFpsRangesFor(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name name2 = this.getHighSpeedVideoFpsRangesFor.getName();
        if (name2 == null) {
            getHighSpeedVideoFpsRangesFor(20);
        }
        return name2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor original = this.getHighSpeedVideoFpsRangesFor.getOriginal();
        if (original == null) {
            getHighSpeedVideoFpsRangesFor(21);
        }
        return original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.getHighSpeedVideoFpsRangesFor.getContainingDeclaration();
        if (containingDeclaration == null) {
            getHighSpeedVideoFpsRangesFor(22);
        }
        return containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            getHighSpeedVideoFpsRangesFor(23);
        }
        return typeSubstitutor.isEmpty() ? this : new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor(this, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.createChainedSubstitutor(typeSubstitutor.getSubstitution(), getHighSpeedVideoFpsRangesFor().getSubstitution()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor() {
        return this.getHighSpeedVideoFpsRangesFor.mo23888getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind = this.getHighSpeedVideoFpsRangesFor.getKind();
        if (kind == null) {
            getHighSpeedVideoFpsRangesFor(25);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = this.getHighSpeedVideoFpsRangesFor.getModality();
        if (modality == null) {
            getHighSpeedVideoFpsRangesFor(26);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = this.getHighSpeedVideoFpsRangesFor.getVisibility();
        if (visibility == null) {
            getHighSpeedVideoFpsRangesFor(27);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.getHighSpeedVideoFpsRangesFor.isInner();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return this.getHighSpeedVideoFpsRangesFor.isData();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.getHighSpeedVideoFpsRangesFor.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return this.getHighSpeedVideoFpsRangesFor.isFun();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return this.getHighSpeedVideoFpsRangesFor.isValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.getHighSpeedVideoFpsRangesFor.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return this.getHighSpeedVideoFpsRangesFor.isCompanionObject();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.getHighSpeedVideoFpsRangesFor.isExpect();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.getHighSpeedVideoFpsRangesFor.isActual();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedInnerClassesScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = this.getHighSpeedVideoFpsRangesFor.getUnsubstitutedInnerClassesScope();
        if (unsubstitutedInnerClassesScope == null) {
            getHighSpeedVideoFpsRangesFor(28);
        }
        return unsubstitutedInnerClassesScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor() {
        return this.getHighSpeedVideoFpsRangesFor.mo23889getUnsubstitutedPrimaryConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        if (sourceElement == null) {
            getHighSpeedVideoFpsRangesFor(29);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        getHighSpeedVideoFpsRangesFor();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (list == null) {
            getHighSpeedVideoFpsRangesFor(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getValueClassRepresentation() {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> valueClassRepresentation = this.getHighSpeedVideoFpsRangesFor.getValueClassRepresentation();
        if (valueClassRepresentation == null) {
            return null;
        }
        return valueClassRepresentation.mapUnderlyingType(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.2
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType invoke(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.this, simpleType);
            }
        });
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor lazySubstitutingClassDescriptor, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        return (simpleType == null || lazySubstitutingClassDescriptor.Camera2StreamConfigurationMap.isEmpty()) ? simpleType : (kotlin.reflect.jvm.internal.impl.types.SimpleType) lazySubstitutingClassDescriptor.getHighSpeedVideoFpsRangesFor().substitute(simpleType, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
        java.lang.String format;
        java.lang.String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 13) {
                                    if (i != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i) {
                                        case 2:
                                        case 3:
                                        case 5:
                                        case 6:
                                        case 8:
                                        case 10:
                                        case 13:
                                        case 23:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case 4:
                                        case 7:
                                        case 9:
                                        case 11:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case 14:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case 15:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case 16:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case 17:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case 20:
                                            objArr[1] = "getName";
                                            break;
                                        case 21:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case 22:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case 24:
                                            objArr[1] = "substitute";
                                            break;
                                        case 25:
                                            objArr[1] = "getKind";
                                            break;
                                        case 26:
                                            objArr[1] = "getModality";
                                            break;
                                        case 27:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case 30:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case 31:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i != 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
                                        objArr[2] = "getMemberScope";
                                    } else if (i == 13) {
                                        objArr[2] = "getUnsubstitutedMemberScope";
                                    } else if (i == 23) {
                                        objArr[2] = "substitute";
                                    }
                                    format = java.lang.String.format(str, objArr);
                                    if (i == 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
                                        throw new java.lang.IllegalStateException(format);
                                    }
                                    throw new java.lang.IllegalArgumentException(format);
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i) {
                }
                if (i != 2) {
                }
                objArr[2] = "getMemberScope";
                format = java.lang.String.format(str, objArr);
                if (i == 2) {
                }
                throw new java.lang.IllegalArgumentException(format);
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i) {
            }
            if (i != 2) {
            }
            objArr[2] = "getMemberScope";
            format = java.lang.String.format(str, objArr);
            if (i == 2) {
            }
            throw new java.lang.IllegalArgumentException(format);
        }
        objArr[0] = "typeArguments";
        switch (i) {
        }
        if (i != 2) {
        }
        objArr[2] = "getMemberScope";
        format = java.lang.String.format(str, objArr);
        if (i == 2) {
        }
        throw new java.lang.IllegalArgumentException(format);
    }
}

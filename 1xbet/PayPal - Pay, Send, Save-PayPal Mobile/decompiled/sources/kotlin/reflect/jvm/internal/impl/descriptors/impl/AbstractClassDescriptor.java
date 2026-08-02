package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class AbstractClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor {
    private final kotlin.reflect.jvm.internal.impl.name.Name Camera2StreamConfigurationMap;
    protected final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.types.SimpleType> defaultType;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getOriginal() {
        return this;
    }

    public AbstractClassDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        if (storageManager == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        if (name2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        this.Camera2StreamConfigurationMap = name2;
        this.defaultType = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.1
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor abstractClassDescriptor = kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.this;
                return kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeUnsubstitutedType(abstractClassDescriptor, abstractClassDescriptor.getUnsubstitutedMemberScope(), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType invoke(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
                        kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner2 = kotlinTypeRefiner;
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor refineDescriptor = kotlinTypeRefiner2.refineDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.this);
                        if (refineDescriptor == null) {
                            return kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.this.defaultType.invoke();
                        }
                        if (refineDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
                            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.computeExpandedType((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) refineDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeUtils.getDefaultTypeProjections(refineDescriptor.getTypeConstructor().getParameters()));
                        }
                        if (refineDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor) {
                            return kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeUnsubstitutedType(refineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner2), ((kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor) refineDescriptor).getUnsubstitutedMemberScope(kotlinTypeRefiner2), this);
                        }
                        return refineDescriptor.getDefaultType();
                    }
                });
            }
        });
        this.getHighSpeedVideoSizes = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.2
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope invoke() {
                return new kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.this.getUnsubstitutedMemberScope());
            }
        });
        this.getHighSpeedVideoFpsRanges = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.3
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor invoke() {
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyClassReceiverParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.this);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name name2 = this.Camera2StreamConfigurationMap;
        if (name2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(2);
        }
        return name2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedInnerClassesScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope invoke = this.getHighSpeedVideoSizes.invoke();
        if (invoke == null) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getThisAsReceiverParameter() {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor invoke = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke == null) {
            getHighResolutionOutputSizeshNQ4ISI(5);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> getContextReceivers() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            getHighResolutionOutputSizeshNQ4ISI(6);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            getHighResolutionOutputSizeshNQ4ISI(10);
        }
        if (kotlinTypeRefiner == null) {
            getHighResolutionOutputSizeshNQ4ISI(11);
        }
        if (!typeSubstitution.isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope(getUnsubstitutedMemberScope(kotlinTypeRefiner), kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(typeSubstitution));
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (unsubstitutedMemberScope == null) {
            getHighResolutionOutputSizeshNQ4ISI(12);
        }
        return unsubstitutedMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            getHighResolutionOutputSizeshNQ4ISI(15);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = getMemberScope(typeSubstitution, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getKotlinTypeRefiner(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(this)));
        if (memberScope == null) {
            getHighResolutionOutputSizeshNQ4ISI(16);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getKotlinTypeRefiner(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(this)));
        if (unsubstitutedMemberScope == null) {
            getHighResolutionOutputSizeshNQ4ISI(17);
        }
        return unsubstitutedMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            getHighResolutionOutputSizeshNQ4ISI(18);
        }
        return typeSubstitutor.isEmpty() ? this : new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType invoke = this.defaultType.invoke();
        if (invoke == null) {
            getHighResolutionOutputSizeshNQ4ISI(20);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d);
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}

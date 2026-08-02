package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class AbstractTypeParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl implements kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor {
    private final int Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.types.SimpleType> getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.types.TypeConstructor> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.types.Variance getHighSpeedVideoSizesFor;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return false;
    }

    /* renamed from: reportSupertypeLoopError */
    protected abstract void mo23900reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType);

    protected abstract java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> resolveUpperBounds();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractTypeParameterDescriptor(final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, final kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.types.Variance variance, boolean z, int i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name2, sourceElement);
        if (storageManager == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        if (declarationDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(1);
        }
        if (annotations == null) {
            getHighResolutionOutputSizeshNQ4ISI(2);
        }
        if (name2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        if (variance == null) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        if (sourceElement == null) {
            getHighResolutionOutputSizeshNQ4ISI(5);
        }
        if (supertypeLoopChecker == null) {
            getHighResolutionOutputSizeshNQ4ISI(6);
        }
        this.getHighSpeedVideoSizesFor = variance;
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.TypeConstructor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.1
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeConstructor invoke() {
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.TypeParameterTypeConstructor(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.this, storageManager, supertypeLoopChecker);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.2
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType invoke() {
                return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty(), kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.this.getTypeConstructor(), java.util.Collections.emptyList(), false, new kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.2.1
                    @Override // kotlin.jvm.functions.Function0
                    public /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope invoke() {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scope for type parameter ");
                        sb.append(name2.asString());
                        return kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.create(sb.toString(), kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.this.getUpperBounds());
                    }
                }));
            }
        });
        this.getHighSpeedVideoSizes = storageManager;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public kotlin.reflect.jvm.internal.impl.types.Variance getVariance() {
        kotlin.reflect.jvm.internal.impl.types.Variance variance = this.getHighSpeedVideoSizesFor;
        if (variance == null) {
            getHighResolutionOutputSizeshNQ4ISI(7);
        }
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getUpperBounds() {
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor.TypeParameterTypeConstructor) getTypeConstructor()).getSupertypes();
        if (supertypes == null) {
            getHighResolutionOutputSizeshNQ4ISI(8);
        }
        return supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor invoke = this.getHighSpeedVideoFpsRangesFor.invoke();
        if (invoke == null) {
            getHighResolutionOutputSizeshNQ4ISI(9);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        if (invoke == null) {
            getHighResolutionOutputSizeshNQ4ISI(10);
        }
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) super.getOriginal();
        if (typeParameterDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(11);
        }
        return typeParameterDescriptor;
    }

    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> processBoundsWithoutCycles(java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list) {
        if (list == null) {
            getHighResolutionOutputSizeshNQ4ISI(12);
        }
        if (list == null) {
            getHighResolutionOutputSizeshNQ4ISI(13);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitTypeParameterDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = this.getHighSpeedVideoSizes;
        if (storageManager == null) {
            getHighResolutionOutputSizeshNQ4ISI(14);
        }
        return storageManager;
    }

    class TypeParameterTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getHighSpeedVideoFpsRanges;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeParameterTypeConstructor(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker) {
            super(storageManager);
            if (storageManager == null) {
                Camera2StreamConfigurationMap(0);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = abstractTypeParameterDescriptor;
            this.getHighSpeedVideoFpsRanges = supertypeLoopChecker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes() {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> resolveUpperBounds = this.getHighResolutionOutputSizeshNQ4ISI.resolveUpperBounds();
            if (resolveUpperBounds == null) {
                Camera2StreamConfigurationMap(1);
            }
            return resolveUpperBounds;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> emptyList = java.util.Collections.emptyList();
            if (emptyList == null) {
                Camera2StreamConfigurationMap(2);
            }
            return emptyList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.getHighResolutionOutputSizeshNQ4ISI;
            if (abstractTypeParameterDescriptor == null) {
                Camera2StreamConfigurationMap(3);
            }
            return abstractTypeParameterDescriptor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(this.getHighResolutionOutputSizeshNQ4ISI);
            if (builtIns == null) {
                Camera2StreamConfigurationMap(4);
            }
            return builtIns;
        }

        public java.lang.String toString() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getName().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
            kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker = this.getHighSpeedVideoFpsRanges;
            if (supertypeLoopChecker == null) {
                Camera2StreamConfigurationMap(5);
            }
            return supertypeLoopChecker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public void reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
            if (kotlinType == null) {
                Camera2StreamConfigurationMap(6);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.mo23900reportSupertypeLoopError(kotlinType);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> processSupertypesWithoutCycles(java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list) {
            if (list == null) {
                Camera2StreamConfigurationMap(7);
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> processBoundsWithoutCycles = this.getHighResolutionOutputSizeshNQ4ISI.processBoundsWithoutCycles(list);
            if (processBoundsWithoutCycles == null) {
                Camera2StreamConfigurationMap(8);
            }
            return processBoundsWithoutCycles;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public kotlin.reflect.jvm.internal.impl.types.KotlinType defaultSupertypeIfEmpty() {
            return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new java.lang.String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
        public boolean isSameClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
            if (classifierDescriptor == null) {
                Camera2StreamConfigurationMap(9);
            }
            return (classifierDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptor, true);
        }

        private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
            java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new java.lang.IllegalArgumentException(format);
            }
            throw new java.lang.IllegalStateException(format);
        }
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new java.lang.IllegalStateException(format);
            case 12:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}

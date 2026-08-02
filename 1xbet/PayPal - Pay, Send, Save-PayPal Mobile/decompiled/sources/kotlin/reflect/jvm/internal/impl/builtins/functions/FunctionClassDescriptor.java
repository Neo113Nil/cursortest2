package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* loaded from: classes5.dex */
public final class FunctionClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor {
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoFpsRangesFor;
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoSizes;
    private final int Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.FunctionTypeConstructor getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassScope getInputFormats;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getOutputMinFrameDuration;

    public final java.lang.Void getCompanionObjectDescriptor() {
        return null;
    }

    public final java.lang.Void getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean isInner() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isValue() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) getUnsubstitutedPrimaryConstructor();
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind getFunctionTypeKind() {
        return this.getOutputFormats;
    }

    public final int getArity() {
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind functionTypeKind, int i) {
        super(storageManager, functionTypeKind.numberedClassName(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionTypeKind, "");
        this.getOutputMinFrameDuration = storageManager;
        this.getHighSpeedVideoFpsRanges = packageFragmentDescriptor;
        this.getOutputFormats = functionTypeKind;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizesFor = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.FunctionTypeConstructor();
        this.getInputFormats = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassScope(storageManager, this);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, i);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            getHighSpeedVideoSizes(arrayList, this, kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE, "P".concat(java.lang.String.valueOf(((kotlin.collections.IntIterator) it).nextInt())));
            arrayList2.add(kotlin.Unit.INSTANCE);
        }
        getHighSpeedVideoSizes(arrayList, this, kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE);
        this.getInputSizeshNQ4ISI = kotlin.collections.CollectionsKt.toList(arrayList);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Companion.getFunctionClassKind(this.getOutputFormats);
    }

    private static final void getHighSpeedVideoSizes(java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> arrayList, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor functionClassDescriptor, kotlin.reflect.jvm.internal.impl.types.Variance variance, java.lang.String str) {
        arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl.createWithDefaultBound(functionClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), false, variance, kotlin.reflect.jvm.internal.impl.name.Name.identifier(str), arrayList.size(), functionClassDescriptor.getOutputMinFrameDuration));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor getContainingDeclaration() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getStaticScope() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        return this.getHighSpeedVideoSizesFor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassScope getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this.getInputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        return kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "");
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getSource() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.getInputSizeshNQ4ISI;
    }

    final class FunctionTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor {
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean isDenotable() {
            return true;
        }

        public FunctionTypeConstructor() {
            super(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.getOutputMinFrameDuration);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes() {
            java.util.List listOf;
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind functionTypeKind = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.getFunctionTypeKind();
            if (kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE)) {
                listOf = kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.getHighSpeedVideoSizes);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KFunction.INSTANCE)) {
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.ClassId[]{kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.getHighSpeedVideoFpsRangesFor, new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE.numberedClassName(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.getArity()))});
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE)) {
                listOf = kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.getHighSpeedVideoSizes);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KSuspendFunction.INSTANCE)) {
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.ClassId[]{kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.getHighSpeedVideoFpsRangesFor, new kotlin.reflect.jvm.internal.impl.name.ClassId(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.COROUTINES_PACKAGE_FQ_NAME, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE.numberedClassName(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.getArity()))});
            } else {
                kotlin.reflect.jvm.internal.impl.utils.addToStdlib.AddToStdlibKt.shouldNotBeCalled$default(null, 1, null);
                throw new kotlin.KotlinNothingValueException();
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor containingDeclaration = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.getHighSpeedVideoFpsRanges.getContainingDeclaration();
            java.util.List<kotlin.reflect.jvm.internal.impl.name.ClassId> list = listOf;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (kotlin.reflect.jvm.internal.impl.name.ClassId classId : list) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
                if (findClassAcrossModuleDependencies == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Built-in class ");
                    sb.append(classId);
                    sb.append(" not found");
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                java.util.List takeLast = kotlin.collections.CollectionsKt.takeLast(getParameters(), findClassAcrossModuleDependencies.getTypeConstructor().getParameters().size());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(takeLast, 10));
                java.util.Iterator it = takeLast.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()).getDefaultType()));
                }
                arrayList.add(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty(), findClassAcrossModuleDependencies, arrayList2));
            }
            return kotlin.collections.CollectionsKt.toList(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
            return kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.getInputSizeshNQ4ISI;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
            return kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23898getDeclarationDescriptor() {
            return kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
            return kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this;
        }

        public final java.lang.String toString() {
            return kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.this.toString();
        }
    }

    public final java.lang.String toString() {
        java.lang.String asString = getName().asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        return asString;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("Function");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.name.ClassId(fqName, identifier);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.KOTLIN_REFLECT_FQ_NAME;
        kotlin.reflect.jvm.internal.impl.name.Name identifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier("KFunction");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier2, "");
        getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.name.ClassId(fqName2, identifier2);
    }
}

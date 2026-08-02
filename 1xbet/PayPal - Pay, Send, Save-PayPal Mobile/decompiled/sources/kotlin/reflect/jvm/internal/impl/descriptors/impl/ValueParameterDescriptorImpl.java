package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class ValueParameterDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl implements kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.Companion Companion = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.Companion(null);
    private final boolean Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getInputFormats;

    public java.lang.Void getCompileTimeInitializer() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* renamed from: getCompileTimeInitializer, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue mo23891getCompileTimeInitializer() {
        return (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) getCompileTimeInitializer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public /* bridge */ boolean isLateInit() {
        return kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor.DefaultImpls.isLateInit(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public int getIndex() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isCrossinline() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isNoinline() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getVarargElementType() {
        return this.getInputFormats;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(callableDescriptor, annotations, name2, kotlinType, sourceElement);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.Camera2StreamConfigurationMap = z3;
        this.getInputFormats = kotlinType2;
        this.getHighSpeedVideoSizes = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl createWithDestructuringDeclarations(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor>> function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
            if (function0 == null) {
                return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(callableDescriptor, valueParameterDescriptor, i, annotations, name2, kotlinType, z, z2, z3, kotlinType2, sourceElement);
            }
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration(callableDescriptor, valueParameterDescriptor, i, annotations, name2, kotlinType, z, z2, z3, kotlinType2, sourceElement, function0);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class WithDestructuringDeclaration extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl {
        private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor>> function0) {
            super(callableDescriptor, valueParameterDescriptor, i, annotations, name2, kotlinType, z, z2, z3, kotlinType2, sourceElement);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(function0);
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor> getDestructuringVariables() {
            return (java.util.List) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        public final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = getAnnotations();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotations, "");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            boolean declaresDefaultValue = declaresDefaultValue();
            boolean isCrossinline = isCrossinline();
            boolean isNoinline = isNoinline();
            kotlin.reflect.jvm.internal.impl.types.KotlinType varargElementType = getVarargElementType();
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration(callableDescriptor, null, i, annotations, name2, type, declaresDefaultValue, isCrossinline, isNoinline, varargElementType, sourceElement, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration$$Lambda$0
                private final kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.List destructuringVariables;
                    destructuringVariables = this.getHighSpeedVideoFpsRanges.getDestructuringVariables();
                    return destructuringVariables;
                }

                {
                    this.getHighSpeedVideoFpsRanges = this;
                }
            });
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getContainingDeclaration() {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = super.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
        return (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean declaresDefaultValue() {
        if (!this.getHighSpeedVideoFpsRanges) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor containingDeclaration = getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
        return ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) containingDeclaration).getKind().isReal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor getOriginal() {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = this.getHighSpeedVideoSizes;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.getOriginal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptorVisitor, "");
        return declarationDescriptorVisitor.visitValueParameterDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor copy(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = getAnnotations();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotations, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        boolean declaresDefaultValue = declaresDefaultValue();
        boolean isCrossinline = isCrossinline();
        boolean isNoinline = isNoinline();
        kotlin.reflect.jvm.internal.impl.types.KotlinType varargElementType = getVarargElementType();
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(callableDescriptor, null, i, annotations, name2, type, declaresDefaultValue, isCrossinline, isNoinline, varargElementType, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.LOCAL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "");
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getOverriddenDescriptors() {
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> overriddenDescriptors = getContainingDeclaration().getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> collection = overriddenDescriptors;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) it.next()).getValueParameters().get(getIndex()));
        }
        return arrayList;
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl createWithDestructuringDeclarations(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement, kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor>> function0) {
        return Companion.createWithDestructuringDeclarations(callableDescriptor, valueParameterDescriptor, i, annotations, name2, kotlinType, z, z2, z3, kotlinType2, sourceElement, function0);
    }
}

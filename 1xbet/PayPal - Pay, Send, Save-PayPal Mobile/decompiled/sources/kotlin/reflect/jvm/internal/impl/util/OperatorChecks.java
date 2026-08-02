package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public final class OperatorChecks extends kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks {
    public static final kotlin.reflect.jvm.internal.impl.util.OperatorChecks INSTANCE = new kotlin.reflect.jvm.internal.impl.util.OperatorChecks();
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.util.Checks> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.util.Checks[]{new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.GET, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast(1)}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.SET, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast(2)}, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$$Lambda$0
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return kotlin.reflect.jvm.internal.impl.util.OperatorChecks.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj);
        }
    }), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.GET_VALUE, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.getHighSpeedVideoSizes, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast(2), kotlin.reflect.jvm.internal.impl.util.IsKPropertyCheck.getHighSpeedVideoSizes}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.SET_VALUE, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.getHighSpeedVideoSizes, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast(3), kotlin.reflect.jvm.internal.impl.util.IsKPropertyCheck.getHighSpeedVideoSizes}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.PROVIDE_DELEGATE, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.getHighSpeedVideoSizes, new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.Equals(2), kotlin.reflect.jvm.internal.impl.util.IsKPropertyCheck.getHighSpeedVideoSizes}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.INVOKE, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.CONTAINS, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.getHighSpeedVideoSizes, kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.ITERATOR, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.NEXT, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.HAS_NEXT, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.RANGE_TO, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.getHighSpeedVideoSizes}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.RANGE_UNTIL, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.getHighSpeedVideoSizes}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.EQUALS, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.Member.INSTANCE}, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$$Lambda$1
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return kotlin.reflect.jvm.internal.impl.util.OperatorChecks.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj);
        }
    }), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.COMPARE_TO, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.getHighSpeedVideoSizes}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.BINARY_OPERATION_NAMES, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.getHighSpeedVideoSizes}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.Name[]{kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.INC, kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.DEC}), new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE}, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$$Lambda$2
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return kotlin.reflect.jvm.internal.impl.util.OperatorChecks.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj);
        }
    }), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.ASSIGNMENT_OPERATIONS, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter.INSTANCE, kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck.getHighSpeedVideoSizes}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), new kotlin.reflect.jvm.internal.impl.util.Checks(kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions.COMPONENT_REGEX, new kotlin.reflect.jvm.internal.impl.util.Check[]{kotlin.reflect.jvm.internal.impl.util.MemberKindCheck.MemberOrExtension.INSTANCE, kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters.INSTANCE}, (kotlin.jvm.functions.Function1) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null)});

    private OperatorChecks() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    public final java.util.List<kotlin.reflect.jvm.internal.impl.util.Checks> getChecks$descriptors() {
        return getHighSpeedVideoFpsRangesFor;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) valueParameters);
        boolean z = false;
        if (valueParameterDescriptor != null && !kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) && valueParameterDescriptor.getVarargElementType() == null) {
            z = true;
        }
        kotlin.reflect.jvm.internal.impl.util.OperatorChecks operatorChecks = INSTANCE;
        if (z) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        kotlin.reflect.jvm.internal.impl.util.OperatorChecks operatorChecks = INSTANCE;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
        if ((containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAny((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration)) {
            return null;
        }
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection = overriddenDescriptors;
        if (!collection.isEmpty()) {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it.next()).getContainingDeclaration();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "");
                if ((containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAny((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration2)) {
                    return null;
                }
            }
        }
        if (kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt.isTypedEqualsInValueClass(functionDescriptor)) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("must override ''equals()'' in Any");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration3 = functionDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration3, "");
        if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClass(containingDeclaration3)) {
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.SHORT_NAMES_IN_TYPES;
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration4 = functionDescriptor.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration4, "");
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration4).getDefaultType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
            java.lang.String renderType = descriptorRenderer.renderType(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" or define ''equals(other: ");
            sb2.append(renderType);
            sb2.append("): Boolean''");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(r2, r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId;
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = functionDescriptor.getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null) {
            dispatchReceiverParameter = functionDescriptor.getExtensionReceiverParameter();
        }
        kotlin.reflect.jvm.internal.impl.util.OperatorChecks operatorChecks = INSTANCE;
        if (dispatchReceiverParameter == null) {
            return "receiver must be a supertype of the return type";
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType2 = functionDescriptor.getReturnType();
        if (returnType2 != null) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = dispatchReceiverParameter.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue value = dispatchReceiverParameter.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        if (!(value instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver)) {
            return "receiver must be a supertype of the return type";
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver) value).getClassDescriptor();
        if (!classDescriptor.isExpect() || (classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(classDescriptor)) == null) {
            return "receiver must be a supertype of the return type";
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor findClassifierAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassifierAcrossModuleDependencies(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(classDescriptor), classId);
        kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor = findClassifierAcrossModuleDependencies instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) findClassifierAcrossModuleDependencies : null;
        if (typeAliasDescriptor == null || (returnType = functionDescriptor.getReturnType()) == null || !kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(returnType, typeAliasDescriptor.getExpandedType())) {
            return "receiver must be a supertype of the return type";
        }
        return null;
    }
}

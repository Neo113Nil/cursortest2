package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes5.dex */
public final class SuspendFunctionTypesKt {
    private static final kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor getHighSpeedVideoSizes;

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor mutableClassDescriptor = new kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor(new kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.getErrorModule(), kotlin.reflect.jvm.internal.impl.builtins.StandardNames.COROUTINES_PACKAGE_FQ_NAME), kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE, false, false, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.CONTINUATION_INTERFACE_FQ_NAME.shortName(), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS);
        mutableClassDescriptor.setModality(kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT);
        mutableClassDescriptor.setVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC);
        mutableClassDescriptor.setTypeParameterDescriptors(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), false, kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE, kotlin.reflect.jvm.internal.impl.name.Name.identifier("T"), 0, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS)));
        mutableClassDescriptor.createTypeConstructor();
        getHighSpeedVideoSizes = mutableClassDescriptor;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType transformSuspendFunctionToRuntimeFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType createFunctionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(kotlinType);
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(kotlinType);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = kotlinType.getAnnotations();
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverTypeFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> contextReceiverTypesFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> valueParameterTypesFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(valueParameterTypesFromFunctionType, 10));
        java.util.Iterator<T> it = valueParameterTypesFromFunctionType.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).getType());
        }
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes empty = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty();
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = getHighSpeedVideoSizes.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType>) arrayList, kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(empty, typeConstructor, kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType))), false, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null));
        kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nullableAnyType, "");
        createFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, plus, null, nullableAnyType, (r17 & 128) != 0 ? false : false);
        return createFunctionType.makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }
}

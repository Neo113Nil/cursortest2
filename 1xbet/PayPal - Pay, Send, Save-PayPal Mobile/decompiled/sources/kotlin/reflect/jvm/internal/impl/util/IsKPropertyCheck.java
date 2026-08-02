package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
final class IsKPropertyCheck implements kotlin.reflect.jvm.internal.impl.util.Check {
    public static final kotlin.reflect.jvm.internal.impl.util.IsKPropertyCheck getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.util.IsKPropertyCheck();
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "second parameter must be of type KProperty<*> or its supertype";

    private IsKPropertyCheck() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final /* bridge */ java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        return kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final java.lang.String getDescription() {
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = functionDescriptor.getValueParameters().get(1);
        kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.Companion companion = kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.Companion;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameterDescriptor);
        kotlin.reflect.jvm.internal.impl.types.KotlinType createKPropertyStarType = companion.createKPropertyStarType(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(valueParameterDescriptor));
        if (createKPropertyStarType == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = valueParameterDescriptor.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(createKPropertyStarType, kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNotNullable(type));
    }
}

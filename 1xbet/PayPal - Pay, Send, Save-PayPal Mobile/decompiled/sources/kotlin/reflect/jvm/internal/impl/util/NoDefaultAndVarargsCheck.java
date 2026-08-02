package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
final class NoDefaultAndVarargsCheck implements kotlin.reflect.jvm.internal.impl.util.Check {
    public static final kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.util.NoDefaultAndVarargsCheck();
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "should not have varargs or parameters with default values";

    private NoDefaultAndVarargsCheck() {
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
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueParameterDescriptor);
            if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) {
                return false;
            }
        }
        return true;
    }
}

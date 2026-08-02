package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

/* loaded from: classes5.dex */
final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.Boolean> {
    public static final kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor2 = valueParameterDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameterDescriptor2, "");
        return java.lang.Boolean.valueOf(valueParameterDescriptor2.declaresDefaultValue());
    }

    DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
    }
}

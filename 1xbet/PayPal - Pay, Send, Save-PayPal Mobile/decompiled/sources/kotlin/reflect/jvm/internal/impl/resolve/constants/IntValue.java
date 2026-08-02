package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class IntValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueConstant<java.lang.Integer> {
    public IntValue(int i) {
        super(java.lang.Integer.valueOf(i));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType intType = moduleDescriptor.getBuiltIns().getIntType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intType, "");
        return intType;
    }
}

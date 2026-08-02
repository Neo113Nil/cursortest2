package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class ShortValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueConstant<java.lang.Short> {
    public ShortValue(short s) {
        super(java.lang.Short.valueOf(s));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType shortType = moduleDescriptor.getBuiltIns().getShortType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shortType, "");
        return shortType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getValue().intValue());
        sb.append(".toShort()");
        return sb.toString();
    }
}

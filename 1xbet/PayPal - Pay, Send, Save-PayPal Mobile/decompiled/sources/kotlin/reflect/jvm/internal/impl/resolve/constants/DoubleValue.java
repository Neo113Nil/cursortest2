package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class DoubleValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.lang.Double> {
    public DoubleValue(double d) {
        super(java.lang.Double.valueOf(d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType doubleType = moduleDescriptor.getBuiltIns().getDoubleType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doubleType, "");
        return doubleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getValue().doubleValue());
        sb.append(".toDouble()");
        return sb.toString();
    }
}

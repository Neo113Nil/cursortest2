package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class FloatValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.lang.Float> {
    public FloatValue(float f) {
        super(java.lang.Float.valueOf(f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType floatType = moduleDescriptor.getBuiltIns().getFloatType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(floatType, "");
        return floatType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getValue().floatValue());
        sb.append(".toFloat()");
        return sb.toString();
    }
}

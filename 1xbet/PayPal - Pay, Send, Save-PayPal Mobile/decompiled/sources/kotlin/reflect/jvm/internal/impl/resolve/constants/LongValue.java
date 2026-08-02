package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class LongValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueConstant<java.lang.Long> {
    public LongValue(long j) {
        super(java.lang.Long.valueOf(j));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType longType = moduleDescriptor.getBuiltIns().getLongType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(longType, "");
        return longType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getValue().longValue());
        sb.append(".toLong()");
        return sb.toString();
    }
}

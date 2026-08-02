package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class StringValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.lang.String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringValue(java.lang.String str) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType stringType = moduleDescriptor.getBuiltIns().getStringType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringType, "");
        return stringType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
        sb.append(getValue());
        sb.append('\"');
        return sb.toString();
    }
}

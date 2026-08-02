package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class NullValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.lang.Void> {
    public NullValue() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType nullableNothingType = moduleDescriptor.getBuiltIns().getNullableNothingType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nullableNothingType, "");
        return nullableNothingType;
    }
}

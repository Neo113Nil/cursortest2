package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class BooleanValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.lang.Boolean> {
    public BooleanValue(boolean z) {
        super(java.lang.Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType booleanType = moduleDescriptor.getBuiltIns().getBooleanType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanType, "");
        return booleanType;
    }
}

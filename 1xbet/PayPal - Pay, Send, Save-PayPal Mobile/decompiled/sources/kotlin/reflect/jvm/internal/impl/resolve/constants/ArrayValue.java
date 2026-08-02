package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public class ArrayValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>> {
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValue(java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> list, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, ? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> function1) {
        super(list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType invoke = this.getHighSpeedVideoFpsRangesFor.invoke(moduleDescriptor);
        if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(invoke) && !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveArray(invoke)) {
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnsignedArrayType(invoke);
        }
        return invoke;
    }
}

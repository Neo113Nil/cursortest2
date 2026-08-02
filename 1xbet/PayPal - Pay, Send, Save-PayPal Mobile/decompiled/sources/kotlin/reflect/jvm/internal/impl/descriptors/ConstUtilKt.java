package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class ConstUtilKt {
    public static final boolean canBeUsedForConstVal(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return ((kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType(kotlinType) || kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.isUnsignedType(kotlinType)) && !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(kotlinType)) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(kotlinType);
    }
}

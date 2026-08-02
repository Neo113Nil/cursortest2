package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class KotlinTypeKt {
    public static final boolean isNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(kotlinType);
    }

    public static final boolean isError(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.error.ErrorType) {
            return true;
        }
        return (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) && (((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap).getDelegate() instanceof kotlin.reflect.jvm.internal.impl.types.error.ErrorType);
    }
}

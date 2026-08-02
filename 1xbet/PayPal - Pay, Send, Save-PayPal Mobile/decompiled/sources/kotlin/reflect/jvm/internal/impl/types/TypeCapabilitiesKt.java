package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class TypeCapabilitiesKt {
    public static final boolean isCustomTypeParameter(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        java.lang.Object unwrap = kotlinType.unwrap();
        kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter customTypeParameter = unwrap instanceof kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter ? (kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter) unwrap : null;
        if (customTypeParameter != null) {
            return customTypeParameter.isTypeParameter();
        }
        return false;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter getCustomTypeParameter(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        java.lang.Object unwrap = kotlinType.unwrap();
        kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter customTypeParameter = unwrap instanceof kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter ? (kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter) unwrap : null;
        if (customTypeParameter == null || !customTypeParameter.isTypeParameter()) {
            return null;
        }
        return customTypeParameter;
    }
}

package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class FlexibleTypesKt {
    public static final boolean isFlexible(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlinType.unwrap() instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.FlexibleType asFlexibleType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        kotlin.jvm.internal.Intrinsics.checkNotNull(unwrap, "");
        return (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType lowerIfFlexible(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            return ((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap).getLowerBound();
        }
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType upperIfFlexible(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            return ((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap).getUpperBound();
        }
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}

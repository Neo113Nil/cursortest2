package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getEnhancement(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        if (kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement) {
            return ((kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement) kotlinType).getEnhancement();
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType inheritEnhancement(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, ? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType enhancement = getEnhancement(kotlinType);
        return wrapEnhancement(unwrappedType, enhancement != null ? function1.invoke(enhancement) : null);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType inheritEnhancement(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return wrapEnhancement(unwrappedType, getEnhancement(kotlinType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType wrapEnhancement(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType2 = unwrappedType;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType2, "");
            if (!(unwrappedType2 instanceof kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement)) {
                break;
            }
            unwrappedType2 = ((kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement) unwrappedType2).getOrigin();
        }
        if (kotlinType == null || kotlin.jvm.internal.Intrinsics.areEqual(kotlinType, unwrappedType2)) {
            return unwrappedType2;
        }
        if (unwrappedType2 instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return new kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement((kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedType2, kotlinType);
        }
        if (unwrappedType2 instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            return new kotlin.reflect.jvm.internal.impl.types.FlexibleTypeWithEnhancement((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedType2, kotlinType);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}

package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class DynamicTypesKt {
    public static final boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlinType.unwrap() instanceof kotlin.reflect.jvm.internal.impl.types.DynamicType;
    }
}

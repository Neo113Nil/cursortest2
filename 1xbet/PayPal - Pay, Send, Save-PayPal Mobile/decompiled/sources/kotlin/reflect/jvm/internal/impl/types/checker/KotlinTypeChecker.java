package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public interface KotlinTypeChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker DEFAULT = kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.Companion.getDefault();

    public interface TypeConstructorEquality {
        boolean equals(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2);
    }

    boolean equalTypes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2);

    boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2);
}

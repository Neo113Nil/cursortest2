package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class StrictEqualityTypeChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker();

    private StrictEqualityTypeChecker() {
    }

    public final boolean strictEqualTypes(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType2, "");
        return kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE, unwrappedType, unwrappedType2);
    }
}

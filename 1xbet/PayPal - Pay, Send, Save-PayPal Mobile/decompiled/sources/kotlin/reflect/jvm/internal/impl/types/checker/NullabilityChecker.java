package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class NullabilityChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker();

    private NullabilityChecker() {
    }

    public final boolean isSubtypeOfAny(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        return kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker.INSTANCE.hasNotNullSupertype(kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext$$Util.newTypeCheckerState$default(kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE, false, true, false, 4, null), kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(unwrappedType), kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE);
    }
}

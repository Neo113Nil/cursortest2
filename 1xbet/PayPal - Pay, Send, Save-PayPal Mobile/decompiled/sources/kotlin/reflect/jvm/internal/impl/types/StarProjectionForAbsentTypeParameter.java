package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class StarProjectionForAbsentTypeParameter extends kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase {
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final boolean isStarProjection() {
        return true;
    }

    public StarProjectionForAbsentTypeParameter(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = kotlinBuiltIns.getNullableAnyType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nullableAnyType, "");
        this.getHighSpeedVideoFpsRangesFor = nullableAnyType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final kotlin.reflect.jvm.internal.impl.types.Variance getProjectionKind() {
        return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this;
    }
}

package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class NewKotlinTypeCheckerImpl implements kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker {
    private final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner getHighSpeedVideoFpsRangesFor;

    public NewKotlinTypeCheckerImpl(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator kotlinTypePreparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypePreparator, "");
        this.getHighSpeedVideoFpsRangesFor = kotlinTypeRefiner;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinTypePreparator;
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil createWithTypeRefiner = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.createWithTypeRefiner(getKotlinTypeRefiner());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createWithTypeRefiner, "");
        this.Camera2StreamConfigurationMap = createWithTypeRefiner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner getKotlinTypeRefiner() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public /* synthetic */ NewKotlinTypeCheckerImpl(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default r2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinTypeRefiner, (i & 2) != 0 ? kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default.INSTANCE : r2);
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator getKotlinTypePreparator() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil getOverridingUtil() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public final boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType2, "");
        return isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(true, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public final boolean equalTypes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType2, "");
        return equalTypes(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(false, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public final boolean equalTypes(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType2, "");
        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, unwrappedType, unwrappedType2);
    }

    public final boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType2, "");
        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.isSubtypeOf$default(kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE, typeCheckerState, unwrappedType, unwrappedType2, false, 8, null);
    }
}

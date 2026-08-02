package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR+\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u0011\u0010\u0019\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014"}, d2 = {"Landroidx/compose/material3/TopAppBarState;", "", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "heightOffsetLimit", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHeightOffsetLimit", "()F", "setHeightOffsetLimit", "(F)V", "newOffset", "getHeightOffset", "setHeightOffset", "heightOffset", "<set-?>", "contentOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getContentOffset", "setContentOffset", "contentOffset", "getCollapsedFraction", "collapsedFraction", "getOverlappedFraction", "overlappedFraction", "Landroidx/compose/runtime/MutableFloatState;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TopAppBarState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.TopAppBarState.Companion INSTANCE = new androidx.compose.material3.TopAppBarState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.TopAppBarState, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.TopAppBarState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.util.List listOf;
            listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Float[]{java.lang.Float.valueOf(r2.heightOffsetLimit), java.lang.Float.valueOf(r2.getHeightOffset()), java.lang.Float.valueOf(((androidx.compose.material3.TopAppBarState) obj2).getContentOffset())});
            return listOf;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TopAppBarState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.material3.TopAppBarState.$r8$lambda$enzoMo0gwzxenP7KTPxhSPj5R_I((java.util.List) obj);
        }
    });

    /* renamed from: contentOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState contentOffset;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableFloatState getHighResolutionOutputSizeshNQ4ISI;
    private float heightOffsetLimit;

    public TopAppBarState(float f, float f2, float f3) {
        this.heightOffsetLimit = f;
        this.contentOffset = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
    }

    public final float getHeightOffsetLimit() {
        return this.heightOffsetLimit;
    }

    public final void setHeightOffsetLimit(float f) {
        this.heightOffsetLimit = f;
    }

    public final float getHeightOffset() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getFloatValue();
    }

    public final void setHeightOffset(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI.setFloatValue(kotlin.ranges.RangesKt.coerceIn(f, this.heightOffsetLimit, 0.0f));
    }

    public final float getContentOffset() {
        return this.contentOffset.getFloatValue();
    }

    public final void setContentOffset(float f) {
        this.contentOffset.setFloatValue(f);
    }

    public final float getCollapsedFraction() {
        if (this.heightOffsetLimit == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / this.heightOffsetLimit;
    }

    public final float getOverlappedFraction() {
        float f = this.heightOffsetLimit;
        if (f == 0.0f) {
            return 0.0f;
        }
        return 1.0f - (kotlin.ranges.RangesKt.coerceIn(f - getContentOffset(), this.heightOffsetLimit, 0.0f) / this.heightOffsetLimit);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/material3/TopAppBarState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TopAppBarState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.TopAppBarState, ?> getSaver() {
            return androidx.compose.material3.TopAppBarState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.compose.material3.TopAppBarState $r8$lambda$enzoMo0gwzxenP7KTPxhSPj5R_I(java.util.List list) {
        return new androidx.compose.material3.TopAppBarState(((java.lang.Number) list.get(0)).floatValue(), ((java.lang.Number) list.get(1)).floatValue(), ((java.lang.Number) list.get(2)).floatValue());
    }
}

package androidx.compose.foundation.lazy.grid;

/* compiled from: LazyGridState.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"EmptyLazyGridLayoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "rememberLazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridStateKt {
    private static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult EmptyLazyGridLayoutInfo = new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(null, 0, false, 0.0f, new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$1
        private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines = kotlin.collections.MapsKt.emptyMap();
        private final int height;
        private final int width;

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public void placeChildren() {
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
            return this.alignmentLines;
        }
    }, false, kotlin.collections.CollectionsKt.emptyList(), 0, 0, 0, false, androidx.compose.foundation.gestures.Orientation.Vertical, 0, 0);

    public static final androidx.compose.foundation.lazy.grid.LazyGridState rememberLazyGridState(final int i, final int i2, androidx.compose.runtime.Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(29186956);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberLazyGridState)68@3084L176:LazyGridState.kt#7791vq");
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(29186956, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:67)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.grid.LazyGridState, ?> saver = androidx.compose.foundation.lazy.grid.LazyGridState.INSTANCE.getSaver();
        composer.startReplaceableGroup(-707393359);
        boolean changed = composer.changed(i) | composer.changed(i2);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.grid.LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.foundation.lazy.grid.LazyGridState invoke() {
                    return new androidx.compose.foundation.lazy.grid.LazyGridState(i, i2);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState = (androidx.compose.foundation.lazy.grid.LazyGridState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 72, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridState;
    }
}

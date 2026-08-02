package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "rememberLazyGridBeyondBoundsState", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridBeyondBoundsModifierKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2004349821, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyGridState)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsState(lazyGridState);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsState lazyGridBeyondBoundsState = (androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyGridBeyondBoundsState;
    }
}

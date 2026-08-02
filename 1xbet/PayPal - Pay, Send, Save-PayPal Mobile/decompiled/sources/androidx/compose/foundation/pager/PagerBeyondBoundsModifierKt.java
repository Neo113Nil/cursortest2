package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "", "beyondViewportPageCount", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "rememberPagerBeyondBoundsState", "(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerBeyondBoundsModifierKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState rememberPagerBeyondBoundsState(androidx.compose.foundation.pager.PagerState pagerState, int i, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(373558254, i2, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z = true;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(i)) && (i2 & 48) != 32) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.pager.PagerBeyondBoundsState(pagerState, i);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.pager.PagerBeyondBoundsState pagerBeyondBoundsState = (androidx.compose.foundation.pager.PagerBeyondBoundsState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return pagerBeyondBoundsState;
    }
}

package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "rememberPagerSemanticState", "(Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerSemanticsKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberPagerSemanticState(androidx.compose.foundation.pager.PagerState pagerState, boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-786344289, i, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(z)) && (i & 48) != 32) {
            z2 = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.foundation.pager.LazyLayoutSemanticStateKt.LazyLayoutSemanticState(pagerState, z);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState lazyLayoutSemanticState = (androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyLayoutSemanticState;
    }
}

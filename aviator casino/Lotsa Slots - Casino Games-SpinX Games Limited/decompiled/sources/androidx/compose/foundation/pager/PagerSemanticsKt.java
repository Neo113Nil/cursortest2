package androidx.compose.foundation.pager;

/* compiled from: PagerSemantics.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"rememberPagerSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "reverseScrolling", "", "isVertical", "(Landroidx/compose/foundation/pager/PagerState;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerSemanticsKt {
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState rememberPagerSemanticState(androidx.compose.foundation.pager.PagerState pagerState, boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(352210115);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberPagerSemanticState)P(2,1)30@1089L104:PagerSemantics.kt#g6yjnt");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(352210115, i, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:29)");
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z2);
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(pagerState) | composer.changed(valueOf2);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.foundation.pager.LazyLayoutSemanticStateKt.LazyLayoutSemanticState(pagerState, z2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState lazyLayoutSemanticState = (androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyLayoutSemanticState;
    }
}

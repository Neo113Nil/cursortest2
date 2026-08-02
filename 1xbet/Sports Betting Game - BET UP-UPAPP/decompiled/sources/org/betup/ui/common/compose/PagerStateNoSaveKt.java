package org.betup.ui.common.compose;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PagerStateNoSave.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"rememberPagerStateWithoutSavedState", "Landroidx/compose/foundation/pager/PagerState;", "initialPage", "", "initialPageOffsetFraction", "", "pageCount", "Lkotlin/Function0;", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagerStateNoSaveKt {
    public static final PagerState rememberPagerStateWithoutSavedState(int i, float f, Function0<Integer> pageCount, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(pageCount, "pageCount");
        composer.startReplaceGroup(-329081071);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-329081071, i2, -1, "org.betup.ui.common.compose.rememberPagerStateWithoutSavedState (PagerStateNoSave.kt:25)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pageCount, composer, (i2 >> 6) & 14);
        composer.startReplaceGroup(-1633490746);
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(f)) || (i2 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = PagerStateKt.PagerState(i, f, new Function0() { // from class: org.betup.ui.common.compose.PagerStateNoSaveKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int rememberPagerStateWithoutSavedState$lambda$1$lambda$0;
                    rememberPagerStateWithoutSavedState$lambda$1$lambda$0 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState$lambda$1$lambda$0(State.this);
                    return Integer.valueOf(rememberPagerStateWithoutSavedState$lambda$1$lambda$0);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        PagerState pagerState = (PagerState) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pagerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rememberPagerStateWithoutSavedState$lambda$1$lambda$0(State state) {
        return ((Number) ((Function0) state.getValue()).invoke()).intValue();
    }
}

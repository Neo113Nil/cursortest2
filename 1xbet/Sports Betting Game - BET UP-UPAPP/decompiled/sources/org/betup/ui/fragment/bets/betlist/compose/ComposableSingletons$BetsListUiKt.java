package org.betup.ui.fragment.bets.betlist.compose;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BetsListUi.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$BetsListUiKt {
    public static final ComposableSingletons$BetsListUiKt INSTANCE = new ComposableSingletons$BetsListUiKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1632215208 = ComposableLambdaKt.composableLambdaInstance(1632215208, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betlist.compose.ComposableSingletons$BetsListUiKt$lambda$1632215208$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1632215208, i, -1, "org.betup.ui.fragment.bets.betlist.compose.ComposableSingletons$BetsListUiKt.lambda$1632215208.<anonymous> (BetsListUi.kt:130)");
            }
            BetsListUiKt.BetsListLoadMoreIndicator(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1632215208$app_release() {
        return lambda$1632215208;
    }
}

package org.betup.ui.fragment.home.compose.matches;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeMatchesSectionLoadingRow.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeMatchesSectionLoadingRowKt {
    public static final ComposableSingletons$HomeMatchesSectionLoadingRowKt INSTANCE = new ComposableSingletons$HomeMatchesSectionLoadingRowKt();
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> lambda$1346981234 = ComposableLambdaKt.composableLambdaInstance(1346981234, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchesSectionLoadingRowKt$lambda$1346981234$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 129) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1346981234, i2, -1, "org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchesSectionLoadingRowKt.lambda$1346981234.<anonymous> (HomeMatchesSectionLoadingRow.kt:20)");
            }
            HomeMatchListLoadingItemKt.HomeMatchListLoadingItem(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getLambda$1346981234$app_release() {
        return lambda$1346981234;
    }
}

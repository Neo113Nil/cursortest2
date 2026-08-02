package org.betup.ui.common.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.LoadingViewKt;

/* compiled from: SwipeRefreshContainer.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$SwipeRefreshContainerKt {
    public static final ComposableSingletons$SwipeRefreshContainerKt INSTANCE = new ComposableSingletons$SwipeRefreshContainerKt();
    private static Function2<Composer, Integer, Unit> lambda$911372363 = ComposableLambdaKt.composableLambdaInstance(911372363, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.ComposableSingletons$SwipeRefreshContainerKt$lambda$911372363$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(911372363, i, -1, "org.betup.ui.common.compose.ComposableSingletons$SwipeRefreshContainerKt.lambda$911372363.<anonymous> (SwipeRefreshContainer.kt:61)");
            }
            LoadingViewKt.LoadingView(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$911372363$app_release() {
        return lambda$911372363;
    }
}

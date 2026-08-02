package org.betup.ui.dialogs.compose.stepsChallenges;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.LoadingViewKt;

/* compiled from: MatchesStep.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$MatchesStepKt {
    public static final ComposableSingletons$MatchesStepKt INSTANCE = new ComposableSingletons$MatchesStepKt();

    /* renamed from: lambda$-445696888, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3794lambda$445696888 = ComposableLambdaKt.composableLambdaInstance(-445696888, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.ComposableSingletons$MatchesStepKt$lambda$-445696888$1
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
                ComposerKt.traceEventStart(-445696888, i, -1, "org.betup.ui.dialogs.compose.stepsChallenges.ComposableSingletons$MatchesStepKt.lambda$-445696888.<anonymous> (MatchesStep.kt:126)");
            }
            LoadingViewKt.LoadingView(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BattleFlowDimens.INSTANCE.m13169getLoadingMoreHeightD9Ej5fM()), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-445696888$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m13342getLambda$445696888$app_release() {
        return f3794lambda$445696888;
    }
}

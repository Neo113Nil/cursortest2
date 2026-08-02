package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: RankingRewardDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$RankingRewardDialogFragmentKt {
    public static final ComposableSingletons$RankingRewardDialogFragmentKt INSTANCE = new ComposableSingletons$RankingRewardDialogFragmentKt();

    /* renamed from: lambda$-513979782, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3778lambda$513979782 = ComposableLambdaKt.composableLambdaInstance(-513979782, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$RankingRewardDialogFragmentKt$lambda$-513979782$1
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
                ComposerKt.traceEventStart(-513979782, i, -1, "org.betup.ui.dialogs.ComposableSingletons$RankingRewardDialogFragmentKt.lambda$-513979782.<anonymous> (RankingRewardDialogFragment.kt:145)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.push_header_reward, composer, 6), null, null, true, false, false, false, composer, 24576, 237);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-513979782$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13023getLambda$513979782$app_release() {
        return f3778lambda$513979782;
    }
}

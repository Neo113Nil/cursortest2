package org.betup.ui.dialogs.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: PlayerStatsMinStakeDialogScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$PlayerStatsMinStakeDialogScreenKt {
    public static final ComposableSingletons$PlayerStatsMinStakeDialogScreenKt INSTANCE = new ComposableSingletons$PlayerStatsMinStakeDialogScreenKt();

    /* renamed from: lambda$-477256202, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3790lambda$477256202 = ComposableLambdaKt.composableLambdaInstance(-477256202, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$PlayerStatsMinStakeDialogScreenKt$lambda$-477256202$1
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
                ComposerKt.traceEventStart(-477256202, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$PlayerStatsMinStakeDialogScreenKt.lambda$-477256202.<anonymous> (PlayerStatsMinStakeDialogScreen.kt:52)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.player_stats_min_stake_dialog_title, composer, 6), null, null, false, false, false, false, composer, 0, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-477256202$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13297getLambda$477256202$app_release() {
        return f3790lambda$477256202;
    }
}

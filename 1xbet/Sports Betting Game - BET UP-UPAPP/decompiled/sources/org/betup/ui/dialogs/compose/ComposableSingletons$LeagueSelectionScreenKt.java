package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: LeagueSelectionScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$LeagueSelectionScreenKt {
    public static final ComposableSingletons$LeagueSelectionScreenKt INSTANCE = new ComposableSingletons$LeagueSelectionScreenKt();

    /* renamed from: lambda$-1360530383, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3784lambda$1360530383 = ComposableLambdaKt.composableLambdaInstance(-1360530383, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$LeagueSelectionScreenKt$lambda$-1360530383$1
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
                ComposerKt.traceEventStart(-1360530383, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$LeagueSelectionScreenKt.lambda$-1360530383.<anonymous> (LeagueSelectionScreen.kt:66)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.select_league, composer, 6), null, null, false, false, false, true, composer, 12582912, 125);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1896444433, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3785lambda$1896444433 = ComposableLambdaKt.composableLambdaInstance(-1896444433, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$LeagueSelectionScreenKt$lambda$-1896444433$1
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
                ComposerKt.traceEventStart(-1896444433, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$LeagueSelectionScreenKt.lambda$-1896444433.<anonymous> (LeagueSelectionScreen.kt:72)");
            }
            BoxKt.Box(PaddingKt.m1517paddingVpY3zN4(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BattleFlowDimens.INSTANCE.m13185getTicketBottomHeightD9Ej5fM()), BattleFlowDimens.INSTANCE.m13186getTicketBottomPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13187getTicketBottomPaddingVD9Ej5fM()), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1360530383$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13291getLambda$1360530383$app_release() {
        return f3784lambda$1360530383;
    }

    /* renamed from: getLambda$-1896444433$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13292getLambda$1896444433$app_release() {
        return f3785lambda$1896444433;
    }
}

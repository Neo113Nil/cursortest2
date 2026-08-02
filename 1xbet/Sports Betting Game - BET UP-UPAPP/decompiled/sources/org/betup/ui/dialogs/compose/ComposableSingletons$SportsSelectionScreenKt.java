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

/* compiled from: SportsSelectionScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$SportsSelectionScreenKt {
    public static final ComposableSingletons$SportsSelectionScreenKt INSTANCE = new ComposableSingletons$SportsSelectionScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$497804853 = ComposableLambdaKt.composableLambdaInstance(497804853, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$SportsSelectionScreenKt$lambda$497804853$1
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
                ComposerKt.traceEventStart(497804853, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$SportsSelectionScreenKt.lambda$497804853.<anonymous> (SportsSelectionScreen.kt:67)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.select_sport, composer, 6), null, null, false, false, false, true, composer, 12582912, 125);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1046345075 = ComposableLambdaKt.composableLambdaInstance(1046345075, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$SportsSelectionScreenKt$lambda$1046345075$1
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
                ComposerKt.traceEventStart(1046345075, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$SportsSelectionScreenKt.lambda$1046345075.<anonymous> (SportsSelectionScreen.kt:73)");
            }
            BoxKt.Box(PaddingKt.m1517paddingVpY3zN4(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BattleFlowDimens.INSTANCE.m13185getTicketBottomHeightD9Ej5fM()), BattleFlowDimens.INSTANCE.m13186getTicketBottomPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13187getTicketBottomPaddingVD9Ej5fM()), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1046345075$app_release() {
        return lambda$1046345075;
    }

    public final Function2<Composer, Integer, Unit> getLambda$497804853$app_release() {
        return lambda$497804853;
    }
}

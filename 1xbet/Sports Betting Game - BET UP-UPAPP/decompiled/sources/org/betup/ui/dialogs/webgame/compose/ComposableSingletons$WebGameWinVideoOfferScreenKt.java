package org.betup.ui.dialogs.webgame.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: WebGameWinVideoOfferScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$WebGameWinVideoOfferScreenKt {
    public static final ComposableSingletons$WebGameWinVideoOfferScreenKt INSTANCE = new ComposableSingletons$WebGameWinVideoOfferScreenKt();

    /* renamed from: lambda$-1543947897, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3796lambda$1543947897 = ComposableLambdaKt.composableLambdaInstance(-1543947897, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.webgame.compose.ComposableSingletons$WebGameWinVideoOfferScreenKt$lambda$-1543947897$1
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
                ComposerKt.traceEventStart(-1543947897, i, -1, "org.betup.ui.dialogs.webgame.compose.ComposableSingletons$WebGameWinVideoOfferScreenKt.lambda$-1543947897.<anonymous> (WebGameWinVideoOfferScreen.kt:74)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.shop_video_reward_title, composer, 6), null, null, false, true, true, false, composer, 1769472, 157);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1543947897$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13404getLambda$1543947897$app_release() {
        return f3796lambda$1543947897;
    }
}

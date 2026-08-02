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

/* compiled from: RewardedVideoOfferScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$RewardedVideoOfferScreenKt {
    public static final ComposableSingletons$RewardedVideoOfferScreenKt INSTANCE = new ComposableSingletons$RewardedVideoOfferScreenKt();

    /* renamed from: lambda$-1419269471, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3791lambda$1419269471 = ComposableLambdaKt.composableLambdaInstance(-1419269471, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$RewardedVideoOfferScreenKt$lambda$-1419269471$1
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
                ComposerKt.traceEventStart(-1419269471, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$RewardedVideoOfferScreenKt.lambda$-1419269471.<anonymous> (RewardedVideoOfferScreen.kt:94)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.rewarded_prompt_title, composer, 6), null, null, false, true, true, false, composer, 1769472, 157);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1419269471$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13298getLambda$1419269471$app_release() {
        return f3791lambda$1419269471;
    }
}

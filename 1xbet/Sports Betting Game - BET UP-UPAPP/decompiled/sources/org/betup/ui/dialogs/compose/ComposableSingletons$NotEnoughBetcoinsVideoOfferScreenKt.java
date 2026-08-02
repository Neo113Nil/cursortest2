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

/* compiled from: NotEnoughBetcoinsVideoOfferScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$NotEnoughBetcoinsVideoOfferScreenKt {
    public static final ComposableSingletons$NotEnoughBetcoinsVideoOfferScreenKt INSTANCE = new ComposableSingletons$NotEnoughBetcoinsVideoOfferScreenKt();

    /* renamed from: lambda$-1472686951, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3788lambda$1472686951 = ComposableLambdaKt.composableLambdaInstance(-1472686951, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$NotEnoughBetcoinsVideoOfferScreenKt$lambda$-1472686951$1
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
                ComposerKt.traceEventStart(-1472686951, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$NotEnoughBetcoinsVideoOfferScreenKt.lambda$-1472686951.<anonymous> (NotEnoughBetcoinsVideoOfferScreen.kt:70)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.not_enough_betcoins, composer, 6), null, null, false, true, true, false, composer, 1769472, 157);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1472686951$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13295getLambda$1472686951$app_release() {
        return f3788lambda$1472686951;
    }
}

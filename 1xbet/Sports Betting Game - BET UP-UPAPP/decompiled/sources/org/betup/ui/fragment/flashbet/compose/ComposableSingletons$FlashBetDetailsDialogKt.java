package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: FlashBetDetailsDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$FlashBetDetailsDialogKt {
    public static final ComposableSingletons$FlashBetDetailsDialogKt INSTANCE = new ComposableSingletons$FlashBetDetailsDialogKt();

    /* renamed from: lambda$-149302966, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3803lambda$149302966 = ComposableLambdaKt.composableLambdaInstance(-149302966, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.ComposableSingletons$FlashBetDetailsDialogKt$lambda$-149302966$1
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
                ComposerKt.traceEventStart(-149302966, i, -1, "org.betup.ui.fragment.flashbet.compose.ComposableSingletons$FlashBetDetailsDialogKt.lambda$-149302966.<anonymous> (FlashBetDetailsDialog.kt:575)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.flash_bet, composer, 6), null, null, false, false, false, false, composer, 24576, 237);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-149302966$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13686getLambda$149302966$app_release() {
        return f3803lambda$149302966;
    }
}

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

/* compiled from: MatchPushNotificationTicketScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$MatchPushNotificationTicketScreenKt {
    public static final ComposableSingletons$MatchPushNotificationTicketScreenKt INSTANCE = new ComposableSingletons$MatchPushNotificationTicketScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1280302418 = ComposableLambdaKt.composableLambdaInstance(1280302418, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$MatchPushNotificationTicketScreenKt$lambda$1280302418$1
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
                ComposerKt.traceEventStart(1280302418, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$MatchPushNotificationTicketScreenKt.lambda$1280302418.<anonymous> (MatchPushNotificationTicketScreen.kt:61)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.notification, composer, 6), null, null, false, false, false, false, composer, 24576, 237);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1280302418$app_release() {
        return lambda$1280302418;
    }
}

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

/* compiled from: TermsPrivacyDialogScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$TermsPrivacyDialogScreenKt {
    public static final ComposableSingletons$TermsPrivacyDialogScreenKt INSTANCE = new ComposableSingletons$TermsPrivacyDialogScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1225647023 = ComposableLambdaKt.composableLambdaInstance(1225647023, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$TermsPrivacyDialogScreenKt$lambda$1225647023$1
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
                ComposerKt.traceEventStart(1225647023, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$TermsPrivacyDialogScreenKt.lambda$1225647023.<anonymous> (TermsPrivacyDialogScreen.kt:46)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.terms_privacy_policy, composer, 6), null, null, false, false, false, false, composer, 0, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1225647023$app_release() {
        return lambda$1225647023;
    }
}

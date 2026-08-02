package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: DefaultBetAmountDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$DefaultBetAmountDialogFragmentKt {
    public static final ComposableSingletons$DefaultBetAmountDialogFragmentKt INSTANCE = new ComposableSingletons$DefaultBetAmountDialogFragmentKt();
    private static Function2<Composer, Integer, Unit> lambda$669260712 = ComposableLambdaKt.composableLambdaInstance(669260712, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$DefaultBetAmountDialogFragmentKt$lambda$669260712$1
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
                ComposerKt.traceEventStart(669260712, i, -1, "org.betup.ui.dialogs.ComposableSingletons$DefaultBetAmountDialogFragmentKt.lambda$669260712.<anonymous> (DefaultBetAmountDialogFragment.kt:165)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.default_bet_amount_title, composer, 6), null, null, false, true, false, false, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 221);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$669260712$app_release() {
        return lambda$669260712;
    }
}

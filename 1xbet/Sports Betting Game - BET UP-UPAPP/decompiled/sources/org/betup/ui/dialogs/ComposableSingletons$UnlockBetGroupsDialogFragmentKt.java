package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: UnlockBetGroupsDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$UnlockBetGroupsDialogFragmentKt {
    public static final ComposableSingletons$UnlockBetGroupsDialogFragmentKt INSTANCE = new ComposableSingletons$UnlockBetGroupsDialogFragmentKt();
    private static Function2<Composer, Integer, Unit> lambda$2129945851 = ComposableLambdaKt.composableLambdaInstance(2129945851, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$UnlockBetGroupsDialogFragmentKt$lambda$2129945851$1
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
                ComposerKt.traceEventStart(2129945851, i, -1, "org.betup.ui.dialogs.ComposableSingletons$UnlockBetGroupsDialogFragmentKt.lambda$2129945851.<anonymous> (UnlockBetGroupsDialogFragment.kt:224)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.dialog_bet_type_locked_title, composer, 6), null, null, false, true, true, false, composer, 1769472, 157);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2129945851$app_release() {
        return lambda$2129945851;
    }
}

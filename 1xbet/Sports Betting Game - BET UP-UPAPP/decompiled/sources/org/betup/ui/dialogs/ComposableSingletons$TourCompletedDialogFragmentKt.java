package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: TourCompletedDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$TourCompletedDialogFragmentKt {
    public static final ComposableSingletons$TourCompletedDialogFragmentKt INSTANCE = new ComposableSingletons$TourCompletedDialogFragmentKt();

    /* renamed from: lambda$-585972198, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3779lambda$585972198 = ComposableLambdaKt.composableLambdaInstance(-585972198, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$TourCompletedDialogFragmentKt$lambda$-585972198$1
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
                ComposerKt.traceEventStart(-585972198, i, -1, "org.betup.ui.dialogs.ComposableSingletons$TourCompletedDialogFragmentKt.lambda$-585972198.<anonymous> (TourCompletedDialogFragment.kt:229)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, "", null, null, true, false, false, false, composer, 24624, 237);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-585972198$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13024getLambda$585972198$app_release() {
        return f3779lambda$585972198;
    }
}

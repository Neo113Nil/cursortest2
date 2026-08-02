package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: PurchaseCompletedNewDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$PurchaseCompletedNewDialogFragmentKt {
    public static final ComposableSingletons$PurchaseCompletedNewDialogFragmentKt INSTANCE = new ComposableSingletons$PurchaseCompletedNewDialogFragmentKt();

    /* renamed from: lambda$-1198485427, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3776lambda$1198485427 = ComposableLambdaKt.composableLambdaInstance(-1198485427, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$PurchaseCompletedNewDialogFragmentKt$lambda$-1198485427$1
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
                ComposerKt.traceEventStart(-1198485427, i, -1, "org.betup.ui.dialogs.ComposableSingletons$PurchaseCompletedNewDialogFragmentKt.lambda$-1198485427.<anonymous> (PurchaseCompletedNewDialogFragment.kt:171)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, "", null, null, false, false, false, false, composer, 48, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1198485427$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13021getLambda$1198485427$app_release() {
        return f3776lambda$1198485427;
    }
}

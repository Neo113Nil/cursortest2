package org.betup.ui.dialogs.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CasinoWelcomeDialogScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CasinoWelcomeDialogScreenKt {
    public static final ComposableSingletons$CasinoWelcomeDialogScreenKt INSTANCE = new ComposableSingletons$CasinoWelcomeDialogScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$173208625 = ComposableLambdaKt.composableLambdaInstance(173208625, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$CasinoWelcomeDialogScreenKt$lambda$173208625$1
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
                ComposerKt.traceEventStart(173208625, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$CasinoWelcomeDialogScreenKt.lambda$173208625.<anonymous> (CasinoWelcomeDialogScreen.kt:64)");
            }
            CasinoWelcomeDialogScreenKt.CasinoWelcomeHeader(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1427990642 = ComposableLambdaKt.composableLambdaInstance(1427990642, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$CasinoWelcomeDialogScreenKt$lambda$1427990642$1
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
                ComposerKt.traceEventStart(1427990642, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$CasinoWelcomeDialogScreenKt.lambda$1427990642.<anonymous> (CasinoWelcomeDialogScreen.kt:71)");
            }
            CasinoWelcomeDialogScreenKt.CasinoWelcomeContent(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1427990642$app_release() {
        return lambda$1427990642;
    }

    public final Function2<Composer, Integer, Unit> getLambda$173208625$app_release() {
        return lambda$173208625;
    }
}

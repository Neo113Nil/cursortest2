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

/* compiled from: ChangeLanguageScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$ChangeLanguageScreenKt {
    public static final ComposableSingletons$ChangeLanguageScreenKt INSTANCE = new ComposableSingletons$ChangeLanguageScreenKt();

    /* renamed from: lambda$-1627593952, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3782lambda$1627593952 = ComposableLambdaKt.composableLambdaInstance(-1627593952, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$ChangeLanguageScreenKt$lambda$-1627593952$1
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
                ComposerKt.traceEventStart(-1627593952, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$ChangeLanguageScreenKt.lambda$-1627593952.<anonymous> (ChangeLanguageScreen.kt:71)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.change_display_language, composer, 6), null, null, false, false, false, false, composer, 0, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1627593952$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13289getLambda$1627593952$app_release() {
        return f3782lambda$1627593952;
    }
}

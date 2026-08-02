package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: CompetitionInfoScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CompetitionInfoScreenKt {
    public static final ComposableSingletons$CompetitionInfoScreenKt INSTANCE = new ComposableSingletons$CompetitionInfoScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1604402269 = ComposableLambdaKt.composableLambdaInstance(1604402269, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$CompetitionInfoScreenKt$lambda$1604402269$1
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
                ComposerKt.traceEventStart(1604402269, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$CompetitionInfoScreenKt.lambda$1604402269.<anonymous> (CompetitionInfoScreen.kt:60)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.competition_info, composer, 6), null, null, false, false, false, false, composer, 0, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1603605477, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3783lambda$1603605477 = ComposableLambdaKt.composableLambdaInstance(-1603605477, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ComposableSingletons$CompetitionInfoScreenKt$lambda$-1603605477$1
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
                ComposerKt.traceEventStart(-1603605477, i, -1, "org.betup.ui.dialogs.compose.ComposableSingletons$CompetitionInfoScreenKt.lambda$-1603605477.<anonymous> (CompetitionInfoScreen.kt:65)");
            }
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(34)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1603605477$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13290getLambda$1603605477$app_release() {
        return f3783lambda$1603605477;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1604402269$app_release() {
        return lambda$1604402269;
    }
}

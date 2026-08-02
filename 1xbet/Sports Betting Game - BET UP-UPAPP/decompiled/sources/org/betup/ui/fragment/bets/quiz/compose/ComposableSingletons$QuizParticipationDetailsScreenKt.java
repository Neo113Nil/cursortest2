package org.betup.ui.fragment.bets.quiz.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: QuizParticipationDetailsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$QuizParticipationDetailsScreenKt {
    public static final ComposableSingletons$QuizParticipationDetailsScreenKt INSTANCE = new ComposableSingletons$QuizParticipationDetailsScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1443205872 = ComposableLambdaKt.composableLambdaInstance(1443205872, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.quiz.compose.ComposableSingletons$QuizParticipationDetailsScreenKt$lambda$1443205872$1
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
                ComposerKt.traceEventStart(1443205872, i, -1, "org.betup.ui.fragment.bets.quiz.compose.ComposableSingletons$QuizParticipationDetailsScreenKt.lambda$1443205872.<anonymous> (QuizParticipationDetailsScreen.kt:118)");
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(46)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1443205872$app_release() {
        return lambda$1443205872;
    }
}

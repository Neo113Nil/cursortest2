package org.betup.ui.tour.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TourDemoMatchWonScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$TourDemoMatchWonScreenKt {
    public static final ComposableSingletons$TourDemoMatchWonScreenKt INSTANCE = new ComposableSingletons$TourDemoMatchWonScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$69066617 = ComposableLambdaKt.composableLambdaInstance(69066617, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.ComposableSingletons$TourDemoMatchWonScreenKt$lambda$69066617$1
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
                ComposerKt.traceEventStart(69066617, i, -1, "org.betup.ui.tour.compose.ComposableSingletons$TourDemoMatchWonScreenKt.lambda$69066617.<anonymous> (TourDemoMatchWonScreen.kt:62)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$69066617$app_release() {
        return lambda$69066617;
    }
}

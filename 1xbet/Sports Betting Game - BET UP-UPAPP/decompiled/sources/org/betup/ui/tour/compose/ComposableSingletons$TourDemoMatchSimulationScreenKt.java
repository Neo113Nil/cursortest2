package org.betup.ui.tour.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: TourDemoMatchSimulationScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$TourDemoMatchSimulationScreenKt {
    public static final ComposableSingletons$TourDemoMatchSimulationScreenKt INSTANCE = new ComposableSingletons$TourDemoMatchSimulationScreenKt();

    /* renamed from: lambda$-375947342, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3831lambda$375947342 = ComposableLambdaKt.composableLambdaInstance(-375947342, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.ComposableSingletons$TourDemoMatchSimulationScreenKt$lambda$-375947342$1
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
                ComposerKt.traceEventStart(-375947342, i, -1, "org.betup.ui.tour.compose.ComposableSingletons$TourDemoMatchSimulationScreenKt.lambda$-375947342.<anonymous> (TourDemoMatchSimulationScreen.kt:207)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.tour_demo_match, composer, 6), null, null, false, true, false, false, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 221);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1426188528 = ComposableLambdaKt.composableLambdaInstance(1426188528, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.ComposableSingletons$TourDemoMatchSimulationScreenKt$lambda$1426188528$1
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
                ComposerKt.traceEventStart(1426188528, i, -1, "org.betup.ui.tour.compose.ComposableSingletons$TourDemoMatchSimulationScreenKt.lambda$1426188528.<anonymous> (TourDemoMatchSimulationScreen.kt:212)");
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-375947342$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14343getLambda$375947342$app_release() {
        return f3831lambda$375947342;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1426188528$app_release() {
        return lambda$1426188528;
    }
}

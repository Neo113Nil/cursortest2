package org.betup.ui.tour.compose;

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

/* compiled from: TourDemoBetConfirmScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$TourDemoBetConfirmScreenKt {
    public static final ComposableSingletons$TourDemoBetConfirmScreenKt INSTANCE = new ComposableSingletons$TourDemoBetConfirmScreenKt();

    /* renamed from: lambda$-1850822798, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3830lambda$1850822798 = ComposableLambdaKt.composableLambdaInstance(-1850822798, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.ComposableSingletons$TourDemoBetConfirmScreenKt$lambda$-1850822798$1
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
                ComposerKt.traceEventStart(-1850822798, i, -1, "org.betup.ui.tour.compose.ComposableSingletons$TourDemoBetConfirmScreenKt.lambda$-1850822798.<anonymous> (TourDemoBetConfirmScreen.kt:61)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.tour_demo_match, composer, 6), null, null, false, true, false, false, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 221);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1850822798$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14342getLambda$1850822798$app_release() {
        return f3830lambda$1850822798;
    }
}

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

/* compiled from: TourOddsFormatScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$TourOddsFormatScreenKt {
    public static final ComposableSingletons$TourOddsFormatScreenKt INSTANCE = new ComposableSingletons$TourOddsFormatScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$892548522 = ComposableLambdaKt.composableLambdaInstance(892548522, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.ComposableSingletons$TourOddsFormatScreenKt$lambda$892548522$1
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
                ComposerKt.traceEventStart(892548522, i, -1, "org.betup.ui.tour.compose.ComposableSingletons$TourOddsFormatScreenKt.lambda$892548522.<anonymous> (TourOddsFormatScreen.kt:47)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.lay_odds_format, composer, 6), null, null, false, true, false, false, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 221);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$892548522$app_release() {
        return lambda$892548522;
    }
}

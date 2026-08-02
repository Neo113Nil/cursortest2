package org.betup.ui.fragment.home.compose.sections;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.fragment.home.controller.HomeVideoBonusUiState;

/* compiled from: HomePromoSection.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ComposableSingletons$HomePromoSectionKt$lambda$2060370700$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HomePromoSectionKt$lambda$2060370700$1 INSTANCE = new ComposableSingletons$HomePromoSectionKt$lambda$2060370700$1();

    ComposableSingletons$HomePromoSectionKt$lambda$2060370700$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Modifier promoCardPreviewSize;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2060370700, i, -1, "org.betup.ui.fragment.home.compose.sections.ComposableSingletons$HomePromoSectionKt.lambda$2060370700.<anonymous> (HomePromoSection.kt:798)");
        }
        HomeVideoBonusUiState homeVideoBonusUiState = new HomeVideoBonusUiState(false, VideoOfferAvailabilityPhase.COOLDOWN, 5000L, 5000L, 1, 3, Long.valueOf(System.currentTimeMillis() + 2700000), false);
        long currentTimeMillis = System.currentTimeMillis();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.sections.ComposableSingletons$HomePromoSectionKt$lambda$2060370700$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        promoCardPreviewSize = HomePromoSectionKt.promoCardPreviewSize(Modifier.INSTANCE);
        HomePromoSectionKt.HomeVideoRewardCard(homeVideoBonusUiState, currentTimeMillis, (Function0) rememberedValue, null, false, promoCardPreviewSize, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

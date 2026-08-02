package org.betup.ui.fragment.home.compose.sections;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.fragment.home.controller.HomeVideoBonusUiState;

/* compiled from: HomePromoSection.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: org.betup.ui.fragment.home.compose.sections.ComposableSingletons$HomePromoSectionKt$lambda$-821409083$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$HomePromoSectionKt$lambda$821409083$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HomePromoSectionKt$lambda$821409083$1 INSTANCE = new ComposableSingletons$HomePromoSectionKt$lambda$821409083$1();

    ComposableSingletons$HomePromoSectionKt$lambda$821409083$1() {
    }

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
            ComposerKt.traceEventStart(-821409083, i, -1, "org.betup.ui.fragment.home.compose.sections.ComposableSingletons$HomePromoSectionKt.lambda$-821409083.<anonymous> (HomePromoSection.kt:768)");
        }
        HomeVideoBonusUiState homeVideoBonusUiState = new HomeVideoBonusUiState(true, VideoOfferAvailabilityPhase.READY, 500L, 500L, 1, 3, null, false, 64, null);
        long currentTimeMillis = System.currentTimeMillis();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.sections.ComposableSingletons$HomePromoSectionKt$lambda$-821409083$1$$ExternalSyntheticLambda0
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
        HomePromoSectionKt.HomeVideoRewardCard(homeVideoBonusUiState, currentTimeMillis, (Function0) rememberedValue, null, true, SizeKt.m1549height3ABfNKs(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PromoCardArt.INSTANCE.m13839getEXPANDED_VIDEO_ROW_HORIZONTAL_PADDINGD9Ej5fM(), 0.0f, 2, null), PromoCardArt.INSTANCE.m13838getCARD_HEIGHTD9Ej5fM()), composer, 221568, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

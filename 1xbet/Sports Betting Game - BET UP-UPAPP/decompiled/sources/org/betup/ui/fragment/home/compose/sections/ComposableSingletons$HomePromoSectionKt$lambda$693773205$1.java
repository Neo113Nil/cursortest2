package org.betup.ui.fragment.home.compose.sections;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: HomePromoSection.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: org.betup.ui.fragment.home.compose.sections.ComposableSingletons$HomePromoSectionKt$lambda$-693773205$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$HomePromoSectionKt$lambda$693773205$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HomePromoSectionKt$lambda$693773205$1 INSTANCE = new ComposableSingletons$HomePromoSectionKt$lambda$693773205$1();

    ComposableSingletons$HomePromoSectionKt$lambda$693773205$1() {
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
            ComposerKt.traceEventStart(-693773205, i, -1, "org.betup.ui.fragment.home.compose.sections.ComposableSingletons$HomePromoSectionKt.lambda$-693773205.<anonymous> (HomePromoSection.kt:722)");
        }
        long currentTimeMillis = System.currentTimeMillis();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.sections.ComposableSingletons$HomePromoSectionKt$lambda$-693773205$1$$ExternalSyntheticLambda0
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
        HomePromoSectionKt.HomeSpecialOfferCard(false, null, null, currentTimeMillis, (Function0) rememberedValue, promoCardPreviewSize, composer, 25014, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

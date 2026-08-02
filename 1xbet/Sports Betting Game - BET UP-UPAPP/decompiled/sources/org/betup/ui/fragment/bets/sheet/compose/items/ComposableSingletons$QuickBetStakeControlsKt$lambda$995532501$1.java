package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: QuickBetStakeControls.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ComposableSingletons$QuickBetStakeControlsKt$lambda$995532501$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$QuickBetStakeControlsKt$lambda$995532501$1 INSTANCE = new ComposableSingletons$QuickBetStakeControlsKt$lambda$995532501$1();

    ComposableSingletons$QuickBetStakeControlsKt$lambda$995532501$1() {
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
            ComposerKt.traceEventStart(995532501, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.ComposableSingletons$QuickBetStakeControlsKt.lambda$995532501.<anonymous> (QuickBetStakeControls.kt:117)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.ComposableSingletons$QuickBetStakeControlsKt$lambda$995532501$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ComposableSingletons$QuickBetStakeControlsKt$lambda$995532501$1.invoke$lambda$1$lambda$0(((Long) obj).longValue());
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        QuickBetStakeControlsKt.QuickBetStakeControls(1000L, 5630L, 100L, (Function1) rememberedValue, null, composer, 3510, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(long j) {
        return Unit.INSTANCE;
    }
}

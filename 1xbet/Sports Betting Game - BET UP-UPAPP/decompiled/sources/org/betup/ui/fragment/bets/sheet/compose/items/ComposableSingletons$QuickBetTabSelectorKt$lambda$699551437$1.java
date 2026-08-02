package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuickBetTabSelector.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ComposableSingletons$QuickBetTabSelectorKt$lambda$699551437$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$QuickBetTabSelectorKt$lambda$699551437$1 INSTANCE = new ComposableSingletons$QuickBetTabSelectorKt$lambda$699551437$1();

    ComposableSingletons$QuickBetTabSelectorKt$lambda$699551437$1() {
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
            ComposerKt.traceEventStart(699551437, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.ComposableSingletons$QuickBetTabSelectorKt.lambda$699551437.<anonymous> (QuickBetTabSelector.kt:134)");
        }
        QuickBetTab quickBetTab = QuickBetTab.SINGLE;
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.ComposableSingletons$QuickBetTabSelectorKt$lambda$699551437$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ComposableSingletons$QuickBetTabSelectorKt$lambda$699551437$1.invoke$lambda$1$lambda$0((QuickBetTab) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        QuickBetTabSelectorKt.QuickBetTabSelector(quickBetTab, (Function1) rememberedValue, null, false, composer, 54, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(QuickBetTab it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

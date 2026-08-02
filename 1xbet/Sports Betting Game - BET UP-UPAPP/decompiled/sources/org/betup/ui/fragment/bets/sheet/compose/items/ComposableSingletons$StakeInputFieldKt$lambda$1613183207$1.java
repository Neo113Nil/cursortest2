package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: StakeInputField.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: org.betup.ui.fragment.bets.sheet.compose.items.ComposableSingletons$StakeInputFieldKt$lambda$-1613183207$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$StakeInputFieldKt$lambda$1613183207$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$StakeInputFieldKt$lambda$1613183207$1 INSTANCE = new ComposableSingletons$StakeInputFieldKt$lambda$1613183207$1();

    ComposableSingletons$StakeInputFieldKt$lambda$1613183207$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(long j) {
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1613183207, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.ComposableSingletons$StakeInputFieldKt.lambda$-1613183207.<anonymous> (StakeInputField.kt:136)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.ComposableSingletons$StakeInputFieldKt$lambda$-1613183207$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ComposableSingletons$StakeInputFieldKt$lambda$1613183207$1.invoke$lambda$1$lambda$0(((Long) obj).longValue());
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        StakeInputFieldKt.StakeInputField(1000L, (Function1) rememberedValue, null, composer, 54, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

package org.betup.ui.dialogs.compose.stepsChallenges;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.dialogs.controller.MatchSelectionController;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: MatchesStep.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MatchesStepKt$MatchesStep$3$1$2$1$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ MatchSelectionController $controller;
    final /* synthetic */ State<List<NewMatchItemModel>> $matches$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    MatchesStepKt$MatchesStep$3$1$2$1$1(MatchSelectionController matchSelectionController, State<? extends List<NewMatchItemModel>> state) {
        this.$controller = matchSelectionController;
        this.$matches$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MatchSelectionController matchSelectionController, NewMatchItemModel newMatchItemModel) {
        matchSelectionController.selectMatch(newMatchItemModel);
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
        List MatchesStep$lambda$0;
        List MatchesStep$lambda$02;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if ((i2 & Opcodes.I2B) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(261563866, i2, -1, "org.betup.ui.dialogs.compose.stepsChallenges.MatchesStep.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MatchesStep.kt:104)");
        }
        MatchesStep$lambda$0 = MatchesStepKt.MatchesStep$lambda$0(this.$matches$delegate);
        final NewMatchItemModel newMatchItemModel = (NewMatchItemModel) MatchesStep$lambda$0.get(i);
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = composer.changedInstance(this.$controller) | composer.changedInstance(newMatchItemModel);
        final MatchSelectionController matchSelectionController = this.$controller;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$MatchesStep$3$1$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MatchesStepKt$MatchesStep$3$1$2$1$1.invoke$lambda$1$lambda$0(MatchSelectionController.this, newMatchItemModel);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        MatchesStepKt.NewMatchItem(newMatchItemModel, (Function0) rememberedValue, null, true, composer, 3072, 4);
        MatchesStep$lambda$02 = MatchesStepKt.MatchesStep$lambda$0(this.$matches$delegate);
        if (i < MatchesStep$lambda$02.size() - 1) {
            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(1)), BattleFlowDimens.INSTANCE.m13172getMatchDividerInsetD9Ej5fM(), 0.0f, 2, null), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), null, 2, null), composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.compose.BetSelectionScreenKt;
import org.betup.ui.dialogs.controller.BetSelectionController;
import org.betup.ui.dialogs.events.BattleBackToMatchesEvent;
import org.betup.utils.NavigationHelper;
import org.greenrobot.eventbus.EventBus;

/* compiled from: SelectBetDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectBetDialogFragment$onCreateView$3$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SelectBetDialogFragment this$0;

    SelectBetDialogFragment$onCreateView$3$1(SelectBetDialogFragment selectBetDialogFragment) {
        this.this$0 = selectBetDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int i2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-446213059, i, -1, "org.betup.ui.dialogs.SelectBetDialogFragment.onCreateView.<anonymous>.<anonymous> (SelectBetDialogFragment.kt:64)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        BetSelectionController controller = this.this$0.getController();
        i2 = this.this$0.allSportId;
        boolean z = i2 != 0;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final SelectBetDialogFragment selectBetDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.SelectBetDialogFragment$onCreateView$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SelectBetDialogFragment$onCreateView$3$1.invoke$lambda$1$lambda$0(SelectBetDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final SelectBetDialogFragment selectBetDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.SelectBetDialogFragment$onCreateView$3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = SelectBetDialogFragment$onCreateView$3$1.invoke$lambda$3$lambda$2(SelectBetDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final SelectBetDialogFragment selectBetDialogFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function2() { // from class: org.betup.ui.dialogs.SelectBetDialogFragment$onCreateView$3$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = SelectBetDialogFragment$onCreateView$3$1.invoke$lambda$5$lambda$4(SelectBetDialogFragment.this, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        BetSelectionScreenKt.BetSelectionScreen(fillMaxSize$default, controller, function0, function02, z, (Function2) rememberedValue3, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SelectBetDialogFragment selectBetDialogFragment) {
        selectBetDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(SelectBetDialogFragment selectBetDialogFragment, int i, boolean z) {
        selectBetDialogFragment.dismiss();
        NavigationHelper.navigateToLeagueMatches$default(NavigationHelper.INSTANCE, i, z, (String) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SelectBetDialogFragment selectBetDialogFragment) {
        int i;
        int i2;
        Long l;
        selectBetDialogFragment.dismiss();
        EventBus eventBus = EventBus.getDefault();
        i = selectBetDialogFragment.allLeagueId;
        i2 = selectBetDialogFragment.allSportId;
        l = selectBetDialogFragment.userId;
        eventBus.post(new BattleBackToMatchesEvent(i, i2, l));
        return Unit.INSTANCE;
    }
}

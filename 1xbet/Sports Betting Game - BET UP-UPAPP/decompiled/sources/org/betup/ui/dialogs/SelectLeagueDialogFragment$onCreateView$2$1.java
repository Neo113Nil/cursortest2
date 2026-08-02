package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.compose.LeagueSelectionScreenKt;
import org.betup.ui.dialogs.controller.LeagueSelectionController;
import org.betup.ui.dialogs.events.BattleBackToSportsEvent;
import org.greenrobot.eventbus.EventBus;

/* compiled from: SelectLeagueDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectLeagueDialogFragment$onCreateView$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SelectLeagueDialogFragment this$0;

    SelectLeagueDialogFragment$onCreateView$2$1(SelectLeagueDialogFragment selectLeagueDialogFragment) {
        this.this$0 = selectLeagueDialogFragment;
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
            ComposerKt.traceEventStart(-765252743, i, -1, "org.betup.ui.dialogs.SelectLeagueDialogFragment.onCreateView.<anonymous>.<anonymous> (SelectLeagueDialogFragment.kt:45)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        LeagueSelectionController controller = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final SelectLeagueDialogFragment selectLeagueDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.SelectLeagueDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SelectLeagueDialogFragment$onCreateView$2$1.invoke$lambda$1$lambda$0(SelectLeagueDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final SelectLeagueDialogFragment selectLeagueDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.SelectLeagueDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = SelectLeagueDialogFragment$onCreateView$2$1.invoke$lambda$3$lambda$2(SelectLeagueDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        LeagueSelectionScreenKt.LeagueSelectionScreen(fillMaxSize$default, controller, function0, (Function0) rememberedValue2, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SelectLeagueDialogFragment selectLeagueDialogFragment) {
        selectLeagueDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SelectLeagueDialogFragment selectLeagueDialogFragment) {
        Long l;
        selectLeagueDialogFragment.dismiss();
        EventBus eventBus = EventBus.getDefault();
        l = selectLeagueDialogFragment.userId;
        eventBus.post(new BattleBackToSportsEvent(l));
        return Unit.INSTANCE;
    }
}

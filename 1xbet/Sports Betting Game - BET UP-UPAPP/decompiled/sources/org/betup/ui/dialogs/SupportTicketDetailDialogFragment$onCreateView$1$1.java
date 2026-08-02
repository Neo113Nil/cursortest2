package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.ui.fragment.support.compose.SupportCallbacks;
import org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt;
import org.betup.ui.fragment.support.compose.SupportTicketDetailState;
import org.betup.ui.fragment.support.compose.SupportUiState;
import org.betup.ui.fragment.support.controller.SupportController;

/* compiled from: SupportTicketDetailDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SupportTicketDetailDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SupportTicketDetailDialogFragment this$0;

    SupportTicketDetailDialogFragment$onCreateView$1$1(SupportTicketDetailDialogFragment supportTicketDetailDialogFragment) {
        this.this$0 = supportTicketDetailDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SupportController supportController;
        final SupportCallbacks supportCallbacks;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363911409, i, -1, "org.betup.ui.dialogs.SupportTicketDetailDialogFragment.onCreateView.<anonymous>.<anonymous> (SupportTicketDetailDialogFragment.kt:46)");
        }
        supportController = this.this$0.controller;
        supportCallbacks = this.this$0.callbacks;
        if (supportController != null && supportCallbacks != null) {
            SupportTicketDetailState ticketDetailState = invoke$lambda$0(SnapshotStateKt.collectAsState(supportController.getUiState(), null, composer, 0, 1)).getTicketDetailState();
            Function1<String, Unit> onRefreshTicketMessages = supportCallbacks.getOnRefreshTicketMessages();
            Function1<String, Unit> onLoadMoreTicketMessages = supportCallbacks.getOnLoadMoreTicketMessages();
            Function2<String, String, Unit> onSendTicketMessage = supportCallbacks.getOnSendTicketMessage();
            Function1<String, Unit> onCloseTicket = supportCallbacks.getOnCloseTicket();
            composer.startReplaceGroup(-1633490746);
            boolean changed = composer.changed(supportCallbacks) | composer.changedInstance(this.this$0);
            final SupportTicketDetailDialogFragment supportTicketDetailDialogFragment = this.this$0;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.SupportTicketDetailDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$2$lambda$1;
                        invoke$lambda$2$lambda$1 = SupportTicketDetailDialogFragment$onCreateView$1$1.invoke$lambda$2$lambda$1(SupportCallbacks.this, supportTicketDetailDialogFragment);
                        return invoke$lambda$2$lambda$1;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            SupportTicketDetailScreenKt.SupportTicketDetailContent(ticketDetailState, onRefreshTicketMessages, onLoadMoreTicketMessages, onSendTicketMessage, onCloseTicket, (Function0) rememberedValue, Modifier.INSTANCE, composer, 1572864, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(SupportCallbacks supportCallbacks, SupportTicketDetailDialogFragment supportTicketDetailDialogFragment) {
        supportCallbacks.getOnBackFromTicketDetail().invoke();
        supportTicketDetailDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    private static final SupportUiState invoke$lambda$0(State<SupportUiState> state) {
        return state.getValue();
    }
}

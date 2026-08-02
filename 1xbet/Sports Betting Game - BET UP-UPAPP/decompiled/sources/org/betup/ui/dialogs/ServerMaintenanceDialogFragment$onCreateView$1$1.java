package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.compose.ServerMaintenanceScreenKt;

/* compiled from: ServerMaintenanceDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ServerMaintenanceDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ServerMaintenanceDialogFragment this$0;

    ServerMaintenanceDialogFragment$onCreateView$1$1(ServerMaintenanceDialogFragment serverMaintenanceDialogFragment) {
        this.this$0 = serverMaintenanceDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String str;
        String str2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1261378695, i, -1, "org.betup.ui.dialogs.ServerMaintenanceDialogFragment.onCreateView.<anonymous>.<anonymous> (ServerMaintenanceDialogFragment.kt:33)");
        }
        str = this.this$0.title;
        str2 = this.this$0.message;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final ServerMaintenanceDialogFragment serverMaintenanceDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.ServerMaintenanceDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ServerMaintenanceDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(ServerMaintenanceDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ServerMaintenanceScreenKt.ServerMaintenanceScreen(str, str2, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ServerMaintenanceDialogFragment serverMaintenanceDialogFragment) {
        Function0 function0;
        function0 = serverMaintenanceDialogFragment.onDismissListener;
        if (function0 != null) {
            function0.invoke();
        }
        serverMaintenanceDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}

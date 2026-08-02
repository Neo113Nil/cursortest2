package org.betup.ui.dialogs;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.bus.NavigateMessage;
import org.betup.ui.dialogs.compose.MatchPushNotificationTicketScreenKt;
import org.greenrobot.eventbus.EventBus;

/* compiled from: MatchNotificationComposeDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MatchNotificationComposeDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ int $matchId;
    final /* synthetic */ String $subtitleLine;
    final /* synthetic */ String $titleLine;
    final /* synthetic */ MatchNotificationComposeDialogFragment this$0;

    MatchNotificationComposeDialogFragment$onCreateView$1$1(String str, String str2, String str3, MatchNotificationComposeDialogFragment matchNotificationComposeDialogFragment, int i) {
        this.$titleLine = str;
        this.$subtitleLine = str2;
        this.$imageUrl = str3;
        this.this$0 = matchNotificationComposeDialogFragment;
        this.$matchId = i;
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
            ComposerKt.traceEventStart(251580441, i, -1, "org.betup.ui.dialogs.MatchNotificationComposeDialogFragment.onCreateView.<anonymous>.<anonymous> (MatchNotificationComposeDialogFragment.kt:36)");
        }
        String str = this.$titleLine;
        String str2 = this.$subtitleLine;
        String str3 = this.$imageUrl;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final MatchNotificationComposeDialogFragment matchNotificationComposeDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.MatchNotificationComposeDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MatchNotificationComposeDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(MatchNotificationComposeDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance2 = composer.changedInstance(this.this$0) | composer.changed(this.$matchId);
        final MatchNotificationComposeDialogFragment matchNotificationComposeDialogFragment2 = this.this$0;
        final int i2 = this.$matchId;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.MatchNotificationComposeDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = MatchNotificationComposeDialogFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(MatchNotificationComposeDialogFragment.this, i2);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        MatchPushNotificationTicketScreenKt.MatchPushNotificationTicketScreen(str, str2, str3, function0, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MatchNotificationComposeDialogFragment matchNotificationComposeDialogFragment) {
        matchNotificationComposeDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(MatchNotificationComposeDialogFragment matchNotificationComposeDialogFragment, int i) {
        matchNotificationComposeDialogFragment.dismissAllowingStateLoss();
        if (i > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt("matchId", i);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
        }
        return Unit.INSTANCE;
    }
}

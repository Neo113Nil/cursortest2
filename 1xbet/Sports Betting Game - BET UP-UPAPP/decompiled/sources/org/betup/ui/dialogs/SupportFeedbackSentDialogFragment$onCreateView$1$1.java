package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: SupportFeedbackSentDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SupportFeedbackSentDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SupportFeedbackSentDialogFragment this$0;

    SupportFeedbackSentDialogFragment$onCreateView$1$1(SupportFeedbackSentDialogFragment supportFeedbackSentDialogFragment) {
        this.this$0 = supportFeedbackSentDialogFragment;
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
            ComposerKt.traceEventStart(-1284304753, i, -1, "org.betup.ui.dialogs.SupportFeedbackSentDialogFragment.onCreateView.<anonymous>.<anonymous> (SupportFeedbackSentDialogFragment.kt:59)");
        }
        str = this.this$0.messageType;
        str2 = this.this$0.replyEmail;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final SupportFeedbackSentDialogFragment supportFeedbackSentDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.SupportFeedbackSentDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SupportFeedbackSentDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(SupportFeedbackSentDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        SupportFeedbackSentDialogFragmentKt.SupportFeedbackSentContent(str, str2, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SupportFeedbackSentDialogFragment supportFeedbackSentDialogFragment) {
        supportFeedbackSentDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}

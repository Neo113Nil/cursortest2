package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.compose.TermsPrivacyDialogScreenKt;

/* compiled from: TermsPrivacyDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TermsPrivacyDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TermsPrivacyDialogFragment this$0;

    TermsPrivacyDialogFragment$onCreateView$1$1(TermsPrivacyDialogFragment termsPrivacyDialogFragment) {
        this.this$0 = termsPrivacyDialogFragment;
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
            ComposerKt.traceEventStart(-648629575, i, -1, "org.betup.ui.dialogs.TermsPrivacyDialogFragment.onCreateView.<anonymous>.<anonymous> (TermsPrivacyDialogFragment.kt:34)");
        }
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final TermsPrivacyDialogFragment termsPrivacyDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.TermsPrivacyDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = TermsPrivacyDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(TermsPrivacyDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        TermsPrivacyDialogScreenKt.TermsPrivacyDialogScreen((Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TermsPrivacyDialogFragment termsPrivacyDialogFragment) {
        Function0 function0;
        TermsPrivacyDialogCallback termsPrivacyDialogCallback;
        function0 = termsPrivacyDialogFragment.onAcceptClick;
        if (function0 != null) {
            function0.invoke();
        }
        termsPrivacyDialogCallback = termsPrivacyDialogFragment.onAcceptCallback;
        if (termsPrivacyDialogCallback != null) {
            termsPrivacyDialogCallback.onAccept();
        }
        termsPrivacyDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}

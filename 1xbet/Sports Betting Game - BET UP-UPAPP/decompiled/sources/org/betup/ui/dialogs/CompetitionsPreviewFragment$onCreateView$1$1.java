package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController;

/* compiled from: CompetitionsPreviewFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CompetitionsPreviewFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CompetitionsPreviewFragment this$0;

    CompetitionsPreviewFragment$onCreateView$1$1(CompetitionsPreviewFragment competitionsPreviewFragment) {
        this.this$0 = competitionsPreviewFragment;
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
            ComposerKt.traceEventStart(-2107845041, i, -1, "org.betup.ui.dialogs.CompetitionsPreviewFragment.onCreateView.<anonymous>.<anonymous> (CompetitionsPreviewFragment.kt:80)");
        }
        CompetitionDetailsController controller = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final CompetitionsPreviewFragment competitionsPreviewFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.CompetitionsPreviewFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = CompetitionsPreviewFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(CompetitionsPreviewFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CompetitionPreviewScreenKt.CompetitionPreviewScreen(controller, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CompetitionsPreviewFragment competitionsPreviewFragment) {
        competitionsPreviewFragment.dismiss();
        return Unit.INSTANCE;
    }
}

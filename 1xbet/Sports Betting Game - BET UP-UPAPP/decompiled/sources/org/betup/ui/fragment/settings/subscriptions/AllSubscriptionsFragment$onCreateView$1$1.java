package org.betup.ui.fragment.settings.subscriptions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.bus.NavigateMessage;
import org.betup.ui.fragment.settings.subscriptions.compose.AllSubscriptionsScreenKt;
import org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController;
import org.greenrobot.eventbus.EventBus;

/* compiled from: AllSubscriptionsFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AllSubscriptionsFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AllSubscriptionsFragment this$0;

    AllSubscriptionsFragment$onCreateView$1$1(AllSubscriptionsFragment allSubscriptionsFragment) {
        this.this$0 = allSubscriptionsFragment;
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
            ComposerKt.traceEventStart(981927259, i, -1, "org.betup.ui.fragment.settings.subscriptions.AllSubscriptionsFragment.onCreateView.<anonymous>.<anonymous> (AllSubscriptionsFragment.kt:40)");
        }
        AllSubscriptionsController controller = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final AllSubscriptionsFragment allSubscriptionsFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.settings.subscriptions.AllSubscriptionsFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = AllSubscriptionsFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(AllSubscriptionsFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final AllSubscriptionsFragment allSubscriptionsFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.settings.subscriptions.AllSubscriptionsFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = AllSubscriptionsFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(AllSubscriptionsFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        AllSubscriptionsScreenKt.AllSubscriptionsScreen(controller, function0, (Function0) rememberedValue2, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(AllSubscriptionsFragment allSubscriptionsFragment) {
        allSubscriptionsFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(AllSubscriptionsFragment allSubscriptionsFragment) {
        allSubscriptionsFragment.dismiss();
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TOP_MATCHES, null));
        return Unit.INSTANCE;
    }
}

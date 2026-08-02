package org.betup.ui.fragment.notifications;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.Event;
import org.betup.ui.fragment.notifications.compose.NotificationsScreenKt;
import org.betup.ui.fragment.notifications.controller.NotificationsController;

/* compiled from: NotificationsFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationsFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ NotificationsFragment this$0;

    NotificationsFragment$onCreateView$1$1(NotificationsFragment notificationsFragment) {
        this.this$0 = notificationsFragment;
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
            ComposerKt.traceEventStart(-1925266448, i, -1, "org.betup.ui.fragment.notifications.NotificationsFragment.onCreateView.<anonymous>.<anonymous> (NotificationsFragment.kt:41)");
        }
        NotificationsController notificationsController = this.this$0.getNotificationsController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final NotificationsFragment notificationsFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.notifications.NotificationsFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = NotificationsFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(NotificationsFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final NotificationsFragment notificationsFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.notifications.NotificationsFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = NotificationsFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(NotificationsFragment.this, (Event) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        NotificationsScreenKt.NotificationsScreen(notificationsController, function0, (Function1) rememberedValue2, null, composer, 0, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(NotificationsFragment notificationsFragment) {
        notificationsFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(NotificationsFragment notificationsFragment, Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        notificationsFragment.openNotificationDialog(event);
        return Unit.INSTANCE;
    }
}

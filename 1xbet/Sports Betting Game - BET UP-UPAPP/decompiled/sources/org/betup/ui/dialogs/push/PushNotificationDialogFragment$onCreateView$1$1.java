package org.betup.ui.dialogs.push;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PushNotificationDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PushNotificationDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PushNotificationDialogFragment this$0;

    PushNotificationDialogFragment$onCreateView$1$1(PushNotificationDialogFragment pushNotificationDialogFragment) {
        this.this$0 = pushNotificationDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        final PushNotificationData pushNotificationData;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1325281295, i, -1, "org.betup.ui.dialogs.push.PushNotificationDialogFragment.onCreateView.<anonymous>.<anonymous> (PushNotificationDialogFragment.kt:66)");
        }
        pushNotificationData = this.this$0.notificationData;
        if (pushNotificationData != null) {
            composer.startReplaceGroup(-1633490746);
            boolean changed = composer.changed(pushNotificationData) | composer.changedInstance(this.this$0);
            PushNotificationDialogFragment pushNotificationDialogFragment = this.this$0;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new PushNotificationDialogFragment$onCreateView$1$1$1$1(pushNotificationData, pushNotificationDialogFragment, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(pushNotificationData, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean changedInstance = composer.changedInstance(this.this$0) | composer.changed(pushNotificationData);
            final PushNotificationDialogFragment pushNotificationDialogFragment2 = this.this$0;
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.push.PushNotificationDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$2$lambda$1;
                        invoke$lambda$2$lambda$1 = PushNotificationDialogFragment$onCreateView$1$1.invoke$lambda$2$lambda$1(PushNotificationDialogFragment.this, pushNotificationData);
                        return invoke$lambda$2$lambda$1;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance2 = composer.changedInstance(this.this$0);
            final PushNotificationDialogFragment pushNotificationDialogFragment3 = this.this$0;
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.push.PushNotificationDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$4$lambda$3;
                        invoke$lambda$4$lambda$3 = PushNotificationDialogFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(PushNotificationDialogFragment.this);
                        return invoke$lambda$4$lambda$3;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            PushNotificationScreenKt.PushNotificationScreen(pushNotificationData, function0, (Function0) rememberedValue3, composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(PushNotificationDialogFragment pushNotificationDialogFragment, PushNotificationData pushNotificationData) {
        pushNotificationDialogFragment.pendingActionOnDismiss = pushNotificationData;
        pushNotificationDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(PushNotificationDialogFragment pushNotificationDialogFragment) {
        pushNotificationDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}

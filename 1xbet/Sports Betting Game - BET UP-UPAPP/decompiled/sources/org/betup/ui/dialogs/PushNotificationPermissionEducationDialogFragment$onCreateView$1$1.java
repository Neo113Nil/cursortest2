package org.betup.ui.dialogs;

import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.utils.NotificationsPermissionUtil;

/* compiled from: PushNotificationPermissionEducationDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PushNotificationPermissionEducationDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PushNotificationPermissionEducationDialogFragment this$0;

    PushNotificationPermissionEducationDialogFragment$onCreateView$1$1(PushNotificationPermissionEducationDialogFragment pushNotificationPermissionEducationDialogFragment) {
        this.this$0 = pushNotificationPermissionEducationDialogFragment;
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
            ComposerKt.traceEventStart(234908287, i, -1, "org.betup.ui.dialogs.PushNotificationPermissionEducationDialogFragment.onCreateView.<anonymous>.<anonymous> (PushNotificationPermissionEducationDialogFragment.kt:52)");
        }
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final PushNotificationPermissionEducationDialogFragment pushNotificationPermissionEducationDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.PushNotificationPermissionEducationDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = PushNotificationPermissionEducationDialogFragment$onCreateView$1$1.invoke$lambda$2$lambda$1(PushNotificationPermissionEducationDialogFragment.this);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final PushNotificationPermissionEducationDialogFragment pushNotificationPermissionEducationDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.PushNotificationPermissionEducationDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = PushNotificationPermissionEducationDialogFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(PushNotificationPermissionEducationDialogFragment.this);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        PushNotificationPermissionEducationDialogFragmentKt.PushNotificationPermissionEducationSheet(function0, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(PushNotificationPermissionEducationDialogFragment pushNotificationPermissionEducationDialogFragment) {
        View decorView;
        FragmentActivity activity = pushNotificationPermissionEducationDialogFragment.getActivity();
        final AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity == null) {
            return Unit.INSTANCE;
        }
        pushNotificationPermissionEducationDialogFragment.dismiss();
        Window window = appCompatActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new Runnable() { // from class: org.betup.ui.dialogs.PushNotificationPermissionEducationDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PushNotificationPermissionEducationDialogFragment$onCreateView$1$1.invoke$lambda$2$lambda$1$lambda$0(AppCompatActivity.this);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1$lambda$0(AppCompatActivity appCompatActivity) {
        if (appCompatActivity.isFinishing()) {
            return;
        }
        NotificationsPermissionUtil.askPermissions(appCompatActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(PushNotificationPermissionEducationDialogFragment pushNotificationPermissionEducationDialogFragment) {
        pushNotificationPermissionEducationDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}

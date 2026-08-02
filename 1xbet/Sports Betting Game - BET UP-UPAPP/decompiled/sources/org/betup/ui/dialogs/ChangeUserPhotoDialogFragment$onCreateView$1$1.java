package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.services.user.UserServiceAccessor;
import org.betup.ui.dialogs.ChangeUserPhotoDialogFragment;

/* compiled from: ChangeUserPhotoDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChangeUserPhotoDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ChangeUserPhotoDialogFragment this$0;

    ChangeUserPhotoDialogFragment$onCreateView$1$1(ChangeUserPhotoDialogFragment changeUserPhotoDialogFragment) {
        this.this$0 = changeUserPhotoDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        UserServiceAccessor userServiceAccessor;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(529477113, i, -1, "org.betup.ui.dialogs.ChangeUserPhotoDialogFragment.onCreateView.<anonymous>.<anonymous> (ChangeUserPhotoDialogFragment.kt:68)");
        }
        userServiceAccessor = this.this$0.userServiceAccessor;
        String photoUrl = userServiceAccessor.getUserService().getShortProfile().getUserModel().getPhotoUrl();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final ChangeUserPhotoDialogFragment changeUserPhotoDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.ChangeUserPhotoDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ChangeUserPhotoDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(ChangeUserPhotoDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final ChangeUserPhotoDialogFragment changeUserPhotoDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.ChangeUserPhotoDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = ChangeUserPhotoDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(ChangeUserPhotoDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final ChangeUserPhotoDialogFragment changeUserPhotoDialogFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.ChangeUserPhotoDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = ChangeUserPhotoDialogFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(ChangeUserPhotoDialogFragment.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        ChangeUserPhotoDialogFragmentKt.ChangeUserPhotoDialogContent(photoUrl, function0, function02, (Function0) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ChangeUserPhotoDialogFragment changeUserPhotoDialogFragment) {
        ChangeUserPhotoDialogFragment.OnPhotoDialogClickListener onPhotoDialogClickListener;
        onPhotoDialogClickListener = changeUserPhotoDialogFragment.onPhotoDialogClickListener;
        if (onPhotoDialogClickListener != null) {
            onPhotoDialogClickListener.onFromCameraClick();
        }
        changeUserPhotoDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ChangeUserPhotoDialogFragment changeUserPhotoDialogFragment) {
        ChangeUserPhotoDialogFragment.OnPhotoDialogClickListener onPhotoDialogClickListener;
        onPhotoDialogClickListener = changeUserPhotoDialogFragment.onPhotoDialogClickListener;
        if (onPhotoDialogClickListener != null) {
            onPhotoDialogClickListener.onFromGalleryClick();
        }
        changeUserPhotoDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(ChangeUserPhotoDialogFragment changeUserPhotoDialogFragment) {
        changeUserPhotoDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}

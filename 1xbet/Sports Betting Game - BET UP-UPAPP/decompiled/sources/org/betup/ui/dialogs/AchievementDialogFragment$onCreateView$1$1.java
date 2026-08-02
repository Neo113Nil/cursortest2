package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.bus.ShareMessage;
import org.betup.utils.InAppReviewHelper;
import org.greenrobot.eventbus.EventBus;

/* compiled from: AchievementDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AchievementDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AchievementDialogFragment this$0;

    AchievementDialogFragment$onCreateView$1$1(AchievementDialogFragment achievementDialogFragment) {
        this.this$0 = achievementDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        boolean z;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-435825335, i, -1, "org.betup.ui.dialogs.AchievementDialogFragment.onCreateView.<anonymous>.<anonymous> (AchievementDialogFragment.kt:81)");
        }
        str = this.this$0.title;
        String str4 = str == null ? "" : str;
        str2 = this.this$0.subtitle;
        String str5 = str2 == null ? "" : str2;
        str3 = this.this$0.icon;
        i2 = this.this$0.price;
        z = this.this$0.isUltimateAchievement;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final AchievementDialogFragment achievementDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.AchievementDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = AchievementDialogFragment$onCreateView$1$1.invoke$lambda$2$lambda$1(AchievementDialogFragment.this);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final AchievementDialogFragment achievementDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.AchievementDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = AchievementDialogFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(AchievementDialogFragment.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final AchievementDialogFragment achievementDialogFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.AchievementDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = AchievementDialogFragment$onCreateView$1$1.invoke$lambda$8$lambda$7(AchievementDialogFragment.this);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function03 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final AchievementDialogFragment achievementDialogFragment4 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.AchievementDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$11$lambda$10;
                    invoke$lambda$11$lambda$10 = AchievementDialogFragment$onCreateView$1$1.invoke$lambda$11$lambda$10(AchievementDialogFragment.this);
                    return invoke$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        AchievementDialogFragmentKt.AchievementContent(str4, str5, str3, i2, z, function0, function02, function03, (Function0) rememberedValue4, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(AchievementDialogFragment achievementDialogFragment) {
        boolean z;
        int i;
        FragmentActivity activity;
        z = achievementDialogFragment.dismissed;
        if (!z) {
            achievementDialogFragment.dismissed = true;
            achievementDialogFragment.dismiss();
            i = achievementDialogFragment.achievementId;
            if (i == 1 && (activity = achievementDialogFragment.getActivity()) != null) {
                InAppReviewHelper.INSTANCE.requestReview(activity);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(AchievementDialogFragment achievementDialogFragment) {
        boolean z;
        int i;
        FragmentActivity activity;
        z = achievementDialogFragment.dismissed;
        if (!z) {
            achievementDialogFragment.dismissed = true;
            achievementDialogFragment.dismiss();
            i = achievementDialogFragment.achievementId;
            if (i == 1 && (activity = achievementDialogFragment.getActivity()) != null) {
                InAppReviewHelper.INSTANCE.requestReview(activity);
            }
            EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.FACEBOOK).setMsg(achievementDialogFragment.getString(R.string.achievement_msg)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(AchievementDialogFragment achievementDialogFragment) {
        boolean z;
        int i;
        FragmentActivity activity;
        z = achievementDialogFragment.dismissed;
        if (!z) {
            achievementDialogFragment.dismissed = true;
            achievementDialogFragment.dismiss();
            i = achievementDialogFragment.achievementId;
            if (i == 1 && (activity = achievementDialogFragment.getActivity()) != null) {
                InAppReviewHelper.INSTANCE.requestReview(activity);
            }
            EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.VK).setMsg(achievementDialogFragment.getString(R.string.achievement_msg)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(AchievementDialogFragment achievementDialogFragment) {
        boolean z;
        int i;
        FragmentActivity activity;
        z = achievementDialogFragment.dismissed;
        if (!z) {
            achievementDialogFragment.dismissed = true;
            achievementDialogFragment.dismiss();
            i = achievementDialogFragment.achievementId;
            if (i == 1 && (activity = achievementDialogFragment.getActivity()) != null) {
                InAppReviewHelper.INSTANCE.requestReview(activity);
            }
            EventBus.getDefault().post(new ShareMessage(ShareMessage.Target.OTHER).setMsg(achievementDialogFragment.getString(R.string.achievement_msg)));
        }
        return Unit.INSTANCE;
    }
}

package org.betup.ui.dialogs.push;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.bus.DisplayRankingRewardDialogMessage;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.entity.analytics.TrackEventType;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.user.UserService;
import org.betup.ui.dialogs.AchievementDialogFragment;
import org.betup.ui.dialogs.BetListResultDialogFragment;
import org.betup.ui.dialogs.ChallengePreviewNewDialogFragment;
import org.betup.ui.dialogs.events.OpenCompetitionsPreviewEvent;
import org.betup.ui.dialogs.push.PushNotificationData;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;
import org.betup.utils.DialogManager;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: PushNotificationDialogFragment.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0017H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0002J \u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u000200H\u0002J \u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u00020+H\u0002J\u0010\u00105\u001a\u00020\u001a2\u0006\u0010(\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020+H\u0002J\u0012\u00109\u001a\u00020\u001a2\b\u0010:\u001a\u0004\u0018\u00010;H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationDialogFragment;", "Landroidx/fragment/app/DialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "homeDailyQuestController", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestController;", "getHomeDailyQuestController", "()Lorg/betup/ui/fragment/home/controller/HomeDailyQuestController;", "setHomeDailyQuestController", "(Lorg/betup/ui/fragment/home/controller/HomeDailyQuestController;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "notificationData", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "pendingActionOnDismiss", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "handleActionClick", "data", "openChallengePreview", "challengeId", "", "openBetResult", "betlistId", "betState", "price", "", "openCompetitionPreview", "competitionId", "participantId", "state", "openAchievementDialog", "Lorg/betup/ui/dialogs/push/PushNotificationData$AchievementUnlocked;", "openMatchDetails", "matchId", "navigateToSupport", "chatId", "", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PushNotificationDialogFragment extends DialogFragment {
    public static final String TAG = "PushNotificationDialog";

    @Inject
    public AnalyticsService analyticsService;

    @Inject
    public HomeDailyQuestController homeDailyQuestController;
    private PushNotificationData notificationData;
    private PushNotificationData pendingActionOnDismiss;

    @Inject
    public UserService userService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final AnalyticsService getAnalyticsService() {
        AnalyticsService analyticsService = this.analyticsService;
        if (analyticsService != null) {
            return analyticsService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsService");
        return null;
    }

    public final void setAnalyticsService(AnalyticsService analyticsService) {
        Intrinsics.checkNotNullParameter(analyticsService, "<set-?>");
        this.analyticsService = analyticsService;
    }

    public final HomeDailyQuestController getHomeDailyQuestController() {
        HomeDailyQuestController homeDailyQuestController = this.homeDailyQuestController;
        if (homeDailyQuestController != null) {
            return homeDailyQuestController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeDailyQuestController");
        return null;
    }

    public final void setHomeDailyQuestController(HomeDailyQuestController homeDailyQuestController) {
        Intrinsics.checkNotNullParameter(homeDailyQuestController, "<set-?>");
        this.homeDailyQuestController = homeDailyQuestController;
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.notificationData = PushNotificationData.INSTANCE.fromBundle(arguments);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1325281295, true, new PushNotificationDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.6f);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        DialogManager.onDialogDismissed(TAG);
        PushNotificationData pushNotificationData = this.pendingActionOnDismiss;
        if (pushNotificationData != null) {
            this.pendingActionOnDismiss = null;
            handleActionClick(pushNotificationData);
        }
    }

    private final void handleActionClick(PushNotificationData data) {
        if (data instanceof PushNotificationData.ChallengeAccepted) {
            openChallengePreview(((PushNotificationData.ChallengeAccepted) data).getChallengeId());
            return;
        }
        if (data instanceof PushNotificationData.ChallengeResult) {
            openChallengePreview(((PushNotificationData.ChallengeResult) data).getChallengeId());
            return;
        }
        if (data instanceof PushNotificationData.PrivateChallengeInvite) {
            openChallengePreview(((PushNotificationData.PrivateChallengeInvite) data).getChallengeId());
            return;
        }
        if (data instanceof PushNotificationData.BetResult) {
            PushNotificationData.BetResult betResult = (PushNotificationData.BetResult) data;
            openBetResult(betResult.getBetlistId(), betResult.getBetState(), betResult.getPrice());
            return;
        }
        if (data instanceof PushNotificationData.CompetitionResult) {
            PushNotificationData.CompetitionResult competitionResult = (PushNotificationData.CompetitionResult) data;
            openCompetitionPreview(competitionResult.getCompetitionId(), competitionResult.getParticipantId(), competitionResult.getState());
            return;
        }
        if (data instanceof PushNotificationData.AchievementUnlocked) {
            openAchievementDialog((PushNotificationData.AchievementUnlocked) data);
            return;
        }
        if (data instanceof PushNotificationData.MatchNotification) {
            openMatchDetails(((PushNotificationData.MatchNotification) data).getMatchId());
            return;
        }
        if (data instanceof PushNotificationData.SupportMessage) {
            navigateToSupport(((PushNotificationData.SupportMessage) data).getChatId());
            return;
        }
        if (data instanceof PushNotificationData.Info) {
            return;
        }
        if (data instanceof PushNotificationData.DailyQuest) {
            PushNotificationData.DailyQuest dailyQuest = (PushNotificationData.DailyQuest) data;
            if (dailyQuest.getShowClaimAction()) {
                getHomeDailyQuestController().claim(dailyQuest.getQuestId(), getUserService());
                return;
            }
            return;
        }
        if (!(data instanceof PushNotificationData.Reward)) {
            throw new NoWhenBranchMatchedException();
        }
        PushNotificationData.Reward reward = (PushNotificationData.Reward) data;
        Long price = reward.getPrice();
        EventBus.getDefault().post(new DisplayRankingRewardDialogMessage(reward.getPlace(), (price == null && (price = reward.getWon()) == null) ? 0L : price.longValue(), reward.getTitle(), reward.getBody(), reward.getPeriod()));
    }

    private final void openChallengePreview(int challengeId) {
        ChallengePreviewNewDialogFragment.Companion.newInstance$default(ChallengePreviewNewDialogFragment.INSTANCE, Integer.valueOf(challengeId), null, 2, null).show(getParentFragmentManager(), "challengePreviewDialog");
    }

    private final void openBetResult(int betlistId, int betState, long price) {
        BetState fromInt = BetState.fromInt(betState);
        BetListResultDialogFragment.Companion companion = BetListResultDialogFragment.INSTANCE;
        Intrinsics.checkNotNull(fromInt);
        companion.newInstance(betlistId, fromInt, price).show(getParentFragmentManager(), "betResultDialog");
    }

    private final void openCompetitionPreview(long competitionId, long participantId, int state) {
        Boolean bool;
        if (state == 2) {
            bool = true;
        } else {
            bool = state != 3 ? null : false;
        }
        EventBus.getDefault().post(new OpenCompetitionsPreviewEvent(competitionId, Long.valueOf(participantId), bool));
    }

    private final void openAchievementDialog(PushNotificationData.AchievementUnlocked data) {
        if (data.getAchievementId() == 1) {
            FirebaseAnalyticsHelper.trackFirstBet(requireActivity());
        }
        FirebaseAnalyticsHelper.trackNewAchievement(requireActivity(), data.getAchievementId());
        getAnalyticsService().sendTrackEvent(TrackEventType.ACHIEVEMENT_UNLOCKED);
        AchievementDialogFragment.Companion companion = AchievementDialogFragment.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        FragmentActivity fragmentActivity = requireActivity;
        String achievementName = data.getAchievementName();
        String achievementDesc = data.getAchievementDesc();
        String iconUrl = data.getIconUrl();
        if (iconUrl == null) {
            iconUrl = "";
        }
        companion.showDialog(fragmentActivity, achievementName, achievementDesc, iconUrl, data.getPrice(), false, data.getAchievementId());
    }

    private final void openMatchDetails(int matchId) {
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", matchId);
        bundle.putBoolean("isLive", false);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
    }

    private final void navigateToSupport(String chatId) {
        Bundle bundle = new Bundle();
        if (chatId != null) {
            bundle.putString("chatId", chatId);
        }
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SUPPORT, bundle));
    }

    /* compiled from: PushNotificationDialogFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/betup/ui/dialogs/push/PushNotificationDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/push/PushNotificationDialogFragment;", "bundle", "Landroid/os/Bundle;", "data", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PushNotificationDialogFragment newInstance(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            PushNotificationDialogFragment pushNotificationDialogFragment = new PushNotificationDialogFragment();
            pushNotificationDialogFragment.setArguments(bundle);
            return pushNotificationDialogFragment;
        }

        public final PushNotificationDialogFragment newInstance(PushNotificationData data) {
            Bundle bundle;
            Intrinsics.checkNotNullParameter(data, "data");
            PushNotificationDialogFragment pushNotificationDialogFragment = new PushNotificationDialogFragment();
            bundle = PushNotificationDialogFragmentKt.toBundle(data);
            pushNotificationDialogFragment.setArguments(bundle);
            return pushNotificationDialogFragment;
        }
    }
}

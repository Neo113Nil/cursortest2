package org.betup.services.push;

import android.app.NotificationManager;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.X3;
import com.vk.sdk.api.model.VKApiCommunityFull;
import io.bidmachine.unified.UnifiedMediationParams;
import io.sentry.protocol.DebugImage;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.DialogForMatchNotificationMessage;
import org.betup.bus.DisplayAchievementDialogMessage;
import org.betup.bus.DisplayBetDialogMessage;
import org.betup.bus.DisplayChallengeAcceptedDialogMessage;
import org.betup.bus.DisplayChallengeResultDialogMessage;
import org.betup.bus.DisplayCompetitionDialogMessage;
import org.betup.bus.DisplayEventPushMessage;
import org.betup.bus.DisplayInterstitialMessage;
import org.betup.bus.DisplayMatchInfoMessage;
import org.betup.bus.DisplayOfferMessage;
import org.betup.bus.DisplayPromoDialogMessage;
import org.betup.bus.DisplayPushInfoMessage;
import org.betup.bus.DisplayRewardedPromptMessage;
import org.betup.bus.NavigateMessage;
import org.betup.bus.OffersUpdatedMessage;
import org.betup.bus.UserBetStatisticsInvalidatedMessage;
import org.betup.interstitial.InterstitialAdCoordinator;
import org.betup.model.local.AppDatabase;
import org.betup.model.local.entity.NotificationType;
import org.betup.model.local.interactor.AddEventInteractor;
import org.betup.model.local.interactor.ReadAllEventsInteractor;
import org.betup.model.local.interactor.ReadEventInteractor;
import org.betup.model.remote.api.rest.analytics.GetOffersInfoInteractor;
import org.betup.model.remote.api.rest.user.GetV7MyInfoInteractor;
import org.betup.model.remote.entity.analytics.TrackEventType;
import org.betup.model.remote.entity.notifications.NotificationMatch;
import org.betup.rewardedprompt.RewardedPromptFlowLog;
import org.betup.rewardedprompt.RewardedVideoOfferCoordinator;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.experiments.ABTestService;
import org.betup.services.push.PushEventsService;
import org.betup.services.user.UserService;
import org.betup.ui.LifecycleListener;
import org.betup.ui.dialogs.AchievementDialogFragment;
import org.betup.ui.dialogs.MatchInfoDialog;
import org.betup.ui.dialogs.MatchNotificationComposeDialogFragment;
import org.betup.ui.dialogs.MessageReceivedDialogFragment;
import org.betup.ui.dialogs.PromoDialog;
import org.betup.ui.dialogs.push.PushNotificationDialogFragment;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;
import org.betup.ui.notifications.NotificationDialogHolder;
import org.betup.utils.BundleUtil;
import org.betup.utils.DeferredOverlayQueue;
import org.betup.utils.DialogManager;
import org.betup.utils.ExternalOverlayDeferral;
import org.betup.utils.InAppReviewHelper;
import org.betup.utils.PushNotificationDisplayGate;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class PushEventsService implements LifecycleListener, View.OnClickListener {
    private static final String TAG = "PushEventService ";

    @Inject
    ABTestService abTestService;
    private final AppCompatActivity activity;

    @Inject
    AddEventInteractor addEventInteractor;

    @Inject
    AnalyticsService analyticsService;

    @Inject
    AppDatabase appDatabase;
    private final NotificationDialogHolder dialogHolder;

    @Inject
    GetOffersInfoInteractor getOffersInfoInteractor;

    @Inject
    GetV7MyInfoInteractor getV7MyInfoInteractor;

    @Inject
    HomeDailyQuestController homeDailyQuestController;

    @Inject
    InterstitialAdCoordinator interstitialAdCoordinator;

    @Inject
    ReadAllEventsInteractor readAllEventsInteractor;

    @Inject
    ReadEventInteractor readEventInteractor;

    @Inject
    RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator;

    @Inject
    UserService userService;

    @Override // org.betup.ui.LifecycleListener
    public void onPause() {
    }

    public PushEventsService(AppCompatActivity activity) {
        ((BetUpApp) activity.getApplicationContext()).getComponent().inject(this);
        this.activity = activity;
        this.dialogHolder = new NotificationDialogHolder();
    }

    @Override // org.betup.ui.LifecycleListener
    public void onResume() {
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        if (!this.userService.isRegistered()) {
            Log.e(TAG, "User profile is null!");
        } else {
            ((PushStorageProvider) this.activity.getApplicationContext()).refreshEventCount(this.userService.getShortProfile().getUserModel().getId());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.EVENTS, null));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processIncomingEvent(DisplayEventPushMessage displayEventPushMessage) {
        processPossiblePush(displayEventPushMessage.getData(), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void processPossiblePush(Bundle bundle, boolean sendFromStart) {
        try {
            Log.d("PUSHTEST", "PROCESSING POSSIBLE PUSH");
            if (bundle != null && bundle.get("type") != null && this.userService.isRegistered()) {
                NotificationManager notificationManager = (NotificationManager) this.activity.getSystemService("notification");
                if (notificationManager != null) {
                    Log.d("PUSHTEST", "CANCELLING ALL!");
                    notificationManager.cancelAll();
                }
                String string = bundle.getString(DebugImage.JsonKeys.UUID);
                if (string != null) {
                    ((PushStorageProvider) this.activity.getApplicationContext()).readEvent(string);
                }
                Log.d("PUSHTEST", "PUSH " + bundle.get("type"));
                String string2 = bundle.getString("dailyQuestId");
                if (string2 != null && !string2.isEmpty()) {
                    displayDailyQuestPushDialog(bundle, string2);
                    Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                    return;
                }
                switch (AnonymousClass3.$SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.fromString(String.valueOf(bundle.get("type"))).ordinal()]) {
                    case 1:
                        displayPromoDialog(new DisplayPromoDialogMessage(BundleUtil.bundleToMap(bundle)));
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        displayDialogForNotification(new DialogForMatchNotificationMessage(BundleUtil.bundleToMap(bundle)));
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 5:
                        try {
                            Map<String, String> bundleToMap = BundleUtil.bundleToMap(bundle);
                            String str = bundleToMap.get("id");
                            if (str != null) {
                                int parseInt = Integer.parseInt(str);
                                if (parseInt == 1) {
                                    FirebaseAnalyticsHelper.trackFirstBet(this.activity);
                                    InAppReviewHelper.INSTANCE.requestReview(this.activity);
                                } else {
                                    FirebaseAnalyticsHelper.trackNewAchievement(this.activity, parseInt);
                                }
                            }
                            displayAchievementDialog(new DisplayAchievementDialogMessage(bundleToMap));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 6:
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 7:
                        displayBetDialog(new DisplayBetDialogMessage(BundleUtil.bundleToMap(bundle)));
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 8:
                        displayCompetitionDialog(new DisplayCompetitionDialogMessage(BundleUtil.bundleToMap(bundle)));
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 9:
                    case 10:
                        displayChallengeDialog(new DisplayChallengeResultDialogMessage(BundleUtil.bundleToMap(bundle)));
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 11:
                        displayPrivateChallengeInviteDialog(BundleUtil.bundleToMap(bundle));
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 12:
                        displayChallengeAcceptedDialog(new DisplayChallengeAcceptedDialogMessage(Integer.parseInt(bundle.getString("id"))));
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 13:
                        String string3 = bundle.getString("offerId");
                        if (string3 != null) {
                            displayOfferDialog(new DisplayOfferMessage(string3));
                        }
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 14:
                        String string4 = bundle.getString("campaignId");
                        if (string4 != null) {
                            displayInterstitialDialog(new DisplayInterstitialMessage(string4, bundle.getString("eventKey")));
                        }
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 15:
                        String string5 = bundle.getString("campaignId");
                        if (string5 != null) {
                            displayRewardedPromptDialog(new DisplayRewardedPromptMessage(string5, bundle.getString("eventKey"), bundle.getString(X3.k), bundle.getString("contextParams")));
                        }
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 16:
                        String string6 = bundle.getString("chatId");
                        String string7 = bundle.getString("title");
                        String string8 = bundle.getString("body");
                        if (string7 != null && string8 != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("type", "SUPPORT");
                            bundle2.putString("title", string7);
                            bundle2.putString("body", string8);
                            if (string6 != null) {
                                bundle2.putString("chatId", string6);
                            }
                            if (bundle.getString(UnifiedMediationParams.KEY_ICON_URL) != null) {
                                bundle2.putString(UnifiedMediationParams.KEY_ICON_URL, bundle.getString(UnifiedMediationParams.KEY_ICON_URL));
                            }
                            showPushNotificationDialog(bundle2);
                        } else if (string6 == null || string6.isEmpty()) {
                            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SUPPORT, new Bundle()));
                        } else {
                            navigateToSupportChat(string6);
                        }
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 17:
                        String string9 = bundle.getString("title");
                        String string10 = bundle.getString("body");
                        String string11 = bundle.getString("userId");
                        if (string9 == null || string10 == null) {
                            Bundle bundle3 = new Bundle();
                            if (string11 != null) {
                                bundle3.putString("userId", string11);
                            }
                            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MESSAGES, bundle3));
                        } else {
                            displayMessageReceivedDialog("message", string9, string10, string11, null);
                        }
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    case 18:
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("type", "REWARD");
                        bundle4.putString("title", bundle.getString("title") != null ? bundle.getString("title") : bundle.getString("name"));
                        bundle4.putString("body", bundle.getString("body") != null ? bundle.getString("body") : bundle.getString("desc"));
                        if (bundle.getString("img") != null) {
                            bundle4.putString("img", bundle.getString("img"));
                        }
                        if (bundle.getString(UnifiedMediationParams.KEY_ICON_URL) != null) {
                            bundle4.putString(UnifiedMediationParams.KEY_ICON_URL, bundle.getString(UnifiedMediationParams.KEY_ICON_URL));
                        }
                        if (bundle.containsKey(VKApiCommunityFull.PLACE)) {
                            bundle4.putString(VKApiCommunityFull.PLACE, String.valueOf(bundle.get(VKApiCommunityFull.PLACE)));
                        }
                        if (bundle.containsKey("won")) {
                            bundle4.putString("won", String.valueOf(bundle.get("won")));
                        }
                        if (bundle.containsKey("price")) {
                            bundle4.putString("price", String.valueOf(bundle.get("price")));
                        }
                        if (bundle.getString(TypedValues.CycleType.S_WAVE_PERIOD) != null) {
                            bundle4.putString(TypedValues.CycleType.S_WAVE_PERIOD, bundle.getString(TypedValues.CycleType.S_WAVE_PERIOD));
                        }
                        if (bundle.getString("periodType") != null) {
                            bundle4.putString("periodType", bundle.getString("periodType"));
                        }
                        showPushNotificationDialog(bundle4);
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                    default:
                        displayInfoDialog(new DisplayPushInfoMessage(bundle));
                        Log.d("RELOADTEST", "ENDED PROCESSING PUSH");
                        break;
                }
                return;
            }
            Log.d("RELOADTEST", "possible push closed");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: org.betup.services.push.PushEventsService$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$local$entity$NotificationType;

        static {
            int[] iArr = new int[NotificationType.values().length];
            $SwitchMap$org$betup$model$local$entity$NotificationType = iArr;
            try {
                iArr[NotificationType.PROMO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.MATCH_FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.MATCH_SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.ACHIEVEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.BET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.COMPETITION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.CHALLENGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.CHALLENGE_PRICE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.CHALLENGE_PRIVATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.CHALLENGE_ACCEPT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.OFFER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.INTERSTITIAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.REWARDED_PROMPT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.SUPPORT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.REWARD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$betup$model$local$entity$NotificationType[NotificationType.INFO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayChallengeAcceptedDialog(DisplayChallengeAcceptedDialogMessage message) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "CHALLENGE_ACCEPT");
        bundle.putString("id", String.valueOf(message.getChallengeId()));
        bundle.putString("title", this.activity.getString(R.string.challenge_accepted));
        bundle.putString("body", this.activity.getString(R.string.opponent_accepted_challenge));
        showPushNotificationDialog(bundle);
    }

    /* renamed from: org.betup.services.push.PushEventsService$1, reason: invalid class name */
    class AnonymousClass1 implements Function0<Unit> {
        final /* synthetic */ Bundle val$bundle;
        final /* synthetic */ String val$dailyQuestId;

        AnonymousClass1(final Bundle val$bundle, final String val$dailyQuestId) {
            this.val$bundle = val$bundle;
            this.val$dailyQuestId = val$dailyQuestId;
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            AppCompatActivity appCompatActivity = PushEventsService.this.activity;
            final Bundle bundle = this.val$bundle;
            final String str = this.val$dailyQuestId;
            appCompatActivity.runOnUiThread(new Runnable() { // from class: org.betup.services.push.PushEventsService$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PushEventsService.AnonymousClass1.this.m12809lambda$invoke$0$orgbetupservicespushPushEventsService$1(bundle, str);
                }
            });
            return Unit.INSTANCE;
        }

        /* renamed from: lambda$invoke$0$org-betup-services-push-PushEventsService$1, reason: not valid java name */
        /* synthetic */ void m12809lambda$invoke$0$orgbetupservicespushPushEventsService$1(Bundle bundle, String str) {
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putString("dailyQuestId", str);
            bundle2.putString("dailyQuestClaimable", PushEventsService.this.homeDailyQuestController.isQuestClaimable(str) ? "true" : CredentialEntry.FALSE_STRING);
            PushEventsService.this.showPushNotificationDialog(bundle2);
        }
    }

    private void displayDailyQuestPushDialog(final Bundle bundle, final String dailyQuestId) {
        this.homeDailyQuestController.load(this.userService, new AnonymousClass1(bundle, dailyQuestId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPushNotificationDialog(Bundle bundle) {
        try {
            AppCompatActivity appCompatActivity = this.activity;
            if (appCompatActivity instanceof FragmentActivity) {
                PushNotificationDisplayGate.enqueue(appCompatActivity, bundle);
            } else {
                DialogManager.showDialogReplacingPrevious(PushNotificationDialogFragment.INSTANCE.newInstance(bundle), this.activity, PushNotificationDialogFragment.TAG);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error showing push notification dialog", e);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayInfoDialog(DisplayPushInfoMessage displayPushInfoMessage) {
        showLegacyInfoAsUnifiedPushDialog(displayPushInfoMessage.getBundle());
    }

    private void showLegacyInfoAsUnifiedPushDialog(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("type", NotificationType.INFO.name());
        String string = bundle.getString("title");
        if (string == null) {
            string = bundle.getString("name");
        }
        if (string != null) {
            bundle2.putString("title", string);
        }
        String string2 = bundle.getString("body");
        if (string2 == null) {
            string2 = bundle.getString("desc");
        }
        if (string2 != null) {
            bundle2.putString("body", string2);
        }
        String string3 = bundle.getString(UnifiedMediationParams.KEY_ICON_URL);
        if (string3 == null) {
            string3 = bundle.getString("img");
        }
        if (string3 != null) {
            bundle2.putString(UnifiedMediationParams.KEY_ICON_URL, string3);
        }
        showPushNotificationDialog(bundle2);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayPromoDialog(DisplayPromoDialogMessage message) {
        Log.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "DISPLAYING PROMO MESSAGE");
        final Map<String, String> data = message.getData();
        runWhenExternalOverlayAllowed(new Runnable() { // from class: org.betup.services.push.PushEventsService$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                PushEventsService.this.m12807x5c9e258e(data);
            }
        });
    }

    /* renamed from: lambda$displayPromoDialog$0$org-betup-services-push-PushEventsService, reason: not valid java name */
    /* synthetic */ void m12807x5c9e258e(Map map) {
        PromoDialog.showDialog(this.activity, map);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayAchievementDialog(DisplayAchievementDialogMessage message) {
        Log.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "MESSAGE GOT IN MAINACTIVITY");
        final Map<String, String> dataModel = message.getDataModel();
        try {
            Bundle mapToBundle = BundleUtil.mapToBundle(dataModel);
            mapToBundle.putString("type", "ACHIEVEMENT");
            mapToBundle.putString("title", dataModel.get("name"));
            mapToBundle.putString("body", dataModel.get("desc"));
            showPushNotificationDialog(mapToBundle);
        } catch (Exception e) {
            Log.e(TAG, "Error showing push dialog for achievement, falling back to direct dialog", e);
            final int i = -1;
            try {
                String str = dataModel.get("id");
                if (str != null) {
                    i = Integer.parseInt(str);
                }
            } catch (NumberFormatException unused) {
            }
            runWhenExternalOverlayAllowed(new Runnable() { // from class: org.betup.services.push.PushEventsService$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    PushEventsService.this.m12803x991be22f(dataModel, i);
                }
            });
        }
    }

    /* renamed from: lambda$displayAchievementDialog$1$org-betup-services-push-PushEventsService, reason: not valid java name */
    /* synthetic */ void m12803x991be22f(Map map, int i) {
        AchievementDialogFragment.showDialog(this.activity, (String) map.get("name"), (String) map.get("desc"), (String) map.get(UnifiedMediationParams.KEY_ICON_URL), Integer.valueOf((String) map.get("price")).intValue(), false, i);
        this.analyticsService.sendTrackEvent(TrackEventType.ACHIEVEMENT_UNLOCKED);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayMatchInfoDialog(final DisplayMatchInfoMessage matchInfoMessage) {
        Log.d("RELOADTEST", "DIALOG GOT!");
        RingtoneManager.getRingtone(this.activity.getApplicationContext(), RingtoneManager.getDefaultUri(2)).play();
        final MatchInfoDialog matchInfoDialog = new MatchInfoDialog(this.activity, matchInfoMessage.getMatch(), matchInfoMessage.getTaskType(), new MatchInfoDialog.OnMatchDialogClickListener() { // from class: org.betup.services.push.PushEventsService.2
            @Override // org.betup.ui.dialogs.MatchInfoDialog.OnMatchDialogClickListener
            public void onSecondButtonClick() {
            }

            @Override // org.betup.ui.dialogs.MatchInfoDialog.OnMatchDialogClickListener
            public void onFirstButtonClick(NotificationMatch match) {
                Bundle bundle = new Bundle();
                bundle.putInt("id", match.getMatchId());
                bundle.putBoolean("isLive", match.isLive());
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
            }
        });
        runWhenExternalOverlayAllowed(new Runnable() { // from class: org.betup.services.push.PushEventsService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                PushEventsService.this.m12805x81c41394(matchInfoDialog);
            }
        });
    }

    /* renamed from: lambda$displayMatchInfoDialog$2$org-betup-services-push-PushEventsService, reason: not valid java name */
    /* synthetic */ void m12805x81c41394(MatchInfoDialog matchInfoDialog) {
        this.dialogHolder.displayDialog(matchInfoDialog);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayDialogForNotification(DialogForMatchNotificationMessage message) {
        try {
            Map<String, String> dataModel = message.getDataModel();
            String str = dataModel.get("id");
            if (str == null) {
                return;
            }
            final int parseInt = Integer.parseInt(str);
            String str2 = dataModel.get("title");
            final String str3 = str2 == null ? "" : str2;
            String str4 = dataModel.get("desc");
            if (str4 == null || str4.isEmpty()) {
                str4 = dataModel.get("body");
            }
            final String str5 = str4 == null ? "" : str4;
            final String str6 = dataModel.get("img");
            final AppCompatActivity appCompatActivity = this.activity;
            if (appCompatActivity instanceof FragmentActivity) {
                runWhenExternalOverlayAllowed(new Runnable() { // from class: org.betup.services.push.PushEventsService$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MatchNotificationComposeDialogFragment.show(FragmentActivity.this, parseInt, str3, str5, str6);
                    }
                });
            }
        } catch (Exception e) {
            Log.e(TAG, "displayDialogForNotification failed", e);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayCompetitionDialog(DisplayCompetitionDialogMessage displayBetDialogMessage) {
        this.getV7MyInfoInteractor.invalidate(true);
        Log.d("PUSHTEST", "DIALOG GOT IN MAINACTIVITY - Opening CompetitionsPreviewFragment");
        Map<String, String> dataModel = displayBetDialogMessage.getDataModel();
        try {
            Log.d("PUSHTEST", "MESSAGE IS " + dataModel);
            Bundle mapToBundle = BundleUtil.mapToBundle(dataModel);
            mapToBundle.putString("type", "COMPETITION");
            showPushNotificationDialog(mapToBundle);
            Log.d("PUSHTEST", "PushNotificationDialog shown for competition");
        } catch (Exception e) {
            Log.d("PUSHTEST", "ERROR opening competition preview!");
            e.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayBetDialog(DisplayBetDialogMessage displayBetDialogMessage) {
        this.getV7MyInfoInteractor.invalidate(true);
        EventBus.getDefault().post(new UserBetStatisticsInvalidatedMessage());
        Log.d("PUSHTEST", "DIALOG GOT IN MAINACTIVITY");
        Map<String, String> dataModel = displayBetDialogMessage.getDataModel();
        try {
            Log.d("PUSHTEST", "MESSAGE IS " + dataModel);
            Bundle mapToBundle = BundleUtil.mapToBundle(dataModel);
            mapToBundle.putString("type", "BET");
            showPushNotificationDialog(mapToBundle);
        } catch (Exception e) {
            Log.d("PUSHTEST", "ERROR!");
            e.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayChallengeDialog(DisplayChallengeResultDialogMessage displayChallengeResultDialogMessage) {
        try {
            Bundle mapToBundle = BundleUtil.mapToBundle(displayChallengeResultDialogMessage.getDataModel());
            mapToBundle.putString("type", "CHALLENGE");
            showPushNotificationDialog(mapToBundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void displayPrivateChallengeInviteDialog(Map<String, String> data) {
        try {
            if (data.get("id") != null) {
                Bundle mapToBundle = BundleUtil.mapToBundle(data);
                mapToBundle.putString("type", "CHALLENGE_PRIVATE");
                showPushNotificationDialog(mapToBundle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void displayOfferDialog(final DisplayOfferMessage displayOfferMessage) {
        Log.d("RELOADTEST", "DIALOG GOT!");
        Bundle bundle = new Bundle();
        bundle.putString("offerId", displayOfferMessage.getOfferId());
        this.getOffersInfoInteractor.invalidate();
        EventBus.getDefault().post(new OffersUpdatedMessage());
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.OFFERS, bundle));
    }

    private void displayInterstitialDialog(final DisplayInterstitialMessage message) {
        Log.d("PUSHTEST", "INTERSTITIAL PUSH campaignId=" + message.getCampaignId());
        runWhenExternalOverlayAllowed(new Runnable() { // from class: org.betup.services.push.PushEventsService$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                PushEventsService.this.m12804xa921c659(message);
            }
        });
    }

    /* renamed from: lambda$displayInterstitialDialog$4$org-betup-services-push-PushEventsService, reason: not valid java name */
    /* synthetic */ void m12804xa921c659(DisplayInterstitialMessage displayInterstitialMessage) {
        this.interstitialAdCoordinator.showCampaignFromPush(displayInterstitialMessage.getCampaignId(), displayInterstitialMessage.getEventKey());
    }

    private void displayRewardedPromptDialog(final DisplayRewardedPromptMessage message) {
        Log.d("PUSHTEST", "REWARDED_PROMPT PUSH campaignId=" + message.getCampaignId());
        RewardedPromptFlowLog.step("PUSH_0", "PushEventsService received REWARDED_PROMPT campaignId=" + message.getCampaignId() + " eventKey=" + message.getEventKey() + " placementId=" + message.getPlacementId() + " contextParams=" + message.getContextParamsJson());
        runWhenExternalOverlayAllowed(new Runnable() { // from class: org.betup.services.push.PushEventsService$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                PushEventsService.this.m12808xc2531a40(message);
            }
        }, "REWARDED_PROMPT");
    }

    /* renamed from: lambda$displayRewardedPromptDialog$5$org-betup-services-push-PushEventsService, reason: not valid java name */
    /* synthetic */ void m12808xc2531a40(DisplayRewardedPromptMessage displayRewardedPromptMessage) {
        RewardedPromptFlowLog.ok("PUSH_0", "overlay gate cleared — calling coordinator.showCampaignFromPush");
        this.rewardedVideoOfferCoordinator.showCampaignFromPush(displayRewardedPromptMessage.getCampaignId(), displayRewardedPromptMessage.getEventKey(), displayRewardedPromptMessage.getPlacementId(), displayRewardedPromptMessage.getContextParamsJson());
    }

    @Override // org.betup.ui.LifecycleListener
    public void onStop() {
        PushNotificationDisplayGate.cancelPending();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        this.dialogHolder.removeAll();
    }

    private void navigateToSupportChat(String chatId) {
        try {
            Log.d("PUSHTEST", "Navigating to support chat: " + chatId);
            Bundle bundle = new Bundle();
            bundle.putString("chatId", chatId);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SUPPORT, bundle));
        } catch (Exception e) {
            Log.e("PUSHTEST", "Error navigating to support chat", e);
        }
    }

    private void displayMessageReceivedDialog(final String type, final String title, final String body, final String userId, final String chatId) {
        try {
            Log.d("PUSHTEST", "Displaying message received dialog: type=" + type);
            runWhenExternalOverlayAllowed(new Runnable() { // from class: org.betup.services.push.PushEventsService$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    PushEventsService.this.m12806x9a47460d(type, title, body, userId, chatId);
                }
            });
        } catch (Exception e) {
            Log.e("PUSHTEST", "Error displaying message received dialog", e);
            if (!"support".equals(type)) {
                Bundle bundle = new Bundle();
                if (userId != null) {
                    bundle.putString("userId", userId);
                }
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MESSAGES, bundle));
                return;
            }
            if (chatId == null || chatId.isEmpty()) {
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SUPPORT, new Bundle()));
            } else {
                navigateToSupportChat(chatId);
            }
        }
    }

    /* renamed from: lambda$displayMessageReceivedDialog$6$org-betup-services-push-PushEventsService, reason: not valid java name */
    /* synthetic */ void m12806x9a47460d(String str, String str2, String str3, String str4, String str5) {
        MessageReceivedDialogFragment.INSTANCE.newInstance(str, str2, str3, str4, str5).show(this.activity.getSupportFragmentManager(), "MessageReceivedDialog");
    }

    private void runWhenExternalOverlayAllowed(Runnable action) {
        runWhenExternalOverlayAllowed(action, null);
    }

    private void runWhenExternalOverlayAllowed(Runnable action, String rvpLabel) {
        AppCompatActivity appCompatActivity = this.activity;
        if (!(appCompatActivity instanceof FragmentActivity)) {
            if (rvpLabel != null) {
                RewardedPromptFlowLog.wait("PUSH_0", "activity is not FragmentActivity — running action anyway label=" + rvpLabel);
            }
            action.run();
        } else if (ExternalOverlayDeferral.shouldDefer(appCompatActivity)) {
            if (rvpLabel != null) {
                RewardedPromptFlowLog.wait("PUSH_0", "PushEventsService deferring " + rvpLabel + " — " + RewardedPromptFlowLog.overlaySnapshot(appCompatActivity));
            }
            DeferredOverlayQueue.enqueue(appCompatActivity, action);
        } else {
            if (rvpLabel != null) {
                RewardedPromptFlowLog.ok("PUSH_0", "PushEventsService overlay clear — run now. " + RewardedPromptFlowLog.overlaySnapshot(appCompatActivity));
            }
            action.run();
        }
    }
}

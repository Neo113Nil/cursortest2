package org.betup.ui.fragment.wheeloffortune.controller;

import android.util.Log;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.bus.DailyBonusButtonUpdate;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.reward.GiveWheelOfFortuneRewardInteractor;
import org.betup.model.remote.entity.rewards.RewardModel;
import org.betup.model.remote.entity.rewards.WheelOfFortuneRewardRequest;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.utils.RewardSyncHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WheelOfFortuneRewardController.kt */
@Singleton
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJF\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dJ\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0011J\u0006\u0010#\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006%"}, d2 = {"Lorg/betup/ui/fragment/wheeloffortune/controller/WheelOfFortuneRewardController;", "", "giveWheelOfFortuneRewardInteractor", "Lorg/betup/model/remote/api/rest/reward/GiveWheelOfFortuneRewardInteractor;", "userService", "Lorg/betup/services/user/UserService;", "dailyBonusController", "Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/reward/GiveWheelOfFortuneRewardInteractor;Lorg/betup/services/user/UserService;Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;)V", "_isCollecting", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isCollecting", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_hasClaimedReward", "", "hasClaimedReward", "getHasClaimedReward", "currentRequestDailyBonusId", "", "Ljava/lang/Long;", "currentRequestMultiplier", "Ljava/lang/Integer;", "collectReward", "dailyBonusId", "multiplier", "onSuccess", "Lkotlin/Function1;", "Lorg/betup/model/remote/entity/rewards/RewardModel;", "", "onError", "", "resetClaimedState", "reset", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WheelOfFortuneRewardController {
    private static final String TAG = "WheelOfFortuneRewardController";
    private final MutableStateFlow<Integer> _hasClaimedReward;
    private final MutableStateFlow<Boolean> _isCollecting;
    private Long currentRequestDailyBonusId;
    private Integer currentRequestMultiplier;
    private final DailyBonusController dailyBonusController;
    private final GiveWheelOfFortuneRewardInteractor giveWheelOfFortuneRewardInteractor;
    private final StateFlow<Integer> hasClaimedReward;
    private final StateFlow<Boolean> isCollecting;
    private final UserService userService;
    public static final int $stable = 8;

    @Inject
    public WheelOfFortuneRewardController(GiveWheelOfFortuneRewardInteractor giveWheelOfFortuneRewardInteractor, UserService userService, DailyBonusController dailyBonusController) {
        Intrinsics.checkNotNullParameter(giveWheelOfFortuneRewardInteractor, "giveWheelOfFortuneRewardInteractor");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(dailyBonusController, "dailyBonusController");
        this.giveWheelOfFortuneRewardInteractor = giveWheelOfFortuneRewardInteractor;
        this.userService = userService;
        this.dailyBonusController = dailyBonusController;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isCollecting = MutableStateFlow;
        this.isCollecting = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._hasClaimedReward = MutableStateFlow2;
        this.hasClaimedReward = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final StateFlow<Boolean> isCollecting() {
        return this.isCollecting;
    }

    public final StateFlow<Integer> getHasClaimedReward() {
        return this.hasClaimedReward;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean collectReward$default(WheelOfFortuneRewardController wheelOfFortuneRewardController, int i, int i2, Function1 function1, Function1 function12, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        if ((i3 & 8) != 0) {
            function12 = null;
        }
        return wheelOfFortuneRewardController.collectReward(i, i2, function1, function12);
    }

    public final boolean collectReward(final int dailyBonusId, int multiplier, final Function1<? super RewardModel, Unit> onSuccess, final Function1<? super String, Unit> onError) {
        Integer num;
        Integer value = this._hasClaimedReward.getValue();
        if (value != null && value.intValue() == dailyBonusId) {
            Log.w(TAG, "Reward already claimed for dailyBonusId: " + dailyBonusId + ", ignoring duplicate call");
            return false;
        }
        if (this._isCollecting.getValue().booleanValue()) {
            Log.w(TAG, "Reward collection already in progress, ignoring duplicate call");
            return false;
        }
        Long l = this.currentRequestDailyBonusId;
        long j = dailyBonusId;
        if (l != null && l.longValue() == j && (num = this.currentRequestMultiplier) != null && num.intValue() == multiplier) {
            Log.w(TAG, "Same request already in progress: dailyBonusId=" + dailyBonusId + ", multiplier=" + multiplier);
            return false;
        }
        this._isCollecting.setValue(true);
        this.currentRequestDailyBonusId = Long.valueOf(j);
        this.currentRequestMultiplier = Integer.valueOf(multiplier);
        Log.d(TAG, "Collecting reward - dailyBonusId: " + dailyBonusId + ", multiplier: " + multiplier);
        try {
            this.giveWheelOfFortuneRewardInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<RewardModel, WheelOfFortuneRewardRequest>() { // from class: org.betup.ui.fragment.wheeloffortune.controller.WheelOfFortuneRewardController$collectReward$1
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public void onFetched(FetchedResponseMessage<RewardModel, WheelOfFortuneRewardRequest> responseMessage) {
                    MutableStateFlow mutableStateFlow;
                    MutableStateFlow mutableStateFlow2;
                    UserService userService;
                    DailyBonusController dailyBonusController;
                    UserService userService2;
                    UserService userService3;
                    UserService userService4;
                    UserService userService5;
                    Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                    mutableStateFlow = WheelOfFortuneRewardController.this._isCollecting;
                    mutableStateFlow.setValue(false);
                    WheelOfFortuneRewardController.this.currentRequestDailyBonusId = null;
                    WheelOfFortuneRewardController.this.currentRequestMultiplier = null;
                    if (responseMessage.getModel() == null || responseMessage.getStat() != FetchStat.SUCCESS) {
                        String str = "Failed to collect reward: " + responseMessage.getStat();
                        Log.w("WheelOfFortuneRewardController", str);
                        Function1<String, Unit> function1 = onError;
                        if (function1 != null) {
                            function1.invoke(str);
                            return;
                        }
                        return;
                    }
                    RewardModel model = responseMessage.getModel();
                    mutableStateFlow2 = WheelOfFortuneRewardController.this._hasClaimedReward;
                    mutableStateFlow2.setValue(Integer.valueOf(dailyBonusId));
                    Log.d("WheelOfFortuneRewardController", "Reward collected successfully - Amount: " + model.getAmount() + ", Balance: " + model.getMoneyBalance());
                    userService = WheelOfFortuneRewardController.this.userService;
                    if (userService.isRegistered()) {
                        userService3 = WheelOfFortuneRewardController.this.userService;
                        ShortUserProfileModel shortProfile = userService3.getShortProfile();
                        if ((shortProfile != null ? shortProfile.getUserProgressModel() : null) != null) {
                            userService4 = WheelOfFortuneRewardController.this.userService;
                            UserProgressModel userProgressModel = userService4.getShortProfile().getUserProgressModel();
                            Intrinsics.checkNotNullExpressionValue(userProgressModel, "getUserProgressModel(...)");
                            userProgressModel.setMoneyBalance((long) model.getMoneyBalance());
                            Log.d("WheelOfFortuneRewardController", "Updated balance immediately from response: " + model.getMoneyBalance());
                            RewardSyncHelper rewardSyncHelper = RewardSyncHelper.INSTANCE;
                            userService5 = WheelOfFortuneRewardController.this.userService;
                            RewardSyncHelper.syncProfileAndNotify$default(rewardSyncHelper, userService5, 0L, 2, null);
                        }
                    }
                    dailyBonusController = WheelOfFortuneRewardController.this.dailyBonusController;
                    dailyBonusController.notifyRewardClaimed();
                    EventBus.getDefault().post(new DailyBonusButtonUpdate(true));
                    RewardSyncHelper rewardSyncHelper2 = RewardSyncHelper.INSTANCE;
                    userService2 = WheelOfFortuneRewardController.this.userService;
                    rewardSyncHelper2.syncProfileAndNotify(userService2, 1000L);
                    Function1<RewardModel, Unit> function12 = onSuccess;
                    if (function12 != null) {
                        Intrinsics.checkNotNull(model);
                        function12.invoke(model);
                    }
                }
            }, new WheelOfFortuneRewardRequest(j, multiplier));
            return true;
        } catch (Exception e) {
            this._isCollecting.setValue(false);
            this.currentRequestDailyBonusId = null;
            this.currentRequestMultiplier = null;
            String str = "Error calling reward API: " + e.getMessage();
            Log.e(TAG, str, e);
            if (onError != null) {
                onError.invoke(str);
            }
            return false;
        }
    }

    public final void resetClaimedState(int dailyBonusId) {
        Integer value = this._hasClaimedReward.getValue();
        if (value != null && value.intValue() == dailyBonusId) {
            this._hasClaimedReward.setValue(null);
        }
    }

    public final void reset() {
        this._isCollecting.setValue(false);
        this._hasClaimedReward.setValue(null);
        this.currentRequestDailyBonusId = null;
        this.currentRequestMultiplier = null;
    }
}

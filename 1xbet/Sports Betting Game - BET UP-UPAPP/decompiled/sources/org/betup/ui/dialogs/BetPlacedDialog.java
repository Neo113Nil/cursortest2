package org.betup.ui.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsSportModel;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.presentation.PresentationScreenProvider;
import org.betup.presentation.ScreenTracker;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.common.compose.TicketDialogWindowKt;
import org.betup.ui.fragment.bets.BetsPlacedController;
import org.betup.utils.DialogManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: BetPlacedDialog.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00104\u001a\u000205H\u0016J\u0014\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020507H\u0016J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\u0012\u0010<\u001a\u0002092\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J$\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010E\u001a\u000209H\u0016J\u0010\u0010F\u001a\u0002092\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u000209H\u0016J\b\u0010J\u001a\u000209H\u0002J\u0010\u0010K\u001a\u0002092\u0006\u0010L\u001a\u00020MH\u0016J\u001a\u0010N\u001a\u0002092\b\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020.H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020.0)¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020.X\u0082D¢\u0006\u0002\n\u0000¨\u0006S²\u0006\u0010\u0010T\u001a\b\u0012\u0004\u0012\u00020V0UX\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010X\u001a\u00020*X\u008a\u008e\u0002"}, d2 = {"Lorg/betup/ui/dialogs/BetPlacedDialog;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", "Lorg/betup/presentation/PresentationScreenProvider;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "betsPlacedController", "Lorg/betup/ui/fragment/bets/BetsPlacedController;", "getBetsPlacedController", "()Lorg/betup/ui/fragment/bets/BetsPlacedController;", "setBetsPlacedController", "(Lorg/betup/ui/fragment/bets/BetsPlacedController;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "getBetShareInstallLinkInteractor", "Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;", "getGetBetShareInstallLinkInteractor", "()Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;", "setGetBetShareInstallLinkInteractor", "(Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;)V", "screenTracker", "Lorg/betup/presentation/ScreenTracker;", "getScreenTracker", "()Lorg/betup/presentation/ScreenTracker;", "setScreenTracker", "(Lorg/betup/presentation/ScreenTracker;)V", "betId", "", "placement", "Lorg/betup/services/offer/PromoService$PromoPlacement;", "_isVideoRewardAvailable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isVideoRewardAvailable", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_videoRewardAmount", "", "videoRewardAmount", "getVideoRewardAmount", "videoRewardCheckJob", "Lkotlinx/coroutines/Job;", "VIDEO_REWARD_CHECK_INTERVAL", "presentationScreenKey", "", "presentationScreenContext", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onDestroy", "schedulePeriodicVideoRewardCheck", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "amount", VastTagName.COMPANION, "app_release", "bet", "", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "isLoading", "placementHapticPlayed"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BetPlacedDialog extends DialogFragment implements VideoRewardService.VideoRewardServiceClient, PresentationScreenProvider {
    private static final String ARG_BET_ID = "arg_bet_id";
    private final long VIDEO_REWARD_CHECK_INTERVAL;
    private final MutableStateFlow<Boolean> _isVideoRewardAvailable;
    private final MutableStateFlow<Long> _videoRewardAmount;
    private int betId;

    @Inject
    public BetsPlacedController betsPlacedController;

    @Inject
    public GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor;
    private final MutableStateFlow<Boolean> isVideoRewardAvailable;
    private final PromoService.PromoPlacement placement = PromoService.PromoPlacement.BET_PLACED;

    @Inject
    public ScreenTracker screenTracker;

    @Inject
    public UserService userService;
    private final MutableStateFlow<Long> videoRewardAmount;
    private Job videoRewardCheckJob;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BetPlacedDialog.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoRewardService.RewardedVideoResult.values().length];
            try {
                iArr[VideoRewardService.RewardedVideoResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoRewardService.RewardedVideoResult.NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoRewardService.RewardedVideoResult.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoRewardService.RewardedVideoResult.BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BetPlacedDialog() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isVideoRewardAvailable = MutableStateFlow;
        this.isVideoRewardAvailable = MutableStateFlow;
        MutableStateFlow<Long> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0L);
        this._videoRewardAmount = MutableStateFlow2;
        this.videoRewardAmount = MutableStateFlow2;
        this.VIDEO_REWARD_CHECK_INTERVAL = 5000L;
    }

    @Override // org.betup.presentation.PresentationScreenProvider
    public boolean shouldReportPresentationScreen() {
        return PresentationScreenProvider.DefaultImpls.shouldReportPresentationScreen(this);
    }

    /* compiled from: BetPlacedDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/ui/dialogs/BetPlacedDialog$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_BET_ID", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/BetPlacedDialog;", "betId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BetPlacedDialog newInstance(int betId) {
            BetPlacedDialog betPlacedDialog = new BetPlacedDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(BetPlacedDialog.ARG_BET_ID, betId);
            betPlacedDialog.setArguments(bundle);
            return betPlacedDialog;
        }
    }

    public final BetsPlacedController getBetsPlacedController() {
        BetsPlacedController betsPlacedController = this.betsPlacedController;
        if (betsPlacedController != null) {
            return betsPlacedController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betsPlacedController");
        return null;
    }

    public final void setBetsPlacedController(BetsPlacedController betsPlacedController) {
        Intrinsics.checkNotNullParameter(betsPlacedController, "<set-?>");
        this.betsPlacedController = betsPlacedController;
    }

    public final VideoRewardService getVideoRewardService() {
        VideoRewardService videoRewardService = this.videoRewardService;
        if (videoRewardService != null) {
            return videoRewardService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoRewardService");
        return null;
    }

    public final void setVideoRewardService(VideoRewardService videoRewardService) {
        Intrinsics.checkNotNullParameter(videoRewardService, "<set-?>");
        this.videoRewardService = videoRewardService;
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

    public final GetBetShareInstallLinkInteractor getGetBetShareInstallLinkInteractor() {
        GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor = this.getBetShareInstallLinkInteractor;
        if (getBetShareInstallLinkInteractor != null) {
            return getBetShareInstallLinkInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getBetShareInstallLinkInteractor");
        return null;
    }

    public final void setGetBetShareInstallLinkInteractor(GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor) {
        Intrinsics.checkNotNullParameter(getBetShareInstallLinkInteractor, "<set-?>");
        this.getBetShareInstallLinkInteractor = getBetShareInstallLinkInteractor;
    }

    public final ScreenTracker getScreenTracker() {
        ScreenTracker screenTracker = this.screenTracker;
        if (screenTracker != null) {
            return screenTracker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenTracker");
        return null;
    }

    public final void setScreenTracker(ScreenTracker screenTracker) {
        Intrinsics.checkNotNullParameter(screenTracker, "<set-?>");
        this.screenTracker = screenTracker;
    }

    public final MutableStateFlow<Boolean> isVideoRewardAvailable() {
        return this.isVideoRewardAvailable;
    }

    public final MutableStateFlow<Long> getVideoRewardAmount() {
        return this.videoRewardAmount;
    }

    @Override // org.betup.presentation.PresentationScreenProvider
    public String presentationScreenKey() {
        return "bet_placed";
    }

    @Override // org.betup.presentation.PresentationScreenProvider
    public Map<String, String> presentationScreenContext() {
        List<BetsPlaceModel> placedBets;
        BetsPlaceModel betsPlaceModel;
        MatchDetailsDataModel sportMatch;
        MatchDetailsSportModel sport;
        String name;
        String obj;
        List<BetsPlaceModel> placedBets2;
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.betId;
        if (i > 0) {
            linkedHashMap.put("bet_id", String.valueOf(i));
        }
        BetsListModel betsListModel = (BetsListModel) CollectionsKt.firstOrNull((List) getBetsPlacedController().getBet().getValue());
        if (betsListModel != null && (placedBets2 = betsListModel.getPlacedBets()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = placedBets2.iterator();
            while (it.hasNext()) {
                MatchDetailsDataModel sportMatch2 = ((BetsPlaceModel) it.next()).getSportMatch();
                if (sportMatch2 == null || (num = sportMatch2.getId()) == null || num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    arrayList.add(num);
                }
            }
            List distinct = CollectionsKt.distinct(arrayList);
            if (distinct != null) {
                if (distinct.isEmpty()) {
                    distinct = null;
                }
                if (distinct != null) {
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    linkedHashMap2.put("match_id", String.valueOf(((Number) CollectionsKt.first(distinct)).intValue()));
                    linkedHashMap2.put("match_ids", CollectionsKt.joinToString$default(distinct, ",", null, null, 0, null, null, 62, null));
                }
            }
        }
        if (betsListModel != null && (placedBets = betsListModel.getPlacedBets()) != null && (betsPlaceModel = (BetsPlaceModel) CollectionsKt.firstOrNull((List) placedBets)) != null && (sportMatch = betsPlaceModel.getSportMatch()) != null && (sport = sportMatch.getSport()) != null && (name = sport.getName()) != null && (obj = StringsKt.trim((CharSequence) name).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                linkedHashMap.put("sport", obj);
            }
        }
        if (betsListModel != null) {
            Long valueOf = Long.valueOf(betsListModel.getMoneyPlaced());
            Long l = valueOf.longValue() > 0 ? valueOf : null;
            if (l != null) {
                linkedHashMap.put("bet_amount", String.valueOf(l.longValue()));
            }
        }
        return linkedHashMap;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.betId = arguments.getInt(ARG_BET_ID);
            BetsPlacedController betsPlacedController = getBetsPlacedController();
            int i = this.betId;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            betsPlacedController.bind(i, requireContext);
        }
        getVideoRewardService().connectClient(this.placement, null, this);
        getVideoRewardService().getVideoRewardInfo(this.placement, null, null);
        schedulePeriodicVideoRewardCheck();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1015172437, true, new BetPlacedDialog$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        TicketDialogWindowKt.applyTicketDialogWindow(this, -1, -2);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = null;
        getVideoRewardService().disconnectClient(this.placement, null);
        String tag = getTag();
        if (tag == null) {
            tag = "BetPlacedDialog";
        }
        DialogManager.onDialogDismissed(tag);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = null;
    }

    private final void schedulePeriodicVideoRewardCheck() {
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new BetPlacedDialog$schedulePeriodicVideoRewardCheck$1(this, null), 3, null);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        Intrinsics.checkNotNullParameter(info, "info");
        if (!isAdded() || isDetached()) {
            return;
        }
        this._videoRewardAmount.setValue(Long.valueOf(info.getPrizeAmount()));
        boolean z2 = false;
        try {
            z = getVideoRewardService().isRewardedReady(this.placement);
        } catch (Exception e) {
            Log.e("BetPlacedDialog", "Error checking rewarded ad availability", e);
            z = false;
        }
        boolean z3 = info.isAvailable() && !info.isQuotaExhausted();
        if (z3 && z) {
            z2 = true;
        }
        boolean booleanValue = this._isVideoRewardAvailable.getValue().booleanValue();
        this._isVideoRewardAvailable.setValue(Boolean.valueOf(z2));
        Log.d("BetPlacedDialog", "Video reward updated: backendAvailable=" + z3 + ", adSdkAvailable=" + z + ", finalAvailable=" + z2 + ", wasAvailable=" + booleanValue + ", amount=" + info.getPrizeAmount());
        if (z2 && !booleanValue) {
            Job job = this.videoRewardCheckJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.videoRewardCheckJob = null;
            Log.d("BetPlacedDialog", "Video reward available, stopping periodic checks");
        } else if (!z2 && booleanValue) {
            schedulePeriodicVideoRewardCheck();
            Log.d("BetPlacedDialog", "Video reward unavailable, starting periodic checks");
        }
        if (!z3 || getVideoRewardService().isRewardedReady(this.placement)) {
            return;
        }
        getVideoRewardService().preloadRewarded();
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        if (!isAdded() || isDetached()) {
            return;
        }
        int i = result == null ? -1 : WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
        if (i == -1) {
            this._isVideoRewardAvailable.setValue(false);
            return;
        }
        if (i == 1) {
            this._isVideoRewardAvailable.setValue(false);
            getVideoRewardService().triggerCaching();
            schedulePeriodicVideoRewardCheck();
        } else {
            if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this._isVideoRewardAvailable.setValue(false);
            Log.e("BetPlacedDialog", "Video reward failed: " + result);
            getVideoRewardService().triggerCaching();
            schedulePeriodicVideoRewardCheck();
        }
    }
}

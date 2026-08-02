package org.betup.ui.dialogs.controller;

import android.content.Context;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.bus.ShowNotEnoughBetcoinsVideoOfferMessage;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.interactor.NewChallengeDetailsInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeAcceptInteractor;
import org.betup.model.remote.api.rest.energy.NewChallengeCreateInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.model.remote.entity.challenges.V7ChallengeParticipantModel;
import org.betup.model.remote.entity.challenges.V7ChallengeUserModel;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.events.FollowerSelectedForBattleEvent;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChallengeAcceptController.kt */
@Metadata(d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001v\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010~\u001a\u00020z2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002J\u000f\u0010~\u001a\u00020z2\u0007\u0010\u0081\u0001\u001a\u00020}J\u0007\u0010\u0082\u0001\u001a\u00020zJ\u0007\u0010\u0083\u0001\u001a\u00020zJ¤\u0001\u0010\u0084\u0001\u001a\u00020z2\u0006\u0010j\u001a\u00020k2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020z0y2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010B\u001a\u0004\u0018\u00010@2\b\u0010F\u001a\u0004\u0018\u00010@2\b\u0010I\u001a\u0004\u0018\u00010@2\b\u0010S\u001a\u0004\u0018\u00010@2\b\u0010V\u001a\u0004\u0018\u0001012\b\u0010Y\u001a\u0004\u0018\u0001012\n\b\u0002\u0010]\u001a\u0004\u0018\u0001012\b\u0010_\u001a\u0004\u0018\u00010`2\u000b\b\u0002\u0010\u0087\u0001\u001a\u0004\u0018\u0001012\u0016\b\u0002\u0010{\u001a\u0010\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020z\u0018\u00010|¢\u0006\u0003\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020z2\u0006\u0010B\u001a\u00020@H\u0002J\u0012\u0010\u008a\u0001\u001a\u00020z2\u0007\u0010F\u001a\u00030\u0080\u0001H\u0002J\u0013\u0010\u008b\u0001\u001a\u00020z2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0007J\u0010\u0010\u008e\u0001\u001a\u00020z2\u0007\u0010\u008f\u0001\u001a\u00020@J\u0010\u0010\u0090\u0001\u001a\u00020z2\u0007\u0010\u008f\u0001\u001a\u00020@R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020,0.¢\u0006\b\n\u0000\u001a\u0004\b-\u0010/R\u0016\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010.¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020,0.¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0016\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070.¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020,0.¢\u0006\b\n\u0000\u001a\u0004\b;\u0010/R\u0016\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010.¢\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u0012\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0004\n\u0002\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0012\u0010E\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0004\n\u0002\u0010AR\u0013\u0010F\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bG\u0010DR\u0016\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0+X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010/\"\u0004\bK\u0010LR\u0016\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010.¢\u0006\b\n\u0000\u001a\u0004\bO\u0010/R\u0014\u0010P\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020,0.¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010/R\u0012\u0010R\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0004\n\u0002\u0010AR\u0013\u0010S\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bT\u0010DR\u0010\u0010U\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010V\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0010\u0010Y\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010Z\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b[\u0010XR\u0010\u0010\\\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010]\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b^\u0010XR\u0012\u0010_\u001a\u0004\u0018\u00010`X\u0082\u000e¢\u0006\u0004\n\u0002\u0010aR\u0013\u0010b\u001a\u0004\u0018\u00010`8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010g\u001a\u0004\u0018\u00010f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001c\u0010j\u001a\u0004\u0018\u00010kX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0014\u0010p\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020,0.¢\u0006\b\n\u0000\u001a\u0004\bq\u0010/R\u0014\u0010r\u001a\b\u0012\u0004\u0012\u00020@0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020@0.¢\u0006\b\n\u0000\u001a\u0004\bt\u0010/R\u0010\u0010u\u001a\u00020vX\u0082\u0004¢\u0006\u0004\n\u0002\u0010wR\u0016\u0010x\u001a\n\u0012\u0004\u0012\u00020z\u0018\u00010yX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010{\u001a\u0010\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020z\u0018\u00010|X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0091\u0001"}, d2 = {"Lorg/betup/ui/dialogs/controller/ChallengeAcceptController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "challengeCreateInteractor", "Lorg/betup/model/remote/api/rest/energy/NewChallengeCreateInteractor;", "getChallengeCreateInteractor", "()Lorg/betup/model/remote/api/rest/energy/NewChallengeCreateInteractor;", "setChallengeCreateInteractor", "(Lorg/betup/model/remote/api/rest/energy/NewChallengeCreateInteractor;)V", "challengeAcceptInteractor", "Lorg/betup/model/remote/api/rest/energy/ChallengeAcceptInteractor;", "getChallengeAcceptInteractor", "()Lorg/betup/model/remote/api/rest/energy/ChallengeAcceptInteractor;", "setChallengeAcceptInteractor", "(Lorg/betup/model/remote/api/rest/energy/ChallengeAcceptInteractor;)V", "userServiceP", "Lorg/betup/services/user/UserService;", "getUserServiceP", "()Lorg/betup/services/user/UserService;", "setUserServiceP", "(Lorg/betup/services/user/UserService;)V", "newChallengeDetailsInteractor", "Lorg/betup/model/remote/api/interactor/NewChallengeDetailsInteractor;", "getNewChallengeDetailsInteractor", "()Lorg/betup/model/remote/api/interactor/NewChallengeDetailsInteractor;", "setNewChallengeDetailsInteractor", "(Lorg/betup/model/remote/api/interactor/NewChallengeDetailsInteractor;)V", "matchShortInfoInteractor", "Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;", "getMatchShortInfoInteractor", "()Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;", "setMatchShortInfoInteractor", "(Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "controllerScope", "Lkotlinx/coroutines/CoroutineScope;", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_error", "", "error", "getError", "_isSuccess", "isSuccess", "_matchDetails", "Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "matchDetails", "getMatchDetails", "_isLoadingMatchDetails", "isLoadingMatchDetails", "_matchDetailsError", "matchDetailsError", "getMatchDetailsError", "_challengeId", "", "Ljava/lang/Long;", "challengeId", "getChallengeId", "()Ljava/lang/Long;", "_matchId", "matchId", "getMatchId", "_userId", "userId", "getUserId", "setUserId", "(Lkotlinx/coroutines/flow/StateFlow;)V", "_secondUserPhoto", "secondUserPhoto", "getSecondUserPhoto", "_isUserCreator", "isUserCreator", "_betId", "betId", "getBetId", "_betName", "betName", "getBetName", "()Ljava/lang/String;", "groupName", "group", "getGroup", "_varietyName", "varietyName", "getVarietyName", "coefficient", "", "Ljava/lang/Double;", "coeff", "getCoeff", "()Ljava/lang/Double;", "_challengeDetails", "Lorg/betup/model/remote/entity/challenges/V7ChallengeDetailsResponseModel;", "challengeDetails", "getChallengeDetails", "()Lorg/betup/model/remote/entity/challenges/V7ChallengeDetailsResponseModel;", "activity", "Lorg/betup/ui/MainActivity;", "getActivity", "()Lorg/betup/ui/MainActivity;", "setActivity", "(Lorg/betup/ui/MainActivity;)V", "_isVideoRewardAvailable", "isVideoRewardAvailable", "_videoRewardAmount", "videoRewardAmount", "getVideoRewardAmount", "videoRewardClient", "org/betup/ui/dialogs/controller/ChallengeAcceptController$videoRewardClient$1", "Lorg/betup/ui/dialogs/controller/ChallengeAcceptController$videoRewardClient$1;", "onDismiss", "Lkotlin/Function0;", "", "onShowMessage", "Lkotlin/Function1;", "", "showMessage", "stringResId", "", "message", "destroy", "onVideoRewardButtonClicked", "bind", "context", "Landroid/content/Context;", "followerPhoto", "(Lorg/betup/ui/MainActivity;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "loadChallengeDetails", "loadMatchDetails", "onFollowerSelectedForBattle", "event", "Lorg/betup/ui/dialogs/events/FollowerSelectedForBattleEvent;", "createChallenge", "moneyPlaced", "acceptChallenge", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengeAcceptController {
    public static final int $stable = 8;
    private Long _betId;
    private String _betName;
    private V7ChallengeDetailsResponseModel _challengeDetails;
    private Long _challengeId;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isLoadingMatchDetails;
    private final MutableStateFlow<Boolean> _isSuccess;
    private MutableStateFlow<Boolean> _isUserCreator;
    private final MutableStateFlow<Boolean> _isVideoRewardAvailable;
    private final MutableStateFlow<MatchShortInfoModel> _matchDetails;
    private final MutableStateFlow<String> _matchDetailsError;
    private Long _matchId;
    private MutableStateFlow<String> _secondUserPhoto;
    private MutableStateFlow<Long> _userId;
    private String _varietyName;
    private final MutableStateFlow<Long> _videoRewardAmount;
    private MainActivity activity;

    @Inject
    public ChallengeAcceptInteractor challengeAcceptInteractor;

    @Inject
    public NewChallengeCreateInteractor challengeCreateInteractor;
    private Double coefficient;
    private final CoroutineScope controllerScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    private final StateFlow<String> error;
    private String groupName;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isLoadingMatchDetails;
    private final StateFlow<Boolean> isSuccess;
    private final StateFlow<Boolean> isUserCreator;
    private final StateFlow<Boolean> isVideoRewardAvailable;
    private final StateFlow<MatchShortInfoModel> matchDetails;
    private final StateFlow<String> matchDetailsError;

    @Inject
    public MatchShortInfoInteractor matchShortInfoInteractor;

    @Inject
    public NewChallengeDetailsInteractor newChallengeDetailsInteractor;
    private Function0<Unit> onDismiss;
    private Function1<? super CharSequence, Unit> onShowMessage;
    private final StateFlow<String> secondUserPhoto;
    private StateFlow<Long> userId;

    @Inject
    public UserService userServiceP;
    private final StateFlow<Long> videoRewardAmount;
    private final ChallengeAcceptController$videoRewardClient$1 videoRewardClient;

    @Inject
    public VideoRewardService videoRewardService;

    @Inject
    public ChallengeAcceptController() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow2;
        this.error = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isSuccess = MutableStateFlow3;
        this.isSuccess = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<MatchShortInfoModel> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._matchDetails = MutableStateFlow4;
        this.matchDetails = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingMatchDetails = MutableStateFlow5;
        this.isLoadingMatchDetails = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this._matchDetailsError = MutableStateFlow6;
        this.matchDetailsError = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<Long> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this._userId = MutableStateFlow7;
        this.userId = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<String> MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this._secondUserPhoto = MutableStateFlow8;
        this.secondUserPhoto = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(false);
        this._isUserCreator = MutableStateFlow9;
        this.isUserCreator = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(false);
        this._isVideoRewardAvailable = MutableStateFlow10;
        this.isVideoRewardAvailable = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<Long> MutableStateFlow11 = StateFlowKt.MutableStateFlow(0L);
        this._videoRewardAmount = MutableStateFlow11;
        this.videoRewardAmount = FlowKt.asStateFlow(MutableStateFlow11);
        this.videoRewardClient = new ChallengeAcceptController$videoRewardClient$1(this);
    }

    public final NewChallengeCreateInteractor getChallengeCreateInteractor() {
        NewChallengeCreateInteractor newChallengeCreateInteractor = this.challengeCreateInteractor;
        if (newChallengeCreateInteractor != null) {
            return newChallengeCreateInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challengeCreateInteractor");
        return null;
    }

    public final void setChallengeCreateInteractor(NewChallengeCreateInteractor newChallengeCreateInteractor) {
        Intrinsics.checkNotNullParameter(newChallengeCreateInteractor, "<set-?>");
        this.challengeCreateInteractor = newChallengeCreateInteractor;
    }

    public final ChallengeAcceptInteractor getChallengeAcceptInteractor() {
        ChallengeAcceptInteractor challengeAcceptInteractor = this.challengeAcceptInteractor;
        if (challengeAcceptInteractor != null) {
            return challengeAcceptInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challengeAcceptInteractor");
        return null;
    }

    public final void setChallengeAcceptInteractor(ChallengeAcceptInteractor challengeAcceptInteractor) {
        Intrinsics.checkNotNullParameter(challengeAcceptInteractor, "<set-?>");
        this.challengeAcceptInteractor = challengeAcceptInteractor;
    }

    public final UserService getUserServiceP() {
        UserService userService = this.userServiceP;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userServiceP");
        return null;
    }

    public final void setUserServiceP(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userServiceP = userService;
    }

    public final NewChallengeDetailsInteractor getNewChallengeDetailsInteractor() {
        NewChallengeDetailsInteractor newChallengeDetailsInteractor = this.newChallengeDetailsInteractor;
        if (newChallengeDetailsInteractor != null) {
            return newChallengeDetailsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newChallengeDetailsInteractor");
        return null;
    }

    public final void setNewChallengeDetailsInteractor(NewChallengeDetailsInteractor newChallengeDetailsInteractor) {
        Intrinsics.checkNotNullParameter(newChallengeDetailsInteractor, "<set-?>");
        this.newChallengeDetailsInteractor = newChallengeDetailsInteractor;
    }

    public final MatchShortInfoInteractor getMatchShortInfoInteractor() {
        MatchShortInfoInteractor matchShortInfoInteractor = this.matchShortInfoInteractor;
        if (matchShortInfoInteractor != null) {
            return matchShortInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchShortInfoInteractor");
        return null;
    }

    public final void setMatchShortInfoInteractor(MatchShortInfoInteractor matchShortInfoInteractor) {
        Intrinsics.checkNotNullParameter(matchShortInfoInteractor, "<set-?>");
        this.matchShortInfoInteractor = matchShortInfoInteractor;
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

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final StateFlow<Boolean> isSuccess() {
        return this.isSuccess;
    }

    public final StateFlow<MatchShortInfoModel> getMatchDetails() {
        return this.matchDetails;
    }

    public final StateFlow<Boolean> isLoadingMatchDetails() {
        return this.isLoadingMatchDetails;
    }

    public final StateFlow<String> getMatchDetailsError() {
        return this.matchDetailsError;
    }

    /* renamed from: getChallengeId, reason: from getter */
    public final Long get_challengeId() {
        return this._challengeId;
    }

    /* renamed from: getMatchId, reason: from getter */
    public final Long get_matchId() {
        return this._matchId;
    }

    public final StateFlow<Long> getUserId() {
        return this.userId;
    }

    public final void setUserId(StateFlow<Long> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "<set-?>");
        this.userId = stateFlow;
    }

    public final StateFlow<String> getSecondUserPhoto() {
        return this.secondUserPhoto;
    }

    public final StateFlow<Boolean> isUserCreator() {
        return this.isUserCreator;
    }

    /* renamed from: getBetId, reason: from getter */
    public final Long get_betId() {
        return this._betId;
    }

    /* renamed from: getBetName, reason: from getter */
    public final String get_betName() {
        return this._betName;
    }

    /* renamed from: getGroup, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* renamed from: getVarietyName, reason: from getter */
    public final String get_varietyName() {
        return this._varietyName;
    }

    /* renamed from: getCoeff, reason: from getter */
    public final Double getCoefficient() {
        return this.coefficient;
    }

    /* renamed from: getChallengeDetails, reason: from getter */
    private final V7ChallengeDetailsResponseModel get_challengeDetails() {
        return this._challengeDetails;
    }

    public final MainActivity getActivity() {
        return this.activity;
    }

    public final void setActivity(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public final StateFlow<Boolean> isVideoRewardAvailable() {
        return this.isVideoRewardAvailable;
    }

    public final StateFlow<Long> getVideoRewardAmount() {
        return this.videoRewardAmount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(int stringResId) {
        MainActivity mainActivity = this.activity;
        if (mainActivity == null) {
            return;
        }
        String string = mainActivity.getString(stringResId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Function1<? super CharSequence, Unit> function1 = this.onShowMessage;
        if (function1 != null) {
            function1.invoke(string);
        } else {
            SnackbarHelper.showShort(mainActivity, string);
        }
    }

    public final void showMessage(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Function1<? super CharSequence, Unit> function1 = this.onShowMessage;
        if (function1 != null) {
            function1.invoke(message);
        } else {
            SnackbarHelper.showShort(this.activity, message);
        }
    }

    public final void destroy() {
        EventBus.getDefault().unregister(this);
        getVideoRewardService().disconnectClient(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null);
    }

    public final void onVideoRewardButtonClicked() {
        getVideoRewardService().redeemReward(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, null);
    }

    public final void bind(MainActivity activity, Function0<Unit> onDismiss, Context context, Long challengeId, Long matchId, Long userId, Long betId, String betName, String groupName, String varietyName, Double coefficient, String followerPhoto, Function1<? super CharSequence, Unit> onShowMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(context, "context");
        this.onDismiss = onDismiss;
        this.onShowMessage = onShowMessage;
        this.activity = activity;
        this._challengeId = challengeId;
        this._matchId = matchId;
        this._betId = betId;
        this._betName = betName;
        this.groupName = groupName;
        this._varietyName = varietyName;
        this.coefficient = coefficient;
        this._userId.setValue(userId);
        this._secondUserPhoto.setValue(followerPhoto);
        Log.d("ChallengeAcceptController", "bind() - userId set to: " + userId + ", followerPhoto set to: " + followerPhoto);
        Log.d("ChallengeAcceptController", "bind called: challengeId=" + challengeId + ", matchId=" + matchId + ", userId=" + userId + ", betId=" + betId + ", betName=" + betName + ", coefficient=" + coefficient + ", groupName=" + groupName + ", varietyName=" + varietyName);
        EventBus.getDefault().register(this);
        getVideoRewardService().connectClient(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, this.videoRewardClient);
        getVideoRewardService().getVideoRewardInfo(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, null);
        if (matchId != null) {
            loadMatchDetails((int) matchId.longValue());
        }
        if (challengeId != null) {
            loadChallengeDetails(challengeId.longValue());
        }
    }

    private final void loadChallengeDetails(final long challengeId) {
        Integer id;
        Log.d("ChallengeAcceptController", "Loading challenge details for challengeId: " + challengeId);
        BaseUserModel userModel = getUserServiceP().getShortProfile().getUserModel();
        final Long valueOf = (userModel == null || (id = userModel.getId()) == null) ? null : Long.valueOf(id.intValue());
        if (valueOf == null) {
            Log.w("ChallengeAcceptController", "Current user ID is null, cannot check if user is creator");
        } else {
            getNewChallengeDetailsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<V7ChallengeDetailsResponseModel, Long>() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$loadChallengeDetails$1
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public void onFetched(FetchedResponseMessage<V7ChallengeDetailsResponseModel, Long> response) {
                    MutableStateFlow mutableStateFlow;
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (Intrinsics.areEqual(response.getStat().name(), "SUCCESS") && response.getModel() != null) {
                        V7ChallengeDetailsResponseModel model = response.getModel();
                        ChallengeAcceptController.this._challengeDetails = model;
                        List<V7ChallengeParticipantModel> participants = model.getParticipants();
                        boolean z = false;
                        if (participants != null) {
                            List<V7ChallengeParticipantModel> list = participants;
                            Long l = valueOf;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    V7ChallengeParticipantModel v7ChallengeParticipantModel = (V7ChallengeParticipantModel) it.next();
                                    if (Intrinsics.areEqual((Object) v7ChallengeParticipantModel.isCreator(), (Object) true)) {
                                        V7ChallengeUserModel user = v7ChallengeParticipantModel.getUser();
                                        if (Intrinsics.areEqual(user != null ? Long.valueOf(user.getId()) : null, l)) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        mutableStateFlow = ChallengeAcceptController.this._isUserCreator;
                        mutableStateFlow.setValue(Boolean.valueOf(z));
                        Log.d("ChallengeAcceptController", "Challenge details loaded: challengeId=" + challengeId + ", isUserCreator=" + z + ", currentUserId=" + valueOf + ", moneyAccept=" + model.getMoneyAccept() + ", enterFee=" + model.getEnterFee());
                        return;
                    }
                    Log.e("ChallengeAcceptController", "Failed to load challenge details: " + response.getStat().name());
                }
            }, challengeId);
        }
    }

    private final void loadMatchDetails(int matchId) {
        Log.d("ChallengeAcceptController", "Loading match details for matchId: " + matchId);
        this._isLoadingMatchDetails.setValue(true);
        this._matchDetailsError.setValue(null);
        getMatchShortInfoInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<MatchShortInfoModel, Integer>() { // from class: org.betup.ui.dialogs.controller.ChallengeAcceptController$loadMatchDetails$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<MatchShortInfoModel, Integer> response) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                Intrinsics.checkNotNullParameter(response, "response");
                mutableStateFlow = ChallengeAcceptController.this._isLoadingMatchDetails;
                mutableStateFlow.setValue(false);
                if (Intrinsics.areEqual(response.getStat().name(), "SUCCESS") && response.getModel() != null) {
                    Log.d("ChallengeAcceptController", "Match details loaded successfully: " + response.getModel().getId());
                    mutableStateFlow3 = ChallengeAcceptController.this._matchDetails;
                    mutableStateFlow3.setValue(response.getModel());
                    return;
                }
                Log.e("ChallengeAcceptController", "Failed to load match details: " + response.getStat().name());
                mutableStateFlow2 = ChallengeAcceptController.this._matchDetailsError;
                mutableStateFlow2.setValue("Failed to load match details");
            }
        }, Integer.valueOf(matchId));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onFollowerSelectedForBattle(FollowerSelectedForBattleEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("ChallengeAcceptController", "Received FollowerSelectedForBattleEvent: " + event);
        Log.d("ChallengeAcceptController", "Follower selected for battle: " + event.getFollowerId());
        this._userId.setValue(Long.valueOf(event.getFollowerId()));
        this._secondUserPhoto.setValue(event.getFollowerPhotoUrl());
        Log.d("ChallengeAcceptController", "Updated userId to: " + this._userId.getValue() + ", secondUserPhoto to: " + ((Object) this._secondUserPhoto.getValue()) + ", challenge will be private");
    }

    public final void createChallenge(long moneyPlaced) {
        if (get_betId() == null || get_matchId() == null) {
            Log.e("ChallengeAcceptController", "Missing required data: betId=" + get_betId() + ", matchId=" + get_matchId());
            this._error.setValue("error_missing_data");
            try {
                showMessage(R.string.error_missing_data);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        Long value = this._userId.getValue();
        Log.d("ChallengeAcceptController", "Creating challenge with betId=" + get_betId() + ", matchId=" + get_matchId() + ", userId=" + value);
        long moneyBalance = getUserServiceP().getShortProfile().getUserProgressModel().getMoneyBalance();
        if (moneyBalance >= moneyPlaced) {
            BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new ChallengeAcceptController$createChallenge$2(this, moneyPlaced, null), 3, null);
            return;
        }
        Log.w("ChallengeAcceptController", "Insufficient balance: userBalance=" + moneyBalance + ", moneyPlaced=" + moneyPlaced);
        this._error.setValue("not_enough_money");
        EventBus.getDefault().post(new ShowNotEnoughBetcoinsVideoOfferMessage());
    }

    public final void acceptChallenge(long moneyPlaced) {
        Integer enterFee;
        Integer moneyAccept;
        Long l = this._challengeId;
        Long l2 = get_betId();
        if (l == null || l2 == null) {
            Log.e("ChallengeAcceptController", "Missing required data for acceptance: challengeId=" + l + ", betId=" + l2);
            this._error.setValue("error_missing_data");
            try {
                showMessage(R.string.error_missing_data);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        Log.d("ChallengeAcceptController", "Accepting challenge: challengeId=" + l + ", betId=" + l2 + ", moneyPlaced=" + moneyPlaced);
        V7ChallengeDetailsResponseModel v7ChallengeDetailsResponseModel = get_challengeDetails();
        long intValue = (v7ChallengeDetailsResponseModel == null || (moneyAccept = v7ChallengeDetailsResponseModel.getMoneyAccept()) == null) ? 0L : moneyAccept.intValue();
        V7ChallengeDetailsResponseModel v7ChallengeDetailsResponseModel2 = get_challengeDetails();
        long intValue2 = (v7ChallengeDetailsResponseModel2 == null || (enterFee = v7ChallengeDetailsResponseModel2.getEnterFee()) == null) ? 0L : enterFee.intValue();
        long j = intValue + intValue2;
        if (j > 0) {
            long moneyBalance = getUserServiceP().getShortProfile().getUserProgressModel().getMoneyBalance();
            if (moneyBalance < j) {
                Log.w("ChallengeAcceptController", "Insufficient balance for acceptance: userBalance=" + moneyBalance + ", requiredAmount=" + j + " (moneyAccept=" + intValue + " + enterFee=" + intValue2 + ")");
                this._error.setValue("not_enough_money");
                EventBus.getDefault().post(new ShowNotEnoughBetcoinsVideoOfferMessage());
                return;
            }
        } else {
            Log.w("ChallengeAcceptController", "Challenge details not loaded yet or missing moneyAccept/enterFee, cannot verify balance. Proceeding with backend validation.");
        }
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new ChallengeAcceptController$acceptChallenge$2(this, l, l2, null), 3, null);
    }
}

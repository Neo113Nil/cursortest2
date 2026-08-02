package org.betup.ui.dialogs.controller;

import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.interactor.NewChallengeDetailsInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeCancelInteractor;
import org.betup.model.remote.entity.challenges.NewChallengeBetDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeBetModel;
import org.betup.model.remote.entity.challenges.NewChallengeCreatorModel;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsResponseModelP;
import org.betup.model.remote.entity.challenges.NewChallengeMatchModel;
import org.betup.model.remote.entity.challenges.NewChallengeParticipantModel;
import org.betup.model.remote.entity.challenges.NewChallengeTeamModel;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.QuestionDialog;
import org.betup.ui.dialogs.compose.BattleResultPalette;
import org.betup.ui.dialogs.compose.BattleResultTone;
import org.betup.ui.dialogs.events.OpenBetSelectionEvent;
import org.betup.ui.dialogs.events.OpenCreateBattleDialogEvent;
import org.betup.ui.tour.IntroChallengeActivity;
import org.betup.utils.BattleDetailsMapper;
import org.betup.utils.BattleShareBitmapRenderer;
import org.betup.utils.ChallengeEffectiveStateResolver;
import org.betup.utils.FormatHelper;
import org.betup.utils.MatchShareLinkBuilder;
import org.betup.utils.TicketShareHelper;
import org.betup.utils.UiExtensionsKt;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.asm.signature.SignatureVisitor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChallengePreviewController.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 {2\u00020\u0001:\u0003yz{B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010Q\u001a\u00020MJ=\u0010R\u001a\u00020M2\u0006\u0010E\u001a\u00020F2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020M0L2\b\u0010B\u001a\u0004\u0018\u0001002\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/¢\u0006\u0002\u0010SJ\u0010\u0010T\u001a\u0004\u0018\u00010+2\u0006\u0010B\u001a\u000200J\u000e\u0010U\u001a\u00020M2\u0006\u0010B\u001a\u000200J\u0010\u0010V\u001a\u00020M2\u0006\u0010B\u001a\u000200H\u0002J\u0006\u0010W\u001a\u00020MJ\u0010\u0010X\u001a\u00020M2\u0006\u0010Y\u001a\u00020'H\u0002J\u0006\u0010Z\u001a\u00020MJ\u0006\u0010[\u001a\u00020MJ\u0006\u0010\\\u001a\u00020MJ\u0006\u0010]\u001a\u00020MJ\u0006\u0010^\u001a\u00020\u001cJ\u000e\u0010_\u001a\u00020M2\u0006\u0010`\u001a\u00020aJ\u0006\u0010b\u001a\u00020MJ\b\u0010c\u001a\u0004\u0018\u00010dJ\u0016\u0010e\u001a\u00020M2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020dJ\u0006\u0010i\u001a\u00020MJ\b\u0010j\u001a\u00020MH\u0007J\u0006\u0010k\u001a\u00020MJ\u0006\u0010l\u001a\u00020MJ\u0006\u0010m\u001a\u00020MJ\u0006\u0010n\u001a\u00020MJ\u0010\u0010o\u001a\u00020'2\u0006\u0010p\u001a\u00020'H\u0002J/\u0010q\u001a\u00020'2\u0006\u0010E\u001a\u00020r2\u0006\u0010s\u001a\u00020+2\u0006\u0010t\u001a\u00020'2\b\u0010u\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0002\u0010vJ\u0006\u0010w\u001a\u00020MJ\u0006\u0010x\u001a\u00020MR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0 ¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0 ¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0 ¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020+04X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060 ¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020=0 ¢\u0006\b\n\u0000\u001a\u0004\b?\u0010!R\u0012\u0010@\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0004\n\u0002\u0010AR\u0013\u0010B\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010K\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010N\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u000200\u0018\u00010OX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006|"}, d2 = {"Lorg/betup/ui/dialogs/controller/ChallengePreviewController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "userServiceP", "Lorg/betup/services/user/UserService;", "getUserServiceP", "()Lorg/betup/services/user/UserService;", "setUserServiceP", "(Lorg/betup/services/user/UserService;)V", "newChallengeDetailsInteractor", "Lorg/betup/model/remote/api/interactor/NewChallengeDetailsInteractor;", "getNewChallengeDetailsInteractor", "()Lorg/betup/model/remote/api/interactor/NewChallengeDetailsInteractor;", "setNewChallengeDetailsInteractor", "(Lorg/betup/model/remote/api/interactor/NewChallengeDetailsInteractor;)V", "challengeCancelInteractor", "Lorg/betup/model/remote/api/rest/energy/ChallengeCancelInteractor;", "getChallengeCancelInteractor", "()Lorg/betup/model/remote/api/rest/energy/ChallengeCancelInteractor;", "setChallengeCancelInteractor", "(Lorg/betup/model/remote/api/rest/energy/ChallengeCancelInteractor;)V", "controllerJob", "Lkotlinx/coroutines/Job;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "loadingJob", "isBound", "", "_isBoundState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "isBoundState", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoading", "isLoading", "_isCancelInProgress", "isCancelInProgress", "_error", "", "error", "getError", "_challengeData", "Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsResponseModelP;", "challengeData", "getChallengeData", "_challengeIds", "", "", "challengeIds", "getChallengeIds", "detailsCache", "", "_shareChooserState", "Lorg/betup/ui/dialogs/controller/ChallengePreviewController$BattleShareChooserState;", "shareChooserState", "getShareChooserState", "_canRetry", "canRetry", "getCanRetry", "_retryCount", "", "retryCount", "getRetryCount", "_challengeId", "Ljava/lang/Long;", "challengeId", "getChallengeId", "()Ljava/lang/Long;", "activity", "Lorg/betup/ui/MainActivity;", "getActivity", "()Lorg/betup/ui/MainActivity;", "setActivity", "(Lorg/betup/ui/MainActivity;)V", "onDismiss", "Lkotlin/Function0;", "", "currentLoadListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/challenges/V7ChallengeDetailsResponseModel;", "destroy", "bind", "(Lorg/betup/ui/MainActivity;Lkotlin/jvm/functions/Function0;Ljava/lang/Long;Ljava/util/List;)V", "getDetailsForChallengeId", "onPageChanged", "switchToChallenge", "loadBattleData", "handleLoadingError", "errorMessage", "retryLoading", "clearError", "refreshData", "navigateToAcceptChallenge", "canCancelCurrentChallenge", "showCancelConfirmDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "cancelChallenge", "buildShareContent", "Lorg/betup/ui/dialogs/controller/ChallengePreviewController$BattleShareContent;", "showShareChooser", "bitmap", "Landroid/graphics/Bitmap;", "content", "sharePlainTextFallback", "shareBattleResult", "dismissShareChooser", "shareBattleImageOnly", "shareBattleImageAndLink", "shareBattleLinkOnly", "formatShareAmount", "rawAmount", "buildBattleShareText", "Landroidx/fragment/app/FragmentActivity;", "data", "matchup", "participantState", "(Landroidx/fragment/app/FragmentActivity;Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsResponseModelP;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "navigateToRematch", "openBattleRules", "BattleShareChooserState", "BattleShareContent", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengePreviewController {

    @Deprecated
    public static final long LOADING_TIMEOUT_MS = 15000;

    @Deprecated
    public static final int MAX_RETRY_COUNT = 2;

    @Deprecated
    public static final long RETRY_DELAY_MS = 1000;

    @Deprecated
    public static final String TAG = "ChallengePreviewController";
    private final MutableStateFlow<Boolean> _canRetry;
    private final MutableStateFlow<NewChallengeDetailsResponseModelP> _challengeData;
    private Long _challengeId;
    private final MutableStateFlow<List<Long>> _challengeIds;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Boolean> _isBoundState;
    private final MutableStateFlow<Boolean> _isCancelInProgress;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Integer> _retryCount;
    private final MutableStateFlow<BattleShareChooserState> _shareChooserState;
    private MainActivity activity;
    private final StateFlow<Boolean> canRetry;

    @Inject
    public ChallengeCancelInteractor challengeCancelInteractor;
    private final StateFlow<NewChallengeDetailsResponseModelP> challengeData;
    private final StateFlow<List<Long>> challengeIds;
    private Job controllerJob;
    private CoroutineScope coroutineScope;
    private BaseCachedSharedInteractor.OnFetchedListener<V7ChallengeDetailsResponseModel, Long> currentLoadListener;
    private final Map<Long, NewChallengeDetailsResponseModelP> detailsCache;
    private final StateFlow<String> error;
    private boolean isBound;
    private final StateFlow<Boolean> isBoundState;
    private final StateFlow<Boolean> isCancelInProgress;
    private final StateFlow<Boolean> isLoading;
    private Job loadingJob;

    @Inject
    public NewChallengeDetailsInteractor newChallengeDetailsInteractor;
    private Function0<Unit> onDismiss;
    private final StateFlow<Integer> retryCount;
    private final StateFlow<BattleShareChooserState> shareChooserState;

    @Inject
    public UserService userServiceP;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChallengePreviewController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BattleResultTone.values().length];
            try {
                iArr[BattleResultTone.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BattleResultTone.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BattleResultTone.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BattleResultTone.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BattleResultTone.ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BattleResultTone.RETURNED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BattleResultTone.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BattleResultTone.FINISHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BattleResultTone.NEUTRAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public ChallengePreviewController() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._isBoundState = MutableStateFlow;
        this.isBoundState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow2;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isCancelInProgress = MutableStateFlow3;
        this.isCancelInProgress = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow4;
        this.error = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<NewChallengeDetailsResponseModelP> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._challengeData = MutableStateFlow5;
        this.challengeData = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<List<Long>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._challengeIds = MutableStateFlow6;
        this.challengeIds = FlowKt.asStateFlow(MutableStateFlow6);
        this.detailsCache = new LinkedHashMap();
        MutableStateFlow<BattleShareChooserState> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this._shareChooserState = MutableStateFlow7;
        this.shareChooserState = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(false);
        this._canRetry = MutableStateFlow8;
        this.canRetry = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Integer> MutableStateFlow9 = StateFlowKt.MutableStateFlow(0);
        this._retryCount = MutableStateFlow9;
        this.retryCount = FlowKt.asStateFlow(MutableStateFlow9);
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

    public final ChallengeCancelInteractor getChallengeCancelInteractor() {
        ChallengeCancelInteractor challengeCancelInteractor = this.challengeCancelInteractor;
        if (challengeCancelInteractor != null) {
            return challengeCancelInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challengeCancelInteractor");
        return null;
    }

    public final void setChallengeCancelInteractor(ChallengeCancelInteractor challengeCancelInteractor) {
        Intrinsics.checkNotNullParameter(challengeCancelInteractor, "<set-?>");
        this.challengeCancelInteractor = challengeCancelInteractor;
    }

    public final StateFlow<Boolean> isBoundState() {
        return this.isBoundState;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> isCancelInProgress() {
        return this.isCancelInProgress;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final StateFlow<NewChallengeDetailsResponseModelP> getChallengeData() {
        return this.challengeData;
    }

    public final StateFlow<List<Long>> getChallengeIds() {
        return this.challengeIds;
    }

    /* compiled from: ChallengePreviewController.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lorg/betup/ui/dialogs/controller/ChallengePreviewController$BattleShareChooserState;", "", "bitmap", "Landroid/graphics/Bitmap;", "shareLink", "", "shareText", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getShareLink", "()Ljava/lang/String;", "getShareText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BattleShareChooserState {
        public static final int $stable = 8;
        private final Bitmap bitmap;
        private final String shareLink;
        private final String shareText;

        public static /* synthetic */ BattleShareChooserState copy$default(BattleShareChooserState battleShareChooserState, Bitmap bitmap, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = battleShareChooserState.bitmap;
            }
            if ((i & 2) != 0) {
                str = battleShareChooserState.shareLink;
            }
            if ((i & 4) != 0) {
                str2 = battleShareChooserState.shareText;
            }
            return battleShareChooserState.copy(bitmap, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* renamed from: component2, reason: from getter */
        public final String getShareLink() {
            return this.shareLink;
        }

        /* renamed from: component3, reason: from getter */
        public final String getShareText() {
            return this.shareText;
        }

        public final BattleShareChooserState copy(Bitmap bitmap, String shareLink, String shareText) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(shareLink, "shareLink");
            Intrinsics.checkNotNullParameter(shareText, "shareText");
            return new BattleShareChooserState(bitmap, shareLink, shareText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BattleShareChooserState)) {
                return false;
            }
            BattleShareChooserState battleShareChooserState = (BattleShareChooserState) other;
            return Intrinsics.areEqual(this.bitmap, battleShareChooserState.bitmap) && Intrinsics.areEqual(this.shareLink, battleShareChooserState.shareLink) && Intrinsics.areEqual(this.shareText, battleShareChooserState.shareText);
        }

        public int hashCode() {
            return (((this.bitmap.hashCode() * 31) + this.shareLink.hashCode()) * 31) + this.shareText.hashCode();
        }

        public String toString() {
            return "BattleShareChooserState(bitmap=" + this.bitmap + ", shareLink=" + this.shareLink + ", shareText=" + this.shareText + ")";
        }

        public BattleShareChooserState(Bitmap bitmap, String shareLink, String shareText) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(shareLink, "shareLink");
            Intrinsics.checkNotNullParameter(shareText, "shareText");
            this.bitmap = bitmap;
            this.shareLink = shareLink;
            this.shareText = shareText;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final String getShareLink() {
            return this.shareLink;
        }

        public final String getShareText() {
            return this.shareText;
        }
    }

    /* compiled from: ChallengePreviewController.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/dialogs/controller/ChallengePreviewController$BattleShareContent;", "", "shareText", "", "shareLink", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getShareText", "()Ljava/lang/String;", "getShareLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BattleShareContent {
        public static final int $stable = 0;
        private final String shareLink;
        private final String shareText;

        public static /* synthetic */ BattleShareContent copy$default(BattleShareContent battleShareContent, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = battleShareContent.shareText;
            }
            if ((i & 2) != 0) {
                str2 = battleShareContent.shareLink;
            }
            return battleShareContent.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getShareText() {
            return this.shareText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getShareLink() {
            return this.shareLink;
        }

        public final BattleShareContent copy(String shareText, String shareLink) {
            Intrinsics.checkNotNullParameter(shareText, "shareText");
            Intrinsics.checkNotNullParameter(shareLink, "shareLink");
            return new BattleShareContent(shareText, shareLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BattleShareContent)) {
                return false;
            }
            BattleShareContent battleShareContent = (BattleShareContent) other;
            return Intrinsics.areEqual(this.shareText, battleShareContent.shareText) && Intrinsics.areEqual(this.shareLink, battleShareContent.shareLink);
        }

        public int hashCode() {
            return (this.shareText.hashCode() * 31) + this.shareLink.hashCode();
        }

        public String toString() {
            return "BattleShareContent(shareText=" + this.shareText + ", shareLink=" + this.shareLink + ")";
        }

        public BattleShareContent(String shareText, String shareLink) {
            Intrinsics.checkNotNullParameter(shareText, "shareText");
            Intrinsics.checkNotNullParameter(shareLink, "shareLink");
            this.shareText = shareText;
            this.shareLink = shareLink;
        }

        public final String getShareText() {
            return this.shareText;
        }

        public final String getShareLink() {
            return this.shareLink;
        }
    }

    public final StateFlow<BattleShareChooserState> getShareChooserState() {
        return this.shareChooserState;
    }

    public final StateFlow<Boolean> getCanRetry() {
        return this.canRetry;
    }

    public final StateFlow<Integer> getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: getChallengeId, reason: from getter */
    public final Long get_challengeId() {
        return this._challengeId;
    }

    public final MainActivity getActivity() {
        return this.activity;
    }

    public final void setActivity(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    /* compiled from: ChallengePreviewController.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/dialogs/controller/ChallengePreviewController$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "LOADING_TIMEOUT_MS", "", "MAX_RETRY_COUNT", "", "RETRY_DELAY_MS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void destroy() {
        Long l;
        Log.d(TAG, "destroy() called, cleaning up resources");
        this.isBound = false;
        this._isBoundState.setValue(false);
        BaseCachedSharedInteractor.OnFetchedListener<V7ChallengeDetailsResponseModel, Long> onFetchedListener = this.currentLoadListener;
        if (onFetchedListener != null && (l = this._challengeId) != null) {
            long longValue = l.longValue();
            try {
                getNewChallengeDetailsInteractor().unsubscribe(Long.valueOf(longValue), onFetchedListener);
                Log.d(TAG, "Unsubscribed listener for challenge ID: " + longValue);
            } catch (Exception e) {
                Log.e(TAG, "Error unsubscribing listener: " + e.getMessage(), e);
            }
        }
        this.currentLoadListener = null;
        dismissShareChooser();
        Job job = this.loadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.loadingJob = null;
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.coroutineScope = null;
        Job job2 = this.controllerJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.controllerJob = null;
        this._isLoading.setValue(false);
        this._isCancelInProgress.setValue(false);
        this._error.setValue(null);
        this._canRetry.setValue(false);
        this._retryCount.setValue(0);
        this._challengeId = null;
        this._challengeIds.setValue(CollectionsKt.emptyList());
        this.detailsCache.clear();
        this.activity = null;
        this.onDismiss = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(ChallengePreviewController challengePreviewController, MainActivity mainActivity, Function0 function0, Long l, List list, int i, Object obj) {
        if ((i & 8) != 0) {
            list = null;
        }
        challengePreviewController.bind(mainActivity, function0, l, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        if (r13 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(MainActivity activity, Function0<Unit> onDismiss, Long challengeId, List<Long> challengeIds) {
        Long l;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Log.d(TAG, "bind() called with challengeId: " + challengeId + ", challengeIds: " + (challengeIds != null ? Integer.valueOf(challengeIds.size()) : null));
        if (this.isBound) {
            Log.d(TAG, "Controller was already bound, cleaning up previous state");
            Job job = this.loadingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            CoroutineScope coroutineScope = this.coroutineScope;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            }
            BaseCachedSharedInteractor.OnFetchedListener<V7ChallengeDetailsResponseModel, Long> onFetchedListener = this.currentLoadListener;
            if (onFetchedListener != null && (l = this._challengeId) != null) {
                long longValue = l.longValue();
                try {
                    getNewChallengeDetailsInteractor().unsubscribe(Long.valueOf(longValue), onFetchedListener);
                    Log.d(TAG, "Unsubscribed previous listener for challenge ID: " + longValue);
                } catch (Exception e) {
                    Log.e(TAG, "Error unsubscribing previous listener: " + e.getMessage(), e);
                }
            }
            this.currentLoadListener = null;
        }
        this.controllerJob = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        Job job2 = this.controllerJob;
        Intrinsics.checkNotNull(job2);
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(main.plus(job2));
        this.onDismiss = onDismiss;
        this.activity = activity;
        if (challengeIds != null) {
            if (challengeIds.isEmpty()) {
                challengeIds = null;
            }
        }
        if (challengeId != null) {
            challengeIds = CollectionsKt.listOf(Long.valueOf(challengeId.longValue()));
        } else {
            challengeIds = CollectionsKt.emptyList();
        }
        this._challengeIds.setValue(challengeIds);
        if (challengeId == null) {
            challengeId = (Long) CollectionsKt.firstOrNull((List) challengeIds);
        }
        this._challengeId = challengeId;
        this.isBound = true;
        this._isBoundState.setValue(true);
        this._isLoading.setValue(false);
        this._error.setValue(null);
        MutableStateFlow<NewChallengeDetailsResponseModelP> mutableStateFlow = this._challengeData;
        Long l2 = this._challengeId;
        mutableStateFlow.setValue(l2 != null ? this.detailsCache.get(Long.valueOf(l2.longValue())) : null);
        this._canRetry.setValue(false);
        this._retryCount.setValue(0);
        loadBattleData();
    }

    public final NewChallengeDetailsResponseModelP getDetailsForChallengeId(long challengeId) {
        NewChallengeDetailsModel challenge;
        Long id;
        NewChallengeDetailsResponseModelP value = this._challengeData.getValue();
        return (value == null || (challenge = value.getChallenge()) == null || (id = challenge.getId()) == null || id.longValue() != challengeId) ? this.detailsCache.get(Long.valueOf(challengeId)) : value;
    }

    public final void onPageChanged(long challengeId) {
        if (this.isBound) {
            Long l = this._challengeId;
            if (l != null && l.longValue() == challengeId) {
                return;
            }
            switchToChallenge(challengeId);
        }
    }

    private final void switchToChallenge(long challengeId) {
        Long l;
        BaseCachedSharedInteractor.OnFetchedListener<V7ChallengeDetailsResponseModel, Long> onFetchedListener = this.currentLoadListener;
        if (onFetchedListener != null && (l = this._challengeId) != null) {
            try {
                getNewChallengeDetailsInteractor().unsubscribe(Long.valueOf(l.longValue()), onFetchedListener);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                Integer.valueOf(Log.e(TAG, "Error unsubscribing listener: " + e.getMessage(), e));
            }
        }
        this.currentLoadListener = null;
        Job job = this.loadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this._challengeId = Long.valueOf(challengeId);
        NewChallengeDetailsResponseModelP newChallengeDetailsResponseModelP = this.detailsCache.get(Long.valueOf(challengeId));
        this._challengeData.setValue(newChallengeDetailsResponseModelP);
        this._error.setValue(null);
        this._canRetry.setValue(false);
        this._isLoading.setValue(Boolean.valueOf(newChallengeDetailsResponseModelP == null));
        loadBattleData();
    }

    public final void loadBattleData() {
        if (!this.isBound) {
            Log.w(TAG, "Controller is not bound, skipping load");
            return;
        }
        if (this._challengeId == null) {
            Log.e(TAG, "Challenge ID is null, cannot load data");
            this._error.setValue("Invalid challenge ID");
            this._canRetry.setValue(false);
            this._isLoading.setValue(false);
            return;
        }
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope == null) {
            Log.e(TAG, "CoroutineScope is null, cannot load data");
            this._isLoading.setValue(false);
            return;
        }
        Job job = this.loadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (this.detailsCache.get(this._challengeId) == null) {
            this._isLoading.setValue(true);
        }
        this._error.setValue(null);
        this._canRetry.setValue(false);
        Log.d(TAG, "Loading challenge data for ID: " + this._challengeId);
        this.loadingJob = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ChallengePreviewController$loadBattleData$1(this, null), 3, null);
        Long l = this._challengeId;
        Intrinsics.checkNotNull(l);
        final long longValue = l.longValue();
        BaseCachedSharedInteractor.OnFetchedListener<V7ChallengeDetailsResponseModel, Long> onFetchedListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.ChallengePreviewController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                ChallengePreviewController.loadBattleData$lambda$9(ChallengePreviewController.this, longValue, fetchedResponseMessage);
            }
        };
        this.currentLoadListener = onFetchedListener;
        try {
            getNewChallengeDetailsInteractor().load(onFetchedListener, longValue);
        } catch (Exception e) {
            Log.e(TAG, "Exception calling interactor.load: " + e.getMessage(), e);
            this.currentLoadListener = null;
            this._isLoading.setValue(false);
            handleLoadingError("Failed to start loading");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBattleData$lambda$9(ChallengePreviewController challengePreviewController, long j, FetchedResponseMessage fetchedResponseMessage) {
        CoroutineScope coroutineScope = challengePreviewController.coroutineScope;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new ChallengePreviewController$loadBattleData$listener$1$1(challengePreviewController, j, fetchedResponseMessage, null), 2, null);
            return;
        }
        Log.e(TAG, "CoroutineScope is null when processing response, setting loading to false");
        challengePreviewController._isLoading.setValue(false);
        challengePreviewController._error.setValue("Internal error - please try again");
        challengePreviewController._canRetry.setValue(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoadingError(String errorMessage) {
        if (this.isBound) {
            Log.e(TAG, "Loading error: " + errorMessage);
            this._isLoading.setValue(false);
            this._error.setValue(errorMessage);
            if (this._retryCount.getValue().intValue() < 2) {
                this._canRetry.setValue(true);
                Log.d(TAG, "Can retry loading, current retry count: " + this._retryCount.getValue());
            } else {
                this._canRetry.setValue(false);
                Log.w(TAG, "Max retry count reached, cannot retry");
            }
        }
    }

    public final void retryLoading() {
        if (this.isBound) {
            if (this._retryCount.getValue().intValue() >= 2) {
                Log.w(TAG, "Cannot retry - max retry count reached");
                return;
            }
            CoroutineScope coroutineScope = this.coroutineScope;
            if (coroutineScope == null) {
                return;
            }
            MutableStateFlow<Integer> mutableStateFlow = this._retryCount;
            mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
            Log.d(TAG, "Retrying loading, attempt: " + this._retryCount.getValue());
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ChallengePreviewController$retryLoading$1(this, null), 3, null);
        }
    }

    public final void clearError() {
        this._error.setValue(null);
        this._canRetry.setValue(false);
        this._retryCount.setValue(0);
    }

    public final void refreshData() {
        if (this.isBound) {
            Log.d(TAG, "Refreshing challenge data");
            this._retryCount.setValue(0);
            loadBattleData();
        }
    }

    public final void navigateToAcceptChallenge() {
        NewChallengeMatchModel match;
        NewChallengeDetailsResponseModelP value = this._challengeData.getValue();
        if (value == null || (match = value.getMatch()) == null) {
            return;
        }
        long id = match.getId();
        Long l = this._challengeId;
        if (l != null) {
            long longValue = l.longValue();
            Log.d(TAG, "Navigating to accept challenge: challengeId=" + longValue + ", matchId=" + id);
            Function0<Unit> function0 = this.onDismiss;
            if (function0 != null) {
                function0.invoke();
            }
            EventBus.getDefault().post(new OpenBetSelectionEvent(id, Long.valueOf(longValue), null, null, null, 28, null));
        }
    }

    public final boolean canCancelCurrentChallenge() {
        BaseUserModel userModel;
        Integer id;
        NewChallengeDetailsModel challenge;
        Integer state;
        NewChallengeDetailsResponseModelP value = this._challengeData.getValue();
        if (value == null || (userModel = getUserServiceP().getShortProfile().getUserModel()) == null || (id = userModel.getId()) == null) {
            return false;
        }
        long intValue = id.intValue();
        NewChallengeCreatorModel createdBy = value.getCreatedBy();
        if (createdBy == null || createdBy.getId() != intValue || (challenge = value.getChallenge()) == null || (state = challenge.getState()) == null || state.intValue() != 1) {
            return false;
        }
        NewChallengeMatchModel match = value.getMatch();
        return match == null || !UiExtensionsKt.isStarted(match);
    }

    public final void showCancelConfirmDialog(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        MainActivity mainActivity = this.activity;
        if (mainActivity == null || !canCancelCurrentChallenge() || this._isCancelInProgress.getValue().booleanValue()) {
            return;
        }
        QuestionDialog.Companion companion = QuestionDialog.INSTANCE;
        String string = mainActivity.getString(R.string.battle_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = mainActivity.getString(R.string.battle_cancel_confirm_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        QuestionDialog.Companion.newInstance$default(companion, string, string2, new Function0() { // from class: org.betup.ui.dialogs.controller.ChallengePreviewController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showCancelConfirmDialog$lambda$10;
                showCancelConfirmDialog$lambda$10 = ChallengePreviewController.showCancelConfirmDialog$lambda$10(ChallengePreviewController.this);
                return showCancelConfirmDialog$lambda$10;
            }
        }, null, 8, null).show(fragmentManager, "BattleCancelConfirm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCancelConfirmDialog$lambda$10(ChallengePreviewController challengePreviewController) {
        challengePreviewController.cancelChallenge();
        return Unit.INSTANCE;
    }

    public final void cancelChallenge() {
        Long l = this._challengeId;
        if (l != null) {
            long longValue = l.longValue();
            CoroutineScope coroutineScope = this.coroutineScope;
            if (coroutineScope == null || this._isCancelInProgress.getValue().booleanValue()) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ChallengePreviewController$cancelChallenge$1(this, longValue, coroutineScope, null), 3, null);
        }
    }

    public final BattleShareContent buildShareContent() {
        String str;
        String build;
        NewChallengeBetDetailsModel bet;
        NewChallengeTeamModel awayTeam;
        NewChallengeTeamModel homeTeam;
        NewChallengeDetailsResponseModelP value = this._challengeData.getValue();
        if (value == null) {
            return null;
        }
        MainActivity mainActivity = this.activity;
        MainActivity mainActivity2 = mainActivity instanceof FragmentActivity ? mainActivity : null;
        if (mainActivity2 == null) {
            return null;
        }
        NewChallengeMatchModel match = value.getMatch();
        String name = (match == null || (homeTeam = match.getHomeTeam()) == null) ? null : homeTeam.getName();
        if (name == null) {
            name = "";
        }
        String name2 = (match == null || (awayTeam = match.getAwayTeam()) == null) ? null : awayTeam.getName();
        List listOf = CollectionsKt.listOf((Object[]) new String[]{name, name2 != null ? name2 : ""});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, " vs ", null, null, 0, null, null, 62, null);
        List<NewChallengeParticipantModel> participantUsers = value.getParticipantUsers();
        if (participantUsers == null) {
            participantUsers = CollectionsKt.emptyList();
        }
        List<NewChallengeBetModel> bets = value.getBets();
        if (bets == null) {
            bets = CollectionsKt.emptyList();
        }
        NewChallengeCreatorModel createdBy = value.getCreatedBy();
        Long valueOf = createdBy != null ? Long.valueOf(createdBy.getId()) : null;
        boolean z = participantUsers.size() <= 1;
        Iterator<NewChallengeParticipantModel> it = participantUsers.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            long id = it.next().getId();
            if (valueOf == null || id != valueOf.longValue()) {
                break;
            }
            i++;
        }
        NewChallengeBetModel newChallengeBetModel = i >= 0 ? (NewChallengeBetModel) CollectionsKt.getOrNull(bets, i) : null;
        if (newChallengeBetModel == null || (bet = newChallengeBetModel.getBet()) == null || (str = bet.getBetName()) == null || Intrinsics.areEqual(str, AbstractJsonLexerKt.NULL) || StringsKt.isBlank(str)) {
            str = null;
        }
        boolean z2 = str != null;
        ChallengeEffectiveStateResolver challengeEffectiveStateResolver = ChallengeEffectiveStateResolver.INSTANCE;
        NewChallengeDetailsModel challenge = value.getChallenge();
        Integer resolveEffectiveStateInt = challengeEffectiveStateResolver.resolveEffectiveStateInt(challenge != null ? challenge.getState() : null, value.getParticipantState(), z, z2);
        String buildBattleShareText = buildBattleShareText(mainActivity2, value, joinToString$default, Integer.valueOf(resolveEffectiveStateInt != null ? resolveEffectiveStateInt.intValue() : 0));
        if (match == null || (build = MatchShareLinkBuilder.INSTANCE.build(match.getId())) == null || StringsKt.isBlank(build)) {
            return null;
        }
        return new BattleShareContent(buildBattleShareText, build);
    }

    public final void showShareChooser(Bitmap bitmap, BattleShareContent content) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(content, "content");
        dismissShareChooser();
        this._shareChooserState.setValue(new BattleShareChooserState(bitmap, content.getShareLink(), content.getShareText()));
    }

    public final void sharePlainTextFallback() {
        NewChallengeTeamModel awayTeam;
        NewChallengeTeamModel homeTeam;
        BattleShareContent buildShareContent = buildShareContent();
        MainActivity mainActivity = this.activity;
        String str = null;
        MainActivity mainActivity2 = mainActivity instanceof FragmentActivity ? mainActivity : null;
        if (mainActivity2 == null) {
            return;
        }
        if (buildShareContent == null) {
            NewChallengeDetailsResponseModelP value = this._challengeData.getValue();
            if (value == null) {
                return;
            }
            String[] strArr = new String[2];
            NewChallengeMatchModel match = value.getMatch();
            String name = (match == null || (homeTeam = match.getHomeTeam()) == null) ? null : homeTeam.getName();
            if (name == null) {
                name = "";
            }
            strArr[0] = name;
            NewChallengeMatchModel match2 = value.getMatch();
            if (match2 != null && (awayTeam = match2.getAwayTeam()) != null) {
                str = awayTeam.getName();
            }
            strArr[1] = str != null ? str : "";
            List listOf = CollectionsKt.listOf((Object[]) strArr);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOf) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList.add(obj);
                }
            }
            String joinToString$default = CollectionsKt.joinToString$default(arrayList, " vs ", null, null, 0, null, null, 62, null);
            Integer participantState = value.getParticipantState();
            TicketShareHelper.INSTANCE.sharePlainText(mainActivity2, buildBattleShareText(mainActivity2, value, joinToString$default, Integer.valueOf(participantState != null ? participantState.intValue() : 0)), R.string.battle_share);
            return;
        }
        TicketShareHelper.INSTANCE.sharePlainText(mainActivity2, buildShareContent.getShareText() + "\n\n" + buildShareContent.getShareLink(), R.string.battle_share);
    }

    @Deprecated(message = "Use PixelCopy capture + showShareChooser")
    public final void shareBattleResult() {
        String str;
        String string;
        NewChallengeBetDetailsModel bet;
        NewChallengeTeamModel awayTeam;
        NewChallengeTeamModel homeTeam;
        BattleShareContent buildShareContent = buildShareContent();
        MainActivity mainActivity = this.activity;
        MainActivity mainActivity2 = mainActivity instanceof FragmentActivity ? mainActivity : null;
        if (mainActivity2 == null) {
            return;
        }
        if (buildShareContent == null) {
            sharePlainTextFallback();
            return;
        }
        NewChallengeDetailsResponseModelP value = this._challengeData.getValue();
        if (value == null) {
            return;
        }
        NewChallengeMatchModel match = value.getMatch();
        String name = (match == null || (homeTeam = match.getHomeTeam()) == null) ? null : homeTeam.getName();
        String str2 = "";
        if (name == null) {
            name = "";
        }
        String name2 = (match == null || (awayTeam = match.getAwayTeam()) == null) ? null : awayTeam.getName();
        if (name2 == null) {
            name2 = "";
        }
        List listOf = CollectionsKt.listOf((Object[]) new String[]{name, name2});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, " vs ", null, null, 0, null, null, 62, null);
        List<NewChallengeParticipantModel> participantUsers = value.getParticipantUsers();
        if (participantUsers == null) {
            participantUsers = CollectionsKt.emptyList();
        }
        List<NewChallengeBetModel> bets = value.getBets();
        if (bets == null) {
            bets = CollectionsKt.emptyList();
        }
        NewChallengeCreatorModel createdBy = value.getCreatedBy();
        Long valueOf = createdBy != null ? Long.valueOf(createdBy.getId()) : null;
        boolean z = participantUsers.size() <= 1;
        Iterator<NewChallengeParticipantModel> it = participantUsers.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            long id = it.next().getId();
            if (valueOf == null || id != valueOf.longValue()) {
                break;
            } else {
                i++;
            }
        }
        NewChallengeBetModel newChallengeBetModel = i >= 0 ? (NewChallengeBetModel) CollectionsKt.getOrNull(bets, i) : null;
        if (newChallengeBetModel == null || (bet = newChallengeBetModel.getBet()) == null || (str = bet.getBetName()) == null || Intrinsics.areEqual(str, AbstractJsonLexerKt.NULL) || StringsKt.isBlank(str)) {
            str = null;
        }
        boolean z2 = str != null;
        ChallengeEffectiveStateResolver challengeEffectiveStateResolver = ChallengeEffectiveStateResolver.INSTANCE;
        NewChallengeDetailsModel challenge = value.getChallenge();
        Integer resolveEffectiveStateInt = challengeEffectiveStateResolver.resolveEffectiveStateInt(challenge != null ? challenge.getState() : null, value.getParticipantState(), z, z2);
        int intValue = resolveEffectiveStateInt != null ? resolveEffectiveStateInt.intValue() : 0;
        BattleResultPalette from = BattleResultPalette.INSTANCE.from(BattleResultPalette.INSTANCE.fromEffectiveState(Integer.valueOf(intValue)));
        switch (WhenMappings.$EnumSwitchMapping$0[from.getTone().ordinal()]) {
            case 1:
                string = mainActivity2.getString(R.string.battle_won);
                break;
            case 2:
                string = mainActivity2.getString(R.string.battle_lost);
                break;
            case 3:
                string = mainActivity2.getString(R.string.battle_draw_title);
                break;
            case 4:
                string = mainActivity2.getString(R.string.battle_pending_title);
                break;
            case 5:
                string = mainActivity2.getString(R.string.battle_active_title);
                break;
            case 6:
                string = mainActivity2.getString(R.string.battle_returned_title);
                break;
            case 7:
                string = mainActivity2.getString(R.string.battle_canceled_title);
                break;
            case 8:
                string = mainActivity2.getString(R.string.battle_finished_title);
                break;
            case 9:
                string = mainActivity2.getString(R.string.battle);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str3 = string;
        Intrinsics.checkNotNull(str3);
        int i2 = WhenMappings.$EnumSwitchMapping$0[from.getTone().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                str2 = mainActivity2.getString(R.string.draw);
                Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
            } else {
                str2 = mainActivity2.getString(R.string.battle_you_earned);
                Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
            }
        }
        String str4 = str2;
        String formatShareAmount = formatShareAmount(BattleDetailsMapper.INSTANCE.resolveAmountDisplay(value, intValue, false).getAmountText());
        int i3 = (int) (mainActivity2.getResources().getDisplayMetrics().widthPixels * 0.86f);
        BattleShareBitmapRenderer battleShareBitmapRenderer = BattleShareBitmapRenderer.INSTANCE;
        MainActivity mainActivity3 = mainActivity2;
        String str5 = joinToString$default;
        if (StringsKt.isBlank(str5)) {
            str5 = mainActivity2.getString(R.string.battle);
            Intrinsics.checkNotNullExpressionValue(str5, "getString(...)");
        }
        Bitmap render = battleShareBitmapRenderer.render(mainActivity3, from, str3, str4, formatShareAmount, str5, i3);
        if (render == null) {
            sharePlainTextFallback();
        } else {
            showShareChooser(render, buildShareContent);
        }
    }

    public final void dismissShareChooser() {
        Bitmap bitmap;
        BattleShareChooserState value = this._shareChooserState.getValue();
        if (value != null && (bitmap = value.getBitmap()) != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        this._shareChooserState.setValue(null);
    }

    public final void shareBattleImageOnly() {
        BattleShareChooserState value = this._shareChooserState.getValue();
        if (value == null) {
            return;
        }
        MainActivity mainActivity = this.activity;
        MainActivity mainActivity2 = mainActivity instanceof FragmentActivity ? mainActivity : null;
        if (mainActivity2 == null) {
            return;
        }
        TicketShareHelper.INSTANCE.shareBitmapAsImage(mainActivity2, value.getBitmap(), 0L, (r17 & 8) != 0 ? false : false, (r17 & 16) != 0, (r17 & 32) != 0 ? null : null);
        dismissShareChooser();
    }

    public final void shareBattleImageAndLink() {
        BattleShareChooserState value = this._shareChooserState.getValue();
        if (value == null) {
            return;
        }
        MainActivity mainActivity = this.activity;
        MainActivity mainActivity2 = mainActivity instanceof FragmentActivity ? mainActivity : null;
        if (mainActivity2 == null) {
            return;
        }
        TicketShareHelper.INSTANCE.shareBitmapAsImage(mainActivity2, value.getBitmap(), 0L, (r17 & 8) != 0 ? false : false, (r17 & 16) != 0 ? true : true, (r17 & 32) != 0 ? null : value.getShareText() + "\n\n" + value.getShareLink());
        dismissShareChooser();
    }

    public final void shareBattleLinkOnly() {
        BattleShareChooserState value = this._shareChooserState.getValue();
        if (value == null) {
            return;
        }
        MainActivity mainActivity = this.activity;
        MainActivity mainActivity2 = mainActivity instanceof FragmentActivity ? mainActivity : null;
        if (mainActivity2 == null) {
            return;
        }
        TicketShareHelper.INSTANCE.sharePlainText(mainActivity2, value.getShareText() + "\n\n" + value.getShareLink(), R.string.battle_share);
        dismissShareChooser();
    }

    private final String formatShareAmount(String rawAmount) {
        String str = "+";
        if (!StringsKt.startsWith$default(rawAmount, "+", false, 2, (Object) null)) {
            str = "-";
            if (!StringsKt.startsWith$default(rawAmount, "-", false, 2, (Object) null)) {
                str = "";
            }
        }
        Long longOrNull = StringsKt.toLongOrNull(StringsKt.trimStart(rawAmount, SignatureVisitor.EXTENDS, SignatureVisitor.SUPER));
        if (longOrNull == null) {
            return rawAmount;
        }
        return str + FormatHelper.getDialogBetcoinsFormated(longOrNull.longValue());
    }

    private final String buildBattleShareText(FragmentActivity activity, NewChallengeDetailsResponseModelP data, String matchup, Integer participantState) {
        Long enterFee;
        Long moneyAccept;
        Long moneyToWin;
        Long enterFee2;
        Long moneyAccept2;
        long j = 0;
        if (participantState != null && participantState.intValue() == 4) {
            NewChallengeDetailsModel challenge = data.getChallenge();
            long longValue = (challenge == null || (moneyAccept2 = challenge.getMoneyAccept()) == null) ? 0L : moneyAccept2.longValue();
            NewChallengeDetailsModel challenge2 = data.getChallenge();
            long longValue2 = longValue + ((challenge2 == null || (enterFee2 = challenge2.getEnterFee()) == null) ? 0L : enterFee2.longValue());
            if (longValue2 > 0) {
                j = 2 * longValue2;
            } else {
                NewChallengeDetailsModel challenge3 = data.getChallenge();
                if (challenge3 != null && (moneyToWin = challenge3.getMoneyToWin()) != null) {
                    j = moneyToWin.longValue();
                }
            }
            String string = activity.getString(R.string.battle_share_result_won, new Object[]{FormatHelper.getDialogBetcoinsFormated(j), matchup});
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (participantState != null && participantState.intValue() == 5) {
            NewChallengeDetailsModel challenge4 = data.getChallenge();
            long longValue3 = (challenge4 == null || (moneyAccept = challenge4.getMoneyAccept()) == null) ? 0L : moneyAccept.longValue();
            NewChallengeDetailsModel challenge5 = data.getChallenge();
            if (challenge5 != null && (enterFee = challenge5.getEnterFee()) != null) {
                j = enterFee.longValue();
            }
            String string2 = activity.getString(R.string.battle_share_result_lost, new Object[]{FormatHelper.getDialogBetcoinsFormated(longValue3 + j), matchup});
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = activity.getString(R.string.battle_share_result_generic, new Object[]{matchup});
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public final void navigateToRematch() {
        Object obj;
        Integer matchState;
        Long enterFee;
        Long moneyAccept;
        Integer id;
        NewChallengeDetailsResponseModelP value = this._challengeData.getValue();
        if (value == null) {
            return;
        }
        List<NewChallengeParticipantModel> participantUsers = value.getParticipantUsers();
        if (participantUsers == null) {
            participantUsers = CollectionsKt.emptyList();
        }
        if (participantUsers.size() < 2) {
            return;
        }
        BaseUserModel userModel = getUserServiceP().getShortProfile().getUserModel();
        Long valueOf = (userModel == null || (id = userModel.getId()) == null) ? null : Long.valueOf(id.intValue());
        Iterator<T> it = participantUsers.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long id2 = ((NewChallengeParticipantModel) obj).getId();
            if (valueOf == null || id2 != valueOf.longValue()) {
                break;
            }
        }
        NewChallengeParticipantModel newChallengeParticipantModel = (NewChallengeParticipantModel) obj;
        if (newChallengeParticipantModel == null) {
            return;
        }
        long id3 = newChallengeParticipantModel.getId();
        NewChallengeMatchModel match = value.getMatch();
        Long valueOf2 = match != null ? Long.valueOf(match.getId()) : null;
        NewChallengeDetailsModel challenge = value.getChallenge();
        long longValue = (challenge == null || (moneyAccept = challenge.getMoneyAccept()) == null) ? 0L : moneyAccept.longValue();
        NewChallengeDetailsModel challenge2 = value.getChallenge();
        long longValue2 = longValue + ((challenge2 == null || (enterFee = challenge2.getEnterFee()) == null) ? 0L : enterFee.longValue());
        Function0<Unit> function0 = this.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
        NewChallengeMatchModel match2 = value.getMatch();
        MatchState fromInt = (match2 == null || (matchState = match2.getMatchState()) == null) ? null : MatchState.fromInt(matchState.intValue());
        if (valueOf2 != null && fromInt == MatchState.SCHEDULED) {
            EventBus eventBus = EventBus.getDefault();
            long longValue3 = valueOf2.longValue();
            Long valueOf3 = Long.valueOf(id3);
            String photoUrl = newChallengeParticipantModel.getPhotoUrl();
            Long valueOf4 = Long.valueOf(longValue2);
            eventBus.post(new OpenBetSelectionEvent(longValue3, null, valueOf3, photoUrl, valueOf4.longValue() > 0 ? valueOf4 : null));
        } else {
            EventBus.getDefault().post(new OpenCreateBattleDialogEvent(Long.valueOf(id3), newChallengeParticipantModel.getPhotoUrl()));
        }
        Log.d(TAG, "Rematch started toward opponent=" + id3 + ", buyIn=" + longValue2 + ", matchId=" + valueOf2);
    }

    public final void openBattleRules() {
        MainActivity mainActivity = this.activity;
        if (mainActivity == null) {
            return;
        }
        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) IntroChallengeActivity.class));
    }
}

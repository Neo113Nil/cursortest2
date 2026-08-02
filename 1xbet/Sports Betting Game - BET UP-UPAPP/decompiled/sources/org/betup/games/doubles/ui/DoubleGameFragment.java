package org.betup.games.doubles.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.mediationsdk.metadata.a;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.databinding.FragmentDoubleGameBinding;
import org.betup.games.BaseGameFragmentWithVideoRewards;
import org.betup.games.doubles.model.interactor.FinishDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.GetConfigDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.GetHistoryDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.StartDoubleGameInteractor;
import org.betup.games.doubles.model.rest.ConfigDoubleGame;
import org.betup.games.doubles.model.rest.DoubleBetType;
import org.betup.games.doubles.model.rest.RouletteDoubleGameModel;
import org.betup.games.doubles.model.rest.SessionDoubleGame;
import org.betup.games.doubles.model.rest.SessionHistoryDoubleGame;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.utils.SharedPrefs;
import org.betup.utils.TextUtilClassKt;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: DoubleGameFragment.kt */
@Metadata(d1 = {"\u0000é\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001b\b\u0007\u0018\u0000 \u0083\u00012\u00020\u00012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002:\u0002\u0083\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u00104\u001a\u000201H\u0002J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u000203H\u0014J$\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010D\u001a\u000201H\u0016J\b\u0010E\u001a\u00020:H\u0016J\b\u0010F\u001a\u00020\rH\u0014J\u0018\u0010G\u001a\u00020:2\u0006\u0010H\u001a\u0002012\u0006\u0010I\u001a\u000203H\u0014J\u001a\u0010J\u001a\u00020:2\u0006\u0010K\u001a\u00020?2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010L\u001a\u00020:H\u0002J \u0010Q\u001a\u00020:2\u0016\u0010R\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010SH\u0016J\b\u0010T\u001a\u00020:H\u0002J\b\u0010U\u001a\u00020:H\u0002J\b\u0010V\u001a\u00020:H\u0003J\b\u0010W\u001a\u00020:H\u0002J\b\u0010X\u001a\u00020:H\u0002J\b\u0010Y\u001a\u00020:H\u0002J\b\u0010`\u001a\u00020:H\u0002J\b\u0010d\u001a\u00020:H\u0002J\u0018\u0010g\u001a\u00020:2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020PH\u0002J \u0010k\u001a\u00020:2\u0006\u0010l\u001a\u0002012\u0006\u0010m\u001a\u00020?2\u0006\u0010n\u001a\u00020oH\u0003J\b\u0010p\u001a\u000201H\u0003J\b\u0010r\u001a\u00020sH\u0002J\b\u0010t\u001a\u00020:H\u0003J\b\u0010u\u001a\u00020:H\u0003J\b\u0010v\u001a\u00020:H\u0002J\u0010\u0010w\u001a\u00020:2\u0006\u0010\\\u001a\u00020]H\u0002J \u0010x\u001a\u00020:2\u0006\u0010\\\u001a\u00020]2\u0006\u0010y\u001a\u0002062\u0006\u0010z\u001a\u00020\u0004H\u0003J\u0010\u0010{\u001a\u00020:2\u0006\u0010|\u001a\u000201H\u0002J$\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u00042\f\b\u0002\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0002¢\u0006\u0003\u0010\u0082\u0001R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010M\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N\u0012\u0006\u0012\u0004\u0018\u00010P0\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020[X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\\\u001a\u00020]¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0010\u0010a\u001a\u00020bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010cR\u001a\u0010e\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020P0\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010q\u001a\u00020[8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0084\u0001"}, d2 = {"Lorg/betup/games/doubles/ui/DoubleGameFragment;", "Lorg/betup/games/BaseGameFragmentWithVideoRewards;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/games/doubles/model/rest/ConfigDoubleGame;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "_binding", "Lorg/betup/databinding/FragmentDoubleGameBinding;", "binding", "getBinding", "()Lorg/betup/databinding/FragmentDoubleGameBinding;", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "getConfigDoubleGameInteractor", "Lorg/betup/games/doubles/model/interactor/GetConfigDoubleGameInteractor;", "getGetConfigDoubleGameInteractor", "()Lorg/betup/games/doubles/model/interactor/GetConfigDoubleGameInteractor;", "setGetConfigDoubleGameInteractor", "(Lorg/betup/games/doubles/model/interactor/GetConfigDoubleGameInteractor;)V", "startGameInteractor", "Lorg/betup/games/doubles/model/interactor/StartDoubleGameInteractor;", "getStartGameInteractor", "()Lorg/betup/games/doubles/model/interactor/StartDoubleGameInteractor;", "setStartGameInteractor", "(Lorg/betup/games/doubles/model/interactor/StartDoubleGameInteractor;)V", "finishGameInteractor", "Lorg/betup/games/doubles/model/interactor/FinishDoubleGameInteractor;", "getFinishGameInteractor", "()Lorg/betup/games/doubles/model/interactor/FinishDoubleGameInteractor;", "setFinishGameInteractor", "(Lorg/betup/games/doubles/model/interactor/FinishDoubleGameInteractor;)V", "getHistoryGameInteractor", "Lorg/betup/games/doubles/model/interactor/GetHistoryDoubleGameInteractor;", "getGetHistoryGameInteractor", "()Lorg/betup/games/doubles/model/interactor/GetHistoryDoubleGameInteractor;", "setGetHistoryGameInteractor", "(Lorg/betup/games/doubles/model/interactor/GetHistoryDoubleGameInteractor;)V", "_isGameStarted", "", "stakeForCurrentRound", "", "isGameStarted", "betTypeSelected", "Lorg/betup/games/doubles/model/rest/DoubleBetType;", "rouletteSnapHelper", "Landroidx/recyclerview/widget/LinearSnapHelper;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getAmount", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onBackPressed", "onDestroyView", "getVideoRewardServiceInstance", "updateOfferState", "isAvailable", "amount", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "setupHistoryRecycler", "onGameHistoryGot", "", "Lorg/betup/games/doubles/model/rest/SessionHistoryDoubleGame;", "", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "initLayout", "initListeners", "initTouchListeners", "initClickListeners", "toggleCubeSelectButtons", "initCoefsButtonsListeners", "makeBetClickListener", "Landroid/view/View$OnClickListener;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "placeBet", "onGameStarted", "org/betup/games/doubles/ui/DoubleGameFragment$onGameStarted$1", "Lorg/betup/games/doubles/ui/DoubleGameFragment$onGameStarted$1;", "recoverFromFailedStartGameUi", "onGameFinished", "Lorg/betup/games/doubles/model/rest/SessionDoubleGame;", "showResultDialog", "resultDialogDoubleGameDto", "Lorg/betup/games/doubles/ui/ResultDialogDoubleGameDto;", "sessionId", "toggleBetTypeBackgroundResource", "isActive", "containerView", "textView", "Landroid/widget/TextView;", "isBetValid", "betButtonClickListener", "getDefaultAmount", "", "startTimer", "stopTimer", "initRoulette", "startRoulette", "stopRoulette", "betType", "ordinal", "toggleClickabilityButtons", a.k, "getDefaultLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "orientation", "smoothSpeed", "", "(ILjava/lang/Float;)Landroidx/recyclerview/widget/LinearLayoutManager;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DoubleGameFragment extends BaseGameFragmentWithVideoRewards implements BaseCachedSharedInteractor.OnFetchedListener<ConfigDoubleGame, Integer> {
    private static ConfigDoubleGame config;
    private FragmentDoubleGameBinding _binding;
    private boolean _isGameStarted;

    @Inject
    public FinishDoubleGameInteractor finishGameInteractor;

    @Inject
    public GetConfigDoubleGameInteractor getConfigDoubleGameInteractor;

    @Inject
    public GetHistoryDoubleGameInteractor getHistoryGameInteractor;
    private LinearSnapHelper rouletteSnapHelper;
    private long stakeForCurrentRound;

    @Inject
    public StartDoubleGameInteractor startGameInteractor;

    @Inject
    public UserService userService;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private DoubleBetType betTypeSelected = DoubleBetType.RED;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<SessionHistoryDoubleGame>, String> onGameHistoryGot = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            DoubleGameFragment.onGameHistoryGot$lambda$2(DoubleGameFragment.this, fetchedResponseMessage);
        }
    };
    private final View.OnClickListener makeBetClickListener = new View.OnClickListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DoubleGameFragment.makeBetClickListener$lambda$16(DoubleGameFragment.this, view);
        }
    };
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final DoubleGameFragment$onGameStarted$1 onGameStarted = new DoubleGameFragment$onGameStarted$1(this);
    private final BaseCachedSharedInteractor.OnFetchedListener<SessionDoubleGame, String> onGameFinished = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda5
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            DoubleGameFragment.onGameFinished$lambda$18(DoubleGameFragment.this, fetchedResponseMessage);
        }
    };
    private final View.OnClickListener betButtonClickListener = new View.OnClickListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DoubleGameFragment.betButtonClickListener$lambda$23(DoubleGameFragment.this, view);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initTouchListeners$lambda$6$lambda$5(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        return true;
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards
    protected void updateOfferState(boolean isAvailable, long amount) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentDoubleGameBinding getBinding() {
        FragmentDoubleGameBinding fragmentDoubleGameBinding = this._binding;
        if (fragmentDoubleGameBinding != null) {
            return fragmentDoubleGameBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_binding");
        return null;
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

    public final GetConfigDoubleGameInteractor getGetConfigDoubleGameInteractor() {
        GetConfigDoubleGameInteractor getConfigDoubleGameInteractor = this.getConfigDoubleGameInteractor;
        if (getConfigDoubleGameInteractor != null) {
            return getConfigDoubleGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getConfigDoubleGameInteractor");
        return null;
    }

    public final void setGetConfigDoubleGameInteractor(GetConfigDoubleGameInteractor getConfigDoubleGameInteractor) {
        Intrinsics.checkNotNullParameter(getConfigDoubleGameInteractor, "<set-?>");
        this.getConfigDoubleGameInteractor = getConfigDoubleGameInteractor;
    }

    public final StartDoubleGameInteractor getStartGameInteractor() {
        StartDoubleGameInteractor startDoubleGameInteractor = this.startGameInteractor;
        if (startDoubleGameInteractor != null) {
            return startDoubleGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startGameInteractor");
        return null;
    }

    public final void setStartGameInteractor(StartDoubleGameInteractor startDoubleGameInteractor) {
        Intrinsics.checkNotNullParameter(startDoubleGameInteractor, "<set-?>");
        this.startGameInteractor = startDoubleGameInteractor;
    }

    public final FinishDoubleGameInteractor getFinishGameInteractor() {
        FinishDoubleGameInteractor finishDoubleGameInteractor = this.finishGameInteractor;
        if (finishDoubleGameInteractor != null) {
            return finishDoubleGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("finishGameInteractor");
        return null;
    }

    public final void setFinishGameInteractor(FinishDoubleGameInteractor finishDoubleGameInteractor) {
        Intrinsics.checkNotNullParameter(finishDoubleGameInteractor, "<set-?>");
        this.finishGameInteractor = finishDoubleGameInteractor;
    }

    public final GetHistoryDoubleGameInteractor getGetHistoryGameInteractor() {
        GetHistoryDoubleGameInteractor getHistoryDoubleGameInteractor = this.getHistoryGameInteractor;
        if (getHistoryDoubleGameInteractor != null) {
            return getHistoryDoubleGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getHistoryGameInteractor");
        return null;
    }

    public final void setGetHistoryGameInteractor(GetHistoryDoubleGameInteractor getHistoryDoubleGameInteractor) {
        Intrinsics.checkNotNullParameter(getHistoryDoubleGameInteractor, "<set-?>");
        this.getHistoryGameInteractor = getHistoryDoubleGameInteractor;
    }

    /* renamed from: isGameStarted, reason: from getter */
    private final boolean get_isGameStarted() {
        return this._isGameStarted;
    }

    /* compiled from: DoubleGameFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lorg/betup/games/doubles/ui/DoubleGameFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/games/doubles/ui/DoubleGameFragment;", "config", "Lorg/betup/games/doubles/model/rest/ConfigDoubleGame;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DoubleGameFragment newInstance() {
            return new DoubleGameFragment();
        }
    }

    @Override // org.betup.games.BaseGameFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        Context applicationContext = activity != null ? activity.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // org.betup.games.BaseGameFragment
    protected long getAmount() {
        EditText editText = getBinding().betAmountEt;
        Editable text = editText.getText();
        if (text == null || text.length() == 0) {
            return getMinCoef();
        }
        Intrinsics.checkNotNull(editText);
        return TextUtilClassKt.editTextToLong(editText);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentDoubleGameBinding.inflate(inflater, container, false);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards, org.betup.games.BaseGameFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        LinearSnapHelper linearSnapHelper = this.rouletteSnapHelper;
        if (linearSnapHelper != null) {
            linearSnapHelper.attachToRecyclerView(null);
        }
        this.rouletteSnapHelper = null;
        super.onDestroyView();
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards
    protected VideoRewardService getVideoRewardServiceInstance() {
        return getVideoRewardService();
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupHistoryRecycler();
        getGetConfigDoubleGameInteractor().load(this, null);
        getGetHistoryGameInteractor().load(this.onGameHistoryGot, null);
        initRoulette();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupHistoryRecycler() {
        RecyclerView recyclerView = getBinding().historyRv;
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(getDefaultLinearLayoutManager(0, Float.valueOf(3.0f)));
        }
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new HistoryDoubleGameAdapter(null, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGameHistoryGot$lambda$2(DoubleGameFragment doubleGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        List<SessionHistoryDoubleGame> list;
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && doubleGameFragment.isActive() && (list = (List) fetchedResponseMessage.getModel()) != null) {
            doubleGameFragment.setupHistoryRecycler();
            RecyclerView.Adapter adapter = doubleGameFragment.getBinding().historyRv.getAdapter();
            HistoryDoubleGameAdapter historyDoubleGameAdapter = adapter instanceof HistoryDoubleGameAdapter ? (HistoryDoubleGameAdapter) adapter : null;
            if (historyDoubleGameAdapter == null) {
                return;
            }
            historyDoubleGameAdapter.addSessionList(list);
        }
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<ConfigDoubleGame, Integer> responseMessage) {
        if ((responseMessage != null ? responseMessage.getStat() : null) == FetchStat.SUCCESS && isActive()) {
            config = responseMessage.getModel();
            initLayout();
            initListeners();
        }
    }

    private final void initLayout() {
        getBinding().betAmountEt.setText(getDefaultAmount().toString());
        setupHistoryRecycler();
    }

    private final void initListeners() {
        initTouchListeners();
        initClickListeners();
    }

    private final void initTouchListeners() {
        FragmentDoubleGameBinding binding = getBinding();
        binding.makeBetLl.setOnTouchListener(new View.OnTouchListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean initTouchListeners$lambda$6$lambda$4;
                initTouchListeners$lambda$6$lambda$4 = DoubleGameFragment.initTouchListeners$lambda$6$lambda$4(DoubleGameFragment.this, view, motionEvent);
                return initTouchListeners$lambda$6$lambda$4;
            }
        });
        binding.rouletteRv.setOnTouchListener(new View.OnTouchListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean initTouchListeners$lambda$6$lambda$5;
                initTouchListeners$lambda$6$lambda$5 = DoubleGameFragment.initTouchListeners$lambda$6$lambda$5(view, motionEvent);
                return initTouchListeners$lambda$6$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initTouchListeners$lambda$6$lambda$4(DoubleGameFragment doubleGameFragment, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getBackground().setTint(doubleGameFragment.getResources().getColor(R.color.double_game_make_bet_bg, doubleGameFragment.requireContext().getTheme()));
            return false;
        }
        if (action != 1) {
            return false;
        }
        view.getBackground().setTint(doubleGameFragment.getResources().getColor(R.color.double_game_make_bet_active_bg, doubleGameFragment.requireContext().getTheme()));
        return false;
    }

    private final void initClickListeners() {
        getBinding().makeBetLl.setOnClickListener(this.makeBetClickListener);
        initCoefsButtonsListeners();
        toggleCubeSelectButtons();
    }

    private final void toggleCubeSelectButtons() {
        final FragmentDoubleGameBinding binding = getBinding();
        final LinearLayout linearLayout = binding.redBetTypeLl;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DoubleGameFragment.toggleCubeSelectButtons$lambda$14$lambda$9$lambda$8(DoubleGameFragment.this, linearLayout, binding, view);
            }
        });
        final LinearLayout linearLayout2 = binding.blackBetTypeLl;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DoubleGameFragment.toggleCubeSelectButtons$lambda$14$lambda$11$lambda$10(DoubleGameFragment.this, linearLayout2, binding, view);
            }
        });
        final LinearLayout linearLayout3 = binding.zeroBetTypeLl;
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DoubleGameFragment.toggleCubeSelectButtons$lambda$14$lambda$13$lambda$12(DoubleGameFragment.this, linearLayout3, binding, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleCubeSelectButtons$lambda$14$lambda$9$lambda$8(DoubleGameFragment doubleGameFragment, LinearLayout linearLayout, FragmentDoubleGameBinding fragmentDoubleGameBinding, View view) {
        DoubleBetType doubleBetType = DoubleBetType.RED;
        doubleGameFragment.betTypeSelected = doubleBetType;
        boolean z = doubleBetType == DoubleBetType.RED;
        Intrinsics.checkNotNull(linearLayout);
        TextView redBetTypeTv = fragmentDoubleGameBinding.redBetTypeTv;
        Intrinsics.checkNotNullExpressionValue(redBetTypeTv, "redBetTypeTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(z, linearLayout, redBetTypeTv);
        boolean z2 = doubleGameFragment.betTypeSelected == DoubleBetType.BLACK;
        LinearLayout blackBetTypeLl = fragmentDoubleGameBinding.blackBetTypeLl;
        Intrinsics.checkNotNullExpressionValue(blackBetTypeLl, "blackBetTypeLl");
        TextView blackBetTypeTv = fragmentDoubleGameBinding.blackBetTypeTv;
        Intrinsics.checkNotNullExpressionValue(blackBetTypeTv, "blackBetTypeTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(z2, blackBetTypeLl, blackBetTypeTv);
        boolean z3 = doubleGameFragment.betTypeSelected == DoubleBetType.ZERO;
        LinearLayout zeroBetTypeLl = fragmentDoubleGameBinding.zeroBetTypeLl;
        Intrinsics.checkNotNullExpressionValue(zeroBetTypeLl, "zeroBetTypeLl");
        TextView zeroBetTypeTv = fragmentDoubleGameBinding.zeroBetTypeTv;
        Intrinsics.checkNotNullExpressionValue(zeroBetTypeTv, "zeroBetTypeTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(z3, zeroBetTypeLl, zeroBetTypeTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleCubeSelectButtons$lambda$14$lambda$11$lambda$10(DoubleGameFragment doubleGameFragment, LinearLayout linearLayout, FragmentDoubleGameBinding fragmentDoubleGameBinding, View view) {
        DoubleBetType doubleBetType = DoubleBetType.BLACK;
        doubleGameFragment.betTypeSelected = doubleBetType;
        boolean z = doubleBetType == DoubleBetType.BLACK;
        Intrinsics.checkNotNull(linearLayout);
        TextView blackBetTypeTv = fragmentDoubleGameBinding.blackBetTypeTv;
        Intrinsics.checkNotNullExpressionValue(blackBetTypeTv, "blackBetTypeTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(z, linearLayout, blackBetTypeTv);
        boolean z2 = doubleGameFragment.betTypeSelected == DoubleBetType.RED;
        LinearLayout redBetTypeLl = fragmentDoubleGameBinding.redBetTypeLl;
        Intrinsics.checkNotNullExpressionValue(redBetTypeLl, "redBetTypeLl");
        TextView redBetTypeTv = fragmentDoubleGameBinding.redBetTypeTv;
        Intrinsics.checkNotNullExpressionValue(redBetTypeTv, "redBetTypeTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(z2, redBetTypeLl, redBetTypeTv);
        boolean z3 = doubleGameFragment.betTypeSelected == DoubleBetType.ZERO;
        LinearLayout zeroBetTypeLl = fragmentDoubleGameBinding.zeroBetTypeLl;
        Intrinsics.checkNotNullExpressionValue(zeroBetTypeLl, "zeroBetTypeLl");
        TextView zeroBetTypeTv = fragmentDoubleGameBinding.zeroBetTypeTv;
        Intrinsics.checkNotNullExpressionValue(zeroBetTypeTv, "zeroBetTypeTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(z3, zeroBetTypeLl, zeroBetTypeTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleCubeSelectButtons$lambda$14$lambda$13$lambda$12(DoubleGameFragment doubleGameFragment, LinearLayout linearLayout, FragmentDoubleGameBinding fragmentDoubleGameBinding, View view) {
        DoubleBetType doubleBetType = DoubleBetType.ZERO;
        doubleGameFragment.betTypeSelected = doubleBetType;
        boolean z = doubleBetType == DoubleBetType.ZERO;
        Intrinsics.checkNotNull(linearLayout);
        TextView zeroBetTypeTv = fragmentDoubleGameBinding.zeroBetTypeTv;
        Intrinsics.checkNotNullExpressionValue(zeroBetTypeTv, "zeroBetTypeTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(z, linearLayout, zeroBetTypeTv);
        boolean z2 = doubleGameFragment.betTypeSelected == DoubleBetType.RED;
        LinearLayout redBetTypeLl = fragmentDoubleGameBinding.redBetTypeLl;
        Intrinsics.checkNotNullExpressionValue(redBetTypeLl, "redBetTypeLl");
        TextView redBetTypeTv = fragmentDoubleGameBinding.redBetTypeTv;
        Intrinsics.checkNotNullExpressionValue(redBetTypeTv, "redBetTypeTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(z2, redBetTypeLl, redBetTypeTv);
        boolean z3 = doubleGameFragment.betTypeSelected == DoubleBetType.BLACK;
        LinearLayout blackBetTypeLl = fragmentDoubleGameBinding.blackBetTypeLl;
        Intrinsics.checkNotNullExpressionValue(blackBetTypeLl, "blackBetTypeLl");
        TextView blackBetTypeTv = fragmentDoubleGameBinding.blackBetTypeTv;
        Intrinsics.checkNotNullExpressionValue(blackBetTypeTv, "blackBetTypeTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(z3, blackBetTypeLl, blackBetTypeTv);
    }

    private final void initCoefsButtonsListeners() {
        FragmentDoubleGameBinding binding = getBinding();
        binding.buttonMin.setOnClickListener(this.betButtonClickListener);
        binding.buttonDouble.setOnClickListener(this.betButtonClickListener);
        binding.buttonHalf.setOnClickListener(this.betButtonClickListener);
        binding.buttonMax.setOnClickListener(this.betButtonClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeBetClickListener$lambda$16(DoubleGameFragment doubleGameFragment, View view) {
        if (doubleGameFragment.isActive() && !doubleGameFragment.get_isGameStarted() && doubleGameFragment.isBetValid()) {
            doubleGameFragment.placeBet();
        }
    }

    public final Handler getHandler() {
        return this.handler;
    }

    private final void placeBet() {
        long amount = getAmount();
        this.stakeForCurrentRound = amount;
        applyOptimisticStakeDeductionOnly(amount);
        this._isGameStarted = true;
        startTimer();
        startRoulette(this.handler);
        toggleClickabilityButtons(false);
        Bundle bundle = new Bundle();
        bundle.putLong("betAmount", amount);
        bundle.putInt("betType", this.betTypeSelected.getValue());
        getStartGameInteractor().load(this.onGameStarted, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverFromFailedStartGameUi() {
        this.handler.removeCallbacksAndMessages(null);
        stopTimer();
        toggleClickabilityButtons(true);
        this._isGameStarted = false;
        initRoulette();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGameFinished$lambda$18(DoubleGameFragment doubleGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS && doubleGameFragment.isActive()) {
            doubleGameFragment.validateProfile();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showResultDialog(ResultDialogDoubleGameDto resultDialogDoubleGameDto, final String sessionId) {
        ResultDoubleGameDialog newInstance = ResultDoubleGameDialog.INSTANCE.newInstance(resultDialogDoubleGameDto, new Function0() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showResultDialog$lambda$19;
                showResultDialog$lambda$19 = DoubleGameFragment.showResultDialog$lambda$19();
                return showResultDialog$lambda$19;
            }
        }, new Function0() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showResultDialog$lambda$20;
                showResultDialog$lambda$20 = DoubleGameFragment.showResultDialog$lambda$20(DoubleGameFragment.this);
                return showResultDialog$lambda$20;
            }
        }, new DoubleGameFragment$showResultDialog$dialog$1(this), new Function1() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit showResultDialog$lambda$22;
                showResultDialog$lambda$22 = DoubleGameFragment.showResultDialog$lambda$22(DoubleGameFragment.this, sessionId, ((Long) obj).longValue());
                return showResultDialog$lambda$22;
            }
        });
        newInstance.show(getChildFragmentManager(), newInstance.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showResultDialog$lambda$19() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MINI_GAMES_HOME_ACTIVITY, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showResultDialog$lambda$20(DoubleGameFragment doubleGameFragment) {
        doubleGameFragment.onVideoRewardClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showResultDialog$lambda$22(DoubleGameFragment doubleGameFragment, String str, long j) {
        FinishDoubleGameInteractor finishGameInteractor = doubleGameFragment.getFinishGameInteractor();
        BaseCachedSharedInteractor.OnFetchedListener<SessionDoubleGame, String> onFetchedListener = doubleGameFragment.onGameFinished;
        Bundle bundle = new Bundle();
        bundle.putLong("returnAmount", j);
        Unit unit = Unit.INSTANCE;
        finishGameInteractor.load(onFetchedListener, str, bundle);
        return Unit.INSTANCE;
    }

    private final void toggleBetTypeBackgroundResource(boolean isActive, View containerView, TextView textView) {
        if (isActive) {
            containerView.setBackground(getResources().getDrawable(R.drawable.double_game_bet_type_button_active_bg, requireContext().getTheme()));
            textView.setTextColor(getResources().getColor(R.color.double_game_bet_type_active_text, requireContext().getTheme()));
        } else {
            containerView.setBackground(getResources().getDrawable(R.drawable.double_game_bet_type_button_bg, requireContext().getTheme()));
            textView.setTextColor(getResources().getColor(R.color.double_game_bet_type_text, requireContext().getTheme()));
        }
    }

    private final boolean isBetValid() {
        EditText betAmountEt = getBinding().betAmountEt;
        Intrinsics.checkNotNullExpressionValue(betAmountEt, "betAmountEt");
        long amount = getAmount();
        betAmountEt.setText(String.valueOf(amount));
        long moneyBalance = getUserServiceAccessor().getUserService().getShortProfile().getUserProgressModel().getMoneyBalance();
        if (amount > getMaxCoef() && amount > moneyBalance) {
            String string = getString(R.string.bet_grather_then_expected, Integer.valueOf(getMaxCoef()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            makeToast(string);
            showShopDialog();
        }
        if (amount > moneyBalance) {
            makeToast(R.string.not_enough_betcoins);
            showShopDialog();
            return false;
        }
        if (amount < getMinCoef()) {
            String string2 = getString(R.string.bet_smaller_then_expected, Integer.valueOf(getMinCoef()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            makeToast(string2);
            return false;
        }
        if (amount <= getMaxCoef()) {
            return true;
        }
        String string3 = getString(R.string.bet_grather_then_expected, Integer.valueOf(getMaxCoef()));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        makeToast(string3);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void betButtonClickListener$lambda$23(DoubleGameFragment doubleGameFragment, View view) {
        int id = view.getId();
        EditText betAmountEt = doubleGameFragment.getBinding().betAmountEt;
        Intrinsics.checkNotNullExpressionValue(betAmountEt, "betAmountEt");
        if (betAmountEt.getText() == null) {
            doubleGameFragment.makeToast(R.string.select_your_bet);
            return;
        }
        if (id == R.id.buttonMin) {
            betAmountEt.setText(String.valueOf(doubleGameFragment.getMinCoef()));
            LinearLayout buttonMin = doubleGameFragment.getBinding().buttonMin;
            Intrinsics.checkNotNullExpressionValue(buttonMin, "buttonMin");
            TextView minBetTv = doubleGameFragment.getBinding().minBetTv;
            Intrinsics.checkNotNullExpressionValue(minBetTv, "minBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(true, buttonMin, minBetTv);
            LinearLayout buttonDouble = doubleGameFragment.getBinding().buttonDouble;
            Intrinsics.checkNotNullExpressionValue(buttonDouble, "buttonDouble");
            TextView doubleBetTv = doubleGameFragment.getBinding().doubleBetTv;
            Intrinsics.checkNotNullExpressionValue(doubleBetTv, "doubleBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonDouble, doubleBetTv);
            LinearLayout buttonHalf = doubleGameFragment.getBinding().buttonHalf;
            Intrinsics.checkNotNullExpressionValue(buttonHalf, "buttonHalf");
            TextView halfBetTv = doubleGameFragment.getBinding().halfBetTv;
            Intrinsics.checkNotNullExpressionValue(halfBetTv, "halfBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonHalf, halfBetTv);
            LinearLayout buttonMax = doubleGameFragment.getBinding().buttonMax;
            Intrinsics.checkNotNullExpressionValue(buttonMax, "buttonMax");
            TextView maxBetTv = doubleGameFragment.getBinding().maxBetTv;
            Intrinsics.checkNotNullExpressionValue(maxBetTv, "maxBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonMax, maxBetTv);
            return;
        }
        if (id == R.id.buttonMax) {
            betAmountEt.setText(String.valueOf(doubleGameFragment.getMaxCoef()));
            LinearLayout buttonMin2 = doubleGameFragment.getBinding().buttonMin;
            Intrinsics.checkNotNullExpressionValue(buttonMin2, "buttonMin");
            TextView minBetTv2 = doubleGameFragment.getBinding().minBetTv;
            Intrinsics.checkNotNullExpressionValue(minBetTv2, "minBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonMin2, minBetTv2);
            LinearLayout buttonDouble2 = doubleGameFragment.getBinding().buttonDouble;
            Intrinsics.checkNotNullExpressionValue(buttonDouble2, "buttonDouble");
            TextView doubleBetTv2 = doubleGameFragment.getBinding().doubleBetTv;
            Intrinsics.checkNotNullExpressionValue(doubleBetTv2, "doubleBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonDouble2, doubleBetTv2);
            LinearLayout buttonHalf2 = doubleGameFragment.getBinding().buttonHalf;
            Intrinsics.checkNotNullExpressionValue(buttonHalf2, "buttonHalf");
            TextView halfBetTv2 = doubleGameFragment.getBinding().halfBetTv;
            Intrinsics.checkNotNullExpressionValue(halfBetTv2, "halfBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonHalf2, halfBetTv2);
            LinearLayout buttonMax2 = doubleGameFragment.getBinding().buttonMax;
            Intrinsics.checkNotNullExpressionValue(buttonMax2, "buttonMax");
            TextView maxBetTv2 = doubleGameFragment.getBinding().maxBetTv;
            Intrinsics.checkNotNullExpressionValue(maxBetTv2, "maxBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(true, buttonMax2, maxBetTv2);
            return;
        }
        Editable text = betAmountEt.getText();
        if (text == null || text.length() == 0) {
            doubleGameFragment.makeToast(R.string.select_your_bet);
            return;
        }
        int editTextToInt = TextUtilClassKt.editTextToInt(betAmountEt);
        if (TextUtilClassKt.editTextToLong(betAmountEt) > doubleGameFragment.getMaxCoef()) {
            doubleGameFragment.makeToast(R.string.bet_grather_then_expected);
            return;
        }
        if (id != R.id.buttonDouble) {
            if (id != R.id.buttonHalf) {
                return;
            }
            LinearLayout buttonMin3 = doubleGameFragment.getBinding().buttonMin;
            Intrinsics.checkNotNullExpressionValue(buttonMin3, "buttonMin");
            TextView minBetTv3 = doubleGameFragment.getBinding().minBetTv;
            Intrinsics.checkNotNullExpressionValue(minBetTv3, "minBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonMin3, minBetTv3);
            LinearLayout buttonDouble3 = doubleGameFragment.getBinding().buttonDouble;
            Intrinsics.checkNotNullExpressionValue(buttonDouble3, "buttonDouble");
            TextView doubleBetTv3 = doubleGameFragment.getBinding().doubleBetTv;
            Intrinsics.checkNotNullExpressionValue(doubleBetTv3, "doubleBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonDouble3, doubleBetTv3);
            LinearLayout buttonHalf3 = doubleGameFragment.getBinding().buttonHalf;
            Intrinsics.checkNotNullExpressionValue(buttonHalf3, "buttonHalf");
            TextView halfBetTv3 = doubleGameFragment.getBinding().halfBetTv;
            Intrinsics.checkNotNullExpressionValue(halfBetTv3, "halfBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(true, buttonHalf3, halfBetTv3);
            LinearLayout buttonMax3 = doubleGameFragment.getBinding().buttonMax;
            Intrinsics.checkNotNullExpressionValue(buttonMax3, "buttonMax");
            TextView maxBetTv3 = doubleGameFragment.getBinding().maxBetTv;
            Intrinsics.checkNotNullExpressionValue(maxBetTv3, "maxBetTv");
            doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonMax3, maxBetTv3);
            if (editTextToInt / 2 < doubleGameFragment.getMinCoef()) {
                doubleGameFragment.makeToast(R.string.cant_divide_your_bet);
                return;
            } else {
                betAmountEt.setText(String.valueOf(TextUtilClassKt.editTextToInt(betAmountEt) / 2));
                return;
            }
        }
        LinearLayout buttonMin4 = doubleGameFragment.getBinding().buttonMin;
        Intrinsics.checkNotNullExpressionValue(buttonMin4, "buttonMin");
        TextView minBetTv4 = doubleGameFragment.getBinding().minBetTv;
        Intrinsics.checkNotNullExpressionValue(minBetTv4, "minBetTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonMin4, minBetTv4);
        LinearLayout buttonDouble4 = doubleGameFragment.getBinding().buttonDouble;
        Intrinsics.checkNotNullExpressionValue(buttonDouble4, "buttonDouble");
        TextView doubleBetTv4 = doubleGameFragment.getBinding().doubleBetTv;
        Intrinsics.checkNotNullExpressionValue(doubleBetTv4, "doubleBetTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(true, buttonDouble4, doubleBetTv4);
        LinearLayout buttonHalf4 = doubleGameFragment.getBinding().buttonHalf;
        Intrinsics.checkNotNullExpressionValue(buttonHalf4, "buttonHalf");
        TextView halfBetTv4 = doubleGameFragment.getBinding().halfBetTv;
        Intrinsics.checkNotNullExpressionValue(halfBetTv4, "halfBetTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonHalf4, halfBetTv4);
        LinearLayout buttonMax4 = doubleGameFragment.getBinding().buttonMax;
        Intrinsics.checkNotNullExpressionValue(buttonMax4, "buttonMax");
        TextView maxBetTv4 = doubleGameFragment.getBinding().maxBetTv;
        Intrinsics.checkNotNullExpressionValue(maxBetTv4, "maxBetTv");
        doubleGameFragment.toggleBetTypeBackgroundResource(false, buttonMax4, maxBetTv4);
        if (editTextToInt > doubleGameFragment.getMaxCoef() / 2) {
            String string = doubleGameFragment.getString(R.string.cant_double_your_bet);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            doubleGameFragment.makeToast(string);
            return;
        }
        betAmountEt.setText(String.valueOf(TextUtilClassKt.editTextToInt(betAmountEt) * 2));
    }

    private final Number getDefaultAmount() {
        Long customBetAmount = SharedPrefs.getCustomBetAmount(getBinding().getRoot().getContext());
        int minCoef = getMinCoef();
        int maxCoef = getMaxCoef();
        Intrinsics.checkNotNull(customBetAmount);
        long longValue = customBetAmount.longValue();
        if (minCoef <= longValue && longValue <= maxCoef) {
            return customBetAmount;
        }
        if (customBetAmount.longValue() < getMinCoef()) {
            return Integer.valueOf(getMinCoef());
        }
        return Integer.valueOf(getMaxCoef());
    }

    private final void startTimer() {
        getBinding().timerCl.animate().alpha(1.0f).setDuration(300L).start();
        getBinding().timerActiveV.setAlpha(1.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, getBinding().timerCl.getWidth());
        final long j = 3000;
        ofInt.setDuration(3000L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DoubleGameFragment.startTimer$lambda$24(DoubleGameFragment.this, valueAnimator);
            }
        });
        ofInt.start();
        final Handler handler = new Handler(Looper.getMainLooper());
        final long currentTimeMillis = System.currentTimeMillis();
        final long j2 = 10;
        handler.post(new Runnable() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$startTimer$updateRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                FragmentDoubleGameBinding binding;
                FragmentDoubleGameBinding binding2;
                long currentTimeMillis2 = j - (System.currentTimeMillis() - currentTimeMillis);
                if (currentTimeMillis2 > 0) {
                    binding2 = this.getBinding();
                    binding2.timerTv.setText(this.getString(R.string.double_game_timer, Double.valueOf(currentTimeMillis2 / 1000.0d)));
                    handler.postDelayed(this, j2);
                } else {
                    binding = this.getBinding();
                    binding.timerTv.setText(this.getString(R.string.double_game_timer, Double.valueOf(0.0d)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTimer$lambda$24(DoubleGameFragment doubleGameFragment, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = doubleGameFragment.getBinding().timerActiveV.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = intValue;
        doubleGameFragment.getBinding().timerActiveV.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTimer() {
        getBinding().timerCl.animate().alpha(0.0f).setDuration(300L).start();
    }

    private final void initRoulette() {
        FragmentDoubleGameBinding binding = getBinding();
        binding.rouletteCenterBgV.animate().alpha(0.0f).setDuration(300L).start();
        RecyclerView recyclerView = binding.rouletteRv;
        if (this.rouletteSnapHelper == null) {
            LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
            linearSnapHelper.attachToRecyclerView(recyclerView);
            this.rouletteSnapHelper = linearSnapHelper;
        }
        LinearLayoutManager defaultLinearLayoutManager$default = getDefaultLinearLayoutManager$default(this, 0, null, 2, null);
        List<RouletteDoubleGameModel> cubeList = DoubleGame.INSTANCE.getCubeList();
        binding.rouletteRv.setLayoutManager(defaultLinearLayoutManager$default);
        binding.rouletteRv.setAdapter(new RouletteDoubleGameAdapter(CollectionsKt.toMutableList((Collection) CollectionsKt.shuffled(cubeList))));
        binding.rouletteRv.scrollToPosition(LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    private final void startRoulette(final Handler handler) {
        FragmentDoubleGameBinding binding = getBinding();
        binding.rouletteCenterBgV.animate().alpha(0.0f).setDuration(300L).start();
        List<RouletteDoubleGameModel> cubeList = DoubleGame.INSTANCE.getCubeList();
        RecyclerView.Adapter adapter = binding.rouletteRv.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type org.betup.games.doubles.ui.RouletteDoubleGameAdapter");
        ((RouletteDoubleGameAdapter) adapter).setInfiniteScroll(true);
        RecyclerView.Adapter adapter2 = binding.rouletteRv.getAdapter();
        Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type org.betup.games.doubles.ui.RouletteDoubleGameAdapter");
        ((RouletteDoubleGameAdapter) adapter2).replaceSessionList(CollectionsKt.toMutableList((Collection) CollectionsKt.shuffled(cubeList)));
        binding.rouletteRv.scrollToPosition(LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        handler.post(new Runnable() { // from class: org.betup.games.doubles.ui.DoubleGameFragment$startRoulette$1$1
            @Override // java.lang.Runnable
            public void run() {
                FragmentDoubleGameBinding binding2;
                binding2 = DoubleGameFragment.this.getBinding();
                binding2.rouletteRv.scrollBy(100, 0);
                handler.postDelayed(this, 20L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopRoulette(Handler handler, DoubleBetType betType, int ordinal) {
        List<RouletteDoubleGameModel> cubeList = DoubleGame.INSTANCE.getCubeList();
        FragmentDoubleGameBinding binding = getBinding();
        handler.removeCallbacksAndMessages(null);
        RecyclerView.LayoutManager layoutManager = getBinding().rouletteRv.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        RecyclerView.Adapter adapter = binding.rouletteRv.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type org.betup.games.doubles.ui.RouletteDoubleGameAdapter");
        int i = 0;
        ((RouletteDoubleGameAdapter) adapter).setInfiniteScroll(false);
        binding.rouletteRv.scrollToPosition(0);
        RecyclerView.Adapter adapter2 = binding.rouletteRv.getAdapter();
        Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type org.betup.games.doubles.ui.RouletteDoubleGameAdapter");
        List<RouletteDoubleGameModel> list = ((RouletteDoubleGameAdapter) adapter2).getList();
        RouletteDoubleGameModel rouletteDoubleGameModel = list.get(cubeList.size() - 4);
        Iterator<RouletteDoubleGameModel> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getOrdinal() == ordinal) {
                break;
            } else {
                i++;
            }
        }
        list.set(cubeList.size() - 4, new RouletteDoubleGameModel(betType, ordinal));
        list.set(i, rouletteDoubleGameModel);
        RecyclerView.Adapter adapter3 = binding.rouletteRv.getAdapter();
        Intrinsics.checkNotNull(adapter3, "null cannot be cast to non-null type org.betup.games.doubles.ui.RouletteDoubleGameAdapter");
        ((RouletteDoubleGameAdapter) adapter3).notifyDataSetChanged();
        final Context context = getContext();
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context) { // from class: org.betup.games.doubles.ui.DoubleGameFragment$stopRoulette$1$smoothScroller$1
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return 200.0f / displayMetrics.densityDpi;
            }
        };
        linearSmoothScroller.setTargetPosition(cubeList.size() - 2);
        linearLayoutManager.startSmoothScroll(linearSmoothScroller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleClickabilityButtons(boolean enable) {
        FragmentDoubleGameBinding binding = getBinding();
        Iterator it = CollectionsKt.listOf((Object[]) new View[]{binding.makeBetLl, binding.buttonMin, binding.buttonDouble, binding.buttonHalf, binding.buttonMax, binding.redBetTypeLl, binding.blackBetTypeLl, binding.zeroBetTypeLl, binding.betAmountEt}).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setClickable(enable);
        }
    }

    static /* synthetic */ LinearLayoutManager getDefaultLinearLayoutManager$default(DoubleGameFragment doubleGameFragment, int i, Float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = null;
        }
        return doubleGameFragment.getDefaultLinearLayoutManager(i, f);
    }

    private final LinearLayoutManager getDefaultLinearLayoutManager(final int orientation, final Float smoothSpeed) {
        final Context context = getContext();
        return new LinearLayoutManager(orientation, context) { // from class: org.betup.games.doubles.ui.DoubleGameFragment$getDefaultLinearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
                final Context context2 = this.getContext();
                final Float f = smoothSpeed;
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context2) { // from class: org.betup.games.doubles.ui.DoubleGameFragment$getDefaultLinearLayoutManager$1$smoothScrollToPosition$smoothScroller$1
                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    protected int getHorizontalSnapPreference() {
                        return -1;
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                        Float f2 = f;
                        return f2 != null ? f2.floatValue() : super.calculateSpeedPerPixel(displayMetrics);
                    }
                };
                linearSmoothScroller.setTargetPosition(position);
                startSmoothScroll(linearSmoothScroller);
            }
        };
    }
}

package org.betup.games.luckyCells.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.databinding.FragmentLuckyCellsGameBinding;
import org.betup.databinding.PlaceBetcoinsAmountContainerBinding;
import org.betup.games.BaseGameFragmentWithVideoRewards;
import org.betup.games.dice.model.rest.GameResult;
import org.betup.games.luckyCells.model.interactor.CompleteLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.ContinueLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.GetConfigLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.StartLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.rest.LuckyCellsGameConfig;
import org.betup.games.luckyCells.model.rest.RecordLuckyCellsGameModel;
import org.betup.games.luckyCells.model.rest.SessionLuckyCellsGameModel;
import org.betup.games.luckyCells.model.rest.StartLuckyCellsGameModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.views.AlphaPressButton;
import org.betup.utils.SharedPrefs;
import org.betup.utils.TextUtilClassKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: LuckyCellsGameFragment.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 k2\u00020\u0001:\u0002klB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u000206H\u0014J$\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010=\u001a\u000200H\u0016J\b\u0010>\u001a\u00020\nH\u0014J\u0018\u0010?\u001a\u0002022\u0006\u0010@\u001a\u0002002\u0006\u0010A\u001a\u000206H\u0014J\u001a\u0010B\u001a\u0002022\u0006\u0010C\u001a\u0002082\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010H\u001a\u000202H\u0002J\b\u0010I\u001a\u000202H\u0003J\b\u0010J\u001a\u000202H\u0002J\b\u0010K\u001a\u000202H\u0002J\u0010\u0010L\u001a\u0002022\u0006\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020PH\u0002J\b\u0010W\u001a\u000202H\u0002J\u0010\u0010Z\u001a\u0002022\u0006\u0010[\u001a\u00020\\H\u0002J\b\u0010]\u001a\u000200H\u0002J\b\u0010^\u001a\u000202H\u0002J\u001c\u0010f\u001a\u0002022\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010g\u001a\u000200H\u0002J\u001a\u0010h\u001a\u0002022\u0006\u0010i\u001a\u00020N2\b\b\u0002\u0010j\u001a\u00020GH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010D\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0EX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010S\u001a\u0014\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u0002020T¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0010\u0010X\u001a\u00020R8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020RX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010_\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0E8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001c\u0010b\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020.0E8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001a\u0010d\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020.0EX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006m"}, d2 = {"Lorg/betup/games/luckyCells/ui/LuckyCellsGameFragment;", "Lorg/betup/games/BaseGameFragmentWithVideoRewards;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "_binding", "Lorg/betup/databinding/FragmentLuckyCellsGameBinding;", "binding", "getBinding", "()Lorg/betup/databinding/FragmentLuckyCellsGameBinding;", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "getGameConfigInteractor", "Lorg/betup/games/luckyCells/model/interactor/GetConfigLuckyCellsGameInteractor;", "getGetGameConfigInteractor", "()Lorg/betup/games/luckyCells/model/interactor/GetConfigLuckyCellsGameInteractor;", "setGetGameConfigInteractor", "(Lorg/betup/games/luckyCells/model/interactor/GetConfigLuckyCellsGameInteractor;)V", "startGameInteractor", "Lorg/betup/games/luckyCells/model/interactor/StartLuckyCellsGameInteractor;", "getStartGameInteractor", "()Lorg/betup/games/luckyCells/model/interactor/StartLuckyCellsGameInteractor;", "setStartGameInteractor", "(Lorg/betup/games/luckyCells/model/interactor/StartLuckyCellsGameInteractor;)V", "continueGameInteractor", "Lorg/betup/games/luckyCells/model/interactor/ContinueLuckyCellsGameInteractor;", "getContinueGameInteractor", "()Lorg/betup/games/luckyCells/model/interactor/ContinueLuckyCellsGameInteractor;", "setContinueGameInteractor", "(Lorg/betup/games/luckyCells/model/interactor/ContinueLuckyCellsGameInteractor;)V", "completeLuckyCellsGameInteractor", "Lorg/betup/games/luckyCells/model/interactor/CompleteLuckyCellsGameInteractor;", "getCompleteLuckyCellsGameInteractor", "()Lorg/betup/games/luckyCells/model/interactor/CompleteLuckyCellsGameInteractor;", "setCompleteLuckyCellsGameInteractor", "(Lorg/betup/games/luckyCells/model/interactor/CompleteLuckyCellsGameInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "sessionId", "", "isGameStarted", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getAmount", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onBackPressed", "getVideoRewardServiceInstance", "updateOfferState", "isAvailable", "amount", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onGameConfigGot", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/games/luckyCells/model/rest/LuckyCellsGameConfig;", "", "initListeners", "initTouchListeners", "initClickListeners", "initLayoutItems", "changeBottomBtn", "statusType", "Lorg/betup/games/luckyCells/ui/LuckyCellsGameFragment$GameStatusType;", "getDefaultAmount", "", "onBtnClickStartGame", "Landroid/view/View$OnClickListener;", "onMapCellClick", "Lkotlin/Function2;", "getOnMapCellClick", "()Lkotlin/jvm/functions/Function2;", "initCoefsButtonsListeners", "betButtonClickListener", "makeBetClickListener", "completeGame", "result", "Lorg/betup/games/dice/model/rest/GameResult;", "isBetValid", "placeBet", "startGameListener", "Lorg/betup/games/luckyCells/model/rest/StartLuckyCellsGameModel;", "", "onContinue", "Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel;", "onComplete", "Lorg/betup/games/luckyCells/model/rest/SessionLuckyCellsGameModel;", "toggleBottomBtn", "showBetContainer", "showMessage", "messageType", "wonAmount", VastTagName.COMPANION, "GameStatusType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LuckyCellsGameFragment extends BaseGameFragmentWithVideoRewards {
    private static LuckyCellsGameConfig gameConfig;
    private FragmentLuckyCellsGameBinding _binding;

    @Inject
    public CompleteLuckyCellsGameInteractor completeLuckyCellsGameInteractor;

    @Inject
    public ContinueLuckyCellsGameInteractor continueGameInteractor;

    @Inject
    public GetConfigLuckyCellsGameInteractor getGameConfigInteractor;
    private boolean isGameStarted;
    private String sessionId;

    @Inject
    public StartLuckyCellsGameInteractor startGameInteractor;

    @Inject
    public UserService userService;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final BaseCachedSharedInteractor.OnFetchedListener<LuckyCellsGameConfig, Integer> onGameConfigGot = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda10
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            LuckyCellsGameFragment.onGameConfigGot$lambda$1(LuckyCellsGameFragment.this, fetchedResponseMessage);
        }
    };
    private final View.OnClickListener onBtnClickStartGame = new View.OnClickListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda11
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LuckyCellsGameFragment.onBtnClickStartGame$lambda$11(LuckyCellsGameFragment.this, view);
        }
    };
    private final Function2<Integer, Integer, Unit> onMapCellClick = new Function2() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit onMapCellClick$lambda$13;
            onMapCellClick$lambda$13 = LuckyCellsGameFragment.onMapCellClick$lambda$13(LuckyCellsGameFragment.this, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            return onMapCellClick$lambda$13;
        }
    };
    private final View.OnClickListener betButtonClickListener = new View.OnClickListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda13
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LuckyCellsGameFragment.betButtonClickListener$lambda$15(LuckyCellsGameFragment.this, view);
        }
    };
    private final View.OnClickListener makeBetClickListener = new View.OnClickListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda14
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LuckyCellsGameFragment.makeBetClickListener$lambda$16(LuckyCellsGameFragment.this, view);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<StartLuckyCellsGameModel, Object> startGameListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda15
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            LuckyCellsGameFragment.startGameListener$lambda$29(LuckyCellsGameFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<RecordLuckyCellsGameModel, String> onContinue = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda16
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            LuckyCellsGameFragment.onContinue$lambda$31(LuckyCellsGameFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<SessionLuckyCellsGameModel, String> onComplete = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda17
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            LuckyCellsGameFragment.onComplete$lambda$34(LuckyCellsGameFragment.this, fetchedResponseMessage);
        }
    };

    /* compiled from: LuckyCellsGameFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GameStatusType.values().length];
            try {
                iArr[GameStatusType.WAIT_BET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameStatusType.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GameStatusType.WON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GameStatusType.LOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GameResult.values().length];
            try {
                iArr2[GameResult.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GameResult.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        return true;
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards
    protected void updateOfferState(boolean isAvailable, long amount) {
    }

    private final FragmentLuckyCellsGameBinding getBinding() {
        FragmentLuckyCellsGameBinding fragmentLuckyCellsGameBinding = this._binding;
        if (fragmentLuckyCellsGameBinding != null) {
            return fragmentLuckyCellsGameBinding;
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

    public final GetConfigLuckyCellsGameInteractor getGetGameConfigInteractor() {
        GetConfigLuckyCellsGameInteractor getConfigLuckyCellsGameInteractor = this.getGameConfigInteractor;
        if (getConfigLuckyCellsGameInteractor != null) {
            return getConfigLuckyCellsGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getGameConfigInteractor");
        return null;
    }

    public final void setGetGameConfigInteractor(GetConfigLuckyCellsGameInteractor getConfigLuckyCellsGameInteractor) {
        Intrinsics.checkNotNullParameter(getConfigLuckyCellsGameInteractor, "<set-?>");
        this.getGameConfigInteractor = getConfigLuckyCellsGameInteractor;
    }

    public final StartLuckyCellsGameInteractor getStartGameInteractor() {
        StartLuckyCellsGameInteractor startLuckyCellsGameInteractor = this.startGameInteractor;
        if (startLuckyCellsGameInteractor != null) {
            return startLuckyCellsGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startGameInteractor");
        return null;
    }

    public final void setStartGameInteractor(StartLuckyCellsGameInteractor startLuckyCellsGameInteractor) {
        Intrinsics.checkNotNullParameter(startLuckyCellsGameInteractor, "<set-?>");
        this.startGameInteractor = startLuckyCellsGameInteractor;
    }

    public final ContinueLuckyCellsGameInteractor getContinueGameInteractor() {
        ContinueLuckyCellsGameInteractor continueLuckyCellsGameInteractor = this.continueGameInteractor;
        if (continueLuckyCellsGameInteractor != null) {
            return continueLuckyCellsGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("continueGameInteractor");
        return null;
    }

    public final void setContinueGameInteractor(ContinueLuckyCellsGameInteractor continueLuckyCellsGameInteractor) {
        Intrinsics.checkNotNullParameter(continueLuckyCellsGameInteractor, "<set-?>");
        this.continueGameInteractor = continueLuckyCellsGameInteractor;
    }

    public final CompleteLuckyCellsGameInteractor getCompleteLuckyCellsGameInteractor() {
        CompleteLuckyCellsGameInteractor completeLuckyCellsGameInteractor = this.completeLuckyCellsGameInteractor;
        if (completeLuckyCellsGameInteractor != null) {
            return completeLuckyCellsGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("completeLuckyCellsGameInteractor");
        return null;
    }

    public final void setCompleteLuckyCellsGameInteractor(CompleteLuckyCellsGameInteractor completeLuckyCellsGameInteractor) {
        Intrinsics.checkNotNullParameter(completeLuckyCellsGameInteractor, "<set-?>");
        this.completeLuckyCellsGameInteractor = completeLuckyCellsGameInteractor;
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

    /* compiled from: LuckyCellsGameFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lorg/betup/games/luckyCells/ui/LuckyCellsGameFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/games/luckyCells/ui/LuckyCellsGameFragment;", "gameConfig", "Lorg/betup/games/luckyCells/model/rest/LuckyCellsGameConfig;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LuckyCellsGameFragment newInstance() {
            return new LuckyCellsGameFragment();
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
        EditText editText = getBinding().betContainer.editBetAmount;
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
        this._binding = FragmentLuckyCellsGameBinding.inflate(inflater, container, false);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards
    protected VideoRewardService getVideoRewardServiceInstance() {
        return getVideoRewardService();
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getGetGameConfigInteractor().load(this.onGameConfigGot, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGameConfigGot$lambda$1(LuckyCellsGameFragment luckyCellsGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (luckyCellsGameFragment.isActive()) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
                luckyCellsGameFragment.makeToast(R.string.error);
                return;
            }
            try {
                Object model = fetchedResponseMessage.getModel();
                Intrinsics.checkNotNull(model);
                gameConfig = (LuckyCellsGameConfig) model;
                luckyCellsGameFragment.initLayoutItems();
                luckyCellsGameFragment.initListeners();
            } catch (Exception unused) {
                luckyCellsGameFragment.makeToast(R.string.error);
            }
        }
    }

    private final void initListeners() {
        initClickListeners();
        initTouchListeners();
    }

    private final void initTouchListeners() {
        final FragmentLuckyCellsGameBinding binding = getBinding();
        binding.bottomBtnLl.setOnTouchListener(new View.OnTouchListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean initTouchListeners$lambda$3$lambda$2;
                initTouchListeners$lambda$3$lambda$2 = LuckyCellsGameFragment.initTouchListeners$lambda$3$lambda$2(LuckyCellsGameFragment.this, binding, view, motionEvent);
                return initTouchListeners$lambda$3$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initTouchListeners$lambda$3$lambda$2(LuckyCellsGameFragment luckyCellsGameFragment, FragmentLuckyCellsGameBinding fragmentLuckyCellsGameBinding, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setBackground(AppCompatResources.getDrawable(luckyCellsGameFragment.requireContext(), R.drawable.lucky_cells_bottom_btn_active_bg));
            float f = 7;
            fragmentLuckyCellsGameBinding.bottomBtnTv.setTranslationY(luckyCellsGameFragment.getResources().getDisplayMetrics().density * f);
            fragmentLuckyCellsGameBinding.bottomBtnIconIv.setTranslationY(f * luckyCellsGameFragment.getResources().getDisplayMetrics().density);
            return false;
        }
        if (action != 1) {
            return false;
        }
        view.setBackground(AppCompatResources.getDrawable(luckyCellsGameFragment.requireContext(), R.drawable.lucky_cells_bottom_btn_default_bg));
        fragmentLuckyCellsGameBinding.bottomBtnTv.setTranslationY(0.0f);
        fragmentLuckyCellsGameBinding.bottomBtnIconIv.setTranslationY(0.0f);
        return false;
    }

    private final void initClickListeners() {
        FragmentLuckyCellsGameBinding binding = getBinding();
        binding.bottomBtnLl.setOnClickListener(this.onBtnClickStartGame);
        binding.betContainer.makeBet.setOnClickListener(this.makeBetClickListener);
        initCoefsButtonsListeners();
    }

    private final void initLayoutItems() {
        LuckyCellsGameConfig luckyCellsGameConfig;
        FragmentLuckyCellsGameBinding binding = getBinding();
        RecyclerView recyclerView = binding.mapRv;
        FragmentActivity activity = getActivity();
        LuckyCellsGameConfig luckyCellsGameConfig2 = gameConfig;
        if (luckyCellsGameConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gameConfig");
            luckyCellsGameConfig2 = null;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(activity, luckyCellsGameConfig2.getMapSize()));
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(this) { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$initLayoutItems$1$1$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((LuckyCellsGameFragment) this.receiver).getOnMapCellClick();
            }
        };
        LuckyCellsGameConfig luckyCellsGameConfig3 = gameConfig;
        if (luckyCellsGameConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gameConfig");
            luckyCellsGameConfig = null;
        } else {
            luckyCellsGameConfig = luckyCellsGameConfig3;
        }
        recyclerView.setAdapter(new LuckyCellsGameAdapter(propertyReference0Impl, false, luckyCellsGameConfig, 2, null));
        binding.statsLl.setAlpha(0.0f);
        ConstraintLayout constraintLayout = binding.coefLl;
        constraintLayout.setAlpha(0.0f);
        constraintLayout.setVisibility(0);
        LinearLayout linearLayout = binding.luckyCellsGameStatusLl;
        linearLayout.setAlpha(0.0f);
        linearLayout.setVisibility(0);
        changeBottomBtn(GameStatusType.WAIT_BET);
    }

    private final void changeBottomBtn(GameStatusType statusType) {
        getBinding();
        int i = WhenMappings.$EnumSwitchMapping$0[statusType.ordinal()];
        if (i == 1) {
            showMessage$default(this, GameStatusType.WAIT_BET, 0, 2, null);
            toggleBottomBtn(false, true);
        } else if (i == 2) {
            toggleBottomBtn(true, false);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            toggleBottomBtn(false, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0084, code lost:
    
        if (r4 <= r3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Number getDefaultAmount() {
        Object obj;
        Long lastBetAmountBombGame = SharedPrefs.getLastBetAmountBombGame(getBinding().getRoot().getContext());
        Log.d("BombGame", "getDefaultAmount: savedAmount from BombGame = " + lastBetAmountBombGame + ", minCoef = " + getMinCoef() + ", maxCoef = " + getMaxCoef());
        long longValue = lastBetAmountBombGame.longValue();
        Long l = lastBetAmountBombGame;
        if (longValue <= 0) {
            l = SharedPrefs.getCustomBetAmount(getBinding().getRoot().getContext());
        }
        Log.d("BombGame", "getDefaultAmount: defaultAmount = " + l);
        int minCoef = getMinCoef();
        int maxCoef = getMaxCoef();
        Intrinsics.checkNotNull(l);
        long longValue2 = l.longValue();
        if (minCoef <= longValue2) {
            obj = l;
        }
        if (l.longValue() < getMinCoef()) {
            obj = Integer.valueOf(getMinCoef());
        } else {
            obj = Integer.valueOf(getMaxCoef());
        }
        Log.d("BombGame", "getDefaultAmount: returning result = " + obj);
        return (Number) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBtnClickStartGame$lambda$11(LuckyCellsGameFragment luckyCellsGameFragment, View view) {
        if (luckyCellsGameFragment.isActive()) {
            luckyCellsGameFragment.changeBottomBtn(GameStatusType.WAIT_BET);
            RecyclerView.Adapter adapter = luckyCellsGameFragment.getBinding().mapRv.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
            LuckyCellsGameAdapter luckyCellsGameAdapter = (LuckyCellsGameAdapter) adapter;
            luckyCellsGameAdapter.resetCells();
            luckyCellsGameAdapter.setCanPlay(false);
        }
    }

    public final Function2<Integer, Integer, Unit> getOnMapCellClick() {
        return this.onMapCellClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMapCellClick$lambda$13(LuckyCellsGameFragment luckyCellsGameFragment, int i, int i2) {
        if (luckyCellsGameFragment.isGameStarted) {
            Bundle bundle = new Bundle();
            bundle.putInt("coordinateX", i);
            bundle.putInt("coordinateY", i2);
            ContinueLuckyCellsGameInteractor continueGameInteractor = luckyCellsGameFragment.getContinueGameInteractor();
            BaseCachedSharedInteractor.OnFetchedListener<RecordLuckyCellsGameModel, String> onFetchedListener = luckyCellsGameFragment.onContinue;
            String str = luckyCellsGameFragment.sessionId;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sessionId");
                str = null;
            }
            continueGameInteractor.load(onFetchedListener, str, bundle);
        }
        return Unit.INSTANCE;
    }

    private final void initCoefsButtonsListeners() {
        PlaceBetcoinsAmountContainerBinding placeBetcoinsAmountContainerBinding = getBinding().betContainer;
        placeBetcoinsAmountContainerBinding.buttonMin.setOnClickListener(this.betButtonClickListener);
        placeBetcoinsAmountContainerBinding.buttonDouble.setOnClickListener(this.betButtonClickListener);
        placeBetcoinsAmountContainerBinding.buttonHalf.setOnClickListener(this.betButtonClickListener);
        placeBetcoinsAmountContainerBinding.buttonMax.setOnClickListener(this.betButtonClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void betButtonClickListener$lambda$15(LuckyCellsGameFragment luckyCellsGameFragment, View view) {
        int id = view.getId();
        EditText editBetAmount = luckyCellsGameFragment.getBinding().betContainer.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
        if (editBetAmount.getText() == null) {
            luckyCellsGameFragment.makeToast(R.string.select_your_bet);
            return;
        }
        if (id == R.id.buttonMin) {
            editBetAmount.setText(String.valueOf(luckyCellsGameFragment.getMinCoef()));
            return;
        }
        if (id == R.id.buttonMax) {
            editBetAmount.setText(String.valueOf(luckyCellsGameFragment.getMaxCoef()));
            return;
        }
        Editable text = editBetAmount.getText();
        if (text == null || text.length() == 0) {
            luckyCellsGameFragment.makeToast(R.string.select_your_bet);
            return;
        }
        int editTextToInt = TextUtilClassKt.editTextToInt(editBetAmount);
        if (TextUtilClassKt.editTextToLong(editBetAmount) > luckyCellsGameFragment.getMaxCoef()) {
            luckyCellsGameFragment.makeToast(R.string.bet_grather_then_expected);
            return;
        }
        if (id != R.id.buttonDouble) {
            if (id != R.id.buttonHalf) {
                return;
            }
            if (editTextToInt / 2 < luckyCellsGameFragment.getMinCoef()) {
                luckyCellsGameFragment.makeToast(R.string.cant_divide_your_bet);
                return;
            } else {
                editBetAmount.setText(String.valueOf(TextUtilClassKt.editTextToInt(editBetAmount) / 2));
                return;
            }
        }
        if (editTextToInt > luckyCellsGameFragment.getMaxCoef() / 2) {
            String string = luckyCellsGameFragment.getString(R.string.cant_double_your_bet);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            luckyCellsGameFragment.makeToast(string);
            return;
        }
        editBetAmount.setText(String.valueOf(TextUtilClassKt.editTextToInt(editBetAmount) * 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeBetClickListener$lambda$16(LuckyCellsGameFragment luckyCellsGameFragment, View view) {
        if (luckyCellsGameFragment.isActive()) {
            if (luckyCellsGameFragment.isGameStarted) {
                luckyCellsGameFragment.completeGame(GameResult.WON);
            } else if (luckyCellsGameFragment.isBetValid()) {
                luckyCellsGameFragment.placeBet();
            }
        }
    }

    private final void completeGame(GameResult result) {
        GameStatusType gameStatusType;
        FragmentLuckyCellsGameBinding binding = getBinding();
        int i = WhenMappings.$EnumSwitchMapping$1[result.ordinal()];
        if (i == 1) {
            gameStatusType = GameStatusType.WON;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gameStatusType = GameStatusType.LOST;
        }
        changeBottomBtn(gameStatusType);
        binding.bottomBtnLl.setOnClickListener(this.onBtnClickStartGame);
        getBinding().statsLl.animate().alpha(0.0f).setDuration(300L).start();
        int i2 = WhenMappings.$EnumSwitchMapping$1[result.ordinal()];
        String str = null;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            onGamePlayed(false);
            this.isGameStarted = false;
            RecyclerView.Adapter adapter = getBinding().mapRv.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
            LuckyCellsGameAdapter luckyCellsGameAdapter = (LuckyCellsGameAdapter) adapter;
            luckyCellsGameAdapter.setCanPlay(false);
            luckyCellsGameAdapter.openAllCells();
            showMessage$default(this, GameStatusType.LOST, 0, 2, null);
            return;
        }
        Bundle bundle = new Bundle();
        String str2 = this.sessionId;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionId");
            str2 = null;
        }
        bundle.putString("sessionId", str2);
        CompleteLuckyCellsGameInteractor completeLuckyCellsGameInteractor = getCompleteLuckyCellsGameInteractor();
        BaseCachedSharedInteractor.OnFetchedListener<SessionLuckyCellsGameModel, String> onFetchedListener = this.onComplete;
        String str3 = this.sessionId;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionId");
        } else {
            str = str3;
        }
        completeLuckyCellsGameInteractor.load(onFetchedListener, str, bundle);
    }

    private final boolean isBetValid() {
        EditText editBetAmount = getBinding().betContainer.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
        Editable text = editBetAmount.getText();
        if (text == null || text.length() == 0) {
            makeToast(R.string.select_your_bet);
            return false;
        }
        int editTextToInt = TextUtilClassKt.editTextToInt(editBetAmount);
        long moneyBalance = getUserServiceAccessor().getUserService().getShortProfile().getUserProgressModel().getMoneyBalance();
        if (editTextToInt > getMaxCoef() && editTextToInt > moneyBalance) {
            String string = getString(R.string.bet_grather_then_expected, Integer.valueOf(getMaxCoef()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            makeToast(string);
            showShopDialog();
        }
        if (editTextToInt > moneyBalance) {
            makeToast(R.string.not_enough_betcoins);
            showShopDialog();
            return false;
        }
        if (editTextToInt < getMinCoef()) {
            String string2 = getString(R.string.bet_smaller_then_expected, Integer.valueOf(getMinCoef()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            makeToast(string2);
            return false;
        }
        if (editTextToInt <= getMaxCoef()) {
            return true;
        }
        String string3 = getString(R.string.bet_grather_then_expected, Integer.valueOf(getMaxCoef()));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        makeToast(string3);
        return false;
    }

    private final void placeBet() {
        EditText editBetAmount = getBinding().betContainer.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
        long editTextToLong = TextUtilClassKt.editTextToLong(editBetAmount);
        Log.d("BombGame", "placeBet: placing bet with amount = " + editTextToLong);
        SharedPrefs.saveLastBetAmountBombGame(requireContext(), editTextToLong);
        Log.d("BombGame", "placeBet: saved bet amount to SharedPrefs");
        Bundle bundle = new Bundle();
        bundle.putLong("betAmount", editTextToLong);
        getStartGameInteractor().load(this.startGameListener, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startGameListener$lambda$29(final LuckyCellsGameFragment luckyCellsGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (luckyCellsGameFragment.isActive()) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
                luckyCellsGameFragment.makeToast(R.string.error);
                return;
            }
            StartLuckyCellsGameModel startLuckyCellsGameModel = (StartLuckyCellsGameModel) fetchedResponseMessage.getModel();
            if (startLuckyCellsGameModel != null) {
                LuckyCellsGameConfig luckyCellsGameConfig = gameConfig;
                if (luckyCellsGameConfig == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gameConfig");
                    luckyCellsGameConfig = null;
                }
                List<Double> coefficientList = luckyCellsGameConfig.getCoefficientList();
                final ConstraintLayout constraintLayout = luckyCellsGameFragment.getBinding().coefLl;
                constraintLayout.setVisibility(0);
                constraintLayout.post(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LuckyCellsGameFragment.startGameListener$lambda$29$lambda$22$lambda$21(ConstraintLayout.this);
                    }
                });
                RecyclerView recyclerView = luckyCellsGameFragment.getBinding().coefRv;
                List<Double> list = coefficientList;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj : list) {
                    ((Number) obj).doubleValue();
                    linkedHashMap.put(obj, false);
                }
                recyclerView.setAdapter(new LuckyCellsGameCoefAdapter(linkedHashMap));
                TextView textView = luckyCellsGameFragment.getBinding().rewardAmountTv;
                RecyclerView.Adapter adapter = luckyCellsGameFragment.getBinding().coefRv.getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameCoefAdapter");
                textView.setText(String.valueOf(((LuckyCellsGameCoefAdapter) adapter).getNextCoef(startLuckyCellsGameModel.getBetAmount())));
                RecyclerView.Adapter adapter2 = luckyCellsGameFragment.getBinding().mapRv.getAdapter();
                Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
                LuckyCellsGameAdapter luckyCellsGameAdapter = (LuckyCellsGameAdapter) adapter2;
                luckyCellsGameAdapter.setCanPlay(true);
                luckyCellsGameAdapter.resetCells();
                luckyCellsGameFragment.isGameStarted = true;
                luckyCellsGameFragment.sessionId = startLuckyCellsGameModel.getSessionId();
                luckyCellsGameFragment.getBinding().betContainer.editBetAmount.setEnabled(false);
                luckyCellsGameFragment.applyOptimisticStakeDeductionOnly(startLuckyCellsGameModel.getBetAmount());
                luckyCellsGameFragment.toggleBottomBtn(true, false);
                luckyCellsGameFragment.getBinding().statsLl.animate().alpha(1.0f).setDuration(300L).start();
                TextView textView2 = luckyCellsGameFragment.getBinding().prizeRemainsTv;
                RecyclerView.Adapter adapter3 = luckyCellsGameFragment.getBinding().mapRv.getAdapter();
                Intrinsics.checkNotNull(adapter3, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
                textView2.setText(String.valueOf(((LuckyCellsGameAdapter) adapter3).getPrizeRemainsCount()));
                TextView textView3 = luckyCellsGameFragment.getBinding().trapsRemainsTv;
                RecyclerView.Adapter adapter4 = luckyCellsGameFragment.getBinding().mapRv.getAdapter();
                Intrinsics.checkNotNull(adapter4, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
                textView3.setText(String.valueOf(((LuckyCellsGameAdapter) adapter4).getTrapRemainsCount()));
                showMessage$default(luckyCellsGameFragment, GameStatusType.STARTED, 0, 2, null);
                luckyCellsGameFragment.getBinding().bottomBtnLl.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LuckyCellsGameFragment.startGameListener$lambda$29$lambda$28(LuckyCellsGameFragment.this, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startGameListener$lambda$29$lambda$22$lambda$21(ConstraintLayout constraintLayout) {
        constraintLayout.animate().alpha(1.0f).setDuration(300L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startGameListener$lambda$29$lambda$28(LuckyCellsGameFragment luckyCellsGameFragment, View view) {
        luckyCellsGameFragment.completeGame(GameResult.WON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onContinue$lambda$31(LuckyCellsGameFragment luckyCellsGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (luckyCellsGameFragment.isActive()) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
                luckyCellsGameFragment.makeToast(R.string.error);
                return;
            }
            RecordLuckyCellsGameModel recordLuckyCellsGameModel = (RecordLuckyCellsGameModel) fetchedResponseMessage.getModel();
            if (recordLuckyCellsGameModel != null) {
                luckyCellsGameFragment.sessionId = recordLuckyCellsGameModel.getSessionRef();
                RecyclerView.Adapter adapter = luckyCellsGameFragment.getBinding().mapRv.getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
                LuckyCellsGameAdapter luckyCellsGameAdapter = (LuckyCellsGameAdapter) adapter;
                if (luckyCellsGameFragment.isGameStarted) {
                    luckyCellsGameAdapter.updateCell((recordLuckyCellsGameModel.getCoordinateX() * 5) + recordLuckyCellsGameModel.getCoordinateY(), recordLuckyCellsGameModel.getCellType());
                    RecyclerView.Adapter adapter2 = luckyCellsGameFragment.getBinding().coefRv.getAdapter();
                    Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameCoefAdapter");
                    ((LuckyCellsGameCoefAdapter) adapter2).next();
                    TextView textView = luckyCellsGameFragment.getBinding().rewardAmountTv;
                    RecyclerView.Adapter adapter3 = luckyCellsGameFragment.getBinding().coefRv.getAdapter();
                    Intrinsics.checkNotNull(adapter3, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameCoefAdapter");
                    textView.setText(String.valueOf(((LuckyCellsGameCoefAdapter) adapter3).getNextCoef(recordLuckyCellsGameModel.getBetAmount())));
                    TextView textView2 = luckyCellsGameFragment.getBinding().bottomBtnTv;
                    RecyclerView.Adapter adapter4 = luckyCellsGameFragment.getBinding().coefRv.getAdapter();
                    Intrinsics.checkNotNull(adapter4, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameCoefAdapter");
                    textView2.setText(luckyCellsGameFragment.getString(R.string.lucky_cells_game_bottom_btn_success_finish, String.valueOf(((LuckyCellsGameCoefAdapter) adapter4).getCurrentCoef(recordLuckyCellsGameModel.getBetAmount()))));
                    TextView textView3 = luckyCellsGameFragment.getBinding().prizeRemainsTv;
                    RecyclerView.Adapter adapter5 = luckyCellsGameFragment.getBinding().mapRv.getAdapter();
                    Intrinsics.checkNotNull(adapter5, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
                    textView3.setText(String.valueOf(((LuckyCellsGameAdapter) adapter5).getPrizeRemainsCount()));
                    TextView textView4 = luckyCellsGameFragment.getBinding().trapsRemainsTv;
                    RecyclerView.Adapter adapter6 = luckyCellsGameFragment.getBinding().mapRv.getAdapter();
                    Intrinsics.checkNotNull(adapter6, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
                    textView4.setText(String.valueOf(((LuckyCellsGameAdapter) adapter6).getTrapRemainsCount()));
                    if (recordLuckyCellsGameModel.getResult() == GameResult.LOST) {
                        luckyCellsGameAdapter.setCanPlay(false);
                        luckyCellsGameFragment.isGameStarted = false;
                        luckyCellsGameFragment.scheduleServerBalanceRefreshDelayed();
                        luckyCellsGameFragment.completeGame(recordLuckyCellsGameModel.getResult());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$34(LuckyCellsGameFragment luckyCellsGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (luckyCellsGameFragment.isActive()) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
                luckyCellsGameFragment.makeToast(R.string.error);
                return;
            }
            FragmentLuckyCellsGameBinding binding = luckyCellsGameFragment.getBinding();
            RecyclerView.Adapter adapter = binding.mapRv.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
            ((LuckyCellsGameAdapter) adapter).openAllCells();
            RecyclerView.Adapter adapter2 = luckyCellsGameFragment.getBinding().mapRv.getAdapter();
            Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type org.betup.games.luckyCells.ui.LuckyCellsGameAdapter");
            ((LuckyCellsGameAdapter) adapter2).setCanPlay(false);
            luckyCellsGameFragment.isGameStarted = false;
            binding.coefLl.animate().alpha(0.0f).setDuration(300L).start();
            binding.coefRv.setAdapter(new LuckyCellsGameCoefAdapter(null));
            binding.bottomBtnTv.setText(R.string.lucky_cells_game_bottom_btn_start);
            binding.bottomBtnIconIv.setVisibility(8);
            binding.bottomBtnLl.setOnClickListener(luckyCellsGameFragment.onBtnClickStartGame);
            Object model = fetchedResponseMessage.getModel();
            Intrinsics.checkNotNull(model, "null cannot be cast to non-null type org.betup.games.luckyCells.model.rest.SessionLuckyCellsGameModel");
            SessionLuckyCellsGameModel sessionLuckyCellsGameModel = (SessionLuckyCellsGameModel) model;
            luckyCellsGameFragment.onGamePlayed(true);
            luckyCellsGameFragment.scheduleOptimisticWinCreditThenServerRefresh(sessionLuckyCellsGameModel.getReturnAmount() != null ? r3.intValue() : 0L);
            GameStatusType gameStatusType = GameStatusType.WON;
            Integer returnAmount = sessionLuckyCellsGameModel.getReturnAmount();
            luckyCellsGameFragment.showMessage(gameStatusType, returnAmount != null ? returnAmount.intValue() : 0);
            AlphaPressButton makeBet = binding.betContainer.makeBet;
            Intrinsics.checkNotNullExpressionValue(makeBet, "makeBet");
            Object first = SequencesKt.first(ViewGroupKt.getChildren(makeBet));
            Intrinsics.checkNotNull(first, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) first).setText(luckyCellsGameFragment.getString(R.string.betslip_place_bet));
            binding.betContainer.editBetAmount.setEnabled(true);
        }
    }

    static /* synthetic */ void toggleBottomBtn$default(LuckyCellsGameFragment luckyCellsGameFragment, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        luckyCellsGameFragment.toggleBottomBtn(z, z2);
    }

    private final void toggleBottomBtn(boolean isGameStarted, boolean showBetContainer) {
        final FragmentLuckyCellsGameBinding binding = getBinding();
        if (!showBetContainer) {
            binding.coefLl.animate().alpha(0.0f).setDuration(600L).withEndAction(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    LuckyCellsGameFragment.toggleBottomBtn$lambda$43$lambda$35(FragmentLuckyCellsGameBinding.this);
                }
            }).start();
            if (isGameStarted) {
                binding.bottomBtnTv.setText(binding.getRoot().getContext().getString(R.string.lucky_cells_game_bottom_btn_success_finish, "0"));
                binding.bottomBtnIconIv.setVisibility(0);
            } else {
                binding.bottomBtnTv.setText(binding.getRoot().getContext().getString(R.string.lucky_cells_game_bottom_btn_start));
                binding.bottomBtnIconIv.setVisibility(8);
            }
            final ConstraintLayout root = binding.betContainer.getRoot();
            root.post(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    LuckyCellsGameFragment.toggleBottomBtn$lambda$43$lambda$40$lambda$39(ConstraintLayout.this, binding);
                }
            });
            return;
        }
        String number = getDefaultAmount().toString();
        Log.d("BombGame", "Setting bet amount to EditText: " + number);
        binding.betContainer.editBetAmount.setText(number);
        ConstraintLayout root2 = binding.betContainer.getRoot();
        root2.setVisibility(0);
        root2.setTranslationY(-root2.getHeight());
        root2.setScaleY(0.0f);
        root2.animate().scaleY(1.0f).alpha(1.0f).setDuration(600L).translationY(0.0f).start();
        binding.bottomBtnLl.animate().translationY(binding.bottomBtnTv.getHeight()).scaleY(0.0f).setDuration(600L).withEndAction(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                LuckyCellsGameFragment.toggleBottomBtn$lambda$43$lambda$42$lambda$41(FragmentLuckyCellsGameBinding.this);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleBottomBtn$lambda$43$lambda$35(FragmentLuckyCellsGameBinding fragmentLuckyCellsGameBinding) {
        fragmentLuckyCellsGameBinding.coefLl.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleBottomBtn$lambda$43$lambda$40$lambda$39(final ConstraintLayout constraintLayout, final FragmentLuckyCellsGameBinding fragmentLuckyCellsGameBinding) {
        constraintLayout.animate().translationY(constraintLayout.getHeight()).scaleY(0.0f).setDuration(600L).withEndAction(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                LuckyCellsGameFragment.toggleBottomBtn$lambda$43$lambda$40$lambda$39$lambda$38(ConstraintLayout.this, fragmentLuckyCellsGameBinding);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleBottomBtn$lambda$43$lambda$40$lambda$39$lambda$38(ConstraintLayout constraintLayout, FragmentLuckyCellsGameBinding fragmentLuckyCellsGameBinding) {
        constraintLayout.setVisibility(8);
        final ConstraintLayout constraintLayout2 = fragmentLuckyCellsGameBinding.bottomBtnLl;
        constraintLayout2.post(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                LuckyCellsGameFragment.toggleBottomBtn$lambda$43$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36(ConstraintLayout.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleBottomBtn$lambda$43$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36(ConstraintLayout constraintLayout) {
        constraintLayout.setVisibility(0);
        constraintLayout.setTranslationY(0.0f);
        constraintLayout.animate().translationY(0.0f).scaleY(1.0f).alpha(1.0f).setDuration(600L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleBottomBtn$lambda$43$lambda$42$lambda$41(FragmentLuckyCellsGameBinding fragmentLuckyCellsGameBinding) {
        fragmentLuckyCellsGameBinding.bottomBtnLl.setVisibility(8);
    }

    static /* synthetic */ void showMessage$default(LuckyCellsGameFragment luckyCellsGameFragment, GameStatusType gameStatusType, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        luckyCellsGameFragment.showMessage(gameStatusType, i);
    }

    private final void showMessage(GameStatusType messageType, int wonAmount) {
        Context context;
        if (isActive() && (context = getContext()) != null) {
            FragmentLuckyCellsGameBinding binding = getBinding();
            int i = WhenMappings.$EnumSwitchMapping$0[messageType.ordinal()];
            if (i == 1) {
                binding.luckyCellsGameStatusTitleTv.setText(context.getString(R.string.lucky_cells_game_status_title_waiting_bet));
                binding.luckyCellsGameStatusTitleTv.setTextColor(ContextCompat.getColor(context, R.color.white));
                binding.luckyCellsGameStatusTitleIv.setVisibility(8);
                binding.luckyCellsGameStatusSubtitleTv.setText("");
            } else if (i == 2) {
                binding.luckyCellsGameStatusTitleTv.setText(context.getString(R.string.lucky_cells_game_status_title_started));
                binding.luckyCellsGameStatusTitleTv.setTextColor(ContextCompat.getColor(context, R.color.white));
                binding.luckyCellsGameStatusTitleIv.setVisibility(8);
                binding.luckyCellsGameStatusSubtitleTv.setText("");
            } else if (i == 3) {
                binding.luckyCellsGameStatusTitleTv.setText(context.getString(R.string.lucky_cells_game_status_title_won, String.valueOf(wonAmount)));
                binding.luckyCellsGameStatusTitleTv.setTextColor(ContextCompat.getColor(context, R.color.lucky_cells_game_won_result_title));
                binding.luckyCellsGameStatusSubtitleTv.setText("");
                binding.luckyCellsGameStatusTitleIv.setVisibility(0);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                binding.luckyCellsGameStatusTitleTv.setText(context.getString(R.string.lucky_cells_game_status_title_lost));
                binding.luckyCellsGameStatusTitleTv.setTextColor(ContextCompat.getColor(context, R.color.lucky_cells_game_lost_result_title));
                binding.luckyCellsGameStatusSubtitleTv.setText(context.getString(R.string.lucky_cells_game_status_subtitle_lost));
                binding.luckyCellsGameStatusTitleIv.setVisibility(8);
            }
            final LinearLayout luckyCellsGameStatusLl = binding.luckyCellsGameStatusLl;
            Intrinsics.checkNotNullExpressionValue(luckyCellsGameStatusLl, "luckyCellsGameStatusLl");
            luckyCellsGameStatusLl.animate().alpha(1.0f).setDuration(500L).withEndAction(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    LuckyCellsGameFragment.showMessage$lambda$46$lambda$45(LuckyCellsGameFragment.this, luckyCellsGameStatusLl);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage$lambda$46$lambda$45(final LuckyCellsGameFragment luckyCellsGameFragment, final LinearLayout linearLayout) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            return;
        }
        new Handler(myLooper).postDelayed(new Runnable() { // from class: org.betup.games.luckyCells.ui.LuckyCellsGameFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                LuckyCellsGameFragment.showMessage$lambda$46$lambda$45$lambda$44(LuckyCellsGameFragment.this, linearLayout);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage$lambda$46$lambda$45$lambda$44(LuckyCellsGameFragment luckyCellsGameFragment, LinearLayout linearLayout) {
        if (luckyCellsGameFragment.isActive()) {
            linearLayout.animate().alpha(0.0f).setDuration(300L).start();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LuckyCellsGameFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/games/luckyCells/ui/LuckyCellsGameFragment$GameStatusType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "WON", "LOST", "STARTED", "WAIT_BET", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class GameStatusType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GameStatusType[] $VALUES;
        public static final GameStatusType WON = new GameStatusType("WON", 0);
        public static final GameStatusType LOST = new GameStatusType("LOST", 1);
        public static final GameStatusType STARTED = new GameStatusType("STARTED", 2);
        public static final GameStatusType WAIT_BET = new GameStatusType("WAIT_BET", 3);

        private static final /* synthetic */ GameStatusType[] $values() {
            return new GameStatusType[]{WON, LOST, STARTED, WAIT_BET};
        }

        public static EnumEntries<GameStatusType> getEntries() {
            return $ENTRIES;
        }

        private GameStatusType(String str, int i) {
        }

        static {
            GameStatusType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static GameStatusType valueOf(String str) {
            return (GameStatusType) Enum.valueOf(GameStatusType.class, str);
        }

        public static GameStatusType[] values() {
            return (GameStatusType[]) $VALUES.clone();
        }
    }
}

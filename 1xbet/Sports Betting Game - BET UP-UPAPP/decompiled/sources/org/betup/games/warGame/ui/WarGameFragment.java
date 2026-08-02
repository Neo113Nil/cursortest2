package org.betup.games.warGame.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C3473f8;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.InetStateMessage;
import org.betup.databinding.FragmentWarGameBinding;
import org.betup.games.BaseGameFragmentWithVideoRewards;
import org.betup.games.StubListener;
import org.betup.games.common.remote.GameConfigModel;
import org.betup.games.dice.model.rest.GameResult;
import org.betup.games.warGame.model.interactor.ContinueWarGameInteractor;
import org.betup.games.warGame.model.interactor.GetWarGameConfigInteractor;
import org.betup.games.warGame.model.interactor.StartWarGameInteractor;
import org.betup.games.warGame.model.rest.WarGameAction;
import org.betup.games.warGame.model.rest.WarGameResultModel;
import org.betup.games.warGame.model.rest.WarGameRoundResultDto;
import org.betup.games.warGame.ui.animation.TargetAnimation;
import org.betup.games.warGame.ui.animation.WarGameAnimationHelper;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.views.AlphaPressButton;
import org.betup.utils.SharedPrefs;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.TextUtilClassKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: WarGameFragment.kt */
@Metadata(d1 = {"\u0000å\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001T\b\u0007\u0018\u0000 w2\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u0006:\u0001wB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u00106\u001a\u000201H\u0014J\u0018\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0014J\u0012\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J$\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020@2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u000209H\u0016J\b\u0010I\u001a\u00020;H\u0014J!\u0010J\u001a\u00020\u00052\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0K\"\u00020\u001cH\u0003¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u00020\u0005H\u0002J\b\u0010V\u001a\u00020\u0005H\u0002J\u0010\u0010W\u001a\u00020\u00052\u0006\u0010X\u001a\u000209H\u0002J\u001c\u0010[\u001a\u00020\u00052\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050]H\u0016J\u0012\u0010^\u001a\u00020\u00052\b\u0010_\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010`\u001a\u0002092\u0006\u0010:\u001a\u00020aH\u0002J\u0010\u0010d\u001a\u00020\u00052\u0006\u0010e\u001a\u00020fH\u0003J\b\u0010g\u001a\u00020\u0005H\u0003J\u0010\u0010j\u001a\u00020\u00052\u0006\u0010k\u001a\u00020cH\u0002J\b\u0010m\u001a\u000209H\u0016J\u0012\u0010n\u001a\u00020o2\b\b\u0002\u0010p\u001a\u00020OH\u0002J\u0012\u0010q\u001a\u00020o2\b\b\u0002\u0010r\u001a\u00020OH\u0002J\b\u0010s\u001a\u00020\u0005H\u0002J\u0010\u0010t\u001a\u00020\u00052\u0006\u0010u\u001a\u00020vH\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u0010N\u001a\u00020OX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020OX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0004\n\u0002\u0010UR\u0010\u0010Y\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001a\u0010b\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010h\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020\u000f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006x"}, d2 = {"Lorg/betup/games/warGame/ui/WarGameFragment;", "Lorg/betup/games/BaseGameFragmentWithVideoRewards;", "Landroid/view/View$OnClickListener;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/games/common/remote/GameConfigModel;", "", "Lorg/betup/games/StubListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "_binding", "Lorg/betup/databinding/FragmentWarGameBinding;", "binding", "getBinding", "()Lorg/betup/databinding/FragmentWarGameBinding;", "continueSessionId", "", "leftCardStartAnim", "Landroid/view/animation/Animation;", "rightCardStartAnim", "leftCardAnimLeftOut", "Landroid/animation/Animator;", "leftCardAnimLeftIn", "rightCardAnimLeftOut", "rightCardAnimLeftIn", "warGameAnimationHelper", "Lorg/betup/games/warGame/ui/animation/WarGameAnimationHelper;", "editors", "", "Landroid/widget/EditText;", "Landroid/widget/TextView;", "getWarGameConfigInteractor", "Lorg/betup/games/warGame/model/interactor/GetWarGameConfigInteractor;", "getGetWarGameConfigInteractor", "()Lorg/betup/games/warGame/model/interactor/GetWarGameConfigInteractor;", "setGetWarGameConfigInteractor", "(Lorg/betup/games/warGame/model/interactor/GetWarGameConfigInteractor;)V", "starWarInteractor", "Lorg/betup/games/warGame/model/interactor/StartWarGameInteractor;", "getStarWarInteractor", "()Lorg/betup/games/warGame/model/interactor/StartWarGameInteractor;", "setStarWarInteractor", "(Lorg/betup/games/warGame/model/interactor/StartWarGameInteractor;)V", "continueWarGameInteractor", "Lorg/betup/games/warGame/model/interactor/ContinueWarGameInteractor;", "getContinueWarGameInteractor", "()Lorg/betup/games/warGame/model/interactor/ContinueWarGameInteractor;", "setContinueWarGameInteractor", "(Lorg/betup/games/warGame/model/interactor/ContinueWarGameInteractor;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "getVideoRewardServiceInstance", "updateOfferState", "isAvailable", "", "amount", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "setUpStub", C3473f8.k, "getAmount", "initDefaultValuesToEditors", "", "([Landroid/widget/EditText;)V", "initCoefsButtonsListeners", "_alphaDisable", "", "_alphaEnable", "onFocusChangedListener", "Landroid/view/View$OnFocusChangeListener;", "onTextChangeListener", "org/betup/games/warGame/ui/WarGameFragment$onTextChangeListener$1", "Lorg/betup/games/warGame/ui/WarGameFragment$onTextChangeListener$1;", "updateBetButtonState", "setButtonsEnabled", "enabled", "doubleAndHalfBetListener", "minAndMaxBetListener", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "onClick", "v", "isBetValid", "", "startWarGameListener", "Lorg/betup/games/warGame/model/rest/WarGameRoundResultDto;", "handleGameResult", "model", "Lorg/betup/games/warGame/model/rest/WarGameResultModel;", "restoreAll", "continueGameListener", "drawResultClickListener", "setCardValuesAndStartAnimations", "warGameRoundResultDto", "okButtonClickListener", "onBackPressed", "setupTranslateForLeftCard", "Landroid/view/animation/TranslateAnimation;", "width", "setupTranslateForRightCard", "parentWidth", "setupFlipAnimations", "processChangeInetState", "inetStateMessage", "Lorg/betup/bus/InetStateMessage;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WarGameFragment extends BaseGameFragmentWithVideoRewards implements View.OnClickListener, BaseCachedSharedInteractor.OnFetchedListener<GameConfigModel, Unit>, StubListener {
    private FragmentWarGameBinding _binding;
    private String continueSessionId;

    @Inject
    public ContinueWarGameInteractor continueWarGameInteractor;

    @Inject
    public GetWarGameConfigInteractor getWarGameConfigInteractor;
    private Animator leftCardAnimLeftIn;
    private Animator leftCardAnimLeftOut;
    private Animation leftCardStartAnim;
    private Animator rightCardAnimLeftIn;
    private Animator rightCardAnimLeftOut;
    private Animation rightCardStartAnim;

    @Inject
    public StartWarGameInteractor starWarInteractor;

    @Inject
    public VideoRewardService videoRewardService;
    private WarGameAnimationHelper warGameAnimationHelper;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private Map<EditText, ? extends TextView> editors = MapsKt.emptyMap();
    private final float _alphaDisable = 0.4f;
    private final float _alphaEnable = 1.0f;
    private final View.OnFocusChangeListener onFocusChangedListener = new View.OnFocusChangeListener() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda4
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            WarGameFragment.onFocusChangedListener$lambda$2(WarGameFragment.this, view, z);
        }
    };
    private final WarGameFragment$onTextChangeListener$1 onTextChangeListener = new TextWatcher() { // from class: org.betup.games.warGame.ui.WarGameFragment$onTextChangeListener$1
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            WarGameFragment.this.updateBetButtonState();
        }
    };
    private final View.OnClickListener doubleAndHalfBetListener = new View.OnClickListener() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WarGameFragment.doubleAndHalfBetListener$lambda$4(WarGameFragment.this, view);
        }
    };
    private final View.OnClickListener minAndMaxBetListener = new View.OnClickListener() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WarGameFragment.minAndMaxBetListener$lambda$5(WarGameFragment.this, view);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<WarGameRoundResultDto, Unit> startWarGameListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda7
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            WarGameFragment.startWarGameListener$lambda$7(WarGameFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<WarGameRoundResultDto, String> continueGameListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda8
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            WarGameFragment.continueGameListener$lambda$9(WarGameFragment.this, fetchedResponseMessage);
        }
    };
    private final View.OnClickListener drawResultClickListener = new View.OnClickListener() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda9
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WarGameFragment.drawResultClickListener$lambda$10(WarGameFragment.this, view);
        }
    };
    private final View.OnClickListener okButtonClickListener = new View.OnClickListener() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda10
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WarGameFragment.okButtonClickListener$lambda$14(WarGameFragment.this, view);
        }
    };

    /* compiled from: WarGameFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GameResult.values().length];
            try {
                iArr[GameResult.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameResult.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        return true;
    }

    private final FragmentWarGameBinding getBinding() {
        FragmentWarGameBinding fragmentWarGameBinding = this._binding;
        Intrinsics.checkNotNull(fragmentWarGameBinding);
        return fragmentWarGameBinding;
    }

    public final GetWarGameConfigInteractor getGetWarGameConfigInteractor() {
        GetWarGameConfigInteractor getWarGameConfigInteractor = this.getWarGameConfigInteractor;
        if (getWarGameConfigInteractor != null) {
            return getWarGameConfigInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getWarGameConfigInteractor");
        return null;
    }

    public final void setGetWarGameConfigInteractor(GetWarGameConfigInteractor getWarGameConfigInteractor) {
        Intrinsics.checkNotNullParameter(getWarGameConfigInteractor, "<set-?>");
        this.getWarGameConfigInteractor = getWarGameConfigInteractor;
    }

    public final StartWarGameInteractor getStarWarInteractor() {
        StartWarGameInteractor startWarGameInteractor = this.starWarInteractor;
        if (startWarGameInteractor != null) {
            return startWarGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("starWarInteractor");
        return null;
    }

    public final void setStarWarInteractor(StartWarGameInteractor startWarGameInteractor) {
        Intrinsics.checkNotNullParameter(startWarGameInteractor, "<set-?>");
        this.starWarInteractor = startWarGameInteractor;
    }

    public final ContinueWarGameInteractor getContinueWarGameInteractor() {
        ContinueWarGameInteractor continueWarGameInteractor = this.continueWarGameInteractor;
        if (continueWarGameInteractor != null) {
            return continueWarGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("continueWarGameInteractor");
        return null;
    }

    public final void setContinueWarGameInteractor(ContinueWarGameInteractor continueWarGameInteractor) {
        Intrinsics.checkNotNullParameter(continueWarGameInteractor, "<set-?>");
        this.continueWarGameInteractor = continueWarGameInteractor;
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

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards
    protected VideoRewardService getVideoRewardServiceInstance() {
        return getVideoRewardService();
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards
    protected void updateOfferState(boolean isAvailable, long amount) {
        getBinding().containerResultGames.videoOffer.setVisibility(isAvailable ? 0 : 8);
        TextView textView = getBinding().containerResultGames.videoRewardAmount;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), "+%d", Arrays.copyOf(new Object[]{Long.valueOf(amount)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
    }

    @Override // org.betup.games.BaseGameFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentWarGameBinding.inflate(inflater, container, false);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.editors = MapsKt.mapOf(TuplesKt.to(getBinding().editWinBet, getBinding().textWin), TuplesKt.to(getBinding().editDrawBet, getBinding().textDraw));
        initDefaultValuesToEditors(getBinding().editWinBet);
        initCoefsButtonsListeners();
        getBinding().makeBetButton.setOnClickListener(this);
        getBinding().buttonWar.setOnClickListener(this.drawResultClickListener);
        getBinding().buttonGiveUp.setOnClickListener(this.drawResultClickListener);
        getBinding().okButton.setOnClickListener(this.okButtonClickListener);
        getBinding().containerResultGames.videoOffer.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WarGameFragment.this.onVideoRewardClicked();
            }
        });
        getGetWarGameConfigInteractor().load(this, null);
    }

    @Override // org.betup.games.StubListener
    public void setUpStub(boolean isVisible) {
        if (getBinding().stub == null || !isActive()) {
            return;
        }
        if (isVisible) {
            getBinding().stub.setVisibility(0);
        } else {
            getBinding().stub.setVisibility(8);
        }
    }

    @Override // org.betup.games.BaseGameFragment
    protected long getAmount() {
        long j;
        EditText editWinBet = getBinding().editWinBet;
        Intrinsics.checkNotNullExpressionValue(editWinBet, "editWinBet");
        if (TextUtilClassKt.getContainsLong(editWinBet)) {
            EditText editWinBet2 = getBinding().editWinBet;
            Intrinsics.checkNotNullExpressionValue(editWinBet2, "editWinBet");
            j = TextUtilClassKt.editTextToLong(editWinBet2);
        } else {
            j = 0;
        }
        EditText editDrawBet = getBinding().editDrawBet;
        Intrinsics.checkNotNullExpressionValue(editDrawBet, "editDrawBet");
        if (TextUtilClassKt.getContainsLong(editDrawBet)) {
            EditText editDrawBet2 = getBinding().editDrawBet;
            Intrinsics.checkNotNullExpressionValue(editDrawBet2, "editDrawBet");
            j += TextUtilClassKt.editTextToLong(editDrawBet2);
        }
        return j > 0 ? j : getMinCoef();
    }

    private final void initDefaultValuesToEditors(EditText... editors) {
        Long customBetAmount = SharedPrefs.getCustomBetAmount(getBinding().getRoot().getContext());
        for (EditText editText : editors) {
            int minCoef = getMinCoef();
            int maxCoef = getMaxCoef();
            Intrinsics.checkNotNull(customBetAmount);
            long longValue = customBetAmount.longValue();
            if (minCoef <= longValue && longValue <= maxCoef) {
                editText.setText(customBetAmount.toString());
            } else if (customBetAmount.longValue() < getMinCoef()) {
                editText.setText(String.valueOf(getMinCoef()));
            } else {
                editText.setText(String.valueOf(getMaxCoef()));
            }
        }
    }

    private final void initCoefsButtonsListeners() {
        getBinding().buttonMin.setOnClickListener(this.minAndMaxBetListener);
        getBinding().buttonDouble.setOnClickListener(this.doubleAndHalfBetListener);
        getBinding().buttonHalf.setOnClickListener(this.doubleAndHalfBetListener);
        getBinding().buttonMax.setOnClickListener(this.minAndMaxBetListener);
        getBinding().editDrawBet.addTextChangedListener(this.onTextChangeListener);
        getBinding().editWinBet.addTextChangedListener(this.onTextChangeListener);
        getBinding().editDrawBet.setOnFocusChangeListener(this.onFocusChangedListener);
        getBinding().editWinBet.setOnFocusChangeListener(this.onFocusChangedListener);
        setButtonsEnabled(true);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ConstraintLayout containerMakeCustomBet = getBinding().containerMakeCustomBet;
        Intrinsics.checkNotNullExpressionValue(containerMakeCustomBet, "containerMakeCustomBet");
        LinearLayout containerDrawResult = getBinding().containerDrawResult;
        Intrinsics.checkNotNullExpressionValue(containerDrawResult, "containerDrawResult");
        LinearLayout containerDialogResult = getBinding().containerDialogResult;
        Intrinsics.checkNotNullExpressionValue(containerDialogResult, "containerDialogResult");
        WarGameAnimationHelper warGameAnimationHelper = new WarGameAnimationHelper(requireContext, containerMakeCustomBet, containerDrawResult, containerDialogResult);
        this.warGameAnimationHelper = warGameAnimationHelper;
        warGameAnimationHelper.setStubListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFocusChangedListener$lambda$2(WarGameFragment warGameFragment, View view, boolean z) {
        if (z) {
            warGameFragment.updateBetButtonState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBetButtonState() {
        TextView textView;
        FragmentActivity activity = getActivity();
        View currentFocus = activity != null ? activity.getCurrentFocus() : null;
        EditText editText = currentFocus instanceof EditText ? (EditText) currentFocus : null;
        if (editText == null || (textView = this.editors.get(editText)) == null) {
            return;
        }
        if (TextUtilClassKt.getContainsInt(editText) && TextUtilClassKt.editTextToInt(editText) >= getMinCoef()) {
            setButtonsEnabled(true);
            editText.setAlpha(this._alphaEnable);
            textView.setAlpha(this._alphaEnable);
        } else {
            setButtonsEnabled(false);
            editText.setAlpha(this._alphaDisable);
            textView.setAlpha(this._alphaDisable);
        }
    }

    private final void setButtonsEnabled(boolean enabled) {
        Iterator it = CollectionsKt.listOf((Object[]) new AlphaPressButton[]{getBinding().buttonDouble, getBinding().buttonHalf}).iterator();
        while (it.hasNext()) {
            ((AlphaPressButton) it.next()).setActive(enabled);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doubleAndHalfBetListener$lambda$4(WarGameFragment warGameFragment, View view) {
        FragmentActivity activity = warGameFragment.getActivity();
        View currentFocus = activity != null ? activity.getCurrentFocus() : null;
        EditText editWinBet = currentFocus instanceof EditText ? (EditText) currentFocus : null;
        if (editWinBet == null) {
            editWinBet = warGameFragment.getBinding().editWinBet;
            Intrinsics.checkNotNullExpressionValue(editWinBet, "editWinBet");
        }
        Editable text = editWinBet.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            warGameFragment.setButtonsEnabled(false);
            warGameFragment.makeToast(R.string.select_your_bet);
            return;
        }
        if (TextUtilClassKt.getContainsInt(editWinBet)) {
            int editTextToInt = TextUtilClassKt.editTextToInt(editWinBet);
            int id = view.getId();
            if (id == R.id.buttonDouble) {
                if (editTextToInt > warGameFragment.getMaxCoef() / 2) {
                    String string = warGameFragment.getString(R.string.cant_double_your_bet);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    warGameFragment.makeToast(string);
                    return;
                }
                editWinBet.setText(String.valueOf(editTextToInt * 2));
                return;
            }
            if (id != R.id.buttonHalf) {
                return;
            }
            int i = editTextToInt / 2;
            if (i < warGameFragment.getMinCoef()) {
                warGameFragment.makeToast(R.string.cant_divide_your_bet);
            } else {
                editWinBet.setText(String.valueOf(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void minAndMaxBetListener$lambda$5(WarGameFragment warGameFragment, View view) {
        FragmentActivity activity = warGameFragment.getActivity();
        View currentFocus = activity != null ? activity.getCurrentFocus() : null;
        EditText editWinBet = currentFocus instanceof EditText ? (EditText) currentFocus : null;
        if (editWinBet == null) {
            editWinBet = warGameFragment.getBinding().editWinBet;
            Intrinsics.checkNotNullExpressionValue(editWinBet, "editWinBet");
        }
        switch (view.getId()) {
            case R.id.buttonMax /* 2131362142 */:
                editWinBet.setText(String.valueOf(warGameFragment.getMaxCoef()));
                break;
            case R.id.buttonMin /* 2131362143 */:
                editWinBet.setText(String.valueOf(warGameFragment.getMinCoef()));
                break;
        }
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<GameConfigModel, Unit> responseMessage) {
        WarGameAnimationHelper warGameAnimationHelper;
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        if (responseMessage.getStat() == FetchStat.SUCCESS && isActive()) {
            GameConfigModel model = responseMessage.getModel();
            setMinCoef(model.getMinBetAmount());
            setMaxCoef(model.getMaxBetAmount());
            EditText editWinBet = getBinding().editWinBet;
            Intrinsics.checkNotNullExpressionValue(editWinBet, "editWinBet");
            TextUtilClassKt.setMaxLength(editWinBet, model.getMaxBetAmount());
            EditText editDrawBet = getBinding().editDrawBet;
            Intrinsics.checkNotNullExpressionValue(editDrawBet, "editDrawBet");
            TextUtilClassKt.setMaxLength(editDrawBet, model.getMaxBetAmount());
            setupFlipAnimations();
            getBinding().containerResultGames.wonMoneyAmountContainer.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.war_game_lost_background));
            getBinding().progress.setVisibility(8);
            if (getBinding().containerMakeCustomBet != null && (warGameAnimationHelper = this.warGameAnimationHelper) != null) {
                WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper, TargetAnimation.SHOW_BET_DIALOG, false, 500L, 0L, 8, null);
            }
            this.leftCardStartAnim = setupTranslateForLeftCard(getBinding().leftCardBound.getWidth());
            this.rightCardStartAnim = setupTranslateForRightCard(getBinding().fragmentWarGame.getWidth());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int i;
        int i2;
        Editable text = getBinding().editWinBet.getText();
        boolean z = true;
        boolean z2 = text == null || text.length() == 0;
        Editable text2 = getBinding().editDrawBet.getText();
        if (text2 != null && text2.length() != 0) {
            z = false;
        }
        if (z2 && z) {
            makeToast(R.string.select_your_bet);
            return;
        }
        if (z2) {
            i = 0;
        } else {
            EditText editWinBet = getBinding().editWinBet;
            Intrinsics.checkNotNullExpressionValue(editWinBet, "editWinBet");
            i = TextUtilClassKt.editTextToInt(editWinBet);
            if (!isBetValid(i)) {
                return;
            }
        }
        if (z) {
            i2 = 0;
        } else {
            EditText editDrawBet = getBinding().editDrawBet;
            Intrinsics.checkNotNullExpressionValue(editDrawBet, "editDrawBet");
            i2 = TextUtilClassKt.editTextToInt(editDrawBet);
            if (!isBetValid(i2)) {
                return;
            }
        }
        if (i == 0 && i2 == 0) {
            makeToast(R.string.select_your_bet);
            return;
        }
        if (i + i2 > getUserServiceAccessor().getUserService().getShortProfile().getUserProgressModel().getMoneyBalance()) {
            showShopDialog();
            return;
        }
        WarGameAnimationHelper warGameAnimationHelper = this.warGameAnimationHelper;
        if (warGameAnimationHelper != null) {
            WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper, TargetAnimation.HIDE_BET_DIALOG, false, 200L, 0L, 8, null);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("drawAmount", i2);
        bundle.putInt("wonAmount", i);
        getBinding().progress.setVisibility(0);
        getStarWarInteractor().load(this.startWarGameListener, null, bundle);
    }

    private final boolean isBetValid(int amount) {
        String str;
        if (amount == 0) {
            return true;
        }
        long moneyBalance = getUserServiceAccessor().getUserService().getShortProfile().getUserProgressModel().getMoneyBalance();
        if (amount <= getMaxCoef() || amount <= moneyBalance) {
            str = "";
        } else {
            str = requireContext().getString(R.string.not_enough_betcoins);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        if (amount > getMaxCoef() && amount < moneyBalance) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = requireContext().getString(R.string.bet_grather_then_expected);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(getMaxCoef())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        if (amount < getMinCoef()) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = requireContext().getString(R.string.bet_smaller_then_expected);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            str = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(getMinCoef())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        if (Intrinsics.areEqual(str, "")) {
            return true;
        }
        SnackbarHelper.showShort(requireContext(), str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWarGameListener$lambda$7(WarGameFragment warGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        long j;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && warGameFragment.isActive()) {
            if (!((WarGameRoundResultDto) fetchedResponseMessage.getModel()).getFinished() && warGameFragment.continueSessionId == null) {
                warGameFragment.continueSessionId = ((WarGameRoundResultDto) fetchedResponseMessage.getModel()).getSessionRef();
                if (warGameFragment.getBinding().containerMakeCustomBet != null && warGameFragment.getBinding().containerDrawResult != null) {
                    Object model = fetchedResponseMessage.getModel();
                    Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
                    warGameFragment.setCardValuesAndStartAnimations((WarGameRoundResultDto) model);
                    WarGameAnimationHelper warGameAnimationHelper = warGameFragment.warGameAnimationHelper;
                    if (warGameAnimationHelper != null) {
                        WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper, TargetAnimation.SHOW_DRAW_DIALOG, false, 250L, 0L, 8, null);
                    }
                }
            } else {
                warGameFragment.handleGameResult(((WarGameRoundResultDto) fetchedResponseMessage.getModel()).getWarGameResultModel());
                if (warGameFragment.getBinding().containerMakeCustomBet != null && warGameFragment.getBinding().containerDialogResult != null) {
                    Object model2 = fetchedResponseMessage.getModel();
                    Intrinsics.checkNotNullExpressionValue(model2, "getModel(...)");
                    warGameFragment.setCardValuesAndStartAnimations((WarGameRoundResultDto) model2);
                    WarGameAnimationHelper warGameAnimationHelper2 = warGameFragment.warGameAnimationHelper;
                    if (warGameAnimationHelper2 != null) {
                        WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper2, TargetAnimation.SHOW_RESULT_DIALOG, false, 0L, 300L, 6, null);
                    }
                }
            }
            if (((WarGameRoundResultDto) fetchedResponseMessage.getModel()).getFinished()) {
                WarGameResultModel warGameResultModel = ((WarGameRoundResultDto) fetchedResponseMessage.getModel()).getWarGameResultModel();
                long amount = warGameFragment.getAmount();
                boolean z = warGameResultModel.getGameResult() == GameResult.WON;
                if (warGameResultModel.getGameResult() == GameResult.WON) {
                    Integer returnAmount = warGameResultModel.getReturnAmount();
                    j = returnAmount != null ? returnAmount.intValue() : 0;
                } else {
                    j = 0;
                }
                warGameFragment.scheduleOptimisticBalanceAfterRoundResult(amount, z, j);
            } else {
                warGameFragment.validateProfile();
            }
            warGameFragment.getBinding().progress.setVisibility(8);
        }
    }

    private final void handleGameResult(WarGameResultModel model) {
        if (model.getReturnAmount() != null) {
            getBinding().containerResultGames.betcoins.setText(model.getReturnAmount().toString());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[model.getGameResult().ordinal()];
        if (i == 1) {
            getBinding().containerResultGames.gameResultTitle.setText(getString(R.string.you_win));
            getBinding().containerDialogResult.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.war_game_won_background));
            getBinding().containerResultGames.betcoins.setTextColor(ContextCompat.getColor(requireContext(), R.color.colorAccent));
            getBinding().betupLabel.animationWon(700L);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getBinding().containerResultGames.gameResultTitle.setText(getString(R.string.you_lost));
            getBinding().containerDialogResult.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.war_game_lost_background));
            getBinding().containerResultGames.betcoins.setTextColor(ContextCompat.getColor(requireContext(), R.color.button_red));
            getBinding().betupLabel.animationLost(700L);
        }
        onGamePlayed(model.getGameResult() == GameResult.WON);
    }

    private final void restoreAll() {
        this.continueSessionId = null;
        getBinding().leftCard.setVisibility(4);
        getBinding().rightCard.setVisibility(4);
        Animator animator = this.leftCardAnimLeftOut;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.leftCardAnimLeftIn;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.rightCardAnimLeftOut;
        if (animator3 != null) {
            animator3.cancel();
        }
        Animator animator4 = this.rightCardAnimLeftIn;
        if (animator4 != null) {
            animator4.cancel();
        }
        getBinding().leftCard.clearAnimation();
        getBinding().rightCard.clearAnimation();
        getBinding().leftCardBack.clearAnimation();
        getBinding().rightCardBack.clearAnimation();
        getBinding().editWinBet.setAlpha(1.0f);
        getBinding().textWin.setAlpha(1.0f);
        getBinding().editDrawBet.setAlpha(0.4f);
        getBinding().editDrawBet.setAlpha(0.4f);
        getBinding().betupLabel.restoreViewsStates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void continueGameListener$lambda$9(final WarGameFragment warGameFragment, final FetchedResponseMessage fetchedResponseMessage) {
        long j;
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && warGameFragment.isActive()) {
            Serializable serializable = fetchedResponseMessage.getArgs().getSerializable("action");
            WarGameAction warGameAction = serializable instanceof WarGameAction ? (WarGameAction) serializable : null;
            if (warGameAction == null) {
                return;
            }
            Handler handler = new Handler();
            if (warGameAction == WarGameAction.WAR) {
                warGameFragment.restoreAll();
                handler.postDelayed(new Runnable() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        WarGameFragment.continueGameListener$lambda$9$lambda$8(WarGameFragment.this, fetchedResponseMessage);
                    }
                }, 300L);
            }
            if (warGameAction == WarGameAction.GIVE_UP) {
                if (warGameFragment.getBinding().containerMakeCustomBet != null) {
                    WarGameAnimationHelper warGameAnimationHelper = warGameFragment.warGameAnimationHelper;
                    if (warGameAnimationHelper != null) {
                        WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper, TargetAnimation.SHOW_RESULT_DIALOG, true, 0L, 300L, 4, null);
                    }
                    WarGameAnimationHelper warGameAnimationHelper2 = warGameFragment.warGameAnimationHelper;
                    if (warGameAnimationHelper2 != null) {
                        warGameAnimationHelper2.playDrawSound(550L);
                    }
                }
                WarGameResultModel warGameResultModel = ((WarGameRoundResultDto) fetchedResponseMessage.getModel()).getWarGameResultModel();
                long amount = warGameFragment.getAmount();
                boolean z = warGameResultModel.getGameResult() == GameResult.WON;
                if (warGameResultModel.getGameResult() == GameResult.WON) {
                    Integer returnAmount = warGameResultModel.getReturnAmount();
                    j = returnAmount != null ? returnAmount.intValue() : 0;
                } else {
                    j = 0;
                }
                warGameFragment.scheduleOptimisticBalanceAfterRoundResult(amount, z, j);
            }
            warGameFragment.getBinding().progress.setVisibility(8);
            if (warGameAction != WarGameAction.WAR || ((WarGameRoundResultDto) fetchedResponseMessage.getModel()).getFinished()) {
                return;
            }
            warGameFragment.validateProfile();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void continueGameListener$lambda$9$lambda$8(WarGameFragment warGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        long j;
        Object model = fetchedResponseMessage.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
        warGameFragment.setCardValuesAndStartAnimations((WarGameRoundResultDto) model);
        if (((WarGameRoundResultDto) fetchedResponseMessage.getModel()).getFinished()) {
            WarGameResultModel warGameResultModel = ((WarGameRoundResultDto) fetchedResponseMessage.getModel()).getWarGameResultModel();
            warGameFragment.handleGameResult(warGameResultModel);
            WarGameAnimationHelper warGameAnimationHelper = warGameFragment.warGameAnimationHelper;
            if (warGameAnimationHelper != null) {
                WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper, TargetAnimation.SHOW_RESULT_DIALOG, true, 0L, 200L, 4, null);
            }
            long amount = warGameFragment.getAmount();
            boolean z = warGameResultModel.getGameResult() == GameResult.WON;
            if (warGameResultModel.getGameResult() == GameResult.WON) {
                Integer returnAmount = warGameResultModel.getReturnAmount();
                j = returnAmount != null ? returnAmount.intValue() : 0;
            } else {
                j = 0;
            }
            warGameFragment.scheduleOptimisticBalanceAfterRoundResult(amount, z, j);
            return;
        }
        WarGameAnimationHelper warGameAnimationHelper2 = warGameFragment.warGameAnimationHelper;
        if (warGameAnimationHelper2 != null) {
            WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper2, TargetAnimation.SHOW_DRAW_DIALOG, false, 0L, 200L, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawResultClickListener$lambda$10(WarGameFragment warGameFragment, View view) {
        warGameFragment.getBinding().progress.setVisibility(0);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        Bundle bundle = new Bundle();
        int id = warGameFragment.getBinding().buttonWar.getId();
        if (valueOf != null && valueOf.intValue() == id) {
            bundle.putSerializable("action", WarGameAction.WAR);
        } else {
            bundle.putSerializable("action", WarGameAction.GIVE_UP);
        }
        if (warGameFragment.continueSessionId != null) {
            warGameFragment.getBinding().progress.setVisibility(0);
            WarGameAnimationHelper warGameAnimationHelper = warGameFragment.warGameAnimationHelper;
            if (warGameAnimationHelper != null) {
                WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper, TargetAnimation.HIDE_DRAW_DIALOG, false, 0L, 0L, 12, null);
            }
            warGameFragment.getContinueWarGameInteractor().load(warGameFragment.continueGameListener, warGameFragment.continueSessionId, bundle);
        }
    }

    private final void setCardValuesAndStartAnimations(WarGameRoundResultDto warGameRoundResultDto) {
        if (getBinding().leftCard != null && getBinding().rightCard != null && warGameRoundResultDto.getOpponentCard() != null && warGameRoundResultDto.getPlayerCard() != null) {
            getBinding().leftCard.setCardValue(warGameRoundResultDto.getOpponentCard().getCardValue());
            getBinding().leftCard.setCardSuite(warGameRoundResultDto.getOpponentCard().getCardSuite());
            getBinding().rightCard.setCardValue(warGameRoundResultDto.getPlayerCard().getCardValue());
            getBinding().rightCard.setCardSuite(warGameRoundResultDto.getPlayerCard().getCardSuite());
            getBinding().leftCardBack.startAnimation(this.leftCardStartAnim);
            Animator animator = this.leftCardAnimLeftOut;
            if (animator != null) {
                animator.start();
            }
            new Handler().postDelayed(new Runnable() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    WarGameFragment.setCardValuesAndStartAnimations$lambda$11(WarGameFragment.this);
                }
            }, 500L);
            getBinding().rightCardBack.startAnimation(this.rightCardStartAnim);
            Animator animator2 = this.rightCardAnimLeftOut;
            if (animator2 != null) {
                animator2.start();
            }
            new Handler().postDelayed(new Runnable() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    WarGameFragment.setCardValuesAndStartAnimations$lambda$12(WarGameFragment.this);
                }
            }, 500L);
        }
        getBinding().progress.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCardValuesAndStartAnimations$lambda$11(WarGameFragment warGameFragment) {
        if (warGameFragment.getBinding().leftCard != null) {
            warGameFragment.getBinding().leftCard.setVisibility(0);
            Animator animator = warGameFragment.leftCardAnimLeftIn;
            if (animator != null) {
                animator.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCardValuesAndStartAnimations$lambda$12(WarGameFragment warGameFragment) {
        if (warGameFragment.getBinding().rightCard != null) {
            warGameFragment.getBinding().rightCard.setVisibility(0);
            Animator animator = warGameFragment.rightCardAnimLeftIn;
            if (animator != null) {
                animator.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void okButtonClickListener$lambda$14(final WarGameFragment warGameFragment, View view) {
        warGameFragment.increaseClickCountOrShowInterstitial();
        warGameFragment.getBinding().progress.setVisibility(0);
        warGameFragment.continueSessionId = null;
        warGameFragment.restoreAll();
        if (warGameFragment.getBinding().containerMakeCustomBet == null || warGameFragment.getBinding().containerDialogResult == null) {
            return;
        }
        WarGameAnimationHelper warGameAnimationHelper = warGameFragment.warGameAnimationHelper;
        if (warGameAnimationHelper != null) {
            WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper, TargetAnimation.HIDE_RESULT_DIALOG, false, 0L, 0L, 12, null);
        }
        WarGameAnimationHelper warGameAnimationHelper2 = warGameFragment.warGameAnimationHelper;
        if (warGameAnimationHelper2 != null) {
            WarGameAnimationHelper.changeAndStartTargetAnimation$default(warGameAnimationHelper2, TargetAnimation.SHOW_BET_DIALOG, true, 250L, 0L, 8, null);
        }
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.warGame.ui.WarGameFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WarGameFragment.okButtonClickListener$lambda$14$lambda$13(WarGameFragment.this);
            }
        }, 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void okButtonClickListener$lambda$14$lambda$13(WarGameFragment warGameFragment) {
        warGameFragment.getBinding().progress.setVisibility(8);
    }

    static /* synthetic */ TranslateAnimation setupTranslateForLeftCard$default(WarGameFragment warGameFragment, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return warGameFragment.setupTranslateForLeftCard(f);
    }

    private final TranslateAnimation setupTranslateForLeftCard(float width) {
        getBinding().leftCardBound.getLocationOnScreen(new int[2]);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, r0[0] + width, 0.0f, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setStartOffset(200L);
        return translateAnimation;
    }

    static /* synthetic */ TranslateAnimation setupTranslateForRightCard$default(WarGameFragment warGameFragment, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return warGameFragment.setupTranslateForRightCard(f);
    }

    private final TranslateAnimation setupTranslateForRightCard(float parentWidth) {
        getBinding().rightCardBound.getLocationOnScreen(new int[2]);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -(parentWidth - r0[0]), 0.0f, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setStartOffset(200L);
        return translateAnimation;
    }

    private final void setupFlipAnimations() {
        Animator loadAnimator = AnimatorInflater.loadAnimator(requireContext(), R.animator.war_game_card_flip_left_out);
        this.leftCardAnimLeftOut = loadAnimator;
        if (loadAnimator != null) {
            loadAnimator.setTarget(getBinding().leftCardBack);
        }
        Animator animator = this.leftCardAnimLeftOut;
        if (animator != null) {
            animator.setStartDelay(300L);
        }
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(requireContext(), R.animator.war_game_card_flip_left_in);
        this.leftCardAnimLeftIn = loadAnimator2;
        if (loadAnimator2 != null) {
            loadAnimator2.setTarget(getBinding().leftCard);
        }
        Animator loadAnimator3 = AnimatorInflater.loadAnimator(requireContext(), R.animator.war_game_card_flip_left_out);
        this.rightCardAnimLeftOut = loadAnimator3;
        if (loadAnimator3 != null) {
            loadAnimator3.setTarget(getBinding().rightCardBack);
        }
        Animator animator2 = this.rightCardAnimLeftOut;
        if (animator2 != null) {
            animator2.setStartDelay(300L);
        }
        Animator loadAnimator4 = AnimatorInflater.loadAnimator(requireContext(), R.animator.war_game_card_flip_left_in);
        this.rightCardAnimLeftIn = loadAnimator4;
        if (loadAnimator4 != null) {
            loadAnimator4.setTarget(getBinding().rightCard);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processChangeInetState(InetStateMessage inetStateMessage) {
        Intrinsics.checkNotNullParameter(inetStateMessage, "inetStateMessage");
        if (!inetStateMessage.isConnected() && isVisible()) {
            getBinding().stub.setVisibility(0);
        } else {
            getBinding().stub.setVisibility(8);
        }
    }

    /* compiled from: WarGameFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/games/warGame/ui/WarGameFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/games/warGame/ui/WarGameFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WarGameFragment newInstance() {
            return new WarGameFragment();
        }
    }
}

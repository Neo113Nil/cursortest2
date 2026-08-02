package org.betup.games.higherLower.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C3473f8;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.InetStateMessage;
import org.betup.databinding.FragmentHighLowGameBinding;
import org.betup.games.BaseGameFragmentWithVideoRewards;
import org.betup.games.StubListener;
import org.betup.games.common.remote.GameConfigModel;
import org.betup.games.dice.model.rest.GameResult;
import org.betup.games.higherLower.model.interactor.ContinueHighLowGameInteractor;
import org.betup.games.higherLower.model.interactor.HigherLowerGameConfigInteractor;
import org.betup.games.higherLower.model.interactor.StartHighLowGameInteractor;
import org.betup.games.higherLower.model.rest.HighLowBetType;
import org.betup.games.higherLower.model.rest.HigherLowerGameResultModel;
import org.betup.games.higherLower.model.rest.StartHigherLowerGameModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.views.AlphaPressButton;
import org.betup.utils.SharedPrefs;
import org.betup.utils.TextUtilClassKt;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: HigherLowerGameFragment.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 e2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0005:\u0001eB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u00101\u001a\u00020&H\u0014J\u0018\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u000205H\u0014J\u0012\u00106\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020\u0004H\u0016J&\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020;2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001c\u0010B\u001a\u00020\u00042\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040DH\u0016J\b\u0010E\u001a\u000205H\u0014J\u0010\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0003H\u0003J\b\u0010H\u001a\u00020\u0004H\u0002J\b\u0010L\u001a\u00020\u0010H\u0002J\b\u0010M\u001a\u00020\u0004H\u0002J\b\u0010N\u001a\u00020\u0004H\u0002J\b\u0010O\u001a\u00020\u0004H\u0002J\u0010\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u0010H\u0016J\b\u0010U\u001a\u00020\u0004H\u0002J\b\u0010V\u001a\u00020\u0004H\u0016J\u0010\u0010X\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020ZH\u0002J\b\u0010]\u001a\u00020\u0004H\u0002J\b\u0010a\u001a\u00020\u0010H\u0016J\u0010\u0010b\u001a\u00020\u00042\u0006\u0010c\u001a\u00020dH\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010R\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00120\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010^\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`0\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lorg/betup/games/higherLower/ui/HigherLowerGameFragment;", "Lorg/betup/games/BaseGameFragmentWithVideoRewards;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/games/common/remote/GameConfigModel;", "", "Lorg/betup/games/StubListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "_binding", "Lorg/betup/databinding/FragmentHighLowGameBinding;", "binding", "getBinding", "()Lorg/betup/databinding/FragmentHighLowGameBinding;", "highLowAninationHelper", "Lorg/betup/games/higherLower/ui/HighLowAnimationHelper;", "isConfigured", "", "sessionId", "", "configInteractor", "Lorg/betup/games/higherLower/model/interactor/HigherLowerGameConfigInteractor;", "getConfigInteractor", "()Lorg/betup/games/higherLower/model/interactor/HigherLowerGameConfigInteractor;", "setConfigInteractor", "(Lorg/betup/games/higherLower/model/interactor/HigherLowerGameConfigInteractor;)V", "startGameInteractor", "Lorg/betup/games/higherLower/model/interactor/StartHighLowGameInteractor;", "getStartGameInteractor", "()Lorg/betup/games/higherLower/model/interactor/StartHighLowGameInteractor;", "setStartGameInteractor", "(Lorg/betup/games/higherLower/model/interactor/StartHighLowGameInteractor;)V", "continueGameInteractor", "Lorg/betup/games/higherLower/model/interactor/ContinueHighLowGameInteractor;", "getContinueGameInteractor", "()Lorg/betup/games/higherLower/model/interactor/ContinueHighLowGameInteractor;", "setContinueGameInteractor", "(Lorg/betup/games/higherLower/model/interactor/ContinueHighLowGameInteractor;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "getVideoRewardServiceInstance", "updateOfferState", "isAvailable", "amount", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "getAmount", "initFragment", "higherLowerGameConfigModel", "initCoefsButtonsListeners", "betButtonClickListener", "Landroid/view/View$OnClickListener;", "makeBetClickListener", "isBetValid", "placeBet", "restoreGameState", "restoreViews", "setUpStub", C3473f8.k, "coefButtons", "", "Lorg/betup/ui/views/AlphaPressButton;", "initSelectBetButtonContainerListner", "onStop", "betTypeListener", "validateAlphaForCoef", "tag", "Lorg/betup/games/higherLower/model/rest/HighLowBetType;", "continueGameListener", "Lorg/betup/games/higherLower/model/rest/HigherLowerGameResultModel;", "initAnimations", "startGameListener", "Lorg/betup/games/higherLower/model/rest/StartHigherLowerGameModel;", "", "onBackPressed", "processChangeInetState", "inetStateMessage", "Lorg/betup/bus/InetStateMessage;", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HigherLowerGameFragment extends BaseGameFragmentWithVideoRewards implements BaseCachedSharedInteractor.OnFetchedListener<GameConfigModel, Unit>, StubListener {
    private FragmentHighLowGameBinding _binding;
    private List<? extends AlphaPressButton> coefButtons;

    @Inject
    public HigherLowerGameConfigInteractor configInteractor;

    @Inject
    public ContinueHighLowGameInteractor continueGameInteractor;
    private HighLowAnimationHelper highLowAninationHelper;
    private boolean isConfigured;
    private String sessionId;

    @Inject
    public StartHighLowGameInteractor startGameInteractor;

    @Inject
    public UserService userService;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final View.OnClickListener betButtonClickListener = new View.OnClickListener() { // from class: org.betup.games.higherLower.ui.HigherLowerGameFragment$$ExternalSyntheticLambda2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HigherLowerGameFragment.betButtonClickListener$lambda$4(HigherLowerGameFragment.this, view);
        }
    };
    private final View.OnClickListener makeBetClickListener = new View.OnClickListener() { // from class: org.betup.games.higherLower.ui.HigherLowerGameFragment$$ExternalSyntheticLambda3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HigherLowerGameFragment.makeBetClickListener$lambda$5(HigherLowerGameFragment.this, view);
        }
    };
    private final View.OnClickListener betTypeListener = new View.OnClickListener() { // from class: org.betup.games.higherLower.ui.HigherLowerGameFragment$$ExternalSyntheticLambda4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HigherLowerGameFragment.betTypeListener$lambda$8(HigherLowerGameFragment.this, view);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<HigherLowerGameResultModel, String> continueGameListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.higherLower.ui.HigherLowerGameFragment$$ExternalSyntheticLambda5
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HigherLowerGameFragment.continueGameListener$lambda$11(HigherLowerGameFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<StartHigherLowerGameModel, Object> startGameListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.higherLower.ui.HigherLowerGameFragment$$ExternalSyntheticLambda6
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HigherLowerGameFragment.startGameListener$lambda$14(HigherLowerGameFragment.this, fetchedResponseMessage);
        }
    };

    private final FragmentHighLowGameBinding getBinding() {
        FragmentHighLowGameBinding fragmentHighLowGameBinding = this._binding;
        Intrinsics.checkNotNull(fragmentHighLowGameBinding);
        return fragmentHighLowGameBinding;
    }

    public final HigherLowerGameConfigInteractor getConfigInteractor() {
        HigherLowerGameConfigInteractor higherLowerGameConfigInteractor = this.configInteractor;
        if (higherLowerGameConfigInteractor != null) {
            return higherLowerGameConfigInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configInteractor");
        return null;
    }

    public final void setConfigInteractor(HigherLowerGameConfigInteractor higherLowerGameConfigInteractor) {
        Intrinsics.checkNotNullParameter(higherLowerGameConfigInteractor, "<set-?>");
        this.configInteractor = higherLowerGameConfigInteractor;
    }

    public final StartHighLowGameInteractor getStartGameInteractor() {
        StartHighLowGameInteractor startHighLowGameInteractor = this.startGameInteractor;
        if (startHighLowGameInteractor != null) {
            return startHighLowGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startGameInteractor");
        return null;
    }

    public final void setStartGameInteractor(StartHighLowGameInteractor startHighLowGameInteractor) {
        Intrinsics.checkNotNullParameter(startHighLowGameInteractor, "<set-?>");
        this.startGameInteractor = startHighLowGameInteractor;
    }

    public final ContinueHighLowGameInteractor getContinueGameInteractor() {
        ContinueHighLowGameInteractor continueHighLowGameInteractor = this.continueGameInteractor;
        if (continueHighLowGameInteractor != null) {
            return continueHighLowGameInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("continueGameInteractor");
        return null;
    }

    public final void setContinueGameInteractor(ContinueHighLowGameInteractor continueHighLowGameInteractor) {
        Intrinsics.checkNotNullParameter(continueHighLowGameInteractor, "<set-?>");
        this.continueGameInteractor = continueHighLowGameInteractor;
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

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards
    protected VideoRewardService getVideoRewardServiceInstance() {
        return getVideoRewardService();
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards
    protected void updateOfferState(boolean isAvailable, long amount) {
        getBinding().containerHighLowerResult.resultContainer.videoOffer.setVisibility(isAvailable ? 0 : 8);
        TextView textView = getBinding().containerHighLowerResult.resultContainer.videoRewardAmount;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), "+%d", Arrays.copyOf(new Object[]{Long.valueOf(amount)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
    }

    @Override // org.betup.games.BaseGameFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        Context applicationContext = activity != null ? activity.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // org.betup.games.BaseGameFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentHighLowGameBinding.inflate(inflater, container, false);
        return getBinding().getRoot();
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getConfigInteractor().load(this, null);
        getBinding().betContainer.makeBet.setOnClickListener(this.makeBetClickListener);
        getBinding().containerHighLowerResult.okButton.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.higherLower.ui.HigherLowerGameFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HigherLowerGameFragment.onViewCreated$lambda$0(HigherLowerGameFragment.this, view2);
            }
        });
        getBinding().containerHighLowerResult.resultContainer.videoOffer.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.higherLower.ui.HigherLowerGameFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HigherLowerGameFragment.this.onVideoRewardClicked();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(HigherLowerGameFragment higherLowerGameFragment, View view) {
        if (higherLowerGameFragment.isActive()) {
            higherLowerGameFragment.restoreGameState();
        }
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<GameConfigModel, Unit> responseMessage) {
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        if (responseMessage.getStat() == FetchStat.SUCCESS && isActive()) {
            GameConfigModel model = responseMessage.getModel();
            Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
            initFragment(model);
            getBinding().progressBar.setVisibility(8);
        }
    }

    @Override // org.betup.games.BaseGameFragment
    protected long getAmount() {
        Editable text = getBinding().betContainer.editBetAmount.getText();
        if (text != null && text.length() != 0) {
            EditText editBetAmount = getBinding().betContainer.editBetAmount;
            Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
            return TextUtilClassKt.editTextToLong(editBetAmount);
        }
        return getMinCoef();
    }

    private final void initFragment(GameConfigModel higherLowerGameConfigModel) {
        getBinding().highLowFragmentContainer.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.stats_dark_blue_background));
        setMinCoef(higherLowerGameConfigModel.getMinBetAmount());
        setMaxCoef(higherLowerGameConfigModel.getMaxBetAmount());
        EditText editText = getBinding().betContainer.editBetAmount;
        Intrinsics.checkNotNull(editText);
        TextUtilClassKt.setMaxLength(editText, higherLowerGameConfigModel.getMaxBetAmount());
        Long customBetAmount = SharedPrefs.getCustomBetAmount(getBinding().getRoot().getContext());
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
        initAnimations();
        initCoefsButtonsListeners();
        initSelectBetButtonContainerListner();
        HighLowAnimationHelper highLowAnimationHelper = this.highLowAninationHelper;
        if (highLowAnimationHelper != null) {
            highLowAnimationHelper.startShowBetcoinsAnimation();
        }
        this.isConfigured = true;
    }

    private final void initCoefsButtonsListeners() {
        getBinding().betContainer.buttonMin.setOnClickListener(this.betButtonClickListener);
        getBinding().betContainer.buttonDouble.setOnClickListener(this.betButtonClickListener);
        getBinding().betContainer.buttonHalf.setOnClickListener(this.betButtonClickListener);
        getBinding().betContainer.buttonMax.setOnClickListener(this.betButtonClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void betButtonClickListener$lambda$4(HigherLowerGameFragment higherLowerGameFragment, View view) {
        int id = view.getId();
        if (higherLowerGameFragment.getBinding().betContainer.editBetAmount.getText() == null) {
            higherLowerGameFragment.makeToast(R.string.select_your_bet);
            return;
        }
        if (id == R.id.buttonMin) {
            higherLowerGameFragment.getBinding().betContainer.editBetAmount.setText(String.valueOf(higherLowerGameFragment.getMinCoef()));
            return;
        }
        if (id == R.id.buttonMax) {
            higherLowerGameFragment.getBinding().betContainer.editBetAmount.setText(String.valueOf(higherLowerGameFragment.getMaxCoef()));
            return;
        }
        Editable text = higherLowerGameFragment.getBinding().betContainer.editBetAmount.getText();
        if (text == null || text.length() == 0) {
            higherLowerGameFragment.makeToast(R.string.select_your_bet);
            return;
        }
        EditText editBetAmount = higherLowerGameFragment.getBinding().betContainer.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
        int editTextToInt = TextUtilClassKt.editTextToInt(editBetAmount);
        EditText editBetAmount2 = higherLowerGameFragment.getBinding().betContainer.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount2, "editBetAmount");
        if (TextUtilClassKt.editTextToLong(editBetAmount2) > higherLowerGameFragment.getMaxCoef()) {
            higherLowerGameFragment.makeToast(R.string.bet_grather_then_expected);
            return;
        }
        if (id != R.id.buttonDouble) {
            if (id != R.id.buttonHalf) {
                return;
            }
            if (editTextToInt / 2 < higherLowerGameFragment.getMinCoef()) {
                higherLowerGameFragment.makeToast(R.string.cant_divide_your_bet);
                return;
            }
            EditText editText = higherLowerGameFragment.getBinding().betContainer.editBetAmount;
            EditText editBetAmount3 = higherLowerGameFragment.getBinding().betContainer.editBetAmount;
            Intrinsics.checkNotNullExpressionValue(editBetAmount3, "editBetAmount");
            editText.setText(String.valueOf(TextUtilClassKt.editTextToInt(editBetAmount3) / 2));
            return;
        }
        if (editTextToInt > higherLowerGameFragment.getMaxCoef() / 2) {
            String string = higherLowerGameFragment.getString(R.string.cant_double_your_bet);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            higherLowerGameFragment.makeToast(string);
        } else {
            EditText editText2 = higherLowerGameFragment.getBinding().betContainer.editBetAmount;
            EditText editBetAmount4 = higherLowerGameFragment.getBinding().betContainer.editBetAmount;
            Intrinsics.checkNotNullExpressionValue(editBetAmount4, "editBetAmount");
            editText2.setText(String.valueOf(TextUtilClassKt.editTextToInt(editBetAmount4) * 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeBetClickListener$lambda$5(HigherLowerGameFragment higherLowerGameFragment, View view) {
        if (higherLowerGameFragment.isActive() && higherLowerGameFragment.isBetValid()) {
            higherLowerGameFragment.placeBet();
        }
    }

    private final boolean isBetValid() {
        Editable text = getBinding().betContainer.editBetAmount.getText();
        if (text == null || text.length() == 0) {
            makeToast(R.string.select_your_bet);
            return false;
        }
        EditText editBetAmount = getBinding().betContainer.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
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
        getBinding().bottomDigitalNumber.setFlickering(true);
        getBinding().bottomDigitalNumber.setDelay(10000L);
        HighLowAnimationHelper highLowAnimationHelper = this.highLowAninationHelper;
        if (highLowAnimationHelper != null) {
            highLowAnimationHelper.startHideBetcoinsAnimation();
        }
        Bundle bundle = new Bundle();
        EditText editBetAmount = getBinding().betContainer.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
        bundle.putInt("betAmount", TextUtilClassKt.editTextToInt(editBetAmount));
        getStartGameInteractor().load(this.startGameListener, null, bundle);
    }

    private final void restoreGameState() {
        increaseClickCountOrShowInterstitial();
        HighLowAnimationHelper highLowAnimationHelper = this.highLowAninationHelper;
        if (highLowAnimationHelper != null) {
            highLowAnimationHelper.startHideResultAnimation();
        }
        restoreViews();
        HighLowAnimationHelper highLowAnimationHelper2 = this.highLowAninationHelper;
        if (highLowAnimationHelper2 != null) {
            highLowAnimationHelper2.startShowBetcoinsAnimation();
        }
    }

    private final void restoreViews() {
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.higherLower.ui.HigherLowerGameFragment$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                HigherLowerGameFragment.restoreViews$lambda$6(HigherLowerGameFragment.this);
            }
        }, 800L);
        getBinding().topDigitalNumber.setNumber(0);
        getBinding().bottomDigitalNumber.setNumber(0);
        this.sessionId = null;
        List<? extends AlphaPressButton> list = this.coefButtons;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((AlphaPressButton) it.next()).setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void restoreViews$lambda$6(HigherLowerGameFragment higherLowerGameFragment) {
        if (higherLowerGameFragment.isActive()) {
            higherLowerGameFragment.getBinding().containerHighLowerResult.resultContainer.gameResultTitle.setText("");
            higherLowerGameFragment.getBinding().containerHighLowerResult.resultContainer.betcoins.setText("");
        }
    }

    @Override // org.betup.games.StubListener
    public void setUpStub(boolean isVisible) {
        if (getBinding().clickedStub == null || !isActive()) {
            return;
        }
        if (isVisible) {
            getBinding().clickedStub.setVisibility(0);
        } else {
            getBinding().clickedStub.setVisibility(8);
        }
    }

    private final void initSelectBetButtonContainerListner() {
        getBinding().buttonHigher.setOnClickListener(this.betTypeListener);
        getBinding().buttonHigher.setTag(HighLowBetType.HIGHER);
        getBinding().buttonLower.setOnClickListener(this.betTypeListener);
        getBinding().buttonLower.setTag(HighLowBetType.LOWER);
        getBinding().buttonEqual.setOnClickListener(this.betTypeListener);
        getBinding().buttonEqual.setTag(HighLowBetType.EQUAL);
        getBinding().buttonEven.setOnClickListener(this.betTypeListener);
        getBinding().buttonEven.setTag(HighLowBetType.EVEN);
        getBinding().buttonOdd.setOnClickListener(this.betTypeListener);
        getBinding().buttonOdd.setTag(HighLowBetType.ODD);
        this.coefButtons = CollectionsKt.arrayListOf(getBinding().buttonHigher, getBinding().buttonLower, getBinding().buttonEqual, getBinding().buttonEven, getBinding().buttonOdd);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void betTypeListener$lambda$8(HigherLowerGameFragment higherLowerGameFragment, View view) {
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type org.betup.games.higherLower.model.rest.HighLowBetType");
        HighLowBetType highLowBetType = (HighLowBetType) tag;
        Bundle bundle = new Bundle();
        higherLowerGameFragment.validateAlphaForCoef(highLowBetType);
        bundle.putSerializable("betType", highLowBetType);
        if (higherLowerGameFragment.sessionId != null) {
            higherLowerGameFragment.getBinding().topDigitalNumber.setDelay(10000L);
            higherLowerGameFragment.getBinding().topDigitalNumber.setFlickering(true);
            HighLowAnimationHelper highLowAnimationHelper = higherLowerGameFragment.highLowAninationHelper;
            if (highLowAnimationHelper != null) {
                highLowAnimationHelper.setAnimatedNow(true);
            }
            higherLowerGameFragment.getContinueGameInteractor().load(higherLowerGameFragment.continueGameListener, higherLowerGameFragment.sessionId, bundle);
        }
    }

    private final void validateAlphaForCoef(HighLowBetType tag) {
        List<? extends AlphaPressButton> list = this.coefButtons;
        if (list != null) {
            for (AlphaPressButton alphaPressButton : list) {
                Object tag2 = alphaPressButton.getTag();
                Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type org.betup.games.higherLower.model.rest.HighLowBetType");
                if (((HighLowBetType) tag2) == tag) {
                    alphaPressButton.setAlpha(1.0f);
                } else {
                    alphaPressButton.setAlpha(0.15f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void continueGameListener$lambda$11(HigherLowerGameFragment higherLowerGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (higherLowerGameFragment.isActive()) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
                higherLowerGameFragment.restoreViews();
                return;
            }
            if (fetchedResponseMessage.getStat() == FetchStat.NO_CONNECTION) {
                higherLowerGameFragment.getBinding().topDigitalNumber.setFlickering(false);
                return;
            }
            if (((HigherLowerGameResultModel) fetchedResponseMessage.getModel()).getGamesErrorCodeModel() != null) {
                higherLowerGameFragment.processError(((HigherLowerGameResultModel) fetchedResponseMessage.getModel()).getGamesErrorCodeModel());
                higherLowerGameFragment.restoreViews();
                return;
            }
            HigherLowerGameResultModel higherLowerGameResultModel = (HigherLowerGameResultModel) fetchedResponseMessage.getModel();
            if (higherLowerGameResultModel.getResult() == GameResult.WON) {
                higherLowerGameFragment.getBinding().containerHighLowerResult.resultContainer.wonMoneyAmountContainer.setBackground(ContextCompat.getDrawable(higherLowerGameFragment.requireContext(), R.drawable.high_low_game_won_background));
                higherLowerGameFragment.getBinding().containerHighLowerResult.resultContainer.betcoins.setTextColor(ContextCompat.getColor(higherLowerGameFragment.requireContext(), R.color.colorAccent));
                higherLowerGameFragment.getBinding().containerHighLowerResult.resultContainer.gameResultTitle.setText(higherLowerGameFragment.getString(R.string.you_win));
            } else if (higherLowerGameResultModel.getResult() == GameResult.LOST) {
                higherLowerGameFragment.getBinding().containerHighLowerResult.resultContainer.wonMoneyAmountContainer.setBackground(ContextCompat.getDrawable(higherLowerGameFragment.requireContext(), R.drawable.fragment_dice_main_background));
                higherLowerGameFragment.getBinding().containerHighLowerResult.resultContainer.betcoins.setTextColor(ContextCompat.getColor(higherLowerGameFragment.requireContext(), R.color.button_red));
                higherLowerGameFragment.getBinding().containerHighLowerResult.resultContainer.gameResultTitle.setText(higherLowerGameFragment.getString(R.string.you_lost));
            }
            higherLowerGameFragment.getBinding().containerHighLowerResult.resultContainer.betcoins.setText(String.valueOf(higherLowerGameResultModel.getReturnAmount()));
            higherLowerGameFragment.getBinding().topDigitalNumber.setNumber(higherLowerGameResultModel.getSecondNumber());
            HighLowAnimationHelper highLowAnimationHelper = higherLowerGameFragment.highLowAninationHelper;
            if (highLowAnimationHelper != null) {
                highLowAnimationHelper.startHideBetTypeAnimation();
            }
            HighLowAnimationHelper highLowAnimationHelper2 = higherLowerGameFragment.highLowAninationHelper;
            if (highLowAnimationHelper2 != null) {
                highLowAnimationHelper2.startShowResultAnimation(higherLowerGameResultModel.getResult());
            }
            higherLowerGameFragment.onGamePlayed(((HigherLowerGameResultModel) fetchedResponseMessage.getModel()).getResult() == GameResult.WON);
            higherLowerGameFragment.scheduleOptimisticBalanceAfterRoundResult(((HigherLowerGameResultModel) fetchedResponseMessage.getModel()).getBetAmount(), ((HigherLowerGameResultModel) fetchedResponseMessage.getModel()).getResult() == GameResult.WON, ((HigherLowerGameResultModel) fetchedResponseMessage.getModel()).getResult() == GameResult.WON ? ((HigherLowerGameResultModel) fetchedResponseMessage.getModel()).getReturnAmount() : 0L);
        }
    }

    private final void initAnimations() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ConstraintLayout root = getBinding().betContainer.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ConstraintLayout selectBetTypeContainer = getBinding().selectBetTypeContainer;
        Intrinsics.checkNotNullExpressionValue(selectBetTypeContainer, "selectBetTypeContainer");
        ConstraintLayout root2 = getBinding().containerHighLowerResult.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        HighLowAnimationHelper highLowAnimationHelper = new HighLowAnimationHelper(requireContext, root, selectBetTypeContainer, root2);
        this.highLowAninationHelper = highLowAnimationHelper;
        highLowAnimationHelper.setStubListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startGameListener$lambda$14(final HigherLowerGameFragment higherLowerGameFragment, final FetchedResponseMessage fetchedResponseMessage) {
        if (higherLowerGameFragment.isActive()) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
                higherLowerGameFragment.restoreViews();
                return;
            }
            if (fetchedResponseMessage.getStat() == FetchStat.NO_CONNECTION) {
                higherLowerGameFragment.getBinding().bottomDigitalNumber.setFlickering(false);
                return;
            }
            if (((StartHigherLowerGameModel) fetchedResponseMessage.getModel()).getGamesErrorCodeModel() != null) {
                higherLowerGameFragment.processError(((StartHigherLowerGameModel) fetchedResponseMessage.getModel()).getGamesErrorCodeModel());
                higherLowerGameFragment.restoreViews();
                return;
            }
            higherLowerGameFragment.sessionId = ((StartHigherLowerGameModel) fetchedResponseMessage.getModel()).getSessionId();
            Map<HighLowBetType, Double> highLowBetTypeList = ((StartHigherLowerGameModel) fetchedResponseMessage.getModel()).getHighLowBetTypeList();
            TextView textView = higherLowerGameFragment.getBinding().textButtonHigher;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.getDefault();
            String string = higherLowerGameFragment.getString(R.string.high_with_coef);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String format = String.format(locale, string, Arrays.copyOf(new Object[]{highLowBetTypeList.get(HighLowBetType.HIGHER)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(format);
            TextView textView2 = higherLowerGameFragment.getBinding().textButtonLower;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Locale locale2 = Locale.getDefault();
            String string2 = higherLowerGameFragment.getString(R.string.lower_with_coef);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String format2 = String.format(locale2, string2, Arrays.copyOf(new Object[]{highLowBetTypeList.get(HighLowBetType.LOWER)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            textView2.setText(format2);
            TextView textView3 = higherLowerGameFragment.getBinding().textButtonEqual;
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            Locale locale3 = Locale.getDefault();
            String string3 = higherLowerGameFragment.getString(R.string.equal_with_coef);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String format3 = String.format(locale3, string3, Arrays.copyOf(new Object[]{highLowBetTypeList.get(HighLowBetType.EQUAL)}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            textView3.setText(format3);
            TextView textView4 = higherLowerGameFragment.getBinding().textButtonEven;
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            Locale locale4 = Locale.getDefault();
            String string4 = higherLowerGameFragment.getString(R.string.even_with_coef);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String format4 = String.format(locale4, string4, Arrays.copyOf(new Object[]{highLowBetTypeList.get(HighLowBetType.EVEN)}, 1));
            Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
            textView4.setText(format4);
            TextView textView5 = higherLowerGameFragment.getBinding().textButtonOdd;
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            Locale locale5 = Locale.getDefault();
            String string5 = higherLowerGameFragment.getString(R.string.odd_with_coef);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String format5 = String.format(locale5, string5, Arrays.copyOf(new Object[]{highLowBetTypeList.get(HighLowBetType.ODD)}, 1));
            Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
            textView5.setText(format5);
            new Handler().postDelayed(new Runnable() { // from class: org.betup.games.higherLower.ui.HigherLowerGameFragment$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    HigherLowerGameFragment.startGameListener$lambda$14$lambda$13(HigherLowerGameFragment.this, fetchedResponseMessage);
                }
            }, 800L);
            HighLowAnimationHelper highLowAnimationHelper = higherLowerGameFragment.highLowAninationHelper;
            if (highLowAnimationHelper != null) {
                highLowAnimationHelper.startShowBetTypeAnimation();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startGameListener$lambda$14$lambda$13(HigherLowerGameFragment higherLowerGameFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (!higherLowerGameFragment.isActive() || higherLowerGameFragment.getBinding().bottomDigitalNumber == null) {
            return;
        }
        higherLowerGameFragment.getBinding().bottomDigitalNumber.setNumber(((StartHigherLowerGameModel) fetchedResponseMessage.getModel()).getFirstNumber());
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        HighLowAnimationHelper highLowAnimationHelper = this.highLowAninationHelper;
        boolean isAnimatedNow = highLowAnimationHelper != null ? highLowAnimationHelper.getIsAnimatedNow() : true;
        if (this.highLowAninationHelper != null && isAnimatedNow) {
            return false;
        }
        if (getBinding().selectBetTypeContainer != null && getBinding().selectBetTypeContainer.getVisibility() == 0) {
            HighLowAnimationHelper highLowAnimationHelper2 = this.highLowAninationHelper;
            if (highLowAnimationHelper2 != null) {
                highLowAnimationHelper2.startHideBetTypeAnimation();
            }
        } else {
            if (getBinding().containerHighLowerResult == null || getBinding().containerHighLowerResult.getRoot().getVisibility() != 0) {
                return true;
            }
            HighLowAnimationHelper highLowAnimationHelper3 = this.highLowAninationHelper;
            if (highLowAnimationHelper3 != null) {
                highLowAnimationHelper3.startHideResultAnimation();
            }
        }
        HighLowAnimationHelper highLowAnimationHelper4 = this.highLowAninationHelper;
        if (highLowAnimationHelper4 != null) {
            highLowAnimationHelper4.startShowBetcoinsAnimation();
        }
        restoreViews();
        return false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processChangeInetState(InetStateMessage inetStateMessage) {
        Intrinsics.checkNotNullParameter(inetStateMessage, "inetStateMessage");
        if (!inetStateMessage.isConnected() && isVisible()) {
            getBinding().clickedStub.setVisibility(0);
        } else {
            getBinding().clickedStub.setVisibility(8);
        }
    }

    /* compiled from: HigherLowerGameFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/games/higherLower/ui/HigherLowerGameFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/games/higherLower/ui/HigherLowerGameFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HigherLowerGameFragment newInstance() {
            return new HigherLowerGameFragment();
        }
    }
}

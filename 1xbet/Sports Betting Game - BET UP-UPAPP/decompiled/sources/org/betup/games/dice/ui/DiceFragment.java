package org.betup.games.dice.ui;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.databinding.FragmentDiceBinding;
import org.betup.games.BaseGameFragmentWithVideoRewards;
import org.betup.games.dice.model.interactor.GetDiceGameConfigInteractor;
import org.betup.games.dice.model.interactor.SendDiceGameResultInteractor;
import org.betup.games.dice.model.rest.DiceBetType;
import org.betup.games.dice.model.rest.DiceGameConfigModel;
import org.betup.games.dice.model.rest.DiceGameRecordModel;
import org.betup.games.dice.model.rest.GameResult;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.views.BetUpLabelView;
import org.betup.utils.TextUtilClassKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: DiceFragment.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 F2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001FB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\"\u001a\u00020\u001dH\u0014J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0014J\u0012\u0010(\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\u001e\u00104\u001a\u00020\u00042\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020'H\u0014J\b\u00108\u001a\u00020\u0004H\u0002J\b\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020%H\u0016J\b\u0010;\u001a\u00020\u0004H\u0002J\b\u0010<\u001a\u00020\u0004H\u0002J\b\u0010=\u001a\u00020\u0004H\u0002J\u0010\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020%H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00040\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lorg/betup/games/dice/ui/DiceFragment;", "Lorg/betup/games/BaseGameFragmentWithVideoRewards;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/games/dice/model/rest/DiceGameConfigModel;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "_binding", "Lorg/betup/databinding/FragmentDiceBinding;", "binding", "getBinding", "()Lorg/betup/databinding/FragmentDiceBinding;", "diceAnimationHelper", "Lorg/betup/games/dice/ui/DiceAnimationHelper;", "handler", "Landroid/os/Handler;", "getDiceGameConfigInteractor", "Lorg/betup/games/dice/model/interactor/GetDiceGameConfigInteractor;", "getGetDiceGameConfigInteractor", "()Lorg/betup/games/dice/model/interactor/GetDiceGameConfigInteractor;", "setGetDiceGameConfigInteractor", "(Lorg/betup/games/dice/model/interactor/GetDiceGameConfigInteractor;)V", "sendDiceGameResultInteractor", "Lorg/betup/games/dice/model/interactor/SendDiceGameResultInteractor;", "getSendDiceGameResultInteractor", "()Lorg/betup/games/dice/model/interactor/SendDiceGameResultInteractor;", "setSendDiceGameResultInteractor", "(Lorg/betup/games/dice/model/interactor/SendDiceGameResultInteractor;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "getVideoRewardServiceInstance", "updateOfferState", "isAvailable", "", "amount", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onDestroyView", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "getAmount", "placeBet", "checkPlacedBet", "onBackPressed", "restoreState", "initFragment", "initCoefsButtonsListeners", "betButtonClickListener", "Landroid/view/View$OnClickListener;", "sendInteractorResult", "Lorg/betup/games/dice/model/rest/DiceGameRecordModel;", "startDialogAnimation", "Ljava/lang/Runnable;", "bottomGroupChangeState", "isAcceptable", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiceFragment extends BaseGameFragmentWithVideoRewards implements BaseCachedSharedInteractor.OnFetchedListener<DiceGameConfigModel, Unit> {
    private FragmentDiceBinding _binding;
    private DiceAnimationHelper diceAnimationHelper;

    @Inject
    public GetDiceGameConfigInteractor getDiceGameConfigInteractor;

    @Inject
    public SendDiceGameResultInteractor sendDiceGameResultInteractor;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final Handler handler = new Handler();
    private final View.OnClickListener betButtonClickListener = new View.OnClickListener() { // from class: org.betup.games.dice.ui.DiceFragment$$ExternalSyntheticLambda3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DiceFragment.betButtonClickListener$lambda$4(DiceFragment.this, view);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<DiceGameRecordModel, Unit> sendInteractorResult = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.games.dice.ui.DiceFragment$$ExternalSyntheticLambda4
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            DiceFragment.sendInteractorResult$lambda$7(DiceFragment.this, fetchedResponseMessage);
        }
    };
    private final Runnable startDialogAnimation = new Runnable() { // from class: org.betup.games.dice.ui.DiceFragment$$ExternalSyntheticLambda5
        @Override // java.lang.Runnable
        public final void run() {
            DiceFragment.startDialogAnimation$lambda$8(DiceFragment.this);
        }
    };

    /* compiled from: DiceFragment.kt */
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

    private final FragmentDiceBinding getBinding() {
        FragmentDiceBinding fragmentDiceBinding = this._binding;
        Intrinsics.checkNotNull(fragmentDiceBinding);
        return fragmentDiceBinding;
    }

    public final GetDiceGameConfigInteractor getGetDiceGameConfigInteractor() {
        GetDiceGameConfigInteractor getDiceGameConfigInteractor = this.getDiceGameConfigInteractor;
        if (getDiceGameConfigInteractor != null) {
            return getDiceGameConfigInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getDiceGameConfigInteractor");
        return null;
    }

    public final void setGetDiceGameConfigInteractor(GetDiceGameConfigInteractor getDiceGameConfigInteractor) {
        Intrinsics.checkNotNullParameter(getDiceGameConfigInteractor, "<set-?>");
        this.getDiceGameConfigInteractor = getDiceGameConfigInteractor;
    }

    public final SendDiceGameResultInteractor getSendDiceGameResultInteractor() {
        SendDiceGameResultInteractor sendDiceGameResultInteractor = this.sendDiceGameResultInteractor;
        if (sendDiceGameResultInteractor != null) {
            return sendDiceGameResultInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sendDiceGameResultInteractor");
        return null;
    }

    public final void setSendDiceGameResultInteractor(SendDiceGameResultInteractor sendDiceGameResultInteractor) {
        Intrinsics.checkNotNullParameter(sendDiceGameResultInteractor, "<set-?>");
        this.sendDiceGameResultInteractor = sendDiceGameResultInteractor;
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
        getBinding().wonContainer.videoOffer.setVisibility(isAvailable ? 0 : 8);
        TextView textView = getBinding().wonContainer.videoRewardAmount;
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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentDiceBinding.inflate(inflater, container, false);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().diceContainerButtons.makeBet.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.dice.ui.DiceFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DiceFragment.onViewCreated$lambda$0(DiceFragment.this, view2);
            }
        });
        bottomGroupChangeState(false);
        getBinding().okButton.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.dice.ui.DiceFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DiceFragment.this.restoreState();
            }
        });
        getBinding().wonContainer.videoOffer.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.dice.ui.DiceFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DiceFragment.this.onVideoRewardClicked();
            }
        });
        getGetDiceGameConfigInteractor().load(this, Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(DiceFragment diceFragment, View view) {
        if (diceFragment.isActive()) {
            diceFragment.placeBet();
        }
    }

    @Override // org.betup.games.BaseGameFragmentWithVideoRewards, org.betup.games.BaseGameFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        MediaPlayer fallingOnTableMediaPlayer;
        MediaPlayer diceShakeMediaPlayer;
        super.onDestroyView();
        this.handler.removeCallbacks(this.startDialogAnimation);
        DiceAnimationHelper diceAnimationHelper = this.diceAnimationHelper;
        if (diceAnimationHelper != null) {
            diceAnimationHelper.dispose();
        }
        DiceAnimationHelper diceAnimationHelper2 = this.diceAnimationHelper;
        if (diceAnimationHelper2 != null && (diceShakeMediaPlayer = diceAnimationHelper2.getDiceShakeMediaPlayer()) != null) {
            diceShakeMediaPlayer.stop();
        }
        DiceAnimationHelper diceAnimationHelper3 = this.diceAnimationHelper;
        if (diceAnimationHelper3 == null || (fallingOnTableMediaPlayer = diceAnimationHelper3.getFallingOnTableMediaPlayer()) == null) {
            return;
        }
        fallingOnTableMediaPlayer.stop();
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<DiceGameConfigModel, Unit> responseMessage) {
        if ((responseMessage != null ? responseMessage.getStat() : null) != FetchStat.SUCCESS || !isActive()) {
            if ((responseMessage != null ? responseMessage.getStat() : null) == FetchStat.NO_CONNECTION) {
                bottomGroupChangeState(true);
                getBinding().progressBar.setVisibility(8);
                return;
            }
            return;
        }
        initFragment();
        getBinding().diceContainerButtons.editBetAmount.setText(String.valueOf((int) responseMessage.getModel().getMinBetAmount()));
        getBinding().coefEquals.setText(String.valueOf(responseMessage.getModel().getEqualCoef()));
        getBinding().coefLess.setText(String.valueOf(responseMessage.getModel().getLessCoef()));
        getBinding().coefMore.setText(String.valueOf(responseMessage.getModel().getGreaterCoef()));
        setMaxCoef((int) responseMessage.getModel().getMaxBetAmount());
        setMinCoef((int) responseMessage.getModel().getMinBetAmount());
        bottomGroupChangeState(true);
        getBinding().progress.setVisibility(8);
    }

    @Override // org.betup.games.BaseGameFragment
    protected long getAmount() {
        Editable text = getBinding().diceContainerButtons.editBetAmount.getText();
        if (text == null || text.length() == 0) {
            return getMinCoef();
        }
        EditText editBetAmount = getBinding().diceContainerButtons.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
        return TextUtilClassKt.editTextToLong(editBetAmount);
    }

    private final void placeBet() {
        DiceBetType diceBetType;
        MediaPlayer diceShakeMediaPlayer;
        getBinding().progressBar.setVisibility(0);
        if (!checkPlacedBet()) {
            getBinding().progressBar.setVisibility(8);
            return;
        }
        DiceAnimationHelper diceAnimationHelper = this.diceAnimationHelper;
        if (diceAnimationHelper != null && (diceShakeMediaPlayer = diceAnimationHelper.getDiceShakeMediaPlayer()) != null) {
            diceShakeMediaPlayer.start();
        }
        bottomGroupChangeState(false);
        getBinding().progress.setVisibility(0);
        Bundle bundle = new Bundle();
        EditText editBetAmount = getBinding().diceContainerButtons.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
        bundle.putDouble("betAmount", TextUtilClassKt.editTextToDouble(editBetAmount));
        int id = getBinding().diceResultSelectRadioGroup.getChildAt(getBinding().diceResultSelectRadioGroup.getCheckedIndex()).getId();
        if (id == R.id.buttonEqual) {
            diceBetType = DiceBetType.EQUAL;
        } else if (id == R.id.buttonMore) {
            diceBetType = DiceBetType.GREATER;
        } else {
            diceBetType = DiceBetType.LESS;
        }
        bundle.putString("diceGameBetType", diceBetType.name());
        getSendDiceGameResultInteractor().load(this.sendInteractorResult, null, bundle);
    }

    private final boolean checkPlacedBet() {
        Editable text = getBinding().diceContainerButtons.editBetAmount.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            makeToast(R.string.select_your_bet_to_accept_competition);
            return false;
        }
        if (Long.parseLong(getBinding().diceContainerButtons.editBetAmount.getText().toString()) > getUserServiceAccessor().getUserService().getShortProfile().getUserProgressModel().getMoneyBalance()) {
            showShopDialog();
            return false;
        }
        if (Long.parseLong(getBinding().diceContainerButtons.editBetAmount.getText().toString()) > getMaxCoef()) {
            String string = getString(R.string.bet_grather_then_expected, Integer.valueOf(getMaxCoef()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            makeToast(string);
            return false;
        }
        if (Long.parseLong(getBinding().diceContainerButtons.editBetAmount.getText().toString()) >= getMinCoef()) {
            return true;
        }
        String string2 = getString(R.string.bet_smaller_then_expected, Integer.valueOf(getMinCoef()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        makeToast(string2);
        return false;
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        if (getBinding().containerDialogResult.getVisibility() != 0) {
            return true;
        }
        restoreState();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreState() {
        increaseClickCountOrShowInterstitial();
        DiceAnimationHelper diceAnimationHelper = this.diceAnimationHelper;
        if (diceAnimationHelper != null) {
            diceAnimationHelper.restoreViewsStates();
        }
        bottomGroupChangeState(true);
        getBinding().containerDialogResult.setVisibility(8);
        getBinding().firstDice.setVisibility(4);
        getBinding().secondDice.setVisibility(4);
    }

    private final void initFragment() {
        DiceAnimationHelper diceAnimationHelper;
        MediaPlayer diceShakeMediaPlayer;
        Context baseContext;
        FragmentActivity activity = getActivity();
        if (activity == null || (baseContext = activity.getBaseContext()) == null) {
            diceAnimationHelper = null;
        } else {
            View firstDice = getBinding().firstDice;
            Intrinsics.checkNotNullExpressionValue(firstDice, "firstDice");
            View secondDice = getBinding().secondDice;
            Intrinsics.checkNotNullExpressionValue(secondDice, "secondDice");
            LinearLayout containerDialogResult = getBinding().containerDialogResult;
            Intrinsics.checkNotNullExpressionValue(containerDialogResult, "containerDialogResult");
            BetUpLabelView labelView = getBinding().labelView;
            Intrinsics.checkNotNullExpressionValue(labelView, "labelView");
            diceAnimationHelper = new DiceAnimationHelper(baseContext, firstDice, secondDice, containerDialogResult, labelView);
        }
        this.diceAnimationHelper = diceAnimationHelper;
        if (diceAnimationHelper != null && (diceShakeMediaPlayer = diceAnimationHelper.getDiceShakeMediaPlayer()) != null) {
            diceShakeMediaPlayer.setLooping(true);
        }
        initCoefsButtonsListeners();
    }

    private final void initCoefsButtonsListeners() {
        getBinding().diceContainerButtons.buttonMin.setOnClickListener(this.betButtonClickListener);
        getBinding().diceContainerButtons.buttonDouble.setOnClickListener(this.betButtonClickListener);
        getBinding().diceContainerButtons.buttonHalf.setOnClickListener(this.betButtonClickListener);
        getBinding().diceContainerButtons.buttonMax.setOnClickListener(this.betButtonClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void betButtonClickListener$lambda$4(DiceFragment diceFragment, View view) {
        Editable text = diceFragment.getBinding().diceContainerButtons.editBetAmount.getText();
        if (text == null || text.length() == 0) {
            diceFragment.makeToast(R.string.select_your_bet);
            return;
        }
        EditText editBetAmount = diceFragment.getBinding().diceContainerButtons.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount, "editBetAmount");
        int editTextToInt = TextUtilClassKt.editTextToInt(editBetAmount);
        EditText editBetAmount2 = diceFragment.getBinding().diceContainerButtons.editBetAmount;
        Intrinsics.checkNotNullExpressionValue(editBetAmount2, "editBetAmount");
        if (TextUtilClassKt.editTextToLong(editBetAmount2) > diceFragment.getMaxCoef()) {
            diceFragment.makeToast(R.string.bet_grather_then_expected);
        }
        switch (view.getId()) {
            case R.id.buttonDouble /* 2131362132 */:
                if (editTextToInt > diceFragment.getMaxCoef() / 2) {
                    String string = diceFragment.getString(R.string.cant_double_your_bet);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    diceFragment.makeToast(string);
                    break;
                } else {
                    EditText editText = diceFragment.getBinding().diceContainerButtons.editBetAmount;
                    EditText editBetAmount3 = diceFragment.getBinding().diceContainerButtons.editBetAmount;
                    Intrinsics.checkNotNullExpressionValue(editBetAmount3, "editBetAmount");
                    editText.setText(String.valueOf(TextUtilClassKt.editTextToInt(editBetAmount3) * 2));
                    break;
                }
            case R.id.buttonHalf /* 2131362137 */:
                if (editTextToInt / 2 < diceFragment.getMinCoef()) {
                    diceFragment.makeToast(R.string.cant_divide_your_bet);
                    break;
                } else {
                    EditText editText2 = diceFragment.getBinding().diceContainerButtons.editBetAmount;
                    EditText editBetAmount4 = diceFragment.getBinding().diceContainerButtons.editBetAmount;
                    Intrinsics.checkNotNullExpressionValue(editBetAmount4, "editBetAmount");
                    editText2.setText(String.valueOf(TextUtilClassKt.editTextToInt(editBetAmount4) / 2));
                    break;
                }
            case R.id.buttonMax /* 2131362142 */:
                diceFragment.getBinding().diceContainerButtons.editBetAmount.setText(String.valueOf(diceFragment.getMaxCoef()));
                break;
            case R.id.buttonMin /* 2131362143 */:
                diceFragment.getBinding().diceContainerButtons.editBetAmount.setText(String.valueOf(diceFragment.getMinCoef()));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInteractorResult$lambda$7(DiceFragment diceFragment, FetchedResponseMessage fetchedResponseMessage) {
        DiceGameRecordModel diceGameRecordModel;
        MediaPlayer diceShakeMediaPlayer;
        MediaPlayer fallingOnTableMediaPlayer;
        MediaPlayer diceShakeMediaPlayer2;
        if (diceFragment.isActive()) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || ((DiceGameRecordModel) fetchedResponseMessage.getModel()).getGamesErrorCodeModel() != null) {
                if (fetchedResponseMessage.getStat() == FetchStat.NO_CONNECTION) {
                    diceFragment.bottomGroupChangeState(true);
                    diceFragment.getBinding().progressBar.setVisibility(8);
                    return;
                }
                DiceAnimationHelper diceAnimationHelper = diceFragment.diceAnimationHelper;
                if (diceAnimationHelper != null && (diceShakeMediaPlayer = diceAnimationHelper.getDiceShakeMediaPlayer()) != null) {
                    diceShakeMediaPlayer.stop();
                }
                diceFragment.processError((fetchedResponseMessage == null || (diceGameRecordModel = (DiceGameRecordModel) fetchedResponseMessage.getModel()) == null) ? null : diceGameRecordModel.getGamesErrorCodeModel());
                diceFragment.bottomGroupChangeState(true);
                diceFragment.getBinding().progressBar.setVisibility(8);
                return;
            }
            FragmentActivity activity = diceFragment.getActivity();
            if (activity != null) {
                DiceGameRecordModel diceGameRecordModel2 = (DiceGameRecordModel) fetchedResponseMessage.getModel();
                DiceAnimationHelper diceAnimationHelper2 = diceFragment.diceAnimationHelper;
                if (diceAnimationHelper2 != null) {
                    diceAnimationHelper2.starAnimation(diceGameRecordModel2.getFirstDice(), diceGameRecordModel2.getSecondDice(), diceGameRecordModel2.getResult());
                }
                DiceGameRecordModel diceGameRecordModel3 = (DiceGameRecordModel) fetchedResponseMessage.getModel();
                diceFragment.getBinding().resultScore.setText(diceFragment.getString(R.string.your_score, Integer.valueOf(diceGameRecordModel3.getFirstDice() + diceGameRecordModel3.getSecondDice())));
                int i = WhenMappings.$EnumSwitchMapping$0[((DiceGameRecordModel) fetchedResponseMessage.getModel()).getResult().ordinal()];
                if (i == 1) {
                    diceFragment.getBinding().wonContainer.gameResultTitle.setText(diceFragment.getString(R.string.you_win));
                    FragmentActivity fragmentActivity = activity;
                    diceFragment.getBinding().containerDialogResult.setBackground(ContextCompat.getDrawable(fragmentActivity, R.drawable.game_result_won_background));
                    diceFragment.getBinding().wonContainer.betcoins.setTextColor(ContextCompat.getColor(fragmentActivity, R.color.colorAccent));
                    diceFragment.getBinding().wonContainer.betcoins.setText(String.valueOf(diceGameRecordModel3.getReturnAmount()));
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    diceFragment.getBinding().wonContainer.gameResultTitle.setText(diceFragment.getString(R.string.you_lost));
                    FragmentActivity fragmentActivity2 = activity;
                    diceFragment.getBinding().containerDialogResult.setBackground(ContextCompat.getDrawable(fragmentActivity2, R.drawable.fragment_dice_main_background));
                    diceFragment.getBinding().wonContainer.betcoins.setTextColor(ContextCompat.getColor(fragmentActivity2, R.color.button_red));
                    diceFragment.getBinding().wonContainer.betcoins.setText(String.valueOf(diceGameRecordModel3.getBetAmount()));
                }
                DiceAnimationHelper diceAnimationHelper3 = diceFragment.diceAnimationHelper;
                if (diceAnimationHelper3 != null && (diceShakeMediaPlayer2 = diceAnimationHelper3.getDiceShakeMediaPlayer()) != null) {
                    diceShakeMediaPlayer2.pause();
                }
                DiceAnimationHelper diceAnimationHelper4 = diceFragment.diceAnimationHelper;
                if (diceAnimationHelper4 != null && (fallingOnTableMediaPlayer = diceAnimationHelper4.getFallingOnTableMediaPlayer()) != null) {
                    fallingOnTableMediaPlayer.start();
                }
                diceFragment.handler.postDelayed(diceFragment.startDialogAnimation, 800L);
                diceFragment.scheduleOptimisticBalanceAfterRoundResult(diceGameRecordModel3.getBetAmount(), diceGameRecordModel3.getResult() == GameResult.WON, diceGameRecordModel3.getResult() == GameResult.WON ? diceGameRecordModel3.getReturnAmount() : 0L);
                diceFragment.onGamePlayed(((DiceGameRecordModel) fetchedResponseMessage.getModel()).getResult() == GameResult.WON);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDialogAnimation$lambda$8(DiceFragment diceFragment) {
        if (diceFragment.isActive()) {
            DiceAnimationHelper diceAnimationHelper = diceFragment.diceAnimationHelper;
            if (diceAnimationHelper != null) {
                diceAnimationHelper.startDialogAnimation();
            }
            diceFragment.bottomGroupChangeState(false);
            diceFragment.getBinding().containerDialogResult.setVisibility(0);
            diceFragment.getBinding().progress.setVisibility(8);
        }
    }

    private final void bottomGroupChangeState(boolean isAcceptable) {
        if (isAcceptable) {
            getBinding().bottomHideGroup.setClickable(true);
            getBinding().bottomHideGroup.setVisibility(0);
        } else {
            getBinding().bottomHideGroup.setClickable(false);
            getBinding().bottomHideGroup.setVisibility(4);
        }
    }

    /* compiled from: DiceFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/games/dice/ui/DiceFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/games/dice/ui/DiceFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DiceFragment newInstance() {
            return new DiceFragment();
        }
    }
}

package org.betup.games;

import android.content.Context;
import android.os.Bundle;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.OfferMessage;
import org.betup.games.common.remote.GameErrorCodes;
import org.betup.games.common.remote.GamesErrorCodeModel;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.promo.PromoType;
import org.betup.services.offer.PromoService;
import org.betup.services.user.UserService;
import org.betup.services.user.UserServiceAccessor;
import org.betup.ui.BackPressedController;
import org.betup.ui.dialogs.ShopDialogFragment;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.balance.BalanceHolder;
import org.betup.utils.balance.OptimisticBalanceApplier;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BaseGameFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020!H\u0016J\b\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0004J\b\u0010(\u001a\u00020!H\u0004J \u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020+H\u0004J\u0010\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020+H\u0004J\u0010\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020+H\u0004J\u0010\u00102\u001a\u00020!2\u0006\u0010-\u001a\u00020+H\u0004J\b\u00103\u001a\u00020!H\u0004J\u0010\u00104\u001a\u00020!2\u0006\u0010/\u001a\u00020+H\u0002J\u0010\u00105\u001a\u00020!2\u0006\u00101\u001a\u00020+H\u0002J\b\u00106\u001a\u00020!H\u0004J\u0010\u00107\u001a\u00020!2\u0006\u00108\u001a\u000209H\u0004J\u0010\u00107\u001a\u00020!2\u0006\u0010:\u001a\u00020\fH\u0004J\b\u0010;\u001a\u00020+H$J\u0012\u0010<\u001a\u00020!2\b\u0010=\u001a\u0004\u0018\u00010>H\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lorg/betup/games/BaseGameFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "userServiceAccessor", "Lorg/betup/services/user/UserServiceAccessor;", "getUserServiceAccessor", "()Lorg/betup/services/user/UserServiceAccessor;", "setUserServiceAccessor", "(Lorg/betup/services/user/UserServiceAccessor;)V", "minCoef", "", "getMinCoef", "()I", "setMinCoef", "(I)V", "maxCoef", "getMaxCoef", "setMaxCoef", "isActive", "", "()Z", "okButtonClickTimes", "balanceHolder", "Lorg/betup/utils/balance/BalanceHolder;", "getBalanceHolder", "()Lorg/betup/utils/balance/BalanceHolder;", "setBalanceHolder", "(Lorg/betup/utils/balance/BalanceHolder;)V", "optimisticMiniGameBalanceJob", "Lkotlinx/coroutines/Job;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", X3.i.u0, "onStart", "increaseClickCountOrShowInterstitial", "validateProfile", "scheduleOptimisticBalanceAfterRoundResult", "betAmount", "", "won", "winCreditAmount", "applyOptimisticStakeDeductionOnly", "stake", "refundOptimisticStake", "amount", "scheduleOptimisticWinCreditThenServerRefresh", "scheduleServerBalanceRefreshDelayed", "applyOptimisticStakeDeductionInternal", "applyOptimisticWinCreditInternal", "showShopDialog", "makeToast", "message", "", "stringId", "getAmount", "processError", "gamesErrorCodeModel", "Lorg/betup/games/common/remote/GamesErrorCodeModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseGameFragment extends Fragment implements BackPressedController.BackPressedListener {
    public static final int $stable = 8;

    @Inject
    public BalanceHolder balanceHolder;
    private int okButtonClickTimes;
    private Job optimisticMiniGameBalanceJob;
    private UserServiceAccessor userServiceAccessor = new UserServiceAccessor();
    private int minCoef = 100;
    private int maxCoef = 1000;

    /* compiled from: BaseGameFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GameErrorCodes.values().length];
            try {
                iArr[GameErrorCodes.NOT_ENOUGH_MONEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameErrorCodes.BET_GREATER_THAN_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GameErrorCodes.BET_LESS_THAN_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected abstract long getAmount();

    protected final UserServiceAccessor getUserServiceAccessor() {
        return this.userServiceAccessor;
    }

    protected final void setUserServiceAccessor(UserServiceAccessor userServiceAccessor) {
        Intrinsics.checkNotNullParameter(userServiceAccessor, "<set-?>");
        this.userServiceAccessor = userServiceAccessor;
    }

    protected final int getMinCoef() {
        return this.minCoef;
    }

    protected final void setMinCoef(int i) {
        this.minCoef = i;
    }

    protected final int getMaxCoef() {
        return this.maxCoef;
    }

    protected final void setMaxCoef(int i) {
        this.maxCoef = i;
    }

    protected final boolean isActive() {
        return isAdded() && !isDetached();
    }

    public final BalanceHolder getBalanceHolder() {
        BalanceHolder balanceHolder = this.balanceHolder;
        if (balanceHolder != null) {
            return balanceHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("balanceHolder");
        return null;
    }

    public final void setBalanceHolder(BalanceHolder balanceHolder) {
        Intrinsics.checkNotNullParameter(balanceHolder, "<set-?>");
        this.balanceHolder = balanceHolder;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        Context applicationContext = activity != null ? activity.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this.userServiceAccessor);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Job job = this.optimisticMiniGameBalanceJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.optimisticMiniGameBalanceJob = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KeyEventDispatcher.Component activity = getActivity();
        BackPressedController backPressedController = activity instanceof BackPressedController ? (BackPressedController) activity : null;
        if (backPressedController != null) {
            backPressedController.setOnBackPressedListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        KeyEventDispatcher.Component activity = getActivity();
        BackPressedController backPressedController = activity instanceof BackPressedController ? (BackPressedController) activity : null;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
    }

    protected final void increaseClickCountOrShowInterstitial() {
        int i = this.okButtonClickTimes + 1;
        this.okButtonClickTimes = i;
        if (i == 10 && isActive()) {
            EventBus.getDefault().post(new OfferMessage(PromoType.INTERSTITIAL, PromoService.PromoPlacement.DEFAULT));
            this.okButtonClickTimes = 0;
        }
    }

    protected final void validateProfile() {
        this.userServiceAccessor.getUserService().invalidate(UserService.InfoKind.PROGRESS);
        this.userServiceAccessor.getUserService().syncProfile(UserService.InfoKind.PROGRESS);
    }

    protected final void scheduleOptimisticBalanceAfterRoundResult(long betAmount, boolean won, long winCreditAmount) {
        if (betAmount <= 0) {
            return;
        }
        Job job = this.optimisticMiniGameBalanceJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.optimisticMiniGameBalanceJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BaseGameFragment$scheduleOptimisticBalanceAfterRoundResult$1(this, betAmount, won, winCreditAmount, null), 3, null);
    }

    protected final void applyOptimisticStakeDeductionOnly(long stake) {
        if (stake <= 0) {
            return;
        }
        applyOptimisticStakeDeductionInternal(stake);
    }

    protected final void refundOptimisticStake(long amount) {
        if (amount <= 0) {
            return;
        }
        applyOptimisticWinCreditInternal(amount);
    }

    protected final void scheduleOptimisticWinCreditThenServerRefresh(long winCreditAmount) {
        Job job = this.optimisticMiniGameBalanceJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.optimisticMiniGameBalanceJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BaseGameFragment$scheduleOptimisticWinCreditThenServerRefresh$1(winCreditAmount, this, null), 3, null);
    }

    protected final void scheduleServerBalanceRefreshDelayed() {
        Job job = this.optimisticMiniGameBalanceJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.optimisticMiniGameBalanceJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BaseGameFragment$scheduleServerBalanceRefreshDelayed$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOptimisticStakeDeductionInternal(long stake) {
        OptimisticBalanceApplier optimisticBalanceApplier = OptimisticBalanceApplier.INSTANCE;
        UserService userService = this.userServiceAccessor.getUserService();
        Intrinsics.checkNotNullExpressionValue(userService, "getUserService(...)");
        optimisticBalanceApplier.applyStakeDeduction(userService, getBalanceHolder(), stake);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOptimisticWinCreditInternal(long amount) {
        OptimisticBalanceApplier optimisticBalanceApplier = OptimisticBalanceApplier.INSTANCE;
        UserService userService = this.userServiceAccessor.getUserService();
        Intrinsics.checkNotNullExpressionValue(userService, "getUserService(...)");
        optimisticBalanceApplier.applyWinCredit(userService, getBalanceHolder(), amount);
    }

    protected final void showShopDialog() {
        ShopDialogFragment newInstance = ShopDialogFragment.newInstance(ShopDialogFragment.Tab.PACKS, true, PurchasePlacement.MINI_GAMES);
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        newInstance.show(activity.getSupportFragmentManager(), (String) null);
    }

    protected final void makeToast(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SnackbarHelper.showShort(getContext(), message);
    }

    protected final void makeToast(int stringId) {
        try {
            SnackbarHelper.showShort(requireContext(), stringId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected final void processError(GamesErrorCodeModel gamesErrorCodeModel) {
        GameErrorCodes gameErrorCodes = gamesErrorCodeModel != null ? gamesErrorCodeModel.getGameErrorCodes() : null;
        if ((gameErrorCodes == null ? -1 : WhenMappings.$EnumSwitchMapping$0[gameErrorCodes.ordinal()]) != 1) {
            return;
        }
        makeToast(R.string.select_your_bet_to_accept_competition);
        showShopDialog();
    }
}

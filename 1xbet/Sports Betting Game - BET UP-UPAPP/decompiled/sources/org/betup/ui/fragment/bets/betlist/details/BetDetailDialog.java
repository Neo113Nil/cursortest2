package org.betup.ui.fragment.bets.betlist.details;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.services.offer.BetWonCloseInterstitialHelper;
import org.betup.services.offer.PromoInterstitialRulesSync;
import org.betup.services.offer.PromoService;
import org.betup.ui.MainActivity;
import org.betup.ui.base.SnackbarDialogFragment;
import org.betup.ui.fragment.bets.BetsController;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetDetailDialog.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aJ\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001eJ\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0016J$\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00101\u001a\u00020 H\u0016J\b\u00102\u001a\u00020 H\u0016J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u000205H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lorg/betup/ui/fragment/bets/betlist/details/BetDetailDialog;", "Lorg/betup/ui/base/SnackbarDialogFragment;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "betController", "Lorg/betup/ui/fragment/bets/BetsController;", "getBetController", "()Lorg/betup/ui/fragment/bets/BetsController;", "setBetController", "(Lorg/betup/ui/fragment/bets/BetsController;)V", "promoService", "Lorg/betup/services/offer/PromoService;", "getPromoService", "()Lorg/betup/services/offer/PromoService;", "setPromoService", "(Lorg/betup/services/offer/PromoService;)V", "promoInterstitialRulesSync", "Lorg/betup/services/offer/PromoInterstitialRulesSync;", "getPromoInterstitialRulesSync", "()Lorg/betup/services/offer/PromoInterstitialRulesSync;", "setPromoInterstitialRulesSync", "(Lorg/betup/services/offer/PromoInterstitialRulesSync;)V", "selectedBetId", "", "visibleBetId", "customBetListProvider", "Lkotlin/Function0;", "", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "isViewingOtherUserBets", "", "setCustomBetListProvider", "", IronSourceConstants.EVENTS_PROVIDER, "setIsViewingOtherUserBets", "value", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "onDestroy", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetDetailDialog extends SnackbarDialogFragment {
    public static final int $stable = 8;

    @Inject
    public BetsController betController;
    private Function0<? extends List<? extends BetsListModel>> customBetListProvider;
    private boolean isViewingOtherUserBets;

    @Inject
    public PromoInterstitialRulesSync promoInterstitialRulesSync;

    @Inject
    public PromoService promoService;
    private int selectedBetId;
    private int visibleBetId;

    public final BetsController getBetController() {
        BetsController betsController = this.betController;
        if (betsController != null) {
            return betsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betController");
        return null;
    }

    public final void setBetController(BetsController betsController) {
        Intrinsics.checkNotNullParameter(betsController, "<set-?>");
        this.betController = betsController;
    }

    public final PromoService getPromoService() {
        PromoService promoService = this.promoService;
        if (promoService != null) {
            return promoService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("promoService");
        return null;
    }

    public final void setPromoService(PromoService promoService) {
        Intrinsics.checkNotNullParameter(promoService, "<set-?>");
        this.promoService = promoService;
    }

    public final PromoInterstitialRulesSync getPromoInterstitialRulesSync() {
        PromoInterstitialRulesSync promoInterstitialRulesSync = this.promoInterstitialRulesSync;
        if (promoInterstitialRulesSync != null) {
            return promoInterstitialRulesSync;
        }
        Intrinsics.throwUninitializedPropertyAccessException("promoInterstitialRulesSync");
        return null;
    }

    public final void setPromoInterstitialRulesSync(PromoInterstitialRulesSync promoInterstitialRulesSync) {
        Intrinsics.checkNotNullParameter(promoInterstitialRulesSync, "<set-?>");
        this.promoInterstitialRulesSync = promoInterstitialRulesSync;
    }

    public final void setCustomBetListProvider(Function0<? extends List<? extends BetsListModel>> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.customBetListProvider = provider;
    }

    public final void setIsViewingOtherUserBets(boolean value) {
        this.isViewingOtherUserBets = value;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("betId") : 1;
        this.selectedBetId = i;
        this.visibleBetId = i;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2120941427, true, new BetDetailDialog$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BetsController betController = getBetController();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        Function0 function0 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetDetailDialog$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onViewCreated$lambda$1;
                onViewCreated$lambda$1 = BetDetailDialog.onViewCreated$lambda$1(BetDetailDialog.this);
                return onViewCreated$lambda$1;
            }
        };
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        BetsController.bind$default(betController, (MainActivity) requireActivity, function0, requireContext, null, 8, null);
        if (this.isViewingOtherUserBets) {
            return;
        }
        getBetController().resetBetWonCloseInterstitialState();
        getPromoInterstitialRulesSync().refreshWhenIdle("bet-details", 10000L);
        getBetController().checkVideoRewardForBet(this.selectedBetId);
        getBetController().fetchCancelSellInfo(this.selectedBetId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(BetDetailDialog betDetailDialog) {
        betDetailDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.base.SnackbarDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.5f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getBetController().stopPeriodicVideoRewardCheck();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        List<BetsListModel> value;
        Object obj;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getBetController().stopPeriodicVideoRewardCheck();
        if (this.isViewingOtherUserBets) {
            return;
        }
        Function0<? extends List<? extends BetsListModel>> function0 = this.customBetListProvider;
        if (function0 == null || (value = (List) function0.invoke()) == null) {
            value = getBetController().getBetList().getValue();
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer id = ((BetsListModel) obj).getId();
            int i = this.visibleBetId;
            if (id != null && id.intValue() == i) {
                break;
            }
        }
        BetsListModel betsListModel = (BetsListModel) obj;
        BetWonCloseInterstitialHelper.INSTANCE.maybeShow(getContext(), betsListModel != null ? betsListModel.getState() : null, getPromoService(), getBetController().consumeSkipBetWonCloseInterstitial());
    }
}

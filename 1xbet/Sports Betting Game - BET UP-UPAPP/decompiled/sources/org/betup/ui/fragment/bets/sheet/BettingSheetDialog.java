package org.betup.ui.fragment.bets.sheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.BetUpApp;
import org.betup.bus.BetlistUpdatedMessage;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.presentation.PresentationMatchContext;
import org.betup.presentation.PresentationScreenProvider;
import org.betup.ui.MainActivity;
import org.betup.ui.base.SnackbarDialogFragment;
import org.betup.ui.common.compose.TicketDialogWindowKt;
import org.betup.ui.dialogs.events.FollowerSelectedForBattleEvent;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.utils.DialogManager;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BettingSheetDialog.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006%"}, d2 = {"Lorg/betup/ui/fragment/bets/sheet/BettingSheetDialog;", "Lorg/betup/ui/base/SnackbarDialogFragment;", "Lorg/betup/presentation/PresentationScreenProvider;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "betsSlipController", "Lorg/betup/ui/fragment/bets/BetsController;", "getBetsSlipController", "()Lorg/betup/ui/fragment/bets/BetsController;", "setBetsSlipController", "(Lorg/betup/ui/fragment/bets/BetsController;)V", "presentationScreenKey", "", "presentationScreenContext", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "onStart", "onStop", "onFollowerSelectedForBattle", "event", "Lorg/betup/ui/dialogs/events/FollowerSelectedForBattleEvent;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BettingSheetDialog extends SnackbarDialogFragment implements PresentationScreenProvider {
    public static final int $stable = 8;

    @Inject
    public BetsController betsSlipController;

    @Override // org.betup.presentation.PresentationScreenProvider
    public boolean shouldReportPresentationScreen() {
        return PresentationScreenProvider.DefaultImpls.shouldReportPresentationScreen(this);
    }

    public final BetsController getBetsSlipController() {
        BetsController betsController = this.betsSlipController;
        if (betsController != null) {
            return betsController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betsSlipController");
        return null;
    }

    public final void setBetsSlipController(BetsController betsController) {
        Intrinsics.checkNotNullParameter(betsController, "<set-?>");
        this.betsSlipController = betsController;
    }

    @Override // org.betup.presentation.PresentationScreenProvider
    public String presentationScreenKey() {
        return "place_bet";
    }

    @Override // org.betup.presentation.PresentationScreenProvider
    public Map<String, String> presentationScreenContext() {
        return PresentationMatchContext.INSTANCE.fromBetSlip(getBetsSlipController().getBetsModel().getValue(), Integer.valueOf(RangesKt.coerceAtLeast((int) getBetsSlipController().getAmount().getValue().longValue(), 0)));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        BetsController betsSlipController = getBetsSlipController();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        Function0<Unit> function0 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onAttach$lambda$0;
                onAttach$lambda$0 = BettingSheetDialog.onAttach$lambda$0(BettingSheetDialog.this);
                return onAttach$lambda$0;
            }
        };
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        betsSlipController.bind((MainActivity) requireActivity, function0, requireContext, new Function1() { // from class: org.betup.ui.fragment.bets.sheet.BettingSheetDialog$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onAttach$lambda$1;
                onAttach$lambda$1 = BettingSheetDialog.onAttach$lambda$1(BettingSheetDialog.this, (CharSequence) obj);
                return onAttach$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$0(BettingSheetDialog bettingSheetDialog) {
        bettingSheetDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$1(BettingSheetDialog bettingSheetDialog, CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SnackbarDialogFragment.showSnackbar$default(bettingSheetDialog, message, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(2042577907, true, new BettingSheetDialog$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        BetModel betModel;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBetsSlipController().clearPlaceBetResult();
        getBetsSlipController().clearBattleCreateResult();
        getBetsSlipController().syncBetslipFromStorage();
        List<BetModel> value = getBetsSlipController().getBetsModel().getValue();
        if (value.isEmpty()) {
            Log.w("FirstBetFlow", "BettingSheetDialog - betslip empty after sync, dismissing");
            dismiss();
        } else if (value.size() != 1 || (betModel = (BetModel) CollectionsKt.firstOrNull((List) value)) == null || (betModel.isAvailable() && !betModel.isDeleted())) {
            getBetsSlipController().forceRefreshBetData();
        }
    }

    @Override // org.betup.ui.base.SnackbarDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
        TicketDialogWindowKt.applyTicketDialogWindow(this, -1, -2);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onFollowerSelectedForBattle(FollowerSelectedForBattleEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getBetsSlipController().onBattleOpponentSelected(event.getFollowerId(), event.getFollowerName(), event.getFollowerPhotoUrl());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getBetsSlipController().clearBattleOpponent();
        getBetsSlipController().clearPlaceBetResult();
        getBetsSlipController().clearBattleCreateResult();
        String tag = getTag();
        if (tag == null) {
            tag = "BettingSheetDialog";
        }
        DialogManager.onDialogDismissed(tag);
        EventBus.getDefault().post(new CoefficientUpdatedMessage());
        EventBus.getDefault().post(new BetlistUpdatedMessage());
    }
}

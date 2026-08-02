package org.betup.ui.fragment.matches;

import android.os.Handler;
import android.util.Log;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;
import org.betup.services.betlist.BetValidator;
import org.betup.services.billing.PurchaseCompletedListener;
import org.betup.services.billing.UnlockBetTypesFlow;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter;
import org.betup.utils.SnackbarHelper;

/* compiled from: SpecificChampionshipFragment.kt */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"org/betup/ui/fragment/matches/SpecificChampionshipFragment$onMatchBetClick$2", "Lorg/betup/services/betlist/BetValidator$ValidationCallback;", "onValidationSuccess", "", "validatedBet", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "coefficientChanged", "", "onValidationFailed", "reason", "Lorg/betup/services/betlist/BetValidator$ValidationFailureReason;", "errorMessageId", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpecificChampionshipFragment$onMatchBetClick$2 implements BetValidator.ValidationCallback {
    final /* synthetic */ BetModel $bet;
    final /* synthetic */ long $betId;
    final /* synthetic */ double $coefficientAtClick;
    final /* synthetic */ long $matchId;
    final /* synthetic */ Handler $timeoutHandler;
    final /* synthetic */ Runnable $timeoutRunnable;
    final /* synthetic */ SpecificChampionshipFragment this$0;

    SpecificChampionshipFragment$onMatchBetClick$2(Handler handler, Runnable runnable, SpecificChampionshipFragment specificChampionshipFragment, double d, long j, long j2, BetModel betModel) {
        this.$timeoutHandler = handler;
        this.$timeoutRunnable = runnable;
        this.this$0 = specificChampionshipFragment;
        this.$coefficientAtClick = d;
        this.$betId = j;
        this.$matchId = j2;
        this.$bet = betModel;
    }

    @Override // org.betup.services.betlist.BetValidator.ValidationCallback
    public void onValidationSuccess(BetModel validatedBet, boolean coefficientChanged) {
        SpecificChampionshipAdapter specificChampionshipAdapter;
        SpecificChampionshipAdapter specificChampionshipAdapter2;
        Intrinsics.checkNotNullParameter(validatedBet, "validatedBet");
        this.$timeoutHandler.removeCallbacks(this.$timeoutRunnable);
        this.this$0.getBetListAppender().addValidatedBetWithClickCoefficient(validatedBet, this.$coefficientAtClick);
        specificChampionshipAdapter = this.this$0.championshipAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.setBetValidating(this.$betId, false);
        }
        specificChampionshipAdapter2 = this.this$0.championshipAdapter;
        if (specificChampionshipAdapter2 != null) {
            specificChampionshipAdapter2.refreshBetStatesForMatch(this.$matchId);
        }
    }

    @Override // org.betup.services.betlist.BetValidator.ValidationCallback
    public void onValidationFailed(BetValidator.ValidationFailureReason reason, int errorMessageId) {
        SpecificChampionshipAdapter specificChampionshipAdapter;
        SpecificChampionshipAdapter specificChampionshipAdapter2;
        SpecificChampionshipAdapter specificChampionshipAdapter3;
        MatchDetailsBetGroupModel betGroup;
        Integer id;
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.$timeoutHandler.removeCallbacks(this.$timeoutRunnable);
        specificChampionshipAdapter = this.this$0.championshipAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.setBetValidating(this.$betId, false);
        }
        specificChampionshipAdapter2 = this.this$0.championshipAdapter;
        if (specificChampionshipAdapter2 != null) {
            specificChampionshipAdapter2.markBetsAsUnavailable(this.$matchId, CollectionsKt.listOf(Long.valueOf(this.$betId)));
        }
        specificChampionshipAdapter3 = this.this$0.championshipAdapter;
        if (specificChampionshipAdapter3 != null) {
            specificChampionshipAdapter3.refreshBetStatesForMatch(this.$matchId);
        }
        SnackbarHelper.showShortIfForeground(this.this$0.requireContext(), errorMessageId);
        if (reason == BetValidator.ValidationFailureReason.BET_TYPE_LOCKED) {
            Log.d("SpecificChampionshipFragment", "Bet type is locked (user_available == false) - showing unlock dialog for betId: " + this.$betId);
            try {
                UnlockBetTypesFlow unlockBetTypesFlow = new UnlockBetTypesFlow(this.this$0.requireActivity(), this.this$0.getBillingService(), this.this$0.getFirebaseRemoteConfig(), this.this$0.getSingleShopInteractor(), new ProgressDisplay() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$onMatchBetClick$2$onValidationFailed$progressDisplay$1
                    @Override // org.betup.ui.ProgressDisplay
                    public void displayProgress() {
                    }

                    @Override // org.betup.ui.ProgressDisplay
                    public void hideProgress() {
                    }
                }, PurchasePlacement.BETSLIP, this.this$0.getAnalyticsService(), this.this$0.getUserService(), this.this$0.getVideoRewardService());
                final SpecificChampionshipFragment specificChampionshipFragment = this.this$0;
                final long j = this.$matchId;
                PurchaseCompletedListener purchaseCompletedListener = new PurchaseCompletedListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$onMatchBetClick$2$$ExternalSyntheticLambda0
                    @Override // org.betup.services.billing.PurchaseCompletedListener
                    public final void purchaseCompleted() {
                        SpecificChampionshipFragment$onMatchBetClick$2.onValidationFailed$lambda$0(SpecificChampionshipFragment.this, j);
                    }
                };
                String[] strArr = new String[1];
                MatchDetailsBetDataModel bet = this.$bet.getBet();
                strArr[0] = (bet == null || (betGroup = bet.getBetGroup()) == null || (id = betGroup.getId()) == null) ? null : id.toString();
                unlockBetTypesFlow.start(purchaseCompletedListener, strArr);
            } catch (Exception e) {
                Log.e("SpecificChampionshipFragment", "Error starting unlock flow: " + e.getMessage(), e);
                SnackbarHelper.showShortIfForeground(this.this$0.requireContext(), R.string.error);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onValidationFailed$lambda$0(SpecificChampionshipFragment specificChampionshipFragment, long j) {
        SpecificChampionshipAdapter specificChampionshipAdapter;
        Log.d("SpecificChampionshipFragment", "Purchase completed - bet groups unlocked");
        specificChampionshipAdapter = specificChampionshipFragment.championshipAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.refreshBetStatesForMatch(j);
        }
    }
}

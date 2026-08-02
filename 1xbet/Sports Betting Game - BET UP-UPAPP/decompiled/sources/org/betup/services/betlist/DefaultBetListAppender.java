package org.betup.services.betlist;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.R;
import org.betup.bus.BetlistUpdatedMessage;
import org.betup.bus.BettingSheetStateMessage;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.bus.OneClickFirstBetAddedMessage;
import org.betup.bus.ShowNotEnoughBetcoinsVideoOfferMessage;
import org.betup.bus.UpdateBetslipMessage;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.betlist.BetValidator;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.utils.SharedPrefs;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;

@Singleton
/* loaded from: classes2.dex */
public class DefaultBetListAppender implements BetListAppender {
    private static final String TAG = "DefaultBetListAppender";
    private final BetValidator betValidator;
    private List<BetModel> betlist;
    private final Context context;
    private final Map<Long, Double> initialCoefficientsAtClick = new HashMap();
    private final LocalPreferencesService localPreferencesService;
    private final UserService userService;

    private boolean isOneClickBetUnlockedFromProfile() {
        return true;
    }

    @Inject
    public DefaultBetListAppender(Context context, UserService userService, BetValidator betValidator, LocalPreferencesService localPreferencesService) {
        this.context = context;
        this.userService = userService;
        this.betValidator = betValidator;
        this.localPreferencesService = localPreferencesService;
        this.betlist = SharedPrefs.getBetslip(context);
        clearBad();
        for (BetModel betModel : this.betlist) {
            if (betModel.getBet() != null && betModel.getGrabbedBetId() > 0) {
                this.initialCoefficientsAtClick.put(Long.valueOf(betModel.getGrabbedBetId()), Double.valueOf(betModel.getBet().getGrabbedCoeficient()));
            }
        }
    }

    @Override // org.betup.services.betlist.BetListAppender
    public int getBetsCount() {
        return this.betlist.size();
    }

    private void clearBad() {
        Iterator<BetModel> it = this.betlist.iterator();
        while (it.hasNext()) {
            if (it.next().getMatch().getId() == null) {
                it.remove();
            }
        }
    }

    @Override // org.betup.services.betlist.BetListAppender
    public List<Long> addBetsToList(List<BetModel> bets) {
        ArrayList arrayList = new ArrayList();
        for (BetModel betModel : bets) {
            if (this.betValidator != null) {
                validateAndAddBet(betModel, arrayList);
            } else {
                addBetDirectly(betModel, arrayList, null);
            }
        }
        return arrayList;
    }

    private void validateAndAddBet(BetModel bet, final List<Long> removedIds) {
        final boolean z = this.localPreferencesService.isOneClickBetEnabled(this.userService.getBetupUserIdOrZero()) && isOneClickBetUnlockedFromProfile();
        this.betValidator.validateBet(bet, new BetValidator.ValidationCallback() { // from class: org.betup.services.betlist.DefaultBetListAppender.1
            @Override // org.betup.services.betlist.BetValidator.ValidationCallback
            public void onValidationSuccess(BetModel validatedBet, boolean coefficientChanged) {
                DefaultBetListAppender.this.addBetDirectly(validatedBet, removedIds, null);
                if (coefficientChanged) {
                    if (z) {
                        SnackbarHelper.showWithDuration(DefaultBetListAppender.this.context, DefaultBetListAppender.this.context.getString(R.string.one_click_bet_validate_coef_changed_detail), 5000L);
                    } else {
                        SnackbarHelper.showShortIfForeground(DefaultBetListAppender.this.context, R.string.bet_coefficient_changed);
                    }
                    Log.d(DefaultBetListAppender.TAG, "Bet added with updated coefficient - user notified");
                }
            }

            @Override // org.betup.services.betlist.BetValidator.ValidationCallback
            public void onValidationFailed(BetValidator.ValidationFailureReason reason, int errorMessageId) {
                if (z) {
                    SnackbarHelper.showWithDuration(DefaultBetListAppender.this.context, DefaultBetListAppender.this.context.getString(DefaultBetListAppender.this.validationDetailStringId(reason)), 5000L);
                } else {
                    SnackbarHelper.showShortIfForeground(DefaultBetListAppender.this.context, errorMessageId);
                }
                Log.w(DefaultBetListAppender.TAG, "Bet validation failed: " + reason + " - " + DefaultBetListAppender.this.context.getString(errorMessageId));
                EventBus.getDefault().post(new CoefficientUpdatedMessage());
            }
        });
    }

    /* renamed from: org.betup.services.betlist.DefaultBetListAppender$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$services$betlist$BetValidator$ValidationFailureReason;

        static {
            int[] iArr = new int[BetValidator.ValidationFailureReason.values().length];
            $SwitchMap$org$betup$services$betlist$BetValidator$ValidationFailureReason = iArr;
            try {
                iArr[BetValidator.ValidationFailureReason.BET_DELETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$services$betlist$BetValidator$ValidationFailureReason[BetValidator.ValidationFailureReason.BET_NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$services$betlist$BetValidator$ValidationFailureReason[BetValidator.ValidationFailureReason.BET_TYPE_LOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$services$betlist$BetValidator$ValidationFailureReason[BetValidator.ValidationFailureReason.NETWORK_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$services$betlist$BetValidator$ValidationFailureReason[BetValidator.ValidationFailureReason.VALIDATION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int validationDetailStringId(BetValidator.ValidationFailureReason reason) {
        int i = AnonymousClass2.$SwitchMap$org$betup$services$betlist$BetValidator$ValidationFailureReason[reason.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? R.string.one_click_bet_validate_generic : R.string.one_click_bet_validate_network : R.string.one_click_bet_validate_locked : R.string.one_click_bet_validate_unavailable : R.string.one_click_bet_validate_deleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBetDirectly(BetModel bet, List<Long> removedIds, Double coefficientAtClick) {
        double grabbedCoeficient;
        if (isMatchBettedAlready(bet.getMatch().getId().intValue())) {
            removedIds.addAll(removeOldBet(bet.getMatch().getId().intValue()));
        }
        this.betlist.add(bet);
        SharedPrefs.setBetslip(this.context, this.betlist);
        if (coefficientAtClick != null) {
            grabbedCoeficient = coefficientAtClick.doubleValue();
        } else {
            grabbedCoeficient = bet.getBet() != null ? bet.getBet().getGrabbedCoeficient() : 0.0d;
        }
        if (bet.getBet() != null) {
            this.initialCoefficientsAtClick.put(Long.valueOf(bet.getGrabbedBetId()), Double.valueOf(grabbedCoeficient));
        }
        Log.d("FirstBetFlow", "DefaultBetListAppender [3] addBetDirectly - betId=" + bet.getGrabbedBetId() + ", coefficientStored=" + grabbedCoeficient + " (click=" + (coefficientAtClick != null) + "), betlistSize=" + this.betlist.size());
        EventBus.getDefault().post(new UpdateBetslipMessage(this.betlist.size()));
        EventBus.getDefault().post(new BetlistUpdatedMessage(bet.getMatch().getId() != null ? Long.valueOf(bet.getMatch().getId().longValue()) : null));
        if (this.betlist.size() == 1) {
            if (this.localPreferencesService.isOneClickBetEnabled(this.userService.getBetupUserIdOrZero()) && isOneClickBetUnlockedFromProfile()) {
                long oneClickBetStake = this.localPreferencesService.getOneClickBetStake(this.userService.getBetupUserIdOrZero());
                long j = 0;
                try {
                    UserProgressModel userProgressModel = this.userService.getShortProfile().getUserProgressModel();
                    if (userProgressModel != null) {
                        j = userProgressModel.getMoneyBalance();
                    }
                } catch (Exception unused) {
                }
                if (j < oneClickBetStake) {
                    EventBus.getDefault().post(new ShowNotEnoughBetcoinsVideoOfferMessage(oneClickBetStake));
                    return;
                } else {
                    EventBus.getDefault().post(new OneClickFirstBetAddedMessage(oneClickBetStake));
                    return;
                }
            }
            Log.d("FirstBetFlow", "DefaultBetListAppender [3b] FIRST BET - posting BettingSheetStateMessage.SHOW");
            EventBus.getDefault().post(new BettingSheetStateMessage(BettingSheetStateMessage.State.SHOW));
            return;
        }
        EventBus.getDefault().post(new BettingSheetStateMessage(BettingSheetStateMessage.State.HIDE));
    }

    @Override // org.betup.services.betlist.BetListAppender
    public List<Long> addBetToList(BetModel bet) {
        return addBetsToList(Arrays.asList(bet));
    }

    @Override // org.betup.services.betlist.BetListAppender
    public List<Long> addValidatedBetToList(BetModel bet) {
        ArrayList arrayList = new ArrayList();
        addBetDirectly(bet, arrayList, null);
        return arrayList;
    }

    @Override // org.betup.services.betlist.BetListAppender
    public List<Long> addValidatedBetWithClickCoefficient(BetModel bet, double coefficientAtClick) {
        ArrayList arrayList = new ArrayList();
        addBetDirectly(bet, arrayList, Double.valueOf(coefficientAtClick));
        return arrayList;
    }

    @Override // org.betup.services.betlist.BetListAppender
    public boolean isMatchBettedAlready(long groupHash) {
        for (int i = 0; i < this.betlist.size(); i++) {
            if (this.betlist.get(i).getMatch().getId().intValue() == groupHash) {
                return true;
            }
        }
        return false;
    }

    @Override // org.betup.services.betlist.BetListAppender
    public void clearBets() {
        this.betlist.clear();
        this.initialCoefficientsAtClick.clear();
        EventBus.getDefault().post(new UpdateBetslipMessage(0));
        SharedPrefs.setBetslip(this.context, this.betlist);
    }

    @Override // org.betup.services.betlist.BetListAppender
    public void removeBet(long grabbedBetId) {
        Log.d("BETERROR", "REMOVING " + grabbedBetId);
        this.initialCoefficientsAtClick.remove(Long.valueOf(grabbedBetId));
        int i = 0;
        while (true) {
            if (i >= this.betlist.size()) {
                break;
            }
            if (this.betlist.get(i).getGrabbedBetId() == grabbedBetId) {
                this.betlist.remove(i);
                break;
            }
            i++;
        }
        SharedPrefs.setBetslip(this.context, this.betlist);
        updateDisplay();
    }

    @Override // org.betup.services.betlist.BetListAppender
    public boolean isSelectedBetAlready(long grabbedBetId) {
        for (int i = 0; i < this.betlist.size(); i++) {
            if (this.betlist.get(i).getGrabbedBetId() == grabbedBetId) {
                return true;
            }
        }
        return false;
    }

    @Override // org.betup.services.betlist.BetListAppender
    public void updateDisplay() {
        EventBus.getDefault().post(new UpdateBetslipMessage(this.betlist.size()));
    }

    private List<Long> removeOldBet(long groupHash) {
        ArrayList arrayList = new ArrayList();
        Iterator<BetModel> it = this.betlist.iterator();
        while (it.hasNext()) {
            BetModel next = it.next();
            if (next.getMatch().getId().intValue() == groupHash) {
                arrayList.add(Long.valueOf(next.getGrabbedBetId()));
                this.initialCoefficientsAtClick.remove(Long.valueOf(next.getGrabbedBetId()));
                it.remove();
            }
        }
        return arrayList;
    }

    public void removeBetFromBetslip(BetModel bet) {
        this.betlist.remove(bet);
        SharedPrefs.setBetslip(this.context, this.betlist);
    }

    @Override // org.betup.services.betlist.BetListAppender
    public void syncBetslip(List<BetModel> bets) {
        if (bets != null) {
            ArrayList arrayList = new ArrayList(bets);
            this.betlist = arrayList;
            SharedPrefs.setBetslip(this.context, arrayList);
            Log.d(TAG, "Synced betslip with " + this.betlist.size() + " bets (e.g. updated coefficients)");
        }
    }

    @Override // org.betup.services.betlist.BetListAppender
    public Double getCoefficientForBet(long grabbedBetId) {
        for (BetModel betModel : this.betlist) {
            if (betModel.getGrabbedBetId() == grabbedBetId && betModel.getBet() != null) {
                return Double.valueOf(betModel.getBet().getGrabbedCoeficient());
            }
        }
        return null;
    }

    @Override // org.betup.services.betlist.BetListAppender
    public void setInitialCoefficientForBet(long grabbedBetId, double coefficient) {
        this.initialCoefficientsAtClick.put(Long.valueOf(grabbedBetId), Double.valueOf(coefficient));
    }

    @Override // org.betup.services.betlist.BetListAppender
    public Double getInitialCoefficientForBet(long grabbedBetId) {
        return this.initialCoefficientsAtClick.get(Long.valueOf(grabbedBetId));
    }

    @Override // org.betup.services.betlist.BetListAppender
    public boolean isBetAvailableInSlip(long grabbedBetId) {
        for (BetModel betModel : this.betlist) {
            if (betModel.getGrabbedBetId() == grabbedBetId) {
                return betModel.isAvailable();
            }
        }
        return true;
    }
}

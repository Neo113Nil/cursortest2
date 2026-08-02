package org.betup.services.betlist;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.R;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.betslip.V7GrabbedBetsInteractor;
import org.betup.model.remote.entity.betslip.V7GrabbedBetDto;
import org.betup.model.remote.entity.betslip.V7GrabbedBetsResponse;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;
import org.betup.services.betlist.BetValidator;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;

@Singleton
/* loaded from: classes2.dex */
public class BetValidatorImpl implements BetValidator {
    private static final String TAG = "BetValidatorImpl";
    private final Context context;
    private final V7GrabbedBetsInteractor grabbedBetsInteractor;

    @Inject
    public BetValidatorImpl(Context context, V7GrabbedBetsInteractor grabbedBetsInteractor) {
        this.context = context;
        this.grabbedBetsInteractor = grabbedBetsInteractor;
    }

    @Override // org.betup.services.betlist.BetValidator
    public void validateBet(final BetModel bet, final BetValidator.ValidationCallback callback) {
        if (bet == null || bet.getBet() == null || bet.getBet().getGrabbedBetId().longValue() <= 0) {
            Log.e(TAG, "Invalid bet model for validation");
            callback.onValidationFailed(BetValidator.ValidationFailureReason.VALIDATION_ERROR, R.string.bet_validation_failed);
            return;
        }
        final long longValue = bet.getBet().getGrabbedBetId().longValue();
        List<Long> singletonList = Collections.singletonList(Long.valueOf(longValue));
        Log.d(TAG, "Validating bet with ID: " + longValue);
        this.grabbedBetsInteractor.invalidate(Collections.emptyList());
        this.grabbedBetsInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener<V7GrabbedBetsResponse, List<Long>>() { // from class: org.betup.services.betlist.BetValidatorImpl.1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<V7GrabbedBetsResponse, List<Long>> response) {
                V7GrabbedBetDto v7GrabbedBetDto;
                try {
                    if (response.getStat() != FetchStat.SERVER_DOWN && response.getStat() != FetchStat.NO_CONNECTION) {
                        if (response.getStat() == FetchStat.SUCCESS && response.getModel() != null) {
                            V7GrabbedBetsResponse model = response.getModel();
                            if (model.getGrabbedBets() != null) {
                                Iterator<V7GrabbedBetDto> it = model.getGrabbedBets().iterator();
                                while (it.hasNext()) {
                                    v7GrabbedBetDto = it.next();
                                    if (v7GrabbedBetDto.getGrabbedBetId() == longValue) {
                                        break;
                                    }
                                }
                            }
                            v7GrabbedBetDto = null;
                            if (v7GrabbedBetDto == null) {
                                Log.w(BetValidatorImpl.TAG, "Bet not found in validation response - bet was deleted");
                                callback.onValidationFailed(BetValidator.ValidationFailureReason.BET_DELETED, R.string.bet_deleted);
                                return;
                            }
                            if (!v7GrabbedBetDto.isAvailable()) {
                                Log.w(BetValidatorImpl.TAG, "Bet is not available");
                                callback.onValidationFailed(BetValidator.ValidationFailureReason.BET_NOT_AVAILABLE, R.string.bet_not_available);
                                return;
                            }
                            if (v7GrabbedBetDto.getBetTypeGroup() != null && !v7GrabbedBetDto.getBetTypeGroup().getUserAvailable()) {
                                Log.w(BetValidatorImpl.TAG, "Bet type is locked for user");
                                callback.onValidationFailed(BetValidator.ValidationFailureReason.BET_TYPE_LOCKED, R.string.bet_type_locked);
                                return;
                            }
                            double grabbedCoeficient = bet.getBet().getGrabbedCoeficient();
                            double grabbedCoeficient2 = v7GrabbedBetDto.getGrabbedCoeficient();
                            boolean z = Math.abs(grabbedCoeficient - grabbedCoeficient2) > 0.01d;
                            bet.getBet().setGrabbedCoeficient(grabbedCoeficient2);
                            bet.setAvailable(true);
                            if (v7GrabbedBetDto.getBetTypeGroup() != null) {
                                MatchDetailsBetGroupModel matchDetailsBetGroupModel = new MatchDetailsBetGroupModel();
                                matchDetailsBetGroupModel.setId(Integer.valueOf((int) v7GrabbedBetDto.getBetTypeGroup().getId()));
                                matchDetailsBetGroupModel.setName(v7GrabbedBetDto.getBetTypeGroup().getName());
                                matchDetailsBetGroupModel.setLevel(0);
                                matchDetailsBetGroupModel.setDisplayColumns(v7GrabbedBetDto.getBetTypeGroup().getDisplayColumns());
                                matchDetailsBetGroupModel.setAvailable(v7GrabbedBetDto.getBetTypeGroup().getUserAvailable());
                                bet.getBet().setBetGroup(matchDetailsBetGroupModel);
                            }
                            if (z) {
                                Log.w(BetValidatorImpl.TAG, "Coefficient changed: " + grabbedCoeficient + " -> " + grabbedCoeficient2 + " - bet will be added with new coefficient");
                            } else {
                                Log.d(BetValidatorImpl.TAG, "Bet validation successful - coefficient unchanged");
                            }
                            callback.onValidationSuccess(bet, z);
                            return;
                        }
                        Log.e(BetValidatorImpl.TAG, "Validation failed with stat: " + response.getStat());
                        callback.onValidationFailed(BetValidator.ValidationFailureReason.VALIDATION_ERROR, R.string.bet_validation_failed);
                        return;
                    }
                    Log.e(BetValidatorImpl.TAG, "Network error during validation: " + response.getStat());
                    callback.onValidationFailed(BetValidator.ValidationFailureReason.NETWORK_ERROR, R.string.error);
                } catch (Exception e) {
                    Log.e(BetValidatorImpl.TAG, "Error processing validation response", e);
                    callback.onValidationFailed(BetValidator.ValidationFailureReason.VALIDATION_ERROR, R.string.bet_validation_failed);
                }
            }
        }, singletonList, (Bundle) null);
    }
}

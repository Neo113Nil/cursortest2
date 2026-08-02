package org.betup.services.betlist;

import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;

/* loaded from: classes2.dex */
public interface BetValidator {

    public interface ValidationCallback {
        void onValidationFailed(ValidationFailureReason reason, int errorMessageId);

        void onValidationSuccess(BetModel bet, boolean coefficientChanged);
    }

    public enum ValidationFailureReason {
        BET_DELETED,
        BET_NOT_AVAILABLE,
        BET_TYPE_LOCKED,
        VALIDATION_ERROR,
        NETWORK_ERROR
    }

    void validateBet(BetModel bet, ValidationCallback callback);
}

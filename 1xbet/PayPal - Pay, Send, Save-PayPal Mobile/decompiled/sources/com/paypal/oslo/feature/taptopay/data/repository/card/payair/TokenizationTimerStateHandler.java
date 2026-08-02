package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimerStateHandler;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;", "tokenizationTimer", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;", "cardScheme", "", "startTimer", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", "state", "onStateChange", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/data/repository/card/payair/TokenizationTimer;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenizationTimerStateHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TokenizationTimerStateHandler(com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizationTimer, "");
        this.getHighSpeedVideoSizes = tokenizationTimer;
    }

    public final void startTimer(com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme) {
        this.getHighSpeedVideoSizes.start(cardScheme);
    }

    public final void onStateChange(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleTermsAndConditions) {
            this.getHighSpeedVideoSizes.pause("Terms and Conditions page shown");
            return;
        }
        if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification) {
            this.getHighSpeedVideoSizes.pause("OTP verification page shown");
            return;
        }
        if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizingCard) {
            this.getHighSpeedVideoSizes.resume("Continuing with digitization");
            return;
        }
        if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.CardActivated) {
            this.getHighSpeedVideoSizes.stop("Success: Card Activated");
            return;
        }
        if (state instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure) {
            com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer = this.getHighSpeedVideoSizes;
            java.lang.String simpleName = state.getClass().getSimpleName();
            if (simpleName == null) {
                simpleName = "Unknown";
            }
            tokenizationTimer.stop("Failure: ".concat(java.lang.String.valueOf(simpleName)));
        }
    }
}

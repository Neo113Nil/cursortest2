package com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect;", "", "NavigateToHub", com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_NAVIGATE_TO_ERROR, "GoBack", "Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect$GoBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect$NavigateToError;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect$NavigateToHub;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CryptoOnboardingEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect$NavigateToHub;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToHub implements com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToHub INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToHub();

        public final int hashCode() {
            return -1271787375;
        }

        private NavigateToHub() {
        }

        public final java.lang.String toString() {
            return "NavigateToHub";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToHub)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect$NavigateToError;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToError implements com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToError INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToError();

        public final int hashCode() {
            return 1875170980;
        }

        private NavigateToError() {
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_NAVIGATE_TO_ERROR;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.NavigateToError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect$GoBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/onboarding/model/CryptoOnboardingEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoBack implements com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.GoBack INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.GoBack();

        public final int hashCode() {
            return 2131532775;
        }

        private GoBack() {
        }

        public final java.lang.String toString() {
            return "GoBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.onboarding.model.CryptoOnboardingEffect.GoBack)) {
                return false;
            }
            return true;
        }
    }
}

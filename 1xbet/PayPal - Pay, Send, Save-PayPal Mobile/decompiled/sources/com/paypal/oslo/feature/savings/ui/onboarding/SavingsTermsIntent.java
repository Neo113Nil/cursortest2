package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "", "<init>", "()V", "BackClicked", "AgreeClicked", "OnboardingCompleted", "OnboardingFailed", "OnboardingCancelled", "OnboardingInReview", "OnboardingInProgress", "RetryClicked", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$AgreeClicked;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$BackClicked;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingCancelled;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingCompleted;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingFailed;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingInProgress;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingInReview;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$RetryClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsTermsIntent {
    public static final int $stable = 0;

    private SavingsTermsIntent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$BackClicked;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.BackClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.BackClicked();

        public final int hashCode() {
            return 501978107;
        }

        private BackClicked() {
            super(null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$AgreeClicked;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgreeClicked extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.AgreeClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.AgreeClicked();

        public final int hashCode() {
            return 1146912896;
        }

        private AgreeClicked() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AgreeClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.AgreeClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingCompleted;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingCompleted extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCompleted INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCompleted();

        public final int hashCode() {
            return -1991567829;
        }

        private OnboardingCompleted() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnboardingCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingFailed;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingFailed extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingFailed INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingFailed();

        public final int hashCode() {
            return -897351587;
        }

        private OnboardingFailed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnboardingFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingCancelled;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingCancelled extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCancelled INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCancelled();

        public final int hashCode() {
            return -112047823;
        }

        private OnboardingCancelled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnboardingCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingInReview;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingInReview extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInReview INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInReview();

        public final int hashCode() {
            return -144759555;
        }

        private OnboardingInReview() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnboardingInReview";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInReview)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$OnboardingInProgress;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingInProgress extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInProgress INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInProgress();

        public final int hashCode() {
            return 1880103570;
        }

        private OnboardingInProgress() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnboardingInProgress";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInProgress)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent$RetryClicked;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryClicked extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.RetryClicked INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.RetryClicked();

        public final int hashCode() {
            return 721624324;
        }

        private RetryClicked() {
            super(null);
        }

        public final java.lang.String toString() {
            return "RetryClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.RetryClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SavingsTermsIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

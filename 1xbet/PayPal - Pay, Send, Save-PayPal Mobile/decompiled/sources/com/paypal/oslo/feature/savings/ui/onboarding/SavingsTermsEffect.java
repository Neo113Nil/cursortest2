package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "", "<init>", "()V", "NavigateBack", "NavigateToWebView", "NavigateToFdicInsuranceSheet", "NavigateToApyInfoSheet", "NavigateToOnboardingFlow", "NavigateToAddMoneyGeneralSavingsFlow", "OnboardingFailed", "OnboardingCancelled", "OnboardingInReview", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateBack;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToAddMoneyGeneralSavingsFlow;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToApyInfoSheet;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToFdicInsuranceSheet;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToOnboardingFlow;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToWebView;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$OnboardingCancelled;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$OnboardingFailed;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$OnboardingInReview;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsTermsEffect {
    public static final int $stable = 0;

    private SavingsTermsEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateBack;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateBack();

        public final int hashCode() {
            return -1133939256;
        }

        private NavigateBack() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToWebView;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "", "url", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToWebView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToWebView extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect {
        public static final int $stable = 0;
        private final java.lang.String title;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToWebView(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.url = str;
            this.title = str2;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.title;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToWebView(url=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.url.hashCode() * 31) + this.title.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView navigateToWebView = (com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, navigateToWebView.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, navigateToWebView.title);
        }

        public final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView copy(java.lang.String url, java.lang.String title) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView(url, title);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView copy$default(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView navigateToWebView, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToWebView.url;
            }
            if ((i & 2) != 0) {
                str2 = navigateToWebView.title;
            }
            return navigateToWebView.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToFdicInsuranceSheet;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToFdicInsuranceSheet extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToFdicInsuranceSheet INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToFdicInsuranceSheet();

        public final int hashCode() {
            return -349142055;
        }

        private NavigateToFdicInsuranceSheet() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToFdicInsuranceSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToFdicInsuranceSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToApyInfoSheet;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToApyInfoSheet extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToApyInfoSheet INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToApyInfoSheet();

        public final int hashCode() {
            return -334739453;
        }

        private NavigateToApyInfoSheet() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToApyInfoSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToApyInfoSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToOnboardingFlow;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToOnboardingFlow extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToOnboardingFlow INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToOnboardingFlow();

        public final int hashCode() {
            return -1424771931;
        }

        private NavigateToOnboardingFlow() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToOnboardingFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToOnboardingFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$NavigateToAddMoneyGeneralSavingsFlow;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddMoneyGeneralSavingsFlow extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToAddMoneyGeneralSavingsFlow INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToAddMoneyGeneralSavingsFlow();

        public final int hashCode() {
            return 469866298;
        }

        private NavigateToAddMoneyGeneralSavingsFlow() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToAddMoneyGeneralSavingsFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToAddMoneyGeneralSavingsFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$OnboardingFailed;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingFailed extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingFailed INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingFailed();

        public final int hashCode() {
            return -421550584;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$OnboardingCancelled;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingCancelled extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingCancelled INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingCancelled();

        public final int hashCode() {
            return 1083555750;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect$OnboardingInReview;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingInReview extends com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingInReview INSTANCE = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingInReview();

        public final int hashCode() {
            return 1833470952;
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
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingInReview)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SavingsTermsEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

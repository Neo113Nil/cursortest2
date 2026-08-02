package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CloseAcquisition", "HideKeyboard", "ShowKeyboard", "ShowHowItWorks", "NavigateToPersonalInfo", "NavigateToOffers", "NavigateToPayMonthly", "NavigateToPayIn4", "NavigateToSpendingPowerFaq", "NavigateToRequireScreenLock", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$HideKeyboard;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToOffers;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToPayIn4;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToPayMonthly;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToPersonalInfo;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToRequireScreenLock;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToSpendingPowerFaq;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$ShowHowItWorks;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$ShowKeyboard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class EnterAmountUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private EnterAmountUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseAcquisition extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.CloseAcquisition INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.CloseAcquisition();

        public final int hashCode() {
            return 767979244;
        }

        private CloseAcquisition() {
            super("CloseAcquisition", null);
        }

        public final java.lang.String toString() {
            return "CloseAcquisition";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.CloseAcquisition)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$HideKeyboard;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HideKeyboard extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.HideKeyboard INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.HideKeyboard();

        public final int hashCode() {
            return -838719680;
        }

        private HideKeyboard() {
            super("HideKeyboard", null);
        }

        public final java.lang.String toString() {
            return "HideKeyboard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.HideKeyboard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$ShowKeyboard;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowKeyboard extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.ShowKeyboard INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.ShowKeyboard();

        public final int hashCode() {
            return 2042051067;
        }

        private ShowKeyboard() {
            super("ShowKeyboard", null);
        }

        public final java.lang.String toString() {
            return "ShowKeyboard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.ShowKeyboard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$ShowHowItWorks;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowHowItWorks extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.ShowHowItWorks INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.ShowHowItWorks();

        public final int hashCode() {
            return -463684677;
        }

        private ShowHowItWorks() {
            super("ShowHowItWorks", null);
        }

        public final java.lang.String toString() {
            return "ShowHowItWorks";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.ShowHowItWorks)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToPersonalInfo;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToPersonalInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPersonalInfo extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPersonalInfo(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess) {
            super("NavigateToPersonalInfo", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCreditApplicationSuccess, "");
            this.data = createCreditApplicationSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPersonalInfo(data=");
            sb.append(createCreditApplicationSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPersonalInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPersonalInfo) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPersonalInfo copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPersonalInfo(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPersonalInfo copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPersonalInfo navigateToPersonalInfo, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createCreditApplicationSuccess = navigateToPersonalInfo.data;
            }
            return navigateToPersonalInfo.copy(createCreditApplicationSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToOffers;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "availableOffersCreditApplication", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToOffers;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "getAvailableOffersCreditApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToOffers extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOffersCreditApplication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToOffers(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication) {
            super("NavigateToOffers", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableOfferDetailsSuccessCreditApplication, "");
            this.availableOffersCreditApplication = availableOfferDetailsSuccessCreditApplication;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getAvailableOffersCreditApplication() {
            return this.availableOffersCreditApplication;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication = this.availableOffersCreditApplication;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToOffers(availableOffersCreditApplication=");
            sb.append(availableOfferDetailsSuccessCreditApplication);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.availableOffersCreditApplication.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableOffersCreditApplication, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers) other).availableOffersCreditApplication);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers copy(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOffersCreditApplication) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableOffersCreditApplication, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers(availableOffersCreditApplication);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getAvailableOffersCreditApplication() {
            return this.availableOffersCreditApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers navigateToOffers, com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                availableOfferDetailsSuccessCreditApplication = navigateToOffers.availableOffersCreditApplication;
            }
            return navigateToOffers.copy(availableOfferDetailsSuccessCreditApplication);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToPayMonthly;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToPayMonthly;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPayMonthly extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        public NavigateToPayMonthly(java.lang.String str) {
            super("NavigateToPayMonthly", null);
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPayMonthly(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayMonthly) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayMonthly) other).url);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayMonthly copy(java.lang.String url) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayMonthly(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayMonthly copy$default(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayMonthly navigateToPayMonthly, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPayMonthly.url;
            }
            return navigateToPayMonthly.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToPayIn4;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPayIn4 extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayIn4 INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayIn4();

        public final int hashCode() {
            return 1835706698;
        }

        private NavigateToPayIn4() {
            super("NavigateToPayIn4", null);
        }

        public final java.lang.String toString() {
            return "NavigateToPayIn4";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayIn4)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToSpendingPowerFaq;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSpendingPowerFaq extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToSpendingPowerFaq INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToSpendingPowerFaq();

        public final int hashCode() {
            return 1304067416;
        }

        private NavigateToSpendingPowerFaq() {
            super("NavigateToSpendingPowerFaq", null);
        }

        public final java.lang.String toString() {
            return "NavigateToSpendingPowerFaq";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToSpendingPowerFaq)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect$NavigateToRequireScreenLock;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRequireScreenLock extends com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToRequireScreenLock INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToRequireScreenLock();

        public final int hashCode() {
            return -413581383;
        }

        private NavigateToRequireScreenLock() {
            super("NavigateToRequireScreenLock", null);
        }

        public final java.lang.String toString() {
            return "NavigateToRequireScreenLock";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToRequireScreenLock)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ EnterAmountUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

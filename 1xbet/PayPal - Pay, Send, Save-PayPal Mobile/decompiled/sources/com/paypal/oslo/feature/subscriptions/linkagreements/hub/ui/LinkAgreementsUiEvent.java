package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent;", "", "OnLinkMerchantClicked", "OnSearchClicked", "OnHowToLinkClicked", "OnCloseClicked", "OnBackClicked", "OnSystemBackPressed", "OnTryAgainClicked", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnCloseClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnHowToLinkClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnLinkMerchantClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnSearchClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnSystemBackPressed;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnTryAgainClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface LinkAgreementsUiEvent {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnLinkMerchantClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "merchant", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnLinkMerchantClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "getMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLinkMerchantClicked implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant merchant;

        public OnLinkMerchantClicked(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
            this.merchant = consumerAgreementMerchant;
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant getMerchant() {
            return this.merchant;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant = this.merchant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLinkMerchantClicked(merchant=");
            sb.append(consumerAgreementMerchant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.merchant.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnLinkMerchantClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnLinkMerchantClicked) other).merchant);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnLinkMerchantClicked copy(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnLinkMerchantClicked(merchant);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant getMerchant() {
            return this.merchant;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnLinkMerchantClicked copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnLinkMerchantClicked onLinkMerchantClicked, com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                consumerAgreementMerchant = onLinkMerchantClicked.merchant;
            }
            return onLinkMerchantClicked.copy(consumerAgreementMerchant);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnSearchClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSearchClicked implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnSearchClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnSearchClicked();

        public final int hashCode() {
            return -1231334122;
        }

        private OnSearchClicked() {
        }

        public final java.lang.String toString() {
            return "OnSearchClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnSearchClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnHowToLinkClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnHowToLinkClicked implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnHowToLinkClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnHowToLinkClicked();

        public final int hashCode() {
            return 551413707;
        }

        private OnHowToLinkClicked() {
        }

        public final java.lang.String toString() {
            return "OnHowToLinkClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnHowToLinkClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnCloseClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCloseClicked implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnCloseClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnCloseClicked();

        public final int hashCode() {
            return 652415096;
        }

        private OnCloseClicked() {
        }

        public final java.lang.String toString() {
            return "OnCloseClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnCloseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnBackClicked();

        public final int hashCode() {
            return -1206164809;
        }

        private OnBackClicked() {
        }

        public final java.lang.String toString() {
            return "OnBackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnBackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnSystemBackPressed;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSystemBackPressed implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnSystemBackPressed INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnSystemBackPressed();

        public final int hashCode() {
            return -1950835773;
        }

        private OnSystemBackPressed() {
        }

        public final java.lang.String toString() {
            return "OnSystemBackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnSystemBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent$OnTryAgainClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTryAgainClicked implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

        public OnTryAgainClicked(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            this.agreementType = agreementType;
        }

        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTryAgainClicked(agreementType=");
            sb.append(agreementType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnTryAgainClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnTryAgainClicked) other).agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnTryAgainClicked copy(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnTryAgainClicked(agreementType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
            return this.agreementType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnTryAgainClicked copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent.OnTryAgainClicked onTryAgainClicked, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                agreementType = onTryAgainClicked.agreementType;
            }
            return onTryAgainClicked.copy(agreementType);
        }
    }
}

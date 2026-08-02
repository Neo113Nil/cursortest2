package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$Card;", "card", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$CustomerService;", "customerService", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$Card;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$CustomerService;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$Card;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$CustomerService;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$Card;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$CustomerService;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$Card;", "getCard", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$CustomerService;", "getCustomerService", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "CustomerService", "ActivationPhoneNumber", "LostStolenPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RevolvingCreditServicingContentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService;

    public RevolvingCreditServicingContentFragment(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService) {
        this.card = card;
        this.customerService = customerService;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card getCard() {
        return this.card;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService getCustomerService() {
        return this.customerService;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ@\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$Card;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$ActivationPhoneNumber;", "activationPhoneNumber", "cardHolderTermsUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$LostStolenPhoneNumber;", "lostStolenPhoneNumber", "benefitsUrl", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$ActivationPhoneNumber;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$LostStolenPhoneNumber;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$ActivationPhoneNumber;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$LostStolenPhoneNumber;", "component4", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$ActivationPhoneNumber;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$LostStolenPhoneNumber;Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$Card;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$ActivationPhoneNumber;", "getActivationPhoneNumber", "Ljava/lang/Object;", "getCardHolderTermsUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$LostStolenPhoneNumber;", "getLostStolenPhoneNumber", "getBenefitsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber;
        private final java.lang.Object benefitsUrl;
        private final java.lang.Object cardHolderTermsUrl;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber lostStolenPhoneNumber;

        public Card(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber, java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber lostStolenPhoneNumber, java.lang.Object obj2) {
            this.activationPhoneNumber = activationPhoneNumber;
            this.cardHolderTermsUrl = obj;
            this.lostStolenPhoneNumber = lostStolenPhoneNumber;
            this.benefitsUrl = obj2;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber getActivationPhoneNumber() {
            return this.activationPhoneNumber;
        }

        public final java.lang.Object getCardHolderTermsUrl() {
            return this.cardHolderTermsUrl;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber getLostStolenPhoneNumber() {
            return this.lostStolenPhoneNumber;
        }

        public final java.lang.Object getBenefitsUrl() {
            return this.benefitsUrl;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber = this.activationPhoneNumber;
            java.lang.Object obj = this.cardHolderTermsUrl;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber lostStolenPhoneNumber = this.lostStolenPhoneNumber;
            java.lang.Object obj2 = this.benefitsUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(activationPhoneNumber=");
            sb.append(activationPhoneNumber);
            sb.append(", cardHolderTermsUrl=");
            sb.append(obj);
            sb.append(", lostStolenPhoneNumber=");
            sb.append(lostStolenPhoneNumber);
            sb.append(", benefitsUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber = this.activationPhoneNumber;
            int hashCode = activationPhoneNumber == null ? 0 : activationPhoneNumber.hashCode();
            java.lang.Object obj = this.cardHolderTermsUrl;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber lostStolenPhoneNumber = this.lostStolenPhoneNumber;
            int hashCode3 = lostStolenPhoneNumber == null ? 0 : lostStolenPhoneNumber.hashCode();
            java.lang.Object obj2 = this.benefitsUrl;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.activationPhoneNumber, card.activationPhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardHolderTermsUrl, card.cardHolderTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.lostStolenPhoneNumber, card.lostStolenPhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitsUrl, card.benefitsUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber, java.lang.Object cardHolderTermsUrl, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber lostStolenPhoneNumber, java.lang.Object benefitsUrl) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card(activationPhoneNumber, cardHolderTermsUrl, lostStolenPhoneNumber, benefitsUrl);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getBenefitsUrl() {
            return this.benefitsUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber getLostStolenPhoneNumber() {
            return this.lostStolenPhoneNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCardHolderTermsUrl() {
            return this.cardHolderTermsUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber getActivationPhoneNumber() {
            return this.activationPhoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber, java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber lostStolenPhoneNumber, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                activationPhoneNumber = card.activationPhoneNumber;
            }
            if ((i & 2) != 0) {
                obj = card.cardHolderTermsUrl;
            }
            if ((i & 4) != 0) {
                lostStolenPhoneNumber = card.lostStolenPhoneNumber;
            }
            if ((i & 8) != 0) {
                obj2 = card.benefitsUrl;
            }
            return card.copy(activationPhoneNumber, obj, lostStolenPhoneNumber, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$CustomerService;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment;", "revolvingCreditCustomerServiceFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$CustomerService;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerServiceFragment;", "getRevolvingCreditCustomerServiceFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomerService {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment revolvingCreditCustomerServiceFragment;

        public CustomerService(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment revolvingCreditCustomerServiceFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditCustomerServiceFragment, "");
            this.__typename = str;
            this.revolvingCreditCustomerServiceFragment = revolvingCreditCustomerServiceFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment getRevolvingCreditCustomerServiceFragment() {
            return this.revolvingCreditCustomerServiceFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment revolvingCreditCustomerServiceFragment = this.revolvingCreditCustomerServiceFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomerService(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditCustomerServiceFragment=");
            sb.append(revolvingCreditCustomerServiceFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditCustomerServiceFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, customerService.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditCustomerServiceFragment, customerService.revolvingCreditCustomerServiceFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment revolvingCreditCustomerServiceFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditCustomerServiceFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService(__typename, revolvingCreditCustomerServiceFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment getRevolvingCreditCustomerServiceFragment() {
            return this.revolvingCreditCustomerServiceFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceFragment revolvingCreditCustomerServiceFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = customerService.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditCustomerServiceFragment = customerService.revolvingCreditCustomerServiceFragment;
            }
            return customerService.copy(str, revolvingCreditCustomerServiceFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$ActivationPhoneNumber;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;", "revolvingCreditPhoneFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$ActivationPhoneNumber;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;", "getRevolvingCreditPhoneFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivationPhoneNumber {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment;

        public ActivationPhoneNumber(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPhoneFragment, "");
            this.__typename = str;
            this.revolvingCreditPhoneFragment = revolvingCreditPhoneFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment getRevolvingCreditPhoneFragment() {
            return this.revolvingCreditPhoneFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment = this.revolvingCreditPhoneFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivationPhoneNumber(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditPhoneFragment=");
            sb.append(revolvingCreditPhoneFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditPhoneFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, activationPhoneNumber.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditPhoneFragment, activationPhoneNumber.revolvingCreditPhoneFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPhoneFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber(__typename, revolvingCreditPhoneFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment getRevolvingCreditPhoneFragment() {
            return this.revolvingCreditPhoneFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.ActivationPhoneNumber activationPhoneNumber, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activationPhoneNumber.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditPhoneFragment = activationPhoneNumber.revolvingCreditPhoneFragment;
            }
            return activationPhoneNumber.copy(str, revolvingCreditPhoneFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$LostStolenPhoneNumber;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;", "revolvingCreditPhoneFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment$LostStolenPhoneNumber;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPhoneFragment;", "getRevolvingCreditPhoneFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LostStolenPhoneNumber {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment;

        public LostStolenPhoneNumber(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPhoneFragment, "");
            this.__typename = str;
            this.revolvingCreditPhoneFragment = revolvingCreditPhoneFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment getRevolvingCreditPhoneFragment() {
            return this.revolvingCreditPhoneFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment = this.revolvingCreditPhoneFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LostStolenPhoneNumber(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditPhoneFragment=");
            sb.append(revolvingCreditPhoneFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditPhoneFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber lostStolenPhoneNumber = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, lostStolenPhoneNumber.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditPhoneFragment, lostStolenPhoneNumber.revolvingCreditPhoneFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPhoneFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber(__typename, revolvingCreditPhoneFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment getRevolvingCreditPhoneFragment() {
            return this.revolvingCreditPhoneFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber lostStolenPhoneNumber, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPhoneFragment revolvingCreditPhoneFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lostStolenPhoneNumber.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditPhoneFragment = lostStolenPhoneNumber.revolvingCreditPhoneFragment;
            }
            return lostStolenPhoneNumber.copy(str, revolvingCreditPhoneFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card = this.card;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService = this.customerService;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingContentFragment(card=");
        sb.append(card);
        sb.append(", customerService=");
        sb.append(customerService);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card = this.card;
        int hashCode = card == null ? 0 : card.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService = this.customerService;
        return (hashCode * 31) + (customerService != null ? customerService.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.card, revolvingCreditServicingContentFragment.card) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerService, revolvingCreditServicingContentFragment.customerService);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment(card, customerService);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService getCustomerService() {
        return this.customerService;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card getCard() {
        return this.card;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.CustomerService customerService, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            card = revolvingCreditServicingContentFragment.card;
        }
        if ((i & 2) != 0) {
            customerService = revolvingCreditServicingContentFragment.customerService;
        }
        return revolvingCreditServicingContentFragment.copy(card, customerService);
    }
}

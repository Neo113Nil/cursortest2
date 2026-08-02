package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001:\u0007?@ABCDEBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jn\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;", "onInsufficientFundsDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;", "onQuasiCashDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;", "onBankAccountEcheckDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;", "onPaymentLinkAchDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;", "onPaymentLinkGenericDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;", "onPaymentLinkAchWithTermDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;", "onPaymentLinkGenericWithTermDisclosure", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;", "component5", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;", "component6", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;", "component7", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;", "component8", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;", "getOnInsufficientFundsDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;", "getOnQuasiCashDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;", "getOnBankAccountEcheckDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;", "getOnPaymentLinkAchDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;", "getOnPaymentLinkGenericDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;", "getOnPaymentLinkAchWithTermDisclosure", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;", "getOnPaymentLinkGenericWithTermDisclosure", "OnInsufficientFundsDisclosure", "OnQuasiCashDisclosure", "OnBankAccountEcheckDisclosure", "OnPaymentLinkAchDisclosure", "OnPaymentLinkGenericDisclosure", "OnPaymentLinkAchWithTermDisclosure", "OnPaymentLinkGenericWithTermDisclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentPlanDisclosureFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure onBankAccountEcheckDisclosure;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure onInsufficientFundsDisclosure;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure onPaymentLinkAchDisclosure;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure onPaymentLinkGenericDisclosure;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure onQuasiCashDisclosure;

    public PaymentPlanDisclosureFragment(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure onInsufficientFundsDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure onQuasiCashDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure onBankAccountEcheckDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure onPaymentLinkAchDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure onPaymentLinkGenericDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__typename = str;
        this.onInsufficientFundsDisclosure = onInsufficientFundsDisclosure;
        this.onQuasiCashDisclosure = onQuasiCashDisclosure;
        this.onBankAccountEcheckDisclosure = onBankAccountEcheckDisclosure;
        this.onPaymentLinkAchDisclosure = onPaymentLinkAchDisclosure;
        this.onPaymentLinkGenericDisclosure = onPaymentLinkGenericDisclosure;
        this.onPaymentLinkAchWithTermDisclosure = onPaymentLinkAchWithTermDisclosure;
        this.onPaymentLinkGenericWithTermDisclosure = onPaymentLinkGenericWithTermDisclosure;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure getOnInsufficientFundsDisclosure() {
        return this.onInsufficientFundsDisclosure;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure getOnQuasiCashDisclosure() {
        return this.onQuasiCashDisclosure;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure getOnBankAccountEcheckDisclosure() {
        return this.onBankAccountEcheckDisclosure;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure getOnPaymentLinkAchDisclosure() {
        return this.onPaymentLinkAchDisclosure;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure getOnPaymentLinkGenericDisclosure() {
        return this.onPaymentLinkGenericDisclosure;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure getOnPaymentLinkAchWithTermDisclosure() {
        return this.onPaymentLinkAchWithTermDisclosure;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure getOnPaymentLinkGenericWithTermDisclosure() {
        return this.onPaymentLinkGenericWithTermDisclosure;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;", "", "", "priority", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPriority"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInsufficientFundsDisclosure {
        public static final int $stable = 0;
        private final int priority;

        public OnInsufficientFundsDisclosure(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final java.lang.String toString() {
            int i = this.priority;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInsufficientFundsDisclosure(priority=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.priority);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure) && this.priority == ((com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure) other).priority;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure copy(int priority) {
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure(priority);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure onInsufficientFundsDisclosure, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onInsufficientFundsDisclosure.priority;
            }
            return onInsufficientFundsDisclosure.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;", "", "", "priority", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPriority"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnQuasiCashDisclosure {
        public static final int $stable = 0;
        private final int priority;

        public OnQuasiCashDisclosure(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final java.lang.String toString() {
            int i = this.priority;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnQuasiCashDisclosure(priority=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.priority);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure) && this.priority == ((com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure) other).priority;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure copy(int priority) {
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure(priority);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure onQuasiCashDisclosure, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onQuasiCashDisclosure.priority;
            }
            return onQuasiCashDisclosure.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;", "", "", "priority", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPriority"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankAccountEcheckDisclosure {
        public static final int $stable = 0;
        private final int priority;

        public OnBankAccountEcheckDisclosure(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final java.lang.String toString() {
            int i = this.priority;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccountEcheckDisclosure(priority=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.priority);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure) && this.priority == ((com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure) other).priority;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure copy(int priority) {
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure(priority);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure onBankAccountEcheckDisclosure, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onBankAccountEcheckDisclosure.priority;
            }
            return onBankAccountEcheckDisclosure.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;", "", "", "priority", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPriority"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentLinkAchDisclosure {
        public static final int $stable = 0;
        private final int priority;

        public OnPaymentLinkAchDisclosure(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final java.lang.String toString() {
            int i = this.priority;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentLinkAchDisclosure(priority=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.priority);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure) && this.priority == ((com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure) other).priority;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure copy(int priority) {
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure(priority);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure onPaymentLinkAchDisclosure, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onPaymentLinkAchDisclosure.priority;
            }
            return onPaymentLinkAchDisclosure.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;", "", "", "priority", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPriority"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentLinkGenericDisclosure {
        public static final int $stable = 0;
        private final int priority;

        public OnPaymentLinkGenericDisclosure(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final java.lang.String toString() {
            int i = this.priority;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentLinkGenericDisclosure(priority=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.priority);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure) && this.priority == ((com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure) other).priority;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure copy(int priority) {
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure(priority);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure onPaymentLinkGenericDisclosure, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onPaymentLinkGenericDisclosure.priority;
            }
            return onPaymentLinkGenericDisclosure.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;", "", "", "priority", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPriority"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentLinkAchWithTermDisclosure {
        public static final int $stable = 0;
        private final int priority;

        public OnPaymentLinkAchWithTermDisclosure(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final java.lang.String toString() {
            int i = this.priority;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentLinkAchWithTermDisclosure(priority=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.priority);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure) && this.priority == ((com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure) other).priority;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure copy(int priority) {
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure(priority);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onPaymentLinkAchWithTermDisclosure.priority;
            }
            return onPaymentLinkAchWithTermDisclosure.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;", "", "", "priority", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPriority"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentLinkGenericWithTermDisclosure {
        public static final int $stable = 0;
        private final int priority;

        public OnPaymentLinkGenericWithTermDisclosure(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final java.lang.String toString() {
            int i = this.priority;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentLinkGenericWithTermDisclosure(priority=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.priority);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure) && this.priority == ((com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure) other).priority;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure copy(int priority) {
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure(priority);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onPaymentLinkGenericWithTermDisclosure.priority;
            }
            return onPaymentLinkGenericWithTermDisclosure.copy(i);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure onInsufficientFundsDisclosure = this.onInsufficientFundsDisclosure;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure onQuasiCashDisclosure = this.onQuasiCashDisclosure;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure onBankAccountEcheckDisclosure = this.onBankAccountEcheckDisclosure;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure onPaymentLinkAchDisclosure = this.onPaymentLinkAchDisclosure;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure onPaymentLinkGenericDisclosure = this.onPaymentLinkGenericDisclosure;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure = this.onPaymentLinkAchWithTermDisclosure;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure = this.onPaymentLinkGenericWithTermDisclosure;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentPlanDisclosureFragment(__typename=");
        sb.append(str);
        sb.append(", onInsufficientFundsDisclosure=");
        sb.append(onInsufficientFundsDisclosure);
        sb.append(", onQuasiCashDisclosure=");
        sb.append(onQuasiCashDisclosure);
        sb.append(", onBankAccountEcheckDisclosure=");
        sb.append(onBankAccountEcheckDisclosure);
        sb.append(", onPaymentLinkAchDisclosure=");
        sb.append(onPaymentLinkAchDisclosure);
        sb.append(", onPaymentLinkGenericDisclosure=");
        sb.append(onPaymentLinkGenericDisclosure);
        sb.append(", onPaymentLinkAchWithTermDisclosure=");
        sb.append(onPaymentLinkAchWithTermDisclosure);
        sb.append(", onPaymentLinkGenericWithTermDisclosure=");
        sb.append(onPaymentLinkGenericWithTermDisclosure);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure onInsufficientFundsDisclosure = this.onInsufficientFundsDisclosure;
        int hashCode2 = onInsufficientFundsDisclosure == null ? 0 : onInsufficientFundsDisclosure.hashCode();
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure onQuasiCashDisclosure = this.onQuasiCashDisclosure;
        int hashCode3 = onQuasiCashDisclosure == null ? 0 : onQuasiCashDisclosure.hashCode();
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure onBankAccountEcheckDisclosure = this.onBankAccountEcheckDisclosure;
        int hashCode4 = onBankAccountEcheckDisclosure == null ? 0 : onBankAccountEcheckDisclosure.hashCode();
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure onPaymentLinkAchDisclosure = this.onPaymentLinkAchDisclosure;
        int hashCode5 = onPaymentLinkAchDisclosure == null ? 0 : onPaymentLinkAchDisclosure.hashCode();
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure onPaymentLinkGenericDisclosure = this.onPaymentLinkGenericDisclosure;
        int hashCode6 = onPaymentLinkGenericDisclosure == null ? 0 : onPaymentLinkGenericDisclosure.hashCode();
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure = this.onPaymentLinkAchWithTermDisclosure;
        int hashCode7 = onPaymentLinkAchWithTermDisclosure == null ? 0 : onPaymentLinkAchWithTermDisclosure.hashCode();
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure = this.onPaymentLinkGenericWithTermDisclosure;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (onPaymentLinkGenericWithTermDisclosure != null ? onPaymentLinkGenericWithTermDisclosure.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment paymentPlanDisclosureFragment = (com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentPlanDisclosureFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onInsufficientFundsDisclosure, paymentPlanDisclosureFragment.onInsufficientFundsDisclosure) && kotlin.jvm.internal.Intrinsics.areEqual(this.onQuasiCashDisclosure, paymentPlanDisclosureFragment.onQuasiCashDisclosure) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccountEcheckDisclosure, paymentPlanDisclosureFragment.onBankAccountEcheckDisclosure) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPaymentLinkAchDisclosure, paymentPlanDisclosureFragment.onPaymentLinkAchDisclosure) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPaymentLinkGenericDisclosure, paymentPlanDisclosureFragment.onPaymentLinkGenericDisclosure) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPaymentLinkAchWithTermDisclosure, paymentPlanDisclosureFragment.onPaymentLinkAchWithTermDisclosure) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPaymentLinkGenericWithTermDisclosure, paymentPlanDisclosureFragment.onPaymentLinkGenericWithTermDisclosure);
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure onInsufficientFundsDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure onQuasiCashDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure onBankAccountEcheckDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure onPaymentLinkAchDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure onPaymentLinkGenericDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment(__typename, onInsufficientFundsDisclosure, onQuasiCashDisclosure, onBankAccountEcheckDisclosure, onPaymentLinkAchDisclosure, onPaymentLinkGenericDisclosure, onPaymentLinkAchWithTermDisclosure, onPaymentLinkGenericWithTermDisclosure);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure getOnPaymentLinkGenericWithTermDisclosure() {
        return this.onPaymentLinkGenericWithTermDisclosure;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure getOnPaymentLinkAchWithTermDisclosure() {
        return this.onPaymentLinkAchWithTermDisclosure;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure getOnPaymentLinkGenericDisclosure() {
        return this.onPaymentLinkGenericDisclosure;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure getOnPaymentLinkAchDisclosure() {
        return this.onPaymentLinkAchDisclosure;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure getOnBankAccountEcheckDisclosure() {
        return this.onBankAccountEcheckDisclosure;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure getOnQuasiCashDisclosure() {
        return this.onQuasiCashDisclosure;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure getOnInsufficientFundsDisclosure() {
        return this.onInsufficientFundsDisclosure;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }
}

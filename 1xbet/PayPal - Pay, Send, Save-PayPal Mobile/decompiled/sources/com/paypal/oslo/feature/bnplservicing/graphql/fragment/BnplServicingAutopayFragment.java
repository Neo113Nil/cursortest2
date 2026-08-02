package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "enabled", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment$PaymentFundingInstrument;", "paymentFundingInstrument", "isFundingInstrumentValid", "", "eTag", "<init>", "(ZLcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment$PaymentFundingInstrument;Ljava/lang/Boolean;Ljava/lang/Object;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment$PaymentFundingInstrument;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/Object;", "copy", "(ZLcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment$PaymentFundingInstrument;Ljava/lang/Boolean;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment$PaymentFundingInstrument;", "getPaymentFundingInstrument", "Ljava/lang/Boolean;", "Ljava/lang/Object;", "getETag", "PaymentFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplServicingAutopayFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.Object eTag;
    private final boolean enabled;
    private final java.lang.Boolean isFundingInstrumentValid;
    private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument paymentFundingInstrument;

    public BnplServicingAutopayFragment(boolean z, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument paymentFundingInstrument, java.lang.Boolean bool, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.enabled = z;
        this.paymentFundingInstrument = paymentFundingInstrument;
        this.isFundingInstrumentValid = bool;
        this.eTag = obj;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument getPaymentFundingInstrument() {
        return this.paymentFundingInstrument;
    }

    public final java.lang.Boolean isFundingInstrumentValid() {
        return this.isFundingInstrumentValid;
    }

    public final java.lang.Object getETag() {
        return this.eTag;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment$PaymentFundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "bnplServicingPaymentFundingInstrumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment$PaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "getBnplServicingPaymentFundingInstrumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentFundingInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment;

        public PaymentFundingInstrument(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPaymentFundingInstrumentFragment, "");
            this.__typename = str;
            this.bnplServicingPaymentFundingInstrumentFragment = bnplServicingPaymentFundingInstrumentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment getBnplServicingPaymentFundingInstrumentFragment() {
            return this.bnplServicingPaymentFundingInstrumentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment = this.bnplServicingPaymentFundingInstrumentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentFundingInstrument(__typename=");
            sb.append(str);
            sb.append(", bnplServicingPaymentFundingInstrumentFragment=");
            sb.append(bnplServicingPaymentFundingInstrumentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingPaymentFundingInstrumentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument paymentFundingInstrument = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentFundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingPaymentFundingInstrumentFragment, paymentFundingInstrument.bnplServicingPaymentFundingInstrumentFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPaymentFundingInstrumentFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument(__typename, bnplServicingPaymentFundingInstrumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment getBnplServicingPaymentFundingInstrumentFragment() {
            return this.bnplServicingPaymentFundingInstrumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument paymentFundingInstrument, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentFundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingPaymentFundingInstrumentFragment = paymentFundingInstrument.bnplServicingPaymentFundingInstrumentFragment;
            }
            return paymentFundingInstrument.copy(str, bnplServicingPaymentFundingInstrumentFragment);
        }
    }

    public final java.lang.String toString() {
        boolean z = this.enabled;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument paymentFundingInstrument = this.paymentFundingInstrument;
        java.lang.Boolean bool = this.isFundingInstrumentValid;
        java.lang.Object obj = this.eTag;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingAutopayFragment(enabled=");
        sb.append(z);
        sb.append(", paymentFundingInstrument=");
        sb.append(paymentFundingInstrument);
        sb.append(", isFundingInstrumentValid=");
        sb.append(bool);
        sb.append(", eTag=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.enabled);
        int hashCode2 = this.paymentFundingInstrument.hashCode();
        java.lang.Boolean bool = this.isFundingInstrumentValid;
        return (((((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.eTag.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment) other;
        return this.enabled == bnplServicingAutopayFragment.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentFundingInstrument, bnplServicingAutopayFragment.paymentFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.isFundingInstrumentValid, bnplServicingAutopayFragment.isFundingInstrumentValid) && kotlin.jvm.internal.Intrinsics.areEqual(this.eTag, bnplServicingAutopayFragment.eTag);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment copy(boolean enabled, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument paymentFundingInstrument, java.lang.Boolean isFundingInstrumentValid, java.lang.Object eTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eTag, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment(enabled, paymentFundingInstrument, isFundingInstrumentValid, eTag);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Object getETag() {
        return this.eTag;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getIsFundingInstrumentValid() {
        return this.isFundingInstrumentValid;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument getPaymentFundingInstrument() {
        return this.paymentFundingInstrument;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment, boolean z, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument paymentFundingInstrument, java.lang.Boolean bool, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            z = bnplServicingAutopayFragment.enabled;
        }
        if ((i & 2) != 0) {
            paymentFundingInstrument = bnplServicingAutopayFragment.paymentFundingInstrument;
        }
        if ((i & 4) != 0) {
            bool = bnplServicingAutopayFragment.isFundingInstrumentValid;
        }
        if ((i & 8) != 0) {
            obj = bnplServicingAutopayFragment.eTag;
        }
        return bnplServicingAutopayFragment.copy(z, paymentFundingInstrument, bool, obj);
    }
}

package com.paypal.oslo.feature.debitcard.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "formattedFee", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPricingType;", "type", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment$Fee;", "fee", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPricingType;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment$Fee;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPricingType;", "component3", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment$Fee;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPricingType;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment$Fee;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedFee", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPricingType;", "getType", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment$Fee;", "getFee", "Fee"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentPricingFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee;
    private final java.lang.String formattedFee;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPricingType type;

    public DebitInstrumentPricingFragment(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPricingType debitInstrumentPricingType, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee) {
        this.formattedFee = str;
        this.type = debitInstrumentPricingType;
        this.fee = fee;
    }

    public final java.lang.String getFormattedFee() {
        return this.formattedFee;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPricingType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee getFee() {
        return this.fee;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment$Fee;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment$Fee;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Fee {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Fee(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fee(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fee.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fee.value);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = fee.currencyCode;
            }
            if ((i & 2) != 0) {
                str = fee.value;
            }
            return fee.copy(obj, str);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.formattedFee;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPricingType debitInstrumentPricingType = this.type;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee = this.fee;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentPricingFragment(formattedFee=");
        sb.append(str);
        sb.append(", type=");
        sb.append(debitInstrumentPricingType);
        sb.append(", fee=");
        sb.append(fee);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.formattedFee;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPricingType debitInstrumentPricingType = this.type;
        int hashCode2 = debitInstrumentPricingType == null ? 0 : debitInstrumentPricingType.hashCode();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee = this.fee;
        return (((hashCode * 31) + hashCode2) * 31) + (fee != null ? fee.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment debitInstrumentPricingFragment = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedFee, debitInstrumentPricingFragment.formattedFee) && this.type == debitInstrumentPricingFragment.type && kotlin.jvm.internal.Intrinsics.areEqual(this.fee, debitInstrumentPricingFragment.fee);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment copy(java.lang.String formattedFee, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPricingType type, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee) {
        return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment(formattedFee, type, fee);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee getFee() {
        return this.fee;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPricingType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFormattedFee() {
        return this.formattedFee;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment debitInstrumentPricingFragment, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPricingType debitInstrumentPricingType, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment.Fee fee, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitInstrumentPricingFragment.formattedFee;
        }
        if ((i & 2) != 0) {
            debitInstrumentPricingType = debitInstrumentPricingFragment.type;
        }
        if ((i & 4) != 0) {
            fee = debitInstrumentPricingFragment.fee;
        }
        return debitInstrumentPricingFragment.copy(str, debitInstrumentPricingType, fee);
    }
}

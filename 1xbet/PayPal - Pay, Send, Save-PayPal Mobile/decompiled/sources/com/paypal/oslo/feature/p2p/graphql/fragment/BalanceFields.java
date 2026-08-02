package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields$AvailableAmount;", "availableAmount", "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields$AvailableAmount;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields$AvailableAmount;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields$AvailableAmount;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields$AvailableAmount;", "getAvailableAmount", "getAvailableAmount$annotations", "()V", "get__typename", "AvailableAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BalanceFields implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount availableAmount;
    private final java.lang.String id;

    @kotlin.Deprecated(message = "Use 'available' field instead for available balance")
    public static /* synthetic */ void getAvailableAmount$annotations() {
    }

    public BalanceFields(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount availableAmount, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.availableAmount = availableAmount;
        this.__typename = str2;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount getAvailableAmount() {
        return this.availableAmount;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields$AvailableAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/BalanceFields$AvailableAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AvailableAmount(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = obj;
            this.value = str;
            this.__typename = str2;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableAmount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.currencyCode.hashCode() * 31) + this.value.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount availableAmount = (com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, availableAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, availableAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, availableAmount.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount(currencyCode, value, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount availableAmount, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = availableAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = availableAmount.value;
            }
            if ((i & 4) != 0) {
                str2 = availableAmount.__typename;
            }
            return availableAmount.copy(obj, str, str2);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount availableAmount = this.availableAmount;
        java.lang.String str2 = this.__typename;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceFields(id=");
        sb.append(str);
        sb.append(", availableAmount=");
        sb.append(availableAmount);
        sb.append(", __typename=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.availableAmount.hashCode()) * 31) + this.__typename.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields balanceFields = (com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, balanceFields.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmount, balanceFields.availableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, balanceFields.__typename);
    }

    public final com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields copy(java.lang.String id, com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount availableAmount, java.lang.String __typename) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields(id, availableAmount, __typename);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount getAvailableAmount() {
        return this.availableAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields copy$default(com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields balanceFields, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields.AvailableAmount availableAmount, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = balanceFields.id;
        }
        if ((i & 2) != 0) {
            availableAmount = balanceFields.availableAmount;
        }
        if ((i & 4) != 0) {
            str2 = balanceFields.__typename;
        }
        return balanceFields.copy(str, availableAmount, str2);
    }
}

package com.paypal.oslo.feature.qrc.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\t#$%&'()*+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountFrom;", "amountFrom", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountTo;", "amountTo", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ExchangeRate;", "exchangeRate", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountFrom;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountTo;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ExchangeRate;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountFrom;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountTo;", "component3", "()Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ExchangeRate;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountFrom;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountTo;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ExchangeRate;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountFrom;", "getAmountFrom", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountTo;", "getAmountTo", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ExchangeRate;", "getExchangeRate", "AmountFrom", "AmountTo", "ExchangeRate", "OnMoney", "OnMoney1", "FromCurrency", "OnMoney2", "ToCurrency", "OnMoney3"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CurrencyConversionFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom amountFrom;
    private final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo amountTo;
    private final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate exchangeRate;

    public CurrencyConversionFragment(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom amountFrom, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo amountTo, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate exchangeRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFrom, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountTo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
        this.amountFrom = amountFrom;
        this.amountTo = amountTo;
        this.exchangeRate = exchangeRate;
    }

    public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom getAmountFrom() {
        return this.amountFrom;
    }

    public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo getAmountTo() {
        return this.amountTo;
    }

    public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate getExchangeRate() {
        return this.exchangeRate;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountFrom;", "", "", "__typename", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountFrom;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountFrom {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney onMoney;

        public AmountFrom(java.lang.String str, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney onMoney = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountFrom(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney onMoney = this.onMoney;
            return (hashCode * 31) + (onMoney == null ? 0 : onMoney.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom amountFrom = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountFrom.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, amountFrom.onMoney);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom copy(java.lang.String __typename, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom amountFrom, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney onMoney, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountFrom.__typename;
            }
            if ((i & 2) != 0) {
                onMoney = amountFrom.onMoney;
            }
            return amountFrom.copy(str, onMoney);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountTo;", "", "", "__typename", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney1;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney1;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$AmountTo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney1;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountTo {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 onMoney;

        public AmountTo(java.lang.String str, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 onMoney1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 onMoney1 = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountTo(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 onMoney1 = this.onMoney;
            return (hashCode * 31) + (onMoney1 == null ? 0 : onMoney1.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo amountTo = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountTo.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, amountTo.onMoney);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo copy(java.lang.String __typename, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo amountTo, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 onMoney1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountTo.__typename;
            }
            if ((i & 2) != 0) {
                onMoney1 = amountTo.onMoney;
            }
            return amountTo.copy(str, onMoney1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ExchangeRate;", "", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$FromCurrency;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ToCurrency;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO, "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$FromCurrency;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ToCurrency;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$FromCurrency;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ToCurrency;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$FromCurrency;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ToCurrency;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ExchangeRate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$FromCurrency;", "getFromCurrency", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ToCurrency;", "getToCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExchangeRate {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency fromCurrency;
        private final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency toCurrency;

        public ExchangeRate(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency fromCurrency, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency toCurrency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromCurrency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toCurrency, "");
            this.fromCurrency = fromCurrency;
            this.toCurrency = toCurrency;
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency getFromCurrency() {
            return this.fromCurrency;
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency getToCurrency() {
            return this.toCurrency;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency fromCurrency = this.fromCurrency;
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency toCurrency = this.toCurrency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeRate(fromCurrency=");
            sb.append(fromCurrency);
            sb.append(", toCurrency=");
            sb.append(toCurrency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fromCurrency.hashCode() * 31) + this.toCurrency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate exchangeRate = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fromCurrency, exchangeRate.fromCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.toCurrency, exchangeRate.toCurrency);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate copy(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency fromCurrency, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency toCurrency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromCurrency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toCurrency, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate(fromCurrency, toCurrency);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency getToCurrency() {
            return this.toCurrency;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency getFromCurrency() {
            return this.fromCurrency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate exchangeRate, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency fromCurrency, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency toCurrency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fromCurrency = exchangeRate.fromCurrency;
            }
            if ((i & 2) != 0) {
                toCurrency = exchangeRate.toCurrency;
            }
            return exchangeRate.copy(fromCurrency, toCurrency);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoney {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String value;

        public OnMoney(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.value = str;
            this.currencyCode = str2;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.String str2 = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMoney(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney onMoney = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney.currencyCode);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney copy(java.lang.String value, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney onMoney, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onMoney.value;
            }
            if ((i & 2) != 0) {
                str2 = onMoney.currencyCode;
            }
            return onMoney.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney1;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoney1 {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String value;

        public OnMoney1(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.value = str;
            this.currencyCode = str2;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.String str2 = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMoney1(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 onMoney1 = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney1.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney1.currencyCode);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 copy(java.lang.String value, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 onMoney1, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onMoney1.value;
            }
            if ((i & 2) != 0) {
                str2 = onMoney1.currencyCode;
            }
            return onMoney1.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$FromCurrency;", "", "", "__typename", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney2;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney2;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney2;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney2;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$FromCurrency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney2;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FromCurrency {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 onMoney;

        public FromCurrency(java.lang.String str, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 onMoney2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney2;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 onMoney2 = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FromCurrency(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 onMoney2 = this.onMoney;
            return (hashCode * 31) + (onMoney2 == null ? 0 : onMoney2.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency fromCurrency = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fromCurrency.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, fromCurrency.onMoney);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency copy(java.lang.String __typename, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.FromCurrency fromCurrency, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 onMoney2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fromCurrency.__typename;
            }
            if ((i & 2) != 0) {
                onMoney2 = fromCurrency.onMoney;
            }
            return fromCurrency.copy(str, onMoney2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney2;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoney2 {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String value;

        public OnMoney2(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.value = str;
            this.currencyCode = str2;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.String str2 = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMoney2(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 onMoney2 = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney2.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney2.currencyCode);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 copy(java.lang.String value, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 onMoney2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onMoney2.value;
            }
            if ((i & 2) != 0) {
                str2 = onMoney2.currencyCode;
            }
            return onMoney2.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ToCurrency;", "", "", "__typename", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney3;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney3;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney3;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney3;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$ToCurrency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney3;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ToCurrency {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 onMoney;

        public ToCurrency(java.lang.String str, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 onMoney3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney3;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 onMoney3 = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ToCurrency(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 onMoney3 = this.onMoney;
            return (hashCode * 31) + (onMoney3 == null ? 0 : onMoney3.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency toCurrency = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, toCurrency.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, toCurrency.onMoney);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency copy(java.lang.String __typename, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ToCurrency toCurrency, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 onMoney3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = toCurrency.__typename;
            }
            if ((i & 2) != 0) {
                onMoney3 = toCurrency.onMoney;
            }
            return toCurrency.copy(str, onMoney3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney3;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment$OnMoney3;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoney3 {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String value;

        public OnMoney3(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.value = str;
            this.currencyCode = str2;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.String str2 = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMoney3(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 onMoney3 = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney3.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney3.currencyCode);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 copy(java.lang.String value, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 onMoney3, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onMoney3.value;
            }
            if ((i & 2) != 0) {
                str2 = onMoney3.currencyCode;
            }
            return onMoney3.copy(str, str2);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom amountFrom = this.amountFrom;
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo amountTo = this.amountTo;
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate exchangeRate = this.exchangeRate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyConversionFragment(amountFrom=");
        sb.append(amountFrom);
        sb.append(", amountTo=");
        sb.append(amountTo);
        sb.append(", exchangeRate=");
        sb.append(exchangeRate);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.amountFrom.hashCode() * 31) + this.amountTo.hashCode()) * 31) + this.exchangeRate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment currencyConversionFragment = (com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amountFrom, currencyConversionFragment.amountFrom) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountTo, currencyConversionFragment.amountTo) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, currencyConversionFragment.exchangeRate);
    }

    public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment copy(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom amountFrom, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo amountTo, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate exchangeRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFrom, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountTo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
        return new com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment(amountFrom, amountTo, exchangeRate);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate getExchangeRate() {
        return this.exchangeRate;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo getAmountTo() {
        return this.amountTo;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom getAmountFrom() {
        return this.amountFrom;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment currencyConversionFragment, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountFrom amountFrom, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.AmountTo amountTo, com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.ExchangeRate exchangeRate, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amountFrom = currencyConversionFragment.amountFrom;
        }
        if ((i & 2) != 0) {
            amountTo = currencyConversionFragment.amountTo;
        }
        if ((i & 4) != 0) {
            exchangeRate = currencyConversionFragment.exchangeRate;
        }
        return currencyConversionFragment.copy(amountFrom, amountTo, exchangeRate);
    }
}

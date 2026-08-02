package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0002\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0018\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0018\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016Jª\u0001\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0016R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b-\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b0\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b1\u0010\u0016R\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b2\u0010\u0016R\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b3\u0010\u0016R\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b4\u0010\u0016R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b5\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ExecuteCryptocurrencyTradeInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteId", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "action", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyClientConfigurationInput;", "clientConfiguration", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "amount", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetQuantityInput;", "assetQuantity", "fiatCurrencyCode", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyActionPreferenceInput;", "actionPreference", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ExecuteCryptocurrencyTradeInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getFundingOptionId", "getQuoteId", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "getAction", "getClientConfiguration", "getAmount", "getAssetSymbol", "getAssetQuantity", "getFiatCurrencyCode", "getActionPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ExecuteCryptocurrencyTradeInput {
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction action;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput> actionPreference;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> assetQuantity;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> assetSymbol;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> clientConfiguration;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> fiatCurrencyCode;
    private final com.apollographql.apollo.api.Optional<java.lang.String> fundingOptionId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> quoteId;

    /* JADX WARN: Multi-variable type inference failed */
    public ExecuteCryptocurrencyTradeInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> optional3, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional4, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> optional5, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> optional6, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional7, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput> optional8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyTradeAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional8, "");
        this.fundingOptionId = optional;
        this.quoteId = optional2;
        this.action = cryptocurrencyTradeAction;
        this.clientConfiguration = optional3;
        this.amount = optional4;
        this.assetSymbol = optional5;
        this.assetQuantity = optional6;
        this.fiatCurrencyCode = optional7;
        this.actionPreference = optional8;
    }

    public /* synthetic */ ExecuteCryptocurrencyTradeInput(com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, com.apollographql.apollo.api.Optional optional7, com.apollographql.apollo.api.Optional optional8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, cryptocurrencyTradeAction, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional7, (i & 256) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional8);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getFundingOptionId() {
        return this.fundingOptionId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getQuoteId() {
        return this.quoteId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction getAction() {
        return this.action;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> getClientConfiguration() {
        return this.clientConfiguration;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getAmount() {
        return this.amount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> getAssetSymbol() {
        return this.assetSymbol;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> getAssetQuantity() {
        return this.assetQuantity;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getFiatCurrencyCode() {
        return this.fiatCurrencyCode;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput> getActionPreference() {
        return this.actionPreference;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.fundingOptionId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.quoteId;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction = this.action;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> optional3 = this.clientConfiguration;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional4 = this.amount;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> optional5 = this.assetSymbol;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> optional6 = this.assetQuantity;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional7 = this.fiatCurrencyCode;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput> optional8 = this.actionPreference;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecuteCryptocurrencyTradeInput(fundingOptionId=");
        sb.append(optional);
        sb.append(", quoteId=");
        sb.append(optional2);
        sb.append(", action=");
        sb.append(cryptocurrencyTradeAction);
        sb.append(", clientConfiguration=");
        sb.append(optional3);
        sb.append(", amount=");
        sb.append(optional4);
        sb.append(", assetSymbol=");
        sb.append(optional5);
        sb.append(", assetQuantity=");
        sb.append(optional6);
        sb.append(", fiatCurrencyCode=");
        sb.append(optional7);
        sb.append(", actionPreference=");
        sb.append(optional8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((this.fundingOptionId.hashCode() * 31) + this.quoteId.hashCode()) * 31) + this.action.hashCode()) * 31) + this.clientConfiguration.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.assetSymbol.hashCode()) * 31) + this.assetQuantity.hashCode()) * 31) + this.fiatCurrencyCode.hashCode()) * 31) + this.actionPreference.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput executeCryptocurrencyTradeInput = (com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, executeCryptocurrencyTradeInput.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.quoteId, executeCryptocurrencyTradeInput.quoteId) && this.action == executeCryptocurrencyTradeInput.action && kotlin.jvm.internal.Intrinsics.areEqual(this.clientConfiguration, executeCryptocurrencyTradeInput.clientConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, executeCryptocurrencyTradeInput.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, executeCryptocurrencyTradeInput.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantity, executeCryptocurrencyTradeInput.assetQuantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatCurrencyCode, executeCryptocurrencyTradeInput.fiatCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionPreference, executeCryptocurrencyTradeInput.actionPreference);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput copy(com.apollographql.apollo.api.Optional<java.lang.String> fundingOptionId, com.apollographql.apollo.api.Optional<java.lang.String> quoteId, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction action, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> clientConfiguration, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> assetSymbol, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> assetQuantity, com.apollographql.apollo.api.Optional<? extends java.lang.Object> fiatCurrencyCode, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput> actionPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quoteId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionPreference, "");
        return new com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput(fundingOptionId, quoteId, action, clientConfiguration, amount, assetSymbol, assetQuantity, fiatCurrencyCode, actionPreference);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyActionPreferenceInput> component9() {
        return this.actionPreference;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component8() {
        return this.fiatCurrencyCode;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantityInput> component7() {
        return this.assetQuantity;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol> component6() {
        return this.assetSymbol;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component5() {
        return this.amount;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> component4() {
        return this.clientConfiguration;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction getAction() {
        return this.action;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.quoteId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.fundingOptionId;
    }
}

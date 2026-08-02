package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r0\u0006\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u0006\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r0\u0006\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r0\u0006\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u001e\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r0\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u001e\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u001e\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r0\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u001e\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r0\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u001e\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJÒ\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00062\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r0\u00062\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u00062\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r0\u00062\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r0\u00062\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001bR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u001dR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b5\u0010\u001dR\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b6\u0010\u001dR(\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b7\u0010\u001dR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b8\u0010\u001dR(\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b9\u0010\u001dR(\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b:\u0010\u001dR(\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b;\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyConfigurationsInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityType;", "entityType", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName;", "entityName", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeIntent;", "tradeIntent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTransferAction;", "transferAction", "", "quoteEnabled", "", "countries", "", "regions", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "assetSymbols", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "blockchainNetworks", "blockchains", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityType;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityType;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyConfigurationsInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityType;", "getEntityType", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEntityName;", "getEntityName", "Lcom/apollographql/apollo/api/Optional;", "getTradeIntent", "getTransferAction", "getQuoteEnabled", "getCountries", "getRegions", "getAssetSymbols", "getBlockchainNetworks", "getBlockchains"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyConfigurationsInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol>> assetSymbols;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork>> blockchainNetworks;
    private final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> blockchains;
    private final com.apollographql.apollo.api.Optional<java.util.List<java.lang.Object>> countries;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName entityName;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityType entityType;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> quoteEnabled;
    private final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> regions;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeIntent> tradeIntent;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> transferAction;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptocurrencyConfigurationsInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityType cryptocurrencyEntityType, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeIntent> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> optional2, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional3, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends java.lang.Object>> optional4, com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> optional5, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol>> optional6, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork>> optional7, com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> optional8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyEntityType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyEntityName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional8, "");
        this.entityType = cryptocurrencyEntityType;
        this.entityName = cryptocurrencyEntityName;
        this.tradeIntent = optional;
        this.transferAction = optional2;
        this.quoteEnabled = optional3;
        this.countries = optional4;
        this.regions = optional5;
        this.assetSymbols = optional6;
        this.blockchainNetworks = optional7;
        this.blockchains = optional8;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityType getEntityType() {
        return this.entityType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName getEntityName() {
        return this.entityName;
    }

    public /* synthetic */ CryptocurrencyConfigurationsInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityType cryptocurrencyEntityType, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, com.apollographql.apollo.api.Optional optional7, com.apollographql.apollo.api.Optional optional8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptocurrencyEntityType, cryptocurrencyEntityName, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, (i & 256) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional7, (i & 512) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional8);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeIntent> getTradeIntent() {
        return this.tradeIntent;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> getTransferAction() {
        return this.transferAction;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getQuoteEnabled() {
        return this.quoteEnabled;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.Object>> getCountries() {
        return this.countries;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> getRegions() {
        return this.regions;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol>> getAssetSymbols() {
        return this.assetSymbols;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork>> getBlockchainNetworks() {
        return this.blockchainNetworks;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> getBlockchains() {
        return this.blockchains;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityType cryptocurrencyEntityType = this.entityType;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName cryptocurrencyEntityName = this.entityName;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeIntent> optional = this.tradeIntent;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> optional2 = this.transferAction;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional3 = this.quoteEnabled;
        com.apollographql.apollo.api.Optional<java.util.List<java.lang.Object>> optional4 = this.countries;
        com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> optional5 = this.regions;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol>> optional6 = this.assetSymbols;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork>> optional7 = this.blockchainNetworks;
        com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> optional8 = this.blockchains;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyConfigurationsInput(entityType=");
        sb.append(cryptocurrencyEntityType);
        sb.append(", entityName=");
        sb.append(cryptocurrencyEntityName);
        sb.append(", tradeIntent=");
        sb.append(optional);
        sb.append(", transferAction=");
        sb.append(optional2);
        sb.append(", quoteEnabled=");
        sb.append(optional3);
        sb.append(", countries=");
        sb.append(optional4);
        sb.append(", regions=");
        sb.append(optional5);
        sb.append(", assetSymbols=");
        sb.append(optional6);
        sb.append(", blockchainNetworks=");
        sb.append(optional7);
        sb.append(", blockchains=");
        sb.append(optional8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((this.entityType.hashCode() * 31) + this.entityName.hashCode()) * 31) + this.tradeIntent.hashCode()) * 31) + this.transferAction.hashCode()) * 31) + this.quoteEnabled.hashCode()) * 31) + this.countries.hashCode()) * 31) + this.regions.hashCode()) * 31) + this.assetSymbols.hashCode()) * 31) + this.blockchainNetworks.hashCode()) * 31) + this.blockchains.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyConfigurationsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyConfigurationsInput cryptocurrencyConfigurationsInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyConfigurationsInput) other;
        return this.entityType == cryptocurrencyConfigurationsInput.entityType && this.entityName == cryptocurrencyConfigurationsInput.entityName && kotlin.jvm.internal.Intrinsics.areEqual(this.tradeIntent, cryptocurrencyConfigurationsInput.tradeIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAction, cryptocurrencyConfigurationsInput.transferAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.quoteEnabled, cryptocurrencyConfigurationsInput.quoteEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.countries, cryptocurrencyConfigurationsInput.countries) && kotlin.jvm.internal.Intrinsics.areEqual(this.regions, cryptocurrencyConfigurationsInput.regions) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbols, cryptocurrencyConfigurationsInput.assetSymbols) && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchainNetworks, cryptocurrencyConfigurationsInput.blockchainNetworks) && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchains, cryptocurrencyConfigurationsInput.blockchains);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyConfigurationsInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityType entityType, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName entityName, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeIntent> tradeIntent, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> transferAction, com.apollographql.apollo.api.Optional<java.lang.Boolean> quoteEnabled, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends java.lang.Object>> countries, com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> regions, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol>> assetSymbols, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork>> blockchainNetworks, com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> blockchains) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entityType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entityName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tradeIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quoteEnabled, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countries, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbols, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchainNetworks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchains, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyConfigurationsInput(entityType, entityName, tradeIntent, transferAction, quoteEnabled, countries, regions, assetSymbols, blockchainNetworks, blockchains);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork>> component9() {
        return this.blockchainNetworks;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol>> component8() {
        return this.assetSymbols;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> component7() {
        return this.regions;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.Object>> component6() {
        return this.countries;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component5() {
        return this.quoteEnabled;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction> component4() {
        return this.transferAction;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeIntent> component3() {
        return this.tradeIntent;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityName getEntityName() {
        return this.entityName;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> component10() {
        return this.blockchains;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEntityType getEntityType() {
        return this.entityType;
    }
}

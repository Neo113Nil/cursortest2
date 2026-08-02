package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ^\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u001dR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyRecurringTradeSubscriptionInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringTradeFrequency;", "frequency", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "action", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "startDateTime", "Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyFundingInstrumentPreferencesInput;", "fundingInstrumentPreferences", "", "quoteId", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyClientConfigurationInput;", "clientConfiguration", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringTradeFrequency;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyFundingInstrumentPreferencesInput;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringTradeFrequency;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyFundingInstrumentPreferencesInput;", "component6", "()Ljava/lang/String;", "component7", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringTradeFrequency;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyFundingInstrumentPreferencesInput;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyRecurringTradeSubscriptionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringTradeFrequency;", "getFrequency", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "getAction", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/Object;", "getStartDateTime", "Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyFundingInstrumentPreferencesInput;", "getFundingInstrumentPreferences", "Ljava/lang/String;", "getQuoteId", "Lcom/apollographql/apollo/api/Optional;", "getClientConfiguration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateCryptocurrencyRecurringTradeSubscriptionInput {
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction action;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> clientConfiguration;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeFrequency frequency;
    private final com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput fundingInstrumentPreferences;
    private final java.lang.String quoteId;
    private final java.lang.Object startDateTime;

    public CreateCryptocurrencyRecurringTradeSubscriptionInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeFrequency cryptocurrencyRecurringTradeFrequency, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput createCryptocurrencyFundingInstrumentPreferencesInput, java.lang.String str, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyRecurringTradeFrequency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyTradeAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCryptocurrencyFundingInstrumentPreferencesInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.frequency = cryptocurrencyRecurringTradeFrequency;
        this.action = cryptocurrencyTradeAction;
        this.assetSymbol = cryptocurrencyAssetSymbol;
        this.startDateTime = obj;
        this.fundingInstrumentPreferences = createCryptocurrencyFundingInstrumentPreferencesInput;
        this.quoteId = str;
        this.clientConfiguration = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeFrequency getFrequency() {
        return this.frequency;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction getAction() {
        return this.action;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.Object getStartDateTime() {
        return this.startDateTime;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput getFundingInstrumentPreferences() {
        return this.fundingInstrumentPreferences;
    }

    public final java.lang.String getQuoteId() {
        return this.quoteId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> getClientConfiguration() {
        return this.clientConfiguration;
    }

    public /* synthetic */ CreateCryptocurrencyRecurringTradeSubscriptionInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeFrequency cryptocurrencyRecurringTradeFrequency, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput createCryptocurrencyFundingInstrumentPreferencesInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptocurrencyRecurringTradeFrequency, cryptocurrencyTradeAction, cryptocurrencyAssetSymbol, obj, createCryptocurrencyFundingInstrumentPreferencesInput, str, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeFrequency cryptocurrencyRecurringTradeFrequency = this.frequency;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction = this.action;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
        java.lang.Object obj = this.startDateTime;
        com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput createCryptocurrencyFundingInstrumentPreferencesInput = this.fundingInstrumentPreferences;
        java.lang.String str = this.quoteId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> optional = this.clientConfiguration;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateCryptocurrencyRecurringTradeSubscriptionInput(frequency=");
        sb.append(cryptocurrencyRecurringTradeFrequency);
        sb.append(", action=");
        sb.append(cryptocurrencyTradeAction);
        sb.append(", assetSymbol=");
        sb.append(cryptocurrencyAssetSymbol);
        sb.append(", startDateTime=");
        sb.append(obj);
        sb.append(", fundingInstrumentPreferences=");
        sb.append(createCryptocurrencyFundingInstrumentPreferencesInput);
        sb.append(", quoteId=");
        sb.append(str);
        sb.append(", clientConfiguration=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.frequency.hashCode() * 31) + this.action.hashCode()) * 31) + this.assetSymbol.hashCode()) * 31) + this.startDateTime.hashCode()) * 31) + this.fundingInstrumentPreferences.hashCode()) * 31) + this.quoteId.hashCode()) * 31) + this.clientConfiguration.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyRecurringTradeSubscriptionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyRecurringTradeSubscriptionInput createCryptocurrencyRecurringTradeSubscriptionInput = (com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyRecurringTradeSubscriptionInput) other;
        return this.frequency == createCryptocurrencyRecurringTradeSubscriptionInput.frequency && this.action == createCryptocurrencyRecurringTradeSubscriptionInput.action && this.assetSymbol == createCryptocurrencyRecurringTradeSubscriptionInput.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.startDateTime, createCryptocurrencyRecurringTradeSubscriptionInput.startDateTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentPreferences, createCryptocurrencyRecurringTradeSubscriptionInput.fundingInstrumentPreferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.quoteId, createCryptocurrencyRecurringTradeSubscriptionInput.quoteId) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientConfiguration, createCryptocurrencyRecurringTradeSubscriptionInput.clientConfiguration);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyRecurringTradeSubscriptionInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeFrequency frequency, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction action, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.Object startDateTime, com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput fundingInstrumentPreferences, java.lang.String quoteId, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> clientConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentPreferences, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quoteId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientConfiguration, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyRecurringTradeSubscriptionInput(frequency, action, assetSymbol, startDateTime, fundingInstrumentPreferences, quoteId, clientConfiguration);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyClientConfigurationInput> component7() {
        return this.clientConfiguration;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getQuoteId() {
        return this.quoteId;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput getFundingInstrumentPreferences() {
        return this.fundingInstrumentPreferences;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Object getStartDateTime() {
        return this.startDateTime;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
        return this.assetSymbol;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction getAction() {
        return this.action;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeFrequency getFrequency() {
        return this.frequency;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyRecurringTradeSubscriptionInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyRecurringTradeSubscriptionInput createCryptocurrencyRecurringTradeSubscriptionInput, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeFrequency cryptocurrencyRecurringTradeFrequency, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput createCryptocurrencyFundingInstrumentPreferencesInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            cryptocurrencyRecurringTradeFrequency = createCryptocurrencyRecurringTradeSubscriptionInput.frequency;
        }
        if ((i & 2) != 0) {
            cryptocurrencyTradeAction = createCryptocurrencyRecurringTradeSubscriptionInput.action;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction2 = cryptocurrencyTradeAction;
        if ((i & 4) != 0) {
            cryptocurrencyAssetSymbol = createCryptocurrencyRecurringTradeSubscriptionInput.assetSymbol;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol2 = cryptocurrencyAssetSymbol;
        if ((i & 8) != 0) {
            obj = createCryptocurrencyRecurringTradeSubscriptionInput.startDateTime;
        }
        java.lang.Object obj3 = obj;
        if ((i & 16) != 0) {
            createCryptocurrencyFundingInstrumentPreferencesInput = createCryptocurrencyRecurringTradeSubscriptionInput.fundingInstrumentPreferences;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput createCryptocurrencyFundingInstrumentPreferencesInput2 = createCryptocurrencyFundingInstrumentPreferencesInput;
        if ((i & 32) != 0) {
            str = createCryptocurrencyRecurringTradeSubscriptionInput.quoteId;
        }
        java.lang.String str2 = str;
        if ((i & 64) != 0) {
            optional = createCryptocurrencyRecurringTradeSubscriptionInput.clientConfiguration;
        }
        return createCryptocurrencyRecurringTradeSubscriptionInput.copy(cryptocurrencyRecurringTradeFrequency, cryptocurrencyTradeAction2, cryptocurrencyAssetSymbol2, obj3, createCryptocurrencyFundingInstrumentPreferencesInput2, str2, optional);
    }
}

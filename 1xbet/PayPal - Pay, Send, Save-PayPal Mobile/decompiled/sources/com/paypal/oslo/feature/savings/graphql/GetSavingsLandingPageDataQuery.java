package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;", "savingsAccountFeaturesInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;", "getSavingsAccountFeaturesInput", "Companion", "Data", "SavingsAccountFeatures"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetSavingsLandingPageDataQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data> {
    public static final java.lang.String OPERATION_ID = "ad5239af4f64b2fb7bc105557a270d00dc0dd8dbf24d61f9a014b50134ba93be";
    public static final java.lang.String OPERATION_NAME = "GetSavingsLandingPageData";
    private final com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Companion(null);
    public static final int $stable = 8;

    public GetSavingsLandingPageDataQuery(com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountFeaturesInput, "");
        this.savingsAccountFeaturesInput = savingsAccountFeaturesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput getSavingsAccountFeaturesInput() {
        return this.savingsAccountFeaturesInput;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.GetSavingsLandingPageDataQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;", "savingsAccountFeatures", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;", "getSavingsAccountFeatures"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures savingsAccountFeatures;

        public Data(com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures savingsAccountFeatures) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountFeatures, "");
            this.savingsAccountFeatures = savingsAccountFeatures;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures getSavingsAccountFeatures() {
            return this.savingsAccountFeatures;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures savingsAccountFeatures = this.savingsAccountFeatures;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(savingsAccountFeatures=");
            sb.append(savingsAccountFeatures);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.savingsAccountFeatures.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountFeatures, ((com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data) other).savingsAccountFeatures);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data copy(com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures savingsAccountFeatures) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountFeatures, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data(savingsAccountFeatures);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures getSavingsAccountFeatures() {
            return this.savingsAccountFeatures;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data data, com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures savingsAccountFeatures, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsAccountFeatures = data.savingsAccountFeatures;
            }
            return data.copy(savingsAccountFeatures);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;", "", "annualPercentageYield", "countryCode", "", "marketingNationalAverageRateMultiplierText", "marketingNationalAverageReportDate", "marketingRateEffectiveDate", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getAnnualPercentageYield", "getCountryCode", "Ljava/lang/String;", "getMarketingNationalAverageRateMultiplierText", "getMarketingNationalAverageReportDate", "getMarketingRateEffectiveDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAccountFeatures {
        public static final int $stable = 8;
        private final java.lang.Object annualPercentageYield;
        private final java.lang.Object countryCode;
        private final java.lang.String marketingNationalAverageRateMultiplierText;
        private final java.lang.Object marketingNationalAverageReportDate;
        private final java.lang.Object marketingRateEffectiveDate;

        public SavingsAccountFeatures(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.Object obj3, java.lang.Object obj4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "");
            this.annualPercentageYield = obj;
            this.countryCode = obj2;
            this.marketingNationalAverageRateMultiplierText = str;
            this.marketingNationalAverageReportDate = obj3;
            this.marketingRateEffectiveDate = obj4;
        }

        public final java.lang.Object getAnnualPercentageYield() {
            return this.annualPercentageYield;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getMarketingNationalAverageRateMultiplierText() {
            return this.marketingNationalAverageRateMultiplierText;
        }

        public final java.lang.Object getMarketingNationalAverageReportDate() {
            return this.marketingNationalAverageReportDate;
        }

        public final java.lang.Object getMarketingRateEffectiveDate() {
            return this.marketingRateEffectiveDate;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.annualPercentageYield;
            java.lang.Object obj2 = this.countryCode;
            java.lang.String str = this.marketingNationalAverageRateMultiplierText;
            java.lang.Object obj3 = this.marketingNationalAverageReportDate;
            java.lang.Object obj4 = this.marketingRateEffectiveDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccountFeatures(annualPercentageYield=");
            sb.append(obj);
            sb.append(", countryCode=");
            sb.append(obj2);
            sb.append(", marketingNationalAverageRateMultiplierText=");
            sb.append(str);
            sb.append(", marketingNationalAverageReportDate=");
            sb.append(obj3);
            sb.append(", marketingRateEffectiveDate=");
            sb.append(obj4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.annualPercentageYield.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.marketingNationalAverageRateMultiplierText.hashCode()) * 31) + this.marketingNationalAverageReportDate.hashCode()) * 31) + this.marketingRateEffectiveDate.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures savingsAccountFeatures = (com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.annualPercentageYield, savingsAccountFeatures.annualPercentageYield) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, savingsAccountFeatures.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.marketingNationalAverageRateMultiplierText, savingsAccountFeatures.marketingNationalAverageRateMultiplierText) && kotlin.jvm.internal.Intrinsics.areEqual(this.marketingNationalAverageReportDate, savingsAccountFeatures.marketingNationalAverageReportDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.marketingRateEffectiveDate, savingsAccountFeatures.marketingRateEffectiveDate);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures copy(java.lang.Object annualPercentageYield, java.lang.Object countryCode, java.lang.String marketingNationalAverageRateMultiplierText, java.lang.Object marketingNationalAverageReportDate, java.lang.Object marketingRateEffectiveDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annualPercentageYield, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marketingNationalAverageRateMultiplierText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marketingNationalAverageReportDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marketingRateEffectiveDate, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures(annualPercentageYield, countryCode, marketingNationalAverageRateMultiplierText, marketingNationalAverageReportDate, marketingRateEffectiveDate);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getMarketingRateEffectiveDate() {
            return this.marketingRateEffectiveDate;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getMarketingNationalAverageReportDate() {
            return this.marketingNationalAverageReportDate;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMarketingNationalAverageRateMultiplierText() {
            return this.marketingNationalAverageRateMultiplierText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getAnnualPercentageYield() {
            return this.annualPercentageYield;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures savingsAccountFeatures, java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.Object obj3, java.lang.Object obj4, int i, java.lang.Object obj5) {
            if ((i & 1) != 0) {
                obj = savingsAccountFeatures.annualPercentageYield;
            }
            if ((i & 2) != 0) {
                obj2 = savingsAccountFeatures.countryCode;
            }
            java.lang.Object obj6 = obj2;
            if ((i & 4) != 0) {
                str = savingsAccountFeatures.marketingNationalAverageRateMultiplierText;
            }
            java.lang.String str2 = str;
            if ((i & 8) != 0) {
                obj3 = savingsAccountFeatures.marketingNationalAverageReportDate;
            }
            java.lang.Object obj7 = obj3;
            if ((i & 16) != 0) {
                obj4 = savingsAccountFeatures.marketingRateEffectiveDate;
            }
            return savingsAccountFeatures.copy(obj, obj6, str2, obj7, obj4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetSavingsLandingPageData($savingsAccountFeaturesInput: SavingsAccountFeaturesInput!) { savingsAccountFeatures(input: $savingsAccountFeaturesInput) { annualPercentageYield countryCode marketingNationalAverageRateMultiplierText marketingNationalAverageReportDate marketingRateEffectiveDate } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput = this.savingsAccountFeaturesInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSavingsLandingPageDataQuery(savingsAccountFeaturesInput=");
        sb.append(savingsAccountFeaturesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.savingsAccountFeaturesInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountFeaturesInput, ((com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery) other).savingsAccountFeaturesInput);
    }

    public final com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery copy(com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountFeaturesInput, "");
        return new com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery(savingsAccountFeaturesInput);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput getSavingsAccountFeaturesInput() {
        return this.savingsAccountFeaturesInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery getSavingsLandingPageDataQuery, com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            savingsAccountFeaturesInput = getSavingsLandingPageDataQuery.savingsAccountFeaturesInput;
        }
        return getSavingsLandingPageDataQuery.copy(savingsAccountFeaturesInput);
    }
}

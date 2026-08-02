package com.paypal.oslo.api.graphql.schema.type.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/adapter/ActivityFiltersInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityFiltersInput;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityFiltersInput;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/schema/type/ActivityFiltersInput;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityFiltersInput_InputAdapter implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput> {
    public static final com.paypal.oslo.api.graphql.schema.type.adapter.ActivityFiltersInput_InputAdapter INSTANCE = new com.paypal.oslo.api.graphql.schema.type.adapter.ActivityFiltersInput_InputAdapter();

    private ActivityFiltersInput_InputAdapter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.apollographql.apollo.api.Adapter
    public final com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        throw new java.lang.IllegalStateException("Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (value.getStartTime() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME);
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getStartTime());
        }
        if (value.getEndTime() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME);
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getEndTime());
        }
        if (value.getSearchText() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("searchText");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getSearchText());
        }
        if (value.getIncludeReportedTransactions() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("includeReportedTransactions");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableBooleanAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getIncludeReportedTransactions());
        }
        if (value.getPartnerIdentifiers() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("partnerIdentifiers");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPartnerIdentifiers());
        }
        if (value.getRegulatoryReasons() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("regulatoryReasons");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityRegulatoryReason_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getRegulatoryReasons());
        }
        if (value.getCryptoSymbols() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("cryptoSymbols");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getCryptoSymbols());
        }
        if (value.getCryptoAssetNames() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("cryptoAssetNames");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getCryptoAssetNames());
        }
        if (value.getCurrencies() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("currencies");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.AnyAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getCurrencies());
        }
        if (value.getBillingAgreementIds() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("billingAgreementIds");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getBillingAgreementIds());
        }
        if (value.getRecurringProfileIds() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("recurringProfileIds");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getRecurringProfileIds());
        }
        if (value.getIssuanceProductName() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("issuanceProductName");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getIssuanceProductName());
        }
        if (value.getMoneyMovementDirection() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("moneyMovementDirection");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.MoneyMovementDirection_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getMoneyMovementDirection());
        }
        if (value.getTypes() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("types");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityType_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getTypes());
        }
        if (value.getIds() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("ids");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getIds());
        }
        if (value.getStatuses() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("statuses");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityStatus_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getStatuses());
        }
        if (value.getChannels() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("channels");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityChannel_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getChannels());
        }
        if (value.getPurposes() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("purposes");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityPurpose_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPurposes());
        }
        if (value.getAccountIds() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("accountIds");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.AccountID.INSTANCE.getType())))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getAccountIds());
        }
        if (value.getEmails() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("emails");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.AnyAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getEmails());
        }
        if (value.getProductFundingType() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("productFundingType");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getProductFundingType());
        }
        if (value.getChannelPartnerIdentifiers() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("channelPartnerIdentifiers");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getChannelPartnerIdentifiers());
        }
        if (value.getFundingSourceTypes() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("fundingSourceTypes");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityFundingSourceType_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getFundingSourceTypes());
        }
        if (value.getPackageStatuses() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("packageStatuses");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingStatus_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPackageStatuses());
        }
        if (value.getProductFlows() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("productFlows");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getProductFlows());
        }
        if (value.getSortBy() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("sortBy");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.ActivitySortInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getSortBy());
        }
        if (value.getCategory() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("category");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.ActivityCategory_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getCategory());
        }
        if (value.getMoneyPoolIds() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("moneyPoolIds");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getMoneyPoolIds());
        }
        if (value.getMoneyPoolSubjectId() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("moneyPoolSubjectId");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.AccountID.INSTANCE.getType()))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getMoneyPoolSubjectId());
        }
    }
}

package com.paypal.oslo.feature.consumerprivacy.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetSearchPrivacySettingsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "PrivacySetting", "SearchPrivacy", "Granular", "Simplified", "Common"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetSearchPrivacySettingsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetSearchPrivacySettingsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("privacySetting");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting privacySetting = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                privacySetting = (com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.PrivacySetting.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data(privacySetting);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("privacySetting");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.PrivacySetting.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPrivacySetting());
        }
    }

    private GetSearchPrivacySettingsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetSearchPrivacySettingsQuery_ResponseAdapter$PrivacySetting;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$PrivacySetting;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PrivacySetting implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.PrivacySetting INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.PrivacySetting();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("searchPrivacy");
        public static final int $stable = 8;

        private PrivacySetting() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy searchPrivacy = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                searchPrivacy = (com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.SearchPrivacy.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (searchPrivacy != null) {
                return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting(searchPrivacy);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "searchPrivacy");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("searchPrivacy");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.SearchPrivacy.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getSearchPrivacy());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetSearchPrivacySettingsQuery_ResponseAdapter$SearchPrivacy;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$SearchPrivacy;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SearchPrivacy implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.SearchPrivacy INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.SearchPrivacy();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"searchPolicy", "searchEligible", "granular", "simplified", "common"});
        public static final int $stable = 8;

        private SearchPrivacy() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicyType = null;
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular = null;
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified = null;
            com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    searchPolicyType = com.paypal.oslo.api.graphql.schema.type.adapter.SearchPolicyType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    granular = (com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Granular.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    simplified = (com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Simplified.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    common2 = (com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Common.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (searchPolicyType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "searchPolicy");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy(searchPolicyType, bool.booleanValue(), granular, simplified, common2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "searchEligible");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("searchPolicy");
            com.paypal.oslo.api.graphql.schema.type.adapter.SearchPolicyType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getSearchPolicy());
            writer.name("searchEligible");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getSearchEligible()));
            writer.name("granular");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Granular.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getGranular());
            writer.name("simplified");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Simplified.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getSimplified());
            writer.name("common");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Common.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getCommon());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetSearchPrivacySettingsQuery_ResponseAdapter$Granular;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Granular;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Granular implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Granular INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Granular();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"allowRequestMoneyByEmail", "allowRequestMoneyByPhone", "allowRequestMoneyByName", "allowRequestMoneyByUsername", "allowSendMoneyByEmail", "allowSendMoneyByPhone", "allowSendMoneyByName", "allowSendMoneyByUsername"});
        public static final int $stable = 8;

        private Granular() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
        
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            java.lang.Boolean bool3 = null;
            java.lang.Boolean bool4 = null;
            java.lang.Boolean bool5 = null;
            java.lang.Boolean bool6 = null;
            java.lang.Boolean bool7 = null;
            java.lang.Boolean bool8 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool2 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool3 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool4 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool5 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool6 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool7 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool8 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("allowRequestMoneyByEmail");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowRequestMoneyByEmail());
            writer.name("allowRequestMoneyByPhone");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowRequestMoneyByPhone());
            writer.name("allowRequestMoneyByName");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowRequestMoneyByName());
            writer.name("allowRequestMoneyByUsername");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowRequestMoneyByUsername());
            writer.name("allowSendMoneyByEmail");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowSendMoneyByEmail());
            writer.name("allowSendMoneyByPhone");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowSendMoneyByPhone());
            writer.name("allowSendMoneyByName");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowSendMoneyByName());
            writer.name("allowSendMoneyByUsername");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowSendMoneyByUsername());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetSearchPrivacySettingsQuery_ResponseAdapter$Simplified;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Simplified;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Simplified implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Simplified INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Simplified();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"allowFindByIdentifiers", "allowPaymentRequests", "paymentRequestsFrom", "allowFindByName", "allowFindByUsername", "allowFindByEmailAndPhone"});
        public static final int $stable = 8;

        private Simplified() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType = null;
            java.lang.Boolean bool3 = null;
            java.lang.Boolean bool4 = null;
            java.lang.Boolean bool5 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool2 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    paymentRequestsFromType = (com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PaymentRequestsFromType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    bool3 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    bool4 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 5) {
                    bool5 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified(bool, bool2, paymentRequestsFromType, bool3, bool4, bool5);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("allowFindByIdentifiers");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowFindByIdentifiers());
            writer.name("allowPaymentRequests");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowPaymentRequests());
            writer.name("paymentRequestsFrom");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PaymentRequestsFromType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getPaymentRequestsFrom());
            writer.name("allowFindByName");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowFindByName());
            writer.name("allowFindByUsername");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowFindByUsername());
            writer.name("allowFindByEmailAndPhone");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowFindByEmailAndPhone());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetSearchPrivacySettingsQuery_ResponseAdapter$Common;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Common;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Common implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Common INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetSearchPrivacySettingsQuery_ResponseAdapter.Common();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"allowFindViaPayPalMe", "paypalMePersonalProfileId", "allowVenmoDiscovery"});
        public static final int $stable = 8;

        private Common() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.String str = null;
            java.lang.Boolean bool2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    bool2 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common(bool, str, bool2);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("allowFindViaPayPalMe");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowFindViaPayPalMe());
            writer.name("paypalMePersonalProfileId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPaypalMePersonalProfileId());
            writer.name("allowVenmoDiscovery");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowVenmoDiscovery());
        }
    }
}

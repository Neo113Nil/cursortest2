package com.paypal.oslo.feature.consumerprivacy.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "ConnectedAppsAndSitesConsent", "OnConnectedAppsAndSitesAuthConsent", "Permission", "OnConnectedAppsAndSitesProviderConsent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("connectedAppsAndSitesConsents");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.ConnectedAppsAndSitesConsent.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "connectedAppsAndSitesConsents");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("connectedAppsAndSitesConsents");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.ConnectedAppsAndSitesConsent.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getConnectedAppsAndSitesConsents());
        }
    }

    private GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter$ConnectedAppsAndSitesConsent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$ConnectedAppsAndSitesConsent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$ConnectedAppsAndSitesConsent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$ConnectedAppsAndSitesConsent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConnectedAppsAndSitesConsent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.ConnectedAppsAndSitesConsent INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.ConnectedAppsAndSitesConsent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "id", "category", "appId", "appName", "externalUserId"});
        public static final int $stable = 8;

        private ConnectedAppsAndSitesConsent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent onConnectedAppsAndSitesAuthConsent;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    connectedAppsAndSitesCategory = com.paypal.oslo.api.graphql.schema.type.adapter.ConnectedAppsAndSitesCategory_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    str5 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("ConnectedAppsAndSitesAuthConsent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onConnectedAppsAndSitesAuthConsent = com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.OnConnectedAppsAndSitesAuthConsent.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onConnectedAppsAndSitesAuthConsent = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("ConnectedAppsAndSitesProviderConsent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onConnectedAppsAndSitesProviderConsent = com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.OnConnectedAppsAndSitesProviderConsent.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent2 = onConnectedAppsAndSitesProviderConsent;
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (connectedAppsAndSitesCategory == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "category");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str3 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "appId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str4 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "appName");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str5 != null) {
                return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent(str, str2, connectedAppsAndSitesCategory, str3, str4, str5, onConnectedAppsAndSitesAuthConsent, onConnectedAppsAndSitesProviderConsent2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "externalUserId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("category");
            com.paypal.oslo.api.graphql.schema.type.adapter.ConnectedAppsAndSitesCategory_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCategory());
            writer.name("appId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getAppId());
            writer.name("appName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getAppName());
            writer.name("externalUserId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getExternalUserId());
            if (value.getOnConnectedAppsAndSitesAuthConsent() != null) {
                com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.OnConnectedAppsAndSitesAuthConsent.INSTANCE.toJson(writer, customScalarAdapters, value.getOnConnectedAppsAndSitesAuthConsent());
            }
            if (value.getOnConnectedAppsAndSitesProviderConsent() != null) {
                com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.OnConnectedAppsAndSitesProviderConsent.INSTANCE.toJson(writer, customScalarAdapters, value.getOnConnectedAppsAndSitesProviderConsent());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter$OnConnectedAppsAndSitesAuthConsent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnConnectedAppsAndSitesAuthConsent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.OnConnectedAppsAndSitesAuthConsent INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.OnConnectedAppsAndSitesAuthConsent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "category", "appId", "appName", "externalUserId", "status", "grantTime", "expiryTime", "revokedTime", "consumerDataRightsArrangementId", "grantId", "isUnifiedAccountLinkingClient", "permissions"});
        public static final int $stable = 8;

        private OnConnectedAppsAndSitesAuthConsent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if (r8 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            if (r3 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent(r4, r5, r6, r7, r8, r9, r10, r11, r12, r18, r17, r3.booleanValue(), r16);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0109, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "isUnifiedAccountLinkingClient");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0113, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0114, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "externalUserId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x011e, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x011f, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "appName");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0129, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x012a, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "appId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0134, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0135, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "category");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x013f, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0140, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x014a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        
            r18 = r13;
            r17 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
        
            if (r4 == null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
        
            if (r5 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        
            if (r6 == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        
            if (r7 == null) goto L32;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus connectedAppsAndSitesConsentStatus = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.util.List list = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        connectedAppsAndSitesCategory = com.paypal.oslo.api.graphql.schema.type.adapter.ConnectedAppsAndSitesCategory_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        str5 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        connectedAppsAndSitesConsentStatus = (com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ConnectedAppsAndSitesConsentStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 9:
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 10:
                        str = str6;
                        str7 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 12:
                        str = str6;
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.Permission.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        str7 = str7;
                        break;
                }
                str6 = str;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("category");
            com.paypal.oslo.api.graphql.schema.type.adapter.ConnectedAppsAndSitesCategory_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCategory());
            writer.name("appId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getAppId());
            writer.name("appName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getAppName());
            writer.name("externalUserId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getExternalUserId());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ConnectedAppsAndSitesConsentStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("grantTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getGrantTime());
            writer.name("expiryTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getExpiryTime());
            writer.name("revokedTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getRevokedTime());
            writer.name("consumerDataRightsArrangementId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getConsumerDataRightsArrangementId());
            writer.name("grantId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getGrantId());
            writer.name("isUnifiedAccountLinkingClient");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isUnifiedAccountLinkingClient()));
            writer.name("permissions");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.Permission.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getPermissions());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter$Permission;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Permission;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Permission;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Permission;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Permission implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.Permission INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.Permission();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"key", "values", "sharingStartTime"});
        public static final int $stable = 8;

        private Permission() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.util.List list = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission(str, list, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "key");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("key");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getKey());
            writer.name("values");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter)).toJson(writer, customScalarAdapters, value.getValues());
            writer.name("sharingStartTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getSharingStartTime());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter$OnConnectedAppsAndSitesProviderConsent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnConnectedAppsAndSitesProviderConsent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.OnConnectedAppsAndSitesProviderConsent INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.OnConnectedAppsAndSitesProviderConsent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "category", "appId", "appName", "externalUserId", "providerName"});
        public static final int $stable = 8;

        private OnConnectedAppsAndSitesProviderConsent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    connectedAppsAndSitesCategory = com.paypal.oslo.api.graphql.schema.type.adapter.ConnectedAppsAndSitesCategory_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    str5 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (connectedAppsAndSitesCategory == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "category");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "appId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str3 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "appName");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str4 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "externalUserId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str5 != null) {
                return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent(str, connectedAppsAndSitesCategory, str2, str3, str4, str5);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "providerName");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("category");
            com.paypal.oslo.api.graphql.schema.type.adapter.ConnectedAppsAndSitesCategory_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCategory());
            writer.name("appId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getAppId());
            writer.name("appName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getAppName());
            writer.name("externalUserId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getExternalUserId());
            writer.name("providerName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getProviderName());
        }
    }
}

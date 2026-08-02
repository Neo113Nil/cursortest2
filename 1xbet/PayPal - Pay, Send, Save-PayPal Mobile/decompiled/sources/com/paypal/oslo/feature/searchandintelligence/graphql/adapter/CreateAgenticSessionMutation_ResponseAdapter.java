package com.paypal.oslo.feature.searchandintelligence.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OPERATION_NAME, "Session", "Item", "OnAgenticTextChatResponseComponent", "OnAgenticCategoryCarouselComponent", "Item1", "AgenticCommerceItemCarouselComponent", "Item2", "CommerceItem", "CurrentPrice", "ListPrice", "Store", "Details", "OnAgenticProductCarouselComponent", "Item3", "Product", "CurrentPrice1", "ListPrice1", "Store1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreateAgenticSessionMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("createAgenticSession");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                createAgenticSession = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CreateAgenticSession.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (createAgenticSession != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data(createAgenticSession);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "createAgenticSession");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("createAgenticSession");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CreateAgenticSession.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getCreateAgenticSession());
        }
    }

    private CreateAgenticSessionMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$CreateAgenticSession;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreateAgenticSession implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CreateAgenticSession INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CreateAgenticSession();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"session", "items"});
        public static final int $stable = 8;

        private CreateAgenticSession() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    session = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Session.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession(session, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "items");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("session");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Session.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getSession());
            writer.name("items");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getItems());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Session;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Session implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Session INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Session();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("id");
        public static final int $stable = 8;

        private Session() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session(obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Item() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent onAgenticTextChatResponseComponent;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent onAgenticCategoryCarouselComponent;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent onAgenticProductCarouselComponent = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("AgenticTextChatResponseComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onAgenticTextChatResponseComponent = com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticTextChatResponseComponent.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onAgenticTextChatResponseComponent = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("AgenticCategoryCarouselComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onAgenticCategoryCarouselComponent = com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticCategoryCarouselComponent.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onAgenticCategoryCarouselComponent = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("AgenticProductCarouselComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onAgenticProductCarouselComponent = com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticProductCarouselComponent.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item(str, onAgenticTextChatResponseComponent, onAgenticCategoryCarouselComponent, onAgenticProductCarouselComponent);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnAgenticTextChatResponseComponent() != null) {
                com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticTextChatResponseComponent.INSTANCE.toJson(writer, customScalarAdapters, value.getOnAgenticTextChatResponseComponent());
            }
            if (value.getOnAgenticCategoryCarouselComponent() != null) {
                com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticCategoryCarouselComponent.INSTANCE.toJson(writer, customScalarAdapters, value.getOnAgenticCategoryCarouselComponent());
            }
            if (value.getOnAgenticProductCarouselComponent() != null) {
                com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticProductCarouselComponent.INSTANCE.toJson(writer, customScalarAdapters, value.getOnAgenticProductCarouselComponent());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$OnAgenticTextChatResponseComponent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnAgenticTextChatResponseComponent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticTextChatResponseComponent INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticTextChatResponseComponent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("text");
        public static final int $stable = 8;

        private OnAgenticTextChatResponseComponent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "text");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("text");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getText());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$OnAgenticCategoryCarouselComponent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnAgenticCategoryCarouselComponent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticCategoryCarouselComponent INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticCategoryCarouselComponent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("items");
        public static final int $stable = 8;

        private OnAgenticCategoryCarouselComponent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "items");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("items");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getItems());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item1 INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "primaryImageUrl", "reasoningText", "reasoningCode", "agenticCommerceItemCarouselComponent"});
        public static final int $stable = 8;

        private Item1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent agenticCommerceItemCarouselComponent = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    agenticCommerceItemCarouselComponent = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.AgenticCommerceItemCarouselComponent.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1(str, obj, str2, str3, agenticCommerceItemCarouselComponent);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("primaryImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrimaryImageUrl());
            writer.name("reasoningText");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getReasoningText());
            writer.name("reasoningCode");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getReasoningCode());
            writer.name("agenticCommerceItemCarouselComponent");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.AgenticCommerceItemCarouselComponent.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAgenticCommerceItemCarouselComponent());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$AgenticCommerceItemCarouselComponent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AgenticCommerceItemCarouselComponent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.AgenticCommerceItemCarouselComponent INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.AgenticCommerceItemCarouselComponent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("items");
        public static final int $stable = 8;

        private AgenticCommerceItemCarouselComponent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item2.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "items");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("items");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item2.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getItems());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Item2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item2;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item2;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item2;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item2 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item2 INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item2();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"commerceItem", "checkoutEnabled", "details", "promotionalMessage"});
        public static final int $stable = 8;

        private Item2() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem commerceItem = null;
            java.lang.Boolean bool = null;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details details = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    commerceItem = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CommerceItem.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    details = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Details.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (commerceItem != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2(commerceItem, bool, details, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "commerceItem");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("commerceItem");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CommerceItem.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getCommerceItem());
            writer.name("checkoutEnabled");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getCheckoutEnabled());
            writer.name("details");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Details.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getDetails());
            writer.name("promotionalMessage");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPromotionalMessage());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$CommerceItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CommerceItem implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CommerceItem INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CommerceItem();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "name", "brand", "info", "primaryImageUrl", "secondaryImageUrls", "canonicalUrl", "currentPrice", "listPrice", com.google.android.libraries.places.api.model.PlaceTypes.STORE});
        public static final int $stable = 8;

        private CommerceItem() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x00c0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        
            if (r2 == null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00b6, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "id");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.Object obj = null;
            java.util.List list = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice currentPrice = null;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice listPrice = null;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store store = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.AnyAdapter)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        currentPrice = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CurrentPrice.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        listPrice = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.ListPrice.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        store = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Store.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("brand");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getBrand());
            writer.name("info");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getInfo());
            writer.name("primaryImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrimaryImageUrl());
            writer.name("secondaryImageUrls");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.AnyAdapter)).toJson(writer, customScalarAdapters, value.getSecondaryImageUrls());
            writer.name("canonicalUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getCanonicalUrl());
            writer.name("currentPrice");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CurrentPrice.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getCurrentPrice());
            writer.name("listPrice");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.ListPrice.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getListPrice());
            writer.name(com.google.android.libraries.places.api.model.PlaceTypes.STORE);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Store.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getStore());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$CurrentPrice;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CurrentPrice implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CurrentPrice INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CurrentPrice();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CurrentPrice() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields fromJson = com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFieldsImpl_ResponseAdapter.MoneyFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFieldsImpl_ResponseAdapter.MoneyFields.INSTANCE.toJson(writer, customScalarAdapters, value.getMoneyFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$ListPrice;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ListPrice implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.ListPrice INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.ListPrice();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ListPrice() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields fromJson = com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFieldsImpl_ResponseAdapter.MoneyFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFieldsImpl_ResponseAdapter.MoneyFields.INSTANCE.toJson(writer, customScalarAdapters, value.getMoneyFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Store;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Store implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Store INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Store();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Store() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields fromJson = com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFieldsImpl_ResponseAdapter.StoreFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFieldsImpl_ResponseAdapter.StoreFields.INSTANCE.toJson(writer, customScalarAdapters, value.getStoreFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Details;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Details implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Details INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Details();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "flavor", io.ktor.http.ContentDisposition.Parameters.Size});
        public static final int $stable = 8;

        private Details() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details(str, str2, str3);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getColor());
            writer.name("flavor");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFlavor());
            writer.name(io.ktor.http.ContentDisposition.Parameters.Size);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSize());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$OnAgenticProductCarouselComponent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnAgenticProductCarouselComponent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticProductCarouselComponent INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.OnAgenticProductCarouselComponent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("items");
        public static final int $stable = 8;

        private OnAgenticProductCarouselComponent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item3.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "items");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("items");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item3.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getItems());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Item3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item3;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item3;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item3;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item3 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item3 INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Item3();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"product", "promotionalMessage"});
        public static final int $stable = 8;

        private Item3() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product product = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    product = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Product.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (product != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3(product, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "product");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("product");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Product.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getProduct());
            writer.name("promotionalMessage");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPromotionalMessage());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Product implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Product INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Product();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "title", "primaryImageUrl", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "currentPrice", "archived", "brand", "categories", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "additionalImageUrls", "parentId", "variantId", "listPrice", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "updatedTime"});
        public static final int $stable = 8;

        private Product() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            if (r16 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            if (r17 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00f5, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, com.google.android.libraries.places.api.model.PlaceTypes.STORE);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00ff, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0100, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "listPrice");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x010a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x010b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "parentId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0115, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0116, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "categories");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0120, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0121, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "currentPrice");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x012b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x012c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "title");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0136, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0137, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0141, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        
            if (r4 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
        
            if (r5 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
        
            if (r8 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        
            if (r11 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        
            if (r14 == null) goto L33;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
            java.lang.Boolean bool = null;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 currentPrice1 = null;
            java.lang.Boolean bool2 = null;
            java.lang.String str3 = null;
            java.util.List list = null;
            java.lang.String str4 = null;
            java.util.List list2 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 listPrice1 = null;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 store1 = null;
            java.lang.Object obj2 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        currentPrice1 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CurrentPrice1.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool2 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.AnyAdapter)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        str5 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        listPrice1 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.ListPrice1.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        store1 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Store1.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("title");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTitle());
            writer.name("primaryImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrimaryImageUrl());
            writer.name(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY);
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAvailable());
            writer.name("currentPrice");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CurrentPrice1.INSTANCE, true).toJson(writer, customScalarAdapters, value.getCurrentPrice());
            writer.name("archived");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getArchived());
            writer.name("brand");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getBrand());
            writer.name("categories");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getCategories());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDescription());
            writer.name("additionalImageUrls");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.AnyAdapter)).toJson(writer, customScalarAdapters, value.getAdditionalImageUrls());
            writer.name("parentId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getParentId());
            writer.name("variantId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getVariantId());
            writer.name("listPrice");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.ListPrice1.INSTANCE, true).toJson(writer, customScalarAdapters, value.getListPrice());
            writer.name(com.google.android.libraries.places.api.model.PlaceTypes.STORE);
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Store1.INSTANCE, true).toJson(writer, customScalarAdapters, value.getStore());
            writer.name("updatedTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getUpdatedTime());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$CurrentPrice1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CurrentPrice1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CurrentPrice1 INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.CurrentPrice1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CurrentPrice1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields fromJson = com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFieldsImpl_ResponseAdapter.MoneyFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFieldsImpl_ResponseAdapter.MoneyFields.INSTANCE.toJson(writer, customScalarAdapters, value.getMoneyFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$ListPrice1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ListPrice1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.ListPrice1 INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.ListPrice1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ListPrice1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields fromJson = com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFieldsImpl_ResponseAdapter.MoneyFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFieldsImpl_ResponseAdapter.MoneyFields.INSTANCE.toJson(writer, customScalarAdapters, value.getMoneyFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/adapter/CreateAgenticSessionMutation_ResponseAdapter$Store1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Store1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1> {
        public static final com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Store1 INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Store1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Store1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields fromJson = com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFieldsImpl_ResponseAdapter.StoreFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFieldsImpl_ResponseAdapter.StoreFields.INSTANCE.toJson(writer, customScalarAdapters, value.getStoreFields());
        }
    }
}

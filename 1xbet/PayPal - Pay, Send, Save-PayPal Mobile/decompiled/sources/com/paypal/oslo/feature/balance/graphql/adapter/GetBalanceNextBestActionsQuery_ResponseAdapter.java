package com.paypal.oslo.feature.balance.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/adapter/GetBalanceNextBestActionsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "MoneyManagementNextBestAction", "Icon", "OnMoneyManagementDestinationNextBestAction", "OnMoneyManagementURLNextBestAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBalanceNextBestActionsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/adapter/GetBalanceNextBestActionsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Data> {
        public static final com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("moneyManagementNextBestActions");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.MoneyManagementNextBestAction.INSTANCE, true))).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Data(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("moneyManagementNextBestActions");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.MoneyManagementNextBestAction.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getMoneyManagementNextBestActions());
        }
    }

    private GetBalanceNextBestActionsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/adapter/GetBalanceNextBestActionsQuery_ResponseAdapter$MoneyManagementNextBestAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$MoneyManagementNextBestAction;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$MoneyManagementNextBestAction;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$MoneyManagementNextBestAction;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MoneyManagementNextBestAction implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction> {
        public static final com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.MoneyManagementNextBestAction INSTANCE = new com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.MoneyManagementNextBestAction();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "trackingId", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "icon", "navigationType", "isAuthenticationRequired"});
        public static final int $stable = 8;

        private MoneyManagementNextBestAction() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x00a0, code lost:
        
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("MoneyManagementURLNextBestAction"), r14.falseVariables, r2, r14.deferredFragmentIdentifiers, null) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00a2, code lost:
        
            r13.rewind();
            r0 = com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.OnMoneyManagementURLNextBestAction.INSTANCE.fromJson(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00ab, code lost:
        
            r10 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00ac, code lost:
        
            if (r3 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00ae, code lost:
        
            if (r4 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00b0, code lost:
        
            if (r1 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00bc, code lost:
        
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction(r2, r3, r4, r5, r6, r7, r1.booleanValue(), r9, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "isAuthenticationRequired");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "title");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "trackingId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
        
            r9 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
        
            throw new java.lang.IllegalStateException("__typename was not found".toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r2 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
        
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("MoneyManagementDestinationNextBestAction"), r14.falseVariables, r2, r14.deferredFragmentIdentifiers, null) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        
            r13.rewind();
            r9 = com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.OnMoneyManagementDestinationNextBestAction.INSTANCE.fromJson(r13, r14);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementURLNextBestAction onMoneyManagementURLNextBestAction = null;
            java.lang.Boolean bool = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Icon icon = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionNavigationType moneyManagementNextBestActionNavigationType = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        icon = (com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Icon) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.Icon.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        moneyManagementNextBestActionNavigationType = (com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionNavigationType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.MoneyManagementNextBestActionNavigationType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("trackingId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTrackingId());
            writer.name("title");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTitle());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDescription());
            writer.name("icon");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.Icon.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getIcon());
            writer.name("navigationType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.MoneyManagementNextBestActionNavigationType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getNavigationType());
            writer.name("isAuthenticationRequired");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isAuthenticationRequired()));
            if (value.getOnMoneyManagementDestinationNextBestAction() != null) {
                com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.OnMoneyManagementDestinationNextBestAction.INSTANCE.toJson(writer, customScalarAdapters, value.getOnMoneyManagementDestinationNextBestAction());
            }
            if (value.getOnMoneyManagementURLNextBestAction() != null) {
                com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.OnMoneyManagementURLNextBestAction.INSTANCE.toJson(writer, customScalarAdapters, value.getOnMoneyManagementURLNextBestAction());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/adapter/GetBalanceNextBestActionsQuery_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$Icon;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$Icon;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$Icon;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Icon implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Icon> {
        public static final com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.Icon INSTANCE = new com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.Icon();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"url", "alt"});
        public static final int $stable = 8;

        private Icon() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Icon fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Icon(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "url");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Icon value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("url");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getUrl());
            writer.name("alt");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAlt());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/adapter/GetBalanceNextBestActionsQuery_ResponseAdapter$OnMoneyManagementDestinationNextBestAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$OnMoneyManagementDestinationNextBestAction;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$OnMoneyManagementDestinationNextBestAction;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$OnMoneyManagementDestinationNextBestAction;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnMoneyManagementDestinationNextBestAction implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementDestinationNextBestAction> {
        public static final com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.OnMoneyManagementDestinationNextBestAction INSTANCE = new com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.OnMoneyManagementDestinationNextBestAction();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("destinationId");
        public static final int $stable = 8;

        private OnMoneyManagementDestinationNextBestAction() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementDestinationNextBestAction fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementDestinationNextBestAction(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "destinationId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementDestinationNextBestAction value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("destinationId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getDestinationId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/adapter/GetBalanceNextBestActionsQuery_ResponseAdapter$OnMoneyManagementURLNextBestAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$OnMoneyManagementURLNextBestAction;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$OnMoneyManagementURLNextBestAction;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery$OnMoneyManagementURLNextBestAction;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnMoneyManagementURLNextBestAction implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementURLNextBestAction> {
        public static final com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.OnMoneyManagementURLNextBestAction INSTANCE = new com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_ResponseAdapter.OnMoneyManagementURLNextBestAction();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("url");
        public static final int $stable = 8;

        private OnMoneyManagementURLNextBestAction() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementURLNextBestAction fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementURLNextBestAction(obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "url");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementURLNextBestAction value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("url");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getUrl());
        }
    }
}

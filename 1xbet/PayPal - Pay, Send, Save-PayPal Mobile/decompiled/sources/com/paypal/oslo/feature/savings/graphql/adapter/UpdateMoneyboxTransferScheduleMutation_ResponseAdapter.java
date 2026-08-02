package com.paypal.oslo.feature.savings.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/UpdateMoneyboxTransferScheduleMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.OPERATION_NAME, "TransferSchedule", "ReloadAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UpdateMoneyboxTransferScheduleMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/UpdateMoneyboxTransferScheduleMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("updateMoneyboxTransferSchedule");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule updateMoneyboxTransferSchedule = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                updateMoneyboxTransferSchedule = (com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.UpdateMoneyboxTransferSchedule.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (updateMoneyboxTransferSchedule != null) {
                return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data(updateMoneyboxTransferSchedule);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "updateMoneyboxTransferSchedule");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("updateMoneyboxTransferSchedule");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.UpdateMoneyboxTransferSchedule.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getUpdateMoneyboxTransferSchedule());
        }
    }

    private UpdateMoneyboxTransferScheduleMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/UpdateMoneyboxTransferScheduleMutation_ResponseAdapter$UpdateMoneyboxTransferSchedule;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdateMoneyboxTransferSchedule implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.UpdateMoneyboxTransferSchedule INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.UpdateMoneyboxTransferSchedule();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"success", "transferSchedule"});
        public static final int $stable = 8;

        private UpdateMoneyboxTransferSchedule() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    transferSchedule = (com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.TransferSchedule.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule(bool.booleanValue(), transferSchedule);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "success");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("success");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getSuccess()));
            writer.name("transferSchedule");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.TransferSchedule.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getTransferSchedule());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/UpdateMoneyboxTransferScheduleMutation_ResponseAdapter$TransferSchedule;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TransferSchedule implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.TransferSchedule INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.TransferSchedule();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "startDate", "recurrence", "financialInstrumentId", "reloadAmount", "status"});
        public static final int $stable = 8;

        private TransferSchedule() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence moneyboxScheduleRecurrence = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount reloadAmount = null;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    moneyboxScheduleRecurrence = com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxScheduleRecurrence_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    reloadAmount = (com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.ReloadAmount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    moneyboxScheduleStatus = com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxScheduleStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "startDate");
                throw new kotlin.KotlinNothingValueException();
            }
            if (moneyboxScheduleRecurrence == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "recurrence");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "financialInstrumentId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (reloadAmount == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "reloadAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (moneyboxScheduleStatus != null) {
                return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule(str, obj, moneyboxScheduleRecurrence, str2, reloadAmount, moneyboxScheduleStatus);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("startDate");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getStartDate());
            writer.name("recurrence");
            com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxScheduleRecurrence_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getRecurrence());
            writer.name("financialInstrumentId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getFinancialInstrumentId());
            writer.name("reloadAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.ReloadAmount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getReloadAmount());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.MoneyboxScheduleStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/UpdateMoneyboxTransferScheduleMutation_ResponseAdapter$ReloadAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ReloadAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.ReloadAmount INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.ReloadAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private ReloadAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }
}

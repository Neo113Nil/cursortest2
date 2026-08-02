package com.paypal.oslo.feature.wallet.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetBankAccountQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "BankAccount", "Confirmation", "Issuer", "InstitutionImage", "Status", "Authorization"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetBankAccountQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetBankAccountQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("bankAccount");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount bankAccount = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                bankAccount = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.BankAccount.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data(bankAccount);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("bankAccount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.BankAccount.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBankAccount());
        }
    }

    private GetBankAccountQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetBankAccountQuery_ResponseAdapter$BankAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BankAccount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.BankAccount INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.BankAccount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "lastNChars", "type", "availableActions", "currencyCode", "confirmation", "isSepaCompliant", "issuer", "institutionImages", "nickname", "onboardingEntity", "status", "authorization"});
        public static final int $stable = 8;

        private BankAccount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0021. Please report as an issue. */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity bankAccountOnboardingEntity;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = null;
            java.util.List list = null;
            java.lang.Object obj = null;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation confirmation = null;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer issuer = null;
            java.util.List list2 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity bankAccountOnboardingEntity2 = null;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status3 = null;
            com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization authorization = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        status2 = status3;
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        status3 = status2;
                    case 1:
                        status2 = status3;
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        status3 = status2;
                    case 2:
                        status2 = status3;
                        bankAccountType = com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        status3 = status2;
                    case 3:
                        status2 = status3;
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountAvailableAction_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                        status3 = status2;
                    case 4:
                        status2 = status3;
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        status3 = status2;
                    case 5:
                        bankAccountOnboardingEntity = bankAccountOnboardingEntity2;
                        status = status3;
                        confirmation = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Confirmation.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        status3 = status;
                        bankAccountOnboardingEntity2 = bankAccountOnboardingEntity;
                    case 6:
                        status2 = status3;
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        status3 = status2;
                    case 7:
                        bankAccountOnboardingEntity = bankAccountOnboardingEntity2;
                        status = status3;
                        issuer = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Issuer.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                        status3 = status;
                        bankAccountOnboardingEntity2 = bankAccountOnboardingEntity;
                    case 8:
                        bankAccountOnboardingEntity = bankAccountOnboardingEntity2;
                        status = status3;
                        list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.InstitutionImage.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        status3 = status;
                        bankAccountOnboardingEntity2 = bankAccountOnboardingEntity;
                    case 9:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                    case 10:
                        bankAccountOnboardingEntity2 = (com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountOnboardingEntity_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                    case 11:
                        bankAccountOnboardingEntity = bankAccountOnboardingEntity2;
                        status3 = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Status.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        bankAccountOnboardingEntity2 = bankAccountOnboardingEntity;
                    case 12:
                        bankAccountOnboardingEntity = bankAccountOnboardingEntity2;
                        status = status3;
                        authorization = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Authorization.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        status3 = status;
                        bankAccountOnboardingEntity2 = bankAccountOnboardingEntity;
                }
                com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity bankAccountOnboardingEntity3 = bankAccountOnboardingEntity2;
                com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status4 = status3;
                if (str == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (str2 == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "lastNChars");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (bankAccountType == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "type");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (issuer != null) {
                        return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount(str, str2, bankAccountType, list, obj, confirmation, booleanValue, issuer, list2, str3, bankAccountOnboardingEntity3, status4, authorization);
                    }
                    com.apollographql.apollo.api.Assertions.missingField(reader, "issuer");
                    throw new kotlin.KotlinNothingValueException();
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "isSepaCompliant");
                throw new kotlin.KotlinNothingValueException();
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("lastNChars");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getLastNChars());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("availableActions");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountAvailableAction_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getAvailableActions());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name("confirmation");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Confirmation.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getConfirmation());
            writer.name("isSepaCompliant");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isSepaCompliant()));
            writer.name("issuer");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Issuer.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getIssuer());
            writer.name("institutionImages");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.InstitutionImage.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getInstitutionImages());
            writer.name("nickname");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNickname());
            writer.name("onboardingEntity");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountOnboardingEntity_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getOnboardingEntity());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Status.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("authorization");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Authorization.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAuthorization());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetBankAccountQuery_ResponseAdapter$Confirmation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Confirmation;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Confirmation implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Confirmation INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Confirmation();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"method", "realTimePaymentsDepositStatus", "status", "initiationTime", "state"});
        public static final int $stable = 8;

        private Confirmation() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod = null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus bankAccountRealTimePaymentsDepositStatus = null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bankAccountConfirmationMethod = (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountConfirmationMethod_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bankAccountRealTimePaymentsDepositStatus = (com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountRealTimePaymentsDepositStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    bankAccountConfirmationStatus = com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountConfirmationStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    bankAccountConfirmationState = (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountConfirmationState_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                }
            }
            if (bankAccountConfirmationStatus != null) {
                return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation(bankAccountConfirmationMethod, bankAccountRealTimePaymentsDepositStatus, bankAccountConfirmationStatus, obj, bankAccountConfirmationState);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("method");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountConfirmationMethod_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getMethod());
            writer.name("realTimePaymentsDepositStatus");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountRealTimePaymentsDepositStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getRealTimePaymentsDepositStatus());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountConfirmationStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("initiationTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getInitiationTime());
            writer.name("state");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountConfirmationState_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getState());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetBankAccountQuery_ResponseAdapter$Issuer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Issuer;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Issuer implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Issuer INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Issuer();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"countryCode", "name"});
        public static final int $stable = 8;

        private Issuer() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "countryCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetBankAccountQuery_ResponseAdapter$InstitutionImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$InstitutionImage;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$InstitutionImage;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$InstitutionImage;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InstitutionImage implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.InstitutionImage INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.InstitutionImage();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"url", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "width", "height", "category"});
        public static final int $stable = 8;

        private InstitutionImage() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.Integer num = null;
            java.lang.Integer num2 = null;
            com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    num = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    num2 = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    institutionImageCategory = com.paypal.oslo.api.graphql.schema.type.adapter.InstitutionImageCategory_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (institutionImageCategory != null) {
                return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage(obj, str, num, num2, institutionImageCategory);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "category");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("url");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getUrl());
            writer.name(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMimeType());
            writer.name("width");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getWidth());
            writer.name("height");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getHeight());
            writer.name("category");
            com.paypal.oslo.api.graphql.schema.type.adapter.InstitutionImageCategory_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCategory());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetBankAccountQuery_ResponseAdapter$Status;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Status;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Status implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Status INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Status();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"reason", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private Status() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    bankAccountStatus = com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (bankAccountStatus != null) {
                return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status(str, bankAccountStatus);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("reason");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getReason());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetBankAccountQuery_ResponseAdapter$Authorization;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$Authorization;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Authorization implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Authorization INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetBankAccountQuery_ResponseAdapter.Authorization();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"method", "status"});
        public static final int $stable = 8;

        private Authorization() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus bankAccountAuthorizationStatus = null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bankAccountAuthorizationMethod = (com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountAuthorizationMethod_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    bankAccountAuthorizationStatus = com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountAuthorizationStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (bankAccountAuthorizationStatus != null) {
                return new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization(bankAccountAuthorizationMethod, bankAccountAuthorizationStatus);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("method");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountAuthorizationMethod_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getMethod());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountAuthorizationStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
        }
    }
}

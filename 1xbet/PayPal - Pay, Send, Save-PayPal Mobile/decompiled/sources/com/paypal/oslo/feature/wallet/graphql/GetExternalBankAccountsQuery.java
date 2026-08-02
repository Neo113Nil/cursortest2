package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ExternalBankAccountsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ExternalBankAccountsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ExternalBankAccountsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ExternalBankAccountsInput;)Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ExternalBankAccountsInput;", "getInput", "Companion", "Data", "ExternalBankAccounts", "Item", "Issuer", "ExistingBankAccount", "Issuer1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GetExternalBankAccountsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "b10e245ceec26d38fe8607539b0f7ed20cc7cb6b8caeb7ca9712890b8647ffb6";
    public static final java.lang.String OPERATION_NAME = "GetExternalBankAccounts";
    private final com.paypal.oslo.api.graphql.schema.type.ExternalBankAccountsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Companion(null);
    public static final int $stable = 8;

    public GetExternalBankAccountsQuery(com.paypal.oslo.api.graphql.schema.type.ExternalBankAccountsInput externalBankAccountsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccountsInput, "");
        this.input = externalBankAccountsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ExternalBankAccountsInput getInput() {
        return this.input;
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
        com.paypal.oslo.feature.wallet.graphql.adapter.GetExternalBankAccountsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetExternalBankAccountsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetExternalBankAccountsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExternalBankAccounts;", "externalBankAccounts", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExternalBankAccounts;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExternalBankAccounts;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExternalBankAccounts;)Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExternalBankAccounts;", "getExternalBankAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts externalBankAccounts;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts externalBankAccounts) {
            this.externalBankAccounts = externalBankAccounts;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts getExternalBankAccounts() {
            return this.externalBankAccounts;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts externalBankAccounts = this.externalBankAccounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(externalBankAccounts=");
            sb.append(externalBankAccounts);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts externalBankAccounts = this.externalBankAccounts;
            if (externalBankAccounts == null) {
                return 0;
            }
            return externalBankAccounts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankAccounts, ((com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data) other).externalBankAccounts);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts externalBankAccounts) {
            return new com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data(externalBankAccounts);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts getExternalBankAccounts() {
            return this.externalBankAccounts;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts externalBankAccounts, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                externalBankAccounts = data.externalBankAccounts;
            }
            return data.copy(externalBankAccounts);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExternalBankAccounts;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Item;", "items", "Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExistingBankAccount;", "existingBankAccounts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExternalBankAccounts;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "getExistingBankAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExternalBankAccounts {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount> existingBankAccounts;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item> items;

        public ExternalBankAccounts(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item> list, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount> list2) {
            this.items = list;
            this.existingBankAccounts = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item> getItems() {
            return this.items;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount> getExistingBankAccounts() {
            return this.existingBankAccounts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item> list = this.items;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount> list2 = this.existingBankAccounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalBankAccounts(items=");
            sb.append(list);
            sb.append(", existingBankAccounts=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item> list = this.items;
            int hashCode = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount> list2 = this.existingBankAccounts;
            return (hashCode * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts externalBankAccounts = (com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.items, externalBankAccounts.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.existingBankAccounts, externalBankAccounts.existingBankAccounts);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item> items, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount> existingBankAccounts) {
            return new com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts(items, existingBankAccounts);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount> component2() {
            return this.existingBankAccounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts copy$default(com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts externalBankAccounts, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = externalBankAccounts.items;
            }
            if ((i & 2) != 0) {
                list2 = externalBankAccounts.existingBankAccounts;
            }
            return externalBankAccounts.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Item;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer;", "issuer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer;)Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer;", "getIssuer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer issuer;
        private final java.lang.String lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public Item(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer issuer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
            this.id = str;
            this.lastNChars = str2;
            this.type = bankAccountType;
            this.issuer = issuer;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer getIssuer() {
            return this.issuer;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer issuer = this.issuer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", issuer=");
            sb.append(issuer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.id.hashCode() * 31) + this.lastNChars.hashCode()) * 31) + this.type.hashCode()) * 31) + this.issuer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item item = (com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, item.lastNChars) && this.type == item.type && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, item.issuer);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer issuer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item(id, lastNChars, type, issuer);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer getIssuer() {
            return this.issuer;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item copy$default(com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item item, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer issuer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                str2 = item.lastNChars;
            }
            if ((i & 4) != 0) {
                bankAccountType = item.type;
            }
            if ((i & 8) != 0) {
                issuer = item.issuer;
            }
            return item.copy(str, str2, bankAccountType, issuer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer;", "", "", "name", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer {
        public static final int $stable = 8;
        private final java.lang.Object countryCode;
        private final java.lang.String name;

        public Issuer(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.name = str;
            this.countryCode = obj;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Object obj = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer(name=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer issuer = (com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, issuer.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, issuer.countryCode);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer copy(java.lang.String name2, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer(name2, countryCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer copy$default(com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer issuer, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = issuer.name;
            }
            if ((i & 2) != 0) {
                obj = issuer.countryCode;
            }
            return issuer.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExistingBankAccount;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer1;", "issuer", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer1;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer1;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer1;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;)Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$ExistingBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer1;", "getIssuer", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExistingBankAccount {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 issuer;
        private final java.lang.String lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public ExistingBankAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 issuer1, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            this.id = str;
            this.lastNChars = str2;
            this.issuer = issuer1;
            this.type = bankAccountType;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 getIssuer() {
            return this.issuer;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 issuer1 = this.issuer;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExistingBankAccount(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", issuer=");
            sb.append(issuer1);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.id.hashCode() * 31) + this.lastNChars.hashCode()) * 31) + this.issuer.hashCode()) * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount existingBankAccount = (com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, existingBankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, existingBankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, existingBankAccount.issuer) && this.type == existingBankAccount.type;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 issuer, com.paypal.oslo.api.graphql.schema.type.BankAccountType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount(id, lastNChars, issuer, type);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 getIssuer() {
            return this.issuer;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount copy$default(com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount existingBankAccount, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 issuer1, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = existingBankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = existingBankAccount.lastNChars;
            }
            if ((i & 4) != 0) {
                issuer1 = existingBankAccount.issuer;
            }
            if ((i & 8) != 0) {
                bankAccountType = existingBankAccount.type;
            }
            return existingBankAccount.copy(str, str2, issuer1, bankAccountType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer1;", "", "", "name", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Issuer1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer1 {
        public static final int $stable = 8;
        private final java.lang.Object countryCode;
        private final java.lang.String name;

        public Issuer1(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.name = str;
            this.countryCode = obj;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Object obj = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer1(name=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 issuer1 = (com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, issuer1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, issuer1.countryCode);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 copy(java.lang.String name2, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1(name2, countryCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Issuer1 issuer1, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = issuer1.name;
            }
            if ((i & 2) != 0) {
                obj = issuer1.countryCode;
            }
            return issuer1.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetExternalBankAccountsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetExternalBankAccounts($input: ExternalBankAccountsInput!) { externalBankAccounts(input: $input) { items { id lastNChars type issuer { name countryCode } } existingBankAccounts { id lastNChars issuer { name countryCode } type } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ExternalBankAccountsInput externalBankAccountsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetExternalBankAccountsQuery(input=");
        sb.append(externalBankAccountsInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery copy(com.paypal.oslo.api.graphql.schema.type.ExternalBankAccountsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ExternalBankAccountsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery copy$default(com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery getExternalBankAccountsQuery, com.paypal.oslo.api.graphql.schema.type.ExternalBankAccountsInput externalBankAccountsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            externalBankAccountsInput = getExternalBankAccountsQuery.input;
        }
        return getExternalBankAccountsQuery.copy(externalBankAccountsInput);
    }
}

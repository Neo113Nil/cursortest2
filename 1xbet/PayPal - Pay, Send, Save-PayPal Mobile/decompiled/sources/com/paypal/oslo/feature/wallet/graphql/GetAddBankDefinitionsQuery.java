package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$ B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "BankDefinitions", "Item", "Input"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetAddBankDefinitionsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "03c7227781e15b925ae34faa64fdd59a84f6a908e4deb7c9336854cd34d57b56";
    public static final java.lang.String OPERATION_NAME = "GetAddBankDefinitions";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetAddBankDefinitionsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;", "bankDefinitions", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;)Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;", "getBankDefinitions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions bankDefinitions;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions bankDefinitions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDefinitions, "");
            this.bankDefinitions = bankDefinitions;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions getBankDefinitions() {
            return this.bankDefinitions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions bankDefinitions = this.bankDefinitions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(bankDefinitions=");
            sb.append(bankDefinitions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.bankDefinitions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankDefinitions, ((com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data) other).bankDefinitions);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions bankDefinitions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDefinitions, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data(bankDefinitions);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions getBankDefinitions() {
            return this.bankDefinitions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions bankDefinitions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankDefinitions = data.bankDefinitions;
            }
            return data.copy(bankDefinitions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankDefinitions {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item> items;

        public BankDefinitions(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankDefinitions(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions) other).items);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions(items);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions copy$default(com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions bankDefinitions, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = bankDefinitions.items;
            }
            return bankDefinitions.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Item;", "", "currencyCode", "Lcom/paypal/oslo/api/graphql/schema/type/BankDataFormat;", "dataFormat", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Input;", "inputs", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BankDataFormat;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankDataFormat;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BankDataFormat;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCurrencyCode", "Lcom/paypal/oslo/api/graphql/schema/type/BankDataFormat;", "getDataFormat", "Ljava/util/List;", "getInputs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final com.paypal.oslo.api.graphql.schema.type.BankDataFormat dataFormat;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input> inputs;

        public Item(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BankDataFormat bankDataFormat, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDataFormat, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.currencyCode = obj;
            this.dataFormat = bankDataFormat;
            this.inputs = list;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankDataFormat getDataFormat() {
            return this.dataFormat;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input> getInputs() {
            return this.inputs;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            com.paypal.oslo.api.graphql.schema.type.BankDataFormat bankDataFormat = this.dataFormat;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input> list = this.inputs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(currencyCode=");
            sb.append(obj);
            sb.append(", dataFormat=");
            sb.append(bankDataFormat);
            sb.append(", inputs=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.currencyCode.hashCode() * 31) + this.dataFormat.hashCode()) * 31) + this.inputs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item item = (com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, item.currencyCode) && this.dataFormat == item.dataFormat && kotlin.jvm.internal.Intrinsics.areEqual(this.inputs, item.inputs);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item copy(java.lang.Object currencyCode, com.paypal.oslo.api.graphql.schema.type.BankDataFormat dataFormat, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input> inputs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataFormat, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputs, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item(currencyCode, dataFormat, inputs);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input> component3() {
            return this.inputs;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankDataFormat getDataFormat() {
            return this.dataFormat;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item copy$default(com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item item, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BankDataFormat bankDataFormat, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = item.currencyCode;
            }
            if ((i & 2) != 0) {
                bankDataFormat = item.dataFormat;
            }
            if ((i & 4) != 0) {
                list = item.inputs;
            }
            return item.copy(obj, bankDataFormat, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jb\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b&\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b)\u0010\u0010R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Input;", "", "", "name", "group", "", "maximumLength", "minimumLength", "", "prepopulatedValues", "regex", "", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Input;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getName", "getGroup", com.visa.cbp.getEncExpo.warmup, "getMaximumLength", "getMinimumLength", "Ljava/util/List;", "getPrepopulatedValues", "getRegex", "Z", "getRequired"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 8;
        private final java.lang.String group;
        private final int maximumLength;
        private final int minimumLength;
        private final java.lang.String name;
        private final java.util.List<java.lang.String> prepopulatedValues;
        private final java.lang.String regex;
        private final boolean required;

        public Input(java.lang.String str, java.lang.String str2, int i, int i2, java.util.List<java.lang.String> list, java.lang.String str3, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.group = str2;
            this.maximumLength = i;
            this.minimumLength = i2;
            this.prepopulatedValues = list;
            this.regex = str3;
            this.required = z;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getGroup() {
            return this.group;
        }

        public final int getMaximumLength() {
            return this.maximumLength;
        }

        public final int getMinimumLength() {
            return this.minimumLength;
        }

        public final java.util.List<java.lang.String> getPrepopulatedValues() {
            return this.prepopulatedValues;
        }

        public final java.lang.String getRegex() {
            return this.regex;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.group;
            int i = this.maximumLength;
            int i2 = this.minimumLength;
            java.util.List<java.lang.String> list = this.prepopulatedValues;
            java.lang.String str3 = this.regex;
            boolean z = this.required;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input(name=");
            sb.append(str);
            sb.append(", group=");
            sb.append(str2);
            sb.append(", maximumLength=");
            sb.append(i);
            sb.append(", minimumLength=");
            sb.append(i2);
            sb.append(", prepopulatedValues=");
            sb.append(list);
            sb.append(", regex=");
            sb.append(str3);
            sb.append(", required=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.String str = this.group;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = java.lang.Integer.hashCode(this.maximumLength);
            int hashCode4 = java.lang.Integer.hashCode(this.minimumLength);
            java.util.List<java.lang.String> list = this.prepopulatedValues;
            int hashCode5 = list == null ? 0 : list.hashCode();
            java.lang.String str2 = this.regex;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.required);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input input = (com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, input.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.group, input.group) && this.maximumLength == input.maximumLength && this.minimumLength == input.minimumLength && kotlin.jvm.internal.Intrinsics.areEqual(this.prepopulatedValues, input.prepopulatedValues) && kotlin.jvm.internal.Intrinsics.areEqual(this.regex, input.regex) && this.required == input.required;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input copy(java.lang.String name2, java.lang.String group, int maximumLength, int minimumLength, java.util.List<java.lang.String> prepopulatedValues, java.lang.String regex, boolean required) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input(name2, group, maximumLength, minimumLength, prepopulatedValues, regex, required);
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getRequired() {
            return this.required;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getRegex() {
            return this.regex;
        }

        public final java.util.List<java.lang.String> component5() {
            return this.prepopulatedValues;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMinimumLength() {
            return this.minimumLength;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaximumLength() {
            return this.maximumLength;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGroup() {
            return this.group;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input copy$default(com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input input, java.lang.String str, java.lang.String str2, int i, int i2, java.util.List list, java.lang.String str3, boolean z, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = input.name;
            }
            if ((i3 & 2) != 0) {
                str2 = input.group;
            }
            java.lang.String str4 = str2;
            if ((i3 & 4) != 0) {
                i = input.maximumLength;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = input.minimumLength;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                list = input.prepopulatedValues;
            }
            java.util.List list2 = list;
            if ((i3 & 32) != 0) {
                str3 = input.regex;
            }
            java.lang.String str5 = str3;
            if ((i3 & 64) != 0) {
                z = input.required;
            }
            return input.copy(str, str4, i4, i5, list2, str5, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetAddBankDefinitions { bankDefinitions { items { currencyCode dataFormat inputs { name group maximumLength minimumLength prepopulatedValues regex required } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}

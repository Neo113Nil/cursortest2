package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BankInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BankInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BankInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BankInput;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BankInput;", "getInput", "Companion", "Data", "Bank", "InlineLogoImageData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GetBankDetailsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "79ff9bfb91beda9c6d8c610bc4f581698a967e1599b9bbf310a678c4abd6e779";
    public static final java.lang.String OPERATION_NAME = "GetBankDetails";
    private final com.paypal.oslo.api.graphql.schema.type.BankInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Companion(null);
    public static final int $stable = 8;

    public GetBankDetailsQuery(com.paypal.oslo.api.graphql.schema.type.BankInput bankInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankInput, "");
        this.input = bankInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BankInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.GetBankDetailsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetBankDetailsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetBankDetailsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Bank;", "bank", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Bank;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Bank;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Bank;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Bank;", "getBank"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank bank;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank bank) {
            this.bank = bank;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank getBank() {
            return this.bank;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank bank = this.bank;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(bank=");
            sb.append(bank);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank bank = this.bank;
            if (bank == null) {
                return 0;
            }
            return bank.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.bank, ((com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data) other).bank);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank bank) {
            return new com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data(bank);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank getBank() {
            return this.bank;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank bank, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bank = data.bank;
            }
            return data.copy(bank);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Bank;", "", "inlineLogoUrl", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$InlineLogoImageData;", "inlineLogoImageData", "", "bankName", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$InlineLogoImageData;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$InlineLogoImageData;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$InlineLogoImageData;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Bank;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getInlineLogoUrl", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$InlineLogoImageData;", "getInlineLogoImageData", "Ljava/lang/String;", "getBankName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Bank {
        public static final int $stable = 8;
        private final java.lang.String bankName;
        private final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData inlineLogoImageData;
        private final java.lang.Object inlineLogoUrl;

        public Bank(java.lang.Object obj, com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData inlineLogoImageData, java.lang.String str) {
            this.inlineLogoUrl = obj;
            this.inlineLogoImageData = inlineLogoImageData;
            this.bankName = str;
        }

        public final java.lang.Object getInlineLogoUrl() {
            return this.inlineLogoUrl;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData getInlineLogoImageData() {
            return this.inlineLogoImageData;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.inlineLogoUrl;
            com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData inlineLogoImageData = this.inlineLogoImageData;
            java.lang.String str = this.bankName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bank(inlineLogoUrl=");
            sb.append(obj);
            sb.append(", inlineLogoImageData=");
            sb.append(inlineLogoImageData);
            sb.append(", bankName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.inlineLogoUrl;
            int hashCode = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData inlineLogoImageData = this.inlineLogoImageData;
            int hashCode2 = inlineLogoImageData == null ? 0 : inlineLogoImageData.hashCode();
            java.lang.String str = this.bankName;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank bank = (com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoUrl, bank.inlineLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoImageData, bank.inlineLogoImageData) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, bank.bankName);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank copy(java.lang.Object inlineLogoUrl, com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData inlineLogoImageData, java.lang.String bankName) {
            return new com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank(inlineLogoUrl, inlineLogoImageData, bankName);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData getInlineLogoImageData() {
            return this.inlineLogoImageData;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getInlineLogoUrl() {
            return this.inlineLogoUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank bank, java.lang.Object obj, com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData inlineLogoImageData, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = bank.inlineLogoUrl;
            }
            if ((i & 2) != 0) {
                inlineLogoImageData = bank.inlineLogoImageData;
            }
            if ((i & 4) != 0) {
                str = bank.bankName;
            }
            return bank.copy(obj, inlineLogoImageData, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$InlineLogoImageData;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$InlineLogoImageData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getData", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InlineLogoImageData {
        public static final int $stable = 0;
        private final java.lang.String data;
        private final java.lang.String mimeType;

        public InlineLogoImageData(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.data = str;
            this.mimeType = str2;
        }

        public final java.lang.String getData() {
            return this.data;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.data;
            java.lang.String str2 = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InlineLogoImageData(data=");
            sb.append(str);
            sb.append(", mimeType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + this.mimeType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData inlineLogoImageData = (com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, inlineLogoImageData.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, inlineLogoImageData.mimeType);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData copy(java.lang.String data, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData(data, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData inlineLogoImageData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = inlineLogoImageData.data;
            }
            if ((i & 2) != 0) {
                str2 = inlineLogoImageData.mimeType;
            }
            return inlineLogoImageData.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetBankDetailsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBankDetails($input: BankInput!) { bank(input: $input) { inlineLogoUrl inlineLogoImageData { data mimeType } bankName } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BankInput bankInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBankDetailsQuery(input=");
        sb.append(bankInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery copy(com.paypal.oslo.api.graphql.schema.type.BankInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BankInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery copy$default(com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery getBankDetailsQuery, com.paypal.oslo.api.graphql.schema.type.BankInput bankInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bankInput = getBankDetailsQuery.input;
        }
        return getBankDetailsQuery.copy(bankInput);
    }
}

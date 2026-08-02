package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\n*+,-./012)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/LinkExternalBankAccountsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/LinkExternalBankAccountsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/LinkExternalBankAccountsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/LinkExternalBankAccountsInput;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/LinkExternalBankAccountsInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.OPERATION_NAME, "Item", "BankAccount", "BankAccountCandidate", "Issuer", "ExistingBankAccount", "Issuer1", "InlineLogoImageData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LinkExternalBankAccountsMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data> {
    public static final java.lang.String OPERATION_ID = "19deb891282e04aac292f3b880850e04d1e3f61d2e8f47da3b74d666c6e53f7d";
    public static final java.lang.String OPERATION_NAME = "LinkExternalBankAccounts";
    private final com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Companion(null);
    public static final int $stable = 8;

    public LinkExternalBankAccountsMutation(com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput linkExternalBankAccountsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkExternalBankAccountsInput, "");
        this.input = linkExternalBankAccountsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.LinkExternalBankAccountsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.LinkExternalBankAccountsMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.LinkExternalBankAccountsMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$LinkExternalBankAccounts;", "linkExternalBankAccounts", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$LinkExternalBankAccounts;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$LinkExternalBankAccounts;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$LinkExternalBankAccounts;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$LinkExternalBankAccounts;", "getLinkExternalBankAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts linkExternalBankAccounts;

        public Data(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts linkExternalBankAccounts) {
            this.linkExternalBankAccounts = linkExternalBankAccounts;
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts getLinkExternalBankAccounts() {
            return this.linkExternalBankAccounts;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts linkExternalBankAccounts = this.linkExternalBankAccounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(linkExternalBankAccounts=");
            sb.append(linkExternalBankAccounts);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts linkExternalBankAccounts = this.linkExternalBankAccounts;
            if (linkExternalBankAccounts == null) {
                return 0;
            }
            return linkExternalBankAccounts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkExternalBankAccounts, ((com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data) other).linkExternalBankAccounts);
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data copy(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts linkExternalBankAccounts) {
            return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data(linkExternalBankAccounts);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts getLinkExternalBankAccounts() {
            return this.linkExternalBankAccounts;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data data, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts linkExternalBankAccounts, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                linkExternalBankAccounts = data.linkExternalBankAccounts;
            }
            return data.copy(linkExternalBankAccounts);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$LinkExternalBankAccounts;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Item;", "items", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$ExistingBankAccount;", "existingBankAccounts", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$InlineLogoImageData;", "inlineLogoImageData", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$InlineLogoImageData;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$InlineLogoImageData;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$InlineLogoImageData;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$LinkExternalBankAccounts;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "getExistingBankAccounts", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$InlineLogoImageData;", "getInlineLogoImageData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkExternalBankAccounts {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> existingBankAccounts;
        private final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData inlineLogoImageData;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> items;

        public LinkExternalBankAccounts(java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> list, java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> list2, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData inlineLogoImageData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
            this.existingBankAccounts = list2;
            this.inlineLogoImageData = inlineLogoImageData;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> getItems() {
            return this.items;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> getExistingBankAccounts() {
            return this.existingBankAccounts;
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData getInlineLogoImageData() {
            return this.inlineLogoImageData;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> list = this.items;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> list2 = this.existingBankAccounts;
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData inlineLogoImageData = this.inlineLogoImageData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkExternalBankAccounts(items=");
            sb.append(list);
            sb.append(", existingBankAccounts=");
            sb.append(list2);
            sb.append(", inlineLogoImageData=");
            sb.append(inlineLogoImageData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.items.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> list = this.existingBankAccounts;
            int hashCode2 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData inlineLogoImageData = this.inlineLogoImageData;
            return (((hashCode * 31) + hashCode2) * 31) + (inlineLogoImageData != null ? inlineLogoImageData.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts linkExternalBankAccounts = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.items, linkExternalBankAccounts.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.existingBankAccounts, linkExternalBankAccounts.existingBankAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoImageData, linkExternalBankAccounts.inlineLogoImageData);
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> items, java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> existingBankAccounts, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData inlineLogoImageData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts(items, existingBankAccounts, inlineLogoImageData);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData getInlineLogoImageData() {
            return this.inlineLogoImageData;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> component2() {
            return this.existingBankAccounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts linkExternalBankAccounts, java.util.List list, java.util.List list2, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData inlineLogoImageData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = linkExternalBankAccounts.items;
            }
            if ((i & 2) != 0) {
                list2 = linkExternalBankAccounts.existingBankAccounts;
            }
            if ((i & 4) != 0) {
                inlineLogoImageData = linkExternalBankAccounts.inlineLogoImageData;
            }
            return linkExternalBankAccounts.copy(list, list2, inlineLogoImageData);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Item;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction;", "bankAccountAction", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccount;", "bankAccount", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccountCandidate;", "bankAccountCandidate", "", "bankAccountCandidateId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccount;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccountCandidate;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccount;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccountCandidate;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccount;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccountCandidate;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAction;", "getBankAccountAction", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccount;", "getBankAccount", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccountCandidate;", "getBankAccountCandidate", "Ljava/lang/String;", "getBankAccountCandidateId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount bankAccount;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction;
        private final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate;
        private final java.lang.String bankAccountCandidateId;

        public Item(com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount bankAccount, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountAction, "");
            this.bankAccountAction = bankAccountAction;
            this.bankAccount = bankAccount;
            this.bankAccountCandidate = bankAccountCandidate;
            this.bankAccountCandidateId = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAction getBankAccountAction() {
            return this.bankAccountAction;
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount getBankAccount() {
            return this.bankAccount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate getBankAccountCandidate() {
            return this.bankAccountCandidate;
        }

        public final java.lang.String getBankAccountCandidateId() {
            return this.bankAccountCandidateId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction = this.bankAccountAction;
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount bankAccount = this.bankAccount;
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate = this.bankAccountCandidate;
            java.lang.String str = this.bankAccountCandidateId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(bankAccountAction=");
            sb.append(bankAccountAction);
            sb.append(", bankAccount=");
            sb.append(bankAccount);
            sb.append(", bankAccountCandidate=");
            sb.append(bankAccountCandidate);
            sb.append(", bankAccountCandidateId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.bankAccountAction.hashCode();
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount bankAccount = this.bankAccount;
            int hashCode2 = bankAccount == null ? 0 : bankAccount.hashCode();
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate = this.bankAccountCandidate;
            int hashCode3 = bankAccountCandidate == null ? 0 : bankAccountCandidate.hashCode();
            java.lang.String str = this.bankAccountCandidateId;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item item = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item) other;
            return this.bankAccountAction == item.bankAccountAction && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccount, item.bankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountCandidate, item.bankAccountCandidate) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountCandidateId, item.bankAccountCandidateId);
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item copy(com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount bankAccount, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate, java.lang.String bankAccountCandidateId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountAction, "");
            return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item(bankAccountAction, bankAccount, bankAccountCandidate, bankAccountCandidateId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBankAccountCandidateId() {
            return this.bankAccountCandidateId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate getBankAccountCandidate() {
            return this.bankAccountCandidate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount getBankAccount() {
            return this.bankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAction getBankAccountAction() {
            return this.bankAccountAction;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item item, com.paypal.oslo.api.graphql.schema.type.BankAccountAction bankAccountAction, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount bankAccount, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankAccountAction = item.bankAccountAction;
            }
            if ((i & 2) != 0) {
                bankAccount = item.bankAccount;
            }
            if ((i & 4) != 0) {
                bankAccountCandidate = item.bankAccountCandidate;
            }
            if ((i & 8) != 0) {
                str = item.bankAccountCandidateId;
            }
            return item.copy(bankAccountAction, bankAccount, bankAccountCandidate, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccount;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccount {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public BankAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            this.id = str;
            this.lastNChars = str2;
            this.type = bankAccountType;
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

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccount(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.lastNChars.hashCode()) * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount bankAccount = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccount.lastNChars) && this.type == bankAccount.type;
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.BankAccountType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount(id, lastNChars, type);
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

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount bankAccount, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = bankAccount.lastNChars;
            }
            if ((i & 4) != 0) {
                bankAccountType = bankAccount.type;
            }
            return bankAccount.copy(str, str2, bankAccountType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccountCandidate;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer;", "issuer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$BankAccountCandidate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer;", "getIssuer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccountCandidate {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer issuer;
        private final java.lang.String lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public BankAccountCandidate(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer issuer) {
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

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer getIssuer() {
            return this.issuer;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer issuer = this.issuer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccountCandidate(id=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccountCandidate.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccountCandidate.lastNChars) && this.type == bankAccountCandidate.type && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, bankAccountCandidate.issuer);
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer issuer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
            return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate(id, lastNChars, type, issuer);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer getIssuer() {
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

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer issuer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankAccountCandidate.id;
            }
            if ((i & 2) != 0) {
                str2 = bankAccountCandidate.lastNChars;
            }
            if ((i & 4) != 0) {
                bankAccountType = bankAccountCandidate.type;
            }
            if ((i & 8) != 0) {
                issuer = bankAccountCandidate.issuer;
            }
            return bankAccountCandidate.copy(str, str2, bankAccountType, issuer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer {
        public static final int $stable = 0;
        private final java.lang.String name;

        public Issuer(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer) other).name);
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer issuer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer.name;
            }
            return issuer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$ExistingBankAccount;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer1;", "issuer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component4", "()Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer1;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer1;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$ExistingBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer1;", "getIssuer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExistingBankAccount {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 issuer;
        private final java.lang.String lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public ExistingBankAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 issuer1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer1, "");
            this.id = str;
            this.lastNChars = str2;
            this.type = bankAccountType;
            this.issuer = issuer1;
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

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 getIssuer() {
            return this.issuer;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 issuer1 = this.issuer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExistingBankAccount(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", issuer=");
            sb.append(issuer1);
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount existingBankAccount = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, existingBankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, existingBankAccount.lastNChars) && this.type == existingBankAccount.type && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, existingBankAccount.issuer);
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 issuer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
            return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount(id, lastNChars, type, issuer);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 getIssuer() {
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

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount existingBankAccount, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 issuer1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = existingBankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = existingBankAccount.lastNChars;
            }
            if ((i & 4) != 0) {
                bankAccountType = existingBankAccount.type;
            }
            if ((i & 8) != 0) {
                issuer1 = existingBankAccount.issuer;
            }
            return existingBankAccount.copy(str, str2, bankAccountType, issuer1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer1;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Issuer1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Issuer1 {
        public static final int $stable = 0;
        private final java.lang.String name;

        public Issuer1(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Issuer1(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1) other).name);
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer1 issuer1, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuer1.name;
            }
            return issuer1.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$InlineLogoImageData;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$InlineLogoImageData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getData", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData inlineLogoImageData = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, inlineLogoImageData.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, inlineLogoImageData.mimeType);
        }

        public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData copy(java.lang.String data, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
            return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData(data, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData inlineLogoImageData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = inlineLogoImageData.data;
            }
            if ((i & 2) != 0) {
                str2 = inlineLogoImageData.mimeType;
            }
            return inlineLogoImageData.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation LinkExternalBankAccounts($input: LinkExternalBankAccountsInput!) { linkExternalBankAccounts(input: $input) { items { bankAccountAction bankAccount { id lastNChars type } bankAccountCandidate { id lastNChars type issuer { name } } bankAccountCandidateId } existingBankAccounts { id lastNChars type issuer { name } } inlineLogoImageData { data mimeType } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput linkExternalBankAccountsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkExternalBankAccountsMutation(input=");
        sb.append(linkExternalBankAccountsInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation copy(com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation copy$default(com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation linkExternalBankAccountsMutation, com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput linkExternalBankAccountsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            linkExternalBankAccountsInput = linkExternalBankAccountsMutation.input;
        }
        return linkExternalBankAccountsMutation.copy(linkExternalBankAccountsInput);
    }
}

package com.paypal.oslo.feature.taptopay.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseDeviceWalletCardTokensInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseDeviceWalletCardTokensInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CloseDeviceWalletCardTokensInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseDeviceWalletCardTokensInput;)Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CloseDeviceWalletCardTokensInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.OPERATION_NAME, "Status", "CardToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CloseDeviceWalletCardTokensMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data> {
    public static final java.lang.String OPERATION_ID = "ddf0f10a0ef93c60b43dca22d739a30377c00dd4884b56fce8b0753cb6054272";
    public static final java.lang.String OPERATION_NAME = "CloseDeviceWalletCardTokens";
    private final com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Companion(null);
    public static final int $stable = 8;

    public CloseDeviceWalletCardTokensMutation(com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput closeDeviceWalletCardTokensInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeDeviceWalletCardTokensInput, "");
        this.input = closeDeviceWalletCardTokensInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput getInput() {
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
        com.paypal.oslo.feature.taptopay.graphql.adapter.CloseDeviceWalletCardTokensMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taptopay.graphql.adapter.CloseDeviceWalletCardTokensMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.taptopay.graphql.selections.CloseDeviceWalletCardTokensMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CloseDeviceWalletCardTokens;", "closeDeviceWalletCardTokens", "<init>", "(Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CloseDeviceWalletCardTokens;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CloseDeviceWalletCardTokens;", "copy", "(Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CloseDeviceWalletCardTokens;)Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CloseDeviceWalletCardTokens;", "getCloseDeviceWalletCardTokens"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens;

        public Data(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens) {
            this.closeDeviceWalletCardTokens = closeDeviceWalletCardTokens;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens getCloseDeviceWalletCardTokens() {
            return this.closeDeviceWalletCardTokens;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens = this.closeDeviceWalletCardTokens;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(closeDeviceWalletCardTokens=");
            sb.append(closeDeviceWalletCardTokens);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens = this.closeDeviceWalletCardTokens;
            if (closeDeviceWalletCardTokens == null) {
                return 0;
            }
            return closeDeviceWalletCardTokens.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.closeDeviceWalletCardTokens, ((com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data) other).closeDeviceWalletCardTokens);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data copy(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens) {
            return new com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data(closeDeviceWalletCardTokens);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens getCloseDeviceWalletCardTokens() {
            return this.closeDeviceWalletCardTokens;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data copy$default(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Data data, com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                closeDeviceWalletCardTokens = data.closeDeviceWalletCardTokens;
            }
            return data.copy(closeDeviceWalletCardTokens);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CloseDeviceWalletCardTokens;", "", "", "Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$Status;", "statuses", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CloseDeviceWalletCardTokens;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getStatuses"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseDeviceWalletCardTokens {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status> statuses;

        public CloseDeviceWalletCardTokens(java.util.List<com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.statuses = list;
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status> getStatuses() {
            return this.statuses;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status> list = this.statuses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseDeviceWalletCardTokens(statuses=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.statuses.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens) && kotlin.jvm.internal.Intrinsics.areEqual(this.statuses, ((com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens) other).statuses);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens copy(java.util.List<com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status> statuses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statuses, "");
            return new com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens(statuses);
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status> component1() {
            return this.statuses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens copy$default(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CloseDeviceWalletCardTokens closeDeviceWalletCardTokens, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = closeDeviceWalletCardTokens.statuses;
            }
            return closeDeviceWalletCardTokens.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$Status;", "", "Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CardToken;", "cardToken", "", "isSuccessful", "<init>", "(Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CardToken;Z)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CardToken;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CardToken;Z)Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$Status;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CardToken;", "getCardToken", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken cardToken;
        private final boolean isSuccessful;

        public Status(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken cardToken, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardToken, "");
            this.cardToken = cardToken;
            this.isSuccessful = z;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken getCardToken() {
            return this.cardToken;
        }

        public final boolean isSuccessful() {
            return this.isSuccessful;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken cardToken = this.cardToken;
            boolean z = this.isSuccessful;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(cardToken=");
            sb.append(cardToken);
            sb.append(", isSuccessful=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cardToken.hashCode() * 31) + java.lang.Boolean.hashCode(this.isSuccessful);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status status = (com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardToken, status.cardToken) && this.isSuccessful == status.isSuccessful;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status copy(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken cardToken, boolean isSuccessful) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardToken, "");
            return new com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status(cardToken, isSuccessful);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSuccessful() {
            return this.isSuccessful;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken getCardToken() {
            return this.cardToken;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status copy$default(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.Status status, com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken cardToken, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardToken = status.cardToken;
            }
            if ((i & 2) != 0) {
                z = status.isSuccessful;
            }
            return status.copy(cardToken, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CardToken;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$CardToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardToken {
        public static final int $stable = 0;
        private final java.lang.String id;

        public CardToken(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardToken(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken) other).id);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken copy$default(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation.CardToken cardToken, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardToken.id;
            }
            return cardToken.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/CloseDeviceWalletCardTokensMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CloseDeviceWalletCardTokens($input: CloseDeviceWalletCardTokensInput!) { closeDeviceWalletCardTokens(input: $input) { statuses { cardToken { id } isSuccessful } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput closeDeviceWalletCardTokensInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseDeviceWalletCardTokensMutation(input=");
        sb.append(closeDeviceWalletCardTokensInput);
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
        return (other instanceof com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation) other).input);
    }

    public final com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation copy(com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation copy$default(com.paypal.oslo.feature.taptopay.graphql.CloseDeviceWalletCardTokensMutation closeDeviceWalletCardTokensMutation, com.paypal.oslo.api.graphql.schema.type.CloseDeviceWalletCardTokensInput closeDeviceWalletCardTokensInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            closeDeviceWalletCardTokensInput = closeDeviceWalletCardTokensMutation.input;
        }
        return closeDeviceWalletCardTokensMutation.copy(closeDeviceWalletCardTokensInput);
    }
}

package com.paypal.oslo.feature.bnplservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateBNPLPreSnoozeContractInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateBNPLPreSnoozeContractInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CreateBNPLPreSnoozeContractInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateBNPLPreSnoozeContractInput;)Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CreateBNPLPreSnoozeContractInput;", "getInput", "Companion", "Data", "CreateBnplPreSnoozeContract", "SnoozeDocument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CreateSnoozePreContractMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data> {
    public static final java.lang.String OPERATION_ID = "8b8ec3efdd10dcfc347640828342532d9bc95b66f16060c1a55d8029fa4ee60f";
    public static final java.lang.String OPERATION_NAME = "CreateSnoozePreContract";
    private final com.paypal.oslo.api.graphql.schema.type.CreateBNPLPreSnoozeContractInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Companion(null);
    public static final int $stable = 8;

    public CreateSnoozePreContractMutation(com.paypal.oslo.api.graphql.schema.type.CreateBNPLPreSnoozeContractInput createBNPLPreSnoozeContractInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createBNPLPreSnoozeContractInput, "");
        this.input = createBNPLPreSnoozeContractInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateBNPLPreSnoozeContractInput getInput() {
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
        com.paypal.oslo.feature.bnplservicing.graphql.adapter.CreateSnoozePreContractMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplservicing.graphql.adapter.CreateSnoozePreContractMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplservicing.graphql.selections.CreateSnoozePreContractMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$CreateBnplPreSnoozeContract;", "createBnplPreSnoozeContract", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$CreateBnplPreSnoozeContract;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$CreateBnplPreSnoozeContract;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$CreateBnplPreSnoozeContract;)Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$CreateBnplPreSnoozeContract;", "getCreateBnplPreSnoozeContract"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract createBnplPreSnoozeContract;

        public Data(com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract createBnplPreSnoozeContract) {
            this.createBnplPreSnoozeContract = createBnplPreSnoozeContract;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract getCreateBnplPreSnoozeContract() {
            return this.createBnplPreSnoozeContract;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract createBnplPreSnoozeContract = this.createBnplPreSnoozeContract;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(createBnplPreSnoozeContract=");
            sb.append(createBnplPreSnoozeContract);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract createBnplPreSnoozeContract = this.createBnplPreSnoozeContract;
            if (createBnplPreSnoozeContract == null) {
                return 0;
            }
            return createBnplPreSnoozeContract.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.createBnplPreSnoozeContract, ((com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data) other).createBnplPreSnoozeContract);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data copy(com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract createBnplPreSnoozeContract) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data(createBnplPreSnoozeContract);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract getCreateBnplPreSnoozeContract() {
            return this.createBnplPreSnoozeContract;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data copy$default(com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data data, com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract createBnplPreSnoozeContract, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createBnplPreSnoozeContract = data.createBnplPreSnoozeContract;
            }
            return data.copy(createBnplPreSnoozeContract);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$CreateBnplPreSnoozeContract;", "", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$SnoozeDocument;", "snoozeDocuments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$CreateBnplPreSnoozeContract;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSnoozeDocuments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateBnplPreSnoozeContract {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument> snoozeDocuments;

        public CreateBnplPreSnoozeContract(java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument> list) {
            this.snoozeDocuments = list;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument> getSnoozeDocuments() {
            return this.snoozeDocuments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument> list = this.snoozeDocuments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateBnplPreSnoozeContract(snoozeDocuments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument> list = this.snoozeDocuments;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract) && kotlin.jvm.internal.Intrinsics.areEqual(this.snoozeDocuments, ((com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract) other).snoozeDocuments);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract copy(java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument> snoozeDocuments) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract(snoozeDocuments);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument> component1() {
            return this.snoozeDocuments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract copy$default(com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.CreateBnplPreSnoozeContract createBnplPreSnoozeContract, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = createBnplPreSnoozeContract.snoozeDocuments;
            }
            return createBnplPreSnoozeContract.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$SnoozeDocument;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDocumentFragment;", "bnplServicingDocumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDocumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDocumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDocumentFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$SnoozeDocument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDocumentFragment;", "getBnplServicingDocumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SnoozeDocument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDocumentFragment bnplServicingDocumentFragment;

        public SnoozeDocument(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDocumentFragment bnplServicingDocumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingDocumentFragment, "");
            this.__typename = str;
            this.bnplServicingDocumentFragment = bnplServicingDocumentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDocumentFragment getBnplServicingDocumentFragment() {
            return this.bnplServicingDocumentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDocumentFragment bnplServicingDocumentFragment = this.bnplServicingDocumentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SnoozeDocument(__typename=");
            sb.append(str);
            sb.append(", bnplServicingDocumentFragment=");
            sb.append(bnplServicingDocumentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingDocumentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument snoozeDocument = (com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, snoozeDocument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingDocumentFragment, snoozeDocument.bnplServicingDocumentFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDocumentFragment bnplServicingDocumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingDocumentFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument(__typename, bnplServicingDocumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDocumentFragment getBnplServicingDocumentFragment() {
            return this.bnplServicingDocumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument copy$default(com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.SnoozeDocument snoozeDocument, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDocumentFragment bnplServicingDocumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = snoozeDocument.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingDocumentFragment = snoozeDocument.bnplServicingDocumentFragment;
            }
            return snoozeDocument.copy(str, bnplServicingDocumentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CreateSnoozePreContract($input: CreateBNPLPreSnoozeContractInput!) { createBnplPreSnoozeContract(input: $input) { snoozeDocuments { __typename ...BnplServicingDocumentFragment } } }  fragment BnplServicingLinkFragment on BNPLServicingDocumentLink { type staticUrl relativePath }  fragment BnplServicingDocumentFragment on BNPLServicingDocument { type name fileName link { __typename ...BnplServicingLinkFragment } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CreateBNPLPreSnoozeContractInput createBNPLPreSnoozeContractInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateSnoozePreContractMutation(input=");
        sb.append(createBNPLPreSnoozeContractInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation) other).input);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation copy(com.paypal.oslo.api.graphql.schema.type.CreateBNPLPreSnoozeContractInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreateBNPLPreSnoozeContractInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation copy$default(com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation createSnoozePreContractMutation, com.paypal.oslo.api.graphql.schema.type.CreateBNPLPreSnoozeContractInput createBNPLPreSnoozeContractInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            createBNPLPreSnoozeContractInput = createSnoozePreContractMutation.input;
        }
        return createSnoozePreContractMutation.copy(createBNPLPreSnoozeContractInput);
    }
}

package com.paypal.oslo.feature.packagetracking.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DeauthorizePackageTrackingForAllProvidersInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DeauthorizePackageTrackingForAllProvidersInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DeauthorizePackageTrackingForAllProvidersInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DeauthorizePackageTrackingForAllProvidersInput;)Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DeauthorizePackageTrackingForAllProvidersInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.OPERATION_NAME, "Deauthorization"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeauthorizePackageTrackingForAllProvidersMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data> {
    public static final java.lang.String OPERATION_ID = "6b1436589a2484a31751890b3b7a01754cc920ab87d86fc850a8ab053cfbe466";
    public static final java.lang.String OPERATION_NAME = "DeauthorizePackageTrackingForAllProviders";
    private final com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Companion(null);
    public static final int $stable = 8;

    public DeauthorizePackageTrackingForAllProvidersMutation(com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput deauthorizePackageTrackingForAllProvidersInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deauthorizePackageTrackingForAllProvidersInput, "");
        this.input = deauthorizePackageTrackingForAllProvidersInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput getInput() {
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
        com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.packagetracking.graphql.selections.DeauthorizePackageTrackingForAllProvidersMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;", "deauthorizePackageTrackingForAllProviders", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;)Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;", "getDeauthorizePackageTrackingForAllProviders"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders;

        public Data(com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders) {
            this.deauthorizePackageTrackingForAllProviders = deauthorizePackageTrackingForAllProviders;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders getDeauthorizePackageTrackingForAllProviders() {
            return this.deauthorizePackageTrackingForAllProviders;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders = this.deauthorizePackageTrackingForAllProviders;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(deauthorizePackageTrackingForAllProviders=");
            sb.append(deauthorizePackageTrackingForAllProviders);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders = this.deauthorizePackageTrackingForAllProviders;
            if (deauthorizePackageTrackingForAllProviders == null) {
                return 0;
            }
            return deauthorizePackageTrackingForAllProviders.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.deauthorizePackageTrackingForAllProviders, ((com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data) other).deauthorizePackageTrackingForAllProviders);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data copy(com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders) {
            return new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data(deauthorizePackageTrackingForAllProviders);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders getDeauthorizePackageTrackingForAllProviders() {
            return this.deauthorizePackageTrackingForAllProviders;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data copy$default(com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data data, com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deauthorizePackageTrackingForAllProviders = data.deauthorizePackageTrackingForAllProviders;
            }
            return data.copy(deauthorizePackageTrackingForAllProviders);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;", "", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Deauthorization;", "deauthorizations", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDeauthorizations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeauthorizePackageTrackingForAllProviders {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> deauthorizations;

        public DeauthorizePackageTrackingForAllProviders(java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> list) {
            this.deauthorizations = list;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> getDeauthorizations() {
            return this.deauthorizations;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> list = this.deauthorizations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeauthorizePackageTrackingForAllProviders(deauthorizations=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> list = this.deauthorizations;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders) && kotlin.jvm.internal.Intrinsics.areEqual(this.deauthorizations, ((com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders) other).deauthorizations);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders copy(java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> deauthorizations) {
            return new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders(deauthorizations);
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> component1() {
            return this.deauthorizations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders copy$default(com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = deauthorizePackageTrackingForAllProviders.deauthorizations;
            }
            return deauthorizePackageTrackingForAllProviders.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Deauthorization;", "", "", "dataDeleted", "deauthorized", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "emailProvider", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;)Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Deauthorization;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getDataDeleted", "getDeauthorized", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Deauthorization {
        public static final int $stable = 0;
        private final java.lang.Boolean dataDeleted;
        private final java.lang.Boolean deauthorized;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider emailProvider;

        public Deauthorization(java.lang.Boolean bool, java.lang.Boolean bool2, com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider) {
            this.dataDeleted = bool;
            this.deauthorized = bool2;
            this.emailProvider = packageTrackingIdentityProvider;
        }

        public final java.lang.Boolean getDataDeleted() {
            return this.dataDeleted;
        }

        public final java.lang.Boolean getDeauthorized() {
            return this.deauthorized;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.dataDeleted;
            java.lang.Boolean bool2 = this.deauthorized;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Deauthorization(dataDeleted=");
            sb.append(bool);
            sb.append(", deauthorized=");
            sb.append(bool2);
            sb.append(", emailProvider=");
            sb.append(packageTrackingIdentityProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.dataDeleted;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.deauthorized;
            int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider = this.emailProvider;
            return (((hashCode * 31) + hashCode2) * 31) + (packageTrackingIdentityProvider != null ? packageTrackingIdentityProvider.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization deauthorization = (com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.dataDeleted, deauthorization.dataDeleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.deauthorized, deauthorization.deauthorized) && this.emailProvider == deauthorization.emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization copy(java.lang.Boolean dataDeleted, java.lang.Boolean deauthorized, com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider emailProvider) {
            return new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization(dataDeleted, deauthorized, emailProvider);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider getEmailProvider() {
            return this.emailProvider;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getDeauthorized() {
            return this.deauthorized;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getDataDeleted() {
            return this.dataDeleted;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization copy$default(com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization deauthorization, java.lang.Boolean bool, java.lang.Boolean bool2, com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = deauthorization.dataDeleted;
            }
            if ((i & 2) != 0) {
                bool2 = deauthorization.deauthorized;
            }
            if ((i & 4) != 0) {
                packageTrackingIdentityProvider = deauthorization.emailProvider;
            }
            return deauthorization.copy(bool, bool2, packageTrackingIdentityProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation DeauthorizePackageTrackingForAllProviders($input: DeauthorizePackageTrackingForAllProvidersInput!) { deauthorizePackageTrackingForAllProviders(input: $input) { deauthorizations { dataDeleted deauthorized emailProvider } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput deauthorizePackageTrackingForAllProvidersInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeauthorizePackageTrackingForAllProvidersMutation(input=");
        sb.append(deauthorizePackageTrackingForAllProvidersInput);
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
        return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation) other).input);
    }

    public final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation copy(com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation copy$default(com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation deauthorizePackageTrackingForAllProvidersMutation, com.paypal.oslo.api.graphql.schema.type.DeauthorizePackageTrackingForAllProvidersInput deauthorizePackageTrackingForAllProvidersInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deauthorizePackageTrackingForAllProvidersInput = deauthorizePackageTrackingForAllProvidersMutation.input;
        }
        return deauthorizePackageTrackingForAllProvidersMutation.copy(deauthorizePackageTrackingForAllProvidersInput);
    }
}

package com.paypal.oslo.feature.packagetracking.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f*+,-./01234)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/MarkPackageAsDeliveredInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MarkPackageAsDeliveredInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MarkPackageAsDeliveredInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MarkPackageAsDeliveredInput;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/MarkPackageAsDeliveredInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OPERATION_NAME, "Package", "Carrier", "Item", "DestinationAddress", "ShipmentUpdate", "Location", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, "OnMerchant", "OnShipmentPackageExternalMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MarkPackageAsDeliveredMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data> {
    public static final java.lang.String OPERATION_ID = "47d1df2117f6ccc5acbe12e127384f7b8aefdf12227087cf5eadd5e3b9b4ed05";
    public static final java.lang.String OPERATION_NAME = "MarkPackageAsDelivered";
    private final com.paypal.oslo.api.graphql.schema.type.MarkPackageAsDeliveredInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Companion(null);
    public static final int $stable = 8;

    public MarkPackageAsDeliveredMutation(com.paypal.oslo.api.graphql.schema.type.MarkPackageAsDeliveredInput markPackageAsDeliveredInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markPackageAsDeliveredInput, "");
        this.input = markPackageAsDeliveredInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MarkPackageAsDeliveredInput getInput() {
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
        com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.MarkPackageAsDeliveredMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.packagetracking.graphql.selections.MarkPackageAsDeliveredMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;", "markPackageAsDelivered", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;", "getMarkPackageAsDelivered"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered;

        public Data(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered) {
            this.markPackageAsDelivered = markPackageAsDelivered;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered getMarkPackageAsDelivered() {
            return this.markPackageAsDelivered;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered = this.markPackageAsDelivered;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(markPackageAsDelivered=");
            sb.append(markPackageAsDelivered);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered = this.markPackageAsDelivered;
            if (markPackageAsDelivered == null) {
                return 0;
            }
            return markPackageAsDelivered.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.markPackageAsDelivered, ((com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data) other).markPackageAsDelivered);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data copy(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered) {
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data(markPackageAsDelivered);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered getMarkPackageAsDelivered() {
            return this.markPackageAsDelivered;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data copy$default(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Data data, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                markPackageAsDelivered = data.markPackageAsDelivered;
            }
            return data.copy(markPackageAsDelivered);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;", "package", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$MarkPackageAsDelivered;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;", "getPackage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MarkPackageAsDelivered {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package package;

        public MarkPackageAsDelivered(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r1) {
            this.package = r1;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package getPackage() {
            return this.package;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r0 = this.package;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MarkPackageAsDelivered(package=");
            sb.append(r0);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r0 = this.package;
            if (r0 == null) {
                return 0;
            }
            return r0.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered) && kotlin.jvm.internal.Intrinsics.areEqual(this.package, ((com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered) other).package);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered copy(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r2) {
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered(r2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package getPackage() {
            return this.package;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered copy$default(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.MarkPackageAsDelivered markPackageAsDelivered, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                r1 = markPackageAsDelivered.package;
            }
            return markPackageAsDelivered.copy(r1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010&J\u0012\u0010-\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010&J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010&J\u0012\u00105\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b5\u0010(J\u0012\u00106\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b8\u00101J\u0012\u00109\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010&J\u0010\u0010<\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010&J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b?\u00101J\u0012\u0010@\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\bB\u0010(J\u0010\u0010C\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bC\u0010=J \u0002\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\"\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010G\u001a\u00020\u001a2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020IHÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bL\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bP\u0010(R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010M\u001a\u0004\bQ\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010R\u001a\u0004\bS\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bT\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bU\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\bW\u0010/R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bZ\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\b[\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\b\\\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\b]\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010^\u001a\u0004\b_\u00107R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010X\u001a\u0004\b`\u00101R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010a\u001a\u0004\bb\u0010:R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010M\u001a\u0004\bc\u0010&R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010d\u001a\u0004\be\u0010=R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010M\u001a\u0004\bf\u0010&R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010X\u001a\u0004\bg\u00101R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010h\u001a\u0004\bi\u0010AR\u001c\u0010!\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010O\u001a\u0004\bj\u0010(R\u001a\u0010\"\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010d\u001a\u0004\bk\u0010="}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;", "", "", "id", "logoImageUrl", "trackingNumber", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "status", "statusMessage", "deliveryTime", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;", "carrier", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Item;", "items", "transactionNumber", "exceptionSummary", "exceptionDetails", "trackingLink", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;", "destinationAddress", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$ShipmentUpdate;", "shipmentUpdates", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;", "merchant", "packageNickname", "", "markedAsDelivered", "orderNumber", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingShipmentTag;", "tags", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;", "packageSource", "orderManagementUrl", "archived", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;Ljava/lang/Object;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;", "component14", "component15", "()Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;", "component16", "component17", "()Z", "component18", "component19", "component20", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;Ljava/lang/Object;Z)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Package;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getLogoImageUrl", "getTrackingNumber", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "getStatus", "getStatusMessage", "getDeliveryTime", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;", "getCarrier", "Ljava/util/List;", "getItems", "getTransactionNumber", "getExceptionSummary", "getExceptionDetails", "getTrackingLink", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;", "getDestinationAddress", "getShipmentUpdates", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;", "getMerchant", "getPackageNickname", "Z", "getMarkedAsDelivered", "getOrderNumber", "getTags", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;", "getPackageSource", "getOrderManagementUrl", "getArchived"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Package {
        public static final int $stable = 8;
        private final boolean archived;
        private final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier carrier;
        private final java.lang.Object deliveryTime;
        private final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress destinationAddress;
        private final java.lang.String exceptionDetails;
        private final java.lang.String exceptionSummary;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item> items;
        private final java.lang.Object logoImageUrl;
        private final boolean markedAsDelivered;
        private final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant merchant;
        private final java.lang.Object orderManagementUrl;
        private final java.lang.String orderNumber;
        private final java.lang.String packageNickname;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageSource;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate> shipmentUpdates;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus status;
        private final java.lang.String statusMessage;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> tags;
        private final java.lang.Object trackingLink;
        private final java.lang.String trackingNumber;
        private final java.lang.String transactionNumber;

        /* JADX WARN: Multi-variable type inference failed */
        public Package(java.lang.String str, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus, java.lang.String str3, java.lang.Object obj2, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier carrier, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item> list, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Object obj3, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress destinationAddress, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate> list2, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant merchant, java.lang.String str7, boolean z, java.lang.String str8, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> list3, com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageTrackingSource, java.lang.Object obj4, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingStatus, "");
            this.id = str;
            this.logoImageUrl = obj;
            this.trackingNumber = str2;
            this.status = packageTrackingStatus;
            this.statusMessage = str3;
            this.deliveryTime = obj2;
            this.carrier = carrier;
            this.items = list;
            this.transactionNumber = str4;
            this.exceptionSummary = str5;
            this.exceptionDetails = str6;
            this.trackingLink = obj3;
            this.destinationAddress = destinationAddress;
            this.shipmentUpdates = list2;
            this.merchant = merchant;
            this.packageNickname = str7;
            this.markedAsDelivered = z;
            this.orderNumber = str8;
            this.tags = list3;
            this.packageSource = packageTrackingSource;
            this.orderManagementUrl = obj4;
            this.archived = z2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        public final java.lang.String getTrackingNumber() {
            return this.trackingNumber;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getStatusMessage() {
            return this.statusMessage;
        }

        public final java.lang.Object getDeliveryTime() {
            return this.deliveryTime;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier getCarrier() {
            return this.carrier;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item> getItems() {
            return this.items;
        }

        public final java.lang.String getTransactionNumber() {
            return this.transactionNumber;
        }

        public final java.lang.String getExceptionSummary() {
            return this.exceptionSummary;
        }

        public final java.lang.String getExceptionDetails() {
            return this.exceptionDetails;
        }

        public final java.lang.Object getTrackingLink() {
            return this.trackingLink;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress getDestinationAddress() {
            return this.destinationAddress;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate> getShipmentUpdates() {
            return this.shipmentUpdates;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant getMerchant() {
            return this.merchant;
        }

        public final java.lang.String getPackageNickname() {
            return this.packageNickname;
        }

        public final boolean getMarkedAsDelivered() {
            return this.markedAsDelivered;
        }

        public final java.lang.String getOrderNumber() {
            return this.orderNumber;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> getTags() {
            return this.tags;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource getPackageSource() {
            return this.packageSource;
        }

        public final java.lang.Object getOrderManagementUrl() {
            return this.orderManagementUrl;
        }

        public final boolean getArchived() {
            return this.archived;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.logoImageUrl;
            java.lang.String str2 = this.trackingNumber;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = this.status;
            java.lang.String str3 = this.statusMessage;
            java.lang.Object obj2 = this.deliveryTime;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier carrier = this.carrier;
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item> list = this.items;
            java.lang.String str4 = this.transactionNumber;
            java.lang.String str5 = this.exceptionSummary;
            java.lang.String str6 = this.exceptionDetails;
            java.lang.Object obj3 = this.trackingLink;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress destinationAddress = this.destinationAddress;
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate> list2 = this.shipmentUpdates;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant merchant = this.merchant;
            java.lang.String str7 = this.packageNickname;
            boolean z = this.markedAsDelivered;
            java.lang.String str8 = this.orderNumber;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> list3 = this.tags;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageTrackingSource = this.packageSource;
            java.lang.Object obj4 = this.orderManagementUrl;
            boolean z2 = this.archived;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Package(id=");
            sb.append(str);
            sb.append(", logoImageUrl=");
            sb.append(obj);
            sb.append(", trackingNumber=");
            sb.append(str2);
            sb.append(", status=");
            sb.append(packageTrackingStatus);
            sb.append(", statusMessage=");
            sb.append(str3);
            sb.append(", deliveryTime=");
            sb.append(obj2);
            sb.append(", carrier=");
            sb.append(carrier);
            sb.append(", items=");
            sb.append(list);
            sb.append(", transactionNumber=");
            sb.append(str4);
            sb.append(", exceptionSummary=");
            sb.append(str5);
            sb.append(", exceptionDetails=");
            sb.append(str6);
            sb.append(", trackingLink=");
            sb.append(obj3);
            sb.append(", destinationAddress=");
            sb.append(destinationAddress);
            sb.append(", shipmentUpdates=");
            sb.append(list2);
            sb.append(", merchant=");
            sb.append(merchant);
            sb.append(", packageNickname=");
            sb.append(str7);
            sb.append(", markedAsDelivered=");
            sb.append(z);
            sb.append(", orderNumber=");
            sb.append(str8);
            sb.append(", tags=");
            sb.append(list3);
            sb.append(", packageSource=");
            sb.append(packageTrackingSource);
            sb.append(", orderManagementUrl=");
            sb.append(obj4);
            sb.append(", archived=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.Object obj = this.logoImageUrl;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            int hashCode3 = this.trackingNumber.hashCode();
            int hashCode4 = this.status.hashCode();
            java.lang.String str = this.statusMessage;
            int hashCode5 = str == null ? 0 : str.hashCode();
            java.lang.Object obj2 = this.deliveryTime;
            int hashCode6 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier carrier = this.carrier;
            int hashCode7 = carrier == null ? 0 : carrier.hashCode();
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item> list = this.items;
            int hashCode8 = list == null ? 0 : list.hashCode();
            java.lang.String str2 = this.transactionNumber;
            int hashCode9 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.exceptionSummary;
            int hashCode10 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.exceptionDetails;
            int hashCode11 = str4 == null ? 0 : str4.hashCode();
            java.lang.Object obj3 = this.trackingLink;
            int hashCode12 = obj3 == null ? 0 : obj3.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress destinationAddress = this.destinationAddress;
            int hashCode13 = destinationAddress == null ? 0 : destinationAddress.hashCode();
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate> list2 = this.shipmentUpdates;
            int hashCode14 = list2 == null ? 0 : list2.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant merchant = this.merchant;
            int hashCode15 = merchant == null ? 0 : merchant.hashCode();
            java.lang.String str5 = this.packageNickname;
            int hashCode16 = str5 == null ? 0 : str5.hashCode();
            int hashCode17 = java.lang.Boolean.hashCode(this.markedAsDelivered);
            java.lang.String str6 = this.orderNumber;
            int hashCode18 = str6 == null ? 0 : str6.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> list3 = this.tags;
            int hashCode19 = list3 == null ? 0 : list3.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageTrackingSource = this.packageSource;
            int hashCode20 = packageTrackingSource == null ? 0 : packageTrackingSource.hashCode();
            java.lang.Object obj4 = this.orderManagementUrl;
            return (((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + (obj4 != null ? obj4.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.archived);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package r5 = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, r5.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoImageUrl, r5.logoImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingNumber, r5.trackingNumber) && this.status == r5.status && kotlin.jvm.internal.Intrinsics.areEqual(this.statusMessage, r5.statusMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.deliveryTime, r5.deliveryTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.carrier, r5.carrier) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, r5.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionNumber, r5.transactionNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.exceptionSummary, r5.exceptionSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.exceptionDetails, r5.exceptionDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingLink, r5.trackingLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationAddress, r5.destinationAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.shipmentUpdates, r5.shipmentUpdates) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, r5.merchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageNickname, r5.packageNickname) && this.markedAsDelivered == r5.markedAsDelivered && kotlin.jvm.internal.Intrinsics.areEqual(this.orderNumber, r5.orderNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, r5.tags) && this.packageSource == r5.packageSource && kotlin.jvm.internal.Intrinsics.areEqual(this.orderManagementUrl, r5.orderManagementUrl) && this.archived == r5.archived;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package copy(java.lang.String id, java.lang.Object logoImageUrl, java.lang.String trackingNumber, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus status, java.lang.String statusMessage, java.lang.Object deliveryTime, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier carrier, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item> items, java.lang.String transactionNumber, java.lang.String exceptionSummary, java.lang.String exceptionDetails, java.lang.Object trackingLink, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress destinationAddress, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate> shipmentUpdates, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant merchant, java.lang.String packageNickname, boolean markedAsDelivered, java.lang.String orderNumber, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> tags, com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageSource, java.lang.Object orderManagementUrl, boolean archived) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Package(id, logoImageUrl, trackingNumber, status, statusMessage, deliveryTime, carrier, items, transactionNumber, exceptionSummary, exceptionDetails, trackingLink, destinationAddress, shipmentUpdates, merchant, packageNickname, markedAsDelivered, orderNumber, tags, packageSource, orderManagementUrl, archived);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getTransactionNumber() {
            return this.transactionNumber;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item> component8() {
            return this.items;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier getCarrier() {
            return this.carrier;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getDeliveryTime() {
            return this.deliveryTime;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getStatusMessage() {
            return this.statusMessage;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTrackingNumber() {
            return this.trackingNumber;
        }

        /* renamed from: component22, reason: from getter */
        public final boolean getArchived() {
            return this.archived;
        }

        /* renamed from: component21, reason: from getter */
        public final java.lang.Object getOrderManagementUrl() {
            return this.orderManagementUrl;
        }

        /* renamed from: component20, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource getPackageSource() {
            return this.packageSource;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> component19() {
            return this.tags;
        }

        /* renamed from: component18, reason: from getter */
        public final java.lang.String getOrderNumber() {
            return this.orderNumber;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getMarkedAsDelivered() {
            return this.markedAsDelivered;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.String getPackageNickname() {
            return this.packageNickname;
        }

        /* renamed from: component15, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant getMerchant() {
            return this.merchant;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate> component14() {
            return this.shipmentUpdates;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress getDestinationAddress() {
            return this.destinationAddress;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.Object getTrackingLink() {
            return this.trackingLink;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getExceptionDetails() {
            return this.exceptionDetails;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getExceptionSummary() {
            return this.exceptionSummary;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;", "", "", "id", "name", "logoImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Carrier;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Object;", "getLogoImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Carrier {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.Object logoImageUrl;
        private final java.lang.String name;

        public Carrier(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.name = str2;
            this.logoImageUrl = obj;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.Object obj = this.logoImageUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Carrier(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", logoImageUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.name;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.logoImageUrl;
            return (((hashCode * 31) + hashCode2) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier carrier = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, carrier.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, carrier.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoImageUrl, carrier.logoImageUrl);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier copy(java.lang.String id, java.lang.String name2, java.lang.Object logoImageUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier(id, name2, logoImageUrl);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier copy$default(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Carrier carrier, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = carrier.id;
            }
            if ((i & 2) != 0) {
                str2 = carrier.name;
            }
            if ((i & 4) != 0) {
                obj = carrier.logoImageUrl;
            }
            return carrier.copy(str, str2, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Item;", "", "", "name", "", "quantity", "imageUrl", "", "Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageItemTag;", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getQuantity", "Ljava/lang/Object;", "getImageUrl", "Ljava/util/List;", "getTags"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.Object imageUrl;
        private final java.lang.String name;
        private final java.lang.Integer quantity;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> tags;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(java.lang.String str, java.lang.Integer num, java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.quantity = num;
            this.imageUrl = obj;
            this.tags = list;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Integer getQuantity() {
            return this.quantity;
        }

        public final java.lang.Object getImageUrl() {
            return this.imageUrl;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> getTags() {
            return this.tags;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Integer num = this.quantity;
            java.lang.Object obj = this.imageUrl;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list = this.tags;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(name=");
            sb.append(str);
            sb.append(", quantity=");
            sb.append(num);
            sb.append(", imageUrl=");
            sb.append(obj);
            sb.append(", tags=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.Integer num = this.quantity;
            int hashCode2 = num == null ? 0 : num.hashCode();
            java.lang.Object obj = this.imageUrl;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list = this.tags;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item item = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, item.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, item.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, item.tags);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item copy(java.lang.String name2, java.lang.Integer quantity, java.lang.Object imageUrl, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> tags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item(name2, quantity, imageUrl, tags);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> component4() {
            return this.tags;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item copy$default(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Item item, java.lang.String str, java.lang.Integer num, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = item.name;
            }
            if ((i & 2) != 0) {
                num = item.quantity;
            }
            if ((i & 4) != 0) {
                obj = item.imageUrl;
            }
            if ((i & 8) != 0) {
                list = item.tags;
            }
            return item.copy(str, num, obj, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jz\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;", "", "", "addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$DestinationAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getAdminArea1", "getAdminArea2", "getAdminArea3", "getAdminArea4", "getPostalCode", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DestinationAddress {
        public static final int $stable = 8;
        private final java.lang.String addressLine1;
        private final java.lang.String addressLine2;
        private final java.lang.String addressLine3;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.String adminArea3;
        private final java.lang.String adminArea4;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public DestinationAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.addressLine1 = str;
            this.addressLine2 = str2;
            this.addressLine3 = str3;
            this.adminArea1 = str4;
            this.adminArea2 = str5;
            this.adminArea3 = str6;
            this.adminArea4 = str7;
            this.postalCode = str8;
            this.countryCode = obj;
        }

        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressLine1;
            java.lang.String str2 = this.addressLine2;
            java.lang.String str3 = this.addressLine3;
            java.lang.String str4 = this.adminArea1;
            java.lang.String str5 = this.adminArea2;
            java.lang.String str6 = this.adminArea3;
            java.lang.String str7 = this.adminArea4;
            java.lang.String str8 = this.postalCode;
            java.lang.Object obj = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DestinationAddress(addressLine1=");
            sb.append(str);
            sb.append(", addressLine2=");
            sb.append(str2);
            sb.append(", addressLine3=");
            sb.append(str3);
            sb.append(", adminArea1=");
            sb.append(str4);
            sb.append(", adminArea2=");
            sb.append(str5);
            sb.append(", adminArea3=");
            sb.append(str6);
            sb.append(", adminArea4=");
            sb.append(str7);
            sb.append(", postalCode=");
            sb.append(str8);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.addressLine1;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.addressLine2;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.addressLine3;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.adminArea1;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.adminArea2;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.adminArea3;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.adminArea4;
            int hashCode7 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.postalCode;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress destinationAddress = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, destinationAddress.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, destinationAddress.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine3, destinationAddress.addressLine3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, destinationAddress.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, destinationAddress.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea3, destinationAddress.adminArea3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea4, destinationAddress.adminArea4) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, destinationAddress.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, destinationAddress.countryCode);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String adminArea3, java.lang.String adminArea4, java.lang.String postalCode, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.DestinationAddress(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, adminArea4, postalCode, countryCode);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$ShipmentUpdate;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "shipmentStatus", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;", "location", "updateTime", "", "updateTimeDescription", "checkPointMessage", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "component2", "()Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$ShipmentUpdate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "getShipmentStatus", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;", "getLocation", "Ljava/lang/Object;", "getUpdateTime", "Ljava/lang/String;", "getUpdateTimeDescription", "getCheckPointMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShipmentUpdate {
        public static final int $stable = 8;
        private final java.lang.String checkPointMessage;
        private final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus shipmentStatus;
        private final java.lang.Object updateTime;
        private final java.lang.String updateTimeDescription;

        public ShipmentUpdate(com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location, java.lang.Object obj, java.lang.String str, java.lang.String str2) {
            this.shipmentStatus = packageTrackingStatus;
            this.location = location;
            this.updateTime = obj;
            this.updateTimeDescription = str;
            this.checkPointMessage = str2;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus getShipmentStatus() {
            return this.shipmentStatus;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location getLocation() {
            return this.location;
        }

        public final java.lang.Object getUpdateTime() {
            return this.updateTime;
        }

        public final java.lang.String getUpdateTimeDescription() {
            return this.updateTimeDescription;
        }

        public final java.lang.String getCheckPointMessage() {
            return this.checkPointMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = this.shipmentStatus;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location = this.location;
            java.lang.Object obj = this.updateTime;
            java.lang.String str = this.updateTimeDescription;
            java.lang.String str2 = this.checkPointMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShipmentUpdate(shipmentStatus=");
            sb.append(packageTrackingStatus);
            sb.append(", location=");
            sb.append(location);
            sb.append(", updateTime=");
            sb.append(obj);
            sb.append(", updateTimeDescription=");
            sb.append(str);
            sb.append(", checkPointMessage=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = this.shipmentStatus;
            int hashCode = packageTrackingStatus == null ? 0 : packageTrackingStatus.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location = this.location;
            int hashCode2 = location == null ? 0 : location.hashCode();
            java.lang.Object obj = this.updateTime;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.updateTimeDescription;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.checkPointMessage;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate shipmentUpdate = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate) other;
            return this.shipmentStatus == shipmentUpdate.shipmentStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.location, shipmentUpdate.location) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateTime, shipmentUpdate.updateTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateTimeDescription, shipmentUpdate.updateTimeDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkPointMessage, shipmentUpdate.checkPointMessage);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate copy(com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus shipmentStatus, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location, java.lang.Object updateTime, java.lang.String updateTimeDescription, java.lang.String checkPointMessage) {
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate(shipmentStatus, location, updateTime, updateTimeDescription, checkPointMessage);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCheckPointMessage() {
            return this.checkPointMessage;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getUpdateTimeDescription() {
            return this.updateTimeDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getUpdateTime() {
            return this.updateTime;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location getLocation() {
            return this.location;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus getShipmentStatus() {
            return this.shipmentStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate copy$default(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.ShipmentUpdate shipmentUpdate, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                packageTrackingStatus = shipmentUpdate.shipmentStatus;
            }
            if ((i & 2) != 0) {
                location = shipmentUpdate.location;
            }
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location2 = location;
            if ((i & 4) != 0) {
                obj = shipmentUpdate.updateTime;
            }
            java.lang.Object obj3 = obj;
            if ((i & 8) != 0) {
                str = shipmentUpdate.updateTimeDescription;
            }
            java.lang.String str3 = str;
            if ((i & 16) != 0) {
                str2 = shipmentUpdate.checkPointMessage;
            }
            return shipmentUpdate.copy(packageTrackingStatus, location2, obj3, str3, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jz\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;", "", "", "addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Location;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getAdminArea1", "getAdminArea2", "getAdminArea3", "getAdminArea4", "getPostalCode", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Location {
        public static final int $stable = 8;
        private final java.lang.String addressLine1;
        private final java.lang.String addressLine2;
        private final java.lang.String addressLine3;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.String adminArea3;
        private final java.lang.String adminArea4;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public Location(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.addressLine1 = str;
            this.addressLine2 = str2;
            this.addressLine3 = str3;
            this.adminArea1 = str4;
            this.adminArea2 = str5;
            this.adminArea3 = str6;
            this.adminArea4 = str7;
            this.postalCode = str8;
            this.countryCode = obj;
        }

        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressLine1;
            java.lang.String str2 = this.addressLine2;
            java.lang.String str3 = this.addressLine3;
            java.lang.String str4 = this.adminArea1;
            java.lang.String str5 = this.adminArea2;
            java.lang.String str6 = this.adminArea3;
            java.lang.String str7 = this.adminArea4;
            java.lang.String str8 = this.postalCode;
            java.lang.Object obj = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Location(addressLine1=");
            sb.append(str);
            sb.append(", addressLine2=");
            sb.append(str2);
            sb.append(", addressLine3=");
            sb.append(str3);
            sb.append(", adminArea1=");
            sb.append(str4);
            sb.append(", adminArea2=");
            sb.append(str5);
            sb.append(", adminArea3=");
            sb.append(str6);
            sb.append(", adminArea4=");
            sb.append(str7);
            sb.append(", postalCode=");
            sb.append(str8);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.addressLine1;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.addressLine2;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.addressLine3;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.adminArea1;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.adminArea2;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.adminArea3;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.adminArea4;
            int hashCode7 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.postalCode;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location location = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, location.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, location.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine3, location.addressLine3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, location.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, location.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea3, location.adminArea3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea4, location.adminArea4) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, location.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, location.countryCode);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String adminArea3, java.lang.String adminArea4, java.lang.String postalCode, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Location(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, adminArea4, postalCode, countryCode);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;", "", "", "__typename", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;", "onMerchant", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;", "onShipmentPackageExternalMerchant", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;", "component3", "()Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Merchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;", "getOnMerchant", "Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;", "getOnShipmentPackageExternalMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Merchant {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant onMerchant;
        private final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant;

        public Merchant(java.lang.String str, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant onMerchant, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMerchant = onMerchant;
            this.onShipmentPackageExternalMerchant = onShipmentPackageExternalMerchant;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant getOnMerchant() {
            return this.onMerchant;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant getOnShipmentPackageExternalMerchant() {
            return this.onShipmentPackageExternalMerchant;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant onMerchant = this.onMerchant;
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant = this.onShipmentPackageExternalMerchant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant(__typename=");
            sb.append(str);
            sb.append(", onMerchant=");
            sb.append(onMerchant);
            sb.append(", onShipmentPackageExternalMerchant=");
            sb.append(onShipmentPackageExternalMerchant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant onMerchant = this.onMerchant;
            int hashCode2 = onMerchant == null ? 0 : onMerchant.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant = this.onShipmentPackageExternalMerchant;
            return (((hashCode * 31) + hashCode2) * 31) + (onShipmentPackageExternalMerchant != null ? onShipmentPackageExternalMerchant.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant merchant = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, merchant.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMerchant, merchant.onMerchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.onShipmentPackageExternalMerchant, merchant.onShipmentPackageExternalMerchant);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant copy(java.lang.String __typename, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant onMerchant, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant(__typename, onMerchant, onShipmentPackageExternalMerchant);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant getOnShipmentPackageExternalMerchant() {
            return this.onShipmentPackageExternalMerchant;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant getOnMerchant() {
            return this.onMerchant;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant copy$default(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.Merchant merchant, java.lang.String str, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant onMerchant, com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = merchant.__typename;
            }
            if ((i & 2) != 0) {
                onMerchant = merchant.onMerchant;
            }
            if ((i & 4) != 0) {
                onShipmentPackageExternalMerchant = merchant.onShipmentPackageExternalMerchant;
            }
            return merchant.copy(str, onMerchant, onShipmentPackageExternalMerchant);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnMerchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMerchant {
        public static final int $stable = 0;
        private final java.lang.String id;

        public OnMerchant(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMerchant(id=");
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
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant) other).id);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant copy$default(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnMerchant onMerchant, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onMerchant.id;
            }
            return onMerchant.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;", "", "", "name", "logoImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$OnShipmentPackageExternalMerchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getLogoImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnShipmentPackageExternalMerchant {
        public static final int $stable = 8;
        private final java.lang.Object logoImageUrl;
        private final java.lang.String name;

        public OnShipmentPackageExternalMerchant(java.lang.String str, java.lang.Object obj) {
            this.name = str;
            this.logoImageUrl = obj;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Object obj = this.logoImageUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnShipmentPackageExternalMerchant(name=");
            sb.append(str);
            sb.append(", logoImageUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.logoImageUrl;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant = (com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, onShipmentPackageExternalMerchant.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoImageUrl, onShipmentPackageExternalMerchant.logoImageUrl);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant copy(java.lang.String name2, java.lang.Object logoImageUrl) {
            return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant(name2, logoImageUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant copy$default(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onShipmentPackageExternalMerchant.name;
            }
            if ((i & 2) != 0) {
                obj = onShipmentPackageExternalMerchant.logoImageUrl;
            }
            return onShipmentPackageExternalMerchant.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/MarkPackageAsDeliveredMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation MarkPackageAsDelivered($input: MarkPackageAsDeliveredInput!) { markPackageAsDelivered(input: $input) { package { id logoImageUrl trackingNumber status statusMessage deliveryTime carrier { id name logoImageUrl } items { name quantity imageUrl tags } transactionNumber exceptionSummary exceptionDetails trackingLink destinationAddress { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } shipmentUpdates { shipmentStatus location { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } updateTime updateTimeDescription checkPointMessage } merchant { __typename ... on Merchant { id } ... on ShipmentPackageExternalMerchant { name logoImageUrl } } packageNickname markedAsDelivered orderNumber tags packageSource orderManagementUrl archived } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MarkPackageAsDeliveredInput markPackageAsDeliveredInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MarkPackageAsDeliveredMutation(input=");
        sb.append(markPackageAsDeliveredInput);
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
        return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation) other).input);
    }

    public final com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation copy(com.paypal.oslo.api.graphql.schema.type.MarkPackageAsDeliveredInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MarkPackageAsDeliveredInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation copy$default(com.paypal.oslo.feature.packagetracking.graphql.MarkPackageAsDeliveredMutation markPackageAsDeliveredMutation, com.paypal.oslo.api.graphql.schema.type.MarkPackageAsDeliveredInput markPackageAsDeliveredInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            markPackageAsDeliveredInput = markPackageAsDeliveredMutation.input;
        }
        return markPackageAsDeliveredMutation.copy(markPackageAsDeliveredInput);
    }
}

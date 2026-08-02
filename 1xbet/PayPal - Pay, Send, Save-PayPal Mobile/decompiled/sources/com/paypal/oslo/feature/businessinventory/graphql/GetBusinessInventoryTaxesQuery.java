package com.paypal.oslo.feature.businessinventory.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantSortingInput;", "input", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getInput", "Companion", "Data", "MerchantTax"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetBusinessInventoryTaxesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "10aaf8c3508d0a56e6f7670fbf41891660550c00ab2deefae5bfabaf1bb17dea";
    public static final java.lang.String OPERATION_NAME = "GetBusinessInventoryTaxes";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Companion INSTANCE = new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Companion(null);
    public static final int $stable = 8;

    public GetBusinessInventoryTaxesQuery(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.input = optional;
    }

    public /* synthetic */ GetBusinessInventoryTaxesQuery(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> getInput() {
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
        com.paypal.oslo.feature.businessinventory.graphql.adapter.GetBusinessInventoryTaxesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businessinventory.graphql.adapter.GetBusinessInventoryTaxesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.businessinventory.graphql.selections.GetBusinessInventoryTaxesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$MerchantTax;", "merchantTaxes", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMerchantTaxes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax> merchantTaxes;

        public Data(java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax> list) {
            this.merchantTaxes = list;
        }

        public final java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax> getMerchantTaxes() {
            return this.merchantTaxes;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax> list = this.merchantTaxes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(merchantTaxes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax> list = this.merchantTaxes;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantTaxes, ((com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data) other).merchantTaxes);
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data copy(java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax> merchantTaxes) {
            return new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data(merchantTaxes);
        }

        public final java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax> component1() {
            return this.merchantTaxes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data copy$default(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.merchantTaxes;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$MerchantTax;", "", "", "id", "name", "percent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$MerchantTax;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getPercent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MerchantTax {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String name;
        private final java.lang.String percent;

        public MerchantTax(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.name = str2;
            this.percent = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getPercent() {
            return this.percent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.percent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantTax(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", percent=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.percent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax)) {
                return false;
            }
            com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax merchantTax = (com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchantTax.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchantTax.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.percent, merchantTax.percent);
        }

        public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax copy(java.lang.String id, java.lang.String name2, java.lang.String percent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percent, "");
            return new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax(id, name2, percent);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPercent() {
            return this.percent;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax copy$default(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax merchantTax, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = merchantTax.id;
            }
            if ((i & 2) != 0) {
                str2 = merchantTax.name;
            }
            if ((i & 4) != 0) {
                str3 = merchantTax.percent;
            }
            return merchantTax.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBusinessInventoryTaxes($input: MerchantSortingInput) { merchantTaxes(input: $input) { id name percent } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> optional = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBusinessInventoryTaxesQuery(input=");
        sb.append(optional);
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
        return (other instanceof com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery) other).input);
    }

    public final com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery(input);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput> component1() {
        return this.input;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery copy$default(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery getBusinessInventoryTaxesQuery, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = getBusinessInventoryTaxesQuery.input;
        }
        return getBusinessInventoryTaxesQuery.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetBusinessInventoryTaxesQuery() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

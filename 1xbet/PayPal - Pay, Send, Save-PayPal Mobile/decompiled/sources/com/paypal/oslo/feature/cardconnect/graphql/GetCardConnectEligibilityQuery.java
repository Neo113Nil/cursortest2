package com.paypal.oslo.feature.cardconnect.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CardConnectEligibilityInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CardConnectEligibilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CardConnectEligibilityInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CardConnectEligibilityInput;)Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CardConnectEligibilityInput;", "getInput", "Companion", "Data", "CardConnectEligibility", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetCardConnectEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "fcf35835bdabec7769c14278af89309b9534ab7bef67bd52b9038ba0ffe3b8c4";
    public static final java.lang.String OPERATION_NAME = "GetCardConnectEligibility";
    private final com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Companion(null);
    public static final int $stable = 8;

    public GetCardConnectEligibilityQuery(com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput cardConnectEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectEligibilityInput, "");
        this.input = cardConnectEligibilityInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput getInput() {
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
        com.paypal.oslo.feature.cardconnect.graphql.adapter.GetCardConnectEligibilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cardconnect.graphql.adapter.GetCardConnectEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.cardconnect.graphql.selections.GetCardConnectEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$CardConnectEligibility;", "cardConnectEligibility", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$CardConnectEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$CardConnectEligibility;", "copy", "(Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$CardConnectEligibility;)Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$CardConnectEligibility;", "getCardConnectEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility cardConnectEligibility;

        public Data(com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility cardConnectEligibility) {
            this.cardConnectEligibility = cardConnectEligibility;
        }

        public final com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility getCardConnectEligibility() {
            return this.cardConnectEligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility cardConnectEligibility = this.cardConnectEligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cardConnectEligibility=");
            sb.append(cardConnectEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility cardConnectEligibility = this.cardConnectEligibility;
            if (cardConnectEligibility == null) {
                return 0;
            }
            return cardConnectEligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardConnectEligibility, ((com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data) other).cardConnectEligibility);
        }

        public final com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data copy(com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility cardConnectEligibility) {
            return new com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data(cardConnectEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility getCardConnectEligibility() {
            return this.cardConnectEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data copy$default(com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Data data, com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility cardConnectEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardConnectEligibility = data.cardConnectEligibility;
            }
            return data.copy(cardConnectEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$CardConnectEligibility;", "", "", "isEligible", "", "reasonCode", "", "Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$Merchant;", "merchants", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(ZLjava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$CardConnectEligibility;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getReasonCode", "Ljava/util/List;", "getMerchants"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardConnectEligibility {
        public static final int $stable = 8;
        private final boolean isEligible;
        private final java.util.List<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant> merchants;
        private final java.lang.String reasonCode;

        public CardConnectEligibility(boolean z, java.lang.String str, java.util.List<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant> list) {
            this.isEligible = z;
            this.reasonCode = str;
            this.merchants = list;
        }

        public final boolean isEligible() {
            return this.isEligible;
        }

        public final java.lang.String getReasonCode() {
            return this.reasonCode;
        }

        public final java.util.List<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant> getMerchants() {
            return this.merchants;
        }

        public final java.lang.String toString() {
            boolean z = this.isEligible;
            java.lang.String str = this.reasonCode;
            java.util.List<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant> list = this.merchants;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardConnectEligibility(isEligible=");
            sb.append(z);
            sb.append(", reasonCode=");
            sb.append(str);
            sb.append(", merchants=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isEligible);
            java.lang.String str = this.reasonCode;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant> list = this.merchants;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility cardConnectEligibility = (com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility) other;
            return this.isEligible == cardConnectEligibility.isEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.reasonCode, cardConnectEligibility.reasonCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchants, cardConnectEligibility.merchants);
        }

        public final com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility copy(boolean isEligible, java.lang.String reasonCode, java.util.List<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant> merchants) {
            return new com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility(isEligible, reasonCode, merchants);
        }

        public final java.util.List<com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant> component3() {
            return this.merchants;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReasonCode() {
            return this.reasonCode;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsEligible() {
            return this.isEligible;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility copy$default(com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.CardConnectEligibility cardConnectEligibility, boolean z, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = cardConnectEligibility.isEligible;
            }
            if ((i & 2) != 0) {
                str = cardConnectEligibility.reasonCode;
            }
            if ((i & 4) != 0) {
                list = cardConnectEligibility.merchants;
            }
            return cardConnectEligibility.copy(z, str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$Merchant;", "", "", "externalCode", "id", "name", "", "stackRank", "", "connected", "connectedTime", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;IZLjava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()I", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;IZLjava/lang/Object;)Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$Merchant;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getExternalCode", "Ljava/lang/Object;", "getId", "getName", com.visa.cbp.getEncExpo.warmup, "getStackRank", "Z", "getConnected", "getConnectedTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Merchant {
        public static final int $stable = 8;
        private final boolean connected;
        private final java.lang.Object connectedTime;
        private final java.lang.String externalCode;
        private final java.lang.Object id;
        private final java.lang.String name;
        private final int stackRank;

        public Merchant(java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, boolean z, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.externalCode = str;
            this.id = obj;
            this.name = str2;
            this.stackRank = i;
            this.connected = z;
            this.connectedTime = obj2;
        }

        public final java.lang.String getExternalCode() {
            return this.externalCode;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final int getStackRank() {
            return this.stackRank;
        }

        public final boolean getConnected() {
            return this.connected;
        }

        public final java.lang.Object getConnectedTime() {
            return this.connectedTime;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.externalCode;
            java.lang.Object obj = this.id;
            java.lang.String str2 = this.name;
            int i = this.stackRank;
            boolean z = this.connected;
            java.lang.Object obj2 = this.connectedTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant(externalCode=");
            sb.append(str);
            sb.append(", id=");
            sb.append(obj);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", stackRank=");
            sb.append(i);
            sb.append(", connected=");
            sb.append(z);
            sb.append(", connectedTime=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.externalCode.hashCode();
            int hashCode2 = this.id.hashCode();
            java.lang.String str = this.name;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = java.lang.Integer.hashCode(this.stackRank);
            int hashCode5 = java.lang.Boolean.hashCode(this.connected);
            java.lang.Object obj = this.connectedTime;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant)) {
                return false;
            }
            com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant merchant = (com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.externalCode, merchant.externalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchant.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchant.name) && this.stackRank == merchant.stackRank && this.connected == merchant.connected && kotlin.jvm.internal.Intrinsics.areEqual(this.connectedTime, merchant.connectedTime);
        }

        public final com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant copy(java.lang.String externalCode, java.lang.Object id, java.lang.String name2, int stackRank, boolean connected, java.lang.Object connectedTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant(externalCode, id, name2, stackRank, connected, connectedTime);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getConnectedTime() {
            return this.connectedTime;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getConnected() {
            return this.connected;
        }

        /* renamed from: component4, reason: from getter */
        public final int getStackRank() {
            return this.stackRank;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getExternalCode() {
            return this.externalCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant copy$default(com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery.Merchant merchant, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, boolean z, java.lang.Object obj2, int i2, java.lang.Object obj3) {
            if ((i2 & 1) != 0) {
                str = merchant.externalCode;
            }
            if ((i2 & 2) != 0) {
                obj = merchant.id;
            }
            java.lang.Object obj4 = obj;
            if ((i2 & 4) != 0) {
                str2 = merchant.name;
            }
            java.lang.String str3 = str2;
            if ((i2 & 8) != 0) {
                i = merchant.stackRank;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                z = merchant.connected;
            }
            boolean z2 = z;
            if ((i2 & 32) != 0) {
                obj2 = merchant.connectedTime;
            }
            return merchant.copy(str, obj4, str3, i3, z2, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/graphql/GetCardConnectEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCardConnectEligibility($input: CardConnectEligibilityInput!) { cardConnectEligibility(input: $input) { isEligible reasonCode merchants { externalCode id name stackRank connected connectedTime } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput cardConnectEligibilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCardConnectEligibilityQuery(input=");
        sb.append(cardConnectEligibilityInput);
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
        return (other instanceof com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery copy(com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery copy$default(com.paypal.oslo.feature.cardconnect.graphql.GetCardConnectEligibilityQuery getCardConnectEligibilityQuery, com.paypal.oslo.api.graphql.schema.type.CardConnectEligibilityInput cardConnectEligibilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardConnectEligibilityInput = getCardConnectEligibilityQuery.input;
        }
        return getCardConnectEligibilityQuery.copy(cardConnectEligibilityInput);
    }
}

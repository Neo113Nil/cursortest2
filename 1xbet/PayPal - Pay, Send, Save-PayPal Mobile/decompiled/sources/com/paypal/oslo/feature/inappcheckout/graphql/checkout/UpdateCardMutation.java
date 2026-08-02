package com.paypal.oslo.feature.inappcheckout.graphql.checkout;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\bLMNOPQRKBI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J^\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b<\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010-R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010/R\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u00101R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u00103"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$Data;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardUpdateInput;", "cardUpdate", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;", "cardholder", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;", "address", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "deviceType", "Lcom/apollographql/apollo/api/Optional;", "", "paypalRequestId", "", "preferred", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardUpdateInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;Lcom/apollographql/apollo/api/Optional;Z)V", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardUpdateInput;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;", "component4", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;", "component5", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "component6", "()Lcom/apollographql/apollo/api/Optional;", "component7", "()Z", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardUpdateInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;Lcom/apollographql/apollo/api/Optional;Z)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getToken", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardUpdateInput;", "getCardUpdate", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;", "getCardholder", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;", "getAddress", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "getDeviceType", "Lcom/apollographql/apollo/api/Optional;", "getPaypalRequestId", "Z", "getPreferred", "Companion", "Data", "External", "UpdateCard", "OnExternalUpdateCardSuccessResponse", "StaleDomain", "OnExternalUpdateCardErrorResponse", "Error"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UpdateCardMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data> {
    public static final java.lang.String OPERATION_ID = "7279462f5c8305308536d4755352e0edb14cd109da091b1715024836ac91eafa";
    public static final java.lang.String OPERATION_NAME = "updateCard";
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput address;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput cardUpdate;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput cardholder;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType deviceType;
    private final com.apollographql.apollo.api.Optional<java.lang.String> paypalRequestId;
    private final boolean preferred;
    private final java.lang.Object token;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateCardMutation(java.lang.Object obj, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput externalCardUpdateInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType, com.apollographql.apollo.api.Optional<java.lang.String> optional, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalCardUpdateInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalCardholderInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalCardBillingAddressInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalDeviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.token = obj;
        this.cardUpdate = externalCardUpdateInput;
        this.cardholder = externalCardholderInput;
        this.address = externalCardBillingAddressInput;
        this.deviceType = externalDeviceType;
        this.paypalRequestId = optional;
        this.preferred = z;
    }

    public final java.lang.Object getToken() {
        return this.token;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput getCardUpdate() {
        return this.cardUpdate;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput getCardholder() {
        return this.cardholder;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput getAddress() {
        return this.address;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType getDeviceType() {
        return this.deviceType;
    }

    public /* synthetic */ UpdateCardMutation(java.lang.Object obj, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput externalCardUpdateInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType, com.apollographql.apollo.api.Optional optional, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, externalCardUpdateInput, externalCardholderInput, externalCardBillingAddressInput, externalDeviceType, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, z);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPaypalRequestId() {
        return this.paypalRequestId;
    }

    public final boolean getPreferred() {
        return this.preferred;
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
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.UpdateCardMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.UpdateCardMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.inappcheckout.graphql.checkout.selections.UpdateCardMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$External;", com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$External;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$External;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$External;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$External;", "getExternal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External external;

        public Data(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External external) {
            this.external = external;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External getExternal() {
            return this.external;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External external = this.external;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(external=");
            sb.append(external);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External external = this.external;
            if (external == null) {
                return 0;
            }
            return external.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.external, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data) other).external);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External external) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data(external);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External getExternal() {
            return this.external;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Data data, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External external, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                external = data.external;
            }
            return data.copy(external);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$External;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$UpdateCard;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OPERATION_NAME, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$UpdateCard;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$UpdateCard;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$UpdateCard;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$External;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$UpdateCard;", "getUpdateCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class External {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard updateCard;

        public External(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard updateCard) {
            this.updateCard = updateCard;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard getUpdateCard() {
            return this.updateCard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard updateCard = this.updateCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("External(updateCard=");
            sb.append(updateCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard updateCard = this.updateCard;
            if (updateCard == null) {
                return 0;
            }
            return updateCard.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateCard, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External) other).updateCard);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard updateCard) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External(updateCard);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard getUpdateCard() {
            return this.updateCard;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.External external, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard updateCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateCard = external.updateCard;
            }
            return external.copy(updateCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$UpdateCard;", "", "", "__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardSuccessResponse;", "onExternalUpdateCardSuccessResponse", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardErrorResponse;", "onExternalUpdateCardErrorResponse", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardSuccessResponse;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardErrorResponse;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardSuccessResponse;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardErrorResponse;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardSuccessResponse;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardErrorResponse;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$UpdateCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardSuccessResponse;", "getOnExternalUpdateCardSuccessResponse", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardErrorResponse;", "getOnExternalUpdateCardErrorResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateCard {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse onExternalUpdateCardErrorResponse;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse onExternalUpdateCardSuccessResponse;

        public UpdateCard(java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse onExternalUpdateCardSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse onExternalUpdateCardErrorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onExternalUpdateCardSuccessResponse = onExternalUpdateCardSuccessResponse;
            this.onExternalUpdateCardErrorResponse = onExternalUpdateCardErrorResponse;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse getOnExternalUpdateCardSuccessResponse() {
            return this.onExternalUpdateCardSuccessResponse;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse getOnExternalUpdateCardErrorResponse() {
            return this.onExternalUpdateCardErrorResponse;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse onExternalUpdateCardSuccessResponse = this.onExternalUpdateCardSuccessResponse;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse onExternalUpdateCardErrorResponse = this.onExternalUpdateCardErrorResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCard(__typename=");
            sb.append(str);
            sb.append(", onExternalUpdateCardSuccessResponse=");
            sb.append(onExternalUpdateCardSuccessResponse);
            sb.append(", onExternalUpdateCardErrorResponse=");
            sb.append(onExternalUpdateCardErrorResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse onExternalUpdateCardSuccessResponse = this.onExternalUpdateCardSuccessResponse;
            int hashCode2 = onExternalUpdateCardSuccessResponse == null ? 0 : onExternalUpdateCardSuccessResponse.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse onExternalUpdateCardErrorResponse = this.onExternalUpdateCardErrorResponse;
            return (((hashCode * 31) + hashCode2) * 31) + (onExternalUpdateCardErrorResponse != null ? onExternalUpdateCardErrorResponse.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard updateCard = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, updateCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalUpdateCardSuccessResponse, updateCard.onExternalUpdateCardSuccessResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalUpdateCardErrorResponse, updateCard.onExternalUpdateCardErrorResponse);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard copy(java.lang.String __typename, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse onExternalUpdateCardSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse onExternalUpdateCardErrorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard(__typename, onExternalUpdateCardSuccessResponse, onExternalUpdateCardErrorResponse);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse getOnExternalUpdateCardErrorResponse() {
            return this.onExternalUpdateCardErrorResponse;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse getOnExternalUpdateCardSuccessResponse() {
            return this.onExternalUpdateCardSuccessResponse;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.UpdateCard updateCard, java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse onExternalUpdateCardSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse onExternalUpdateCardErrorResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateCard.__typename;
            }
            if ((i & 2) != 0) {
                onExternalUpdateCardSuccessResponse = updateCard.onExternalUpdateCardSuccessResponse;
            }
            if ((i & 4) != 0) {
                onExternalUpdateCardErrorResponse = updateCard.onExternalUpdateCardErrorResponse;
            }
            return updateCard.copy(str, onExternalUpdateCardSuccessResponse, onExternalUpdateCardErrorResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardSuccessResponse;", "", "", "id", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$StaleDomain;", "staleDomains", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardSuccessResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getStaleDomains"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalUpdateCardSuccessResponse {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain> staleDomains;

        public OnExternalUpdateCardSuccessResponse(java.lang.String str, java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.staleDomains = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain> getStaleDomains() {
            return this.staleDomains;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain> list = this.staleDomains;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalUpdateCardSuccessResponse(id=");
            sb.append(str);
            sb.append(", staleDomains=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.staleDomains.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse onExternalUpdateCardSuccessResponse = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onExternalUpdateCardSuccessResponse.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.staleDomains, onExternalUpdateCardSuccessResponse.staleDomains);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse copy(java.lang.String id, java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain> staleDomains) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staleDomains, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse(id, staleDomains);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain> component2() {
            return this.staleDomains;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardSuccessResponse onExternalUpdateCardSuccessResponse, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onExternalUpdateCardSuccessResponse.id;
            }
            if ((i & 2) != 0) {
                list = onExternalUpdateCardSuccessResponse.staleDomains;
            }
            return onExternalUpdateCardSuccessResponse.copy(str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$StaleDomain;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "domain", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$StaleDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "getDomain"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StaleDomain {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain domain;

        public StaleDomain(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalDomain, "");
            this.domain = externalDomain;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain getDomain() {
            return this.domain;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain = this.domain;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StaleDomain(domain=");
            sb.append(externalDomain);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.domain.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain) && this.domain == ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain) other).domain;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain domain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain(domain);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain getDomain() {
            return this.domain;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.StaleDomain staleDomain, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                externalDomain = staleDomain.domain;
            }
            return staleDomain.copy(externalDomain);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardErrorResponse;", "", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$Error;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$OnExternalUpdateCardErrorResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalUpdateCardErrorResponse {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error> errors;

        public OnExternalUpdateCardErrorResponse(java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errors = list;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error> getErrors() {
            return this.errors;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error> list = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalUpdateCardErrorResponse(errors=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errors.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse) other).errors);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse copy(java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse(errors);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error> component1() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.OnExternalUpdateCardErrorResponse onExternalUpdateCardErrorResponse, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onExternalUpdateCardErrorResponse.errors;
            }
            return onExternalUpdateCardErrorResponse.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$Error;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalUpdateCardErrorReason;", "name", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalUpdateCardErrorReason;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalUpdateCardErrorReason;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalUpdateCardErrorReason;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$Error;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalUpdateCardErrorReason;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalUpdateCardErrorReason name;

        public Error(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalUpdateCardErrorReason externalUpdateCardErrorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalUpdateCardErrorReason, "");
            this.name = externalUpdateCardErrorReason;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalUpdateCardErrorReason getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalUpdateCardErrorReason externalUpdateCardErrorReason = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(name=");
            sb.append(externalUpdateCardErrorReason);
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
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error) && this.name == ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error) other).name;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalUpdateCardErrorReason name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalUpdateCardErrorReason getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation.Error error, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalUpdateCardErrorReason externalUpdateCardErrorReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                externalUpdateCardErrorReason = error.name;
            }
            return error.copy(externalUpdateCardErrorReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/UpdateCardMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation updateCard($token: externalToken!, $cardUpdate: externalCardUpdateInput!, $cardholder: externalCardholderInput!, $address: externalCardBillingAddressInput!, $deviceType: externalDeviceType!, $paypalRequestId: String, $preferred: Boolean!) { external { updateCard(token: $token, cardUpdate: $cardUpdate, cardholder: $cardholder, address: $address, deviceType: $deviceType, paypalRequestId: $paypalRequestId, preferred: $preferred) { __typename ... on externalUpdateCardSuccessResponse { id staleDomains { domain } } ... on externalUpdateCardErrorResponse { errors { name } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.token;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput externalCardUpdateInput = this.cardUpdate;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput = this.cardholder;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput = this.address;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType = this.deviceType;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.paypalRequestId;
        boolean z = this.preferred;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCardMutation(token=");
        sb.append(obj);
        sb.append(", cardUpdate=");
        sb.append(externalCardUpdateInput);
        sb.append(", cardholder=");
        sb.append(externalCardholderInput);
        sb.append(", address=");
        sb.append(externalCardBillingAddressInput);
        sb.append(", deviceType=");
        sb.append(externalDeviceType);
        sb.append(", paypalRequestId=");
        sb.append(optional);
        sb.append(", preferred=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.token.hashCode() * 31) + this.cardUpdate.hashCode()) * 31) + this.cardholder.hashCode()) * 31) + this.address.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.paypalRequestId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.preferred);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation updateCardMutation = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, updateCardMutation.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardUpdate, updateCardMutation.cardUpdate) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardholder, updateCardMutation.cardholder) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, updateCardMutation.address) && this.deviceType == updateCardMutation.deviceType && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalRequestId, updateCardMutation.paypalRequestId) && this.preferred == updateCardMutation.preferred;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation copy(java.lang.Object token, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput cardUpdate, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput cardholder, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput address, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType deviceType, com.apollographql.apollo.api.Optional<java.lang.String> paypalRequestId, boolean preferred) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardUpdate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardholder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalRequestId, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation(token, cardUpdate, cardholder, address, deviceType, paypalRequestId, preferred);
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPreferred() {
        return this.preferred;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component6() {
        return this.paypalRequestId;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput getAddress() {
        return this.address;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput getCardholder() {
        return this.cardholder;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput getCardUpdate() {
        return this.cardUpdate;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.UpdateCardMutation updateCardMutation, java.lang.Object obj, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput externalCardUpdateInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType, com.apollographql.apollo.api.Optional optional, boolean z, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = updateCardMutation.token;
        }
        if ((i & 2) != 0) {
            externalCardUpdateInput = updateCardMutation.cardUpdate;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardUpdateInput externalCardUpdateInput2 = externalCardUpdateInput;
        if ((i & 4) != 0) {
            externalCardholderInput = updateCardMutation.cardholder;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput2 = externalCardholderInput;
        if ((i & 8) != 0) {
            externalCardBillingAddressInput = updateCardMutation.address;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput2 = externalCardBillingAddressInput;
        if ((i & 16) != 0) {
            externalDeviceType = updateCardMutation.deviceType;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType2 = externalDeviceType;
        if ((i & 32) != 0) {
            optional = updateCardMutation.paypalRequestId;
        }
        com.apollographql.apollo.api.Optional optional2 = optional;
        if ((i & 64) != 0) {
            z = updateCardMutation.preferred;
        }
        return updateCardMutation.copy(obj, externalCardUpdateInput2, externalCardholderInput2, externalCardBillingAddressInput2, externalDeviceType2, optional2, z);
    }
}

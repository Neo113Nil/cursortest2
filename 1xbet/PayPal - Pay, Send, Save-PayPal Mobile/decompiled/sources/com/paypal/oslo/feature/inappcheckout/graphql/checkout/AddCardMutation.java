package com.paypal.oslo.feature.inappcheckout.graphql.checkout;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\bLMNOPQRKBI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fHÆ\u0003¢\u0006\u0004\b2\u00103J^\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fHÆ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b<\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010-R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010/R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u00101R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u00103"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$Data;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardInput;", "card", "", "preferred", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;", "cardholder", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;", "address", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "deviceType", "Lcom/apollographql/apollo/api/Optional;", "", "paypalRequestId", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardInput;ZLcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;Lcom/apollographql/apollo/api/Optional;)V", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardInput;", "component3", "()Z", "component4", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;", "component5", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;", "component6", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "component7", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardInput;ZLcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getToken", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardInput;", "getCard", "Z", "getPreferred", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardholderInput;", "getCardholder", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCardBillingAddressInput;", "getAddress", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDeviceType;", "getDeviceType", "Lcom/apollographql/apollo/api/Optional;", "getPaypalRequestId", "Companion", "Data", "External", "AddCard", "OnExternalAddCardSuccessResponse", "StaleDomain", "OnExternalAddCardErrorResponse", "Error"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddCardMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data> {
    public static final java.lang.String OPERATION_ID = "3c630b4ae8ec33efde1518c27cce60e8772aec9dff4d4a7ed183e0595340ad4e";
    public static final java.lang.String OPERATION_NAME = "addCard";
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput address;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput card;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput cardholder;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType deviceType;
    private final com.apollographql.apollo.api.Optional<java.lang.String> paypalRequestId;
    private final boolean preferred;
    private final java.lang.Object token;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Companion(null);
    public static final int $stable = 8;

    public AddCardMutation(java.lang.Object obj, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput externalCardInput, boolean z, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalCardInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalCardholderInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalCardBillingAddressInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalDeviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.token = obj;
        this.card = externalCardInput;
        this.preferred = z;
        this.cardholder = externalCardholderInput;
        this.address = externalCardBillingAddressInput;
        this.deviceType = externalDeviceType;
        this.paypalRequestId = optional;
    }

    public final java.lang.Object getToken() {
        return this.token;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput getCard() {
        return this.card;
    }

    public final boolean getPreferred() {
        return this.preferred;
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

    public /* synthetic */ AddCardMutation(java.lang.Object obj, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput externalCardInput, boolean z, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType, com.apollographql.apollo.api.Optional optional, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, externalCardInput, z, externalCardholderInput, externalCardBillingAddressInput, externalDeviceType, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPaypalRequestId() {
        return this.paypalRequestId;
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
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AddCardMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AddCardMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.inappcheckout.graphql.checkout.selections.AddCardMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$External;", com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$External;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$External;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$External;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$External;", "getExternal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External external;

        public Data(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External external) {
            this.external = external;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External getExternal() {
            return this.external;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External external = this.external;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(external=");
            sb.append(external);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External external = this.external;
            if (external == null) {
                return 0;
            }
            return external.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.external, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data) other).external);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External external) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data(external);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External getExternal() {
            return this.external;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Data data, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External external, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                external = data.external;
            }
            return data.copy(external);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$External;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$AddCard;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$AddCard;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$AddCard;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$AddCard;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$External;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$AddCard;", "getAddCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class External {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard addCard;

        public External(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard addCard) {
            this.addCard = addCard;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard getAddCard() {
            return this.addCard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard addCard = this.addCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("External(addCard=");
            sb.append(addCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard addCard = this.addCard;
            if (addCard == null) {
                return 0;
            }
            return addCard.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External) && kotlin.jvm.internal.Intrinsics.areEqual(this.addCard, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External) other).addCard);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard addCard) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External(addCard);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard getAddCard() {
            return this.addCard;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.External external, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard addCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addCard = external.addCard;
            }
            return external.copy(addCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$AddCard;", "", "", "__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardSuccessResponse;", "onExternalAddCardSuccessResponse", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardErrorResponse;", "onExternalAddCardErrorResponse", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardSuccessResponse;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardErrorResponse;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardSuccessResponse;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardErrorResponse;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardSuccessResponse;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardErrorResponse;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$AddCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardSuccessResponse;", "getOnExternalAddCardSuccessResponse", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardErrorResponse;", "getOnExternalAddCardErrorResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddCard {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse onExternalAddCardErrorResponse;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse onExternalAddCardSuccessResponse;

        public AddCard(java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse onExternalAddCardSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse onExternalAddCardErrorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onExternalAddCardSuccessResponse = onExternalAddCardSuccessResponse;
            this.onExternalAddCardErrorResponse = onExternalAddCardErrorResponse;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse getOnExternalAddCardSuccessResponse() {
            return this.onExternalAddCardSuccessResponse;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse getOnExternalAddCardErrorResponse() {
            return this.onExternalAddCardErrorResponse;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse onExternalAddCardSuccessResponse = this.onExternalAddCardSuccessResponse;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse onExternalAddCardErrorResponse = this.onExternalAddCardErrorResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCard(__typename=");
            sb.append(str);
            sb.append(", onExternalAddCardSuccessResponse=");
            sb.append(onExternalAddCardSuccessResponse);
            sb.append(", onExternalAddCardErrorResponse=");
            sb.append(onExternalAddCardErrorResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse onExternalAddCardSuccessResponse = this.onExternalAddCardSuccessResponse;
            int hashCode2 = onExternalAddCardSuccessResponse == null ? 0 : onExternalAddCardSuccessResponse.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse onExternalAddCardErrorResponse = this.onExternalAddCardErrorResponse;
            return (((hashCode * 31) + hashCode2) * 31) + (onExternalAddCardErrorResponse != null ? onExternalAddCardErrorResponse.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard addCard = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, addCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalAddCardSuccessResponse, addCard.onExternalAddCardSuccessResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalAddCardErrorResponse, addCard.onExternalAddCardErrorResponse);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard copy(java.lang.String __typename, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse onExternalAddCardSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse onExternalAddCardErrorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard(__typename, onExternalAddCardSuccessResponse, onExternalAddCardErrorResponse);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse getOnExternalAddCardErrorResponse() {
            return this.onExternalAddCardErrorResponse;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse getOnExternalAddCardSuccessResponse() {
            return this.onExternalAddCardSuccessResponse;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.AddCard addCard, java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse onExternalAddCardSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse onExternalAddCardErrorResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addCard.__typename;
            }
            if ((i & 2) != 0) {
                onExternalAddCardSuccessResponse = addCard.onExternalAddCardSuccessResponse;
            }
            if ((i & 4) != 0) {
                onExternalAddCardErrorResponse = addCard.onExternalAddCardErrorResponse;
            }
            return addCard.copy(str, onExternalAddCardSuccessResponse, onExternalAddCardErrorResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardSuccessResponse;", "", "", "id", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$StaleDomain;", "staleDomains", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardSuccessResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getStaleDomains"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalAddCardSuccessResponse {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain> staleDomains;

        public OnExternalAddCardSuccessResponse(java.lang.String str, java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.staleDomains = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain> getStaleDomains() {
            return this.staleDomains;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain> list = this.staleDomains;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalAddCardSuccessResponse(id=");
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
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse onExternalAddCardSuccessResponse = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onExternalAddCardSuccessResponse.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.staleDomains, onExternalAddCardSuccessResponse.staleDomains);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse copy(java.lang.String id, java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain> staleDomains) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staleDomains, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse(id, staleDomains);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain> component2() {
            return this.staleDomains;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardSuccessResponse onExternalAddCardSuccessResponse, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onExternalAddCardSuccessResponse.id;
            }
            if ((i & 2) != 0) {
                list = onExternalAddCardSuccessResponse.staleDomains;
            }
            return onExternalAddCardSuccessResponse.copy(str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$StaleDomain;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "domain", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$StaleDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "getDomain"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain) && this.domain == ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain) other).domain;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain domain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain(domain);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain getDomain() {
            return this.domain;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.StaleDomain staleDomain, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                externalDomain = staleDomain.domain;
            }
            return staleDomain.copy(externalDomain);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardErrorResponse;", "", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$Error;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$OnExternalAddCardErrorResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalAddCardErrorResponse {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error> errors;

        public OnExternalAddCardErrorResponse(java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errors = list;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error> getErrors() {
            return this.errors;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error> list = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalAddCardErrorResponse(errors=");
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
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse) other).errors);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse copy(java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse(errors);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error> component1() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OnExternalAddCardErrorResponse onExternalAddCardErrorResponse, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onExternalAddCardErrorResponse.errors;
            }
            return onExternalAddCardErrorResponse.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$Error;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason;", "name", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$Error;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAddCardErrorReason;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason name;

        public Error(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalAddCardErrorReason, "");
            this.name = externalAddCardErrorReason;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(name=");
            sb.append(externalAddCardErrorReason);
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
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error) && this.name == ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error) other).name;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.Error error, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAddCardErrorReason externalAddCardErrorReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                externalAddCardErrorReason = error.name;
            }
            return error.copy(externalAddCardErrorReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AddCardMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation addCard($token: externalToken!, $card: externalCardInput!, $preferred: Boolean!, $cardholder: externalCardholderInput!, $address: externalCardBillingAddressInput!, $deviceType: externalDeviceType!, $paypalRequestId: String) { external { addCard(token: $token, card: $card, preferred: $preferred, cardholder: $cardholder, address: $address, deviceType: $deviceType, paypalRequestId: $paypalRequestId) { __typename ... on externalAddCardSuccessResponse { id staleDomains { domain } } ... on externalAddCardErrorResponse { errors { name } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.token;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput externalCardInput = this.card;
        boolean z = this.preferred;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput = this.cardholder;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput = this.address;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType = this.deviceType;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.paypalRequestId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCardMutation(token=");
        sb.append(obj);
        sb.append(", card=");
        sb.append(externalCardInput);
        sb.append(", preferred=");
        sb.append(z);
        sb.append(", cardholder=");
        sb.append(externalCardholderInput);
        sb.append(", address=");
        sb.append(externalCardBillingAddressInput);
        sb.append(", deviceType=");
        sb.append(externalDeviceType);
        sb.append(", paypalRequestId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.token.hashCode() * 31) + this.card.hashCode()) * 31) + java.lang.Boolean.hashCode(this.preferred)) * 31) + this.cardholder.hashCode()) * 31) + this.address.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.paypalRequestId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation addCardMutation = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, addCardMutation.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.card, addCardMutation.card) && this.preferred == addCardMutation.preferred && kotlin.jvm.internal.Intrinsics.areEqual(this.cardholder, addCardMutation.cardholder) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, addCardMutation.address) && this.deviceType == addCardMutation.deviceType && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalRequestId, addCardMutation.paypalRequestId);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation copy(java.lang.Object token, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput card, boolean preferred, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput cardholder, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput address, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType deviceType, com.apollographql.apollo.api.Optional<java.lang.String> paypalRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardholder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paypalRequestId, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation(token, card, preferred, cardholder, address, deviceType, paypalRequestId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component7() {
        return this.paypalRequestId;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput getCardholder() {
        return this.cardholder;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPreferred() {
        return this.preferred;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput getCard() {
        return this.card;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation addCardMutation, java.lang.Object obj, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput externalCardInput, boolean z, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = addCardMutation.token;
        }
        if ((i & 2) != 0) {
            externalCardInput = addCardMutation.card;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardInput externalCardInput2 = externalCardInput;
        if ((i & 4) != 0) {
            z = addCardMutation.preferred;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            externalCardholderInput = addCardMutation.cardholder;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardholderInput externalCardholderInput2 = externalCardholderInput;
        if ((i & 16) != 0) {
            externalCardBillingAddressInput = addCardMutation.address;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBillingAddressInput externalCardBillingAddressInput2 = externalCardBillingAddressInput;
        if ((i & 32) != 0) {
            externalDeviceType = addCardMutation.deviceType;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDeviceType externalDeviceType2 = externalDeviceType;
        if ((i & 64) != 0) {
            optional = addCardMutation.paypalRequestId;
        }
        return addCardMutation.copy(obj, externalCardInput2, z2, externalCardholderInput2, externalCardBillingAddressInput2, externalDeviceType2, optional);
    }
}

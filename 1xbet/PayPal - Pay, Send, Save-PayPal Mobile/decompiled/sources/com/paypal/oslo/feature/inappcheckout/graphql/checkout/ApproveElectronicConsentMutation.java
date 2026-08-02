package com.paypal.oslo.feature.inappcheckout.graphql.checkout;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006)*+,-(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$Data;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Ljava/lang/Object;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getToken", "Companion", "Data", "External", "ApproveElectronicConsent", "OnExternalElectronicConsentContingencyResolutionSuccessResponse", "OnExternalElectronicConsentContingencyResolutionErrorResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ApproveElectronicConsentMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data> {
    public static final java.lang.String OPERATION_ID = "8b3d2614c2b30be4a54adf4754ae99493c4faf4e3b65037153a0c16ca958baaf";
    public static final java.lang.String OPERATION_NAME = "approveElectronicConsent";
    private final java.lang.Object token;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Companion(null);
    public static final int $stable = 8;

    public ApproveElectronicConsentMutation(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.token = obj;
    }

    public final java.lang.Object getToken() {
        return this.token;
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
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.ApproveElectronicConsentMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.ApproveElectronicConsentMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.inappcheckout.graphql.checkout.selections.ApproveElectronicConsentMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$External;", com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$External;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$External;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$External;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$External;", "getExternal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External external;

        public Data(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External external) {
            this.external = external;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External getExternal() {
            return this.external;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External external = this.external;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(external=");
            sb.append(external);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External external = this.external;
            if (external == null) {
                return 0;
            }
            return external.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.external, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data) other).external);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External external) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data(external);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External getExternal() {
            return this.external;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data data, com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External external, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                external = data.external;
            }
            return data.copy(external);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$External;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$ApproveElectronicConsent;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OPERATION_NAME, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$ApproveElectronicConsent;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$ApproveElectronicConsent;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$ApproveElectronicConsent;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$External;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$ApproveElectronicConsent;", "getApproveElectronicConsent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class External {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent approveElectronicConsent;

        public External(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent approveElectronicConsent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approveElectronicConsent, "");
            this.approveElectronicConsent = approveElectronicConsent;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent getApproveElectronicConsent() {
            return this.approveElectronicConsent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent approveElectronicConsent = this.approveElectronicConsent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("External(approveElectronicConsent=");
            sb.append(approveElectronicConsent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.approveElectronicConsent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External) && kotlin.jvm.internal.Intrinsics.areEqual(this.approveElectronicConsent, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External) other).approveElectronicConsent);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent approveElectronicConsent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approveElectronicConsent, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External(approveElectronicConsent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent getApproveElectronicConsent() {
            return this.approveElectronicConsent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External external, com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent approveElectronicConsent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                approveElectronicConsent = external.approveElectronicConsent;
            }
            return external.copy(approveElectronicConsent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$ApproveElectronicConsent;", "", "", "__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionSuccessResponse;", "onExternalElectronicConsentContingencyResolutionSuccessResponse", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionErrorResponse;", "onExternalElectronicConsentContingencyResolutionErrorResponse", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionSuccessResponse;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionErrorResponse;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionSuccessResponse;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionErrorResponse;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionSuccessResponse;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionErrorResponse;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$ApproveElectronicConsent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionSuccessResponse;", "getOnExternalElectronicConsentContingencyResolutionSuccessResponse", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionErrorResponse;", "getOnExternalElectronicConsentContingencyResolutionErrorResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApproveElectronicConsent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse onExternalElectronicConsentContingencyResolutionErrorResponse;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse onExternalElectronicConsentContingencyResolutionSuccessResponse;

        public ApproveElectronicConsent(java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse onExternalElectronicConsentContingencyResolutionSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse onExternalElectronicConsentContingencyResolutionErrorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onExternalElectronicConsentContingencyResolutionSuccessResponse = onExternalElectronicConsentContingencyResolutionSuccessResponse;
            this.onExternalElectronicConsentContingencyResolutionErrorResponse = onExternalElectronicConsentContingencyResolutionErrorResponse;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse getOnExternalElectronicConsentContingencyResolutionSuccessResponse() {
            return this.onExternalElectronicConsentContingencyResolutionSuccessResponse;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse getOnExternalElectronicConsentContingencyResolutionErrorResponse() {
            return this.onExternalElectronicConsentContingencyResolutionErrorResponse;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse onExternalElectronicConsentContingencyResolutionSuccessResponse = this.onExternalElectronicConsentContingencyResolutionSuccessResponse;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse onExternalElectronicConsentContingencyResolutionErrorResponse = this.onExternalElectronicConsentContingencyResolutionErrorResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApproveElectronicConsent(__typename=");
            sb.append(str);
            sb.append(", onExternalElectronicConsentContingencyResolutionSuccessResponse=");
            sb.append(onExternalElectronicConsentContingencyResolutionSuccessResponse);
            sb.append(", onExternalElectronicConsentContingencyResolutionErrorResponse=");
            sb.append(onExternalElectronicConsentContingencyResolutionErrorResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse onExternalElectronicConsentContingencyResolutionSuccessResponse = this.onExternalElectronicConsentContingencyResolutionSuccessResponse;
            int hashCode2 = onExternalElectronicConsentContingencyResolutionSuccessResponse == null ? 0 : onExternalElectronicConsentContingencyResolutionSuccessResponse.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse onExternalElectronicConsentContingencyResolutionErrorResponse = this.onExternalElectronicConsentContingencyResolutionErrorResponse;
            return (((hashCode * 31) + hashCode2) * 31) + (onExternalElectronicConsentContingencyResolutionErrorResponse != null ? onExternalElectronicConsentContingencyResolutionErrorResponse.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent approveElectronicConsent = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, approveElectronicConsent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalElectronicConsentContingencyResolutionSuccessResponse, approveElectronicConsent.onExternalElectronicConsentContingencyResolutionSuccessResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalElectronicConsentContingencyResolutionErrorResponse, approveElectronicConsent.onExternalElectronicConsentContingencyResolutionErrorResponse);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent copy(java.lang.String __typename, com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse onExternalElectronicConsentContingencyResolutionSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse onExternalElectronicConsentContingencyResolutionErrorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent(__typename, onExternalElectronicConsentContingencyResolutionSuccessResponse, onExternalElectronicConsentContingencyResolutionErrorResponse);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse getOnExternalElectronicConsentContingencyResolutionErrorResponse() {
            return this.onExternalElectronicConsentContingencyResolutionErrorResponse;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse getOnExternalElectronicConsentContingencyResolutionSuccessResponse() {
            return this.onExternalElectronicConsentContingencyResolutionSuccessResponse;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent approveElectronicConsent, java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse onExternalElectronicConsentContingencyResolutionSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse onExternalElectronicConsentContingencyResolutionErrorResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = approveElectronicConsent.__typename;
            }
            if ((i & 2) != 0) {
                onExternalElectronicConsentContingencyResolutionSuccessResponse = approveElectronicConsent.onExternalElectronicConsentContingencyResolutionSuccessResponse;
            }
            if ((i & 4) != 0) {
                onExternalElectronicConsentContingencyResolutionErrorResponse = approveElectronicConsent.onExternalElectronicConsentContingencyResolutionErrorResponse;
            }
            return approveElectronicConsent.copy(str, onExternalElectronicConsentContingencyResolutionSuccessResponse, onExternalElectronicConsentContingencyResolutionErrorResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionSuccessResponse;", "", "", "status", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionSuccessResponse;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalElectronicConsentContingencyResolutionSuccessResponse {
        public static final int $stable = 0;
        private final boolean status;

        public OnExternalElectronicConsentContingencyResolutionSuccessResponse(boolean z) {
            this.status = z;
        }

        public final boolean getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            boolean z = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalElectronicConsentContingencyResolutionSuccessResponse(status=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.status);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse) && this.status == ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse) other).status;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse copy(boolean status) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse(status);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse onExternalElectronicConsentContingencyResolutionSuccessResponse, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onExternalElectronicConsentContingencyResolutionSuccessResponse.status;
            }
            return onExternalElectronicConsentContingencyResolutionSuccessResponse.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionErrorResponse;", "", "", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$OnExternalElectronicConsentContingencyResolutionErrorResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalElectronicConsentContingencyResolutionErrorResponse {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> errors;

        public OnExternalElectronicConsentContingencyResolutionErrorResponse(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errors = list;
        }

        public final java.util.List<java.lang.String> getErrors() {
            return this.errors;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalElectronicConsentContingencyResolutionErrorResponse(errors=");
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
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse) other).errors);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse copy(java.util.List<java.lang.String> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse(errors);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse onExternalElectronicConsentContingencyResolutionErrorResponse, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onExternalElectronicConsentContingencyResolutionErrorResponse.errors;
            }
            return onExternalElectronicConsentContingencyResolutionErrorResponse.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/ApproveElectronicConsentMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation approveElectronicConsent($token: externalToken!) { external { approveElectronicConsent(token: $token) { __typename ... on externalElectronicConsentContingencyResolutionSuccessResponse { status } ... on externalElectronicConsentContingencyResolutionErrorResponse { errors } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.token;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ApproveElectronicConsentMutation(token=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation) other).token);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation copy(java.lang.Object token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation(token);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation approveElectronicConsentMutation, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = approveElectronicConsentMutation.token;
        }
        return approveElectronicConsentMutation.copy(obj);
    }
}

package com.paypal.oslo.feature.checkcapture.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"# B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.OPERATION_NAME, "Customer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthenticateCheckCaptureUserMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Companion INSTANCE = new com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Companion(null);
    public static final java.lang.String OPERATION_ID = "c121f31809905876923c79f2ba2a70d5c276fd5b935928bbb66139e156a81169";
    public static final java.lang.String OPERATION_NAME = "AuthenticateCheckCaptureUser";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.checkcapture.graphql.selections.AuthenticateCheckCaptureUserMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;", "authenticateCheckCaptureUser", "<init>", "(Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;)V", "component1", "()Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;", "copy", "(Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;)Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;", "getAuthenticateCheckCaptureUser"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser;

        public Data(com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser) {
            this.authenticateCheckCaptureUser = authenticateCheckCaptureUser;
        }

        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser getAuthenticateCheckCaptureUser() {
            return this.authenticateCheckCaptureUser;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser = this.authenticateCheckCaptureUser;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(authenticateCheckCaptureUser=");
            sb.append(authenticateCheckCaptureUser);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser = this.authenticateCheckCaptureUser;
            if (authenticateCheckCaptureUser == null) {
                return 0;
            }
            return authenticateCheckCaptureUser.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticateCheckCaptureUser, ((com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data) other).authenticateCheckCaptureUser);
        }

        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data copy(com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser) {
            return new com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data(authenticateCheckCaptureUser);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser getAuthenticateCheckCaptureUser() {
            return this.authenticateCheckCaptureUser;
        }

        public static /* synthetic */ com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data copy$default(com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data data, com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticateCheckCaptureUser = data.authenticateCheckCaptureUser;
            }
            return data.copy(authenticateCheckCaptureUser);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;", "", "Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;", "customer", "", "sessionId", "ssoToken", "<init>", "(Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;", "getCustomer", "Ljava/lang/String;", "getSessionId", "getSsoToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticateCheckCaptureUser {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer customer;
        private final java.lang.String sessionId;
        private final java.lang.String ssoToken;

        public AuthenticateCheckCaptureUser(com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer customer, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.customer = customer;
            this.sessionId = str;
            this.ssoToken = str2;
        }

        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer getCustomer() {
            return this.customer;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final java.lang.String getSsoToken() {
            return this.ssoToken;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer customer = this.customer;
            java.lang.String str = this.sessionId;
            java.lang.String str2 = this.ssoToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticateCheckCaptureUser(customer=");
            sb.append(customer);
            sb.append(", sessionId=");
            sb.append(str);
            sb.append(", ssoToken=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.customer.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.ssoToken.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser)) {
                return false;
            }
            com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser = (com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.customer, authenticateCheckCaptureUser.customer) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, authenticateCheckCaptureUser.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.ssoToken, authenticateCheckCaptureUser.ssoToken);
        }

        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser copy(com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer customer, java.lang.String sessionId, java.lang.String ssoToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ssoToken, "");
            return new com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser(customer, sessionId, ssoToken);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSsoToken() {
            return this.ssoToken;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer getCustomer() {
            return this.customer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser copy$default(com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser, com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer customer, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                customer = authenticateCheckCaptureUser.customer;
            }
            if ((i & 2) != 0) {
                str = authenticateCheckCaptureUser.sessionId;
            }
            if ((i & 4) != 0) {
                str2 = authenticateCheckCaptureUser.ssoToken;
            }
            return authenticateCheckCaptureUser.copy(customer, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/CheckCaptureCustomerStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CheckCaptureCustomerStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CheckCaptureCustomerStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CheckCaptureCustomerStatus;)Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/CheckCaptureCustomerStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Customer {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.CheckCaptureCustomerStatus status;

        public Customer(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CheckCaptureCustomerStatus checkCaptureCustomerStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureCustomerStatus, "");
            this.id = str;
            this.status = checkCaptureCustomerStatus;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CheckCaptureCustomerStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.CheckCaptureCustomerStatus checkCaptureCustomerStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Customer(id=");
            sb.append(str);
            sb.append(", status=");
            sb.append(checkCaptureCustomerStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer)) {
                return false;
            }
            com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer customer = (com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, customer.id) && this.status == customer.status;
        }

        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.CheckCaptureCustomerStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer(id, status);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CheckCaptureCustomerStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer copy$default(com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer customer, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CheckCaptureCustomerStatus checkCaptureCustomerStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = customer.id;
            }
            if ((i & 2) != 0) {
                checkCaptureCustomerStatus = customer.status;
            }
            return customer.copy(str, checkCaptureCustomerStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation AuthenticateCheckCaptureUser { authenticateCheckCaptureUser { customer { id status } sessionId ssoToken } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}

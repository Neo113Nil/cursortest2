package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ExchangeAuthorizationCodeForAccessTokenInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ExchangeAuthorizationCodeForAccessTokenInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ExchangeAuthorizationCodeForAccessTokenInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ExchangeAuthorizationCodeForAccessTokenInput;)Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ExchangeAuthorizationCodeForAccessTokenInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExchangeAuthorizationCodeForAccessTokenMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data> {
    public static final java.lang.String OPERATION_ID = "d298e2d8d713a18c8c732aba848e846e76b31e059a37dd15718a430c8081f942";
    public static final java.lang.String OPERATION_NAME = "ExchangeAuthorizationCodeForAccessToken";
    private final com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Companion(null);
    public static final int $stable = 8;

    public ExchangeAuthorizationCodeForAccessTokenMutation(com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput exchangeAuthorizationCodeForAccessTokenInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeAuthorizationCodeForAccessTokenInput, "");
        this.input = exchangeAuthorizationCodeForAccessTokenInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.ExchangeAuthorizationCodeForAccessTokenMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;", "exchangeAuthorizationCodeForAccessToken", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;)Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;", "getExchangeAuthorizationCodeForAccessToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken exchangeAuthorizationCodeForAccessToken;

        public Data(com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken exchangeAuthorizationCodeForAccessToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeAuthorizationCodeForAccessToken, "");
            this.exchangeAuthorizationCodeForAccessToken = exchangeAuthorizationCodeForAccessToken;
        }

        public final com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken getExchangeAuthorizationCodeForAccessToken() {
            return this.exchangeAuthorizationCodeForAccessToken;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken exchangeAuthorizationCodeForAccessToken = this.exchangeAuthorizationCodeForAccessToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(exchangeAuthorizationCodeForAccessToken=");
            sb.append(exchangeAuthorizationCodeForAccessToken);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.exchangeAuthorizationCodeForAccessToken.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeAuthorizationCodeForAccessToken, ((com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data) other).exchangeAuthorizationCodeForAccessToken);
        }

        public final com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data copy(com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken exchangeAuthorizationCodeForAccessToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeAuthorizationCodeForAccessToken, "");
            return new com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data(exchangeAuthorizationCodeForAccessToken);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken getExchangeAuthorizationCodeForAccessToken() {
            return this.exchangeAuthorizationCodeForAccessToken;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data data, com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken exchangeAuthorizationCodeForAccessToken, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exchangeAuthorizationCodeForAccessToken = data.exchangeAuthorizationCodeForAccessToken;
            }
            return data.copy(exchangeAuthorizationCodeForAccessToken);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "expiresInSec", "expiresAtTime", "<init>", "(Ljava/lang/String;ILjava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;ILjava/lang/Object;)Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getToken", com.visa.cbp.getEncExpo.warmup, "getExpiresInSec", "Ljava/lang/Object;", "getExpiresAtTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExchangeAuthorizationCodeForAccessToken {
        public static final int $stable = 8;
        private final java.lang.Object expiresAtTime;
        private final int expiresInSec;
        private final java.lang.String token;

        public ExchangeAuthorizationCodeForAccessToken(java.lang.String str, int i, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.token = str;
            this.expiresInSec = i;
            this.expiresAtTime = obj;
        }

        public final java.lang.String getToken() {
            return this.token;
        }

        public final int getExpiresInSec() {
            return this.expiresInSec;
        }

        public final java.lang.Object getExpiresAtTime() {
            return this.expiresAtTime;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.token;
            int i = this.expiresInSec;
            java.lang.Object obj = this.expiresAtTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeAuthorizationCodeForAccessToken(token=");
            sb.append(str);
            sb.append(", expiresInSec=");
            sb.append(i);
            sb.append(", expiresAtTime=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.token.hashCode() * 31) + java.lang.Integer.hashCode(this.expiresInSec)) * 31) + this.expiresAtTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken exchangeAuthorizationCodeForAccessToken = (com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.token, exchangeAuthorizationCodeForAccessToken.token) && this.expiresInSec == exchangeAuthorizationCodeForAccessToken.expiresInSec && kotlin.jvm.internal.Intrinsics.areEqual(this.expiresAtTime, exchangeAuthorizationCodeForAccessToken.expiresAtTime);
        }

        public final com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken copy(java.lang.String token, int expiresInSec, java.lang.Object expiresAtTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiresAtTime, "");
            return new com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken(token, expiresInSec, expiresAtTime);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getExpiresAtTime() {
            return this.expiresAtTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getExpiresInSec() {
            return this.expiresInSec;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken copy$default(com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken exchangeAuthorizationCodeForAccessToken, java.lang.String str, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
            if ((i2 & 1) != 0) {
                str = exchangeAuthorizationCodeForAccessToken.token;
            }
            if ((i2 & 2) != 0) {
                i = exchangeAuthorizationCodeForAccessToken.expiresInSec;
            }
            if ((i2 & 4) != 0) {
                obj = exchangeAuthorizationCodeForAccessToken.expiresAtTime;
            }
            return exchangeAuthorizationCodeForAccessToken.copy(str, i, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ExchangeAuthorizationCodeForAccessToken($input: ExchangeAuthorizationCodeForAccessTokenInput!) { exchangeAuthorizationCodeForAccessToken(input: $input) { token expiresInSec expiresAtTime } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput exchangeAuthorizationCodeForAccessTokenInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeAuthorizationCodeForAccessTokenMutation(input=");
        sb.append(exchangeAuthorizationCodeForAccessTokenInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation copy(com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation copy$default(com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation exchangeAuthorizationCodeForAccessTokenMutation, com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput exchangeAuthorizationCodeForAccessTokenInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            exchangeAuthorizationCodeForAccessTokenInput = exchangeAuthorizationCodeForAccessTokenMutation.input;
        }
        return exchangeAuthorizationCodeForAccessTokenMutation.copy(exchangeAuthorizationCodeForAccessTokenInput);
    }
}

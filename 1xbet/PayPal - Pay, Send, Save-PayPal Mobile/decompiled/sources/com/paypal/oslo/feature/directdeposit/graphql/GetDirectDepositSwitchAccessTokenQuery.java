package com.paypal.oslo.feature.directdeposit.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\" B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "DirectDepositSwitchAccessToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetDirectDepositSwitchAccessTokenQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Companion INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "73cd2644bf24989c7dd4fd31bcb1df0d46651e22cae41da835387bffa2f1001f";
    public static final java.lang.String OPERATION_NAME = "GetDirectDepositSwitchAccessToken";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSwitchAccessTokenQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.directdeposit.graphql.selections.GetDirectDepositSwitchAccessTokenQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$DirectDepositSwitchAccessToken;", "directDepositSwitchAccessToken", "<init>", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$DirectDepositSwitchAccessToken;)V", "component1", "()Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$DirectDepositSwitchAccessToken;", "copy", "(Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$DirectDepositSwitchAccessToken;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$DirectDepositSwitchAccessToken;", "getDirectDepositSwitchAccessToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken directDepositSwitchAccessToken;

        public Data(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken directDepositSwitchAccessToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositSwitchAccessToken, "");
            this.directDepositSwitchAccessToken = directDepositSwitchAccessToken;
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken getDirectDepositSwitchAccessToken() {
            return this.directDepositSwitchAccessToken;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken directDepositSwitchAccessToken = this.directDepositSwitchAccessToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(directDepositSwitchAccessToken=");
            sb.append(directDepositSwitchAccessToken);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.directDepositSwitchAccessToken.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.directDepositSwitchAccessToken, ((com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data) other).directDepositSwitchAccessToken);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data copy(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken directDepositSwitchAccessToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositSwitchAccessToken, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data(directDepositSwitchAccessToken);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken getDirectDepositSwitchAccessToken() {
            return this.directDepositSwitchAccessToken;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.Data data, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken directDepositSwitchAccessToken, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                directDepositSwitchAccessToken = data.directDepositSwitchAccessToken;
            }
            return data.copy(directDepositSwitchAccessToken);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$DirectDepositSwitchAccessToken;", "", "", "id", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$DirectDepositSwitchAccessToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAccessToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DirectDepositSwitchAccessToken {
        public static final int $stable = 0;
        private final java.lang.String accessToken;
        private final java.lang.String id;

        public DirectDepositSwitchAccessToken(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.accessToken = str2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getAccessToken() {
            return this.accessToken;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.accessToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DirectDepositSwitchAccessToken(id=");
            sb.append(str);
            sb.append(", accessToken=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.accessToken.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken)) {
                return false;
            }
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken directDepositSwitchAccessToken = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, directDepositSwitchAccessToken.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.accessToken, directDepositSwitchAccessToken.accessToken);
        }

        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken copy(java.lang.String id, java.lang.String accessToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "");
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken(id, accessToken);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccessToken() {
            return this.accessToken;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken copy$default(com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSwitchAccessTokenQuery.DirectDepositSwitchAccessToken directDepositSwitchAccessToken, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = directDepositSwitchAccessToken.id;
            }
            if ((i & 2) != 0) {
                str2 = directDepositSwitchAccessToken.accessToken;
            }
            return directDepositSwitchAccessToken.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSwitchAccessTokenQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetDirectDepositSwitchAccessToken { directDepositSwitchAccessToken { id accessToken } }";
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

package com.paypal.oslo.feature.consumerprivacy.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006!\"#$% B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "ConnectedAppsAndSitesConsent", "OnConnectedAppsAndSitesAuthConsent", "Permission", "OnConnectedAppsAndSitesProviderConsent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Companion INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "35d7f442cef4724d290a73f9369c358ae6b39303635c9881529b9b817ab60271";
    public static final java.lang.String OPERATION_NAME = "GetConsumerPrivacyConnectedAppsAndSitesConsents";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.consumerprivacy.graphql.selections.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$ConnectedAppsAndSitesConsent;", "connectedAppsAndSitesConsents", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getConnectedAppsAndSitesConsents"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent> connectedAppsAndSitesConsents;

        public Data(java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.connectedAppsAndSitesConsents = list;
        }

        public final java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent> getConnectedAppsAndSitesConsents() {
            return this.connectedAppsAndSitesConsents;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent> list = this.connectedAppsAndSitesConsents;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(connectedAppsAndSitesConsents=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.connectedAppsAndSitesConsents.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectedAppsAndSitesConsents, ((com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data) other).connectedAppsAndSitesConsents);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data copy(java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent> connectedAppsAndSitesConsents) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsAndSitesConsents, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data(connectedAppsAndSitesConsents);
        }

        public final java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent> component1() {
            return this.connectedAppsAndSitesConsents;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.connectedAppsAndSitesConsents;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJd\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$ConnectedAppsAndSitesConsent;", "", "", "__typename", "id", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "category", "appId", "appName", "externalUserId", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;", "onConnectedAppsAndSitesAuthConsent", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;", "onConnectedAppsAndSitesProviderConsent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;", "component8", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$ConnectedAppsAndSitesConsent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "getCategory", "getAppId", "getAppName", "getExternalUserId", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;", "getOnConnectedAppsAndSitesAuthConsent", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;", "getOnConnectedAppsAndSitesProviderConsent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConnectedAppsAndSitesConsent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String appId;
        private final java.lang.String appName;
        private final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory category;
        private final java.lang.String externalUserId;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent onConnectedAppsAndSitesAuthConsent;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent;

        public ConnectedAppsAndSitesConsent(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent onConnectedAppsAndSitesAuthConsent, com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsAndSitesCategory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.__typename = str;
            this.id = str2;
            this.category = connectedAppsAndSitesCategory;
            this.appId = str3;
            this.appName = str4;
            this.externalUserId = str5;
            this.onConnectedAppsAndSitesAuthConsent = onConnectedAppsAndSitesAuthConsent;
            this.onConnectedAppsAndSitesProviderConsent = onConnectedAppsAndSitesProviderConsent;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory getCategory() {
            return this.category;
        }

        public final java.lang.String getAppId() {
            return this.appId;
        }

        public final java.lang.String getAppName() {
            return this.appName;
        }

        public final java.lang.String getExternalUserId() {
            return this.externalUserId;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent getOnConnectedAppsAndSitesAuthConsent() {
            return this.onConnectedAppsAndSitesAuthConsent;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent getOnConnectedAppsAndSitesProviderConsent() {
            return this.onConnectedAppsAndSitesProviderConsent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.id;
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory = this.category;
            java.lang.String str3 = this.appId;
            java.lang.String str4 = this.appName;
            java.lang.String str5 = this.externalUserId;
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent onConnectedAppsAndSitesAuthConsent = this.onConnectedAppsAndSitesAuthConsent;
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent = this.onConnectedAppsAndSitesProviderConsent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectedAppsAndSitesConsent(__typename=");
            sb.append(str);
            sb.append(", id=");
            sb.append(str2);
            sb.append(", category=");
            sb.append(connectedAppsAndSitesCategory);
            sb.append(", appId=");
            sb.append(str3);
            sb.append(", appName=");
            sb.append(str4);
            sb.append(", externalUserId=");
            sb.append(str5);
            sb.append(", onConnectedAppsAndSitesAuthConsent=");
            sb.append(onConnectedAppsAndSitesAuthConsent);
            sb.append(", onConnectedAppsAndSitesProviderConsent=");
            sb.append(onConnectedAppsAndSitesProviderConsent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.id.hashCode();
            int hashCode3 = this.category.hashCode();
            int hashCode4 = this.appId.hashCode();
            int hashCode5 = this.appName.hashCode();
            int hashCode6 = this.externalUserId.hashCode();
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent onConnectedAppsAndSitesAuthConsent = this.onConnectedAppsAndSitesAuthConsent;
            int hashCode7 = onConnectedAppsAndSitesAuthConsent == null ? 0 : onConnectedAppsAndSitesAuthConsent.hashCode();
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent = this.onConnectedAppsAndSitesProviderConsent;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (onConnectedAppsAndSitesProviderConsent != null ? onConnectedAppsAndSitesProviderConsent.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent connectedAppsAndSitesConsent = (com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, connectedAppsAndSitesConsent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, connectedAppsAndSitesConsent.id) && this.category == connectedAppsAndSitesConsent.category && kotlin.jvm.internal.Intrinsics.areEqual(this.appId, connectedAppsAndSitesConsent.appId) && kotlin.jvm.internal.Intrinsics.areEqual(this.appName, connectedAppsAndSitesConsent.appName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalUserId, connectedAppsAndSitesConsent.externalUserId) && kotlin.jvm.internal.Intrinsics.areEqual(this.onConnectedAppsAndSitesAuthConsent, connectedAppsAndSitesConsent.onConnectedAppsAndSitesAuthConsent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onConnectedAppsAndSitesProviderConsent, connectedAppsAndSitesConsent.onConnectedAppsAndSitesProviderConsent);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent copy(java.lang.String __typename, java.lang.String id, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory category, java.lang.String appId, java.lang.String appName, java.lang.String externalUserId, com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent onConnectedAppsAndSitesAuthConsent, com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalUserId, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent(__typename, id, category, appId, appName, externalUserId, onConnectedAppsAndSitesAuthConsent, onConnectedAppsAndSitesProviderConsent);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent getOnConnectedAppsAndSitesProviderConsent() {
            return this.onConnectedAppsAndSitesProviderConsent;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent getOnConnectedAppsAndSitesAuthConsent() {
            return this.onConnectedAppsAndSitesAuthConsent;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getExternalUserId() {
            return this.externalUserId;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAppName() {
            return this.appName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAppId() {
            return this.appId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory getCategory() {
            return this.category;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J¦\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b>\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b?\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b@\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\bA\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\b\u0011\u0010'R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "category", "appId", "appName", "externalUserId", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesConsentStatus;", "status", "grantTime", "expiryTime", "revokedTime", "consumerDataRightsArrangementId", "grantId", "", "isUnifiedAccountLinkingClient", "", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Permission;", "permissions", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesConsentStatus;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesConsentStatus;", "component7", "()Ljava/lang/Object;", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesConsentStatus;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesAuthConsent;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "getCategory", "getAppId", "getAppName", "getExternalUserId", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesConsentStatus;", "getStatus", "Ljava/lang/Object;", "getGrantTime", "getExpiryTime", "getRevokedTime", "getConsumerDataRightsArrangementId", "getGrantId", "Z", "Ljava/util/List;", "getPermissions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnConnectedAppsAndSitesAuthConsent {
        public static final int $stable = 8;
        private final java.lang.String appId;
        private final java.lang.String appName;
        private final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory category;
        private final java.lang.String consumerDataRightsArrangementId;
        private final java.lang.Object expiryTime;
        private final java.lang.String externalUserId;
        private final java.lang.String grantId;
        private final java.lang.Object grantTime;
        private final java.lang.String id;
        private final boolean isUnifiedAccountLinkingClient;
        private final java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> permissions;
        private final java.lang.Object revokedTime;
        private final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus status;

        public OnConnectedAppsAndSitesAuthConsent(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus connectedAppsAndSitesConsentStatus, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.String str5, java.lang.String str6, boolean z, java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsAndSitesCategory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.id = str;
            this.category = connectedAppsAndSitesCategory;
            this.appId = str2;
            this.appName = str3;
            this.externalUserId = str4;
            this.status = connectedAppsAndSitesConsentStatus;
            this.grantTime = obj;
            this.expiryTime = obj2;
            this.revokedTime = obj3;
            this.consumerDataRightsArrangementId = str5;
            this.grantId = str6;
            this.isUnifiedAccountLinkingClient = z;
            this.permissions = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory getCategory() {
            return this.category;
        }

        public final java.lang.String getAppId() {
            return this.appId;
        }

        public final java.lang.String getAppName() {
            return this.appName;
        }

        public final java.lang.String getExternalUserId() {
            return this.externalUserId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getGrantTime() {
            return this.grantTime;
        }

        public final java.lang.Object getExpiryTime() {
            return this.expiryTime;
        }

        public final java.lang.Object getRevokedTime() {
            return this.revokedTime;
        }

        public final java.lang.String getConsumerDataRightsArrangementId() {
            return this.consumerDataRightsArrangementId;
        }

        public final java.lang.String getGrantId() {
            return this.grantId;
        }

        public final boolean isUnifiedAccountLinkingClient() {
            return this.isUnifiedAccountLinkingClient;
        }

        public final java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> getPermissions() {
            return this.permissions;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory = this.category;
            java.lang.String str2 = this.appId;
            java.lang.String str3 = this.appName;
            java.lang.String str4 = this.externalUserId;
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus connectedAppsAndSitesConsentStatus = this.status;
            java.lang.Object obj = this.grantTime;
            java.lang.Object obj2 = this.expiryTime;
            java.lang.Object obj3 = this.revokedTime;
            java.lang.String str5 = this.consumerDataRightsArrangementId;
            java.lang.String str6 = this.grantId;
            boolean z = this.isUnifiedAccountLinkingClient;
            java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> list = this.permissions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnConnectedAppsAndSitesAuthConsent(id=");
            sb.append(str);
            sb.append(", category=");
            sb.append(connectedAppsAndSitesCategory);
            sb.append(", appId=");
            sb.append(str2);
            sb.append(", appName=");
            sb.append(str3);
            sb.append(", externalUserId=");
            sb.append(str4);
            sb.append(", status=");
            sb.append(connectedAppsAndSitesConsentStatus);
            sb.append(", grantTime=");
            sb.append(obj);
            sb.append(", expiryTime=");
            sb.append(obj2);
            sb.append(", revokedTime=");
            sb.append(obj3);
            sb.append(", consumerDataRightsArrangementId=");
            sb.append(str5);
            sb.append(", grantId=");
            sb.append(str6);
            sb.append(", isUnifiedAccountLinkingClient=");
            sb.append(z);
            sb.append(", permissions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.category.hashCode();
            int hashCode3 = this.appId.hashCode();
            int hashCode4 = this.appName.hashCode();
            int hashCode5 = this.externalUserId.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus connectedAppsAndSitesConsentStatus = this.status;
            int hashCode6 = connectedAppsAndSitesConsentStatus == null ? 0 : connectedAppsAndSitesConsentStatus.hashCode();
            java.lang.Object obj = this.grantTime;
            int hashCode7 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.expiryTime;
            int hashCode8 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.revokedTime;
            int hashCode9 = obj3 == null ? 0 : obj3.hashCode();
            java.lang.String str = this.consumerDataRightsArrangementId;
            int hashCode10 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.grantId;
            int hashCode11 = str2 == null ? 0 : str2.hashCode();
            int hashCode12 = java.lang.Boolean.hashCode(this.isUnifiedAccountLinkingClient);
            java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> list = this.permissions;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent onConnectedAppsAndSitesAuthConsent = (com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onConnectedAppsAndSitesAuthConsent.id) && this.category == onConnectedAppsAndSitesAuthConsent.category && kotlin.jvm.internal.Intrinsics.areEqual(this.appId, onConnectedAppsAndSitesAuthConsent.appId) && kotlin.jvm.internal.Intrinsics.areEqual(this.appName, onConnectedAppsAndSitesAuthConsent.appName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalUserId, onConnectedAppsAndSitesAuthConsent.externalUserId) && this.status == onConnectedAppsAndSitesAuthConsent.status && kotlin.jvm.internal.Intrinsics.areEqual(this.grantTime, onConnectedAppsAndSitesAuthConsent.grantTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryTime, onConnectedAppsAndSitesAuthConsent.expiryTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.revokedTime, onConnectedAppsAndSitesAuthConsent.revokedTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerDataRightsArrangementId, onConnectedAppsAndSitesAuthConsent.consumerDataRightsArrangementId) && kotlin.jvm.internal.Intrinsics.areEqual(this.grantId, onConnectedAppsAndSitesAuthConsent.grantId) && this.isUnifiedAccountLinkingClient == onConnectedAppsAndSitesAuthConsent.isUnifiedAccountLinkingClient && kotlin.jvm.internal.Intrinsics.areEqual(this.permissions, onConnectedAppsAndSitesAuthConsent.permissions);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory category, java.lang.String appId, java.lang.String appName, java.lang.String externalUserId, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus status, java.lang.Object grantTime, java.lang.Object expiryTime, java.lang.Object revokedTime, java.lang.String consumerDataRightsArrangementId, java.lang.String grantId, boolean isUnifiedAccountLinkingClient, java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> permissions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalUserId, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent(id, category, appId, appName, externalUserId, status, grantTime, expiryTime, revokedTime, consumerDataRightsArrangementId, grantId, isUnifiedAccountLinkingClient, permissions);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Object getRevokedTime() {
            return this.revokedTime;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getExpiryTime() {
            return this.expiryTime;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getGrantTime() {
            return this.grantTime;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getExternalUserId() {
            return this.externalUserId;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAppName() {
            return this.appName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAppId() {
            return this.appId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory getCategory() {
            return this.category;
        }

        public final java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> component13() {
            return this.permissions;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsUnifiedAccountLinkingClient() {
            return this.isUnifiedAccountLinkingClient;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getGrantId() {
            return this.grantId;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getConsumerDataRightsArrangementId() {
            return this.consumerDataRightsArrangementId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Permission;", "", "", "key", "", "values", "sharingStartTime", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Permission;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKey", "Ljava/util/List;", "getValues", "Ljava/lang/Object;", "getSharingStartTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Permission {
        public static final int $stable = 8;
        private final java.lang.String key;
        private final java.lang.Object sharingStartTime;
        private final java.util.List<java.lang.String> values;

        public Permission(java.lang.String str, java.util.List<java.lang.String> list, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.key = str;
            this.values = list;
            this.sharingStartTime = obj;
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        public final java.lang.Object getSharingStartTime() {
            return this.sharingStartTime;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.key;
            java.util.List<java.lang.String> list = this.values;
            java.lang.Object obj = this.sharingStartTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Permission(key=");
            sb.append(str);
            sb.append(", values=");
            sb.append(list);
            sb.append(", sharingStartTime=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.key.hashCode();
            java.util.List<java.lang.String> list = this.values;
            int hashCode2 = list == null ? 0 : list.hashCode();
            java.lang.Object obj = this.sharingStartTime;
            return (((hashCode * 31) + hashCode2) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission permission = (com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, permission.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.values, permission.values) && kotlin.jvm.internal.Intrinsics.areEqual(this.sharingStartTime, permission.sharingStartTime);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission copy(java.lang.String key, java.util.List<java.lang.String> values, java.lang.Object sharingStartTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission(key, values, sharingStartTime);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getSharingStartTime() {
            return this.sharingStartTime;
        }

        public final java.util.List<java.lang.String> component2() {
            return this.values;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getKey() {
            return this.key;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission permission, java.lang.String str, java.util.List list, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = permission.key;
            }
            if ((i & 2) != 0) {
                list = permission.values;
            }
            if ((i & 4) != 0) {
                obj = permission.sharingStartTime;
            }
            return permission.copy(str, list, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "category", "appId", "appName", "externalUserId", "providerName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$OnConnectedAppsAndSitesProviderConsent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/ConnectedAppsAndSitesCategory;", "getCategory", "getAppId", "getAppName", "getExternalUserId", "getProviderName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnConnectedAppsAndSitesProviderConsent {
        public static final int $stable = 0;
        private final java.lang.String appId;
        private final java.lang.String appName;
        private final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory category;
        private final java.lang.String externalUserId;
        private final java.lang.String id;
        private final java.lang.String providerName;

        public OnConnectedAppsAndSitesProviderConsent(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsAndSitesCategory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.id = str;
            this.category = connectedAppsAndSitesCategory;
            this.appId = str2;
            this.appName = str3;
            this.externalUserId = str4;
            this.providerName = str5;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory getCategory() {
            return this.category;
        }

        public final java.lang.String getAppId() {
            return this.appId;
        }

        public final java.lang.String getAppName() {
            return this.appName;
        }

        public final java.lang.String getExternalUserId() {
            return this.externalUserId;
        }

        public final java.lang.String getProviderName() {
            return this.providerName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory = this.category;
            java.lang.String str2 = this.appId;
            java.lang.String str3 = this.appName;
            java.lang.String str4 = this.externalUserId;
            java.lang.String str5 = this.providerName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnConnectedAppsAndSitesProviderConsent(id=");
            sb.append(str);
            sb.append(", category=");
            sb.append(connectedAppsAndSitesCategory);
            sb.append(", appId=");
            sb.append(str2);
            sb.append(", appName=");
            sb.append(str3);
            sb.append(", externalUserId=");
            sb.append(str4);
            sb.append(", providerName=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.id.hashCode() * 31) + this.category.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.externalUserId.hashCode()) * 31) + this.providerName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent = (com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onConnectedAppsAndSitesProviderConsent.id) && this.category == onConnectedAppsAndSitesProviderConsent.category && kotlin.jvm.internal.Intrinsics.areEqual(this.appId, onConnectedAppsAndSitesProviderConsent.appId) && kotlin.jvm.internal.Intrinsics.areEqual(this.appName, onConnectedAppsAndSitesProviderConsent.appName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalUserId, onConnectedAppsAndSitesProviderConsent.externalUserId) && kotlin.jvm.internal.Intrinsics.areEqual(this.providerName, onConnectedAppsAndSitesProviderConsent.providerName);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory category, java.lang.String appId, java.lang.String appName, java.lang.String externalUserId, java.lang.String providerName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalUserId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent(id, category, appId, appName, externalUserId, providerName);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getProviderName() {
            return this.providerName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getExternalUserId() {
            return this.externalUserId;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAppName() {
            return this.appName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAppId() {
            return this.appId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory getCategory() {
            return this.category;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onConnectedAppsAndSitesProviderConsent.id;
            }
            if ((i & 2) != 0) {
                connectedAppsAndSitesCategory = onConnectedAppsAndSitesProviderConsent.category;
            }
            com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory connectedAppsAndSitesCategory2 = connectedAppsAndSitesCategory;
            if ((i & 4) != 0) {
                str2 = onConnectedAppsAndSitesProviderConsent.appId;
            }
            java.lang.String str6 = str2;
            if ((i & 8) != 0) {
                str3 = onConnectedAppsAndSitesProviderConsent.appName;
            }
            java.lang.String str7 = str3;
            if ((i & 16) != 0) {
                str4 = onConnectedAppsAndSitesProviderConsent.externalUserId;
            }
            java.lang.String str8 = str4;
            if ((i & 32) != 0) {
                str5 = onConnectedAppsAndSitesProviderConsent.providerName;
            }
            return onConnectedAppsAndSitesProviderConsent.copy(str, connectedAppsAndSitesCategory2, str6, str7, str8, str5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetConsumerPrivacyConnectedAppsAndSitesConsents { connectedAppsAndSitesConsents { __typename id category appId appName externalUserId ... on ConnectedAppsAndSitesAuthConsent { id category appId appName externalUserId status grantTime expiryTime revokedTime consumerDataRightsArrangementId grantId isUnifiedAccountLinkingClient permissions { key values sharingStartTime } } ... on ConnectedAppsAndSitesProviderConsent { id category appId appName externalUserId providerName } } }";
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

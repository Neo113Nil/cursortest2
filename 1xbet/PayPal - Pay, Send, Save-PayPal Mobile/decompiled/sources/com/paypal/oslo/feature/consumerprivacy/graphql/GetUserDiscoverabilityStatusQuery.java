package com.paypal.oslo.feature.consumerprivacy.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"# B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "PrivacySetting", "SearchPrivacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetUserDiscoverabilityStatusQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Companion INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "00beb9a4949eb6bd217e37628fbfc43122d9d935d4e3f6e44406c58d795ce4c8";
    public static final java.lang.String OPERATION_NAME = "GetUserDiscoverabilityStatus";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.GetUserDiscoverabilityStatusQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.consumerprivacy.graphql.selections.GetUserDiscoverabilityStatusQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$PrivacySetting;", "privacySetting", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$PrivacySetting;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$PrivacySetting;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$PrivacySetting;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$PrivacySetting;", "getPrivacySetting"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting privacySetting;

        public Data(com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting privacySetting) {
            this.privacySetting = privacySetting;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting getPrivacySetting() {
            return this.privacySetting;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting privacySetting = this.privacySetting;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(privacySetting=");
            sb.append(privacySetting);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting privacySetting = this.privacySetting;
            if (privacySetting == null) {
                return 0;
            }
            return privacySetting.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacySetting, ((com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data) other).privacySetting);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data copy(com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting privacySetting) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data(privacySetting);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting getPrivacySetting() {
            return this.privacySetting;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.Data data, com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting privacySetting, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                privacySetting = data.privacySetting;
            }
            return data.copy(privacySetting);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$PrivacySetting;", "", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$SearchPrivacy;", "searchPrivacy", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$SearchPrivacy;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$SearchPrivacy;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$SearchPrivacy;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$PrivacySetting;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$SearchPrivacy;", "getSearchPrivacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrivacySetting {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy searchPrivacy;

        public PrivacySetting(com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy searchPrivacy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchPrivacy, "");
            this.searchPrivacy = searchPrivacy;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy getSearchPrivacy() {
            return this.searchPrivacy;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy searchPrivacy = this.searchPrivacy;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrivacySetting(searchPrivacy=");
            sb.append(searchPrivacy);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.searchPrivacy.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchPrivacy, ((com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting) other).searchPrivacy);
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting copy(com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy searchPrivacy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchPrivacy, "");
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting(searchPrivacy);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy getSearchPrivacy() {
            return this.searchPrivacy;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.PrivacySetting privacySetting, com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy searchPrivacy, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                searchPrivacy = privacySetting.searchPrivacy;
            }
            return privacySetting.copy(searchPrivacy);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$SearchPrivacy;", "", "", "allowDiscoverability", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$SearchPrivacy;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getAllowDiscoverability"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchPrivacy {
        public static final int $stable = 0;
        private final boolean allowDiscoverability;

        public SearchPrivacy(boolean z) {
            this.allowDiscoverability = z;
        }

        public final boolean getAllowDiscoverability() {
            return this.allowDiscoverability;
        }

        public final java.lang.String toString() {
            boolean z = this.allowDiscoverability;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchPrivacy(allowDiscoverability=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.allowDiscoverability);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy) && this.allowDiscoverability == ((com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy) other).allowDiscoverability;
        }

        public final com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy copy(boolean allowDiscoverability) {
            return new com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy(allowDiscoverability);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAllowDiscoverability() {
            return this.allowDiscoverability;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy copy$default(com.paypal.oslo.feature.consumerprivacy.graphql.GetUserDiscoverabilityStatusQuery.SearchPrivacy searchPrivacy, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = searchPrivacy.allowDiscoverability;
            }
            return searchPrivacy.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetUserDiscoverabilityStatusQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetUserDiscoverabilityStatus { privacySetting { searchPrivacy { allowDiscoverability } } }";
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

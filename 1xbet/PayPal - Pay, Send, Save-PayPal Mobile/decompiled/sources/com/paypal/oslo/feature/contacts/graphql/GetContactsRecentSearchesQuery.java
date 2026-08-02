package com.paypal.oslo.feature.contacts.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RecentSearchesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RecentSearchesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RecentSearchesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RecentSearchesInput;)Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RecentSearchesInput;", "getInput", "Companion", "Data", "RecentSearches", "RecentSearch", "OnRecentSearchString", "OnRecentContact", "Contact"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetContactsRecentSearchesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "2996638b7a86da72777eb3c94ac313c7f883d671d4f7a6e7217518431ef97db8";
    public static final java.lang.String OPERATION_NAME = "GetContactsRecentSearches";
    private final com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Companion INSTANCE = new com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Companion(null);
    public static final int $stable = 8;

    public GetContactsRecentSearchesQuery(com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput recentSearchesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearchesInput, "");
        this.input = recentSearchesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput getInput() {
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
        com.paypal.oslo.feature.contacts.graphql.adapter.GetContactsRecentSearchesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.contacts.graphql.adapter.GetContactsRecentSearchesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.contacts.graphql.selections.GetContactsRecentSearchesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearches;", "recentSearches", "<init>", "(Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearches;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearches;", "copy", "(Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearches;)Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearches;", "getRecentSearches"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches recentSearches;

        public Data(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches recentSearches) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearches, "");
            this.recentSearches = recentSearches;
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches getRecentSearches() {
            return this.recentSearches;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches recentSearches = this.recentSearches;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(recentSearches=");
            sb.append(recentSearches);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.recentSearches.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentSearches, ((com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data) other).recentSearches);
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data copy(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches recentSearches) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearches, "");
            return new com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data(recentSearches);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches getRecentSearches() {
            return this.recentSearches;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data copy$default(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Data data, com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches recentSearches, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                recentSearches = data.recentSearches;
            }
            return data.copy(recentSearches);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearches;", "", "", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearch;", "recentSearches", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearches;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRecentSearches"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecentSearches {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch> recentSearches;

        public RecentSearches(java.util.List<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.recentSearches = list;
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch> getRecentSearches() {
            return this.recentSearches;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch> list = this.recentSearches;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecentSearches(recentSearches=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.recentSearches.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches) && kotlin.jvm.internal.Intrinsics.areEqual(this.recentSearches, ((com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches) other).recentSearches);
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches copy(java.util.List<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch> recentSearches) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentSearches, "");
            return new com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches(recentSearches);
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch> component1() {
            return this.recentSearches;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches copy$default(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearches recentSearches, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = recentSearches.recentSearches;
            }
            return recentSearches.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearch;", "", "", "__typename", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentSearchString;", "onRecentSearchString", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentContact;", "onRecentContact", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentSearchString;Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentContact;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentSearchString;", "component3", "()Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentContact;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentSearchString;Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentContact;)Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$RecentSearch;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentSearchString;", "getOnRecentSearchString", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentContact;", "getOnRecentContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecentSearch {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact onRecentContact;
        private final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString onRecentSearchString;

        public RecentSearch(java.lang.String str, com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString onRecentSearchString, com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact onRecentContact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onRecentSearchString = onRecentSearchString;
            this.onRecentContact = onRecentContact;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString getOnRecentSearchString() {
            return this.onRecentSearchString;
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact getOnRecentContact() {
            return this.onRecentContact;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString onRecentSearchString = this.onRecentSearchString;
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact onRecentContact = this.onRecentContact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecentSearch(__typename=");
            sb.append(str);
            sb.append(", onRecentSearchString=");
            sb.append(onRecentSearchString);
            sb.append(", onRecentContact=");
            sb.append(onRecentContact);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString onRecentSearchString = this.onRecentSearchString;
            int hashCode2 = onRecentSearchString == null ? 0 : onRecentSearchString.hashCode();
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact onRecentContact = this.onRecentContact;
            return (((hashCode * 31) + hashCode2) * 31) + (onRecentContact != null ? onRecentContact.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch recentSearch = (com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, recentSearch.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRecentSearchString, recentSearch.onRecentSearchString) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRecentContact, recentSearch.onRecentContact);
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch copy(java.lang.String __typename, com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString onRecentSearchString, com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact onRecentContact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch(__typename, onRecentSearchString, onRecentContact);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact getOnRecentContact() {
            return this.onRecentContact;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString getOnRecentSearchString() {
            return this.onRecentSearchString;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch copy$default(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.RecentSearch recentSearch, java.lang.String str, com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString onRecentSearchString, com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact onRecentContact, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = recentSearch.__typename;
            }
            if ((i & 2) != 0) {
                onRecentSearchString = recentSearch.onRecentSearchString;
            }
            if ((i & 4) != 0) {
                onRecentContact = recentSearch.onRecentContact;
            }
            return recentSearch.copy(str, onRecentSearchString, onRecentContact);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentSearchString;", "", "id", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "networkType", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "copy", "(Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;)Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentSearchString;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getId", "Ljava/lang/String;", "getValue", "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "getNetworkType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRecentSearchString {
        public static final int $stable = 8;
        private final java.lang.Object id;
        private final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType networkType;
        private final java.lang.String value;

        public OnRecentSearchString(java.lang.Object obj, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactNetworkType, "");
            this.id = obj;
            this.value = str;
            this.networkType = contactNetworkType;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType getNetworkType() {
            return this.networkType;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            java.lang.String str = this.value;
            com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType = this.networkType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRecentSearchString(id=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(", networkType=");
            sb.append(contactNetworkType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.value.hashCode()) * 31) + this.networkType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString onRecentSearchString = (com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onRecentSearchString.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, onRecentSearchString.value) && this.networkType == onRecentSearchString.networkType;
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString copy(java.lang.Object id, java.lang.String value, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType networkType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
            return new com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString(id, value, networkType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType getNetworkType() {
            return this.networkType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString copy$default(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentSearchString onRecentSearchString, java.lang.Object obj, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onRecentSearchString.id;
            }
            if ((i & 2) != 0) {
                str = onRecentSearchString.value;
            }
            if ((i & 4) != 0) {
                contactNetworkType = onRecentSearchString.networkType;
            }
            return onRecentSearchString.copy(obj, str, contactNetworkType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentContact;", "", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Contact;", "contact", "id", "<init>", "(Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Contact;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Contact;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Contact;Ljava/lang/Object;)Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$OnRecentContact;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Contact;", "getContact", "Ljava/lang/Object;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRecentContact {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact contact;
        private final java.lang.Object id;

        public OnRecentContact(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact contact, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.contact = contact;
            this.id = obj;
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact getContact() {
            return this.contact;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact contact = this.contact;
            java.lang.Object obj = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRecentContact(contact=");
            sb.append(contact);
            sb.append(", id=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.contact.hashCode() * 31) + this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact onRecentContact = (com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contact, onRecentContact.contact) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, onRecentContact.id);
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact copy(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact contact, java.lang.Object id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact(contact, id);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact getContact() {
            return this.contact;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact copy$default(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.OnRecentContact onRecentContact, com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact contact, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                contact = onRecentContact.contact;
            }
            if ((i & 2) != 0) {
                obj = onRecentContact.id;
            }
            return onRecentContact.copy(contact, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Contact;", "", "", "__typename", "Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;", "contactFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;)Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Contact;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;", "getContactFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Contact {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields contactFields;

        public Contact(java.lang.String str, com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields contactFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactFields, "");
            this.__typename = str;
            this.contactFields = contactFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields getContactFields() {
            return this.contactFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields contactFields = this.contactFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contact(__typename=");
            sb.append(str);
            sb.append(", contactFields=");
            sb.append(contactFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.contactFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact contact = (com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, contact.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactFields, contact.contactFields);
        }

        public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact copy(java.lang.String __typename, com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields contactFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactFields, "");
            return new com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact(__typename, contactFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields getContactFields() {
            return this.contactFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact copy$default(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery.Contact contact, java.lang.String str, com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields contactFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contact.__typename;
            }
            if ((i & 2) != 0) {
                contactFields = contact.contactFields;
            }
            return contact.copy(str, contactFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/GetContactsRecentSearchesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetContactsRecentSearches($input: RecentSearchesInput!) { recentSearches(input: $input) { recentSearches { __typename ... on RecentSearchString { id value networkType } ... on RecentContact { contact { __typename ...ContactFields } id } } } }  fragment ContactFields on Contact { id accountId type emails phoneNumbers { countryCode nationalNumber extensionNumber } handle name { __typename ... on PersonName { prefix givenName middleName surname secondSurname suffix fullName } ... on BusinessName { businessName orthography } } profilePhotoUrl primaryAddress { address { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } } relationship { isBlocked isFavorited isExternalContact paymentHistory { totalCompletedPayments hasSentPayments hasReceivedPayments } } externalWallet { name logoUrl externalAccountId } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput recentSearchesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetContactsRecentSearchesQuery(input=");
        sb.append(recentSearchesInput);
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
        return (other instanceof com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery) other).input);
    }

    public final com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery copy(com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery copy$default(com.paypal.oslo.feature.contacts.graphql.GetContactsRecentSearchesQuery getContactsRecentSearchesQuery, com.paypal.oslo.api.graphql.schema.type.RecentSearchesInput recentSearchesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            recentSearchesInput = getContactsRecentSearchesQuery.input;
        }
        return getContactsRecentSearchesQuery.copy(recentSearchesInput);
    }
}

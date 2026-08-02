package com.paypal.oslo.feature.contacts.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ContactSearchInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ContactSearchInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ContactSearchInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ContactSearchInput;)Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ContactSearchInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.OPERATION_NAME, "Page", "Item", "Contact"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactSearchQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data> {
    public static final java.lang.String OPERATION_ID = "c593678b15678c1bbb7b08da593ceb85a59201d5835bc1de3d2381a88b378100";
    public static final java.lang.String OPERATION_NAME = "ContactSearch";
    private final com.paypal.oslo.api.graphql.schema.type.ContactSearchInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Companion INSTANCE = new com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Companion(null);
    public static final int $stable = 8;

    public ContactSearchQuery(com.paypal.oslo.api.graphql.schema.type.ContactSearchInput contactSearchInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchInput, "");
        this.input = contactSearchInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContactSearchInput getInput() {
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
        com.paypal.oslo.feature.contacts.graphql.adapter.ContactSearchQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.contacts.graphql.adapter.ContactSearchQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.contacts.graphql.selections.ContactSearchQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$ContactSearch;", "contactSearch", "<init>", "(Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$ContactSearch;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$ContactSearch;", "copy", "(Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$ContactSearch;)Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$ContactSearch;", "getContactSearch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch contactSearch;

        public Data(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch contactSearch) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearch, "");
            this.contactSearch = contactSearch;
        }

        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch getContactSearch() {
            return this.contactSearch;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch contactSearch = this.contactSearch;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(contactSearch=");
            sb.append(contactSearch);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contactSearch.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactSearch, ((com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data) other).contactSearch);
        }

        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data copy(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch contactSearch) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearch, "");
            return new com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data(contactSearch);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch getContactSearch() {
            return this.contactSearch;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data copy$default(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data data, com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch contactSearch, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contactSearch = data.contactSearch;
            }
            return data.copy(contactSearch);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$ContactSearch;", "", "Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Page;", "page", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "<init>", "(Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Page;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Page;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Page;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$ContactSearch;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Page;", "getPage", "Ljava/lang/Integer;", "getTotalCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactSearch {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page page;
        private final java.lang.Integer totalCount;

        public ContactSearch(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page page, java.lang.Integer num) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
            this.totalCount = num;
        }

        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page page = this.page;
            java.lang.Integer num = this.totalCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSearch(page=");
            sb.append(page);
            sb.append(", totalCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.page.hashCode();
            java.lang.Integer num = this.totalCount;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch contactSearch = (com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.page, contactSearch.page) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalCount, contactSearch.totalCount);
        }

        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch copy(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page page, java.lang.Integer totalCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch(page, totalCount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch copy$default(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch contactSearch, com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page page, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = contactSearch.page;
            }
            if ((i & 2) != 0) {
                num = contactSearch.totalCount;
            }
            return contactSearch.copy(page, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0011R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Page;", "", "", "offset", "limit", "", "hasNextPage", "hasPreviousPage", "", "Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Item;", "items", "<init>", "(IIZZLjava/util/List;)V", "component1", "()I", "component2", "component3", "()Z", "component4", "component5", "()Ljava/util/List;", "copy", "(IIZZLjava/util/List;)Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Page;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getOffset", "getLimit", "Z", "getHasNextPage", "getHasPreviousPage", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final boolean hasNextPage;
        private final boolean hasPreviousPage;
        private final java.util.List<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item> items;
        private final int limit;
        private final int offset;

        public Page(int i, int i2, boolean z, boolean z2, java.util.List<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.offset = i;
            this.limit = i2;
            this.hasNextPage = z;
            this.hasPreviousPage = z2;
            this.items = list;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            int i = this.offset;
            int i2 = this.limit;
            boolean z = this.hasNextPage;
            boolean z2 = this.hasPreviousPage;
            java.util.List<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(offset=");
            sb.append(i);
            sb.append(", limit=");
            sb.append(i2);
            sb.append(", hasNextPage=");
            sb.append(z);
            sb.append(", hasPreviousPage=");
            sb.append(z2);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((java.lang.Integer.hashCode(this.offset) * 31) + java.lang.Integer.hashCode(this.limit)) * 31) + java.lang.Boolean.hashCode(this.hasNextPage)) * 31) + java.lang.Boolean.hashCode(this.hasPreviousPage)) * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page page = (com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page) other;
            return this.offset == page.offset && this.limit == page.limit && this.hasNextPage == page.hasNextPage && this.hasPreviousPage == page.hasPreviousPage && kotlin.jvm.internal.Intrinsics.areEqual(this.items, page.items);
        }

        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page copy(int offset, int limit, boolean hasNextPage, boolean hasPreviousPage, java.util.List<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page(offset, limit, hasNextPage, hasPreviousPage, items);
        }

        public final java.util.List<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item> component5() {
            return this.items;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        /* renamed from: component1, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page copy$default(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page page, int i, int i2, boolean z, boolean z2, java.util.List list, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = page.offset;
            }
            if ((i3 & 2) != 0) {
                i2 = page.limit;
            }
            int i4 = i2;
            if ((i3 & 4) != 0) {
                z = page.hasNextPage;
            }
            boolean z3 = z;
            if ((i3 & 8) != 0) {
                z2 = page.hasPreviousPage;
            }
            boolean z4 = z2;
            if ((i3 & 16) != 0) {
                list = page.items;
            }
            return page.copy(i, i4, z3, z4, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Item;", "", "Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Contact;", "contact", "<init>", "(Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Contact;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Contact;", "copy", "(Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Contact;)Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Contact;", "getContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact;

        public Item(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact) {
            this.contact = contact;
        }

        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact getContact() {
            return this.contact;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact = this.contact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(contact=");
            sb.append(contact);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact = this.contact;
            if (contact == null) {
                return 0;
            }
            return contact.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item) && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, ((com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item) other).contact);
        }

        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item copy(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact) {
            return new com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item(contact);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact getContact() {
            return this.contact;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item copy$default(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item item, com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contact = item.contact;
            }
            return item.copy(contact);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Contact;", "", "", "__typename", "Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;", "contactFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;)Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Contact;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/contacts/graphql/fragment/ContactFields;", "getContactFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact)) {
                return false;
            }
            com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact = (com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, contact.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactFields, contact.contactFields);
        }

        public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact copy(java.lang.String __typename, com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields contactFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactFields, "");
            return new com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact(__typename, contactFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields getContactFields() {
            return this.contactFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact copy$default(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact, java.lang.String str, com.paypal.oslo.feature.contacts.graphql.fragment.ContactFields contactFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contact.__typename;
            }
            if ((i & 2) != 0) {
                contactFields = contact.contactFields;
            }
            return contact.copy(str, contactFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/ContactSearchQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query ContactSearch($input: ContactSearchInput!) { contactSearch(input: $input) { page { offset limit hasNextPage hasPreviousPage items { contact { __typename ...ContactFields } } } totalCount } }  fragment ContactFields on Contact { id accountId type emails phoneNumbers { countryCode nationalNumber extensionNumber } handle name { __typename ... on PersonName { prefix givenName middleName surname secondSurname suffix fullName } ... on BusinessName { businessName orthography } } profilePhotoUrl primaryAddress { address { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } } relationship { isBlocked isFavorited isExternalContact paymentHistory { totalCompletedPayments hasSentPayments hasReceivedPayments } } externalWallet { name logoUrl externalAccountId } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ContactSearchInput contactSearchInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSearchQuery(input=");
        sb.append(contactSearchInput);
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
        return (other instanceof com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery) other).input);
    }

    public final com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery copy(com.paypal.oslo.api.graphql.schema.type.ContactSearchInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ContactSearchInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery copy$default(com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery contactSearchQuery, com.paypal.oslo.api.graphql.schema.type.ContactSearchInput contactSearchInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contactSearchInput = contactSearchQuery.input;
        }
        return contactSearchQuery.copy(contactSearchInput);
    }
}

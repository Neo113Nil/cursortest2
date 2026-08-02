package com.paypal.oslo.feature.businesscustomers.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ContactsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ContactsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ContactsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ContactsInput;)Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ContactsInput;", "getInput", "Companion", "Data", "Contacts", "Page", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetContactsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "0de8b9e41e93546a55b4e0b27fa816fb60635487c495db3202bcd2981d96952e";
    public static final java.lang.String OPERATION_NAME = "GetContactsQuery";
    private final com.paypal.oslo.api.graphql.schema.type.ContactsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Companion INSTANCE = new com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Companion(null);
    public static final int $stable = 8;

    public GetContactsQuery(com.paypal.oslo.api.graphql.schema.type.ContactsInput contactsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsInput, "");
        this.input = contactsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContactsInput getInput() {
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
        com.paypal.oslo.feature.businesscustomers.graphql.adapter.GetContactsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesscustomers.graphql.adapter.GetContactsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.businesscustomers.graphql.selections.GetContactsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Contacts;", "contacts", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Contacts;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Contacts;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Contacts;)Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Contacts;", "getContacts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts contacts;

        public Data(com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts contacts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
            this.contacts = contacts;
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts getContacts() {
            return this.contacts;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts contacts = this.contacts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(contacts=");
            sb.append(contacts);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contacts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.contacts, ((com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data) other).contacts);
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data copy(com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts contacts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
            return new com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data(contacts);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts getContacts() {
            return this.contacts;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data copy$default(com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data data, com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts contacts, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                contacts = data.contacts;
            }
            return data.copy(contacts);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Contacts;", "", "Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Page;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Page;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Page;)Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Contacts;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Page;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Contacts {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page page;

        public Contacts(com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page page = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contacts(page=");
            sb.append(page);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.page.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts) other).page);
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts copy(com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts copy$default(com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Contacts contacts, com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page page, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = contacts.page;
            }
            return contacts.copy(page);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Page;", "", "", "Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Item;", "items", "", "hasNextPage", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Page;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "Z", "getHasNextPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final boolean hasNextPage;
        private final java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item> items;

        public Page(java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item> list, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
            this.hasNextPage = z;
        }

        public final java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item> getItems() {
            return this.items;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item> list = this.items;
            boolean z = this.hasNextPage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(items=");
            sb.append(list);
            sb.append(", hasNextPage=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.items.hashCode() * 31) + java.lang.Boolean.hashCode(this.hasNextPage);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page page = (com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.items, page.items) && this.hasNextPage == page.hasNextPage;
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page copy(java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item> items, boolean hasNextPage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page(items, hasNextPage);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page copy$default(com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Page page, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page.items;
            }
            if ((i & 2) != 0) {
                z = page.hasNextPage;
            }
            return page.copy(list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;", "contactFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;)Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;", "getContactFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment;

        public Item(java.lang.String str, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactFragment, "");
            this.__typename = str;
            this.contactFragment = contactFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment getContactFragment() {
            return this.contactFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment = this.contactFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", contactFragment=");
            sb.append(contactFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.contactFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item item = (com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactFragment, item.contactFragment);
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item copy(java.lang.String __typename, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactFragment, "");
            return new com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item(__typename, contactFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment getContactFragment() {
            return this.contactFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item copy$default(com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item item, java.lang.String str, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                contactFragment = item.contactFragment;
            }
            return item.copy(str, contactFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/GetContactsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetContactsQuery($input: ContactsInput!) { contacts(input: $input) { page { items { __typename ...ContactFragment } hasNextPage } } }  fragment ContactNameFragment on CustomerName { __typename ... on PersonName { givenName surname middleName fullName } ... on BusinessName { businessName } }  fragment ContactPhoneNumberFragment on Phone { countryCode nationalNumber }  fragment ContactAddressFragment on ContactAddress { address { addressLine1 addressLine2 adminArea1 adminArea2 postalCode countryCode } type recipientName { __typename ...ContactNameFragment } }  fragment ContactFragment on Contact { id accountId type name { __typename ...ContactNameFragment } ownerName { __typename ...ContactNameFragment } emails phoneNumbers { __typename ...ContactPhoneNumberFragment } profilePhotoUrl secondaryAddresses { __typename ...ContactAddressFragment } relationship { isFavorited } description }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ContactsInput contactsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetContactsQuery(input=");
        sb.append(contactsInput);
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
        return (other instanceof com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery) other).input);
    }

    public final com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery copy(com.paypal.oslo.api.graphql.schema.type.ContactsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ContactsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery copy$default(com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery getContactsQuery, com.paypal.oslo.api.graphql.schema.type.ContactsInput contactsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contactsInput = getContactsQuery.input;
        }
        return getContactsQuery.copy(contactsInput);
    }
}

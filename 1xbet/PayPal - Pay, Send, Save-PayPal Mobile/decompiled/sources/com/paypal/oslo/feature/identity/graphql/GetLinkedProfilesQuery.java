package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007+,-./0*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/LinkedAuthenticationProfilesPageInput;", "input", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getInput", "Companion", "Data", "LinkedAuthenticationProfiles", "Page", "Item", "ProfileOption", "LinkProfileOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetLinkedProfilesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "1698321b6a033d42cc5497c32b0d8a31a08070a469452b08e1d7f2ecfa963a6a";
    public static final java.lang.String OPERATION_NAME = "GetLinkedProfiles";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput> input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Companion(null);
    public static final int $stable = 8;

    public GetLinkedProfilesQuery(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.input = optional;
    }

    public /* synthetic */ GetLinkedProfilesQuery(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput> getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.GetLinkedProfilesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.GetLinkedProfilesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.GetLinkedProfilesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkedAuthenticationProfiles;", "linkedAuthenticationProfiles", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkedAuthenticationProfiles;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkedAuthenticationProfiles;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkedAuthenticationProfiles;)Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkedAuthenticationProfiles;", "getLinkedAuthenticationProfiles"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles;

        public Data(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedAuthenticationProfiles, "");
            this.linkedAuthenticationProfiles = linkedAuthenticationProfiles;
        }

        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles getLinkedAuthenticationProfiles() {
            return this.linkedAuthenticationProfiles;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles = this.linkedAuthenticationProfiles;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(linkedAuthenticationProfiles=");
            sb.append(linkedAuthenticationProfiles);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.linkedAuthenticationProfiles.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkedAuthenticationProfiles, ((com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data) other).linkedAuthenticationProfiles);
        }

        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data copy(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedAuthenticationProfiles, "");
            return new com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data(linkedAuthenticationProfiles);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles getLinkedAuthenticationProfiles() {
            return this.linkedAuthenticationProfiles;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data copy$default(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data data, com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                linkedAuthenticationProfiles = data.linkedAuthenticationProfiles;
            }
            return data.copy(linkedAuthenticationProfiles);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkedAuthenticationProfiles;", "", "Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Page;", "page", "", "Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$ProfileOption;", "profileOptions", "Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkProfileOption;", "linkProfileOptions", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Page;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Page;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Page;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkedAuthenticationProfiles;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Page;", "getPage", "Ljava/util/List;", "getProfileOptions", "getLinkProfileOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkedAuthenticationProfiles {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption> linkProfileOptions;
        private final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page page;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption> profileOptions;

        public LinkedAuthenticationProfiles(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page page, java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption> list, java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.page = page;
            this.profileOptions = list;
            this.linkProfileOptions = list2;
        }

        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page getPage() {
            return this.page;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption> getProfileOptions() {
            return this.profileOptions;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption> getLinkProfileOptions() {
            return this.linkProfileOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page page = this.page;
            java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption> list = this.profileOptions;
            java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption> list2 = this.linkProfileOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkedAuthenticationProfiles(page=");
            sb.append(page);
            sb.append(", profileOptions=");
            sb.append(list);
            sb.append(", linkProfileOptions=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.page.hashCode() * 31) + this.profileOptions.hashCode()) * 31) + this.linkProfileOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles = (com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.page, linkedAuthenticationProfiles.page) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileOptions, linkedAuthenticationProfiles.profileOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkProfileOptions, linkedAuthenticationProfiles.linkProfileOptions);
        }

        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles copy(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page page, java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption> profileOptions, java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption> linkProfileOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkProfileOptions, "");
            return new com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles(page, profileOptions, linkProfileOptions);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption> component3() {
            return this.linkProfileOptions;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption> component2() {
            return this.profileOptions;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page getPage() {
            return this.page;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles copy$default(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles, com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page page, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = linkedAuthenticationProfiles.page;
            }
            if ((i & 2) != 0) {
                list = linkedAuthenticationProfiles.profileOptions;
            }
            if ((i & 4) != 0) {
                list2 = linkedAuthenticationProfiles.linkProfileOptions;
            }
            return linkedAuthenticationProfiles.copy(page, list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JX\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0015R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b(\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Page;", "", "", "Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Item;", "items", "", "startCursor", "endCursor", "", "hasNextPage", "hasPreviousPage", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "component6", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;)Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Page;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getStartCursor", "getEndCursor", "Z", "getHasNextPage", "getHasPreviousPage", "Ljava/lang/Integer;", "getTotalCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.lang.String endCursor;
        private final boolean hasNextPage;
        private final boolean hasPreviousPage;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item> items;
        private final java.lang.String startCursor;
        private final java.lang.Integer totalCount;

        public Page(java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item> list, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.Integer num) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
            this.startCursor = str;
            this.endCursor = str2;
            this.hasNextPage = z;
            this.hasPreviousPage = z2;
            this.totalCount = num;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String getStartCursor() {
            return this.startCursor;
        }

        public final java.lang.String getEndCursor() {
            return this.endCursor;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item> list = this.items;
            java.lang.String str = this.startCursor;
            java.lang.String str2 = this.endCursor;
            boolean z = this.hasNextPage;
            boolean z2 = this.hasPreviousPage;
            java.lang.Integer num = this.totalCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(items=");
            sb.append(list);
            sb.append(", startCursor=");
            sb.append(str);
            sb.append(", endCursor=");
            sb.append(str2);
            sb.append(", hasNextPage=");
            sb.append(z);
            sb.append(", hasPreviousPage=");
            sb.append(z2);
            sb.append(", totalCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.items.hashCode();
            java.lang.String str = this.startCursor;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.endCursor;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.hasNextPage);
            int hashCode5 = java.lang.Boolean.hashCode(this.hasPreviousPage);
            java.lang.Integer num = this.totalCount;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (num != null ? num.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page page = (com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.items, page.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.startCursor, page.startCursor) && kotlin.jvm.internal.Intrinsics.areEqual(this.endCursor, page.endCursor) && this.hasNextPage == page.hasNextPage && this.hasPreviousPage == page.hasPreviousPage && kotlin.jvm.internal.Intrinsics.areEqual(this.totalCount, page.totalCount);
        }

        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page copy(java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item> items, java.lang.String startCursor, java.lang.String endCursor, boolean hasNextPage, boolean hasPreviousPage, java.lang.Integer totalCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page(items, startCursor, endCursor, hasNextPage, hasPreviousPage, totalCount);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getEndCursor() {
            return this.endCursor;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getStartCursor() {
            return this.startCursor;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item> component1() {
            return this.items;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page copy$default(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Page page, java.util.List list, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page.items;
            }
            if ((i & 2) != 0) {
                str = page.startCursor;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                str2 = page.endCursor;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                z = page.hasNextPage;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = page.hasPreviousPage;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                num = page.totalCount;
            }
            return page.copy(list, str3, str4, z3, z4, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JR\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\b\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Item;", "", "", "partyId", "fullName", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "profilePicture", "", "isBusinessProfile", "isActive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Object;", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZZ)Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPartyId", "getFullName", "getEmailAddress", "Ljava/lang/Object;", "getProfilePicture", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String emailAddress;
        private final java.lang.String fullName;
        private final boolean isActive;
        private final boolean isBusinessProfile;
        private final java.lang.String partyId;
        private final java.lang.Object profilePicture;

        public Item(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.partyId = str;
            this.fullName = str2;
            this.emailAddress = str3;
            this.profilePicture = obj;
            this.isBusinessProfile = z;
            this.isActive = z2;
        }

        public final java.lang.String getPartyId() {
            return this.partyId;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String getEmailAddress() {
            return this.emailAddress;
        }

        public final java.lang.Object getProfilePicture() {
            return this.profilePicture;
        }

        public final boolean isBusinessProfile() {
            return this.isBusinessProfile;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.partyId;
            java.lang.String str2 = this.fullName;
            java.lang.String str3 = this.emailAddress;
            java.lang.Object obj = this.profilePicture;
            boolean z = this.isBusinessProfile;
            boolean z2 = this.isActive;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(partyId=");
            sb.append(str);
            sb.append(", fullName=");
            sb.append(str2);
            sb.append(", emailAddress=");
            sb.append(str3);
            sb.append(", profilePicture=");
            sb.append(obj);
            sb.append(", isBusinessProfile=");
            sb.append(z);
            sb.append(", isActive=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.partyId.hashCode();
            java.lang.String str = this.fullName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.emailAddress;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.Object obj = this.profilePicture;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isBusinessProfile)) * 31) + java.lang.Boolean.hashCode(this.isActive);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item item = (com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.partyId, item.partyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, item.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, item.emailAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePicture, item.profilePicture) && this.isBusinessProfile == item.isBusinessProfile && this.isActive == item.isActive;
        }

        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item copy(java.lang.String partyId, java.lang.String fullName, java.lang.String emailAddress, java.lang.Object profilePicture, boolean isBusinessProfile, boolean isActive) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partyId, "");
            return new com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item(partyId, fullName, emailAddress, profilePicture, isBusinessProfile, isActive);
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsBusinessProfile() {
            return this.isBusinessProfile;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getProfilePicture() {
            return this.profilePicture;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getEmailAddress() {
            return this.emailAddress;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPartyId() {
            return this.partyId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item copy$default(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Item item, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, boolean z, boolean z2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = item.partyId;
            }
            if ((i & 2) != 0) {
                str2 = item.fullName;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = item.emailAddress;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                obj = item.profilePicture;
            }
            java.lang.Object obj3 = obj;
            if ((i & 16) != 0) {
                z = item.isBusinessProfile;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = item.isActive;
            }
            return item.copy(str, str4, str5, obj3, z3, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$ProfileOption;", "", "Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileOptionType;", "type", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileOptionType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileOptionType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileOptionType;)Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$ProfileOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileOptionType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProfileOption {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType type;

        public ProfileOption(com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType linkedProfileOptionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedProfileOptionType, "");
            this.type = linkedProfileOptionType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType linkedProfileOptionType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileOption(type=");
            sb.append(linkedProfileOptionType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption) && this.type == ((com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption) other).type;
        }

        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption copy(com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption copy$default(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.ProfileOption profileOption, com.paypal.oslo.api.graphql.schema.type.LinkedProfileOptionType linkedProfileOptionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                linkedProfileOptionType = profileOption.type;
            }
            return profileOption.copy(linkedProfileOptionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkProfileOption;", "", "Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileContentType;", "type", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileContentType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileContentType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileContentType;)Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$LinkProfileOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/LinkedProfileContentType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkProfileOption {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType type;

        public LinkProfileOption(com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType linkedProfileContentType) {
            this.type = linkedProfileContentType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType linkedProfileContentType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkProfileOption(type=");
            sb.append(linkedProfileContentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType linkedProfileContentType = this.type;
            if (linkedProfileContentType == null) {
                return 0;
            }
            return linkedProfileContentType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption) && this.type == ((com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption) other).type;
        }

        public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption copy(com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType type) {
            return new com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption copy$default(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkProfileOption linkProfileOption, com.paypal.oslo.api.graphql.schema.type.LinkedProfileContentType linkedProfileContentType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                linkedProfileContentType = linkProfileOption.type;
            }
            return linkProfileOption.copy(linkedProfileContentType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/GetLinkedProfilesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetLinkedProfiles($input: LinkedAuthenticationProfilesPageInput) { linkedAuthenticationProfiles(input: $input) { page { items { partyId fullName emailAddress profilePicture isBusinessProfile isActive } startCursor endCursor hasNextPage hasPreviousPage totalCount } profileOptions { type } linkProfileOptions { type } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput> optional = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetLinkedProfilesQuery(input=");
        sb.append(optional);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery(input);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput> component1() {
        return this.input;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery copy$default(com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery getLinkedProfilesQuery, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = getLinkedProfilesQuery.input;
        }
        return getLinkedProfilesQuery.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetLinkedProfilesQuery() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

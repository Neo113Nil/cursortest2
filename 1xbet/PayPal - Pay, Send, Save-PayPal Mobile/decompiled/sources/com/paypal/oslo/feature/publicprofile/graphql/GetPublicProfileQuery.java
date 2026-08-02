package com.paypal.oslo.feature.publicprofile.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b/012345678.B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PublicProfileInput;", "publicInput", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PublicProfileInput;Ljava/lang/Object;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PublicProfileInput;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PublicProfileInput;Ljava/lang/Object;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PublicProfileInput;", "getPublicInput", "Ljava/lang/Object;", "getContactId", "Companion", "Data", "PublicProfile", "OnPersonalPublicProfile", "Name", "Location", "Contact", "Name1", "PrimaryAddress", "Address", "Relationship"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GetPublicProfileQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data> {
    public static final java.lang.String OPERATION_ID = "2c13b4376ff65fe31f43c98cc708467f194cd2fce860a76708b07e952bbb06d0";
    public static final java.lang.String OPERATION_NAME = "GetPublicProfile";
    private final java.lang.Object contactId;
    private final com.paypal.oslo.api.graphql.schema.type.PublicProfileInput publicInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Companion INSTANCE = new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Companion(null);
    public static final int $stable = 8;

    public GetPublicProfileQuery(com.paypal.oslo.api.graphql.schema.type.PublicProfileInput publicProfileInput, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.publicInput = publicProfileInput;
        this.contactId = obj;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PublicProfileInput getPublicInput() {
        return this.publicInput;
    }

    public final java.lang.Object getContactId() {
        return this.contactId;
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
        com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.publicprofile.graphql.adapter.GetPublicProfileQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.publicprofile.graphql.selections.GetPublicProfileQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;", "publicProfile", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;", "contact", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;", "component2", "()Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;", "getPublicProfile", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;", "getContact", "getContact$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact;
        private final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile publicProfile;

        @kotlin.Deprecated(message = "Use `contactById` instead.")
        public static /* synthetic */ void getContact$annotations() {
        }

        public Data(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile publicProfile, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfile, "");
            this.publicProfile = publicProfile;
            this.contact = contact;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile getPublicProfile() {
            return this.publicProfile;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact getContact() {
            return this.contact;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile publicProfile = this.publicProfile;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact = this.contact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(publicProfile=");
            sb.append(publicProfile);
            sb.append(", contact=");
            sb.append(contact);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.publicProfile.hashCode();
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact = this.contact;
            return (hashCode * 31) + (contact == null ? 0 : contact.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data data = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.publicProfile, data.publicProfile) && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, data.contact);
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data copy(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile publicProfile, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfile, "");
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data(publicProfile, contact);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact getContact() {
            return this.contact;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile getPublicProfile() {
            return this.publicProfile;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Data data, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile publicProfile, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicProfile = data.publicProfile;
            }
            if ((i & 2) != 0) {
                contact = data.contact;
            }
            return data.copy(publicProfile, contact);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;", "", "", "__typename", "handle", "joinedDate", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;", "onPersonalPublicProfile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PublicProfile;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getHandle", "Ljava/lang/Object;", "getJoinedDate", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;", "getOnPersonalPublicProfile"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PublicProfile {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String handle;
        private final java.lang.Object joinedDate;
        private final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile;

        public PublicProfile(java.lang.String str, java.lang.String str2, java.lang.Object obj, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.__typename = str;
            this.handle = str2;
            this.joinedDate = obj;
            this.onPersonalPublicProfile = onPersonalPublicProfile;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getHandle() {
            return this.handle;
        }

        public final java.lang.Object getJoinedDate() {
            return this.joinedDate;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile getOnPersonalPublicProfile() {
            return this.onPersonalPublicProfile;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.handle;
            java.lang.Object obj = this.joinedDate;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile = this.onPersonalPublicProfile;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicProfile(__typename=");
            sb.append(str);
            sb.append(", handle=");
            sb.append(str2);
            sb.append(", joinedDate=");
            sb.append(obj);
            sb.append(", onPersonalPublicProfile=");
            sb.append(onPersonalPublicProfile);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.handle.hashCode();
            java.lang.Object obj = this.joinedDate;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile = this.onPersonalPublicProfile;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onPersonalPublicProfile != null ? onPersonalPublicProfile.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile publicProfile = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, publicProfile.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.handle, publicProfile.handle) && kotlin.jvm.internal.Intrinsics.areEqual(this.joinedDate, publicProfile.joinedDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPersonalPublicProfile, publicProfile.onPersonalPublicProfile);
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile copy(java.lang.String __typename, java.lang.String handle, java.lang.Object joinedDate, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handle, "");
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile(__typename, handle, joinedDate, onPersonalPublicProfile);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile getOnPersonalPublicProfile() {
            return this.onPersonalPublicProfile;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getJoinedDate() {
            return this.joinedDate;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHandle() {
            return this.handle;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PublicProfile publicProfile, java.lang.String str, java.lang.String str2, java.lang.Object obj, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = publicProfile.__typename;
            }
            if ((i & 2) != 0) {
                str2 = publicProfile.handle;
            }
            if ((i & 4) != 0) {
                obj = publicProfile.joinedDate;
            }
            if ((i & 8) != 0) {
                onPersonalPublicProfile = publicProfile.onPersonalPublicProfile;
            }
            return publicProfile.copy(str, str2, obj, onPersonalPublicProfile);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;", "", "profilePhotoUrl", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;", "name", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;", "location", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;", "component3", "()Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$OnPersonalPublicProfile;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getProfilePhotoUrl", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;", "getName", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;", "getLocation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class OnPersonalPublicProfile {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location;
        private final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name name;
        private final java.lang.Object profilePhotoUrl;

        public OnPersonalPublicProfile(java.lang.Object obj, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name name2, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            this.profilePhotoUrl = obj;
            this.name = name2;
            this.location = location;
        }

        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location getLocation() {
            return this.location;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.profilePhotoUrl;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name name2 = this.name;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location = this.location;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPersonalPublicProfile(profilePhotoUrl=");
            sb.append(obj);
            sb.append(", name=");
            sb.append(name2);
            sb.append(", location=");
            sb.append(location);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.profilePhotoUrl.hashCode();
            int hashCode2 = this.name.hashCode();
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location = this.location;
            return (((hashCode * 31) + hashCode2) * 31) + (location == null ? 0 : location.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, onPersonalPublicProfile.profilePhotoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, onPersonalPublicProfile.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.location, onPersonalPublicProfile.location);
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile copy(java.lang.Object profilePhotoUrl, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name name2, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePhotoUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile(profilePhotoUrl, name2, location);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location getLocation() {
            return this.location;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.OnPersonalPublicProfile onPersonalPublicProfile, java.lang.Object obj, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name name2, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onPersonalPublicProfile.profilePhotoUrl;
            }
            if ((i & 2) != 0) {
                name2 = onPersonalPublicProfile.name;
            }
            if ((i & 4) != 0) {
                location = onPersonalPublicProfile.location;
            }
            return onPersonalPublicProfile.copy(obj, name2, location);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;", "", "", "__typename", "Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;", "customerNameFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;", "getCustomerNameFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields;

        public Name(java.lang.String str, com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerNameFields, "");
            this.__typename = str;
            this.customerNameFields = customerNameFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields getCustomerNameFields() {
            return this.customerNameFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields = this.customerNameFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(__typename=");
            sb.append(str);
            sb.append(", customerNameFields=");
            sb.append(customerNameFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.customerNameFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name name2 = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, name2.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerNameFields, name2.customerNameFields);
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name copy(java.lang.String __typename, com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerNameFields, "");
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name(__typename, customerNameFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields getCustomerNameFields() {
            return this.customerNameFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name name2, java.lang.String str, com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.__typename;
            }
            if ((i & 2) != 0) {
                customerNameFields = name2.customerNameFields;
            }
            return name2.copy(str, customerNameFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;", "", "", "__typename", "Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;", "addressPortableFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Location;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;", "getAddressPortableFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Location {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields;

        public Location(java.lang.String str, com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressPortableFields, "");
            this.__typename = str;
            this.addressPortableFields = addressPortableFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields getAddressPortableFields() {
            return this.addressPortableFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields = this.addressPortableFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Location(__typename=");
            sb.append(str);
            sb.append(", addressPortableFields=");
            sb.append(addressPortableFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.addressPortableFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, location.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressPortableFields, location.addressPortableFields);
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location copy(java.lang.String __typename, com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressPortableFields, "");
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location(__typename, addressPortableFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields getAddressPortableFields() {
            return this.addressPortableFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Location location, java.lang.String str, com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = location.__typename;
            }
            if ((i & 2) != 0) {
                addressPortableFields = location.addressPortableFields;
            }
            return location.copy(str, addressPortableFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;", "", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;", "name", "profilePhotoUrl", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;", "primaryAddress", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;", "relationship", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;Ljava/lang/Object;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;", "component4", "()Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;Ljava/lang/Object;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Contact;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;", "getName", "Ljava/lang/Object;", "getProfilePhotoUrl", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;", "getPrimaryAddress", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;", "getRelationship"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Contact {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name;
        private final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress primaryAddress;
        private final java.lang.Object profilePhotoUrl;
        private final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship;

        public Contact(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name1, java.lang.Object obj, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress primaryAddress, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship) {
            this.name = name1;
            this.profilePhotoUrl = obj;
            this.primaryAddress = primaryAddress;
            this.relationship = relationship;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 getName() {
            return this.name;
        }

        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress getPrimaryAddress() {
            return this.primaryAddress;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship getRelationship() {
            return this.relationship;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name1 = this.name;
            java.lang.Object obj = this.profilePhotoUrl;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress primaryAddress = this.primaryAddress;
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship = this.relationship;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contact(name=");
            sb.append(name1);
            sb.append(", profilePhotoUrl=");
            sb.append(obj);
            sb.append(", primaryAddress=");
            sb.append(primaryAddress);
            sb.append(", relationship=");
            sb.append(relationship);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name1 = this.name;
            int hashCode = name1 == null ? 0 : name1.hashCode();
            java.lang.Object obj = this.profilePhotoUrl;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress primaryAddress = this.primaryAddress;
            int hashCode3 = primaryAddress == null ? 0 : primaryAddress.hashCode();
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship = this.relationship;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (relationship != null ? relationship.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, contact.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, contact.profilePhotoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryAddress, contact.primaryAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.relationship, contact.relationship);
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact copy(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name2, java.lang.Object profilePhotoUrl, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress primaryAddress, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship) {
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact(name2, profilePhotoUrl, primaryAddress, relationship);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship getRelationship() {
            return this.relationship;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress getPrimaryAddress() {
            return this.primaryAddress;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Contact contact, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name1, java.lang.Object obj, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress primaryAddress, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                name1 = contact.name;
            }
            if ((i & 2) != 0) {
                obj = contact.profilePhotoUrl;
            }
            if ((i & 4) != 0) {
                primaryAddress = contact.primaryAddress;
            }
            if ((i & 8) != 0) {
                relationship = contact.relationship;
            }
            return contact.copy(name1, obj, primaryAddress, relationship);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;", "", "", "__typename", "Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;", "customerNameFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Name1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/CustomerNameFields;", "getCustomerNameFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Name1 {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields;

        public Name1(java.lang.String str, com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerNameFields, "");
            this.__typename = str;
            this.customerNameFields = customerNameFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields getCustomerNameFields() {
            return this.customerNameFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields = this.customerNameFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name1(__typename=");
            sb.append(str);
            sb.append(", customerNameFields=");
            sb.append(customerNameFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.customerNameFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name1 = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, name1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerNameFields, name1.customerNameFields);
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 copy(java.lang.String __typename, com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerNameFields, "");
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1(__typename, customerNameFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields getCustomerNameFields() {
            return this.customerNameFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Name1 name1, java.lang.String str, com.paypal.oslo.feature.publicprofile.graphql.fragment.CustomerNameFields customerNameFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name1.__typename;
            }
            if ((i & 2) != 0) {
                customerNameFields = name1.customerNameFields;
            }
            return name1.copy(str, customerNameFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;", "", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;", "address", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;)V", "component1", "()Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;", "copy", "(Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$PrimaryAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PrimaryAddress {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address address;

        public PrimaryAddress(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            this.address = address;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address address = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryAddress(address=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, ((com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress) other).address);
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress copy(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress(address);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address getAddress() {
            return this.address;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.PrimaryAddress primaryAddress, com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = primaryAddress.address;
            }
            return primaryAddress.copy(address);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;", "", "", "__typename", "Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;", "addressPortableFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;", "getAddressPortableFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Address {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields;

        public Address(java.lang.String str, com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressPortableFields, "");
            this.__typename = str;
            this.addressPortableFields = addressPortableFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields getAddressPortableFields() {
            return this.addressPortableFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields = this.addressPortableFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(__typename=");
            sb.append(str);
            sb.append(", addressPortableFields=");
            sb.append(addressPortableFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.addressPortableFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address address = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, address.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressPortableFields, address.addressPortableFields);
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address copy(java.lang.String __typename, com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressPortableFields, "");
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address(__typename, addressPortableFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields getAddressPortableFields() {
            return this.addressPortableFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Address address, java.lang.String str, com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = address.__typename;
            }
            if ((i & 2) != 0) {
                addressPortableFields = address.addressPortableFields;
            }
            return address.copy(str, addressPortableFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ:\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0007\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;", "", "", "mutualConnectionCount", "", "isExternalContact", "isFavorited", "isBlocked", "<init>", "(Ljava/lang/Integer;ZZZ)V", "component1", "()Ljava/lang/Integer;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/Integer;ZZZ)Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Relationship;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getMutualConnectionCount", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Relationship {
        public static final int $stable = 0;
        private final boolean isBlocked;
        private final boolean isExternalContact;
        private final boolean isFavorited;
        private final java.lang.Integer mutualConnectionCount;

        public Relationship(java.lang.Integer num, boolean z, boolean z2, boolean z3) {
            this.mutualConnectionCount = num;
            this.isExternalContact = z;
            this.isFavorited = z2;
            this.isBlocked = z3;
        }

        public final java.lang.Integer getMutualConnectionCount() {
            return this.mutualConnectionCount;
        }

        public final boolean isExternalContact() {
            return this.isExternalContact;
        }

        public final boolean isFavorited() {
            return this.isFavorited;
        }

        public final boolean isBlocked() {
            return this.isBlocked;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.mutualConnectionCount;
            boolean z = this.isExternalContact;
            boolean z2 = this.isFavorited;
            boolean z3 = this.isBlocked;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Relationship(mutualConnectionCount=");
            sb.append(num);
            sb.append(", isExternalContact=");
            sb.append(z);
            sb.append(", isFavorited=");
            sb.append(z2);
            sb.append(", isBlocked=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.mutualConnectionCount;
            return ((((((num == null ? 0 : num.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isExternalContact)) * 31) + java.lang.Boolean.hashCode(this.isFavorited)) * 31) + java.lang.Boolean.hashCode(this.isBlocked);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship)) {
                return false;
            }
            com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.mutualConnectionCount, relationship.mutualConnectionCount) && this.isExternalContact == relationship.isExternalContact && this.isFavorited == relationship.isFavorited && this.isBlocked == relationship.isBlocked;
        }

        public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship copy(java.lang.Integer mutualConnectionCount, boolean isExternalContact, boolean isFavorited, boolean isBlocked) {
            return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship(mutualConnectionCount, isExternalContact, isFavorited, isBlocked);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsBlocked() {
            return this.isBlocked;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsFavorited() {
            return this.isFavorited;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsExternalContact() {
            return this.isExternalContact;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getMutualConnectionCount() {
            return this.mutualConnectionCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery.Relationship relationship, java.lang.Integer num, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = relationship.mutualConnectionCount;
            }
            if ((i & 2) != 0) {
                z = relationship.isExternalContact;
            }
            if ((i & 4) != 0) {
                z2 = relationship.isFavorited;
            }
            if ((i & 8) != 0) {
                z3 = relationship.isBlocked;
            }
            return relationship.copy(num, z, z2, z3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/GetPublicProfileQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPublicProfile($publicInput: PublicProfileInput!, $contactId: ContactID!) { publicProfile(input: $publicInput) { __typename handle joinedDate ... on PersonalPublicProfile { profilePhotoUrl name { __typename ...CustomerNameFields } location { __typename ...AddressPortableFields } } } contact(id: $contactId) { name { __typename ...CustomerNameFields } profilePhotoUrl primaryAddress { address { __typename ...AddressPortableFields } } relationship { mutualConnectionCount isExternalContact isFavorited isBlocked } } }  fragment PersonNameFields on PersonName { givenName surname fullName }  fragment BusinessNameFields on BusinessName { businessName }  fragment CustomerNameFields on CustomerName { __typename ...PersonNameFields ...BusinessNameFields }  fragment AddressPortableFields on AddressPortable { adminArea2 adminArea1 }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PublicProfileInput publicProfileInput = this.publicInput;
        java.lang.Object obj = this.contactId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPublicProfileQuery(publicInput=");
        sb.append(publicProfileInput);
        sb.append(", contactId=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.publicInput.hashCode() * 31) + this.contactId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery)) {
            return false;
        }
        com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery getPublicProfileQuery = (com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.publicInput, getPublicProfileQuery.publicInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, getPublicProfileQuery.contactId);
    }

    public final com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery copy(com.paypal.oslo.api.graphql.schema.type.PublicProfileInput publicInput, java.lang.Object contactId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
        return new com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery(publicInput, contactId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getContactId() {
        return this.contactId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PublicProfileInput getPublicInput() {
        return this.publicInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery copy$default(com.paypal.oslo.feature.publicprofile.graphql.GetPublicProfileQuery getPublicProfileQuery, com.paypal.oslo.api.graphql.schema.type.PublicProfileInput publicProfileInput, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            publicProfileInput = getPublicProfileQuery.publicInput;
        }
        if ((i & 2) != 0) {
            obj = getPublicProfileQuery.contactId;
        }
        return getPublicProfileQuery.copy(publicProfileInput, obj);
    }
}

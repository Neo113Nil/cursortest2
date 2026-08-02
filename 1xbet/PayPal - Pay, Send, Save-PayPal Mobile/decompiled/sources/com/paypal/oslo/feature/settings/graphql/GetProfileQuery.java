package com.paypal.oslo.feature.settings.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$ B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "Profile", "Name", "Email"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetProfileQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Companion INSTANCE = new com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "ea1aff2d38771944c2a52c39807b7c3e2b7de85d3fcdca8d2fe6a95aec357def";
    public static final java.lang.String OPERATION_NAME = "GetProfile";

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
        return "GetProfile";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.settings.graphql.adapter.GetProfileQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.settings.graphql.selections.GetProfileQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Profile;", "profile", "<init>", "(Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Profile;)V", "component1", "()Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Profile;", "copy", "(Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Profile;)Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Profile;", "getProfile", "getProfile$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile profile;

        @kotlin.Deprecated(message = "Use 'party', 'account', and 'preferences' fields instead. This field will be removed after client migration is complete.")
        public static /* synthetic */ void getProfile$annotations() {
        }

        public Data(com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile profile) {
            this.profile = profile;
        }

        public final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile getProfile() {
            return this.profile;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile profile = this.profile;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(profile=");
            sb.append(profile);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile profile = this.profile;
            if (profile == null) {
                return 0;
            }
            return profile.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.profile, ((com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data) other).profile);
        }

        public final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data copy(com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile profile) {
            return new com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data(profile);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile getProfile() {
            return this.profile;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data copy$default(com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data data, com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile profile, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profile = data.profile;
            }
            return data.copy(profile);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Profile;", "", "Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Name;", "name", "", "Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Email;", "emails", "<init>", "(Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Name;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Name;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Name;Ljava/util/List;)Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Profile;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Name;", "getName", "Ljava/util/List;", "getEmails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Profile {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email> emails;
        private final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name name;

        public Profile(com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name name2, java.util.List<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.name = name2;
            this.emails = list;
        }

        public final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name getName() {
            return this.name;
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email> getEmails() {
            return this.emails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name name2 = this.name;
            java.util.List<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email> list = this.emails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Profile(name=");
            sb.append(name2);
            sb.append(", emails=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.emails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile profile = (com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, profile.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.emails, profile.emails);
        }

        public final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile copy(com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name name2, java.util.List<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email> emails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emails, "");
            return new com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile(name2, emails);
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email> component2() {
            return this.emails;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile copy$default(com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile profile, com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name name2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                name2 = profile.name;
            }
            if ((i & 2) != 0) {
                list = profile.emails;
            }
            return profile.copy(name2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Name;", "", "", "fullName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String fullName;

        public Name(java.lang.String str) {
            this.fullName = str;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(fullName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.fullName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, ((com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name) other).fullName);
        }

        public final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name copy(java.lang.String fullName) {
            return new com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name(fullName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name copy$default(com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name name2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.fullName;
            }
            return name2.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Email;", "", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "confirmed", "primary", "<init>", "(Ljava/lang/Object;ZZ)V", "component1", "()Ljava/lang/Object;", "component2", "()Z", "component3", "copy", "(Ljava/lang/Object;ZZ)Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Email;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getEmailAddress", "Z", "getConfirmed", "getPrimary"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class Email {
        public static final int $stable = 8;
        private final boolean confirmed;
        private final java.lang.Object emailAddress;
        private final boolean primary;

        public Email(java.lang.Object obj, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.emailAddress = obj;
            this.confirmed = z;
            this.primary = z2;
        }

        public final java.lang.Object getEmailAddress() {
            return this.emailAddress;
        }

        public final boolean getConfirmed() {
            return this.confirmed;
        }

        public final boolean getPrimary() {
            return this.primary;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.emailAddress;
            boolean z = this.confirmed;
            boolean z2 = this.primary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Email(emailAddress=");
            sb.append(obj);
            sb.append(", confirmed=");
            sb.append(z);
            sb.append(", primary=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.emailAddress.hashCode() * 31) + java.lang.Boolean.hashCode(this.confirmed)) * 31) + java.lang.Boolean.hashCode(this.primary);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email email = (com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, email.emailAddress) && this.confirmed == email.confirmed && this.primary == email.primary;
        }

        public final com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email copy(java.lang.Object emailAddress, boolean confirmed, boolean primary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
            return new com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email(emailAddress, confirmed, primary);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getConfirmed() {
            return this.confirmed;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getEmailAddress() {
            return this.emailAddress;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email copy$default(com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email email, java.lang.Object obj, boolean z, boolean z2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = email.emailAddress;
            }
            if ((i & 2) != 0) {
                z = email.confirmed;
            }
            if ((i & 4) != 0) {
                z2 = email.primary;
            }
            return email.copy(obj, z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/GetProfileQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetProfile { profile { name { fullName } emails { emailAddress confirmed primary } } }";
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

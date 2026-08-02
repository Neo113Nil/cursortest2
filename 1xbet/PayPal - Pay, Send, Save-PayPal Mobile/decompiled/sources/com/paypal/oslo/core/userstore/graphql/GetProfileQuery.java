package com.paypal.oslo.core.userstore.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0012!\"#$%&'()*+,-./01 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "Profile", "Email", "Name", "Party", "LegalName", "PrimaryEmail", "Email1", "PrimaryPhone", "PrimaryMobilePhone", "Phone", "HomeAddress", "Address", "Account", "ExperimentationSegments", "LinkedAuthenticationProfiles", "Page"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetProfileQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Companion INSTANCE = new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "0415efce012b3ea3bd92e7ac8b67fd795fa03344c4a6ed0ca740ae9b1c62aebb";
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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.core.userstore.graphql.adapter.GetProfileQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.core.userstore.graphql.selections.GetProfileQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Profile;", "profile", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Party;", "party", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Account;", "account", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$ExperimentationSegments;", "experimentationSegments", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LinkedAuthenticationProfiles;", "linkedAuthenticationProfiles", "<init>", "(Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Profile;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Party;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Account;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$ExperimentationSegments;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LinkedAuthenticationProfiles;)V", "component1", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Profile;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Party;", "component3", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Account;", "component4", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$ExperimentationSegments;", "component5", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LinkedAuthenticationProfiles;", "copy", "(Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Profile;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Party;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Account;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$ExperimentationSegments;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LinkedAuthenticationProfiles;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Profile;", "getProfile", "getProfile$annotations", "()V", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Party;", "getParty", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Account;", "getAccount", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$ExperimentationSegments;", "getExperimentationSegments", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LinkedAuthenticationProfiles;", "getLinkedAuthenticationProfiles"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments experimentationSegments;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile profile;

        @kotlin.Deprecated(message = "Use 'party', 'account', and 'preferences' fields instead. This field will be removed after client migration is complete.")
        public static /* synthetic */ void getProfile$annotations() {
        }

        public Data(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile profile, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments experimentationSegments, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedAuthenticationProfiles, "");
            this.profile = profile;
            this.party = party;
            this.account = account;
            this.experimentationSegments = experimentationSegments;
            this.linkedAuthenticationProfiles = linkedAuthenticationProfiles;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile getProfile() {
            return this.profile;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party getParty() {
            return this.party;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account getAccount() {
            return this.account;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments getExperimentationSegments() {
            return this.experimentationSegments;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles getLinkedAuthenticationProfiles() {
            return this.linkedAuthenticationProfiles;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile profile = this.profile;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party = this.party;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account = this.account;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments experimentationSegments = this.experimentationSegments;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles = this.linkedAuthenticationProfiles;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(profile=");
            sb.append(profile);
            sb.append(", party=");
            sb.append(party);
            sb.append(", account=");
            sb.append(account);
            sb.append(", experimentationSegments=");
            sb.append(experimentationSegments);
            sb.append(", linkedAuthenticationProfiles=");
            sb.append(linkedAuthenticationProfiles);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile profile = this.profile;
            int hashCode = profile == null ? 0 : profile.hashCode();
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party = this.party;
            int hashCode2 = party == null ? 0 : party.hashCode();
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account = this.account;
            int hashCode3 = account == null ? 0 : account.hashCode();
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments experimentationSegments = this.experimentationSegments;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (experimentationSegments != null ? experimentationSegments.hashCode() : 0)) * 31) + this.linkedAuthenticationProfiles.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data data = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.profile, data.profile) && kotlin.jvm.internal.Intrinsics.areEqual(this.party, data.party) && kotlin.jvm.internal.Intrinsics.areEqual(this.account, data.account) && kotlin.jvm.internal.Intrinsics.areEqual(this.experimentationSegments, data.experimentationSegments) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkedAuthenticationProfiles, data.linkedAuthenticationProfiles);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data copy(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile profile, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments experimentationSegments, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedAuthenticationProfiles, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data(profile, party, account, experimentationSegments, linkedAuthenticationProfiles);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles getLinkedAuthenticationProfiles() {
            return this.linkedAuthenticationProfiles;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments getExperimentationSegments() {
            return this.experimentationSegments;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party getParty() {
            return this.party;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile getProfile() {
            return this.profile;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data data, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile profile, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments experimentationSegments, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profile = data.profile;
            }
            if ((i & 2) != 0) {
                party = data.party;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party2 = party;
            if ((i & 4) != 0) {
                account = data.account;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account2 = account;
            if ((i & 8) != 0) {
                experimentationSegments = data.experimentationSegments;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments experimentationSegments2 = experimentationSegments;
            if ((i & 16) != 0) {
                linkedAuthenticationProfiles = data.linkedAuthenticationProfiles;
            }
            return data.copy(profile, party2, account2, experimentationSegments2, linkedAuthenticationProfiles);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\\\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b.\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Profile;", "", "", "id", "accountType", "", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Email;", "emails", "legalCountryCode", "legalEntity", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Name;", "name", "primaryCurrencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Name;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Object;", "component5", "component6", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Name;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Name;Ljava/lang/Object;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Profile;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAccountType", "Ljava/util/List;", "getEmails", "Ljava/lang/Object;", "getLegalCountryCode", "getLegalEntity", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Name;", "getName", "getPrimaryCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Profile {
        private final java.lang.String accountType;
        private final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email> emails;
        private final java.lang.String id;
        private final java.lang.Object legalCountryCode;
        private final java.lang.String legalEntity;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name name;
        private final java.lang.Object primaryCurrencyCode;

        public Profile(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email> list, java.lang.Object obj, java.lang.String str3, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name name2, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.id = str;
            this.accountType = str2;
            this.emails = list;
            this.legalCountryCode = obj;
            this.legalEntity = str3;
            this.name = name2;
            this.primaryCurrencyCode = obj2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getAccountType() {
            return this.accountType;
        }

        public final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email> getEmails() {
            return this.emails;
        }

        public final java.lang.Object getLegalCountryCode() {
            return this.legalCountryCode;
        }

        public final java.lang.String getLegalEntity() {
            return this.legalEntity;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name getName() {
            return this.name;
        }

        public final java.lang.Object getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.accountType;
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email> list = this.emails;
            java.lang.Object obj = this.legalCountryCode;
            java.lang.String str3 = this.legalEntity;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name name2 = this.name;
            java.lang.Object obj2 = this.primaryCurrencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Profile(id=");
            sb.append(str);
            sb.append(", accountType=");
            sb.append(str2);
            sb.append(", emails=");
            sb.append(list);
            sb.append(", legalCountryCode=");
            sb.append(obj);
            sb.append(", legalEntity=");
            sb.append(str3);
            sb.append(", name=");
            sb.append(name2);
            sb.append(", primaryCurrencyCode=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.accountType.hashCode()) * 31) + this.emails.hashCode()) * 31) + this.legalCountryCode.hashCode()) * 31) + this.legalEntity.hashCode()) * 31) + this.name.hashCode()) * 31) + this.primaryCurrencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile profile = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, profile.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountType, profile.accountType) && kotlin.jvm.internal.Intrinsics.areEqual(this.emails, profile.emails) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalCountryCode, profile.legalCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalEntity, profile.legalEntity) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, profile.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyCode, profile.primaryCurrencyCode);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile copy(java.lang.String id, java.lang.String accountType, java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email> emails, java.lang.Object legalCountryCode, java.lang.String legalEntity, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name name2, java.lang.Object primaryCurrencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emails, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalCountryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalEntity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryCurrencyCode, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile(id, accountType, emails, legalCountryCode, legalEntity, name2, primaryCurrencyCode);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name getName() {
            return this.name;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getLegalEntity() {
            return this.legalEntity;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getLegalCountryCode() {
            return this.legalCountryCode;
        }

        public final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email> component3() {
            return this.emails;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountType() {
            return this.accountType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile profile, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.Object obj, java.lang.String str3, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name name2, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = profile.id;
            }
            if ((i & 2) != 0) {
                str2 = profile.accountType;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                list = profile.emails;
            }
            java.util.List list2 = list;
            if ((i & 8) != 0) {
                obj = profile.legalCountryCode;
            }
            java.lang.Object obj4 = obj;
            if ((i & 16) != 0) {
                str3 = profile.legalEntity;
            }
            java.lang.String str5 = str3;
            if ((i & 32) != 0) {
                name2 = profile.name;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name name3 = name2;
            if ((i & 64) != 0) {
                obj2 = profile.primaryCurrencyCode;
            }
            return profile.copy(str, str4, list2, obj4, str5, name3, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Email;", "", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "confirmed", "primary", "<init>", "(Ljava/lang/Object;ZZ)V", "component1", "()Ljava/lang/Object;", "component2", "()Z", "component3", "copy", "(Ljava/lang/Object;ZZ)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Email;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getEmailAddress", "Z", "getConfirmed", "getPrimary"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Email {
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
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email email = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, email.emailAddress) && this.confirmed == email.confirmed && this.primary == email.primary;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email copy(java.lang.Object emailAddress, boolean confirmed, boolean primary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email(emailAddress, confirmed, primary);
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

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email email, java.lang.Object obj, boolean z, boolean z2, int i, java.lang.Object obj2) {
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

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Name;", "", "", "fullName", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFullName", "getGivenName", "getSurname"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Name {
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String surname;

        public Name(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.fullName = str;
            this.givenName = str2;
            this.surname = str3;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fullName;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.surname;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(fullName=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.fullName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.givenName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.surname;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name name2 = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, name2.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, name2.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, name2.surname);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name copy(java.lang.String fullName, java.lang.String givenName, java.lang.String surname) {
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name(fullName, givenName, surname);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Name name2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.fullName;
            }
            if ((i & 2) != 0) {
                str2 = name2.givenName;
            }
            if ((i & 4) != 0) {
                str3 = name2.surname;
            }
            return name2.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010%J°\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b?\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010#R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010)R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bJ\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010,R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bM\u0010%"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Party;", "", "", "id", com.microblink.blinkid.entities.recognizers.blinkid.croatia.CroatiaCombinedRecognizer.VerificationConstants.Citizenship, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "profileImageUrl", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LegalName;", "legalName", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryEmail;", "primaryEmail", "", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Email1;", "emails", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryPhone;", "primaryPhone", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryMobilePhone;", "primaryMobilePhone", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Phone;", "phones", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$HomeAddress;", "homeAddress", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Address;", "addresses", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LegalName;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryEmail;Ljava/util/List;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryPhone;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryMobilePhone;Ljava/util/List;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$HomeAddress;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "component5", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LegalName;", "component6", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryEmail;", "component7", "()Ljava/util/List;", "component8", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryPhone;", "component9", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryMobilePhone;", "component10", "component11", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$HomeAddress;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LegalName;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryEmail;Ljava/util/List;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryPhone;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryMobilePhone;Ljava/util/List;Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$HomeAddress;Ljava/util/List;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Party;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getCitizenship", "getCountry", "getCountry$annotations", "()V", "getProfileImageUrl", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LegalName;", "getLegalName", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryEmail;", "getPrimaryEmail", "Ljava/util/List;", "getEmails", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryPhone;", "getPrimaryPhone", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryMobilePhone;", "getPrimaryMobilePhone", "getPhones", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$HomeAddress;", "getHomeAddress", "getAddresses"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Party {
        private final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address> addresses;
        private final java.lang.Object citizenship;
        private final java.lang.Object country;
        private final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1> emails;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress homeAddress;
        private final java.lang.String id;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName legalName;
        private final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone> phones;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone primaryMobilePhone;
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone primaryPhone;
        private final java.lang.Object profileImageUrl;

        @kotlin.Deprecated(message = "Account property - Use 'legalCountryCode' field instead under Account.")
        public static /* synthetic */ void getCountry$annotations() {
        }

        public Party(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName legalName, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail, java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1> list, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone primaryPhone, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone primaryMobilePhone, java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone> list2, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress homeAddress, java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address> list3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.citizenship = obj;
            this.country = obj2;
            this.profileImageUrl = obj3;
            this.legalName = legalName;
            this.primaryEmail = primaryEmail;
            this.emails = list;
            this.primaryPhone = primaryPhone;
            this.primaryMobilePhone = primaryMobilePhone;
            this.phones = list2;
            this.homeAddress = homeAddress;
            this.addresses = list3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getCitizenship() {
            return this.citizenship;
        }

        public final java.lang.Object getCountry() {
            return this.country;
        }

        public final java.lang.Object getProfileImageUrl() {
            return this.profileImageUrl;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName getLegalName() {
            return this.legalName;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail getPrimaryEmail() {
            return this.primaryEmail;
        }

        public final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1> getEmails() {
            return this.emails;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone getPrimaryPhone() {
            return this.primaryPhone;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone getPrimaryMobilePhone() {
            return this.primaryMobilePhone;
        }

        public final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone> getPhones() {
            return this.phones;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress getHomeAddress() {
            return this.homeAddress;
        }

        public final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address> getAddresses() {
            return this.addresses;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.citizenship;
            java.lang.Object obj2 = this.country;
            java.lang.Object obj3 = this.profileImageUrl;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName legalName = this.legalName;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail = this.primaryEmail;
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1> list = this.emails;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone primaryPhone = this.primaryPhone;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone primaryMobilePhone = this.primaryMobilePhone;
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone> list2 = this.phones;
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress homeAddress = this.homeAddress;
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address> list3 = this.addresses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Party(id=");
            sb.append(str);
            sb.append(", citizenship=");
            sb.append(obj);
            sb.append(", country=");
            sb.append(obj2);
            sb.append(", profileImageUrl=");
            sb.append(obj3);
            sb.append(", legalName=");
            sb.append(legalName);
            sb.append(", primaryEmail=");
            sb.append(primaryEmail);
            sb.append(", emails=");
            sb.append(list);
            sb.append(", primaryPhone=");
            sb.append(primaryPhone);
            sb.append(", primaryMobilePhone=");
            sb.append(primaryMobilePhone);
            sb.append(", phones=");
            sb.append(list2);
            sb.append(", homeAddress=");
            sb.append(homeAddress);
            sb.append(", addresses=");
            sb.append(list3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.Object obj = this.citizenship;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.country;
            int hashCode3 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.profileImageUrl;
            int hashCode4 = obj3 == null ? 0 : obj3.hashCode();
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName legalName = this.legalName;
            int hashCode5 = legalName == null ? 0 : legalName.hashCode();
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail = this.primaryEmail;
            int hashCode6 = primaryEmail == null ? 0 : primaryEmail.hashCode();
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1> list = this.emails;
            int hashCode7 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone primaryPhone = this.primaryPhone;
            int hashCode8 = primaryPhone == null ? 0 : primaryPhone.hashCode();
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone primaryMobilePhone = this.primaryMobilePhone;
            int hashCode9 = primaryMobilePhone == null ? 0 : primaryMobilePhone.hashCode();
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone> list2 = this.phones;
            int hashCode10 = list2 == null ? 0 : list2.hashCode();
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress homeAddress = this.homeAddress;
            int hashCode11 = homeAddress == null ? 0 : homeAddress.hashCode();
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address> list3 = this.addresses;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (list3 != null ? list3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, party.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.citizenship, party.citizenship) && kotlin.jvm.internal.Intrinsics.areEqual(this.country, party.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileImageUrl, party.profileImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalName, party.legalName) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryEmail, party.primaryEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.emails, party.emails) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryPhone, party.primaryPhone) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryMobilePhone, party.primaryMobilePhone) && kotlin.jvm.internal.Intrinsics.areEqual(this.phones, party.phones) && kotlin.jvm.internal.Intrinsics.areEqual(this.homeAddress, party.homeAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, party.addresses);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party copy(java.lang.String id, java.lang.Object citizenship, java.lang.Object country, java.lang.Object profileImageUrl, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName legalName, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail, java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1> emails, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone primaryPhone, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone primaryMobilePhone, java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone> phones, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress homeAddress, java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address> addresses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party(id, citizenship, country, profileImageUrl, legalName, primaryEmail, emails, primaryPhone, primaryMobilePhone, phones, homeAddress, addresses);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone getPrimaryMobilePhone() {
            return this.primaryMobilePhone;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone getPrimaryPhone() {
            return this.primaryPhone;
        }

        public final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1> component7() {
            return this.emails;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail getPrimaryEmail() {
            return this.primaryEmail;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName getLegalName() {
            return this.legalName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getProfileImageUrl() {
            return this.profileImageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getCountry() {
            return this.country;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCitizenship() {
            return this.citizenship;
        }

        public final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address> component12() {
            return this.addresses;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress getHomeAddress() {
            return this.homeAddress;
        }

        public final java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone> component10() {
            return this.phones;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LegalName;", "", "", "__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment;", "personNameFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LegalName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment;", "getPersonNameFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LegalName {
        private final java.lang.String __typename;
        private final com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment personNameFragment;

        public LegalName(java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment personNameFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personNameFragment, "");
            this.__typename = str;
            this.personNameFragment = personNameFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment getPersonNameFragment() {
            return this.personNameFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment personNameFragment = this.personNameFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalName(__typename=");
            sb.append(str);
            sb.append(", personNameFragment=");
            sb.append(personNameFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.personNameFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName legalName = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, legalName.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.personNameFragment, legalName.personNameFragment);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName copy(java.lang.String __typename, com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment personNameFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personNameFragment, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName(__typename, personNameFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment getPersonNameFragment() {
            return this.personNameFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName legalName, java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment personNameFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = legalName.__typename;
            }
            if ((i & 2) != 0) {
                personNameFragment = legalName.personNameFragment;
            }
            return legalName.copy(str, personNameFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryEmail;", "", "", "__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;", "userEmailFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryEmail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;", "getUserEmailFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryEmail {
        private final java.lang.String __typename;
        private final com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment;

        public PrimaryEmail(java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEmailFragment, "");
            this.__typename = str;
            this.userEmailFragment = userEmailFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment getUserEmailFragment() {
            return this.userEmailFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment = this.userEmailFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryEmail(__typename=");
            sb.append(str);
            sb.append(", userEmailFragment=");
            sb.append(userEmailFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.userEmailFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, primaryEmail.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.userEmailFragment, primaryEmail.userEmailFragment);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail copy(java.lang.String __typename, com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEmailFragment, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail(__typename, userEmailFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment getUserEmailFragment() {
            return this.userEmailFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail, java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = primaryEmail.__typename;
            }
            if ((i & 2) != 0) {
                userEmailFragment = primaryEmail.userEmailFragment;
            }
            return primaryEmail.copy(str, userEmailFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Email1;", "", "", "__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;", "userEmailFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Email1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;", "getUserEmailFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Email1 {
        private final java.lang.String __typename;
        private final com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment;

        public Email1(java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEmailFragment, "");
            this.__typename = str;
            this.userEmailFragment = userEmailFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment getUserEmailFragment() {
            return this.userEmailFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment = this.userEmailFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Email1(__typename=");
            sb.append(str);
            sb.append(", userEmailFragment=");
            sb.append(userEmailFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.userEmailFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1 email1 = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, email1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.userEmailFragment, email1.userEmailFragment);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1 copy(java.lang.String __typename, com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEmailFragment, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1(__typename, userEmailFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment getUserEmailFragment() {
            return this.userEmailFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1 copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1 email1, java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = email1.__typename;
            }
            if ((i & 2) != 0) {
                userEmailFragment = email1.userEmailFragment;
            }
            return email1.copy(str, userEmailFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryPhone;", "", "", "__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "userPhoneFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryPhone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "getUserPhoneFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryPhone {
        private final java.lang.String __typename;
        private final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment;

        public PrimaryPhone(java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPhoneFragment, "");
            this.__typename = str;
            this.userPhoneFragment = userPhoneFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment getUserPhoneFragment() {
            return this.userPhoneFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment = this.userPhoneFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryPhone(__typename=");
            sb.append(str);
            sb.append(", userPhoneFragment=");
            sb.append(userPhoneFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.userPhoneFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone primaryPhone = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, primaryPhone.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.userPhoneFragment, primaryPhone.userPhoneFragment);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone copy(java.lang.String __typename, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPhoneFragment, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone(__typename, userPhoneFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment getUserPhoneFragment() {
            return this.userPhoneFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone primaryPhone, java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = primaryPhone.__typename;
            }
            if ((i & 2) != 0) {
                userPhoneFragment = primaryPhone.userPhoneFragment;
            }
            return primaryPhone.copy(str, userPhoneFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryMobilePhone;", "", "", "__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "userPhoneFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$PrimaryMobilePhone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "getUserPhoneFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryMobilePhone {
        private final java.lang.String __typename;
        private final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment;

        public PrimaryMobilePhone(java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPhoneFragment, "");
            this.__typename = str;
            this.userPhoneFragment = userPhoneFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment getUserPhoneFragment() {
            return this.userPhoneFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment = this.userPhoneFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryMobilePhone(__typename=");
            sb.append(str);
            sb.append(", userPhoneFragment=");
            sb.append(userPhoneFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.userPhoneFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone primaryMobilePhone = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, primaryMobilePhone.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.userPhoneFragment, primaryMobilePhone.userPhoneFragment);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone copy(java.lang.String __typename, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPhoneFragment, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone(__typename, userPhoneFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment getUserPhoneFragment() {
            return this.userPhoneFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone primaryMobilePhone, java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = primaryMobilePhone.__typename;
            }
            if ((i & 2) != 0) {
                userPhoneFragment = primaryMobilePhone.userPhoneFragment;
            }
            return primaryMobilePhone.copy(str, userPhoneFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Phone;", "", "", "__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "userPhoneFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Phone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "getUserPhoneFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Phone {
        private final java.lang.String __typename;
        private final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment;

        public Phone(java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPhoneFragment, "");
            this.__typename = str;
            this.userPhoneFragment = userPhoneFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment getUserPhoneFragment() {
            return this.userPhoneFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment = this.userPhoneFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(__typename=");
            sb.append(str);
            sb.append(", userPhoneFragment=");
            sb.append(userPhoneFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.userPhoneFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone phone = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, phone.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.userPhoneFragment, phone.userPhoneFragment);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone copy(java.lang.String __typename, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPhoneFragment, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone(__typename, userPhoneFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment getUserPhoneFragment() {
            return this.userPhoneFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone phone, java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phone.__typename;
            }
            if ((i & 2) != 0) {
                userPhoneFragment = phone.userPhoneFragment;
            }
            return phone.copy(str, userPhoneFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$HomeAddress;", "", "", "__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "userAddressFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$HomeAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "getUserAddressFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HomeAddress {
        private final java.lang.String __typename;
        private final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment;

        public HomeAddress(java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAddressFragment, "");
            this.__typename = str;
            this.userAddressFragment = userAddressFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment getUserAddressFragment() {
            return this.userAddressFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment = this.userAddressFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HomeAddress(__typename=");
            sb.append(str);
            sb.append(", userAddressFragment=");
            sb.append(userAddressFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.userAddressFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress homeAddress = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, homeAddress.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.userAddressFragment, homeAddress.userAddressFragment);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress copy(java.lang.String __typename, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAddressFragment, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress(__typename, userAddressFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment getUserAddressFragment() {
            return this.userAddressFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress homeAddress, java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = homeAddress.__typename;
            }
            if ((i & 2) != 0) {
                userAddressFragment = homeAddress.userAddressFragment;
            }
            return homeAddress.copy(str, userAddressFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Address;", "", "", "__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "userAddressFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "getUserAddressFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        private final java.lang.String __typename;
        private final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment;

        public Address(java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAddressFragment, "");
            this.__typename = str;
            this.userAddressFragment = userAddressFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment getUserAddressFragment() {
            return this.userAddressFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment = this.userAddressFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(__typename=");
            sb.append(str);
            sb.append(", userAddressFragment=");
            sb.append(userAddressFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.userAddressFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address address = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, address.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.userAddressFragment, address.userAddressFragment);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address copy(java.lang.String __typename, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAddressFragment, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address(__typename, userAddressFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment getUserAddressFragment() {
            return this.userAddressFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address address, java.lang.String str, com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = address.__typename;
            }
            if ((i & 2) != 0) {
                userAddressFragment = address.userAddressFragment;
            }
            return address.copy(str, userAddressFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJL\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b#\u0010\fR\u001a\u0010\b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Account;", "", "", "id", "legalEntity", "legalCountryCode", "registrationType", "tier", "createdTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Account;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLegalEntity", "Ljava/lang/Object;", "getLegalCountryCode", "getRegistrationType", "getTier", "getCreatedTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Account {
        private final java.lang.Object createdTime;
        private final java.lang.String id;
        private final java.lang.Object legalCountryCode;
        private final java.lang.String legalEntity;
        private final java.lang.String registrationType;
        private final java.lang.String tier;

        public Account(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3, java.lang.String str4, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.id = str;
            this.legalEntity = str2;
            this.legalCountryCode = obj;
            this.registrationType = str3;
            this.tier = str4;
            this.createdTime = obj2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLegalEntity() {
            return this.legalEntity;
        }

        public final java.lang.Object getLegalCountryCode() {
            return this.legalCountryCode;
        }

        public final java.lang.String getRegistrationType() {
            return this.registrationType;
        }

        public final java.lang.String getTier() {
            return this.tier;
        }

        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.legalEntity;
            java.lang.Object obj = this.legalCountryCode;
            java.lang.String str3 = this.registrationType;
            java.lang.String str4 = this.tier;
            java.lang.Object obj2 = this.createdTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Account(id=");
            sb.append(str);
            sb.append(", legalEntity=");
            sb.append(str2);
            sb.append(", legalCountryCode=");
            sb.append(obj);
            sb.append(", registrationType=");
            sb.append(str3);
            sb.append(", tier=");
            sb.append(str4);
            sb.append(", createdTime=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.id.hashCode() * 31) + this.legalEntity.hashCode()) * 31) + this.legalCountryCode.hashCode()) * 31) + this.registrationType.hashCode()) * 31) + this.tier.hashCode()) * 31) + this.createdTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, account.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalEntity, account.legalEntity) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalCountryCode, account.legalCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.registrationType, account.registrationType) && kotlin.jvm.internal.Intrinsics.areEqual(this.tier, account.tier) && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, account.createdTime);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account copy(java.lang.String id, java.lang.String legalEntity, java.lang.Object legalCountryCode, java.lang.String registrationType, java.lang.String tier, java.lang.Object createdTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalEntity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalCountryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registrationType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdTime, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account(id, legalEntity, legalCountryCode, registrationType, tier, createdTime);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getTier() {
            return this.tier;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getRegistrationType() {
            return this.registrationType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getLegalCountryCode() {
            return this.legalCountryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLegalEntity() {
            return this.legalEntity;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account, java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3, java.lang.String str4, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = account.id;
            }
            if ((i & 2) != 0) {
                str2 = account.legalEntity;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                obj = account.legalCountryCode;
            }
            java.lang.Object obj4 = obj;
            if ((i & 8) != 0) {
                str3 = account.registrationType;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                str4 = account.tier;
            }
            java.lang.String str7 = str4;
            if ((i & 32) != 0) {
                obj2 = account.createdTime;
            }
            return account.copy(str, str5, obj4, str6, str7, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$ExperimentationSegments;", "", "", "", "segmentCodes", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$ExperimentationSegments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSegmentCodes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExperimentationSegments {
        private final java.util.List<java.lang.String> segmentCodes;

        public ExperimentationSegments(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.segmentCodes = list;
        }

        public final java.util.List<java.lang.String> getSegmentCodes() {
            return this.segmentCodes;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.segmentCodes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExperimentationSegments(segmentCodes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.segmentCodes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments) && kotlin.jvm.internal.Intrinsics.areEqual(this.segmentCodes, ((com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments) other).segmentCodes);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments copy(java.util.List<java.lang.String> segmentCodes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segmentCodes, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments(segmentCodes);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.segmentCodes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments experimentationSegments, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = experimentationSegments.segmentCodes;
            }
            return experimentationSegments.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LinkedAuthenticationProfiles;", "", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Page;", "page", "<init>", "(Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Page;)V", "component1", "()Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Page;", "copy", "(Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Page;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$LinkedAuthenticationProfiles;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Page;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkedAuthenticationProfiles {
        private final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page page;

        public LinkedAuthenticationProfiles(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page page = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkedAuthenticationProfiles(page=");
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
            return (other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles) other).page);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles copy(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page page, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = linkedAuthenticationProfiles.page;
            }
            return linkedAuthenticationProfiles.copy(page);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Page;", "", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getTotalCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Page {
        private final java.lang.Integer totalCount;

        public Page(java.lang.Integer num) {
            this.totalCount = num;
        }

        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.totalCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(totalCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.totalCount;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalCount, ((com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page) other).totalCount);
        }

        public final com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page copy(java.lang.Integer totalCount) {
            return new com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page(totalCount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page copy$default(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Page page, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = page.totalCount;
            }
            return page.copy(num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetProfile { profile { id accountType emails { emailAddress confirmed primary } legalCountryCode legalEntity name { fullName givenName surname } primaryCurrencyCode } party { id citizenship country profileImageUrl legalName { __typename ...PersonNameFragment } primaryEmail { __typename ...UserEmailFragment } emails { __typename ...UserEmailFragment } primaryPhone { __typename ...UserPhoneFragment } primaryMobilePhone { __typename ...UserPhoneFragment } phones { __typename ...UserPhoneFragment } homeAddress { __typename ...UserAddressFragment } addresses { __typename ...UserAddressFragment } } account { id legalEntity legalCountryCode registrationType tier createdTime } experimentationSegments { segmentCodes } linkedAuthenticationProfiles { page { totalCount } } }  fragment PersonNameFragment on PartyName { orthography personName { prefix givenName middleName secondSurname surname suffix fullName } }  fragment UserEmailFragment on Email { id emailAddress primary confirmed createdTime }  fragment UserPhoneFragment on PartyPhone { id phoneNumber { extensionNumber countryCode nationalNumber } type maskedPhoneNumber primary confirmed createdTime }  fragment UserAddressFragment on Address { id primary confirmed addresseeName billing confirmationAuthority address { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 countryCode postalCode } }";
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

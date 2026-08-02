package com.paypal.oslo.feature.userprofile.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePartyProfilePictureInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePartyProfilePictureInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdatePartyProfilePictureInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePartyProfilePictureInput;)Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePartyProfilePictureInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.OPERATION_NAME, "Party"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UpdatePartyProfilePictureMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data> {
    public static final java.lang.String OPERATION_ID = "e463f6119250e4dc38ede71a19a56102db3655250b36340b8f7badce5a01a25a";
    public static final java.lang.String OPERATION_NAME = "UpdatePartyProfilePicture";
    private final com.paypal.oslo.api.graphql.schema.type.UpdatePartyProfilePictureInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Companion INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Companion(null);
    public static final int $stable = 8;

    public UpdatePartyProfilePictureMutation(com.paypal.oslo.api.graphql.schema.type.UpdatePartyProfilePictureInput updatePartyProfilePictureInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePartyProfilePictureInput, "");
        this.input = updatePartyProfilePictureInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePartyProfilePictureInput getInput() {
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
        com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyProfilePictureMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyProfilePictureMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.userprofile.graphql.selections.UpdatePartyProfilePictureMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$UpdatePartyProfilePicture;", "updatePartyProfilePicture", "<init>", "(Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$UpdatePartyProfilePicture;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$UpdatePartyProfilePicture;", "copy", "(Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$UpdatePartyProfilePicture;)Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$UpdatePartyProfilePicture;", "getUpdatePartyProfilePicture"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture updatePartyProfilePicture;

        public Data(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture updatePartyProfilePicture) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePartyProfilePicture, "");
            this.updatePartyProfilePicture = updatePartyProfilePicture;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture getUpdatePartyProfilePicture() {
            return this.updatePartyProfilePicture;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture updatePartyProfilePicture = this.updatePartyProfilePicture;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updatePartyProfilePicture=");
            sb.append(updatePartyProfilePicture);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updatePartyProfilePicture.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatePartyProfilePicture, ((com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data) other).updatePartyProfilePicture);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data copy(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture updatePartyProfilePicture) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePartyProfilePicture, "");
            return new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data(updatePartyProfilePicture);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture getUpdatePartyProfilePicture() {
            return this.updatePartyProfilePicture;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data copy$default(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Data data, com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture updatePartyProfilePicture, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updatePartyProfilePicture = data.updatePartyProfilePicture;
            }
            return data.copy(updatePartyProfilePicture);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$UpdatePartyProfilePicture;", "", "Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Party;", "party", "<init>", "(Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Party;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Party;", "copy", "(Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Party;)Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$UpdatePartyProfilePicture;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Party;", "getParty"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdatePartyProfilePicture {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party party;

        public UpdatePartyProfilePicture(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party party) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(party, "");
            this.party = party;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party getParty() {
            return this.party;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party party = this.party;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePartyProfilePicture(party=");
            sb.append(party);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.party.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture) && kotlin.jvm.internal.Intrinsics.areEqual(this.party, ((com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture) other).party);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture copy(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party party) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(party, "");
            return new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture(party);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party getParty() {
            return this.party;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture copy$default(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.UpdatePartyProfilePicture updatePartyProfilePicture, com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party party, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                party = updatePartyProfilePicture.party;
            }
            return updatePartyProfilePicture.copy(party);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Party;", "", "", "__typename", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhotoFields;", "partyPhotoFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhotoFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhotoFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhotoFields;)Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Party;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/PartyPhotoFields;", "getPartyPhotoFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Party {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhotoFields partyPhotoFields;

        public Party(java.lang.String str, com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhotoFields partyPhotoFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partyPhotoFields, "");
            this.__typename = str;
            this.partyPhotoFields = partyPhotoFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhotoFields getPartyPhotoFields() {
            return this.partyPhotoFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhotoFields partyPhotoFields = this.partyPhotoFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Party(__typename=");
            sb.append(str);
            sb.append(", partyPhotoFields=");
            sb.append(partyPhotoFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.partyPhotoFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party party = (com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, party.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.partyPhotoFields, party.partyPhotoFields);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party copy(java.lang.String __typename, com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhotoFields partyPhotoFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partyPhotoFields, "");
            return new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party(__typename, partyPhotoFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhotoFields getPartyPhotoFields() {
            return this.partyPhotoFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party copy$default(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation.Party party, java.lang.String str, com.paypal.oslo.feature.userprofile.graphql.fragment.PartyPhotoFields partyPhotoFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = party.__typename;
            }
            if ((i & 2) != 0) {
                partyPhotoFields = party.partyPhotoFields;
            }
            return party.copy(str, partyPhotoFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyProfilePictureMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdatePartyProfilePicture($input: UpdatePartyProfilePictureInput!) { updatePartyProfilePicture(input: $input) { party { __typename ...PartyPhotoFields } } }  fragment PartyPhotoFields on Party { id profileImageUrl }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdatePartyProfilePictureInput updatePartyProfilePictureInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePartyProfilePictureMutation(input=");
        sb.append(updatePartyProfilePictureInput);
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
        return (other instanceof com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation) other).input);
    }

    public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdatePartyProfilePictureInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdatePartyProfilePictureInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation copy$default(com.paypal.oslo.feature.userprofile.graphql.UpdatePartyProfilePictureMutation updatePartyProfilePictureMutation, com.paypal.oslo.api.graphql.schema.type.UpdatePartyProfilePictureInput updatePartyProfilePictureInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updatePartyProfilePictureInput = updatePartyProfilePictureMutation.input;
        }
        return updatePartyProfilePictureMutation.copy(updatePartyProfilePictureInput);
    }
}

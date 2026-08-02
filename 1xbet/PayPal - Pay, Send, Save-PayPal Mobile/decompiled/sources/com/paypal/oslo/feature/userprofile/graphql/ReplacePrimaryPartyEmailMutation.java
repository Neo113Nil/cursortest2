package com.paypal.oslo.feature.userprofile.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ReplacePrimaryPartyEmailInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ReplacePrimaryPartyEmailInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ReplacePrimaryPartyEmailInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ReplacePrimaryPartyEmailInput;)Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ReplacePrimaryPartyEmailInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.OPERATION_NAME, "Party"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReplacePrimaryPartyEmailMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data> {
    public static final java.lang.String OPERATION_ID = "7d1d3814098d31b105b3b40d6908601edc936d873c377127a4460f7ddbb3eadf";
    public static final java.lang.String OPERATION_NAME = "ReplacePrimaryPartyEmail";
    private final com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Companion INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Companion(null);
    public static final int $stable = 8;

    public ReplacePrimaryPartyEmailMutation(com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput replacePrimaryPartyEmailInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacePrimaryPartyEmailInput, "");
        this.input = replacePrimaryPartyEmailInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput getInput() {
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
        com.paypal.oslo.feature.userprofile.graphql.adapter.ReplacePrimaryPartyEmailMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.ReplacePrimaryPartyEmailMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.userprofile.graphql.selections.ReplacePrimaryPartyEmailMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$ReplacePrimaryPartyEmail;", "replacePrimaryPartyEmail", "<init>", "(Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$ReplacePrimaryPartyEmail;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$ReplacePrimaryPartyEmail;", "copy", "(Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$ReplacePrimaryPartyEmail;)Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$ReplacePrimaryPartyEmail;", "getReplacePrimaryPartyEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail replacePrimaryPartyEmail;

        public Data(com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail replacePrimaryPartyEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacePrimaryPartyEmail, "");
            this.replacePrimaryPartyEmail = replacePrimaryPartyEmail;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail getReplacePrimaryPartyEmail() {
            return this.replacePrimaryPartyEmail;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail replacePrimaryPartyEmail = this.replacePrimaryPartyEmail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(replacePrimaryPartyEmail=");
            sb.append(replacePrimaryPartyEmail);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.replacePrimaryPartyEmail.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.replacePrimaryPartyEmail, ((com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data) other).replacePrimaryPartyEmail);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data copy(com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail replacePrimaryPartyEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacePrimaryPartyEmail, "");
            return new com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data(replacePrimaryPartyEmail);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail getReplacePrimaryPartyEmail() {
            return this.replacePrimaryPartyEmail;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data copy$default(com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Data data, com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail replacePrimaryPartyEmail, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                replacePrimaryPartyEmail = data.replacePrimaryPartyEmail;
            }
            return data.copy(replacePrimaryPartyEmail);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$ReplacePrimaryPartyEmail;", "", "Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Party;", "party", "<init>", "(Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Party;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Party;", "copy", "(Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Party;)Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$ReplacePrimaryPartyEmail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Party;", "getParty"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReplacePrimaryPartyEmail {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party party;

        public ReplacePrimaryPartyEmail(com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party party) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(party, "");
            this.party = party;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party getParty() {
            return this.party;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party party = this.party;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplacePrimaryPartyEmail(party=");
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
            return (other instanceof com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.party, ((com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail) other).party);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail copy(com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party party) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(party, "");
            return new com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail(party);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party getParty() {
            return this.party;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail copy$default(com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.ReplacePrimaryPartyEmail replacePrimaryPartyEmail, com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party party, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                party = replacePrimaryPartyEmail.party;
            }
            return replacePrimaryPartyEmail.copy(party);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Party;", "", "", "__typename", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailPartyFragment;", "emailPartyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailPartyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailPartyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailPartyFragment;)Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Party;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailPartyFragment;", "getEmailPartyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Party {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.userprofile.graphql.fragment.EmailPartyFragment emailPartyFragment;

        public Party(java.lang.String str, com.paypal.oslo.feature.userprofile.graphql.fragment.EmailPartyFragment emailPartyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailPartyFragment, "");
            this.__typename = str;
            this.emailPartyFragment = emailPartyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.fragment.EmailPartyFragment getEmailPartyFragment() {
            return this.emailPartyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.userprofile.graphql.fragment.EmailPartyFragment emailPartyFragment = this.emailPartyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Party(__typename=");
            sb.append(str);
            sb.append(", emailPartyFragment=");
            sb.append(emailPartyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.emailPartyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party party = (com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, party.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailPartyFragment, party.emailPartyFragment);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party copy(java.lang.String __typename, com.paypal.oslo.feature.userprofile.graphql.fragment.EmailPartyFragment emailPartyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailPartyFragment, "");
            return new com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party(__typename, emailPartyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.fragment.EmailPartyFragment getEmailPartyFragment() {
            return this.emailPartyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party copy$default(com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation.Party party, java.lang.String str, com.paypal.oslo.feature.userprofile.graphql.fragment.EmailPartyFragment emailPartyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = party.__typename;
            }
            if ((i & 2) != 0) {
                emailPartyFragment = party.emailPartyFragment;
            }
            return party.copy(str, emailPartyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/ReplacePrimaryPartyEmailMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ReplacePrimaryPartyEmail($input: ReplacePrimaryPartyEmailInput!) { replacePrimaryPartyEmail(input: $input) { party { __typename ...EmailPartyFragment } } }  fragment EmailPartyFragment on Party { id }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput replacePrimaryPartyEmailInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplacePrimaryPartyEmailMutation(input=");
        sb.append(replacePrimaryPartyEmailInput);
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
        return (other instanceof com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation) other).input);
    }

    public final com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation copy(com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation copy$default(com.paypal.oslo.feature.userprofile.graphql.ReplacePrimaryPartyEmailMutation replacePrimaryPartyEmailMutation, com.paypal.oslo.api.graphql.schema.type.ReplacePrimaryPartyEmailInput replacePrimaryPartyEmailInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            replacePrimaryPartyEmailInput = replacePrimaryPartyEmailMutation.input;
        }
        return replacePrimaryPartyEmailMutation.copy(replacePrimaryPartyEmailInput);
    }
}

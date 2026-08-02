package com.paypal.oslo.feature.userprofile.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AddPartyEmailInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AddPartyEmailInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AddPartyEmailInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AddPartyEmailInput;)Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AddPartyEmailInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.OPERATION_NAME, "Email"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddPartyEmailMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data> {
    public static final java.lang.String OPERATION_ID = "f63588439af69cc6746251678db33f3ae11c75e7e84d20e9fe7ca54d7c0ec162";
    public static final java.lang.String OPERATION_NAME = "AddPartyEmail";
    private final com.paypal.oslo.api.graphql.schema.type.AddPartyEmailInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Companion INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Companion(null);
    public static final int $stable = 8;

    public AddPartyEmailMutation(com.paypal.oslo.api.graphql.schema.type.AddPartyEmailInput addPartyEmailInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addPartyEmailInput, "");
        this.input = addPartyEmailInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddPartyEmailInput getInput() {
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
        com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyEmailMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyEmailMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.userprofile.graphql.selections.AddPartyEmailMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$AddPartyEmail;", "addPartyEmail", "<init>", "(Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$AddPartyEmail;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$AddPartyEmail;", "copy", "(Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$AddPartyEmail;)Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$AddPartyEmail;", "getAddPartyEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail addPartyEmail;

        public Data(com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail addPartyEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addPartyEmail, "");
            this.addPartyEmail = addPartyEmail;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail getAddPartyEmail() {
            return this.addPartyEmail;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail addPartyEmail = this.addPartyEmail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(addPartyEmail=");
            sb.append(addPartyEmail);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.addPartyEmail.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.addPartyEmail, ((com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data) other).addPartyEmail);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data copy(com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail addPartyEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addPartyEmail, "");
            return new com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data(addPartyEmail);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail getAddPartyEmail() {
            return this.addPartyEmail;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data copy$default(com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Data data, com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail addPartyEmail, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addPartyEmail = data.addPartyEmail;
            }
            return data.copy(addPartyEmail);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$AddPartyEmail;", "", "Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Email;", "email", "<init>", "(Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Email;)V", "component1", "()Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Email;", "copy", "(Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Email;)Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$AddPartyEmail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Email;", "getEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddPartyEmail {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email email;

        public AddPartyEmail(com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email email) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            this.email = email;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email getEmail() {
            return this.email;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email email = this.email;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddPartyEmail(email=");
            sb.append(email);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.email.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail) other).email);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail copy(com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email email) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            return new com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail(email);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email getEmail() {
            return this.email;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail copy$default(com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.AddPartyEmail addPartyEmail, com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email email, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                email = addPartyEmail.email;
            }
            return addPartyEmail.copy(email);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Email;", "", "", "__typename", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailFragment;", "emailFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailFragment;)Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Email;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/userprofile/graphql/fragment/EmailFragment;", "getEmailFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Email {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragment emailFragment;

        public Email(java.lang.String str, com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragment emailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailFragment, "");
            this.__typename = str;
            this.emailFragment = emailFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragment getEmailFragment() {
            return this.emailFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragment emailFragment = this.emailFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Email(__typename=");
            sb.append(str);
            sb.append(", emailFragment=");
            sb.append(emailFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.emailFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email email = (com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, email.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailFragment, email.emailFragment);
        }

        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email copy(java.lang.String __typename, com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragment emailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailFragment, "");
            return new com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email(__typename, emailFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragment getEmailFragment() {
            return this.emailFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email copy$default(com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation.Email email, java.lang.String str, com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragment emailFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = email.__typename;
            }
            if ((i & 2) != 0) {
                emailFragment = email.emailFragment;
            }
            return email.copy(str, emailFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyEmailMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation AddPartyEmail($input: AddPartyEmailInput!) { addPartyEmail(input: $input) { email { __typename ...EmailFragment } } }  fragment EmailFragment on Email { id emailAddress confirmed primary createdTime }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AddPartyEmailInput addPartyEmailInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddPartyEmailMutation(input=");
        sb.append(addPartyEmailInput);
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
        return (other instanceof com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation) other).input);
    }

    public final com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation copy(com.paypal.oslo.api.graphql.schema.type.AddPartyEmailInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddPartyEmailInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation copy$default(com.paypal.oslo.feature.userprofile.graphql.AddPartyEmailMutation addPartyEmailMutation, com.paypal.oslo.api.graphql.schema.type.AddPartyEmailInput addPartyEmailInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addPartyEmailInput = addPartyEmailMutation.input;
        }
        return addPartyEmailMutation.copy(addPartyEmailInput);
    }
}

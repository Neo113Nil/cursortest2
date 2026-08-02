package com.paypal.oslo.feature.businesscustomers.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateContactInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateContactInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateContactInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateContactInput;)Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateContactInput;", "getInput", "Companion", "Data", "UpdateContact", "Contact"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateContactMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data> {
    public static final java.lang.String OPERATION_ID = "3e344db3f56ca280cfdf084fcfb6f13e7d92f69fdabc4f5ffb2cdbefed2e2d44";
    public static final java.lang.String OPERATION_NAME = "UpdateContactMutation";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateContactInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Companion INSTANCE = new com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateContactMutation(com.paypal.oslo.api.graphql.schema.type.UpdateContactInput updateContactInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateContactInput, "");
        this.input = updateContactInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateContactInput getInput() {
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
        com.paypal.oslo.feature.businesscustomers.graphql.adapter.UpdateContactMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesscustomers.graphql.adapter.UpdateContactMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.businesscustomers.graphql.selections.UpdateContactMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$UpdateContact;", "updateContact", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$UpdateContact;)V", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$UpdateContact;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$UpdateContact;)Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$UpdateContact;", "getUpdateContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact updateContact;

        public Data(com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact updateContact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateContact, "");
            this.updateContact = updateContact;
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact getUpdateContact() {
            return this.updateContact;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact updateContact = this.updateContact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateContact=");
            sb.append(updateContact);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updateContact.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateContact, ((com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data) other).updateContact);
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data copy(com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact updateContact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateContact, "");
            return new com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data(updateContact);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact getUpdateContact() {
            return this.updateContact;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data copy$default(com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data data, com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact updateContact, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateContact = data.updateContact;
            }
            return data.copy(updateContact);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$UpdateContact;", "", "", "isSuccessful", "Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Contact;", "contact", "<init>", "(ZLcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Contact;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Contact;", "copy", "(ZLcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Contact;)Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$UpdateContact;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Contact;", "getContact"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateContact {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact contact;
        private final boolean isSuccessful;

        public UpdateContact(boolean z, com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact contact) {
            this.isSuccessful = z;
            this.contact = contact;
        }

        public final boolean isSuccessful() {
            return this.isSuccessful;
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact getContact() {
            return this.contact;
        }

        public final java.lang.String toString() {
            boolean z = this.isSuccessful;
            com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact contact = this.contact;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateContact(isSuccessful=");
            sb.append(z);
            sb.append(", contact=");
            sb.append(contact);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isSuccessful);
            com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact contact = this.contact;
            return (hashCode * 31) + (contact == null ? 0 : contact.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact updateContact = (com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact) other;
            return this.isSuccessful == updateContact.isSuccessful && kotlin.jvm.internal.Intrinsics.areEqual(this.contact, updateContact.contact);
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact copy(boolean isSuccessful, com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact contact) {
            return new com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact(isSuccessful, contact);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact getContact() {
            return this.contact;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSuccessful() {
            return this.isSuccessful;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact copy$default(com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact updateContact, boolean z, com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact contact, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = updateContact.isSuccessful;
            }
            if ((i & 2) != 0) {
                contact = updateContact.contact;
            }
            return updateContact.copy(z, contact);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Contact;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;", "contactFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;)Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Contact;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactFragment;", "getContactFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Contact {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment;

        public Contact(java.lang.String str, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contact(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact contact = (com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, contact.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactFragment, contact.contactFragment);
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact copy(java.lang.String __typename, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactFragment, "");
            return new com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact(__typename, contactFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment getContactFragment() {
            return this.contactFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact copy$default(com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact contact, java.lang.String str, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contact.__typename;
            }
            if ((i & 2) != 0) {
                contactFragment = contact.contactFragment;
            }
            return contact.copy(str, contactFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/UpdateContactMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateContactMutation($input: UpdateContactInput!) { updateContact(input: $input) { isSuccessful contact { __typename ...ContactFragment } } }  fragment ContactNameFragment on CustomerName { __typename ... on PersonName { givenName surname middleName fullName } ... on BusinessName { businessName } }  fragment ContactPhoneNumberFragment on Phone { countryCode nationalNumber }  fragment ContactAddressFragment on ContactAddress { address { addressLine1 addressLine2 adminArea1 adminArea2 postalCode countryCode } type recipientName { __typename ...ContactNameFragment } }  fragment ContactFragment on Contact { id accountId type name { __typename ...ContactNameFragment } ownerName { __typename ...ContactNameFragment } emails phoneNumbers { __typename ...ContactPhoneNumberFragment } profilePhotoUrl secondaryAddresses { __typename ...ContactAddressFragment } relationship { isFavorited } description }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateContactInput updateContactInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateContactMutation(input=");
        sb.append(updateContactInput);
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
        return (other instanceof com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation) other).input);
    }

    public final com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateContactInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateContactInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation copy$default(com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation updateContactMutation, com.paypal.oslo.api.graphql.schema.type.UpdateContactInput updateContactInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateContactInput = updateContactMutation.input;
        }
        return updateContactMutation.copy(updateContactInput);
    }
}

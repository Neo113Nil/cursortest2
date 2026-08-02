package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u001e\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u001e\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ¢\u0001\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0016R(\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0016R(\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b-\u0010\u0016R(\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b.\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b/\u0010\u0016R\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateContactInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CustomerNameInput;", "name", "", "emails", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "phoneNumbers", "Lcom/paypal/oslo/api/graphql/schema/type/ContactAddressInput;", "addresses", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "favorite", "Lcom/paypal/oslo/api/graphql/schema/type/ContactType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "networkType", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/ContactType;Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/api/graphql/schema/type/ContactType;", "component8", "()Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/ContactType;Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;)Lcom/paypal/oslo/api/graphql/schema/type/CreateContactInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getName", "getEmails", "getPhoneNumbers", "getAddresses", "getDescription", "getFavorite", "Lcom/paypal/oslo/api/graphql/schema/type/ContactType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "getNetworkType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateContactInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ContactAddressInput>> addresses;
    private final com.apollographql.apollo.api.Optional<java.lang.String> description;
    private final com.apollographql.apollo.api.Optional<java.util.List<java.lang.Object>> emails;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> favorite;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> name;
    private final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType networkType;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.PhoneInput>> phoneNumbers;
    private final com.paypal.oslo.api.graphql.schema.type.ContactType type;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateContactInput(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends java.lang.Object>> optional2, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.PhoneInput>> optional3, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.ContactAddressInput>> optional4, com.apollographql.apollo.api.Optional<java.lang.String> optional5, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional6, com.paypal.oslo.api.graphql.schema.type.ContactType contactType, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactNetworkType, "");
        this.name = optional;
        this.emails = optional2;
        this.phoneNumbers = optional3;
        this.addresses = optional4;
        this.description = optional5;
        this.favorite = optional6;
        this.type = contactType;
        this.networkType = contactNetworkType;
    }

    public /* synthetic */ CreateContactInput(com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, com.paypal.oslo.api.graphql.schema.type.ContactType contactType, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, contactType, contactNetworkType);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> getName() {
        return this.name;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.Object>> getEmails() {
        return this.emails;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.PhoneInput>> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ContactAddressInput>> getAddresses() {
        return this.addresses;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getDescription() {
        return this.description;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getFavorite() {
        return this.favorite;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContactType getType() {
        return this.type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType getNetworkType() {
        return this.networkType;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> optional = this.name;
        com.apollographql.apollo.api.Optional<java.util.List<java.lang.Object>> optional2 = this.emails;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.PhoneInput>> optional3 = this.phoneNumbers;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ContactAddressInput>> optional4 = this.addresses;
        com.apollographql.apollo.api.Optional<java.lang.String> optional5 = this.description;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional6 = this.favorite;
        com.paypal.oslo.api.graphql.schema.type.ContactType contactType = this.type;
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType = this.networkType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateContactInput(name=");
        sb.append(optional);
        sb.append(", emails=");
        sb.append(optional2);
        sb.append(", phoneNumbers=");
        sb.append(optional3);
        sb.append(", addresses=");
        sb.append(optional4);
        sb.append(", description=");
        sb.append(optional5);
        sb.append(", favorite=");
        sb.append(optional6);
        sb.append(", type=");
        sb.append(contactType);
        sb.append(", networkType=");
        sb.append(contactNetworkType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((this.name.hashCode() * 31) + this.emails.hashCode()) * 31) + this.phoneNumbers.hashCode()) * 31) + this.addresses.hashCode()) * 31) + this.description.hashCode()) * 31) + this.favorite.hashCode()) * 31) + this.type.hashCode()) * 31) + this.networkType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreateContactInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateContactInput createContactInput = (com.paypal.oslo.api.graphql.schema.type.CreateContactInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, createContactInput.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.emails, createContactInput.emails) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumbers, createContactInput.phoneNumbers) && kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, createContactInput.addresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, createContactInput.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.favorite, createContactInput.favorite) && this.type == createContactInput.type && this.networkType == createContactInput.networkType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateContactInput copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> name2, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends java.lang.Object>> emails, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.PhoneInput>> phoneNumbers, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.ContactAddressInput>> addresses, com.apollographql.apollo.api.Optional<java.lang.String> description, com.apollographql.apollo.api.Optional<java.lang.Boolean> favorite, com.paypal.oslo.api.graphql.schema.type.ContactType type, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumbers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(favorite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateContactInput(name2, emails, phoneNumbers, addresses, description, favorite, type, networkType);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType getNetworkType() {
        return this.networkType;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ContactType getType() {
        return this.type;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component6() {
        return this.favorite;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component5() {
        return this.description;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ContactAddressInput>> component4() {
        return this.addresses;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.PhoneInput>> component3() {
        return this.phoneNumbers;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.Object>> component2() {
        return this.emails;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CustomerNameInput> component1() {
        return this.name;
    }
}

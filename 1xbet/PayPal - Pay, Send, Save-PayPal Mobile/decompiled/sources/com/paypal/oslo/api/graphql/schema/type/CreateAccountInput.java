package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010!J\u0018\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010!J\u0018\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bHÆ\u0003¢\u0006\u0004\b%\u0010!J¢\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u00101\u001a\u0004\b2\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001fR(\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010!R\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b=\u0010!R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b>\u0010!R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b?\u0010!R\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b@\u0010!"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountInput;", "", "signupCountryCode", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationPersonalInfoInput;", "personalInfo", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationContactInfoInput;", "contactInfo", "Lcom/paypal/oslo/api/graphql/schema/type/AddressReferenceInput;", "address", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationCredentialsInput;", "credentials", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentInput;", "identityDocuments", "", "marketingOptIn", "subjectAccessToken", "oneTapToken", "passkeyEnrolled", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationPersonalInfoInput;Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationContactInfoInput;Lcom/paypal/oslo/api/graphql/schema/type/AddressReferenceInput;Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationCredentialsInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationPersonalInfoInput;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationContactInfoInput;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressReferenceInput;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationCredentialsInput;", "component6", "()Lcom/apollographql/apollo/api/Optional;", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationPersonalInfoInput;Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationContactInfoInput;Lcom/paypal/oslo/api/graphql/schema/type/AddressReferenceInput;Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationCredentialsInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getSignupCountryCode", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationPersonalInfoInput;", "getPersonalInfo", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationContactInfoInput;", "getContactInfo", "Lcom/paypal/oslo/api/graphql/schema/type/AddressReferenceInput;", "getAddress", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCreationCredentialsInput;", "getCredentials", "Lcom/apollographql/apollo/api/Optional;", "getIdentityDocuments", "getMarketingOptIn", "getSubjectAccessToken", "getOneTapToken", "getPasskeyEnrolled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateAccountInput {
    private final com.paypal.oslo.api.graphql.schema.type.AddressReferenceInput address;
    private final com.paypal.oslo.api.graphql.schema.type.AccountCreationContactInfoInput contactInfo;
    private final com.paypal.oslo.api.graphql.schema.type.AccountCreationCredentialsInput credentials;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentInput>> identityDocuments;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> marketingOptIn;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> oneTapToken;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> passkeyEnrolled;
    private final com.paypal.oslo.api.graphql.schema.type.AccountCreationPersonalInfoInput personalInfo;
    private final java.lang.Object signupCountryCode;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> subjectAccessToken;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateAccountInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.AccountCreationPersonalInfoInput accountCreationPersonalInfoInput, com.paypal.oslo.api.graphql.schema.type.AccountCreationContactInfoInput accountCreationContactInfoInput, com.paypal.oslo.api.graphql.schema.type.AddressReferenceInput addressReferenceInput, com.paypal.oslo.api.graphql.schema.type.AccountCreationCredentialsInput accountCreationCredentialsInput, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentInput>> optional, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional2, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional3, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional4, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationPersonalInfoInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationContactInfoInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressReferenceInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCreationCredentialsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional5, "");
        this.signupCountryCode = obj;
        this.personalInfo = accountCreationPersonalInfoInput;
        this.contactInfo = accountCreationContactInfoInput;
        this.address = addressReferenceInput;
        this.credentials = accountCreationCredentialsInput;
        this.identityDocuments = optional;
        this.marketingOptIn = optional2;
        this.subjectAccessToken = optional3;
        this.oneTapToken = optional4;
        this.passkeyEnrolled = optional5;
    }

    public final java.lang.Object getSignupCountryCode() {
        return this.signupCountryCode;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AccountCreationPersonalInfoInput getPersonalInfo() {
        return this.personalInfo;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AccountCreationContactInfoInput getContactInfo() {
        return this.contactInfo;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddressReferenceInput getAddress() {
        return this.address;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AccountCreationCredentialsInput getCredentials() {
        return this.credentials;
    }

    public /* synthetic */ CreateAccountInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.AccountCreationPersonalInfoInput accountCreationPersonalInfoInput, com.paypal.oslo.api.graphql.schema.type.AccountCreationContactInfoInput accountCreationContactInfoInput, com.paypal.oslo.api.graphql.schema.type.AddressReferenceInput addressReferenceInput, com.paypal.oslo.api.graphql.schema.type.AccountCreationCredentialsInput accountCreationCredentialsInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, accountCreationPersonalInfoInput, accountCreationContactInfoInput, addressReferenceInput, accountCreationCredentialsInput, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3, (i & 256) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 512) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentInput>> getIdentityDocuments() {
        return this.identityDocuments;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getMarketingOptIn() {
        return this.marketingOptIn;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getSubjectAccessToken() {
        return this.subjectAccessToken;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getOneTapToken() {
        return this.oneTapToken;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getPasskeyEnrolled() {
        return this.passkeyEnrolled;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.signupCountryCode;
        com.paypal.oslo.api.graphql.schema.type.AccountCreationPersonalInfoInput accountCreationPersonalInfoInput = this.personalInfo;
        com.paypal.oslo.api.graphql.schema.type.AccountCreationContactInfoInput accountCreationContactInfoInput = this.contactInfo;
        com.paypal.oslo.api.graphql.schema.type.AddressReferenceInput addressReferenceInput = this.address;
        com.paypal.oslo.api.graphql.schema.type.AccountCreationCredentialsInput accountCreationCredentialsInput = this.credentials;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentInput>> optional = this.identityDocuments;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional2 = this.marketingOptIn;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional3 = this.subjectAccessToken;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional4 = this.oneTapToken;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional5 = this.passkeyEnrolled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateAccountInput(signupCountryCode=");
        sb.append(obj);
        sb.append(", personalInfo=");
        sb.append(accountCreationPersonalInfoInput);
        sb.append(", contactInfo=");
        sb.append(accountCreationContactInfoInput);
        sb.append(", address=");
        sb.append(addressReferenceInput);
        sb.append(", credentials=");
        sb.append(accountCreationCredentialsInput);
        sb.append(", identityDocuments=");
        sb.append(optional);
        sb.append(", marketingOptIn=");
        sb.append(optional2);
        sb.append(", subjectAccessToken=");
        sb.append(optional3);
        sb.append(", oneTapToken=");
        sb.append(optional4);
        sb.append(", passkeyEnrolled=");
        sb.append(optional5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((this.signupCountryCode.hashCode() * 31) + this.personalInfo.hashCode()) * 31) + this.contactInfo.hashCode()) * 31) + this.address.hashCode()) * 31) + this.credentials.hashCode()) * 31) + this.identityDocuments.hashCode()) * 31) + this.marketingOptIn.hashCode()) * 31) + this.subjectAccessToken.hashCode()) * 31) + this.oneTapToken.hashCode()) * 31) + this.passkeyEnrolled.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreateAccountInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateAccountInput createAccountInput = (com.paypal.oslo.api.graphql.schema.type.CreateAccountInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.signupCountryCode, createAccountInput.signupCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.personalInfo, createAccountInput.personalInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactInfo, createAccountInput.contactInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, createAccountInput.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentials, createAccountInput.credentials) && kotlin.jvm.internal.Intrinsics.areEqual(this.identityDocuments, createAccountInput.identityDocuments) && kotlin.jvm.internal.Intrinsics.areEqual(this.marketingOptIn, createAccountInput.marketingOptIn) && kotlin.jvm.internal.Intrinsics.areEqual(this.subjectAccessToken, createAccountInput.subjectAccessToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.oneTapToken, createAccountInput.oneTapToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyEnrolled, createAccountInput.passkeyEnrolled);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateAccountInput copy(java.lang.Object signupCountryCode, com.paypal.oslo.api.graphql.schema.type.AccountCreationPersonalInfoInput personalInfo, com.paypal.oslo.api.graphql.schema.type.AccountCreationContactInfoInput contactInfo, com.paypal.oslo.api.graphql.schema.type.AddressReferenceInput address, com.paypal.oslo.api.graphql.schema.type.AccountCreationCredentialsInput credentials, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentInput>> identityDocuments, com.apollographql.apollo.api.Optional<java.lang.Boolean> marketingOptIn, com.apollographql.apollo.api.Optional<? extends java.lang.Object> subjectAccessToken, com.apollographql.apollo.api.Optional<? extends java.lang.Object> oneTapToken, com.apollographql.apollo.api.Optional<java.lang.Boolean> passkeyEnrolled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupCountryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentials, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityDocuments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marketingOptIn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subjectAccessToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneTapToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyEnrolled, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateAccountInput(signupCountryCode, personalInfo, contactInfo, address, credentials, identityDocuments, marketingOptIn, subjectAccessToken, oneTapToken, passkeyEnrolled);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component9() {
        return this.oneTapToken;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component8() {
        return this.subjectAccessToken;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component7() {
        return this.marketingOptIn;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentInput>> component6() {
        return this.identityDocuments;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AccountCreationCredentialsInput getCredentials() {
        return this.credentials;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddressReferenceInput getAddress() {
        return this.address;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AccountCreationContactInfoInput getContactInfo() {
        return this.contactInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AccountCreationPersonalInfoInput getPersonalInfo() {
        return this.personalInfo;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component10() {
        return this.passkeyEnrolled;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getSignupCountryCode() {
        return this.signupCountryCode;
    }
}

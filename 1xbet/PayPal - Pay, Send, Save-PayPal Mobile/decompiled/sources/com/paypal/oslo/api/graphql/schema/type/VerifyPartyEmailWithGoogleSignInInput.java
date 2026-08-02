package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VerifyPartyEmailWithGoogleSignInInput;", "", "", "id", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "idToken", "", "primary", "Lcom/apollographql/apollo/api/Optional;", "replaceId", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZLcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Z", "component5", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZLcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/VerifyPartyEmailWithGoogleSignInInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getEmailAddress", "getIdToken", "Z", "getPrimary", "Lcom/apollographql/apollo/api/Optional;", "getReplaceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VerifyPartyEmailWithGoogleSignInInput {
    private final java.lang.Object emailAddress;
    private final java.lang.String id;
    private final java.lang.String idToken;
    private final boolean primary;
    private final com.apollographql.apollo.api.Optional<java.lang.String> replaceId;

    public VerifyPartyEmailWithGoogleSignInInput(java.lang.String str, java.lang.Object obj, java.lang.String str2, boolean z, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.id = str;
        this.emailAddress = obj;
        this.idToken = str2;
        this.primary = z;
        this.replaceId = optional;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.Object getEmailAddress() {
        return this.emailAddress;
    }

    public final java.lang.String getIdToken() {
        return this.idToken;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public /* synthetic */ VerifyPartyEmailWithGoogleSignInInput(java.lang.String str, java.lang.Object obj, java.lang.String str2, boolean z, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, str2, z, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getReplaceId() {
        return this.replaceId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.Object obj = this.emailAddress;
        java.lang.String str2 = this.idToken;
        boolean z = this.primary;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.replaceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerifyPartyEmailWithGoogleSignInInput(id=");
        sb.append(str);
        sb.append(", emailAddress=");
        sb.append(obj);
        sb.append(", idToken=");
        sb.append(str2);
        sb.append(", primary=");
        sb.append(z);
        sb.append(", replaceId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.emailAddress.hashCode()) * 31) + this.idToken.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary)) * 31) + this.replaceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithGoogleSignInInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithGoogleSignInInput verifyPartyEmailWithGoogleSignInInput = (com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithGoogleSignInInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, verifyPartyEmailWithGoogleSignInInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, verifyPartyEmailWithGoogleSignInInput.emailAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.idToken, verifyPartyEmailWithGoogleSignInInput.idToken) && this.primary == verifyPartyEmailWithGoogleSignInInput.primary && kotlin.jvm.internal.Intrinsics.areEqual(this.replaceId, verifyPartyEmailWithGoogleSignInInput.replaceId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithGoogleSignInInput copy(java.lang.String id, java.lang.Object emailAddress, java.lang.String idToken, boolean primary, com.apollographql.apollo.api.Optional<java.lang.String> replaceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceId, "");
        return new com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithGoogleSignInInput(id, emailAddress, idToken, primary, replaceId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component5() {
        return this.replaceId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIdToken() {
        return this.idToken;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithGoogleSignInInput copy$default(com.paypal.oslo.api.graphql.schema.type.VerifyPartyEmailWithGoogleSignInInput verifyPartyEmailWithGoogleSignInInput, java.lang.String str, java.lang.Object obj, java.lang.String str2, boolean z, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = verifyPartyEmailWithGoogleSignInInput.id;
        }
        if ((i & 2) != 0) {
            obj = verifyPartyEmailWithGoogleSignInInput.emailAddress;
        }
        java.lang.Object obj3 = obj;
        if ((i & 4) != 0) {
            str2 = verifyPartyEmailWithGoogleSignInInput.idToken;
        }
        java.lang.String str3 = str2;
        if ((i & 8) != 0) {
            z = verifyPartyEmailWithGoogleSignInInput.primary;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            optional = verifyPartyEmailWithGoogleSignInInput.replaceId;
        }
        return verifyPartyEmailWithGoogleSignInInput.copy(str, obj3, str3, z2, optional);
    }
}

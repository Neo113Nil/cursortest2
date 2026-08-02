package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionAuthorizedUserInput;", "", "birthDate", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "Lcom/apollographql/apollo/api/Optional;", "title", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionAuthorizedUserInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBirthDate", "Ljava/lang/String;", "getGivenName", "getSurname", "Lcom/apollographql/apollo/api/Optional;", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditAcquisitionAuthorizedUserInput {
    private final java.lang.Object birthDate;
    private final java.lang.String givenName;
    private final java.lang.String surname;
    private final com.apollographql.apollo.api.Optional<java.lang.String> title;

    public RevolvingCreditAcquisitionAuthorizedUserInput(java.lang.Object obj, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.birthDate = obj;
        this.givenName = str;
        this.surname = str2;
        this.title = optional;
    }

    public final java.lang.Object getBirthDate() {
        return this.birthDate;
    }

    public final java.lang.String getGivenName() {
        return this.givenName;
    }

    public final java.lang.String getSurname() {
        return this.surname;
    }

    public /* synthetic */ RevolvingCreditAcquisitionAuthorizedUserInput(java.lang.Object obj, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, str2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getTitle() {
        return this.title;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.birthDate;
        java.lang.String str = this.givenName;
        java.lang.String str2 = this.surname;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.title;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditAcquisitionAuthorizedUserInput(birthDate=");
        sb.append(obj);
        sb.append(", givenName=");
        sb.append(str);
        sb.append(", surname=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.birthDate.hashCode() * 31) + this.givenName.hashCode()) * 31) + this.surname.hashCode()) * 31) + this.title.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionAuthorizedUserInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionAuthorizedUserInput revolvingCreditAcquisitionAuthorizedUserInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionAuthorizedUserInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.birthDate, revolvingCreditAcquisitionAuthorizedUserInput.birthDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, revolvingCreditAcquisitionAuthorizedUserInput.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, revolvingCreditAcquisitionAuthorizedUserInput.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, revolvingCreditAcquisitionAuthorizedUserInput.title);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionAuthorizedUserInput copy(java.lang.Object birthDate, java.lang.String givenName, java.lang.String surname, com.apollographql.apollo.api.Optional<java.lang.String> title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(birthDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(givenName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surname, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionAuthorizedUserInput(birthDate, givenName, surname, title);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.title;
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
    public final java.lang.Object getBirthDate() {
        return this.birthDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionAuthorizedUserInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionAuthorizedUserInput revolvingCreditAcquisitionAuthorizedUserInput, java.lang.Object obj, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = revolvingCreditAcquisitionAuthorizedUserInput.birthDate;
        }
        if ((i & 2) != 0) {
            str = revolvingCreditAcquisitionAuthorizedUserInput.givenName;
        }
        if ((i & 4) != 0) {
            str2 = revolvingCreditAcquisitionAuthorizedUserInput.surname;
        }
        if ((i & 8) != 0) {
            optional = revolvingCreditAcquisitionAuthorizedUserInput.title;
        }
        return revolvingCreditAcquisitionAuthorizedUserInput.copy(obj, str, str2, optional);
    }
}

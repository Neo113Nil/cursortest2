package com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/UserName;", "", "", "fullName", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/UserName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFullName", "getGivenName", "getSurname"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UserName {
    public static final int $stable = 0;
    private final java.lang.String fullName;
    private final java.lang.String givenName;
    private final java.lang.String surname;

    public UserName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.fullName = str;
        this.givenName = str2;
        this.surname = str3;
    }

    public /* synthetic */ UserName(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserName(fullName=");
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
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName userName = (com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, userName.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, userName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, userName.surname);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName copy(java.lang.String fullName, java.lang.String givenName, java.lang.String surname) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName(fullName, givenName, surname);
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

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName userName, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userName.fullName;
        }
        if ((i & 2) != 0) {
            str2 = userName.givenName;
        }
        if ((i & 4) != 0) {
            str3 = userName.surname;
        }
        return userName.copy(str, str2, str3);
    }

    public UserName() {
        this(null, null, null, 7, null);
    }
}

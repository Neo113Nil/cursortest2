package com.paypal.oslo.feature.controlcenter.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jz\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b+\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010\u0010R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "", "", "id", "fullName", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "surname", "secondSurname", "accountCountryCode", "profilePhotoUrl", "Lcom/paypal/oslo/feature/controlcenter/domain/model/AccountType;", "accountType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/controlcenter/domain/model/AccountType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/controlcenter/domain/model/AccountType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/controlcenter/domain/model/AccountType;)Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getFullName", "getGivenName", "getMiddleName", "getSurname", "getSecondSurname", "getAccountCountryCode", "getProfilePhotoUrl", "Lcom/paypal/oslo/feature/controlcenter/domain/model/AccountType;", "getAccountType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserProfile {
    public static final int $stable = 0;
    private final java.lang.String accountCountryCode;
    private final com.paypal.oslo.feature.controlcenter.domain.model.AccountType accountType;
    private final java.lang.String fullName;
    private final java.lang.String givenName;
    private final java.lang.String id;
    private final java.lang.String middleName;
    private final java.lang.String profilePhotoUrl;
    private final java.lang.String secondSurname;
    private final java.lang.String surname;

    public UserProfile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.paypal.oslo.feature.controlcenter.domain.model.AccountType accountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
        this.id = str;
        this.fullName = str2;
        this.givenName = str3;
        this.middleName = str4;
        this.surname = str5;
        this.secondSurname = str6;
        this.accountCountryCode = str7;
        this.profilePhotoUrl = str8;
        this.accountType = accountType;
    }

    public /* synthetic */ UserProfile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.paypal.oslo.feature.controlcenter.domain.model.AccountType accountType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, accountType);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getFullName() {
        return this.fullName;
    }

    public final java.lang.String getGivenName() {
        return this.givenName;
    }

    public final java.lang.String getMiddleName() {
        return this.middleName;
    }

    public final java.lang.String getSurname() {
        return this.surname;
    }

    public final java.lang.String getSecondSurname() {
        return this.secondSurname;
    }

    public final java.lang.String getAccountCountryCode() {
        return this.accountCountryCode;
    }

    public final java.lang.String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    public final com.paypal.oslo.feature.controlcenter.domain.model.AccountType getAccountType() {
        return this.accountType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.fullName;
        java.lang.String str3 = this.givenName;
        java.lang.String str4 = this.middleName;
        java.lang.String str5 = this.surname;
        java.lang.String str6 = this.secondSurname;
        java.lang.String str7 = this.accountCountryCode;
        java.lang.String str8 = this.profilePhotoUrl;
        com.paypal.oslo.feature.controlcenter.domain.model.AccountType accountType = this.accountType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserProfile(id=");
        sb.append(str);
        sb.append(", fullName=");
        sb.append(str2);
        sb.append(", givenName=");
        sb.append(str3);
        sb.append(", middleName=");
        sb.append(str4);
        sb.append(", surname=");
        sb.append(str5);
        sb.append(", secondSurname=");
        sb.append(str6);
        sb.append(", accountCountryCode=");
        sb.append(str7);
        sb.append(", profilePhotoUrl=");
        sb.append(str8);
        sb.append(", accountType=");
        sb.append(accountType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.fullName;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.givenName;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.middleName;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.surname;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.secondSurname;
        int hashCode6 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.accountCountryCode;
        int hashCode7 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.profilePhotoUrl;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + this.accountType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.controlcenter.domain.model.UserProfile)) {
            return false;
        }
        com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile = (com.paypal.oslo.feature.controlcenter.domain.model.UserProfile) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, userProfile.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, userProfile.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, userProfile.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, userProfile.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, userProfile.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondSurname, userProfile.secondSurname) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountCountryCode, userProfile.accountCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, userProfile.profilePhotoUrl) && this.accountType == userProfile.accountType;
    }

    public final com.paypal.oslo.feature.controlcenter.domain.model.UserProfile copy(java.lang.String id, java.lang.String fullName, java.lang.String givenName, java.lang.String middleName, java.lang.String surname, java.lang.String secondSurname, java.lang.String accountCountryCode, java.lang.String profilePhotoUrl, com.paypal.oslo.feature.controlcenter.domain.model.AccountType accountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
        return new com.paypal.oslo.feature.controlcenter.domain.model.UserProfile(id, fullName, givenName, middleName, surname, secondSurname, accountCountryCode, profilePhotoUrl, accountType);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.controlcenter.domain.model.AccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getAccountCountryCode() {
        return this.accountCountryCode;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSecondSurname() {
        return this.secondSurname;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSurname() {
        return this.surname;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMiddleName() {
        return this.middleName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getGivenName() {
        return this.givenName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFullName() {
        return this.fullName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}

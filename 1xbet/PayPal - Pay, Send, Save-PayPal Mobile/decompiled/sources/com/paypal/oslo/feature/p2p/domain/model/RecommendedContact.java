package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ¢\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b4\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b5\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b\u000e\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b\u000f\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b\u0010\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/RecommendedContact;", "", "", "id", "accountId", "displayName", "firstName", "lastName", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "businessOrthography", "profilePhotoUrl", "", "isPersonal", "isFavorite", "isBlocked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/paypal/oslo/feature/p2p/domain/model/RecommendedContact;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAccountId", "getDisplayName", "getFirstName", "getLastName", "getPrefix", "getMiddleName", "getSuffix", "getBusinessOrthography", "getProfilePhotoUrl", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RecommendedContact {
    public static final int $stable = 0;
    private final java.lang.String accountId;
    private final java.lang.String businessOrthography;
    private final java.lang.String displayName;
    private final java.lang.String firstName;
    private final java.lang.String id;
    private final boolean isBlocked;
    private final boolean isFavorite;
    private final boolean isPersonal;
    private final java.lang.String lastName;
    private final java.lang.String middleName;
    private final java.lang.String prefix;
    private final java.lang.String profilePhotoUrl;
    private final java.lang.String suffix;

    public RecommendedContact(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.accountId = str2;
        this.displayName = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.prefix = str6;
        this.middleName = str7;
        this.suffix = str8;
        this.businessOrthography = str9;
        this.profilePhotoUrl = str10;
        this.isPersonal = z;
        this.isFavorite = z2;
        this.isBlocked = z3;
    }

    public /* synthetic */ RecommendedContact(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, str10, z, z2, z3);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final java.lang.String getLastName() {
        return this.lastName;
    }

    public final java.lang.String getPrefix() {
        return this.prefix;
    }

    public final java.lang.String getMiddleName() {
        return this.middleName;
    }

    public final java.lang.String getSuffix() {
        return this.suffix;
    }

    public final java.lang.String getBusinessOrthography() {
        return this.businessOrthography;
    }

    public final java.lang.String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    public final boolean isPersonal() {
        return this.isPersonal;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.accountId;
        java.lang.String str3 = this.displayName;
        java.lang.String str4 = this.firstName;
        java.lang.String str5 = this.lastName;
        java.lang.String str6 = this.prefix;
        java.lang.String str7 = this.middleName;
        java.lang.String str8 = this.suffix;
        java.lang.String str9 = this.businessOrthography;
        java.lang.String str10 = this.profilePhotoUrl;
        boolean z = this.isPersonal;
        boolean z2 = this.isFavorite;
        boolean z3 = this.isBlocked;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecommendedContact(id=");
        sb.append(str);
        sb.append(", accountId=");
        sb.append(str2);
        sb.append(", displayName=");
        sb.append(str3);
        sb.append(", firstName=");
        sb.append(str4);
        sb.append(", lastName=");
        sb.append(str5);
        sb.append(", prefix=");
        sb.append(str6);
        sb.append(", middleName=");
        sb.append(str7);
        sb.append(", suffix=");
        sb.append(str8);
        sb.append(", businessOrthography=");
        sb.append(str9);
        sb.append(", profilePhotoUrl=");
        sb.append(str10);
        sb.append(", isPersonal=");
        sb.append(z);
        sb.append(", isFavorite=");
        sb.append(z2);
        sb.append(", isBlocked=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.accountId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.displayName.hashCode();
        java.lang.String str2 = this.firstName;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.lastName;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.prefix;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.middleName;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.suffix;
        int hashCode8 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.businessOrthography;
        int hashCode9 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.profilePhotoUrl;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isPersonal)) * 31) + java.lang.Boolean.hashCode(this.isFavorite)) * 31) + java.lang.Boolean.hashCode(this.isBlocked);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.RecommendedContact)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.RecommendedContact recommendedContact = (com.paypal.oslo.feature.p2p.domain.model.RecommendedContact) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, recommendedContact.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, recommendedContact.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, recommendedContact.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, recommendedContact.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, recommendedContact.lastName) && kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, recommendedContact.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, recommendedContact.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, recommendedContact.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessOrthography, recommendedContact.businessOrthography) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, recommendedContact.profilePhotoUrl) && this.isPersonal == recommendedContact.isPersonal && this.isFavorite == recommendedContact.isFavorite && this.isBlocked == recommendedContact.isBlocked;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.RecommendedContact copy(java.lang.String id, java.lang.String accountId, java.lang.String displayName, java.lang.String firstName, java.lang.String lastName, java.lang.String prefix, java.lang.String middleName, java.lang.String suffix, java.lang.String businessOrthography, java.lang.String profilePhotoUrl, boolean isPersonal, boolean isFavorite, boolean isBlocked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        return new com.paypal.oslo.feature.p2p.domain.model.RecommendedContact(id, accountId, displayName, firstName, lastName, prefix, middleName, suffix, businessOrthography, profilePhotoUrl, isPersonal, isFavorite, isBlocked);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getBusinessOrthography() {
        return this.businessOrthography;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getSuffix() {
        return this.suffix;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getMiddleName() {
        return this.middleName;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPrefix() {
        return this.prefix;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsPersonal() {
        return this.isPersonal;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}

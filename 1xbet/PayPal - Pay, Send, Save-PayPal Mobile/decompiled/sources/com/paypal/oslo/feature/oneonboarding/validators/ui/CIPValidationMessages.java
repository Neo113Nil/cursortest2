package com.paypal.oslo.feature.oneonboarding.validators.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J¦\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b7\u0010\u0015R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b8\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b9\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b:\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b;\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b<\u0010\u0015R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b=\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationMessages;", "", "", "dateOfBirthRequired", "dateOfBirthFormat", "dateOfBirthFuture", "dateOfBirthMinAge", "dateOfBirthMaxAge", "taxpayerIdRequiredSsn", "taxpayerIdRequiredItin", "taxpayerIdInvalidSsn", "taxpayerIdInvalidItin", "taxpayerIdLengthSsn", "taxpayerIdLengthItin", "taxpayerIdLengthSsn4", "taxpayerIdLengthItin4", "taxpayerIdInvalidSsnCfs", "addressRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationMessages;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDateOfBirthRequired", "getDateOfBirthFormat", "getDateOfBirthFuture", "getDateOfBirthMinAge", "getDateOfBirthMaxAge", "getTaxpayerIdRequiredSsn", "getTaxpayerIdRequiredItin", "getTaxpayerIdInvalidSsn", "getTaxpayerIdInvalidItin", "getTaxpayerIdLengthSsn", "getTaxpayerIdLengthItin", "getTaxpayerIdLengthSsn4", "getTaxpayerIdLengthItin4", "getTaxpayerIdInvalidSsnCfs", "getAddressRequired"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CIPValidationMessages {
    public static final int $stable = 0;
    private final java.lang.String addressRequired;
    private final java.lang.String dateOfBirthFormat;
    private final java.lang.String dateOfBirthFuture;
    private final java.lang.String dateOfBirthMaxAge;
    private final java.lang.String dateOfBirthMinAge;
    private final java.lang.String dateOfBirthRequired;
    private final java.lang.String taxpayerIdInvalidItin;
    private final java.lang.String taxpayerIdInvalidSsn;
    private final java.lang.String taxpayerIdInvalidSsnCfs;
    private final java.lang.String taxpayerIdLengthItin;
    private final java.lang.String taxpayerIdLengthItin4;
    private final java.lang.String taxpayerIdLengthSsn;
    private final java.lang.String taxpayerIdLengthSsn4;
    private final java.lang.String taxpayerIdRequiredItin;
    private final java.lang.String taxpayerIdRequiredSsn;

    public CIPValidationMessages(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str14, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "");
        this.dateOfBirthRequired = str;
        this.dateOfBirthFormat = str2;
        this.dateOfBirthFuture = str3;
        this.dateOfBirthMinAge = str4;
        this.dateOfBirthMaxAge = str5;
        this.taxpayerIdRequiredSsn = str6;
        this.taxpayerIdRequiredItin = str7;
        this.taxpayerIdInvalidSsn = str8;
        this.taxpayerIdInvalidItin = str9;
        this.taxpayerIdLengthSsn = str10;
        this.taxpayerIdLengthItin = str11;
        this.taxpayerIdLengthSsn4 = str12;
        this.taxpayerIdLengthItin4 = str13;
        this.taxpayerIdInvalidSsnCfs = str14;
        this.addressRequired = str15;
    }

    public final java.lang.String getDateOfBirthRequired() {
        return this.dateOfBirthRequired;
    }

    public final java.lang.String getDateOfBirthFormat() {
        return this.dateOfBirthFormat;
    }

    public final java.lang.String getDateOfBirthFuture() {
        return this.dateOfBirthFuture;
    }

    public final java.lang.String getDateOfBirthMinAge() {
        return this.dateOfBirthMinAge;
    }

    public final java.lang.String getDateOfBirthMaxAge() {
        return this.dateOfBirthMaxAge;
    }

    public final java.lang.String getTaxpayerIdRequiredSsn() {
        return this.taxpayerIdRequiredSsn;
    }

    public final java.lang.String getTaxpayerIdRequiredItin() {
        return this.taxpayerIdRequiredItin;
    }

    public final java.lang.String getTaxpayerIdInvalidSsn() {
        return this.taxpayerIdInvalidSsn;
    }

    public final java.lang.String getTaxpayerIdInvalidItin() {
        return this.taxpayerIdInvalidItin;
    }

    public final java.lang.String getTaxpayerIdLengthSsn() {
        return this.taxpayerIdLengthSsn;
    }

    public final java.lang.String getTaxpayerIdLengthItin() {
        return this.taxpayerIdLengthItin;
    }

    public final java.lang.String getTaxpayerIdLengthSsn4() {
        return this.taxpayerIdLengthSsn4;
    }

    public final java.lang.String getTaxpayerIdLengthItin4() {
        return this.taxpayerIdLengthItin4;
    }

    public final java.lang.String getTaxpayerIdInvalidSsnCfs() {
        return this.taxpayerIdInvalidSsnCfs;
    }

    public final java.lang.String getAddressRequired() {
        return this.addressRequired;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.dateOfBirthRequired;
        java.lang.String str2 = this.dateOfBirthFormat;
        java.lang.String str3 = this.dateOfBirthFuture;
        java.lang.String str4 = this.dateOfBirthMinAge;
        java.lang.String str5 = this.dateOfBirthMaxAge;
        java.lang.String str6 = this.taxpayerIdRequiredSsn;
        java.lang.String str7 = this.taxpayerIdRequiredItin;
        java.lang.String str8 = this.taxpayerIdInvalidSsn;
        java.lang.String str9 = this.taxpayerIdInvalidItin;
        java.lang.String str10 = this.taxpayerIdLengthSsn;
        java.lang.String str11 = this.taxpayerIdLengthItin;
        java.lang.String str12 = this.taxpayerIdLengthSsn4;
        java.lang.String str13 = this.taxpayerIdLengthItin4;
        java.lang.String str14 = this.taxpayerIdInvalidSsnCfs;
        java.lang.String str15 = this.addressRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CIPValidationMessages(dateOfBirthRequired=");
        sb.append(str);
        sb.append(", dateOfBirthFormat=");
        sb.append(str2);
        sb.append(", dateOfBirthFuture=");
        sb.append(str3);
        sb.append(", dateOfBirthMinAge=");
        sb.append(str4);
        sb.append(", dateOfBirthMaxAge=");
        sb.append(str5);
        sb.append(", taxpayerIdRequiredSsn=");
        sb.append(str6);
        sb.append(", taxpayerIdRequiredItin=");
        sb.append(str7);
        sb.append(", taxpayerIdInvalidSsn=");
        sb.append(str8);
        sb.append(", taxpayerIdInvalidItin=");
        sb.append(str9);
        sb.append(", taxpayerIdLengthSsn=");
        sb.append(str10);
        sb.append(", taxpayerIdLengthItin=");
        sb.append(str11);
        sb.append(", taxpayerIdLengthSsn4=");
        sb.append(str12);
        sb.append(", taxpayerIdLengthItin4=");
        sb.append(str13);
        sb.append(", taxpayerIdInvalidSsnCfs=");
        sb.append(str14);
        sb.append(", addressRequired=");
        sb.append(str15);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.dateOfBirthRequired.hashCode() * 31) + this.dateOfBirthFormat.hashCode()) * 31) + this.dateOfBirthFuture.hashCode()) * 31) + this.dateOfBirthMinAge.hashCode()) * 31) + this.dateOfBirthMaxAge.hashCode()) * 31) + this.taxpayerIdRequiredSsn.hashCode()) * 31) + this.taxpayerIdRequiredItin.hashCode()) * 31) + this.taxpayerIdInvalidSsn.hashCode()) * 31) + this.taxpayerIdInvalidItin.hashCode()) * 31) + this.taxpayerIdLengthSsn.hashCode()) * 31) + this.taxpayerIdLengthItin.hashCode()) * 31) + this.taxpayerIdLengthSsn4.hashCode()) * 31) + this.taxpayerIdLengthItin4.hashCode()) * 31) + this.taxpayerIdInvalidSsnCfs.hashCode()) * 31) + this.addressRequired.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages cIPValidationMessages = (com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirthRequired, cIPValidationMessages.dateOfBirthRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirthFormat, cIPValidationMessages.dateOfBirthFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirthFuture, cIPValidationMessages.dateOfBirthFuture) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirthMinAge, cIPValidationMessages.dateOfBirthMinAge) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirthMaxAge, cIPValidationMessages.dateOfBirthMaxAge) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdRequiredSsn, cIPValidationMessages.taxpayerIdRequiredSsn) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdRequiredItin, cIPValidationMessages.taxpayerIdRequiredItin) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdInvalidSsn, cIPValidationMessages.taxpayerIdInvalidSsn) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdInvalidItin, cIPValidationMessages.taxpayerIdInvalidItin) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdLengthSsn, cIPValidationMessages.taxpayerIdLengthSsn) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdLengthItin, cIPValidationMessages.taxpayerIdLengthItin) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdLengthSsn4, cIPValidationMessages.taxpayerIdLengthSsn4) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdLengthItin4, cIPValidationMessages.taxpayerIdLengthItin4) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdInvalidSsnCfs, cIPValidationMessages.taxpayerIdInvalidSsnCfs) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressRequired, cIPValidationMessages.addressRequired);
    }

    public final com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages copy(java.lang.String dateOfBirthRequired, java.lang.String dateOfBirthFormat, java.lang.String dateOfBirthFuture, java.lang.String dateOfBirthMinAge, java.lang.String dateOfBirthMaxAge, java.lang.String taxpayerIdRequiredSsn, java.lang.String taxpayerIdRequiredItin, java.lang.String taxpayerIdInvalidSsn, java.lang.String taxpayerIdInvalidItin, java.lang.String taxpayerIdLengthSsn, java.lang.String taxpayerIdLengthItin, java.lang.String taxpayerIdLengthSsn4, java.lang.String taxpayerIdLengthItin4, java.lang.String taxpayerIdInvalidSsnCfs, java.lang.String addressRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthRequired, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthFuture, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthMinAge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthMaxAge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdRequiredSsn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdRequiredItin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdInvalidSsn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdInvalidItin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdLengthSsn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdLengthItin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdLengthSsn4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdLengthItin4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdInvalidSsnCfs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressRequired, "");
        return new com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationMessages(dateOfBirthRequired, dateOfBirthFormat, dateOfBirthFuture, dateOfBirthMinAge, dateOfBirthMaxAge, taxpayerIdRequiredSsn, taxpayerIdRequiredItin, taxpayerIdInvalidSsn, taxpayerIdInvalidItin, taxpayerIdLengthSsn, taxpayerIdLengthItin, taxpayerIdLengthSsn4, taxpayerIdLengthItin4, taxpayerIdInvalidSsnCfs, addressRequired);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getTaxpayerIdInvalidItin() {
        return this.taxpayerIdInvalidItin;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getTaxpayerIdInvalidSsn() {
        return this.taxpayerIdInvalidSsn;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getTaxpayerIdRequiredItin() {
        return this.taxpayerIdRequiredItin;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getTaxpayerIdRequiredSsn() {
        return this.taxpayerIdRequiredSsn;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDateOfBirthMaxAge() {
        return this.dateOfBirthMaxAge;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDateOfBirthMinAge() {
        return this.dateOfBirthMinAge;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDateOfBirthFuture() {
        return this.dateOfBirthFuture;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDateOfBirthFormat() {
        return this.dateOfBirthFormat;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getAddressRequired() {
        return this.addressRequired;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getTaxpayerIdInvalidSsnCfs() {
        return this.taxpayerIdInvalidSsnCfs;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getTaxpayerIdLengthItin4() {
        return this.taxpayerIdLengthItin4;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getTaxpayerIdLengthSsn4() {
        return this.taxpayerIdLengthSsn4;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getTaxpayerIdLengthItin() {
        return this.taxpayerIdLengthItin;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getTaxpayerIdLengthSsn() {
        return this.taxpayerIdLengthSsn;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDateOfBirthRequired() {
        return this.dateOfBirthRequired;
    }
}

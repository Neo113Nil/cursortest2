package com.paypal.oslo.feature.oneonboarding.validators.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationResult;", "", "", "isValid", "", "dateOfBirthError", "taxpayerIdError", "addressError", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/validators/ui/CIPValidationResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getDateOfBirthError", "getTaxpayerIdError", "getAddressError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CIPValidationResult {
    public static final int $stable = 0;
    private final java.lang.String addressError;
    private final java.lang.String dateOfBirthError;
    private final boolean isValid;
    private final java.lang.String taxpayerIdError;

    public CIPValidationResult(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.isValid = z;
        this.dateOfBirthError = str;
        this.taxpayerIdError = str2;
        this.addressError = str3;
    }

    public /* synthetic */ CIPValidationResult(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final java.lang.String getDateOfBirthError() {
        return this.dateOfBirthError;
    }

    public final java.lang.String getTaxpayerIdError() {
        return this.taxpayerIdError;
    }

    public final java.lang.String getAddressError() {
        return this.addressError;
    }

    public final java.lang.String toString() {
        boolean z = this.isValid;
        java.lang.String str = this.dateOfBirthError;
        java.lang.String str2 = this.taxpayerIdError;
        java.lang.String str3 = this.addressError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CIPValidationResult(isValid=");
        sb.append(z);
        sb.append(", dateOfBirthError=");
        sb.append(str);
        sb.append(", taxpayerIdError=");
        sb.append(str2);
        sb.append(", addressError=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isValid);
        java.lang.String str = this.dateOfBirthError;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.taxpayerIdError;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.addressError;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationResult)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationResult cIPValidationResult = (com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationResult) other;
        return this.isValid == cIPValidationResult.isValid && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirthError, cIPValidationResult.dateOfBirthError) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxpayerIdError, cIPValidationResult.taxpayerIdError) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressError, cIPValidationResult.addressError);
    }

    public final com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationResult copy(boolean isValid, java.lang.String dateOfBirthError, java.lang.String taxpayerIdError, java.lang.String addressError) {
        return new com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationResult(isValid, dateOfBirthError, taxpayerIdError, addressError);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAddressError() {
        return this.addressError;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTaxpayerIdError() {
        return this.taxpayerIdError;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDateOfBirthError() {
        return this.dateOfBirthError;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationResult copy$default(com.paypal.oslo.feature.oneonboarding.validators.ui.CIPValidationResult cIPValidationResult, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = cIPValidationResult.isValid;
        }
        if ((i & 2) != 0) {
            str = cIPValidationResult.dateOfBirthError;
        }
        if ((i & 4) != 0) {
            str2 = cIPValidationResult.taxpayerIdError;
        }
        if ((i & 8) != 0) {
            str3 = cIPValidationResult.addressError;
        }
        return cIPValidationResult.copy(z, str, str2, str3);
    }
}

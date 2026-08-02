package com.paypal.oslo.downloads.api.validation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "", "", "isValid", "", "errorMessage", "Lcom/paypal/oslo/downloads/api/validation/SecurityLevel;", "securityLevel", "<init>", "(ZLjava/lang/String;Lcom/paypal/oslo/downloads/api/validation/SecurityLevel;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/downloads/api/validation/SecurityLevel;", "copy", "(ZLjava/lang/String;Lcom/paypal/oslo/downloads/api/validation/SecurityLevel;)Lcom/paypal/oslo/downloads/api/validation/ValidationResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getErrorMessage", "Lcom/paypal/oslo/downloads/api/validation/SecurityLevel;", "getSecurityLevel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ValidationResult {
    private final java.lang.String errorMessage;
    private final boolean isValid;
    private final com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel;

    public ValidationResult(boolean z, java.lang.String str, com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityLevel, "");
        this.isValid = z;
        this.errorMessage = str;
        this.securityLevel = securityLevel;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ ValidationResult(boolean z, java.lang.String str, com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? com.paypal.oslo.downloads.api.validation.SecurityLevel.UNKNOWN : securityLevel);
    }

    public final com.paypal.oslo.downloads.api.validation.SecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }

    public final java.lang.String toString() {
        boolean z = this.isValid;
        java.lang.String str = this.errorMessage;
        com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel = this.securityLevel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationResult(isValid=");
        sb.append(z);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append(", securityLevel=");
        sb.append(securityLevel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isValid);
        java.lang.String str = this.errorMessage;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.securityLevel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.downloads.api.validation.ValidationResult)) {
            return false;
        }
        com.paypal.oslo.downloads.api.validation.ValidationResult validationResult = (com.paypal.oslo.downloads.api.validation.ValidationResult) other;
        return this.isValid == validationResult.isValid && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, validationResult.errorMessage) && this.securityLevel == validationResult.securityLevel;
    }

    public final com.paypal.oslo.downloads.api.validation.ValidationResult copy(boolean isValid, java.lang.String errorMessage, com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityLevel, "");
        return new com.paypal.oslo.downloads.api.validation.ValidationResult(isValid, errorMessage, securityLevel);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.downloads.api.validation.SecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public static /* synthetic */ com.paypal.oslo.downloads.api.validation.ValidationResult copy$default(com.paypal.oslo.downloads.api.validation.ValidationResult validationResult, boolean z, java.lang.String str, com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = validationResult.isValid;
        }
        if ((i & 2) != 0) {
            str = validationResult.errorMessage;
        }
        if ((i & 4) != 0) {
            securityLevel = validationResult.securityLevel;
        }
        return validationResult.copy(z, str, securityLevel);
    }
}

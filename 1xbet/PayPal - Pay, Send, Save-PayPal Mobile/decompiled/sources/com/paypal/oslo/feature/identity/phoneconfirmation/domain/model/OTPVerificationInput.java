package com.paypal.oslo.feature.identity.phoneconfirmation.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001e\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\nR\u0011\u0010 \u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0011\u0010!\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationInput;", "", "", "confirmationCode", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;", "phoneContact", "deviceId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfirmationCode", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;", "getPhoneContact", "getDeviceId", "getCountryCode", "countryCode", "getPhoneNumber", "phoneNumber", "isValidOTPFormat", "()Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OTPVerificationInput {
    public static final int $stable = 0;
    private final java.lang.String confirmationCode;
    private final java.lang.String deviceId;
    private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact;

    public OTPVerificationInput(java.lang.String str, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneContact, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.confirmationCode = str;
        this.phoneContact = phoneContact;
        this.deviceId = str2;
    }

    public final java.lang.String getConfirmationCode() {
        return this.confirmationCode;
    }

    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact getPhoneContact() {
        return this.phoneContact;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getCountryCode() {
        return this.phoneContact.getCountryCode();
    }

    public final java.lang.String getPhoneNumber() {
        return this.phoneContact.getNumber();
    }

    public final boolean isValidOTPFormat() {
        if (this.confirmationCode.length() == 6) {
            java.lang.String str = this.confirmationCode;
            for (int i = 0; i < str.length(); i++) {
                if (java.lang.Character.isDigit(str.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.confirmationCode;
        com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact = this.phoneContact;
        java.lang.String str2 = this.deviceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OTPVerificationInput(confirmationCode=");
        sb.append(str);
        sb.append(", phoneContact=");
        sb.append(phoneContact);
        sb.append(", deviceId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.confirmationCode.hashCode() * 31) + this.phoneContact.hashCode()) * 31) + this.deviceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput)) {
            return false;
        }
        com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput oTPVerificationInput = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationCode, oTPVerificationInput.confirmationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneContact, oTPVerificationInput.phoneContact) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, oTPVerificationInput.deviceId);
    }

    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput copy(java.lang.String confirmationCode, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact, java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneContact, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput(confirmationCode, phoneContact, deviceId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact getPhoneContact() {
        return this.phoneContact;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getConfirmationCode() {
        return this.confirmationCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput oTPVerificationInput, java.lang.String str, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = oTPVerificationInput.confirmationCode;
        }
        if ((i & 2) != 0) {
            phoneContact = oTPVerificationInput.phoneContact;
        }
        if ((i & 4) != 0) {
            str2 = oTPVerificationInput.deviceId;
        }
        return oTPVerificationInput.copy(str, phoneContact, str2);
    }
}

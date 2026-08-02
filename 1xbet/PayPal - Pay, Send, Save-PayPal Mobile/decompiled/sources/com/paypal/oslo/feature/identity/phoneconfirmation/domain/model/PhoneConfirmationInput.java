package com.paypal.oslo.feature.identity.phoneconfirmation.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001d\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationInput;", "", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;", "phoneContact", "", "deviceId", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;", "getPhoneContact", "Ljava/lang/String;", "getDeviceId", "getCountryCode", "countryCode", "getPhoneNumber", "phoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhoneConfirmationInput {
    public static final int $stable = 0;
    private final java.lang.String deviceId;
    private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact;

    public PhoneConfirmationInput(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneContact, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.phoneContact = phoneContact;
        this.deviceId = str;
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

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact = this.phoneContact;
        java.lang.String str = this.deviceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneConfirmationInput(phoneContact=");
        sb.append(phoneContact);
        sb.append(", deviceId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.phoneContact.hashCode() * 31) + this.deviceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationInput)) {
            return false;
        }
        com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationInput phoneConfirmationInput = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneContact, phoneConfirmationInput.phoneContact) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, phoneConfirmationInput.deviceId);
    }

    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationInput copy(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact, java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneContact, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationInput(phoneContact, deviceId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact getPhoneContact() {
        return this.phoneContact;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationInput copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationInput phoneConfirmationInput, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            phoneContact = phoneConfirmationInput.phoneContact;
        }
        if ((i & 2) != 0) {
            str = phoneConfirmationInput.deviceId;
        }
        return phoneConfirmationInput.copy(phoneContact, str);
    }
}

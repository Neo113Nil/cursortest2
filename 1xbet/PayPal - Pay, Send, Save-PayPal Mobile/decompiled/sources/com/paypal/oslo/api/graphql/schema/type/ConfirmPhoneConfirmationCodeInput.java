package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ConfirmPhoneConfirmationCodeInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "phoneNumber", "", "deviceId", "confirmationCode", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ConfirmPhoneConfirmationCodeInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "getPhoneNumber", "Ljava/lang/String;", "getDeviceId", "getConfirmationCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConfirmPhoneConfirmationCodeInput {
    private final java.lang.String confirmationCode;
    private final java.lang.String deviceId;
    private final com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneNumber;

    public ConfirmPhoneConfirmationCodeInput(com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.phoneNumber = phoneInput;
        this.deviceId = str;
        this.confirmationCode = str2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PhoneInput getPhoneNumber() {
        return this.phoneNumber;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getConfirmationCode() {
        return this.confirmationCode;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput = this.phoneNumber;
        java.lang.String str = this.deviceId;
        java.lang.String str2 = this.confirmationCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmPhoneConfirmationCodeInput(phoneNumber=");
        sb.append(phoneInput);
        sb.append(", deviceId=");
        sb.append(str);
        sb.append(", confirmationCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.phoneNumber.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.confirmationCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput confirmPhoneConfirmationCodeInput = (com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, confirmPhoneConfirmationCodeInput.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, confirmPhoneConfirmationCodeInput.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationCode, confirmPhoneConfirmationCodeInput.confirmationCode);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput copy(com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneNumber, java.lang.String deviceId, java.lang.String confirmationCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationCode, "");
        return new com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput(phoneNumber, deviceId, confirmationCode);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getConfirmationCode() {
        return this.confirmationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PhoneInput getPhoneNumber() {
        return this.phoneNumber;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput copy$default(com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput confirmPhoneConfirmationCodeInput, com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            phoneInput = confirmPhoneConfirmationCodeInput.phoneNumber;
        }
        if ((i & 2) != 0) {
            str = confirmPhoneConfirmationCodeInput.deviceId;
        }
        if ((i & 4) != 0) {
            str2 = confirmPhoneConfirmationCodeInput.confirmationCode;
        }
        return confirmPhoneConfirmationCodeInput.copy(phoneInput, str, str2);
    }
}

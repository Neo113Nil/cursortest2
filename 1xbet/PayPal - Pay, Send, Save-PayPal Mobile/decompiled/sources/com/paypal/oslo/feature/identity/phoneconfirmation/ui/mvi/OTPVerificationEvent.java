package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnInit", "OnOtpCodeChanged", "OnVerify", "OnResendCode", "OnBack", "OnDismissMessage", "OnDone", "VerificationSucceeded", "VerificationFailed", "CodeResentSuccessfully", "CodeResendFailed", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$CodeResendFailed;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$CodeResentSuccessfully;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnBack;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnDismissMessage;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnDone;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnInit;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnOtpCodeChanged;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnResendCode;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnVerify;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$VerificationFailed;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$VerificationSucceeded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OTPVerificationEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OTPVerificationEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnInit;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "", "phoneNumber", "maskedPhoneNumber", "countryCode", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnInit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "getMaskedPhoneNumber", "getCountryCode", "getDeviceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInit extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String deviceId;
        private final java.lang.String maskedPhoneNumber;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnInit(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super("OnInit", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.phoneNumber = str;
            this.maskedPhoneNumber = str2;
            this.countryCode = str3;
            this.deviceId = str4;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getDeviceId() {
            return this.deviceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.String str2 = this.maskedPhoneNumber;
            java.lang.String str3 = this.countryCode;
            java.lang.String str4 = this.deviceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInit(phoneNumber=");
            sb.append(str);
            sb.append(", maskedPhoneNumber=");
            sb.append(str2);
            sb.append(", countryCode=");
            sb.append(str3);
            sb.append(", deviceId=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.phoneNumber.hashCode() * 31) + this.maskedPhoneNumber.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.deviceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit)) {
                return false;
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit onInit = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, onInit.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPhoneNumber, onInit.maskedPhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, onInit.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, onInit.deviceId);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit copy(java.lang.String phoneNumber, java.lang.String maskedPhoneNumber, java.lang.String countryCode, java.lang.String deviceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPhoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit(phoneNumber, maskedPhoneNumber, countryCode, deviceId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnInit onInit, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onInit.phoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = onInit.maskedPhoneNumber;
            }
            if ((i & 4) != 0) {
                str3 = onInit.countryCode;
            }
            if ((i & 8) != 0) {
                str4 = onInit.deviceId;
            }
            return onInit.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnOtpCodeChanged;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "", "code", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnOtpCodeChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOtpCodeChanged extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnOtpCodeChanged(java.lang.String str) {
            super("OnOtpCodeChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.code = str;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOtpCodeChanged(code=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged) other).code);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged copy(java.lang.String code) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged(code);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnOtpCodeChanged onOtpCodeChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onOtpCodeChanged.code;
            }
            return onOtpCodeChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnVerify;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "", "otpCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnVerify;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOtpCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnVerify extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String otpCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnVerify(java.lang.String str) {
            super("OnVerify", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.otpCode = str;
        }

        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.otpCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnVerify(otpCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.otpCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) && kotlin.jvm.internal.Intrinsics.areEqual(this.otpCode, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify) other).otpCode);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify copy(java.lang.String otpCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify(otpCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnVerify onVerify, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onVerify.otpCode;
            }
            return onVerify.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnResendCode;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnResendCode extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnResendCode INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnResendCode();

        public final int hashCode() {
            return -1146368957;
        }

        private OnResendCode() {
            super("OnResendCode", null);
        }

        public final java.lang.String toString() {
            return "OnResendCode";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnResendCode)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnBack;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBack extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnBack INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnBack();

        public final int hashCode() {
            return 575778978;
        }

        private OnBack() {
            super("OnBack", null);
        }

        public final java.lang.String toString() {
            return "OnBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnDismissMessage;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismissMessage extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDismissMessage INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDismissMessage();

        public final int hashCode() {
            return -1802611688;
        }

        private OnDismissMessage() {
            super("OnDismissMessage", null);
        }

        public final java.lang.String toString() {
            return "OnDismissMessage";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDismissMessage)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$OnDone;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDone extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDone INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDone();

        public final int hashCode() {
            return 575852349;
        }

        private OnDone() {
            super("OnDone", null);
        }

        public final java.lang.String toString() {
            return "OnDone";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.OnDone)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$VerificationSucceeded;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$VerificationSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerificationSucceeded extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationSucceeded(java.lang.String str) {
            super("VerificationSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationSucceeded(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationSucceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationSucceeded) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationSucceeded copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationSucceeded(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationSucceeded copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationSucceeded verificationSucceeded, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = verificationSucceeded.phoneNumber;
            }
            return verificationSucceeded.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$VerificationFailed;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "copy", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$VerificationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerificationFailed extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationFailed(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError) {
            super("VerificationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationError, "");
            this.error = phoneConfirmationError;
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationFailed(error=");
            sb.append(phoneConfirmationError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationFailed) other).error);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationFailed copy(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationFailed copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationFailed verificationFailed, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                phoneConfirmationError = verificationFailed.error;
            }
            return verificationFailed.copy(phoneConfirmationError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$CodeResentSuccessfully;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;", "output", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;)V", "component1", "()Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;", "copy", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$CodeResentSuccessfully;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;", "getOutput"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CodeResentSuccessfully extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput output;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CodeResentSuccessfully(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput phoneConfirmationOutput) {
            super("CodeResentSuccessfully", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationOutput, "");
            this.output = phoneConfirmationOutput;
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput getOutput() {
            return this.output;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput phoneConfirmationOutput = this.output;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CodeResentSuccessfully(output=");
            sb.append(phoneConfirmationOutput);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.output.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResentSuccessfully) && kotlin.jvm.internal.Intrinsics.areEqual(this.output, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResentSuccessfully) other).output);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResentSuccessfully copy(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput output) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResentSuccessfully(output);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput getOutput() {
            return this.output;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResentSuccessfully copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResentSuccessfully codeResentSuccessfully, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput phoneConfirmationOutput, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                phoneConfirmationOutput = codeResentSuccessfully.output;
            }
            return codeResentSuccessfully.copy(phoneConfirmationOutput);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$CodeResendFailed;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "copy", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationEvent$CodeResendFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CodeResendFailed extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CodeResendFailed(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError) {
            super("CodeResendFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationError, "");
            this.error = phoneConfirmationError;
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CodeResendFailed(error=");
            sb.append(phoneConfirmationError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResendFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResendFailed) other).error);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResendFailed copy(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResendFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResendFailed copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.CodeResendFailed codeResendFailed, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                phoneConfirmationError = codeResendFailed.error;
            }
            return codeResendFailed.copy(phoneConfirmationError);
        }
    }

    public /* synthetic */ OTPVerificationEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

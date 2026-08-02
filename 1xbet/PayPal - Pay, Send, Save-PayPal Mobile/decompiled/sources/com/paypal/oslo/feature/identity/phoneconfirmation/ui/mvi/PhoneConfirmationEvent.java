package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnSendCode", "OnCancel", "OnDismissError", "OnInit", "ConfirmationInitiated", "ConfirmationFailed", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$ConfirmationFailed;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$ConfirmationInitiated;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnCancel;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnDismissError;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnInit;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnSendCode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PhoneConfirmationEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PhoneConfirmationEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnSendCode;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;", "", "phoneNumber", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnSendCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSendCode extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSendCode(java.lang.String str, java.lang.String str2) {
            super("OnSendCode", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.phoneNumber = str;
            this.countryCode = str2;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.String str2 = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSendCode(phoneNumber=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.phoneNumber.hashCode() * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode)) {
                return false;
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode onSendCode = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, onSendCode.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, onSendCode.countryCode);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode copy(java.lang.String phoneNumber, java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode(phoneNumber, countryCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode onSendCode, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSendCode.phoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = onSendCode.countryCode;
            }
            return onSendCode.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnCancel;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancel extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnCancel INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnCancel();

        public final int hashCode() {
            return 1899602962;
        }

        private OnCancel() {
            super("OnCancel", null);
        }

        public final java.lang.String toString() {
            return "OnCancel";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnCancel)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnDismissError;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismissError extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnDismissError INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnDismissError();

        public final int hashCode() {
            return 832641334;
        }

        private OnDismissError() {
            super("OnDismissError", null);
        }

        public final java.lang.String toString() {
            return "OnDismissError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnDismissError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnInit;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$OnInit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInit extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnInit(java.lang.String str) {
            super("OnInit", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInit(phoneNumber=");
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
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnInit) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnInit) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnInit copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnInit(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnInit copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnInit onInit, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onInit.phoneNumber;
            }
            return onInit.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$ConfirmationInitiated;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;", "output", "", "phoneNumber", "countryCode", "deviceId", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$ConfirmationInitiated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;", "getOutput", "Ljava/lang/String;", "getPhoneNumber", "getCountryCode", "getDeviceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmationInitiated extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String deviceId;
        private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput output;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmationInitiated(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput phoneConfirmationOutput, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("ConfirmationInitiated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationOutput, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.output = phoneConfirmationOutput;
            this.phoneNumber = str;
            this.countryCode = str2;
            this.deviceId = str3;
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput getOutput() {
            return this.output;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getDeviceId() {
            return this.deviceId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput phoneConfirmationOutput = this.output;
            java.lang.String str = this.phoneNumber;
            java.lang.String str2 = this.countryCode;
            java.lang.String str3 = this.deviceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmationInitiated(output=");
            sb.append(phoneConfirmationOutput);
            sb.append(", phoneNumber=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(str2);
            sb.append(", deviceId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.output.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.deviceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated)) {
                return false;
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated confirmationInitiated = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.output, confirmationInitiated.output) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, confirmationInitiated.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, confirmationInitiated.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, confirmationInitiated.deviceId);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated copy(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput output, java.lang.String phoneNumber, java.lang.String countryCode, java.lang.String deviceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated(output, phoneNumber, countryCode, deviceId);
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
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput getOutput() {
            return this.output;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated confirmationInitiated, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput phoneConfirmationOutput, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                phoneConfirmationOutput = confirmationInitiated.output;
            }
            if ((i & 2) != 0) {
                str = confirmationInitiated.phoneNumber;
            }
            if ((i & 4) != 0) {
                str2 = confirmationInitiated.countryCode;
            }
            if ((i & 8) != 0) {
                str3 = confirmationInitiated.deviceId;
            }
            return confirmationInitiated.copy(phoneConfirmationOutput, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$ConfirmationFailed;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "copy", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent$ConfirmationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmationFailed extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmationFailed(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError) {
            super("ConfirmationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationError, "");
            this.error = phoneConfirmationError;
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmationFailed(error=");
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
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed) other).error);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed copy(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed confirmationFailed, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                phoneConfirmationError = confirmationFailed.error;
            }
            return confirmationFailed.copy(phoneConfirmationError);
        }
    }

    public /* synthetic */ PhoneConfirmationEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

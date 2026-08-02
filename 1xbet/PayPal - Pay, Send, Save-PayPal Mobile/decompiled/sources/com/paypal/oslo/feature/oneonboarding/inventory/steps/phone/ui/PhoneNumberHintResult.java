package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult;", "", "Success", "Cancelled", "Error", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult$Cancelled;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult$Error;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PhoneNumberHintResult {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult$Success;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        public Success(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(phoneNumber=");
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
            return (other instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Success) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Success copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Success(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Success copy$default(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Success success, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.phoneNumber;
            }
            return success.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult$Cancelled;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled implements com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Cancelled INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Cancelled();

        public final int hashCode() {
            return 1305875131;
        }

        private Cancelled() {
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult$Error;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "<init>", "(Ljava/lang/Exception;)V", "component1", "()Ljava/lang/Exception;", "copy", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Exception;", "getException"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult {
        public static final int $stable = 0;
        private final java.lang.Exception exception;

        public Error(java.lang.Exception exc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
            this.exception = exc;
        }

        public final java.lang.Exception getException() {
            return this.exception;
        }

        public final java.lang.String toString() {
            java.lang.Exception exc = this.exception;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(exception=");
            sb.append(exc);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.exception, ((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Error) other).exception);
        }

        public final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Error copy(java.lang.Exception exception) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
            return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Error(exception);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Exception getException() {
            return this.exception;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Error copy$default(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneNumberHintResult.Error error, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }
    }
}

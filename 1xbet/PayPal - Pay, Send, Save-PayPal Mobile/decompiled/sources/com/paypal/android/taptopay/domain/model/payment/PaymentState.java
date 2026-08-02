package com.paypal.android.taptopay.domain.model.payment;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;", "Landroid/os/Parcelable;", "", "toLogString", "()Ljava/lang/String;", "Failure", "Success", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PaymentState extends android.os.Parcelable {
    java.lang.String toLogString();

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;", "AuthenticationRequired", "FirstTapCompleted", "Idle", "ReadyForSecondTap", "TransactionCompleted", "TransactionStarted", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$AuthenticationRequired;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$FirstTapCompleted;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$Idle;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$ReadyForSecondTap;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$TransactionCompleted;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$TransactionStarted;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public interface Success extends com.paypal.android.taptopay.domain.model.payment.PaymentState {

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static java.lang.String toLogString(com.paypal.android.taptopay.domain.model.payment.PaymentState.Success success) {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.DefaultImpls.toLogString(success);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$Idle;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success;", "<init>", "()V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Idle implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Success {
            public static final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle INSTANCE = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle();
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final int hashCode() {
                return 317077186;
            }

            private Idle() {
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.DefaultImpls.toLogString(this);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle.INSTANCE;
                }
            }

            public final java.lang.String toString() {
                return "Idle";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$TransactionStarted;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success;", "<init>", "()V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TransactionStarted implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Success {
            public static final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted INSTANCE = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted();
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final int hashCode() {
                return 342027825;
            }

            private TransactionStarted() {
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.DefaultImpls.toLogString(this);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted.INSTANCE;
                }
            }

            public final java.lang.String toString() {
                return "TransactionStarted";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$FirstTapCompleted;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success;", "<init>", "()V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FirstTapCompleted implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Success {
            public static final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted INSTANCE = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted();
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final int hashCode() {
                return 953882762;
            }

            private FirstTapCompleted() {
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.DefaultImpls.toLogString(this);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted.INSTANCE;
                }
            }

            public final java.lang.String toString() {
                return "FirstTapCompleted";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0004\u0012\u00020\b0\u0006\u0012&\b\u0002\u0010\u000f\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\f\u0012\u0004\u0012\u00020\b0\u0006\u0012 \b\u0002\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR5\u0010\u000f\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\f\u0012\u0004\u0012\u00020\b0\u00068\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0004\u0012\u00020\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b \u0010\u001fR2\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b!\u0010\u001fR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\"\u0010\u001fR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$AuthenticationRequired;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success;", "Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;", "authenticationMethod", "", "resetTimeout", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "", "authenticationLauncher", "Lkotlin/Function0;", "authFailedSetter", "Lkotlin/Function2;", "", "", "authErrorSetter", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "authSuccessSetter", "", "authenticated", "<init>", "(Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlin/jvm/functions/Function1;", "getAuthErrorSetter", "()Lkotlin/jvm/functions/Function1;", "getAuthFailedSetter", "getAuthSuccessSetter", "getAuthenticated", "getAuthenticationLauncher", "Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;", "getAuthenticationMethod", "()Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;", "J", "getResetTimeout", "()J"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AuthenticationRequired implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Success {
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired.Creator();
            private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.CharSequence, kotlin.Unit>, kotlin.Unit> authErrorSetter;
            private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> authFailedSetter;
            private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super androidx.biometric.BiometricPrompt.AuthenticationResult, kotlin.Unit>, kotlin.Unit> authSuccessSetter;
            private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> authenticated;
            private final kotlin.jvm.functions.Function1<androidx.fragment.app.FragmentActivity, kotlin.Unit> authenticationLauncher;
            private final com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod authenticationMethod;
            private final long resetTimeout;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AuthenticationRequired(com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod authenticationMethod, long j, kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentActivity, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.CharSequence, kotlin.Unit>, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super androidx.biometric.BiometricPrompt.AuthenticationResult, kotlin.Unit>, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function15) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationMethod, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function15, "");
                this.authenticationMethod = authenticationMethod;
                this.resetTimeout = j;
                this.authenticationLauncher = function1;
                this.authFailedSetter = function12;
                this.authErrorSetter = function13;
                this.authSuccessSetter = function14;
                this.authenticated = function15;
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.DefaultImpls.toLogString(this);
            }

            public final com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod getAuthenticationMethod() {
                return this.authenticationMethod;
            }

            public final long getResetTimeout() {
                return this.resetTimeout;
            }

            public final kotlin.jvm.functions.Function1<androidx.fragment.app.FragmentActivity, kotlin.Unit> getAuthenticationLauncher() {
                return this.authenticationLauncher;
            }

            public /* synthetic */ AuthenticationRequired(com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod authenticationMethod, long j, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(authenticationMethod, j, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
                        getHighSpeedVideoFpsRanges(function0);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
                    }
                } : function12, (i & 16) != 0 ? new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.CharSequence, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired.2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.CharSequence, ? extends kotlin.Unit> function2) {
                        getHighSpeedVideoFpsRanges(function2);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.CharSequence, kotlin.Unit> function2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
                    }
                } : function13, (i & 32) != 0 ? new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super androidx.biometric.BiometricPrompt.AuthenticationResult, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired.3
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function1<? super androidx.biometric.BiometricPrompt.AuthenticationResult, ? extends kotlin.Unit> function16) {
                        getHighSpeedVideoSizes(function16);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoSizes(kotlin.jvm.functions.Function1<? super androidx.biometric.BiometricPrompt.AuthenticationResult, kotlin.Unit> function16) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function16, "");
                    }
                } : function14, function15);
            }

            public final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> getAuthFailedSetter() {
                return this.authFailedSetter;
            }

            public final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.CharSequence, kotlin.Unit>, kotlin.Unit> getAuthErrorSetter() {
                return this.authErrorSetter;
            }

            public final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super androidx.biometric.BiometricPrompt.AuthenticationResult, kotlin.Unit>, kotlin.Unit> getAuthSuccessSetter() {
                return this.authSuccessSetter;
            }

            public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getAuthenticated() {
                return this.authenticated;
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired(com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.valueOf(parcel.readString()), parcel.readLong(), (kotlin.jvm.functions.Function1) parcel.readSerializable(), (kotlin.jvm.functions.Function1) parcel.readSerializable(), (kotlin.jvm.functions.Function1) parcel.readSerializable(), (kotlin.jvm.functions.Function1) parcel.readSerializable(), (kotlin.jvm.functions.Function1) parcel.readSerializable());
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.authenticationMethod.name());
                parcel.writeLong(this.resetTimeout);
                parcel.writeSerializable((java.io.Serializable) this.authenticationLauncher);
                parcel.writeSerializable((java.io.Serializable) this.authFailedSetter);
                parcel.writeSerializable((java.io.Serializable) this.authErrorSetter);
                parcel.writeSerializable((java.io.Serializable) this.authSuccessSetter);
                parcel.writeSerializable((java.io.Serializable) this.authenticated);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$ReadyForSecondTap;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success;", "<init>", "()V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ReadyForSecondTap implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Success {
            public static final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap INSTANCE = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap();
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final int hashCode() {
                return -1278660389;
            }

            private ReadyForSecondTap() {
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.DefaultImpls.toLogString(this);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap.INSTANCE;
                }
            }

            public final java.lang.String toString() {
                return "ReadyForSecondTap";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$TransactionCompleted;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success;", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;", "transactionContext", "<init>", "(Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;)V", "component1", "()Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;", "copy", "(Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;)Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Success$TransactionCompleted;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;", "getTransactionContext"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TransactionCompleted implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Success {
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted.Creator();
            private final com.paypal.android.taptopay.domain.model.payment.TransactionContext transactionContext;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public TransactionCompleted(com.paypal.android.taptopay.domain.model.payment.TransactionContext transactionContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionContext, "");
                this.transactionContext = transactionContext;
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.DefaultImpls.toLogString(this);
            }

            public final com.paypal.android.taptopay.domain.model.payment.TransactionContext getTransactionContext() {
                return this.transactionContext;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                this.transactionContext.writeToParcel(parcel, flags);
            }

            public final java.lang.String toString() {
                com.paypal.android.taptopay.domain.model.payment.TransactionContext transactionContext = this.transactionContext;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionCompleted(transactionContext=");
                sb.append(transactionContext);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.transactionContext.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionContext, ((com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted) other).transactionContext);
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted(com.paypal.android.taptopay.domain.model.payment.TransactionContext.CREATOR.createFromParcel(parcel));
                }
            }

            public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted copy(com.paypal.android.taptopay.domain.model.payment.TransactionContext transactionContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionContext, "");
                return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted(transactionContext);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.android.taptopay.domain.model.payment.TransactionContext getTransactionContext() {
                return this.transactionContext;
            }

            public static /* synthetic */ com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted copy$default(com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted transactionCompleted, com.paypal.android.taptopay.domain.model.payment.TransactionContext transactionContext, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    transactionContext = transactionCompleted.transactionContext;
                }
                return transactionCompleted.copy(transactionContext);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;", "AuthenticationError", "DefaultError", "TransactionError", "TransactionInterrupted", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$AuthenticationError;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$DefaultError;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$TransactionError;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$TransactionInterrupted;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public interface Failure extends com.paypal.android.taptopay.domain.model.payment.PaymentState {

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static java.lang.String toLogString(com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure failure) {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.DefaultImpls.toLogString(failure);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b \u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$TransactionInterrupted;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure;", "", "transactionInterruptedCode", "", "transactionInterruptedMessage", "retryCount", "<init>", "(ILjava/lang/String;I)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;I)Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$TransactionInterrupted;", "describeContents", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "getTransactionInterruptedCode", "Ljava/lang/String;", "getTransactionInterruptedMessage"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TransactionInterrupted implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure {
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted.Creator();
            private final int retryCount;
            private final int transactionInterruptedCode;
            private final java.lang.String transactionInterruptedMessage;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public TransactionInterrupted(int i, java.lang.String str, int i2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.transactionInterruptedCode = i;
                this.transactionInterruptedMessage = str;
                this.retryCount = i2;
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultImpls.toLogString(this);
            }

            public final int getTransactionInterruptedCode() {
                return this.transactionInterruptedCode;
            }

            public final java.lang.String getTransactionInterruptedMessage() {
                return this.transactionInterruptedMessage;
            }

            public final int getRetryCount() {
                return this.retryCount;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(this.transactionInterruptedCode);
                parcel.writeString(this.transactionInterruptedMessage);
                parcel.writeInt(this.retryCount);
            }

            public final java.lang.String toString() {
                int i = this.transactionInterruptedCode;
                java.lang.String str = this.transactionInterruptedMessage;
                int i2 = this.retryCount;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionInterrupted(transactionInterruptedCode=");
                sb.append(i);
                sb.append(", transactionInterruptedMessage=");
                sb.append(str);
                sb.append(", retryCount=");
                sb.append(i2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((java.lang.Integer.hashCode(this.transactionInterruptedCode) * 31) + this.transactionInterruptedMessage.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted)) {
                    return false;
                }
                com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted transactionInterrupted = (com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted) other;
                return this.transactionInterruptedCode == transactionInterrupted.transactionInterruptedCode && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionInterruptedMessage, transactionInterrupted.transactionInterruptedMessage) && this.retryCount == transactionInterrupted.retryCount;
            }

            public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted copy(int transactionInterruptedCode, java.lang.String transactionInterruptedMessage, int retryCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInterruptedMessage, "");
                return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted(transactionInterruptedCode, transactionInterruptedMessage, retryCount);
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted(parcel.readInt(), parcel.readString(), parcel.readInt());
                }
            }

            /* renamed from: component3, reason: from getter */
            public final int getRetryCount() {
                return this.retryCount;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getTransactionInterruptedMessage() {
                return this.transactionInterruptedMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final int getTransactionInterruptedCode() {
                return this.transactionInterruptedCode;
            }

            public static /* synthetic */ com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted copy$default(com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted transactionInterrupted, int i, java.lang.String str, int i2, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    i = transactionInterrupted.transactionInterruptedCode;
                }
                if ((i3 & 2) != 0) {
                    str = transactionInterrupted.transactionInterruptedMessage;
                }
                if ((i3 & 4) != 0) {
                    i2 = transactionInterrupted.retryCount;
                }
                return transactionInterrupted.copy(i, str, i2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$TransactionError;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;", "paymentErrorCode", "<init>", "(Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;)V", "component1", "()Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;", "copy", "(Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;)Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$TransactionError;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentErrorCode;", "getPaymentErrorCode"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TransactionError implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure {
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError.Creator();
            private final com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public TransactionError(com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentErrorCode, "");
                this.paymentErrorCode = paymentErrorCode;
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultImpls.toLogString(this);
            }

            public final com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode getPaymentErrorCode() {
                return this.paymentErrorCode;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.paymentErrorCode.name());
            }

            public final java.lang.String toString() {
                com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode = this.paymentErrorCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionError(paymentErrorCode=");
                sb.append(paymentErrorCode);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.paymentErrorCode.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError) && this.paymentErrorCode == ((com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError) other).paymentErrorCode;
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError(com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode.valueOf(parcel.readString()));
                }
            }

            public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError copy(com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentErrorCode, "");
                return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError(paymentErrorCode);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode getPaymentErrorCode() {
                return this.paymentErrorCode;
            }

            public static /* synthetic */ com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError copy$default(com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError transactionError, com.paypal.android.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    paymentErrorCode = transactionError.paymentErrorCode;
                }
                return transactionError.copy(paymentErrorCode);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$AuthenticationError;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure;", "<init>", "()V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AuthenticationError implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure {
            public static final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError INSTANCE = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError();
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final int hashCode() {
                return 833044937;
            }

            private AuthenticationError() {
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultImpls.toLogString(this);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError.INSTANCE;
                }
            }

            public final java.lang.String toString() {
                return "AuthenticationError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$DefaultError;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure;", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/android/taptopay/domain/model/payment/PaymentState$Failure$DefaultError;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DefaultError implements com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure {
            public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError> CREATOR = new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError.Creator();
            private final java.lang.String debugMessage;
            private final java.lang.Throwable throwable;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public DefaultError(java.lang.String str, java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.debugMessage = str;
                this.throwable = th;
            }

            @Override // com.paypal.android.taptopay.domain.model.payment.PaymentState
            public final java.lang.String toLogString() {
                return com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultImpls.toLogString(this);
            }

            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.debugMessage);
                parcel.writeSerializable(this.throwable);
            }

            public final java.lang.String toString() {
                java.lang.String str = this.debugMessage;
                java.lang.Throwable th = this.throwable;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultError(debugMessage=");
                sb.append(str);
                sb.append(", throwable=");
                sb.append(th);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.debugMessage.hashCode();
                java.lang.Throwable th = this.throwable;
                return (hashCode * 31) + (th == null ? 0 : th.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError)) {
                    return false;
                }
                com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError defaultError = (com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, defaultError.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, defaultError.throwable);
            }

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError[] newArray(int i) {
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError(parcel.readString(), (java.lang.Throwable) parcel.readSerializable());
                }
            }

            public final com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
                return new com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError(debugMessage, throwable);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Throwable getThrowable() {
                return this.throwable;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDebugMessage() {
                return this.debugMessage;
            }

            public static /* synthetic */ com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError copy$default(com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError defaultError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = defaultError.debugMessage;
                }
                if ((i & 2) != 0) {
                    th = defaultError.throwable;
                }
                return defaultError.copy(str, th);
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static java.lang.String toLogString(com.paypal.android.taptopay.domain.model.payment.PaymentState paymentState) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(paymentState, com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError.INSTANCE)) {
                return "AuthenticationError";
            }
            if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.DefaultError) {
                return "DefaultError";
            }
            if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionError) {
                return "TransactionError";
            }
            if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted) {
                return "TransactionInterrupted";
            }
            if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired) {
                return "AuthenticationRequired";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(paymentState, com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted.INSTANCE)) {
                return "FirstTapCompleted";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(paymentState, com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.Idle.INSTANCE)) {
                return "Idle";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(paymentState, com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap.INSTANCE)) {
                return "ReadyForSecondTap";
            }
            if (paymentState instanceof com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted) {
                return "TransactionCompleted";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(paymentState, com.paypal.android.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted.INSTANCE)) {
                return "TransactionStarted";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}

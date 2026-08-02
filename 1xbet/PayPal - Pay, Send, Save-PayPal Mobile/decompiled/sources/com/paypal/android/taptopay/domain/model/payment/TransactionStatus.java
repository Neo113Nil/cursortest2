package com.paypal.android.taptopay.domain.model.payment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/TransactionStatus;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "APPROVED", "CLEARED", "DECLINED", "REFUNDED"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionStatus implements android.os.Parcelable {
    public static final com.paypal.android.taptopay.domain.model.payment.TransactionStatus APPROVED;
    public static final com.paypal.android.taptopay.domain.model.payment.TransactionStatus CLEARED;
    public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.TransactionStatus> CREATOR;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.android.taptopay.domain.model.payment.TransactionStatus DECLINED;
    public static final com.paypal.android.taptopay.domain.model.payment.TransactionStatus REFUNDED;
    private static final /* synthetic */ com.paypal.android.taptopay.domain.model.payment.TransactionStatus[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private TransactionStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.android.taptopay.domain.model.payment.TransactionStatus transactionStatus = new com.paypal.android.taptopay.domain.model.payment.TransactionStatus("APPROVED", 0);
        APPROVED = transactionStatus;
        com.paypal.android.taptopay.domain.model.payment.TransactionStatus transactionStatus2 = new com.paypal.android.taptopay.domain.model.payment.TransactionStatus("CLEARED", 1);
        CLEARED = transactionStatus2;
        com.paypal.android.taptopay.domain.model.payment.TransactionStatus transactionStatus3 = new com.paypal.android.taptopay.domain.model.payment.TransactionStatus("DECLINED", 2);
        DECLINED = transactionStatus3;
        com.paypal.android.taptopay.domain.model.payment.TransactionStatus transactionStatus4 = new com.paypal.android.taptopay.domain.model.payment.TransactionStatus("REFUNDED", 3);
        REFUNDED = transactionStatus4;
        com.paypal.android.taptopay.domain.model.payment.TransactionStatus[] transactionStatusArr = {transactionStatus, transactionStatus2, transactionStatus3, transactionStatus4};
        getHighResolutionOutputSizeshNQ4ISI = transactionStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(transactionStatusArr);
        CREATOR = new android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.TransactionStatus>() { // from class: com.paypal.android.taptopay.domain.model.payment.TransactionStatus.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.android.taptopay.domain.model.payment.TransactionStatus[] newArray(int i) {
                return new com.paypal.android.taptopay.domain.model.payment.TransactionStatus[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.android.taptopay.domain.model.payment.TransactionStatus createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return com.paypal.android.taptopay.domain.model.payment.TransactionStatus.valueOf(parcel.readString());
            }
        };
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    public static com.paypal.android.taptopay.domain.model.payment.TransactionStatus[] values() {
        return (com.paypal.android.taptopay.domain.model.payment.TransactionStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.android.taptopay.domain.model.payment.TransactionStatus valueOf(java.lang.String str) {
        return (com.paypal.android.taptopay.domain.model.payment.TransactionStatus) java.lang.Enum.valueOf(com.paypal.android.taptopay.domain.model.payment.TransactionStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.taptopay.domain.model.payment.TransactionStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}

package com.paypal.oslo.feature.taptopay.domain.model.payment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "PURCHASE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, "WITHDRAWAL", "CASHBACK", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransactionType implements android.os.Parcelable {
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType CASHBACK;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType> CREATOR;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType PURCHASE;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType REFUND;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType UNKNOWN;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType WITHDRAWAL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private TransactionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType = new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType("PURCHASE", 0);
        PURCHASE = transactionType;
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType2 = new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, 1);
        REFUND = transactionType2;
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType3 = new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType("WITHDRAWAL", 2);
        WITHDRAWAL = transactionType3;
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType4 = new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType("CASHBACK", 3);
        CASHBACK = transactionType4;
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType5 = new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType("UNKNOWN", 4);
        UNKNOWN = transactionType5;
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType[] transactionTypeArr = {transactionType, transactionType2, transactionType3, transactionType4, transactionType5};
        Camera2StreamConfigurationMap = transactionTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(transactionTypeArr);
        CREATOR = new android.os.Parcelable.Creator<com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType>() { // from class: com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType[] newArray(int i) {
                return new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.valueOf(parcel.readString());
            }
        };
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}

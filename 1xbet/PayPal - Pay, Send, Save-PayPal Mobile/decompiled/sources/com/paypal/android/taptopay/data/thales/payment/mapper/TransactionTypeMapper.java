package com.paypal.android.taptopay.data.thales.payment.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/mapper/TransactionTypeMapper;", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;", "Lcom/paypal/android/taptopay/data/thales/payment/mapper/DomainTransactionType;", "<init>", "()V", "input", "map", "(B)Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionTypeMapper implements com.paypal.android.taptopay.domain.core.Mapper<java.lang.Byte, com.paypal.android.taptopay.domain.model.payment.TransactionType> {
    @Override // com.paypal.android.taptopay.domain.core.Mapper
    public final /* synthetic */ com.paypal.android.taptopay.domain.model.payment.TransactionType map(java.lang.Byte b) {
        return map(b.byteValue());
    }

    public final com.paypal.android.taptopay.domain.model.payment.TransactionType map(byte input) {
        if (input == 0) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionType.PURCHASE;
        }
        if (input == 1) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionType.WITHDRAWAL;
        }
        if (input == 23) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionType.CASHBACK;
        }
        if (input == 32) {
            return com.paypal.android.taptopay.domain.model.payment.TransactionType.REFUND;
        }
        return com.paypal.android.taptopay.domain.model.payment.TransactionType.UNKNOWN;
    }
}

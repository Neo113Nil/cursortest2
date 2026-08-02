package com.paypal.oslo.feature.taptopay.data.db.transaction.paypal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/DateConverter;", "", "<init>", "()V", "", "time", "Ljava/util/Date;", "toDate", "(Ljava/lang/Long;)Ljava/util/Date;", "date", "fromDate", "(Ljava/util/Date;)Ljava/lang/Long;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DateConverter {
    public static final int $stable = 0;

    public final java.util.Date toDate(java.lang.Long time) {
        if (time != null) {
            return new java.util.Date(time.longValue());
        }
        return null;
    }

    public final java.lang.Long fromDate(java.util.Date date) {
        if (date != null) {
            return java.lang.Long.valueOf(date.getTime());
        }
        return null;
    }
}

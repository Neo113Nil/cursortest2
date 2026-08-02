package com.paypal.oslo.feature.paymentreadylite.data.datasource;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRecommendationLocalDataSourceImplKt {
    public static final /* synthetic */ com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError.DatabaseError access$toDatabaseError(java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "Unknown database error";
        }
        return new com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError.DatabaseError(message, th);
    }
}

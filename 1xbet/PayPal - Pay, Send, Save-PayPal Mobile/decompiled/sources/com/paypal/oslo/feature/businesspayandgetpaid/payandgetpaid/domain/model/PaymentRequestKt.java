package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "taxSettings", "", "toLongAmount", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;)J", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Price;", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/Price;)J", "", "currencyCode", "Ljava/math/BigDecimal;", "asCurrency", "(JLjava/lang/String;)Ljava/math/BigDecimal;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentRequestKt {
    public static final long toLongAmount(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxSettings, "");
        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItemKt.total(paymentRequest.getItems(), paymentRequest.getCurrencyCode(), taxSettings).getValue();
    }

    public static /* synthetic */ long toLongAmount$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            boolean z = false;
            taxSettings = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(z, z, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return toLongAmount(paymentRequest, taxSettings);
    }

    public static final long toLongAmount(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Price price) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(price, "");
        return price.getAmount().multiply(java.math.BigDecimal.TEN.pow(java.util.Currency.getInstance(price.getCurrencyCode()).getDefaultFractionDigits())).longValue();
    }

    public static final java.math.BigDecimal asCurrency(long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int max = java.lang.Math.max(0, java.util.Currency.getInstance(str).getDefaultFractionDigits());
        java.math.BigDecimal divide = new java.math.BigDecimal(j).divide(java.math.BigDecimal.TEN.pow(max), max, java.math.RoundingMode.HALF_UP);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(divide, "");
        return divide;
    }
}

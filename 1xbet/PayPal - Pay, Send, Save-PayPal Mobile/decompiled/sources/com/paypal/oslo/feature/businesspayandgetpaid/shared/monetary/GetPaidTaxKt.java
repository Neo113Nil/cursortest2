package com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidTax;", "asGetPaidTaxOrThrow", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidTax;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetPaidTaxKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax asGetPaidTaxOrThrow(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("A tax must have a value".toString());
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax(java.lang.Double.parseDouble(str) / 100.0d);
    }
}

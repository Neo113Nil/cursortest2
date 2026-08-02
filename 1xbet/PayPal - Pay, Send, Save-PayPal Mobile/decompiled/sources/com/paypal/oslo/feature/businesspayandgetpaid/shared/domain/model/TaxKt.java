package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;", "toTax", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Tax;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TaxKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax toTax(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxOption, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax(taxOption.getId(), taxOption.getLabel(), new java.math.BigDecimal(java.lang.String.valueOf(taxOption.getValue())));
    }
}

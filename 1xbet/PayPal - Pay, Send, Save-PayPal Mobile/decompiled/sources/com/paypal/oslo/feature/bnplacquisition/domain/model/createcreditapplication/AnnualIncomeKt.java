package com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/AnnualIncome;", "", "isFieldRequiredAndValid", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/AnnualIncome;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnnualIncomeKt {
    public static final boolean isFieldRequiredAndValid(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.AnnualIncome annualIncome) {
        if (annualIncome == null || !annualIncome.isRequired()) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money amount = annualIncome.getAmount();
        java.lang.String value = amount != null ? amount.getValue() : null;
        return (value == null || value.length() == 0) ? false : true;
    }
}

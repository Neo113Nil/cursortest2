package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "paidAmount", "totalRemainingAmount", "", "totalInstallmentsCount", "totalInstallmentsPaid", "totalInstallmentsRemaining", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDetails;", "createInstallmentDetails", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;III)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentDetailsKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails createInstallmentDetails(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2, int i, int i2, int i3) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails(money, money2, i, i2, i3);
    }
}

package com.paypal.oslo.feature.smartroute.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionAccountUi;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionAccount;", "toDomain", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionAccountUi;)Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionAccount;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DistributionUiMapperKt {
    public static final com.paypal.oslo.feature.smartroute.domain.model.DistributionAccount toDomain(com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi distributionAccountUi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionAccountUi, "");
        return new com.paypal.oslo.feature.smartroute.domain.model.DistributionAccount(distributionAccountUi.getId(), distributionAccountUi.getName(), distributionAccountUi.getEnrollmentStatusText(), distributionAccountUi.getApyBadgeText(), distributionAccountUi.getPercentage(), distributionAccountUi.getHasSlider());
    }
}

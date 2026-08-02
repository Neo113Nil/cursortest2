package com.paypal.oslo.feature.revolvingcreditacquisition.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/remoteconfig/FeatureGateManager;", "", "", "isNativeFlowEnabled", "()Z", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "product", "isAcquisitionFlowDisabledFor", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface FeatureGateManager {
    boolean isAcquisitionFlowDisabledFor(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier product);

    boolean isNativeFlowEnabled();
}

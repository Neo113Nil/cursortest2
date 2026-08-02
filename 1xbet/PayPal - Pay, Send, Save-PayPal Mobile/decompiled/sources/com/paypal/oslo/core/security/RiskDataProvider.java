package com.paypal.oslo.core.security;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/security/RiskDataProvider;", "", "", "sourceId", "cmId", "Lcom/paypal/oslo/core/security/RiskData;", "generateFreshDeviceRiskData", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/security/RiskData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RiskDataProvider {
    com.paypal.oslo.core.security.RiskData generateFreshDeviceRiskData(java.lang.String sourceId, java.lang.String cmId);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ com.paypal.oslo.core.security.RiskData generateFreshDeviceRiskData$default(com.paypal.oslo.core.security.RiskDataProvider riskDataProvider, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateFreshDeviceRiskData");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return riskDataProvider.generateFreshDeviceRiskData(str, str2);
    }
}

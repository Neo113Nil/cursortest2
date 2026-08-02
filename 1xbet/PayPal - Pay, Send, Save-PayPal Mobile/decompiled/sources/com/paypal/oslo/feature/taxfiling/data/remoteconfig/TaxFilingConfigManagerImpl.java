package com.paypal.oslo.feature.taxfiling.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taxfiling/data/remoteconfig/TaxFilingConfigManagerImpl;", "Lcom/paypal/oslo/feature/taxfiling/domain/remoteconfig/TaxFillingConfig$Manager;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "getTaxFilingServiceUrl", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TaxFilingConfigManagerImpl implements com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Manager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public TaxFilingConfigManagerImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRanges = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Manager
    public final java.lang.String getTaxFilingServiceUrl() {
        return (java.lang.String) this.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Configs.INSTANCE.getTaxFilingServiceUrl());
    }
}

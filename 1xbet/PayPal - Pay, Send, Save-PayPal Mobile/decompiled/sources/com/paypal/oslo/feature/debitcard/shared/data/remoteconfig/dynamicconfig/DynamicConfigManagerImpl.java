package com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/data/remoteconfig/dynamicconfig/DynamicConfigManagerImpl;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/dynamicconfig/DynamicConfigManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "", "getEntryPoints", "()[Ljava/lang/String;", "getEligibilityType", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DynamicConfigManagerImpl implements com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DynamicConfigManagerImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRanges = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager
    public final java.lang.String[] getEntryPoints() {
        java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRanges.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig.INSTANCE, com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig.getHighSpeedVideoSizes[0]));
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager
    public final java.lang.String getEligibilityType() {
        return (java.lang.String) this.getHighSpeedVideoFpsRanges.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig.INSTANCE, com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig.getHighSpeedVideoSizes[1]));
    }
}

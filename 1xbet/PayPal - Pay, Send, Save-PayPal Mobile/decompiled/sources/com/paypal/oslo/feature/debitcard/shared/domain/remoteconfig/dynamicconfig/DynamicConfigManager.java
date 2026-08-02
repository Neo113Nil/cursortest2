package com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/dynamicconfig/DynamicConfigManager;", "", "", "", "getEntryPoints", "()[Ljava/lang/String;", "getEligibilityType", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DynamicConfigManager {
    java.lang.String getEligibilityType();

    java.lang.String[] getEntryPoints();
}

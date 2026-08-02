package com.paypal.oslo.feature.activity.domain.usecase.common.extensions;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a3\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\f\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "key", "", "", "getSupportedActions", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;)Ljava/util/Set;", "getLedgerSupportedActions", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)Ljava/util/Set;", "getDetailSupportedActions", "getHelpCenterSupportedActions"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DynamicConfigurationExtensionsKt {
    public static /* synthetic */ java.util.Set getSupportedActions$default(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey remoteConfigAnyKey, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            remoteConfigAnyKey = com.paypal.oslo.feature.activity.common.ActivityDynamicConfig.INSTANCE.getLedgerSupportedActionResult();
        }
        return getSupportedActions(dynamicConfiguration, remoteConfigAnyKey);
    }

    public static final java.util.Set<java.lang.String> getSupportedActions(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.Object[]> remoteConfigAnyKey) {
        java.lang.Object[] objArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigAnyKey, "");
        if (dynamicConfiguration == null || (objArr = (java.lang.Object[]) dynamicConfiguration.getValue(remoteConfigAnyKey)) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            if (obj instanceof java.lang.String) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    public static final java.util.Set<java.lang.String> getLedgerSupportedActions(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        java.util.Set<java.lang.String> supportedActions = dynamicConfiguration != null ? getSupportedActions(dynamicConfiguration, com.paypal.oslo.feature.activity.common.ActivityDynamicConfig.INSTANCE.getLedgerSupportedActionResult()) : null;
        return supportedActions == null ? kotlin.collections.SetsKt.emptySet() : supportedActions;
    }

    public static final java.util.Set<java.lang.String> getDetailSupportedActions(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        java.util.Set<java.lang.String> supportedActions = dynamicConfiguration != null ? getSupportedActions(dynamicConfiguration, com.paypal.oslo.feature.activity.common.ActivityDynamicConfig.INSTANCE.getDetailSupportedActionResult()) : null;
        return supportedActions == null ? kotlin.collections.SetsKt.emptySet() : supportedActions;
    }

    public static final java.util.Set<java.lang.String> getHelpCenterSupportedActions(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        java.util.Set<java.lang.String> supportedActions = dynamicConfiguration != null ? getSupportedActions(dynamicConfiguration, com.paypal.oslo.feature.activity.common.ActivityDynamicConfig.INSTANCE.getHelpCenterSupportedActionResult()) : null;
        return supportedActions == null ? kotlin.collections.SetsKt.emptySet() : supportedActions;
    }
}

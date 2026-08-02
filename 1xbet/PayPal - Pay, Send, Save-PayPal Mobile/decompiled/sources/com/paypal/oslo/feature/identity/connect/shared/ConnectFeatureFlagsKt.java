package com.paypal.oslo.feature.identity.connect.shared;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "", "isInboundConnectEnabled", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConnectFeatureFlagsKt {
    public static final boolean isInboundConnectEnabled(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        return featureGate.checkGate(com.paypal.oslo.feature.identity.featureflags.AuthFeatureGates.INSTANCE.getInboundConnectEnabled());
    }
}

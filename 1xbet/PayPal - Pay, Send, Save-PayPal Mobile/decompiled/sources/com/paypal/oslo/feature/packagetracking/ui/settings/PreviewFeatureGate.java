package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PreviewFeatureGate;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "p0", "", "checkGate", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PreviewFeatureGate implements com.paypal.oslo.core.remoteconfig.contract.FeatureGate {
    @Override // com.paypal.oslo.core.remoteconfig.contract.FeatureGate
    public final /* bridge */ java.lang.Object checkGateAuthenticated(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return super.checkGateAuthenticated(remoteConfigKey, continuation);
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.FeatureGate
    public final /* bridge */ kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkGateAuthenticatedFlow(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey) {
        return super.checkGateAuthenticatedFlow(remoteConfigKey);
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.FeatureGate
    public final /* bridge */ kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkGateFlow(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey) {
        return super.checkGateFlow(remoteConfigKey);
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.FeatureGate
    public final boolean checkGate(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return true;
    }
}

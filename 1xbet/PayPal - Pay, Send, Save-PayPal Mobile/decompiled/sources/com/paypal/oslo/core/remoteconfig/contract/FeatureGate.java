package com.paypal.oslo.core.remoteconfig.contract;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "key", "", "checkGate", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)Z", "Lkotlinx/coroutines/flow/Flow;", "checkGateFlow", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)Lkotlinx/coroutines/flow/Flow;", "checkGateAuthenticated", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkGateAuthenticatedFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FeatureGate {
    boolean checkGate(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkGateFlow(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigKey, "");
            return com.paypal.oslo.core.remoteconfig.contract.FeatureGate.super.checkGateFlow(remoteConfigKey);
        }

        @java.lang.Deprecated
        public static java.lang.Object checkGateAuthenticated(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return com.paypal.oslo.core.remoteconfig.contract.FeatureGate.super.checkGateAuthenticated(remoteConfigKey, continuation);
        }

        @java.lang.Deprecated
        public static kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkGateAuthenticatedFlow(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigKey, "");
            return com.paypal.oslo.core.remoteconfig.contract.FeatureGate.super.checkGateAuthenticatedFlow(remoteConfigKey);
        }
    }

    default kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkGateFlow(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return kotlinx.coroutines.flow.FlowKt.flowOf(java.lang.Boolean.FALSE);
    }

    static /* synthetic */ java.lang.Object checkGateAuthenticated$suspendImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    default kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkGateAuthenticatedFlow(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return kotlinx.coroutines.flow.FlowKt.flowOf(java.lang.Boolean.FALSE);
    }

    default java.lang.Object checkGateAuthenticated(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return checkGateAuthenticated$suspendImpl(this, remoteConfigKey, continuation);
    }
}

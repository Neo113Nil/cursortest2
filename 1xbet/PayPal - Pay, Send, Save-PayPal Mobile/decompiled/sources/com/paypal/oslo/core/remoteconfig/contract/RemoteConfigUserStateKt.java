package com.paypal.oslo.core.remoteconfig.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState;", "", "isSdkInitialized", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigUserState;)Z", "isNotAuthenticated", "isAuthenticated"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RemoteConfigUserStateKt {
    public static final boolean isSdkInitialized(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState remoteConfigUserState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigUserState, "");
        return !(remoteConfigUserState instanceof com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.SdkNotInitialized);
    }

    public static final boolean isNotAuthenticated(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState remoteConfigUserState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigUserState, "");
        return remoteConfigUserState instanceof com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.NonAuthenticated;
    }

    public static final boolean isAuthenticated(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState remoteConfigUserState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigUserState, "");
        return remoteConfigUserState instanceof com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.Authenticated;
    }
}

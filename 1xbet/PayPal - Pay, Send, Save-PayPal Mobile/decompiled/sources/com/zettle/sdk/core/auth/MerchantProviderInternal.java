package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/auth/MerchantProviderInternal;", "Lcom/zettle/sdk/core/user/MerchantProvider;", "Lcom/izettle/android/auth/ZettleAuth;", "p0", "<init>", "(Lcom/izettle/android/auth/ZettleAuth;)V", "Lcom/zettle/sdk/core/auth/Merchant;", "getCurrentMerchant", "()Lcom/zettle/sdk/core/auth/Merchant;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class MerchantProviderInternal implements com.zettle.sdk.core.user.MerchantProvider {
    public MerchantProviderInternal(com.izettle.android.auth.ZettleAuth zettleAuth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
        com.zettle.sdk.core.auth.MerchantConfigExtKt.getUserConfigState(zettleAuth);
    }

    @Override // com.zettle.sdk.core.user.MerchantProvider
    public final com.zettle.sdk.core.auth.Merchant.LoggedIn getCurrentLoggedInMerchant() {
        return com.zettle.sdk.core.user.MerchantProvider.DefaultImpls.getCurrentLoggedInMerchant(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zettle.sdk.core.user.MerchantProvider
    public final com.zettle.sdk.core.auth.Merchant getCurrentMerchant() {
        androidx.view.MutableLiveData mutableLiveData;
        mutableLiveData = com.zettle.sdk.core.auth.MerchantConfigExtKt.getHighSpeedVideoFpsRangesFor;
        com.zettle.sdk.core.auth.User.AuthState authState = (com.zettle.sdk.core.auth.User.AuthState) mutableLiveData.getValue();
        if (!(authState instanceof com.zettle.sdk.core.auth.User.AuthState.LoggedIn)) {
            return com.zettle.sdk.core.auth.Merchant.LoggedOut.INSTANCE;
        }
        com.zettle.sdk.core.auth.User.AuthState.LoggedIn loggedIn = (com.zettle.sdk.core.auth.User.AuthState.LoggedIn) authState;
        return new com.zettle.sdk.core.auth.Merchant.LoggedIn(loggedIn.getInfo().getGetHighSpeedVideoSizesFor(), loggedIn.getInfo().getGetHighSpeedVideoFpsRangesFor());
    }
}

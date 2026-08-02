package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0015\u0010\r\u001a\u00020\n*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001d\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/MutableLiveData;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/auth/merchant/MerchantDefaultDetailedConfig;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/core/auth/merchant/MerchantDefaultDetailedConfig;", "getHighSpeedVideoSizes", "Lcom/izettle/android/auth/ZettleAuth;", "Lcom/zettle/sdk/core/user/MerchantProvider;", "getMerchantProvider", "(Lcom/izettle/android/auth/ZettleAuth;)Lcom/zettle/sdk/core/user/MerchantProvider;", "merchantProvider", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "getUserConfigState", "(Lcom/izettle/android/auth/ZettleAuth;)Lcom/zettle/sdk/commons/state/State;", "userConfigState"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MerchantConfigExtKt {
    private static com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig getHighSpeedVideoFpsRanges;
    private static final androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> getHighSpeedVideoFpsRangesFor = new androidx.view.MutableLiveData<>();

    public static final com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> getUserConfigState(com.izettle.android.auth.ZettleAuth zettleAuth) {
        com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> userConfigState;
        synchronized (com.zettle.sdk.core.auth.MerchantConfigExtKt.class) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
            com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig merchantDefaultDetailedConfig = getHighSpeedVideoFpsRanges;
            if (merchantDefaultDetailedConfig == null) {
                merchantDefaultDetailedConfig = new com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig(zettleAuth, getHighSpeedVideoFpsRangesFor);
            }
            getHighSpeedVideoFpsRanges = merchantDefaultDetailedConfig;
            userConfigState = merchantDefaultDetailedConfig.getUserConfigState();
        }
        return userConfigState;
    }

    public static final com.zettle.sdk.core.user.MerchantProvider getMerchantProvider(com.izettle.android.auth.ZettleAuth zettleAuth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
        return new com.zettle.sdk.core.auth.MerchantProviderInternal(zettleAuth);
    }
}

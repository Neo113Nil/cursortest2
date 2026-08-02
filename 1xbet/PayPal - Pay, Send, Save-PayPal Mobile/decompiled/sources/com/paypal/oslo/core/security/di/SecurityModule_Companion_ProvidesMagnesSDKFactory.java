package com.paypal.oslo.core.security.di;

/* loaded from: classes5.dex */
public final class SecurityModule_Companion_ProvidesMagnesSDKFactory implements dagger.internal.Factory<lib.android.paypal.com.magnessdk.MagnesSDK> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final lib.android.paypal.com.magnessdk.MagnesSDK get() {
        return providesMagnesSDK();
    }

    public static com.paypal.oslo.core.security.di.SecurityModule_Companion_ProvidesMagnesSDKFactory create() {
        return com.paypal.oslo.core.security.di.SecurityModule_Companion_ProvidesMagnesSDKFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static lib.android.paypal.com.magnessdk.MagnesSDK providesMagnesSDK() {
        return (lib.android.paypal.com.magnessdk.MagnesSDK) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.security.di.SecurityModule.INSTANCE.providesMagnesSDK());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.security.di.SecurityModule_Companion_ProvidesMagnesSDKFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.security.di.SecurityModule_Companion_ProvidesMagnesSDKFactory();

        private InstanceHolder() {
        }
    }
}

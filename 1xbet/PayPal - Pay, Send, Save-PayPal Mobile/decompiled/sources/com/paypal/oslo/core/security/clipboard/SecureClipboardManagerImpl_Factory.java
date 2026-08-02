package com.paypal.oslo.core.security.clipboard;

/* loaded from: classes10.dex */
public final class SecureClipboardManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizes;

    private SecureClipboardManagerImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2, dagger.internal.Provider<com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2, dagger.internal.Provider<com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker> provider3) {
        return new com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl newInstance(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker clipboardOwnershipTracker) {
        return new com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl(context, coroutineScope, clipboardOwnershipTracker);
    }
}

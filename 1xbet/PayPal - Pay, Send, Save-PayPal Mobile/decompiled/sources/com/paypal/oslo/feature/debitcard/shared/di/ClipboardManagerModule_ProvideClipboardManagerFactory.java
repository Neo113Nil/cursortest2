package com.paypal.oslo.feature.debitcard.shared.di;

/* loaded from: classes12.dex */
public final class ClipboardManagerModule_ProvideClipboardManagerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private ClipboardManagerModule_ProvideClipboardManagerFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager get() {
        return provideClipboardManager(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.di.ClipboardManagerModule_ProvideClipboardManagerFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.debitcard.shared.di.ClipboardManagerModule_ProvideClipboardManagerFactory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager provideClipboardManager(android.content.Context context) {
        return (com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.debitcard.shared.di.ClipboardManagerModule.INSTANCE.provideClipboardManager(context));
    }
}

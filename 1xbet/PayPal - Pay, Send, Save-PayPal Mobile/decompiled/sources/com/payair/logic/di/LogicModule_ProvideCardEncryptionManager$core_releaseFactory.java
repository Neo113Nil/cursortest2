package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideCardEncryptionManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.implementation.CardEncryptionManager> {
    public static com.payair.logic.di.LogicModule_ProvideCardEncryptionManager$core_releaseFactory create() {
        return com.payair.logic.di.a.f4433a;
    }

    public static com.payair.logic.implementation.CardEncryptionManager provideCardEncryptionManager$core_release() {
        return (com.payair.logic.implementation.CardEncryptionManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideCardEncryptionManager$core_release());
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.implementation.CardEncryptionManager get() {
        return provideCardEncryptionManager$core_release();
    }
}

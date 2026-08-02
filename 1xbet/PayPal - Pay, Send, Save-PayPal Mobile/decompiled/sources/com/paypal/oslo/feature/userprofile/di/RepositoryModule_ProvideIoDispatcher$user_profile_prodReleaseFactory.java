package com.paypal.oslo.feature.userprofile.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideIoDispatcher$user_profile_prodReleaseFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher$user_profile_prodRelease();
    }

    public static com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideIoDispatcher$user_profile_prodReleaseFactory create() {
        return com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideIoDispatcher$user_profile_prodReleaseFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher$user_profile_prodRelease() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.userprofile.di.RepositoryModule.INSTANCE.provideIoDispatcher$user_profile_prodRelease());
    }

    /* loaded from: classes15.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideIoDispatcher$user_profile_prodReleaseFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideIoDispatcher$user_profile_prodReleaseFactory();

        private InstanceHolder() {
        }
    }
}

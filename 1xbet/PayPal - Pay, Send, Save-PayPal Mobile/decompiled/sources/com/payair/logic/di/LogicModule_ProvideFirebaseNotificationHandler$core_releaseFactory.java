package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideFirebaseNotificationHandler$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.notifications.FirebaseNotificationHandler> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4410a;
    public final javax.inject.Provider b;
    public final javax.inject.Provider c;
    public final javax.inject.Provider d;
    public final javax.inject.Provider e;
    public final javax.inject.Provider f;
    public final javax.inject.Provider g;
    public final javax.inject.Provider h;
    public final javax.inject.Provider i;
    public final javax.inject.Provider j;
    public final javax.inject.Provider k;

    public LogicModule_ProvideFirebaseNotificationHandler$core_releaseFactory(javax.inject.Provider<com.payair.logic.storage.StorageService> provider, javax.inject.Provider<com.payair.logic.managers.PushManager> provider2, javax.inject.Provider<com.payair.logic.managers.SetupManager> provider3, javax.inject.Provider<com.payair.logic.managers.TokenManager> provider4, javax.inject.Provider<com.payair.logic.managers.TokenRefreshManager> provider5, javax.inject.Provider<com.payair.logic.managers.NewTransactionNotificationHandler> provider6, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider7, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider8, javax.inject.Provider<com.payair.db.Database> provider9, javax.inject.Provider<android.content.Context> provider10, javax.inject.Provider<com.payair.logic.storage.EnrollmentIdStorage> provider11) {
        this.f4410a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
        this.f = provider6;
        this.g = provider7;
        this.h = provider8;
        this.i = provider9;
        this.j = provider10;
        this.k = provider11;
    }

    public static com.payair.logic.di.LogicModule_ProvideFirebaseNotificationHandler$core_releaseFactory create(javax.inject.Provider<com.payair.logic.storage.StorageService> provider, javax.inject.Provider<com.payair.logic.managers.PushManager> provider2, javax.inject.Provider<com.payair.logic.managers.SetupManager> provider3, javax.inject.Provider<com.payair.logic.managers.TokenManager> provider4, javax.inject.Provider<com.payair.logic.managers.TokenRefreshManager> provider5, javax.inject.Provider<com.payair.logic.managers.NewTransactionNotificationHandler> provider6, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider7, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider8, javax.inject.Provider<com.payair.db.Database> provider9, javax.inject.Provider<android.content.Context> provider10, javax.inject.Provider<com.payair.logic.storage.EnrollmentIdStorage> provider11) {
        return new com.payair.logic.di.LogicModule_ProvideFirebaseNotificationHandler$core_releaseFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static com.payair.logic.notifications.FirebaseNotificationHandler provideFirebaseNotificationHandler$core_release(com.payair.logic.storage.StorageService storageService, com.payair.logic.managers.PushManager pushManager, com.payair.logic.managers.SetupManager setupManager, com.payair.logic.managers.TokenManager tokenManager, com.payair.logic.managers.TokenRefreshManager tokenRefreshManager, com.payair.logic.managers.NewTransactionNotificationHandler newTransactionNotificationHandler, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.db.Database database, android.content.Context context, com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage) {
        return (com.payair.logic.notifications.FirebaseNotificationHandler) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideFirebaseNotificationHandler$core_release(storageService, pushManager, setupManager, tokenManager, tokenRefreshManager, newTransactionNotificationHandler, hceSDKInterface, coroutineDispatcherProvider, database, context, enrollmentIdStorage));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.notifications.FirebaseNotificationHandler get() {
        return provideFirebaseNotificationHandler$core_release((com.payair.logic.storage.StorageService) this.f4410a.get(), (com.payair.logic.managers.PushManager) this.b.get(), (com.payair.logic.managers.SetupManager) this.c.get(), (com.payair.logic.managers.TokenManager) this.d.get(), (com.payair.logic.managers.TokenRefreshManager) this.e.get(), (com.payair.logic.managers.NewTransactionNotificationHandler) this.f.get(), (com.payair.logic.implementation.HceSDKInterface) this.g.get(), (com.payair.logic.managers.CoroutineDispatcherProvider) this.h.get(), (com.payair.db.Database) this.i.get(), (android.content.Context) this.j.get(), (com.payair.logic.storage.EnrollmentIdStorage) this.k.get());
    }
}

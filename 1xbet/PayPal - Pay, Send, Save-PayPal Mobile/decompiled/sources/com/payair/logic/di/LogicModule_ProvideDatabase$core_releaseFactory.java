package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideDatabase$core_releaseFactory implements dagger.internal.Factory<com.payair.db.Database> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4407a;

    public LogicModule_ProvideDatabase$core_releaseFactory(javax.inject.Provider<android.content.Context> provider) {
        this.f4407a = provider;
    }

    public static com.payair.logic.di.LogicModule_ProvideDatabase$core_releaseFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.payair.logic.di.LogicModule_ProvideDatabase$core_releaseFactory(provider);
    }

    public static com.payair.db.Database provideDatabase$core_release(android.content.Context context) {
        return (com.payair.db.Database) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideDatabase$core_release(context));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.db.Database get() {
        return provideDatabase$core_release((android.content.Context) this.f4407a.get());
    }
}

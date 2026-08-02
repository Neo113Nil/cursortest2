package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class AppModule_ProvideContextFactory implements Factory<Context> {
    private final AppModule module;

    public AppModule_ProvideContextFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return (Context) Preconditions.checkNotNull(this.module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideContextFactory create(AppModule module) {
        return new AppModule_ProvideContextFactory(module);
    }

    public static Context proxyProvideContext(AppModule instance) {
        return (Context) Preconditions.checkNotNull(instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

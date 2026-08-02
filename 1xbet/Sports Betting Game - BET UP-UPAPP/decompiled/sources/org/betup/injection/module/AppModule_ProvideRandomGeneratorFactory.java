package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Random;

/* loaded from: classes2.dex */
public final class AppModule_ProvideRandomGeneratorFactory implements Factory<Random> {
    private final AppModule module;

    public AppModule_ProvideRandomGeneratorFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public Random get() {
        return (Random) Preconditions.checkNotNull(this.module.provideRandomGenerator(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideRandomGeneratorFactory create(AppModule module) {
        return new AppModule_ProvideRandomGeneratorFactory(module);
    }

    public static Random proxyProvideRandomGenerator(AppModule instance) {
        return (Random) Preconditions.checkNotNull(instance.provideRandomGenerator(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

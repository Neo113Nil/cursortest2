package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.local.AppDatabase;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class AppModule_ProvideDatabaseFactory implements Factory<AppDatabase> {
    private final Provider<Context> contextProvider;
    private final AppModule module;
    private final Provider<UserService> userServiceProvider;

    public AppModule_ProvideDatabaseFactory(AppModule module, Provider<Context> contextProvider, Provider<UserService> userServiceProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public AppDatabase get() {
        return (AppDatabase) Preconditions.checkNotNull(this.module.provideDatabase(this.contextProvider.get(), this.userServiceProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideDatabaseFactory create(AppModule module, Provider<Context> contextProvider, Provider<UserService> userServiceProvider) {
        return new AppModule_ProvideDatabaseFactory(module, contextProvider, userServiceProvider);
    }

    public static AppDatabase proxyProvideDatabase(AppModule instance, Context context, UserService userService) {
        return (AppDatabase) Preconditions.checkNotNull(instance.provideDatabase(context, userService), "Cannot return null from a non-@Nullable @Provides method");
    }
}

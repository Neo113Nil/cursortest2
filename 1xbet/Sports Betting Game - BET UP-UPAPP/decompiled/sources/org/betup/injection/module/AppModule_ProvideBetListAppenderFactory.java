package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class AppModule_ProvideBetListAppenderFactory implements Factory<BetListAppender> {
    private final Provider<BetValidator> betValidatorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final AppModule module;
    private final Provider<UserService> userServiceProvider;

    public AppModule_ProvideBetListAppenderFactory(AppModule module, Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<BetValidator> betValidatorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
        this.userServiceProvider = userServiceProvider;
        this.betValidatorProvider = betValidatorProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    @Override // javax.inject.Provider
    public BetListAppender get() {
        return (BetListAppender) Preconditions.checkNotNull(this.module.provideBetListAppender(this.contextProvider.get(), this.userServiceProvider.get(), this.betValidatorProvider.get(), this.localPreferencesServiceProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideBetListAppenderFactory create(AppModule module, Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<BetValidator> betValidatorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new AppModule_ProvideBetListAppenderFactory(module, contextProvider, userServiceProvider, betValidatorProvider, localPreferencesServiceProvider);
    }

    public static BetListAppender proxyProvideBetListAppender(AppModule instance, Context context, UserService userService, BetValidator betValidator, LocalPreferencesService localPreferencesService) {
        return (BetListAppender) Preconditions.checkNotNull(instance.provideBetListAppender(context, userService, betValidator, localPreferencesService), "Cannot return null from a non-@Nullable @Provides method");
    }
}

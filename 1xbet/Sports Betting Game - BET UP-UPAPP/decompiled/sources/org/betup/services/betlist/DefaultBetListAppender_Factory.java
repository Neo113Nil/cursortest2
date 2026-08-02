package org.betup.services.betlist;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class DefaultBetListAppender_Factory implements Factory<DefaultBetListAppender> {
    private final Provider<BetValidator> betValidatorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<UserService> userServiceProvider;

    public DefaultBetListAppender_Factory(Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<BetValidator> betValidatorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.contextProvider = contextProvider;
        this.userServiceProvider = userServiceProvider;
        this.betValidatorProvider = betValidatorProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    @Override // javax.inject.Provider
    public DefaultBetListAppender get() {
        return new DefaultBetListAppender(this.contextProvider.get(), this.userServiceProvider.get(), this.betValidatorProvider.get(), this.localPreferencesServiceProvider.get());
    }

    public static DefaultBetListAppender_Factory create(Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<BetValidator> betValidatorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new DefaultBetListAppender_Factory(contextProvider, userServiceProvider, betValidatorProvider, localPreferencesServiceProvider);
    }
}

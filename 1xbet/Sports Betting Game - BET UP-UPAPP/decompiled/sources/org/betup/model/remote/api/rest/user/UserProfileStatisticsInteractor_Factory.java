package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class UserProfileStatisticsInteractor_Factory implements Factory<UserProfileStatisticsInteractor> {
    private final Provider<Context> contextProvider;

    public UserProfileStatisticsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public UserProfileStatisticsInteractor get() {
        return new UserProfileStatisticsInteractor(this.contextProvider.get());
    }

    public static UserProfileStatisticsInteractor_Factory create(Provider<Context> contextProvider) {
        return new UserProfileStatisticsInteractor_Factory(contextProvider);
    }
}

package org.betup.services.user;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.GetUserTagSlugsInteractor;

/* loaded from: classes2.dex */
public final class UserAnalyticsTagsService_Factory implements Factory<UserAnalyticsTagsService> {
    private final Provider<GetUserTagSlugsInteractor> getUserTagSlugsInteractorProvider;

    public UserAnalyticsTagsService_Factory(Provider<GetUserTagSlugsInteractor> getUserTagSlugsInteractorProvider) {
        this.getUserTagSlugsInteractorProvider = getUserTagSlugsInteractorProvider;
    }

    @Override // javax.inject.Provider
    public UserAnalyticsTagsService get() {
        return new UserAnalyticsTagsService(this.getUserTagSlugsInteractorProvider.get());
    }

    public static UserAnalyticsTagsService_Factory create(Provider<GetUserTagSlugsInteractor> getUserTagSlugsInteractorProvider) {
        return new UserAnalyticsTagsService_Factory(getUserTagSlugsInteractorProvider);
    }
}

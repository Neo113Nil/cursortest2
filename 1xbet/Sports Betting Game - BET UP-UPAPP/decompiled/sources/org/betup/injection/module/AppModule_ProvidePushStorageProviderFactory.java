package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.local.interactor.AddEventInteractor;
import org.betup.model.local.interactor.GetNewEventsCountInteractor;
import org.betup.model.local.interactor.GetNewEventsCountInteractorByUUID;
import org.betup.model.local.interactor.ReadAllEventsInteractor;
import org.betup.model.local.interactor.ReadEventInteractor;
import org.betup.services.push.PushStorageProvider;

/* loaded from: classes2.dex */
public final class AppModule_ProvidePushStorageProviderFactory implements Factory<PushStorageProvider> {
    private final Provider<AddEventInteractor> addEventInteractorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<GetNewEventsCountInteractorByUUID> getNewEventsCountInteractorByUUIDProvider;
    private final Provider<GetNewEventsCountInteractor> getNewEventsCountInteractorProvider;
    private final AppModule module;
    private final Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider;
    private final Provider<ReadEventInteractor> readEventInteractorProvider;

    public AppModule_ProvidePushStorageProviderFactory(AppModule module, Provider<Context> contextProvider, Provider<AddEventInteractor> addEventInteractorProvider, Provider<GetNewEventsCountInteractor> getNewEventsCountInteractorProvider, Provider<ReadEventInteractor> readEventInteractorProvider, Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider, Provider<GetNewEventsCountInteractorByUUID> getNewEventsCountInteractorByUUIDProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
        this.addEventInteractorProvider = addEventInteractorProvider;
        this.getNewEventsCountInteractorProvider = getNewEventsCountInteractorProvider;
        this.readEventInteractorProvider = readEventInteractorProvider;
        this.readAllEventsInteractorProvider = readAllEventsInteractorProvider;
        this.getNewEventsCountInteractorByUUIDProvider = getNewEventsCountInteractorByUUIDProvider;
    }

    @Override // javax.inject.Provider
    public PushStorageProvider get() {
        return (PushStorageProvider) Preconditions.checkNotNull(this.module.providePushStorageProvider(this.contextProvider.get(), this.addEventInteractorProvider.get(), this.getNewEventsCountInteractorProvider.get(), this.readEventInteractorProvider.get(), this.readAllEventsInteractorProvider.get(), this.getNewEventsCountInteractorByUUIDProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvidePushStorageProviderFactory create(AppModule module, Provider<Context> contextProvider, Provider<AddEventInteractor> addEventInteractorProvider, Provider<GetNewEventsCountInteractor> getNewEventsCountInteractorProvider, Provider<ReadEventInteractor> readEventInteractorProvider, Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider, Provider<GetNewEventsCountInteractorByUUID> getNewEventsCountInteractorByUUIDProvider) {
        return new AppModule_ProvidePushStorageProviderFactory(module, contextProvider, addEventInteractorProvider, getNewEventsCountInteractorProvider, readEventInteractorProvider, readAllEventsInteractorProvider, getNewEventsCountInteractorByUUIDProvider);
    }

    public static PushStorageProvider proxyProvidePushStorageProvider(AppModule instance, Context context, AddEventInteractor addEventInteractor, GetNewEventsCountInteractor getNewEventsCountInteractor, ReadEventInteractor readEventInteractor, ReadAllEventsInteractor readAllEventsInteractor, GetNewEventsCountInteractorByUUID getNewEventsCountInteractorByUUID) {
        return (PushStorageProvider) Preconditions.checkNotNull(instance.providePushStorageProvider(context, addEventInteractor, getNewEventsCountInteractor, readEventInteractor, readAllEventsInteractor, getNewEventsCountInteractorByUUID), "Cannot return null from a non-@Nullable @Provides method");
    }
}

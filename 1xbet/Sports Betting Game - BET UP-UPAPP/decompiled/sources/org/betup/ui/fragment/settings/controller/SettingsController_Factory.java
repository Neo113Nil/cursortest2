package org.betup.ui.fragment.settings.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.ChangeV7NameInteractor;
import org.betup.model.remote.api.rest.user.GetV7MyInfoInteractor;
import org.betup.model.remote.api.rest.user.UpdateV7PushPreferencesInteractor;
import org.betup.model.remote.api.rest.user.V7ReferralInteractor;
import org.betup.model.remote.api.rest.user.changephoto.ChangeV7ProfilePhotoInteractor;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class SettingsController_Factory implements Factory<SettingsController> {
    private final Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider;
    private final Provider<ChangeV7ProfilePhotoInteractor> changeV7ProfilePhotoInteractorProvider;
    private final Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<UpdateV7PushPreferencesInteractor> updateV7PushPreferencesInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7ReferralInteractor> v7ReferralInteractorProvider;

    public SettingsController_Factory(Provider<UserService> userServiceProvider, Provider<ChangeV7ProfilePhotoInteractor> changeV7ProfilePhotoInteractorProvider, Provider<V7ReferralInteractor> v7ReferralInteractorProvider, Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider, Provider<UpdateV7PushPreferencesInteractor> updateV7PushPreferencesInteractorProvider, Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.userServiceProvider = userServiceProvider;
        this.changeV7ProfilePhotoInteractorProvider = changeV7ProfilePhotoInteractorProvider;
        this.v7ReferralInteractorProvider = v7ReferralInteractorProvider;
        this.getV7MyInfoInteractorProvider = getV7MyInfoInteractorProvider;
        this.updateV7PushPreferencesInteractorProvider = updateV7PushPreferencesInteractorProvider;
        this.changeV7NameInteractorProvider = changeV7NameInteractorProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    @Override // javax.inject.Provider
    public SettingsController get() {
        SettingsController settingsController = new SettingsController();
        SettingsController_MembersInjector.injectUserService(settingsController, this.userServiceProvider.get());
        SettingsController_MembersInjector.injectChangeV7ProfilePhotoInteractor(settingsController, this.changeV7ProfilePhotoInteractorProvider.get());
        SettingsController_MembersInjector.injectV7ReferralInteractor(settingsController, this.v7ReferralInteractorProvider.get());
        SettingsController_MembersInjector.injectGetV7MyInfoInteractor(settingsController, this.getV7MyInfoInteractorProvider.get());
        SettingsController_MembersInjector.injectUpdateV7PushPreferencesInteractor(settingsController, this.updateV7PushPreferencesInteractorProvider.get());
        SettingsController_MembersInjector.injectChangeV7NameInteractor(settingsController, this.changeV7NameInteractorProvider.get());
        SettingsController_MembersInjector.injectLocalPreferencesService(settingsController, this.localPreferencesServiceProvider.get());
        return settingsController;
    }

    public static SettingsController_Factory create(Provider<UserService> userServiceProvider, Provider<ChangeV7ProfilePhotoInteractor> changeV7ProfilePhotoInteractorProvider, Provider<V7ReferralInteractor> v7ReferralInteractorProvider, Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider, Provider<UpdateV7PushPreferencesInteractor> updateV7PushPreferencesInteractorProvider, Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new SettingsController_Factory(userServiceProvider, changeV7ProfilePhotoInteractorProvider, v7ReferralInteractorProvider, getV7MyInfoInteractorProvider, updateV7PushPreferencesInteractorProvider, changeV7NameInteractorProvider, localPreferencesServiceProvider);
    }

    public static SettingsController newSettingsController() {
        return new SettingsController();
    }
}

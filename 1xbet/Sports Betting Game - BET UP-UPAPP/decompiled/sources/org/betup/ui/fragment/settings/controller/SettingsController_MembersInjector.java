package org.betup.ui.fragment.settings.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.ChangeV7NameInteractor;
import org.betup.model.remote.api.rest.user.GetV7MyInfoInteractor;
import org.betup.model.remote.api.rest.user.UpdateV7PushPreferencesInteractor;
import org.betup.model.remote.api.rest.user.V7ReferralInteractor;
import org.betup.model.remote.api.rest.user.changephoto.ChangeV7ProfilePhotoInteractor;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class SettingsController_MembersInjector implements MembersInjector<SettingsController> {
    private final Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider;
    private final Provider<ChangeV7ProfilePhotoInteractor> changeV7ProfilePhotoInteractorProvider;
    private final Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<UpdateV7PushPreferencesInteractor> updateV7PushPreferencesInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7ReferralInteractor> v7ReferralInteractorProvider;

    public SettingsController_MembersInjector(Provider<UserService> userServiceProvider, Provider<ChangeV7ProfilePhotoInteractor> changeV7ProfilePhotoInteractorProvider, Provider<V7ReferralInteractor> v7ReferralInteractorProvider, Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider, Provider<UpdateV7PushPreferencesInteractor> updateV7PushPreferencesInteractorProvider, Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.userServiceProvider = userServiceProvider;
        this.changeV7ProfilePhotoInteractorProvider = changeV7ProfilePhotoInteractorProvider;
        this.v7ReferralInteractorProvider = v7ReferralInteractorProvider;
        this.getV7MyInfoInteractorProvider = getV7MyInfoInteractorProvider;
        this.updateV7PushPreferencesInteractorProvider = updateV7PushPreferencesInteractorProvider;
        this.changeV7NameInteractorProvider = changeV7NameInteractorProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    public static MembersInjector<SettingsController> create(Provider<UserService> userServiceProvider, Provider<ChangeV7ProfilePhotoInteractor> changeV7ProfilePhotoInteractorProvider, Provider<V7ReferralInteractor> v7ReferralInteractorProvider, Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider, Provider<UpdateV7PushPreferencesInteractor> updateV7PushPreferencesInteractorProvider, Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new SettingsController_MembersInjector(userServiceProvider, changeV7ProfilePhotoInteractorProvider, v7ReferralInteractorProvider, getV7MyInfoInteractorProvider, updateV7PushPreferencesInteractorProvider, changeV7NameInteractorProvider, localPreferencesServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SettingsController instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectChangeV7ProfilePhotoInteractor(instance, this.changeV7ProfilePhotoInteractorProvider.get());
        injectV7ReferralInteractor(instance, this.v7ReferralInteractorProvider.get());
        injectGetV7MyInfoInteractor(instance, this.getV7MyInfoInteractorProvider.get());
        injectUpdateV7PushPreferencesInteractor(instance, this.updateV7PushPreferencesInteractorProvider.get());
        injectChangeV7NameInteractor(instance, this.changeV7NameInteractorProvider.get());
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
    }

    public static void injectUserService(SettingsController instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectChangeV7ProfilePhotoInteractor(SettingsController instance, ChangeV7ProfilePhotoInteractor changeV7ProfilePhotoInteractor) {
        instance.changeV7ProfilePhotoInteractor = changeV7ProfilePhotoInteractor;
    }

    public static void injectV7ReferralInteractor(SettingsController instance, V7ReferralInteractor v7ReferralInteractor) {
        instance.v7ReferralInteractor = v7ReferralInteractor;
    }

    public static void injectGetV7MyInfoInteractor(SettingsController instance, GetV7MyInfoInteractor getV7MyInfoInteractor) {
        instance.getV7MyInfoInteractor = getV7MyInfoInteractor;
    }

    public static void injectUpdateV7PushPreferencesInteractor(SettingsController instance, UpdateV7PushPreferencesInteractor updateV7PushPreferencesInteractor) {
        instance.updateV7PushPreferencesInteractor = updateV7PushPreferencesInteractor;
    }

    public static void injectChangeV7NameInteractor(SettingsController instance, ChangeV7NameInteractor changeV7NameInteractor) {
        instance.changeV7NameInteractor = changeV7NameInteractor;
    }

    public static void injectLocalPreferencesService(SettingsController instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }
}

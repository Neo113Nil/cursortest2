package org.betup.ui.fragment.settings;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.settings.controller.SettingsController;

/* loaded from: classes4.dex */
public final class NewSettingsFragment_MembersInjector implements MembersInjector<NewSettingsFragment> {
    private final Provider<SettingsController> settingsControllerProvider;

    public NewSettingsFragment_MembersInjector(Provider<SettingsController> settingsControllerProvider) {
        this.settingsControllerProvider = settingsControllerProvider;
    }

    public static MembersInjector<NewSettingsFragment> create(Provider<SettingsController> settingsControllerProvider) {
        return new NewSettingsFragment_MembersInjector(settingsControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewSettingsFragment instance) {
        injectSettingsController(instance, this.settingsControllerProvider.get());
    }

    public static void injectSettingsController(NewSettingsFragment instance, SettingsController settingsController) {
        instance.settingsController = settingsController;
    }
}

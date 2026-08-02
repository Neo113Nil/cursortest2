package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes2.dex */
public final class DialogConsent_MembersInjector implements MembersInjector<DialogConsent> {
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;

    public DialogConsent_MembersInjector(Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    public static MembersInjector<DialogConsent> create(Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new DialogConsent_MembersInjector(localPreferencesServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DialogConsent instance) {
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
    }

    public static void injectLocalPreferencesService(DialogConsent instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }
}

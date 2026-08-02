package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.country.GetV7CountriesInteractor;
import org.betup.model.remote.api.rest.user.ChangeV7CountryInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class ChangeCountryDialogFragment_MembersInjector implements MembersInjector<ChangeCountryDialogFragment> {
    private final Provider<ChangeV7CountryInteractor> changeCountryInteractorProvider;
    private final Provider<GetV7CountriesInteractor> getCountriesInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public ChangeCountryDialogFragment_MembersInjector(Provider<UserService> userServiceProvider, Provider<GetV7CountriesInteractor> getCountriesInteractorProvider, Provider<ChangeV7CountryInteractor> changeCountryInteractorProvider) {
        this.userServiceProvider = userServiceProvider;
        this.getCountriesInteractorProvider = getCountriesInteractorProvider;
        this.changeCountryInteractorProvider = changeCountryInteractorProvider;
    }

    public static MembersInjector<ChangeCountryDialogFragment> create(Provider<UserService> userServiceProvider, Provider<GetV7CountriesInteractor> getCountriesInteractorProvider, Provider<ChangeV7CountryInteractor> changeCountryInteractorProvider) {
        return new ChangeCountryDialogFragment_MembersInjector(userServiceProvider, getCountriesInteractorProvider, changeCountryInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChangeCountryDialogFragment instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectGetCountriesInteractor(instance, this.getCountriesInteractorProvider.get());
        injectChangeCountryInteractor(instance, this.changeCountryInteractorProvider.get());
    }

    public static void injectUserService(ChangeCountryDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectGetCountriesInteractor(ChangeCountryDialogFragment instance, GetV7CountriesInteractor getCountriesInteractor) {
        instance.getCountriesInteractor = getCountriesInteractor;
    }

    public static void injectChangeCountryInteractor(ChangeCountryDialogFragment instance, ChangeV7CountryInteractor changeCountryInteractor) {
        instance.changeCountryInteractor = changeCountryInteractor;
    }
}

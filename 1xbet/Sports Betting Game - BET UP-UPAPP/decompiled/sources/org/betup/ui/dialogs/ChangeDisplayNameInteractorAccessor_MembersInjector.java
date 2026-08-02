package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.ChangeV7NameInteractor;

/* loaded from: classes2.dex */
public final class ChangeDisplayNameInteractorAccessor_MembersInjector implements MembersInjector<ChangeDisplayNameInteractorAccessor> {
    private final Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider;

    public ChangeDisplayNameInteractorAccessor_MembersInjector(Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider) {
        this.changeV7NameInteractorProvider = changeV7NameInteractorProvider;
    }

    public static MembersInjector<ChangeDisplayNameInteractorAccessor> create(Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider) {
        return new ChangeDisplayNameInteractorAccessor_MembersInjector(changeV7NameInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChangeDisplayNameInteractorAccessor instance) {
        injectChangeV7NameInteractor(instance, this.changeV7NameInteractorProvider.get());
    }

    public static void injectChangeV7NameInteractor(ChangeDisplayNameInteractorAccessor instance, ChangeV7NameInteractor changeV7NameInteractor) {
        instance.changeV7NameInteractor = changeV7NameInteractor;
    }
}

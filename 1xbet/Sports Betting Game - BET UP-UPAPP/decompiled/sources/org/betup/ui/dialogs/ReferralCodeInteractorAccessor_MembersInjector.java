package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7ReferralInteractor;

/* loaded from: classes2.dex */
public final class ReferralCodeInteractorAccessor_MembersInjector implements MembersInjector<ReferralCodeInteractorAccessor> {
    private final Provider<V7ReferralInteractor> v7ReferralInteractorProvider;

    public ReferralCodeInteractorAccessor_MembersInjector(Provider<V7ReferralInteractor> v7ReferralInteractorProvider) {
        this.v7ReferralInteractorProvider = v7ReferralInteractorProvider;
    }

    public static MembersInjector<ReferralCodeInteractorAccessor> create(Provider<V7ReferralInteractor> v7ReferralInteractorProvider) {
        return new ReferralCodeInteractorAccessor_MembersInjector(v7ReferralInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ReferralCodeInteractorAccessor instance) {
        injectV7ReferralInteractor(instance, this.v7ReferralInteractorProvider.get());
    }

    public static void injectV7ReferralInteractor(ReferralCodeInteractorAccessor instance, V7ReferralInteractor v7ReferralInteractor) {
        instance.v7ReferralInteractor = v7ReferralInteractor;
    }
}

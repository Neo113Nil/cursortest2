package org.betup.ui.tour;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.challenge.ChallengeTourInfoProvider;

/* loaded from: classes4.dex */
public final class IntroChallengeActivity_MembersInjector implements MembersInjector<IntroChallengeActivity> {
    private final Provider<ChallengeTourInfoProvider> challengeTourInfoProvider;

    public IntroChallengeActivity_MembersInjector(Provider<ChallengeTourInfoProvider> challengeTourInfoProvider) {
        this.challengeTourInfoProvider = challengeTourInfoProvider;
    }

    public static MembersInjector<IntroChallengeActivity> create(Provider<ChallengeTourInfoProvider> challengeTourInfoProvider) {
        return new IntroChallengeActivity_MembersInjector(challengeTourInfoProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(IntroChallengeActivity instance) {
        injectChallengeTourInfoProvider(instance, this.challengeTourInfoProvider.get());
    }

    public static void injectChallengeTourInfoProvider(IntroChallengeActivity instance, ChallengeTourInfoProvider challengeTourInfoProvider) {
        instance.challengeTourInfoProvider = challengeTourInfoProvider;
    }
}

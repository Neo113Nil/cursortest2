package org.betup.model.remote.api.rest.rewardedprompt;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetEligibleRewardedPromptsInteractor_Factory implements Factory<GetEligibleRewardedPromptsInteractor> {
    private final Provider<Context> contextProvider;

    public GetEligibleRewardedPromptsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetEligibleRewardedPromptsInteractor get() {
        return new GetEligibleRewardedPromptsInteractor(this.contextProvider.get());
    }

    public static GetEligibleRewardedPromptsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetEligibleRewardedPromptsInteractor_Factory(contextProvider);
    }
}

package org.betup.model.remote.api.rest.rewardedprompt;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetRewardedPromptCampaignInteractor_Factory implements Factory<GetRewardedPromptCampaignInteractor> {
    private final Provider<Context> contextProvider;

    public GetRewardedPromptCampaignInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetRewardedPromptCampaignInteractor get() {
        return new GetRewardedPromptCampaignInteractor(this.contextProvider.get());
    }

    public static GetRewardedPromptCampaignInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetRewardedPromptCampaignInteractor_Factory(contextProvider);
    }
}

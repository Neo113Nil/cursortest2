package org.betup.model.remote.api.rest.rewardedprompt;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PostRewardedPromptActionInteractor_Factory implements Factory<PostRewardedPromptActionInteractor> {
    private final Provider<Context> contextProvider;

    public PostRewardedPromptActionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PostRewardedPromptActionInteractor get() {
        return new PostRewardedPromptActionInteractor(this.contextProvider.get());
    }

    public static PostRewardedPromptActionInteractor_Factory create(Provider<Context> contextProvider) {
        return new PostRewardedPromptActionInteractor_Factory(contextProvider);
    }
}

package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.LeaveFlashBetSessionInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideLeaveFlashBetSessionInteractorFactory implements Factory<LeaveFlashBetSessionInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideLeaveFlashBetSessionInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public LeaveFlashBetSessionInteractor get() {
        return (LeaveFlashBetSessionInteractor) Preconditions.checkNotNull(this.module.provideLeaveFlashBetSessionInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideLeaveFlashBetSessionInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideLeaveFlashBetSessionInteractorFactory(module, contextProvider);
    }

    public static LeaveFlashBetSessionInteractor proxyProvideLeaveFlashBetSessionInteractor(RestModule instance, Context context) {
        return (LeaveFlashBetSessionInteractor) Preconditions.checkNotNull(instance.provideLeaveFlashBetSessionInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}

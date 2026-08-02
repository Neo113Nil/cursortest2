package org.betup.model.remote.api.rest.base;

import android.content.Context;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;

/* loaded from: classes2.dex */
public abstract class BaseNewVersionBettingInteractor<T, S> extends BaseTokenInteractor<T, S, NewVersionBettingApi> {
    public BaseNewVersionBettingInteractor(Context context) {
        super(context);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseInteractor
    public Class<NewVersionBettingApi> getApi() {
        return NewVersionBettingApi.class;
    }
}

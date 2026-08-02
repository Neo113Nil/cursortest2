package org.betup.model.remote.api.rest.base;

import android.content.Context;
import org.betup.model.remote.api.infrastructure.BettingApi;

/* loaded from: classes2.dex */
public abstract class BaseBettingInteractor<T, S> extends BaseTokenInteractor<T, S, BettingApi> {
    public BaseBettingInteractor(Context context) {
        super(context);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseInteractor
    public Class<BettingApi> getApi() {
        return BettingApi.class;
    }
}

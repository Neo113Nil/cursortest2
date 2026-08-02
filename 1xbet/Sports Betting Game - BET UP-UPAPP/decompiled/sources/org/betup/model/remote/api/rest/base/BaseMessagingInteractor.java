package org.betup.model.remote.api.rest.base;

import android.content.Context;
import org.betup.model.remote.api.infrastructure.MessagingApi;

/* loaded from: classes2.dex */
public abstract class BaseMessagingInteractor<T, S> extends BaseTokenInteractor<T, S, MessagingApi> {
    public BaseMessagingInteractor(Context context) {
        super(context);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseInteractor
    public Class<MessagingApi> getApi() {
        return MessagingApi.class;
    }
}

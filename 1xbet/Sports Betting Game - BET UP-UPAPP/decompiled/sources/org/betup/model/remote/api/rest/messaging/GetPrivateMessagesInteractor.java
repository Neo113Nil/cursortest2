package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.PageModel;
import org.betup.model.remote.entity.messaging.ExtendedMessageModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetPrivateMessagesInteractor extends BaseMessagingInteractor<PageModel<ExtendedMessageModel>, Long> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Long id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public GetPrivateMessagesInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<PageModel<ExtendedMessageModel>> makeCall(MessagingApi api, Long id, Bundle parameters, String token) {
        return api.getPrivateMessages(token, id.longValue(), parameters.getString("continuationToken"));
    }
}

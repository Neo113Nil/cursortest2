package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.PageModel;
import org.betup.model.remote.entity.messaging.ChatModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetChatsInteractor extends BaseMessagingInteractor<PageModel<ChatModel>, Void> {
    private static final long LIFETIME = 0;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public GetChatsInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<PageModel<ChatModel>> makeCall(MessagingApi api, Void id, Bundle parameters, String token) {
        return api.getChats(token, parameters.getInt("continuationToken"));
    }
}

package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.messaging.ChatInfoModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class PublicChatInfoInteractor extends BaseMessagingInteractor<ChatInfoModel, Long> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Long id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public PublicChatInfoInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<ChatInfoModel> makeCall(MessagingApi api, Long id, Bundle parameters, String token) {
        return api.getPublicChatInfo(token, id.longValue());
    }
}

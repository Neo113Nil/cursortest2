package org.betup.model.remote.api.rest.support;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.support.CreateSupportChatDto;
import org.betup.model.remote.entity.support.SupportChatDto;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class CreateSupportChatInteractor extends BaseMessagingInteractor<SupportChatDto, Void> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public CreateSupportChatInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<SupportChatDto> makeCall(MessagingApi api, Void id, Bundle parameters, String token) {
        return api.createSupportChat(token, new CreateSupportChatDto(parameters.getString("chatName"), parameters.getString("message"), parameters.getString("categoryId")));
    }
}

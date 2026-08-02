package org.betup.model.remote.api.rest.support;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.ResponseBody;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class CloseSupportChatInteractor extends BaseMessagingInteractor<ResponseBody, String> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String chatId, Bundle parameters) {
        return 0L;
    }

    @Inject
    public CloseSupportChatInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<ResponseBody> makeCall(MessagingApi api, String chatId, Bundle parameters, String token) {
        return api.closeSupportChat(token, chatId);
    }
}

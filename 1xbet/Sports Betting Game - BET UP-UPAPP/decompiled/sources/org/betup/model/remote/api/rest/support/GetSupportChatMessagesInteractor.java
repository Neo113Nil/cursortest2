package org.betup.model.remote.api.rest.support;

import android.content.Context;
import android.os.Bundle;
import com.vk.sdk.api.VKApiConst;
import com.vk.sdk.api.model.VKAttachments;
import io.sentry.rrweb.RRWebVideoEvent;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.PageModel;
import org.betup.model.remote.entity.support.MessageWithReactionsDto;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetSupportChatMessagesInteractor extends BaseMessagingInteractor<PageModel<MessageWithReactionsDto>, String> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String chatId, Bundle parameters) {
        return 0L;
    }

    @Inject
    public GetSupportChatMessagesInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<PageModel<MessageWithReactionsDto>> makeCall(MessagingApi api, String chatId, Bundle parameters, String token) {
        return api.getSupportChatMessages(token, chatId, Integer.valueOf(parameters.containsKey(VKAttachments.TYPE_WIKI_PAGE) ? parameters.getInt(VKAttachments.TYPE_WIKI_PAGE) : 0), parameters.containsKey(RRWebVideoEvent.JsonKeys.SIZE) ? Integer.valueOf(parameters.getInt(RRWebVideoEvent.JsonKeys.SIZE)) : null, parameters.getString(VKApiConst.SORT), parameters.getString("continuationToken"));
    }
}

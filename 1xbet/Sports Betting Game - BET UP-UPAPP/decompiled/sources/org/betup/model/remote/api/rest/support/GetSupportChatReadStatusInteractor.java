package org.betup.model.remote.api.rest.support;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.support.ChatReadStatusDto;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetSupportChatReadStatusInteractor extends BaseMessagingInteractor<List<ChatReadStatusDto>, Void> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public GetSupportChatReadStatusInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<List<ChatReadStatusDto>> makeCall(MessagingApi api, Void id, Bundle parameters, String token) {
        long[] longArray = parameters.getLongArray("chatIds");
        if (longArray == null || longArray.length == 0) {
            return api.getSupportChatReadStatus(token, Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        for (long j : longArray) {
            arrayList.add(Long.valueOf(j));
        }
        return api.getSupportChatReadStatus(token, arrayList);
    }
}

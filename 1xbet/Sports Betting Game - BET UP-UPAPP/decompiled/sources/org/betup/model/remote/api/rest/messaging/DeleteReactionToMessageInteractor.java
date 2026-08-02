package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.messaging.ExtendedMessageModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class DeleteReactionToMessageInteractor extends BaseMessagingInteractor<ExtendedMessageModel, Integer> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Integer id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public DeleteReactionToMessageInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<ExtendedMessageModel> makeCall(MessagingApi api, Integer id, Bundle parameters, String token) {
        return api.deleteReactionToMessage(token, parameters.getInt("messageId"));
    }
}

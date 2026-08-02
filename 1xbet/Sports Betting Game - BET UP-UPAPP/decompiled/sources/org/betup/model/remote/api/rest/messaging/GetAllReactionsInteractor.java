package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.messaging.ReactionModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetAllReactionsInteractor extends BaseMessagingInteractor<List<ReactionModel>, Integer> {
    private static final long LIFETIME = 600000000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Integer id, Bundle parameters) {
        return LIFETIME;
    }

    @Inject
    public GetAllReactionsInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<List<ReactionModel>> makeCall(MessagingApi api, Integer id, Bundle parameters, String token) {
        return api.getReactions(token);
    }
}

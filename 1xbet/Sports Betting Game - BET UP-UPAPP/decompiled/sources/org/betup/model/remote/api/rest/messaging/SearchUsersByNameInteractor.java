package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.PageModel;
import org.betup.model.remote.entity.messaging.CorrespondentModel;
import org.betup.utils.HashCoder;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class SearchUsersByNameInteractor extends BaseMessagingInteractor<PageModel<CorrespondentModel>, String> {
    public static final long LIFETIME = 60000;

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 60000L;
    }

    @Inject
    public SearchUsersByNameInteractor(Context context) {
        super(context);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(String id, Bundle parameters) {
        return HashCoder.hashCode(id, parameters.getString("continuationToken"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<PageModel<CorrespondentModel>> makeCall(MessagingApi api, String id, Bundle parameters, String token) {
        return api.searchUsersByName(id, parameters.getString("continuationToken"));
    }
}

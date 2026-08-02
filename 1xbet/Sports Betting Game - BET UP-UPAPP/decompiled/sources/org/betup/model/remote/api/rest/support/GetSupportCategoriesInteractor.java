package org.betup.model.remote.api.rest.support;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.rest.base.BaseMessagingInteractor;
import org.betup.model.remote.entity.support.SupportCategoryDto;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetSupportCategoriesInteractor extends BaseMessagingInteractor<List<SupportCategoryDto>, Void> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public GetSupportCategoriesInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<List<SupportCategoryDto>> makeCall(MessagingApi api, Void id, Bundle parameters, String token) {
        return api.getSupportCategories(token, parameters.getString("lang"));
    }
}

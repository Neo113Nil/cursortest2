package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.betup.model.remote.api.rest.base.BaseAnalyticsInteractor;
import org.betup.model.remote.entity.user.UserAnalyticsTagSlugsDto;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class GetUserTagSlugsInteractor extends BaseAnalyticsInteractor<UserAnalyticsTagSlugsDto, Void> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public GetUserTagSlugsInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<UserAnalyticsTagSlugsDto> makeCall(AnalyticsApi api, Void id, Bundle parameters, String token) {
        return api.getCurrentUserTagSlugs(token);
    }
}

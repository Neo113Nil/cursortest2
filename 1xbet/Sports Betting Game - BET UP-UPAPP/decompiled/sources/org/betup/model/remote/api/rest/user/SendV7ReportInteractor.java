package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.ResponseBody;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.api.rest.base.BaseNewVersionBettingInteractor;
import org.betup.model.remote.entity.support.SupportReportRequestModel;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class SendV7ReportInteractor extends BaseNewVersionBettingInteractor<ResponseBody, String> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(String id, Bundle parameters) {
        return 0L;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void invalidate(String id) {
    }

    @Inject
    public SendV7ReportInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<ResponseBody> makeCall(NewVersionBettingApi bettingApi, String id, Bundle parameters, String token) {
        return bettingApi.sendV7SupportReport(token, new SupportReportRequestModel(parameters.getString("type"), parameters.getString("message"), parameters.getString("email"), parameters.getString("deviceInfo")));
    }
}

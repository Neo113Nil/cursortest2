package org.betup.model.remote.api.rest.user;

import android.content.Context;
import android.os.Bundle;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.betup.model.remote.api.rest.base.BaseAnalyticsInteractor;
import org.betup.model.remote.entity.user.AccountDeletionRequest;
import org.betup.model.remote.entity.user.CreateAccountDeletionRequest;
import retrofit2.Call;

@Singleton
/* loaded from: classes2.dex */
public class SendDeleteAccountInteractor extends BaseAnalyticsInteractor<AccountDeletionRequest, Void> {
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(Void id, Bundle parameters) {
        return 0L;
    }

    @Inject
    public SendDeleteAccountInteractor(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    public Call<AccountDeletionRequest> makeCall(AnalyticsApi api, Void id, Bundle parameters, String token) {
        CreateAccountDeletionRequest createAccountDeletionRequest = new CreateAccountDeletionRequest();
        createAccountDeletionRequest.setEmail(parameters.getString("email"));
        String string = parameters.getString("message");
        if (string == null || string.isEmpty()) {
            string = null;
        }
        createAccountDeletionRequest.setMessage(string);
        return api.createAccountDeletionRequest(token, createAccountDeletionRequest);
    }
}

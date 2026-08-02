package org.betup.model.remote.api.rest.base;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GetTokenResult;
import java.util.Objects;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.infrastructure.BettingApi;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import retrofit2.Call;

/* loaded from: classes2.dex */
public class MockedInteractor<T, S> extends BaseTokenInteractor<T, S, BettingApi> {
    private final MockedInteractorCall<T, S> mockedInteractorCall;

    public interface MockedInteractorCall<T, S> {
        T getData(S id, Bundle parameters, String token);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor, org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    protected final void buildCall(Request<S> request, CallBuildListener<T> listener) {
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public int getHash(S id, Bundle parameters) {
        return 0;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public long getLifetime(S id, Bundle parameters) {
        return 0L;
    }

    /* renamed from: makeCall, reason: avoid collision after fix types in other method */
    protected final Call<T> makeCall2(BettingApi api, S id, Bundle parameters, String token) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor
    protected /* bridge */ /* synthetic */ Call makeCall(BettingApi api, Object id, Bundle parameters, String token) {
        return makeCall2(api, (BettingApi) id, parameters, token);
    }

    public MockedInteractor(Context context, MockedInteractorCall<T, S> mockedCall) {
        super(context);
        this.mockedInteractorCall = mockedCall;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseTokenInteractor, org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void load(BaseCachedSharedInteractor.OnFetchedListener<T, S> listener, S id) {
        load(listener, id, null);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor
    public void load(BaseCachedSharedInteractor.OnFetchedListener<T, S> listener, final S id, final Bundle parameters) {
        super.load(listener, id, parameters);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() != null) {
            firebaseAuth.getCurrentUser().getIdToken(false).addOnCompleteListener(new OnCompleteListener<GetTokenResult>() { // from class: org.betup.model.remote.api.rest.base.MockedInteractor.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<GetTokenResult> task) {
                    MockedInteractor.this.notifyListeners(0, new FetchedResponseMessage<>(MockedInteractor.this.mockedInteractorCall.getData(id, parameters, (String) Objects.requireNonNull(task.getResult().getToken())), FetchStat.SUCCESS, id, parameters));
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: org.betup.model.remote.api.rest.base.MockedInteractor$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    MockedInteractor.this.m12697x159aa05c(exc);
                }
            });
        }
    }

    /* renamed from: lambda$load$0$org-betup-model-remote-api-rest-base-MockedInteractor, reason: not valid java name */
    /* synthetic */ void m12697x159aa05c(Exception exc) {
        notifyInvalidResponse(FetchStat.NO_AUTH, null, null);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseInteractor
    public final Class<BettingApi> getApi() {
        return BettingApi.class;
    }
}

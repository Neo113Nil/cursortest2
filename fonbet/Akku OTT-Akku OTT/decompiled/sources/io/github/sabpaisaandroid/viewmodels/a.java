package io.github.sabpaisaandroid.viewmodels;

import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.github.sabpaisaandroid.activity.e;
import io.github.sabpaisaandroid.models.CreditCardResponse;
import io.github.sabpaisaandroid.models.EncryptModel;
import io.github.sabpaisaandroid.models.EncryptModelResponse;
import io.github.sabpaisaandroid.network.SabPaisaEndPoints;
import io.github.sabpaisaandroid.network.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/github/sabpaisaandroid/viewmodels/a;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Lio/github/sabpaisaandroid/models/PaymentStatusModel;", "creditCardRequest", "Lio/github/sabpaisaandroid/interfaces/IApiSuccessCallBack;", "Lio/github/sabpaisaandroid/models/PaymentStatusResponseModel;", "iApiSuccessCallBack", "", "checkPaymentStatus", "(Lio/github/sabpaisaandroid/models/PaymentStatusModel;Lio/github/sabpaisaandroid/interfaces/IApiSuccessCallBack;)V", "Lio/github/sabpaisaandroid/activity/e;", "activity", "", Constants.KEY, "iv", "string", "Lio/github/sabpaisaandroid/models/EncryptModelResponse;", "decryptNetworkCall", "(Lio/github/sabpaisaandroid/activity/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/sabpaisaandroid/interfaces/IApiSuccessCallBack;)V", "encryptNetworkCall", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends ViewModel {

    /* renamed from: io.github.sabpaisaandroid.viewmodels.a$a, reason: collision with other inner class name */
    public static final class C0150a implements io.github.sabpaisaandroid.interfaces.a<EncryptModelResponse> {
        public final /* synthetic */ io.github.sabpaisaandroid.interfaces.a<EncryptModelResponse> a;
        public final /* synthetic */ e b;

        public C0150a(io.github.sabpaisaandroid.interfaces.a<EncryptModelResponse> aVar, e eVar) {
            this.a = aVar;
            this.b = eVar;
        }

        @Override // io.github.sabpaisaandroid.interfaces.a
        public final void a(EncryptModelResponse encryptModelResponse) {
            EncryptModelResponse response = encryptModelResponse;
            Intrinsics.checkNotNullParameter(response, "response");
            this.a.a(response);
        }
    }

    public static void a(e activity, String key, String iv, String string, io.github.sabpaisaandroid.interfaces.a iApiSuccessCallBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(iApiSuccessCallBack, "iApiSuccessCallBack");
        final EncryptModel encryptModel = new EncryptModel(null, null, null, null, null, key, iv, string, 31, null);
        final C0150a iApiSuccessCallBack2 = new C0150a(iApiSuccessCallBack, activity);
        activity.getClass();
        Intrinsics.checkNotNullParameter(encryptModel, "encryptModel");
        Intrinsics.checkNotNullParameter(iApiSuccessCallBack2, "iApiSuccessCallBack");
        Retrofit a = c.a();
        SabPaisaEndPoints sabPaisaEndPoints = a != null ? (SabPaisaEndPoints) a.create(SabPaisaEndPoints.class) : null;
        Call<EncryptModelResponse> a2 = sabPaisaEndPoints != null ? sabPaisaEndPoints.a(encryptModel) : null;
        String requestObject = new Gson().toJson(encryptModel);
        Intrinsics.checkNotNullExpressionValue(requestObject, "toJson(...)");
        Intrinsics.checkNotNullParameter(requestObject, "requestObject");
        if (a2 != null) {
            a2.enqueue(new Callback<EncryptModelResponse>() { // from class: io.github.sabpaisaandroid.activity.SabPaisaActivity$decryptData$1
                @Override // retrofit2.Callback
                public final void onFailure(Call<EncryptModelResponse> requestUrl, Throwable th) {
                    Intrinsics.checkNotNullParameter(requestUrl, "call");
                    Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
                    if (th != null) {
                        th.getMessage();
                    }
                    e eVar = iApiSuccessCallBack2.b;
                    if (th != null) {
                        Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type io.github.sabpaisaandroid.activity.SabPaisaActivity");
                        Intrinsics.checkNotNull(eVar);
                        eVar.r(eVar, th);
                    }
                }

                @Override // retrofit2.Callback
                public final void onResponse(Call<EncryptModelResponse> call, Response<EncryptModelResponse> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    EncryptModelResponse body = response.body();
                    if (body != null) {
                        iApiSuccessCallBack2.a(body);
                    }
                    if (response.body() == null) {
                        String toJson = new Gson().toJson(EncryptModel.this);
                        Intrinsics.checkNotNullExpressionValue(toJson, "toJson(...)");
                        Intrinsics.checkNotNullParameter(response, "response");
                        Intrinsics.checkNotNullParameter(toJson, "toJson");
                        try {
                            Gson gson = new Gson();
                            ResponseBody errorBody = response.errorBody();
                            String string2 = errorBody != null ? errorBody.string() : null;
                            Intrinsics.checkNotNull(string2);
                            Object fromJson = gson.fromJson(string2, (Class<Object>) CreditCardResponse.class);
                            Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                            ((CreditCardResponse) fromJson).getErrorMessage();
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }
}

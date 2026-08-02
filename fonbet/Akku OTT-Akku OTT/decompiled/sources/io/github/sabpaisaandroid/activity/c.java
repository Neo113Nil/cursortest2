package io.github.sabpaisaandroid.activity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.models.EncryptModelResponse;
import io.github.sabpaisaandroid.models.PaymentDetailsModel;
import io.github.sabpaisaandroid.models.PaymentStatusModel;
import io.github.sabpaisaandroid.models.PaymentStatusResponseModel;
import io.github.sabpaisaandroid.network.SabPaisaEndPoints;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes3.dex */
public final class c implements io.github.sabpaisaandroid.interfaces.a<EncryptModelResponse> {
    public final /* synthetic */ PaymentDetailsModel a;
    public final /* synthetic */ WebViewActivityLite b;
    public final /* synthetic */ WebViewActivityLite.b c;
    public final /* synthetic */ WebViewActivityLite.c d;

    public c(WebViewActivityLite.b bVar, WebViewActivityLite.c cVar, WebViewActivityLite webViewActivityLite, PaymentDetailsModel paymentDetailsModel) {
        this.a = paymentDetailsModel;
        this.b = webViewActivityLite;
        this.c = bVar;
        this.d = cVar;
    }

    @Override // io.github.sabpaisaandroid.interfaces.a
    public final void a(EncryptModelResponse encryptModelResponse) {
        EncryptModelResponse response = encryptModelResponse;
        Intrinsics.checkNotNullParameter(response, "response");
        String info = response.getValue();
        if (info != null) {
            StringBuilder sb = new StringBuilder("clientCode=");
            PaymentDetailsModel paymentDetailsModel = this.a;
            sb.append(paymentDetailsModel.getClientCode());
            sb.append("&clientTxnId=");
            sb.append(paymentDetailsModel.getClientTxnid());
            Intrinsics.checkNotNullParameter(sb.toString(), "info");
            Intrinsics.checkNotNullParameter(info, "info");
            WebViewActivityLite webViewActivityLite = this.b;
            if (webViewActivityLite.b != null) {
                final PaymentStatusModel creditCardRequest = new PaymentStatusModel(String.valueOf(paymentDetailsModel.getClientCode()), info);
                final b iApiSuccessCallBack = new b(this.c, this.d, webViewActivityLite, paymentDetailsModel);
                Intrinsics.checkNotNullParameter(creditCardRequest, "creditCardRequest");
                Intrinsics.checkNotNullParameter(iApiSuccessCallBack, "iApiSuccessCallBack");
                if (io.github.sabpaisaandroid.network.c.e == null) {
                    io.github.sabpaisaandroid.network.c.c = new Retrofit.Builder().baseUrl(io.github.sabpaisaandroid.network.c.i).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()));
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.addNetworkInterceptor(new io.github.sabpaisaandroid.network.d());
                    OkHttpClient.Builder cache = builder.cache(null);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    OkHttpClient build = cache.connectTimeout(10L, timeUnit).writeTimeout(20L, timeUnit).readTimeout(30L, timeUnit).build();
                    Retrofit.Builder builder2 = io.github.sabpaisaandroid.network.c.c;
                    if (builder2 != null) {
                        builder2.client(build);
                    }
                    Retrofit.Builder builder3 = io.github.sabpaisaandroid.network.c.c;
                    io.github.sabpaisaandroid.network.c.e = builder3 != null ? builder3.build() : null;
                }
                Retrofit retrofit = io.github.sabpaisaandroid.network.c.e;
                SabPaisaEndPoints sabPaisaEndPoints = retrofit != null ? (SabPaisaEndPoints) retrofit.create(SabPaisaEndPoints.class) : null;
                Call<PaymentStatusResponseModel> c = sabPaisaEndPoints != null ? sabPaisaEndPoints.c(creditCardRequest) : null;
                String requestObject = new Gson().toJson(creditCardRequest);
                Intrinsics.checkNotNullExpressionValue(requestObject, "toJson(...)");
                Intrinsics.checkNotNullParameter(requestObject, "requestObject");
                if (c != null) {
                    c.enqueue(new Callback<PaymentStatusResponseModel>() { // from class: io.github.sabpaisaandroid.viewmodels.SabPaisaActivityViewModel$checkPaymentStatus$1
                        @Override // retrofit2.Callback
                        public final void onFailure(Call<PaymentStatusResponseModel> requestUrl, Throwable th) {
                            Intrinsics.checkNotNullParameter(requestUrl, "call");
                            Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
                            iApiSuccessCallBack.b(th);
                        }

                        @Override // retrofit2.Callback
                        public final void onResponse(Call<PaymentStatusResponseModel> call, Response<PaymentStatusResponseModel> response2) {
                            Intrinsics.checkNotNullParameter(call, "call");
                            Intrinsics.checkNotNullParameter(response2, "response");
                            PaymentStatusResponseModel body = response2.body();
                            io.github.sabpaisaandroid.activity.b bVar = iApiSuccessCallBack;
                            if (body != null) {
                                bVar.a(body);
                            }
                            if (response2.body() == null) {
                                String toJson = new Gson().toJson(PaymentStatusModel.this);
                                Intrinsics.checkNotNullExpressionValue(toJson, "toJson(...)");
                                Intrinsics.checkNotNullParameter(response2, "response");
                                Intrinsics.checkNotNullParameter(toJson, "toJson");
                                bVar.b(null);
                            }
                        }
                    });
                }
            }
        }
    }
}

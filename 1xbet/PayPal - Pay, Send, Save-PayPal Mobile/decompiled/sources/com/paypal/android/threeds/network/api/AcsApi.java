package com.paypal.android.threeds.network.api;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/android/threeds/network/api/AcsApi;", "", "", "acsUrl", "Lokhttp3/RequestBody;", "encodedChallengeRequest", "Lretrofit2/Response;", "startChallenge", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/android/threeds/data/model/ErrorMessage;", "errorMessage", "postErrorMessageToAcs", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/ErrorMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AcsApi {
    @retrofit2.http.POST
    java.lang.Object postErrorMessageToAcs(@retrofit2.http.Url java.lang.String str, @retrofit2.http.Body com.paypal.android.threeds.data.model.ErrorMessage errorMessage, kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> continuation);

    @retrofit2.http.Headers({"Content-Type: application/jose; charset=UTF-8"})
    @retrofit2.http.POST
    java.lang.Object startChallenge(@retrofit2.http.Url java.lang.String str, @retrofit2.http.Body okhttp3.RequestBody requestBody, kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> continuation);
}

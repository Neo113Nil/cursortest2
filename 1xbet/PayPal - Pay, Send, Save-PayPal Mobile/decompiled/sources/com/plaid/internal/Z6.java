package com.plaid.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J:\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/plaid/internal/Z6;", "", "", com.visa.cbp.sdk.facade.data.Constants.API_KEY, "xSentryToken", "Lcom/plaid/internal/core/crashreporting/internal/models/Crash;", "crash", "Lcom/plaid/internal/i4;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/plaid/internal/core/crashreporting/internal/models/Crash;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Z6 {
    @retrofit2.http.POST("store/")
    java.lang.Object a(@retrofit2.http.Header("X-Sentry-Auth") java.lang.String str, @retrofit2.http.Header("X-Sentry-Token") java.lang.String str2, @retrofit2.http.Body com.plaid.internal.core.crashreporting.internal.models.Crash crash, kotlin.coroutines.Continuation<? super com.plaid.internal.AbstractC0550i4<? extends java.lang.Object, ? extends java.lang.Object>> continuation);
}

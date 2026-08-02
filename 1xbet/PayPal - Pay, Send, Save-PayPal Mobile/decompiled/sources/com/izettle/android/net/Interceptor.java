package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/izettle/android/net/Interceptor;", "", "Lcom/izettle/android/net/Interceptor$Chain;", "chain", "Lcom/izettle/android/net/Response;", "", "intercept", "(Lcom/izettle/android/net/Interceptor$Chain;)Lcom/izettle/android/net/Response;", "Chain"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Interceptor {

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/izettle/android/net/Interceptor$Chain;", "", "Lcom/izettle/android/net/Request;", "request", "Lcom/izettle/android/net/Response;", "", "proceed", "(Lcom/izettle/android/net/Request;)Lcom/izettle/android/net/Response;", "getRequest", "()Lcom/izettle/android/net/Request;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Chain {
        com.izettle.android.net.Request getRequest();

        com.izettle.android.net.Response<java.lang.String> proceed(com.izettle.android.net.Request request);
    }

    com.izettle.android.net.Response<java.lang.String> intercept(com.izettle.android.net.Interceptor.Chain chain);
}

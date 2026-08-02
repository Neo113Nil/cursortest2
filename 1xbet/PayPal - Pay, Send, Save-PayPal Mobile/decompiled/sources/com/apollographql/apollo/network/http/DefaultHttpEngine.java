package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u001b\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0003\u0010\t\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\f\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u000f"}, d2 = {"", "timeoutMillis", "Lcom/apollographql/apollo/network/http/HttpEngine;", "DefaultHttpEngine", "(J)Lcom/apollographql/apollo/network/http/HttpEngine;", "Lokhttp3/Call$Factory;", "httpCallFactory", "(Lokhttp3/Call$Factory;)Lcom/apollographql/apollo/network/http/HttpEngine;", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Lcom/apollographql/apollo/network/http/HttpEngine;", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)Lcom/apollographql/apollo/network/http/HttpEngine;", "connectTimeoutMillis", "readTimeoutMillis", "(JJ)Lcom/apollographql/apollo/network/http/HttpEngine;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultHttpEngine {
    public static final com.apollographql.apollo.network.http.HttpEngine DefaultHttpEngine(long j) {
        return new com.apollographql.apollo.network.http.JvmHttpEngine(j);
    }

    public static /* synthetic */ com.apollographql.apollo.network.http.HttpEngine DefaultHttpEngine$default(long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 60000;
        }
        return DefaultHttpEngine(j);
    }

    public static final com.apollographql.apollo.network.http.HttpEngine DefaultHttpEngine(okhttp3.Call.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return new com.apollographql.apollo.network.http.JvmHttpEngine(factory);
    }

    public static final com.apollographql.apollo.network.http.HttpEngine DefaultHttpEngine(kotlin.jvm.functions.Function0<? extends okhttp3.Call.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new com.apollographql.apollo.network.http.JvmHttpEngine(function0);
    }

    public static final com.apollographql.apollo.network.http.HttpEngine DefaultHttpEngine(okhttp3.OkHttpClient okHttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        return new com.apollographql.apollo.network.http.JvmHttpEngine(okHttpClient);
    }

    public static final com.apollographql.apollo.network.http.HttpEngine DefaultHttpEngine(long j, long j2) {
        return new com.apollographql.apollo.network.http.JvmHttpEngine(j, j2);
    }
}

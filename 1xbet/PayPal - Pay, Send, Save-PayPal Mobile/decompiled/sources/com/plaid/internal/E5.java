package com.plaid.internal;

/* loaded from: classes16.dex */
public final class E5 {
    public static final com.plaid.internal.E5.a c = new com.plaid.internal.E5.a();
    public static volatile com.plaid.internal.E5 d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5780a;
    public final java.util.LinkedHashMap b = new java.util.LinkedHashMap();

    public static final class a {
        public final com.plaid.internal.E5 a(java.lang.String str) {
            com.plaid.internal.E5 e5;
            com.plaid.internal.E5 e52 = com.plaid.internal.E5.d;
            if (e52 != null) {
                return e52;
            }
            synchronized (this) {
                e5 = com.plaid.internal.E5.d;
                if (e5 == null) {
                    e5 = new com.plaid.internal.E5(str);
                    com.plaid.internal.E5.d = e5;
                }
            }
            return e5;
        }
    }

    public E5(java.lang.String str) {
        this.f5780a = str;
    }

    public final retrofit2.Retrofit a(java.lang.String str, com.plaid.internal.G5 g5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g5, "");
        retrofit2.Retrofit retrofit = (retrofit2.Retrofit) this.b.get(str);
        if (retrofit != null) {
            return retrofit;
        }
        okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
        builder.addInterceptor(new com.plaid.internal.F5(this));
        builder.readTimeout(10L, java.util.concurrent.TimeUnit.MINUTES);
        javax.net.SocketFactory socketFactory = g5.b;
        if (socketFactory != null) {
            builder.socketFactory(socketFactory);
        }
        okhttp3.OkHttpClient build = builder.build();
        com.google.gson.Gson gson = g5.f5795a;
        retrofit2.converter.gson.GsonConverterFactory create = gson == null ? retrofit2.converter.gson.GsonConverterFactory.create() : retrofit2.converter.gson.GsonConverterFactory.create(gson);
        retrofit2.Retrofit.Builder addCallAdapterFactory = new retrofit2.Retrofit.Builder().client(build).addCallAdapterFactory(new com.plaid.internal.T());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addCallAdapterFactory, "");
        addCallAdapterFactory.baseUrl(str);
        addCallAdapterFactory.addConverterFactory(retrofit2.converter.protobuf.ProtoConverterFactory.create());
        addCallAdapterFactory.addConverterFactory(create);
        retrofit2.Retrofit build2 = addCallAdapterFactory.build();
        java.util.LinkedHashMap linkedHashMap = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNull(build2);
        linkedHashMap.put(str, build2);
        return build2;
    }
}

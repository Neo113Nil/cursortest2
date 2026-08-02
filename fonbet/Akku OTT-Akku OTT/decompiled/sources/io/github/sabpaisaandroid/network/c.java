package io.github.sabpaisaandroid.network;

import com.google.gson.GsonBuilder;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SourceDebugExtension({"SMAP\nRetrofitClientInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetrofitClientInstance.kt\nio/github/sabpaisaandroid/network/RetrofitClientInstance\n+ 2 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,532:1\n578#2:533\n578#2:534\n578#2:535\n578#2:536\n578#2:537\n578#2:538\n578#2:539\n578#2:540\n*S KotlinDebug\n*F\n+ 1 RetrofitClientInstance.kt\nio/github/sabpaisaandroid/network/RetrofitClientInstance\n*L\n71#1:533\n125#1:534\n171#1:535\n218#1:536\n323#1:537\n373#1:538\n423#1:539\n471#1:540\n*E\n"})
/* loaded from: classes3.dex */
public final class c {
    public static Retrofit a = null;
    public static Retrofit.Builder b = null;
    public static Retrofit.Builder c = null;
    public static Retrofit.Builder d = null;
    public static Retrofit e = null;
    public static Retrofit f = null;
    public static String g = "https://mobile-prodpoc.sabpaisa.in";
    public static String h = "https://mobile-prodpoc.sabpaisa.in";
    public static String i = "";

    @SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2\n+ 2 RetrofitClientInstance.kt\nio/github/sabpaisaandroid/network/RetrofitClientInstance\n*L\n1#1,1079:1\n374#2,11:1080\n*E\n"})
    public static final class a implements Interceptor {
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Request request = chain.request();
            return chain.proceed(request.newBuilder().addHeader("Cache-control", "no-cache").method(request.method(), request.body()).build());
        }
    }

    public static Retrofit a() {
        if (f == null) {
            d = new Retrofit.Builder().baseUrl(h).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()));
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addNetworkInterceptor(new a());
            OkHttpClient.Builder cache = builder.cache(null);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cache.connectTimeout(10L, timeUnit).writeTimeout(20L, timeUnit).readTimeout(30L, timeUnit).build();
            try {
                X509TrustManager[] x509TrustManagerArr = {new b()};
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, x509TrustManagerArr, new SecureRandom());
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                Intrinsics.checkNotNull(socketFactory);
                builder2.sslSocketFactory(socketFactory, x509TrustManagerArr[0]);
                builder2.hostnameVerifier(new io.github.sabpaisaandroid.network.a());
                OkHttpClient build = builder2.build();
                Retrofit.Builder builder3 = d;
                if (builder3 != null) {
                    builder3.client(build);
                }
                Retrofit.Builder builder4 = d;
                f = builder4 != null ? builder4.build() : null;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
        return f;
    }
}

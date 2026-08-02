package org.betup.model.remote.api;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.betup.model.remote.api.config.ApiConfig;
import org.betup.model.remote.api.config.ApiConfigResolver;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.betup.model.remote.api.infrastructure.BettingApi;
import org.betup.model.remote.api.infrastructure.MessagingApi;
import org.betup.model.remote.api.infrastructure.MiniGameApi;
import org.betup.model.remote.api.infrastructure.NewVersionBettingApi;
import org.betup.model.remote.serialization.FlexibleNumberTypeAdapters;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* loaded from: classes2.dex */
public class ServiceGenerator {
    private static final ApiConfig apiConfig;
    private static final Map<Class, Object> apis;
    private static final Map<Class, String> baseUrls;

    static {
        HashMap hashMap = new HashMap();
        baseUrls = hashMap;
        apis = new HashMap();
        ApiConfig apiConfig2 = ApiConfigResolver.getApiConfig();
        apiConfig = apiConfig2;
        hashMap.put(BettingApi.class, apiConfig2.getApiBaseUrl());
        hashMap.put(NewVersionBettingApi.class, apiConfig2.getNewApiBaseUrl());
        hashMap.put(MessagingApi.class, apiConfig2.getMessagingBaseUrl());
        hashMap.put(MiniGameApi.class, apiConfig2.getGamesBaseUrl());
        hashMap.put(AnalyticsApi.class, apiConfig2.getAnalyticsBaseUrl());
    }

    public static synchronized <F> F getRestClient(Class<F> cls) {
        synchronized (ServiceGenerator.class) {
            Map<Class, Object> map = apis;
            if (map.get(cls) != null) {
                return (F) map.get(cls);
            }
            String str = baseUrls.get(cls);
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.redactHeader("Auth");
            httpLoggingInterceptor.redactHeader("auth");
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
            F f = (F) new Retrofit.Builder().baseUrl(str).client(new OkHttpClient.Builder().connectTimeout(22L, TimeUnit.SECONDS).readTimeout(22L, TimeUnit.SECONDS).build()).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create(FlexibleNumberTypeAdapters.createApiGson())).build().create(cls);
            map.put(cls, f);
            return f;
        }
    }
}

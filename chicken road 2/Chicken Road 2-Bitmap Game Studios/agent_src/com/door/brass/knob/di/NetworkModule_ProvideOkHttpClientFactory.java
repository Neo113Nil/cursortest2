package com.door.brass.knob.di;

import dagger.internal.Factory;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    public static final class InstanceHolder {
    }

    public static OkHttpClient yzPsTade5rL7D3() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        timeUnit.getClass();
        builder.OcGJUxcOVecQiKb = 15000;
        timeUnit.getClass();
        builder.XrorSzThrtvJ4A = 15000;
        timeUnit.getClass();
        builder.ZvpnNpCMEWSR3 = 15000;
        timeUnit.getClass();
        builder.uY26rxeEAFnDq = 15000;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.hRNgd2zGCE5kj = HttpLoggingInterceptor.Level.oyjLVtGms9eZwJ0;
        builder.ra306ClFT3HT.add(httpLoggingInterceptor);
        return new OkHttpClient(builder);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return yzPsTade5rL7D3();
    }
}

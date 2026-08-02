package com.paypal.oslo.feature.verificationcapture.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/di/NetworkModule;", "", "<init>", "()V", "Lretrofit2/Retrofit;", "retrofit", "Lcom/paypal/oslo/feature/verificationcapture/network/DocumentUploadApi;", "provideDocumentUploadApi", "(Lretrofit2/Retrofit;)Lcom/paypal/oslo/feature/verificationcapture/network/DocumentUploadApi;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class NetworkModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.di.NetworkModule INSTANCE = new com.paypal.oslo.feature.verificationcapture.di.NetworkModule();

    private NetworkModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi provideDocumentUploadApi(retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        java.lang.Object create = retrofit.create(com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return (com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi) create;
    }
}

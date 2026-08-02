package com.paypal.oslo.feature.packagetracking.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/di/PackageTrackingProviderModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "dynamicOkHttpClientProvider", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/GeoCoderApi;", "providesGeoCoderApi", "(Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;)Lcom/paypal/oslo/feature/packagetracking/domain/repository/GeoCoderApi;", "", "GOOGLE_MAPS_BASE_URL", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class PackageTrackingProviderModule {
    public static final int $stable = 0;
    public static final java.lang.String GOOGLE_MAPS_BASE_URL = "https://maps.googleapis.com/";
    public static final com.paypal.oslo.feature.packagetracking.di.PackageTrackingProviderModule INSTANCE = new com.paypal.oslo.feature.packagetracking.di.PackageTrackingProviderModule();

    private PackageTrackingProviderModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi providesGeoCoderApi(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicOkHttpClientProvider, "");
        java.lang.Object create = new retrofit2.Retrofit.Builder().callFactory(dynamicOkHttpClientProvider.getCallFactory()).baseUrl(GOOGLE_MAPS_BASE_URL).addConverterFactory(retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory.create(kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.di.PackageTrackingProviderModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.packagetracking.di.PackageTrackingProviderModule.$r8$lambda$iCQwIt_yKkYn6LgT3QCqrIoIitg((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null), okhttp3.MediaType.INSTANCE.get("application/json"))).build().create(com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return (com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi) create;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iCQwIt_yKkYn6LgT3QCqrIoIitg(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        return kotlin.Unit.INSTANCE;
    }
}

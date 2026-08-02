package com.paypal.oslo.feature.shaketoreport.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/di/ShakeToReportModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/hardware/SensorManager;", "provideSensorManager$shake_to_report_prodRelease", "(Landroid/content/Context;)Landroid/hardware/SensorManager;", "Lkotlinx/serialization/json/Json;", "provideJson$shake_to_report_prodRelease", "()Lkotlinx/serialization/json/Json;", "Lretrofit2/Retrofit;", "retrofit", "Lcom/paypal/oslo/feature/shaketoreport/di/JiraOkHttpClientProvider;", "jiraOkHttpClientProvider", "Lcom/paypal/oslo/feature/shaketoreport/network/PayPalJiraCredentialApi;", "providePayPalJiraCredentialApi$shake_to_report_prodRelease", "(Lretrofit2/Retrofit;Lcom/paypal/oslo/feature/shaketoreport/di/JiraOkHttpClientProvider;)Lcom/paypal/oslo/feature/shaketoreport/network/PayPalJiraCredentialApi;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class ShakeToReportModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule INSTANCE = new com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule();

    private ShakeToReportModule() {
    }

    @dagger.Provides
    public final android.hardware.SensorManager provideSensorManager$shake_to_report_prodRelease(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("sensor");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        return (android.hardware.SensorManager) systemService;
    }

    @dagger.Provides
    @javax.inject.Singleton
    @com.paypal.oslo.feature.shaketoreport.di.JiraJson
    public final kotlinx.serialization.json.Json provideJson$shake_to_report_prodRelease() {
        return kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shaketoreport.di.ShakeToReportModule.$r8$lambda$o_YT72pHitXx1poX3m28lLj684w((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi providePayPalJiraCredentialApi$shake_to_report_prodRelease(retrofit2.Retrofit retrofit, com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider jiraOkHttpClientProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jiraOkHttpClientProvider, "");
        java.lang.Object create = retrofit.newBuilder().callFactory(jiraOkHttpClientProvider.getCallFactory()).build().create(com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return (com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi) create;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o_YT72pHitXx1poX3m28lLj684w(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        return kotlin.Unit.INSTANCE;
    }
}

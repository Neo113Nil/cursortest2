package com.paypal.oslo.app.telemetry;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/app/telemetry/AppTelemetryServiceProvider;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryServiceProvider;", "Lretrofit2/Retrofit;", "retrofit", "<init>", "(Lretrofit2/Retrofit;)V", "T", "Ljava/lang/Class;", "type", "provide", "(Ljava/lang/Class;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lretrofit2/Retrofit;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppTelemetryServiceProvider implements com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final retrofit2.Retrofit getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AppTelemetryServiceProvider(retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        this.getHighSpeedVideoFpsRangesFor = retrofit;
    }

    @Override // com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider
    public final <T> T provide(java.lang.Class<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return (T) this.getHighSpeedVideoFpsRangesFor.create(type);
    }
}

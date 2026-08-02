package com.paypal.oslo.feature.taptopay.di.data;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/data/TapToPayWorkerModule;", "", "<init>", "()V", "Landroidx/work/Constraints;", "provideWorkConstraints", "()Landroidx/work/Constraints;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class TapToPayWorkerModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.di.data.TapToPayWorkerModule INSTANCE = new com.paypal.oslo.feature.taptopay.di.data.TapToPayWorkerModule();

    private TapToPayWorkerModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final androidx.work.Constraints provideWorkConstraints() {
        return new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build();
    }
}

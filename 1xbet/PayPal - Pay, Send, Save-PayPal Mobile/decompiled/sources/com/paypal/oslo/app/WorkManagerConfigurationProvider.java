package com.paypal.oslo.app;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/app/WorkManagerConfigurationProvider;", "", "Landroidx/hilt/work/HiltWorkerFactory;", "hiltWorkerFactory", "<init>", "(Landroidx/hilt/work/HiltWorkerFactory;)V", "Landroidx/work/Configuration;", "createConfiguration", "()Landroidx/work/Configuration;", "getHighSpeedVideoFpsRanges", "Landroidx/hilt/work/HiltWorkerFactory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkManagerConfigurationProvider {
    public static final int $stable = 8;
    private final androidx.hilt.work.HiltWorkerFactory getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public WorkManagerConfigurationProvider(androidx.hilt.work.HiltWorkerFactory hiltWorkerFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hiltWorkerFactory, "");
        this.getHighSpeedVideoFpsRanges = hiltWorkerFactory;
    }

    public final androidx.work.Configuration createConfiguration() {
        androidx.work.Configuration.Builder builder = new androidx.work.Configuration.Builder();
        androidx.work.DelegatingWorkerFactory delegatingWorkerFactory = new androidx.work.DelegatingWorkerFactory();
        delegatingWorkerFactory.addFactory(this.getHighSpeedVideoFpsRanges);
        return builder.setWorkerFactory(delegatingWorkerFactory).build();
    }
}

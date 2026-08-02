package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a$\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u0007\u0010\n\u001a<\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\r\u001a,\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u0007\u0010\u000e"}, d2 = {"Landroidx/work/ListenableWorker;", "W", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "Landroidx/work/PeriodicWorkRequest$Builder;", "PeriodicWorkRequestBuilder", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/PeriodicWorkRequest$Builder;", "Ljava/time/Duration;", "(Ljava/time/Duration;)Landroidx/work/PeriodicWorkRequest$Builder;", "flexTimeInterval", "flexTimeIntervalUnit", "(JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)Landroidx/work/PeriodicWorkRequest$Builder;", "(Ljava/time/Duration;Ljava/time/Duration;)Landroidx/work/PeriodicWorkRequest$Builder;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PeriodicWorkRequestKt {
    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "W");
        return new androidx.work.PeriodicWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.ListenableWorker.class, j, timeUnit);
    }

    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(java.time.Duration duration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "W");
        return new androidx.work.PeriodicWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.ListenableWorker.class, duration);
    }

    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, java.util.concurrent.TimeUnit timeUnit, long j2, java.util.concurrent.TimeUnit timeUnit2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit2, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "W");
        return new androidx.work.PeriodicWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.ListenableWorker.class, j, timeUnit, j2, timeUnit2);
    }

    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(java.time.Duration duration, java.time.Duration duration2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration2, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "W");
        return new androidx.work.PeriodicWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.ListenableWorker.class, duration, duration2);
    }
}

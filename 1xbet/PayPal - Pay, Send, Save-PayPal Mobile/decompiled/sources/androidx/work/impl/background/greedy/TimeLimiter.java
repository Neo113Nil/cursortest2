package androidx.work.impl.background.greedy;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b"}, d2 = {"Landroidx/work/impl/background/greedy/TimeLimiter;", "", "Landroidx/work/RunnableScheduler;", "runnableScheduler", "Landroidx/work/impl/WorkLauncher;", com.datadog.android.profiling.DdProfilingContentProvider.TELEMETRY_APP_START_INFO_LAUNCHER, "", "timeoutMs", "<init>", "(Landroidx/work/RunnableScheduler;Landroidx/work/impl/WorkLauncher;J)V", "Landroidx/work/impl/StartStopToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "track", "(Landroidx/work/impl/StartStopToken;)V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "getHighSpeedVideoFpsRangesFor", "Landroidx/work/RunnableScheduler;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/work/impl/WorkLauncher;", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "", "Ljava/lang/Runnable;", "Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeLimiter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.work.impl.WorkLauncher getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.work.RunnableScheduler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<androidx.work.impl.StartStopToken, java.lang.Runnable> getHighSpeedVideoFpsRanges;

    public TimeLimiter(androidx.work.RunnableScheduler runnableScheduler, androidx.work.impl.WorkLauncher workLauncher, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnableScheduler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workLauncher, "");
        this.Camera2StreamConfigurationMap = runnableScheduler;
        this.getHighSpeedVideoFpsRangesFor = workLauncher;
        this.getHighSpeedVideoSizes = j;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    }

    public /* synthetic */ TimeLimiter(androidx.work.RunnableScheduler runnableScheduler, androidx.work.impl.WorkLauncher workLauncher, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(runnableScheduler, workLauncher, (i & 4) != 0 ? java.util.concurrent.TimeUnit.MINUTES.toMillis(90L) : j);
    }

    public final void track(final androidx.work.impl.StartStopToken token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.work.impl.background.greedy.TimeLimiter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.impl.background.greedy.TimeLimiter.this.getHighSpeedVideoFpsRangesFor.stopWork(token, 3);
            }
        };
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges.put(token, runnable);
        }
        this.Camera2StreamConfigurationMap.scheduleWithDelay(this.getHighSpeedVideoSizes, runnable);
    }

    public final void cancel(androidx.work.impl.StartStopToken token) {
        java.lang.Runnable remove;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            remove = this.getHighSpeedVideoFpsRanges.remove(token);
        }
        if (remove != null) {
            this.Camera2StreamConfigurationMap.cancel(remove);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeLimiter(androidx.work.RunnableScheduler runnableScheduler, androidx.work.impl.WorkLauncher workLauncher) {
        this(runnableScheduler, workLauncher, 0L, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnableScheduler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workLauncher, "");
    }
}

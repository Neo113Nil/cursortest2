package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u0006*\u00020\u000b0\u000b0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e"}, d2 = {"Lokhttp3/internal/connection/FastFallbackExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/connection/RoutePlanner;", "routePlanner", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/connection/RoutePlanner;Lokhttp3/internal/concurrent/TaskRunner;)V", "Lokhttp3/internal/connection/RealConnection;", "find", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "getHighSpeedVideoFpsRanges", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "", "getHighSpeedVideoFpsRangesFor", "()V", "Lokhttp3/internal/connection/RoutePlanner;", "getRoutePlanner", "()Lokhttp3/internal/connection/RoutePlanner;", "getHighSpeedVideoSizes", "Lokhttp3/internal/concurrent/TaskRunner;", "getHighResolutionOutputSizeshNQ4ISI", "", "J", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/BlockingQueue;", "Ljava/util/concurrent/BlockingQueue;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FastFallbackExchangeFinder implements okhttp3.internal.connection.ExchangeFinder {
    private final java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner.Plan> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.BlockingQueue<okhttp3.internal.connection.RoutePlanner.ConnectResult> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okhttp3.internal.concurrent.TaskRunner getHighResolutionOutputSizeshNQ4ISI;
    private final okhttp3.internal.connection.RoutePlanner routePlanner;

    public FastFallbackExchangeFinder(okhttp3.internal.connection.RoutePlanner routePlanner, okhttp3.internal.concurrent.TaskRunner taskRunner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routePlanner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        this.routePlanner = routePlanner;
        this.getHighResolutionOutputSizeshNQ4ISI = taskRunner;
        this.getHighSpeedVideoSizes = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(250L);
        this.getHighSpeedVideoFpsRanges = Long.MIN_VALUE;
        this.Camera2StreamConfigurationMap = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.getHighSpeedVideoFpsRangesFor = taskRunner.getBackend().decorate(new java.util.concurrent.LinkedBlockingDeque());
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final okhttp3.internal.connection.RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0002 A[SYNTHETIC] */
    @Override // okhttp3.internal.connection.ExchangeFinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.internal.connection.RealConnection find() {
        okhttp3.internal.connection.RoutePlanner.ConnectResult highSpeedVideoFpsRanges;
        long j;
        okhttp3.internal.connection.RoutePlanner.ConnectResult poll;
        java.io.IOException iOException = null;
        while (true) {
            try {
                if (!this.Camera2StreamConfigurationMap.isEmpty() || okhttp3.internal.connection.RoutePlanner.hasNext$default(getRoutePlanner(), null, 1, null)) {
                    if (getRoutePlanner().isCanceled()) {
                        throw new java.io.IOException("Canceled");
                    }
                    long nanoTime = this.getHighResolutionOutputSizeshNQ4ISI.getBackend().nanoTime();
                    long j2 = this.getHighSpeedVideoFpsRanges - nanoTime;
                    if (this.Camera2StreamConfigurationMap.isEmpty() || j2 <= 0) {
                        highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                        j = this.getHighSpeedVideoSizes;
                        this.getHighSpeedVideoFpsRanges = nanoTime + j;
                    } else {
                        j = j2;
                        highSpeedVideoFpsRanges = null;
                    }
                    if (highSpeedVideoFpsRanges == null) {
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                        if (!this.Camera2StreamConfigurationMap.isEmpty() && (poll = this.getHighSpeedVideoFpsRangesFor.poll(j, timeUnit)) != null) {
                            this.Camera2StreamConfigurationMap.remove(poll.getPlan());
                            highSpeedVideoFpsRanges = poll;
                            if (highSpeedVideoFpsRanges != null) {
                                continue;
                            }
                        }
                        highSpeedVideoFpsRanges = null;
                        if (highSpeedVideoFpsRanges != null) {
                        }
                    }
                    if (highSpeedVideoFpsRanges.isSuccess()) {
                        getHighSpeedVideoFpsRangesFor();
                        if (!highSpeedVideoFpsRanges.getPlan().getIsReady()) {
                            highSpeedVideoFpsRanges = highSpeedVideoFpsRanges.getPlan().mo24422connectTlsEtc();
                        }
                        if (highSpeedVideoFpsRanges.isSuccess()) {
                            return highSpeedVideoFpsRanges.getPlan().mo24419handleSuccess();
                        }
                    }
                    java.lang.Throwable throwable = highSpeedVideoFpsRanges.getThrowable();
                    if (throwable != null) {
                        if (!(throwable instanceof java.io.IOException)) {
                            throw throwable;
                        }
                        if (iOException == null) {
                            iOException = (java.io.IOException) throwable;
                        } else {
                            kotlin.ExceptionsKt.addSuppressed(iOException, throwable);
                        }
                    }
                    okhttp3.internal.connection.RoutePlanner.Plan nextPlan = highSpeedVideoFpsRanges.getNextPlan();
                    if (nextPlan != null) {
                        getRoutePlanner().getDeferredPlans().addFirst(nextPlan);
                    }
                } else {
                    getHighSpeedVideoFpsRangesFor();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(iOException);
                    throw iOException;
                }
            } finally {
                getHighSpeedVideoFpsRangesFor();
            }
        }
    }

    private final okhttp3.internal.connection.RoutePlanner.ConnectResult getHighSpeedVideoFpsRanges() {
        okhttp3.internal.connection.FailedPlan failedPlan;
        if (okhttp3.internal.connection.RoutePlanner.hasNext$default(getRoutePlanner(), null, 1, null)) {
            try {
                failedPlan = getRoutePlanner().plan();
            } catch (java.lang.Throwable th) {
                failedPlan = new okhttp3.internal.connection.FailedPlan(th);
            }
            final okhttp3.internal.connection.RoutePlanner.Plan plan = failedPlan;
            if (plan.getIsReady()) {
                return new okhttp3.internal.connection.RoutePlanner.ConnectResult(plan, null, null, 6, null);
            }
            if (plan instanceof okhttp3.internal.connection.FailedPlan) {
                return ((okhttp3.internal.connection.FailedPlan) plan).getResult();
            }
            this.Camera2StreamConfigurationMap.add(plan);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(okhttp3.internal._UtilJvmKt.okHttpName);
            sb.append(" connect ");
            sb.append(getRoutePlanner().getAddress().url().redact());
            final java.lang.String obj = sb.toString();
            okhttp3.internal.concurrent.TaskQueue.schedule$default(this.getHighResolutionOutputSizeshNQ4ISI.newQueue(), new okhttp3.internal.concurrent.Task(obj) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public final long runOnce() {
                    okhttp3.internal.connection.RoutePlanner.ConnectResult connectResult;
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
                    java.util.concurrent.BlockingQueue blockingQueue;
                    try {
                        connectResult = plan.getResult();
                    } catch (java.lang.Throwable th2) {
                        connectResult = new okhttp3.internal.connection.RoutePlanner.ConnectResult(plan, null, th2, 2, null);
                    }
                    copyOnWriteArrayList = this.Camera2StreamConfigurationMap;
                    if (!copyOnWriteArrayList.contains(plan)) {
                        return -1L;
                    }
                    blockingQueue = this.getHighSpeedVideoFpsRangesFor;
                    blockingQueue.put(connectResult);
                    return -1L;
                }
            }, 0L, 2, null);
        }
        return null;
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        java.util.Iterator<okhttp3.internal.connection.RoutePlanner.Plan> it = this.Camera2StreamConfigurationMap.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            okhttp3.internal.connection.RoutePlanner.Plan next = it.next();
            next.mo24418cancel();
            okhttp3.internal.connection.RoutePlanner.Plan mo24420retry = next.mo24420retry();
            if (mo24420retry != null) {
                getRoutePlanner().getDeferredPlans().addLast(mo24420retry);
            }
        }
        this.Camera2StreamConfigurationMap.clear();
    }
}

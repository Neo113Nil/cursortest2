package androidx.work.impl.constraints.trackers;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00038\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR0\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001ej\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t`\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR$\u0010&\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010%"}, d2 = {"Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "T", "", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroidx/work/impl/constraints/ConstraintListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Landroidx/work/impl/constraints/ConstraintListener;)V", "removeListener", "readSystemState", "()Ljava/lang/Object;", "startTracking", "()V", "stopTracking", "Camera2StreamConfigurationMap", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "getHighResolutionOutputSizeshNQ4ISI", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/Camera2StreamConfigurationMap;", "Ljava/util/LinkedHashSet;", "getHighSpeedVideoFpsRangesFor", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "getState", "setState", "(Ljava/lang/Object;)V", "state"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ConstraintTracker<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context appContext;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.LinkedHashSet<androidx.work.impl.constraints.ConstraintListener<T>> Camera2StreamConfigurationMap;
    private T getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    public abstract T readSystemState();

    public abstract void startTracking();

    public abstract void stopTracking();

    protected ConstraintTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        this.getHighResolutionOutputSizeshNQ4ISI = taskExecutor;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.appContext = applicationContext;
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashSet<>();
    }

    protected final android.content.Context getAppContext() {
        return this.appContext;
    }

    public final void addListener(androidx.work.impl.constraints.ConstraintListener<T> listener) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.Camera2StreamConfigurationMap.add(listener)) {
                if (this.Camera2StreamConfigurationMap.size() == 1) {
                    this.getHighSpeedVideoFpsRangesFor = readSystemState();
                    androidx.work.Logger logger = androidx.work.Logger.get();
                    str = androidx.work.impl.constraints.trackers.ConstraintTrackerKt.Camera2StreamConfigurationMap;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(getClass().getSimpleName());
                    sb.append(": initial state = ");
                    sb.append(this.getHighSpeedVideoFpsRangesFor);
                    logger.debug(str, sb.toString());
                    startTracking();
                }
                listener.onConstraintChanged(this.getHighSpeedVideoFpsRangesFor);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void removeListener(androidx.work.impl.constraints.ConstraintListener<T> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.Camera2StreamConfigurationMap.remove(listener) && this.Camera2StreamConfigurationMap.isEmpty()) {
                stopTracking();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final T getState() {
        T t = this.getHighSpeedVideoFpsRangesFor;
        return t == null ? readSystemState() : t;
    }

    public final void setState(T t) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            T t2 = this.getHighSpeedVideoFpsRangesFor;
            if (t2 == null || !kotlin.jvm.internal.Intrinsics.areEqual(t2, t)) {
                this.getHighSpeedVideoFpsRangesFor = t;
                final java.util.List list = kotlin.collections.CollectionsKt.toList(this.Camera2StreamConfigurationMap);
                this.getHighResolutionOutputSizeshNQ4ISI.getMainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.work.impl.constraints.trackers.ConstraintTracker$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.work.impl.constraints.trackers.ConstraintTracker.Camera2StreamConfigurationMap(list, this);
                    }
                });
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(java.util.List list, androidx.work.impl.constraints.trackers.ConstraintTracker constraintTracker) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((androidx.work.impl.constraints.ConstraintListener) it.next()).onConstraintChanged(constraintTracker.getHighSpeedVideoFpsRangesFor);
        }
    }
}

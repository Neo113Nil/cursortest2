package androidx.work.impl.constraints.trackers;

/* compiled from: NetworkStateTracker.kt */
@kotlin.Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTracker24;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "context", "Landroid/content/Context;", "taskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "initialState", "getInitialState", "()Landroidx/work/impl/constraints/NetworkState;", "networkCallback", "androidx/work/impl/constraints/trackers/NetworkStateTracker24$networkCallback$1", "Landroidx/work/impl/constraints/trackers/NetworkStateTracker24$networkCallback$1;", "startTracking", "", "stopTracking", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkStateTracker24 extends androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> {
    private final android.net.ConnectivityManager connectivityManager;
    private final androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1 networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1] */
    public NetworkStateTracker24(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        java.lang.Object systemService = getAppContext().getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (android.net.ConnectivityManager) systemService;
        this.networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities capabilities) {
                java.lang.String str;
                android.net.ConnectivityManager connectivityManager;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "network");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilities, "capabilities");
                androidx.work.Logger logger = androidx.work.Logger.get();
                str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.TAG;
                logger.debug(str, "Network capabilities changed: " + capabilities);
                androidx.work.impl.constraints.trackers.NetworkStateTracker24 networkStateTracker24 = androidx.work.impl.constraints.trackers.NetworkStateTracker24.this;
                connectivityManager = networkStateTracker24.connectivityManager;
                networkStateTracker24.setState(androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getActiveNetworkState(connectivityManager));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(android.net.Network network) {
                java.lang.String str;
                android.net.ConnectivityManager connectivityManager;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "network");
                androidx.work.Logger logger = androidx.work.Logger.get();
                str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.TAG;
                logger.debug(str, "Network connection lost");
                androidx.work.impl.constraints.trackers.NetworkStateTracker24 networkStateTracker24 = androidx.work.impl.constraints.trackers.NetworkStateTracker24.this;
                connectivityManager = networkStateTracker24.connectivityManager;
                networkStateTracker24.setState(androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getActiveNetworkState(connectivityManager));
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public androidx.work.impl.constraints.NetworkState getInitialState() {
        return androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        try {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str3 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.TAG;
            logger.debug(str3, "Registering network callback");
            androidx.work.impl.utils.NetworkApi24.registerDefaultNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (java.lang.IllegalArgumentException e) {
            androidx.work.Logger logger2 = androidx.work.Logger.get();
            str2 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.TAG;
            logger2.error(str2, "Received exception while registering network callback", e);
        } catch (java.lang.SecurityException e2) {
            androidx.work.Logger logger3 = androidx.work.Logger.get();
            str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.TAG;
            logger3.error(str, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        try {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str3 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.TAG;
            logger.debug(str3, "Unregistering network callback");
            androidx.work.impl.utils.NetworkApi21.unregisterNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (java.lang.IllegalArgumentException e) {
            androidx.work.Logger logger2 = androidx.work.Logger.get();
            str2 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.TAG;
            logger2.error(str2, "Received exception while unregistering network callback", e);
        } catch (java.lang.SecurityException e2) {
            androidx.work.Logger logger3 = androidx.work.Logger.get();
            str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.TAG;
            logger3.error(str, "Received exception while unregistering network callback", e2);
        }
    }
}

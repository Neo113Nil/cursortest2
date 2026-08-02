package androidx.work.impl.constraints.trackers;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b"}, d2 = {"Landroidx/work/impl/constraints/trackers/NetworkStateTrackerPre28;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "readSystemState", "()Landroidx/work/impl/constraints/NetworkState;", "", "startTracking", "()V", "stopTracking", "Landroid/net/ConnectivityManager;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/net/ConnectivityManager;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRangesFor", "Z", "Landroidx/work/impl/constraints/trackers/NetworkStateTrackerPre28$networkCallback$1;", "Landroidx/work/impl/constraints/trackers/NetworkStateTrackerPre28$networkCallback$1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkStateTrackerPre28 extends androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.net.ConnectivityManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28$networkCallback$1 getHighResolutionOutputSizeshNQ4ISI;
    private volatile boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28$networkCallback$1] */
    public NetworkStateTrackerPre28(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        java.lang.Object systemService = getAppContext().getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoFpsRanges = (android.net.ConnectivityManager) systemService;
        this.Camera2StreamConfigurationMap = new java.lang.Object();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.net.ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities capabilities) {
                java.lang.String str;
                android.net.ConnectivityManager connectivityManager;
                boolean z;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilities, "");
                androidx.work.Logger logger = androidx.work.Logger.get();
                str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
                logger.debug(str, "Network capabilities changed: ".concat(java.lang.String.valueOf(capabilities)));
                androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28 networkStateTrackerPre28 = androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28.this;
                connectivityManager = networkStateTrackerPre28.getHighSpeedVideoFpsRanges;
                z = androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28.this.getHighSpeedVideoFpsRangesFor;
                networkStateTrackerPre28.setState(androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getActiveNetworkState(connectivityManager, z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(android.net.Network network) {
                java.lang.String str;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                androidx.work.Logger logger = androidx.work.Logger.get();
                str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
                logger.debug(str, "Network connection lost");
                androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28.this.setState(new androidx.work.impl.constraints.NetworkState(false, false, false, false, false));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onBlockedStatusChanged(android.net.Network network, boolean blocked) {
                android.net.ConnectivityManager connectivityManager;
                java.lang.String str;
                java.lang.Object obj;
                boolean z;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                connectivityManager = androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28.this.getHighSpeedVideoFpsRanges;
                if (kotlin.jvm.internal.Intrinsics.areEqual(network, connectivityManager.getActiveNetwork())) {
                    androidx.work.Logger logger = androidx.work.Logger.get();
                    str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
                    logger.debug(str, "Network blocked status changed: ".concat(java.lang.String.valueOf(blocked)));
                    androidx.work.impl.constraints.NetworkState state = androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28.this.getState();
                    obj = androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28.this.Camera2StreamConfigurationMap;
                    androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28 networkStateTrackerPre28 = androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28.this;
                    synchronized (obj) {
                        z = networkStateTrackerPre28.getHighSpeedVideoFpsRangesFor;
                        if (z == blocked) {
                            return;
                        }
                        networkStateTrackerPre28.getHighSpeedVideoFpsRangesFor = blocked;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28.this.setState(androidx.work.impl.constraints.NetworkState.copy$default(state, false, false, false, false, blocked, 15, null));
                    }
                }
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final androidx.work.impl.constraints.NetworkState readSystemState() {
        return androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getActiveNetworkState(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void startTracking() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        try {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str3 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
            logger.debug(str3, "Registering network callback");
            androidx.work.impl.utils.NetworkApi24.registerDefaultNetworkCallbackCompat(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        } catch (java.lang.IllegalArgumentException e) {
            androidx.work.Logger logger2 = androidx.work.Logger.get();
            str2 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
            logger2.error(str2, "Received exception while registering network callback", e);
        } catch (java.lang.SecurityException e2) {
            androidx.work.Logger logger3 = androidx.work.Logger.get();
            str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
            logger3.error(str, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public final void stopTracking() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        try {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str3 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
            logger.debug(str3, "Unregistering network callback");
            this.getHighSpeedVideoFpsRanges.unregisterNetworkCallback(this.getHighResolutionOutputSizeshNQ4ISI);
        } catch (java.lang.IllegalArgumentException e) {
            androidx.work.Logger logger2 = androidx.work.Logger.get();
            str2 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
            logger2.error(str2, "Received exception while unregistering network callback", e);
        } catch (java.lang.SecurityException e2) {
            androidx.work.Logger logger3 = androidx.work.Logger.get();
            str = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.getHighSpeedVideoSizes;
            logger3.error(str, "Received exception while unregistering network callback", e2);
        }
    }
}

package androidx.work.impl.constraints.trackers;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u0019\u0010\u0012\u001a\u00070\u000e¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0013\u001a\u00020\n*\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/NetworkState;", "NetworkStateTracker", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "isBlocked", "getActiveNetworkState", "(Landroid/net/ConnectivityManager;Z)Landroidx/work/impl/constraints/NetworkState;", "", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "isActiveNetworkValidated", "(Landroid/net/ConnectivityManager;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkStateTrackerKt {
    private static final java.lang.String getHighSpeedVideoSizes;

    public static final androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> NetworkStateTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        return new androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28(context, taskExecutor);
    }

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("NetworkStateTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighSpeedVideoSizes = tagWithPrefix;
    }

    public static final boolean isActiveNetworkValidated(android.net.ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityManager, "");
        try {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (java.lang.SecurityException e) {
            androidx.work.Logger.get().error(getHighSpeedVideoSizes, "Unable to validate active network", e);
            return false;
        }
    }

    public static final androidx.work.impl.constraints.NetworkState getActiveNetworkState(android.net.ConnectivityManager connectivityManager, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityManager, "");
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return new androidx.work.impl.constraints.NetworkState(activeNetworkInfo != null && activeNetworkInfo.isConnected(), isActiveNetworkValidated(connectivityManager), androidx.core.net.ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true, z);
        } catch (java.lang.SecurityException e) {
            androidx.work.Logger.get().error(getHighSpeedVideoSizes, "Unable to get active network state", e);
            return new androidx.work.impl.constraints.NetworkState(false, false, false, true, z);
        }
    }
}

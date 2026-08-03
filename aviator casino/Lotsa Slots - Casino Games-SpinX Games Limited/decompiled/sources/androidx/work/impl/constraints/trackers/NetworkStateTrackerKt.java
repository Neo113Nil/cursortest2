package androidx.work.impl.constraints.trackers;

/* compiled from: NetworkStateTracker.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\n*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0012"}, d2 = {"TAG", "", "activeNetworkState", "Landroidx/work/impl/constraints/NetworkState;", "Landroid/net/ConnectivityManager;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "getActiveNetworkState", "(Landroid/net/ConnectivityManager;)Landroidx/work/impl/constraints/NetworkState;", "isActiveNetworkValidated", "", "(Landroid/net/ConnectivityManager;)Z", "NetworkStateTracker", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "context", "Landroid/content/Context;", "taskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "work-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkStateTrackerKt {
    private static final java.lang.String TAG;

    public static /* synthetic */ void getActiveNetworkState$annotations(android.net.ConnectivityManager connectivityManager) {
    }

    public static final androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> NetworkStateTracker(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return new androidx.work.impl.constraints.trackers.NetworkStateTracker24(context, taskExecutor);
        }
        return new androidx.work.impl.constraints.trackers.NetworkStateTrackerPre24(context, taskExecutor);
    }

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("NetworkStateTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"NetworkStateTracker\")");
        TAG = tagWithPrefix;
    }

    public static final boolean isActiveNetworkValidated(android.net.ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            android.net.NetworkCapabilities networkCapabilitiesCompat = androidx.work.impl.utils.NetworkApi21.getNetworkCapabilitiesCompat(connectivityManager, androidx.work.impl.utils.NetworkApi23.getActiveNetworkCompat(connectivityManager));
            if (networkCapabilitiesCompat != null) {
                return androidx.work.impl.utils.NetworkApi21.hasCapabilityCompat(networkCapabilitiesCompat, 16);
            }
            return false;
        } catch (java.lang.SecurityException e) {
            androidx.work.Logger.get().error(TAG, "Unable to validate active network", e);
            return false;
        }
    }

    public static final androidx.work.impl.constraints.NetworkState getActiveNetworkState(android.net.ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return new androidx.work.impl.constraints.NetworkState(activeNetworkInfo != null && activeNetworkInfo.isConnected(), isActiveNetworkValidated(connectivityManager), androidx.core.net.ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}

package androidx.work.impl.constraints.trackers;

/* compiled from: Trackers.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/work/impl/constraints/trackers/Trackers;", "", "context", "Landroid/content/Context;", "taskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "batteryChargingTracker", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "", "batteryNotLowTracker", "Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "networkStateTracker", "Landroidx/work/impl/constraints/NetworkState;", "storageNotLowTracker", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/constraints/trackers/ConstraintTracker;Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;Landroidx/work/impl/constraints/trackers/ConstraintTracker;Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "getBatteryChargingTracker", "()Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "getBatteryNotLowTracker", "()Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "getNetworkStateTracker", "getStorageNotLowTracker", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Trackers {
    private final androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> batteryChargingTracker;
    private final androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker;
    private final androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> networkStateTracker;
    private final androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> storageNotLowTracker;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> batteryChargingTracker) {
        this(context, taskExecutor, batteryChargingTracker, null, null, null, 56, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> batteryChargingTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, null, null, 48, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> batteryChargingTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker, androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> networkStateTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, networkStateTracker, null, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
    }

    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> batteryChargingTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker, androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> networkStateTracker, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> storageNotLowTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.batteryChargingTracker = batteryChargingTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = networkStateTracker;
        this.storageNotLowTracker = storageNotLowTracker;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker constraintTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker, androidx.work.impl.constraints.trackers.ConstraintTracker constraintTracker2, androidx.work.impl.constraints.trackers.ConstraintTracker constraintTracker3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, taskExecutor, r3, r4, r5, r6);
        androidx.work.impl.constraints.trackers.ConstraintTracker constraintTracker4;
        androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker2;
        androidx.work.impl.constraints.trackers.ConstraintTracker constraintTracker5;
        androidx.work.impl.constraints.trackers.ConstraintTracker constraintTracker6;
        if ((i & 4) != 0) {
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            constraintTracker4 = new androidx.work.impl.constraints.trackers.BatteryChargingTracker(applicationContext, taskExecutor);
        } else {
            constraintTracker4 = constraintTracker;
        }
        if ((i & 8) != 0) {
            android.content.Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            batteryNotLowTracker2 = new androidx.work.impl.constraints.trackers.BatteryNotLowTracker(applicationContext2, taskExecutor);
        } else {
            batteryNotLowTracker2 = batteryNotLowTracker;
        }
        if ((i & 16) != 0) {
            android.content.Context applicationContext3 = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
            constraintTracker5 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.NetworkStateTracker(applicationContext3, taskExecutor);
        } else {
            constraintTracker5 = constraintTracker2;
        }
        if ((i & 32) != 0) {
            android.content.Context applicationContext4 = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext4, "context.applicationContext");
            constraintTracker6 = new androidx.work.impl.constraints.trackers.StorageNotLowTracker(applicationContext4, taskExecutor);
        } else {
            constraintTracker6 = constraintTracker3;
        }
    }

    public final androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> getBatteryChargingTracker() {
        return this.batteryChargingTracker;
    }

    public final androidx.work.impl.constraints.trackers.BatteryNotLowTracker getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    public final androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> getNetworkStateTracker() {
        return this.networkStateTracker;
    }

    public final androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> getStorageNotLowTracker() {
        return this.storageNotLowTracker;
    }
}

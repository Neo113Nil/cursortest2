package androidx.work.impl.constraints.trackers;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015"}, d2 = {"Landroidx/work/impl/constraints/trackers/Trackers;", "", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "", "batteryChargingTracker", "Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "batteryNotLowTracker", "Landroidx/work/impl/constraints/NetworkState;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/constraints/trackers/ConstraintTracker;Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;Landroidx/work/impl/constraints/trackers/ConstraintTracker;Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "getBatteryChargingTracker", "()Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "getBatteryNotLowTracker", "()Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "getNetworkStateTracker", "getStorageNotLowTracker"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Trackers {
    private final androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> batteryChargingTracker;
    private final androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker;
    private final android.content.Context context;
    private final androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> networkStateTracker;
    private final androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> storageNotLowTracker;

    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> constraintTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker, androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> constraintTracker2, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> constraintTracker3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotLowTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintTracker3, "");
        this.context = context;
        this.batteryChargingTracker = constraintTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = constraintTracker2;
        this.storageNotLowTracker = constraintTracker3;
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
        androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> constraintTracker7;
        if ((i & 4) != 0) {
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            constraintTracker4 = new androidx.work.impl.constraints.trackers.BatteryChargingTracker(applicationContext, taskExecutor);
        } else {
            constraintTracker4 = constraintTracker;
        }
        if ((i & 8) != 0) {
            android.content.Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            batteryNotLowTracker2 = new androidx.work.impl.constraints.trackers.BatteryNotLowTracker(applicationContext2, taskExecutor);
        } else {
            batteryNotLowTracker2 = batteryNotLowTracker;
        }
        if ((i & 16) != 0) {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                android.content.Context applicationContext3 = context.getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
                constraintTracker7 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.NetworkStateTracker(applicationContext3, taskExecutor);
            } else {
                constraintTracker7 = null;
            }
            constraintTracker5 = constraintTracker7;
        } else {
            constraintTracker5 = constraintTracker2;
        }
        if ((i & 32) != 0) {
            android.content.Context applicationContext4 = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext4, "");
            constraintTracker6 = new androidx.work.impl.constraints.trackers.StorageNotLowTracker(applicationContext4, taskExecutor);
        } else {
            constraintTracker6 = constraintTracker3;
        }
    }

    public final android.content.Context getContext() {
        return this.context;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> constraintTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker, androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> constraintTracker2) {
        this(context, taskExecutor, constraintTracker, batteryNotLowTracker, constraintTracker2, null, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotLowTracker, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> constraintTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker) {
        this(context, taskExecutor, constraintTracker, batteryNotLowTracker, null, null, 48, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotLowTracker, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker<java.lang.Boolean> constraintTracker) {
        this(context, taskExecutor, constraintTracker, null, null, null, 56, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintTracker, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(android.content.Context context, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskExecutor, "");
    }
}

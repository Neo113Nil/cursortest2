package androidx.work.impl.constraints;

/* compiled from: WorkConstraintsTracker.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTrackerImpl;", "Landroidx/work/impl/constraints/WorkConstraintsTracker;", "Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", com.adjust.sdk.Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, "Landroidx/work/impl/constraints/trackers/Trackers;", "callback", "Landroidx/work/impl/constraints/WorkConstraintsCallback;", "(Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/constraints/WorkConstraintsCallback;)V", "constraintControllers", "", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "(Landroidx/work/impl/constraints/WorkConstraintsCallback;[Landroidx/work/impl/constraints/controllers/ConstraintController;)V", "[Landroidx/work/impl/constraints/controllers/ConstraintController;", "lock", "", "areAllConstraintsMet", "", "workSpecId", "", "onConstraintMet", "", "workSpecs", "", "Landroidx/work/impl/model/WorkSpec;", "onConstraintNotMet", "replace", "", "reset", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class WorkConstraintsTrackerImpl implements androidx.work.impl.constraints.WorkConstraintsTracker, androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback {
    private final androidx.work.impl.constraints.WorkConstraintsCallback callback;
    private final androidx.work.impl.constraints.controllers.ConstraintController<?>[] constraintControllers;
    private final java.lang.Object lock;

    public WorkConstraintsTrackerImpl(androidx.work.impl.constraints.WorkConstraintsCallback workConstraintsCallback, androidx.work.impl.constraints.controllers.ConstraintController<?>[] constraintControllers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.callback = workConstraintsCallback;
        this.constraintControllers = constraintControllers;
        this.lock = new java.lang.Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerImpl(androidx.work.impl.constraints.trackers.Trackers trackers, androidx.work.impl.constraints.WorkConstraintsCallback workConstraintsCallback) {
        this(workConstraintsCallback, (androidx.work.impl.constraints.controllers.ConstraintController<?>[]) new androidx.work.impl.constraints.controllers.ConstraintController[]{new androidx.work.impl.constraints.controllers.BatteryChargingController(trackers.getBatteryChargingTracker()), new androidx.work.impl.constraints.controllers.BatteryNotLowController(trackers.getBatteryNotLowTracker()), new androidx.work.impl.constraints.controllers.StorageNotLowController(trackers.getStorageNotLowTracker()), new androidx.work.impl.constraints.controllers.NetworkConnectedController(trackers.getNetworkStateTracker()), new androidx.work.impl.constraints.controllers.NetworkUnmeteredController(trackers.getNetworkStateTracker()), new androidx.work.impl.constraints.controllers.NetworkNotRoamingController(trackers.getNetworkStateTracker()), new androidx.work.impl.constraints.controllers.NetworkMeteredController(trackers.getNetworkStateTracker())});
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "trackers");
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsTracker
    public void replace(java.lang.Iterable<androidx.work.impl.model.WorkSpec> workSpecs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.lock) {
            for (androidx.work.impl.constraints.controllers.ConstraintController<?> constraintController : this.constraintControllers) {
                constraintController.setCallback(null);
            }
            for (androidx.work.impl.constraints.controllers.ConstraintController<?> constraintController2 : this.constraintControllers) {
                constraintController2.replace(workSpecs);
            }
            for (androidx.work.impl.constraints.controllers.ConstraintController<?> constraintController3 : this.constraintControllers) {
                constraintController3.setCallback(this);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsTracker
    public void reset() {
        synchronized (this.lock) {
            for (androidx.work.impl.constraints.controllers.ConstraintController<?> constraintController : this.constraintControllers) {
                constraintController.reset();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final boolean areAllConstraintsMet(java.lang.String workSpecId) {
        androidx.work.impl.constraints.controllers.ConstraintController<?> constraintController;
        boolean z;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] constraintControllerArr = this.constraintControllers;
            int length = constraintControllerArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constraintController = null;
                    break;
                }
                constraintController = constraintControllerArr[i];
                if (constraintController.isWorkSpecConstrained(workSpecId)) {
                    break;
                }
                i++;
            }
            if (constraintController != null) {
                androidx.work.Logger logger = androidx.work.Logger.get();
                str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.TAG;
                logger.debug(str, "Work " + workSpecId + " constrained by " + constraintController.getClass().getSimpleName());
            }
            z = constraintController == null;
        }
        return z;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintMet(java.util.List<androidx.work.impl.model.WorkSpec> workSpecs) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.lock) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : workSpecs) {
                if (areAllConstraintsMet(((androidx.work.impl.model.WorkSpec) obj).id)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList<androidx.work.impl.model.WorkSpec> arrayList2 = arrayList;
            for (androidx.work.impl.model.WorkSpec workSpec : arrayList2) {
                androidx.work.Logger logger = androidx.work.Logger.get();
                str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.TAG;
                logger.debug(str, "Constraints met for " + workSpec);
            }
            androidx.work.impl.constraints.WorkConstraintsCallback workConstraintsCallback = this.callback;
            if (workConstraintsCallback != null) {
                workConstraintsCallback.onAllConstraintsMet(arrayList2);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintNotMet(java.util.List<androidx.work.impl.model.WorkSpec> workSpecs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.lock) {
            androidx.work.impl.constraints.WorkConstraintsCallback workConstraintsCallback = this.callback;
            if (workConstraintsCallback != null) {
                workConstraintsCallback.onAllConstraintsNotMet(workSpecs);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }
}

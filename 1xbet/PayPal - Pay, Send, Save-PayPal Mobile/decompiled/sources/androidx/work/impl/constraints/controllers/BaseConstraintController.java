package androidx.work.impl.constraints.controllers;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188%X¤\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "T", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "isConstrained", "(Ljava/lang/Object;)Z", "Landroidx/work/Constraints;", "constraints", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "track", "(Landroidx/work/Constraints;)Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "isCurrentlyConstrained", "(Landroidx/work/impl/model/WorkSpec;)Z", "getHighSpeedVideoFpsRanges", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "getHighResolutionOutputSizeshNQ4ISI", "", "getReason", "()I", "getReason$annotations", "()V", "reason"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseConstraintController<T> implements androidx.work.impl.constraints.controllers.ConstraintController {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.work.impl.constraints.trackers.ConstraintTracker<T> getHighResolutionOutputSizeshNQ4ISI;

    protected static /* synthetic */ void getReason$annotations() {
    }

    protected abstract int getReason();

    protected boolean isConstrained(T value) {
        return false;
    }

    public BaseConstraintController(androidx.work.impl.constraints.trackers.ConstraintTracker<T> constraintTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintTracker, "");
        this.getHighResolutionOutputSizeshNQ4ISI = constraintTracker;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public kotlinx.coroutines.flow.Flow<androidx.work.impl.constraints.ConstraintsState> track(androidx.work.Constraints constraints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.work.impl.constraints.controllers.BaseConstraintController$track$1(this, null));
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        return hasConstraint(workSpec) && isConstrained(this.getHighResolutionOutputSizeshNQ4ISI.readSystemState());
    }
}

package androidx.work.impl.constraints.controllers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0015X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/work/impl/constraints/controllers/BatteryNotLowController;", "Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "", "Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "hasConstraint", "(Landroidx/work/impl/model/WorkSpec;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isConstrained", "(Z)Z", "", "reason", com.visa.cbp.getEncExpo.warmup, "getReason", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatteryNotLowController extends androidx.work.impl.constraints.controllers.BaseConstraintController<java.lang.Boolean> {
    private final int reason;

    protected final boolean isConstrained(boolean value) {
        return !value;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    public final /* synthetic */ boolean isConstrained(java.lang.Boolean bool) {
        return isConstrained(bool.booleanValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryNotLowController(androidx.work.impl.constraints.trackers.BatteryNotLowTracker batteryNotLowTracker) {
        super(batteryNotLowTracker);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotLowTracker, "");
        this.reason = 5;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    protected final int getReason() {
        return this.reason;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        return workSpec.constraints.getGetHighSpeedVideoFpsRangesFor();
    }
}

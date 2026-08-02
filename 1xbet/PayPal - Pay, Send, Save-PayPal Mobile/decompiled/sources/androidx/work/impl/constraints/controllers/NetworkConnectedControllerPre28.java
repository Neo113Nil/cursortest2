package androidx.work.impl.constraints.controllers;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0015X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/work/impl/constraints/controllers/NetworkConnectedControllerPre28;", "Landroidx/work/impl/constraints/controllers/BaseConstraintController;", "Landroidx/work/impl/constraints/NetworkState;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "hasConstraint", "(Landroidx/work/impl/model/WorkSpec;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isConstrained", "(Landroidx/work/impl/constraints/NetworkState;)Z", "", "reason", com.visa.cbp.getEncExpo.warmup, "getReason", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkConnectedControllerPre28 extends androidx.work.impl.constraints.controllers.BaseConstraintController<androidx.work.impl.constraints.NetworkState> {
    private final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkConnectedControllerPre28(androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> constraintTracker) {
        super(constraintTracker);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintTracker, "");
        this.reason = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    protected final int getReason() {
        return this.reason;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        return workSpec.constraints.getRequiredNetworkType() == androidx.work.NetworkType.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    public final boolean isConstrained(androidx.work.impl.constraints.NetworkState value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return (!value.isBlocked() && value.isConnected() && value.isValidated()) ? false : true;
    }
}

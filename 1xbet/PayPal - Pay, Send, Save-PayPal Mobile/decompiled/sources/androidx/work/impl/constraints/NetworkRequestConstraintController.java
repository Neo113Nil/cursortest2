package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Landroidx/work/Constraints;", "constraints", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "track", "(Landroidx/work/Constraints;)Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "hasConstraint", "(Landroidx/work/impl/model/WorkSpec;)Z", "isCurrentlyConstrained", "getHighSpeedVideoFpsRanges", "Landroid/net/ConnectivityManager;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkRequestConstraintController implements androidx.work.impl.constraints.controllers.ConstraintController {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.net.ConnectivityManager getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRangesFor;

    public NetworkRequestConstraintController(android.net.ConnectivityManager connectivityManager, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = connectivityManager;
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    public /* synthetic */ NetworkRequestConstraintController(android.net.ConnectivityManager connectivityManager, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i & 2) != 0 ? 1000L : j);
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final kotlinx.coroutines.flow.Flow<androidx.work.impl.constraints.ConstraintsState> track(androidx.work.Constraints constraints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.work.impl.constraints.NetworkRequestConstraintController$track$1(constraints, this, null));
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean hasConstraint(androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        return (workSpec.constraints.getRequiredNetworkRequest() == null && workSpec.constraints.getRequiredNetworkType() == androidx.work.NetworkType.NOT_REQUIRED) ? false : true;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean isCurrentlyConstrained(androidx.work.impl.model.WorkSpec workSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        if (hasConstraint(workSpec)) {
            throw new java.lang.IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}

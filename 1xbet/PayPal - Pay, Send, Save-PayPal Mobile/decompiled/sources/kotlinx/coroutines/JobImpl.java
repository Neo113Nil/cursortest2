package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00078\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\t"}, d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "()Z", "", "exception", "completeExceptionally", "(Ljava/lang/Throwable;)Z", "Camera2StreamConfigurationMap", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "handlesException", "Z", "getHandlesException$kotlinx_coroutines_core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class JobImpl extends kotlinx.coroutines.JobSupport implements kotlinx.coroutines.CompletableJob {
    private final boolean handlesException;

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }

    public JobImpl(kotlinx.coroutines.Job job) {
        super(true);
        initParentJob(job);
        this.handlesException = Camera2StreamConfigurationMap();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: getHandlesException$kotlinx_coroutines_core, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // kotlinx.coroutines.CompletableJob
    public boolean complete() {
        return makeCompleting$kotlinx_coroutines_core(kotlin.Unit.INSTANCE);
    }

    @Override // kotlinx.coroutines.CompletableJob
    public boolean completeExceptionally(java.lang.Throwable exception) {
        return makeCompleting$kotlinx_coroutines_core(new kotlinx.coroutines.CompletedExceptionally(exception, false, 2, null));
    }

    private final boolean Camera2StreamConfigurationMap() {
        kotlinx.coroutines.JobSupport job;
        kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        kotlinx.coroutines.ChildHandleNode childHandleNode = parentHandle$kotlinx_coroutines_core instanceof kotlinx.coroutines.ChildHandleNode ? (kotlinx.coroutines.ChildHandleNode) parentHandle$kotlinx_coroutines_core : null;
        if (childHandleNode == null || (job = childHandleNode.getJob()) == null) {
            return false;
        }
        while (!job.getHandlesException()) {
            kotlinx.coroutines.ChildHandle parentHandle$kotlinx_coroutines_core2 = job.getParentHandle$kotlinx_coroutines_core();
            kotlinx.coroutines.ChildHandleNode childHandleNode2 = parentHandle$kotlinx_coroutines_core2 instanceof kotlinx.coroutines.ChildHandleNode ? (kotlinx.coroutines.ChildHandleNode) parentHandle$kotlinx_coroutines_core2 : null;
            if (childHandleNode2 == null || (job = childHandleNode2.getJob()) == null) {
                return false;
            }
        }
        return true;
    }
}

package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/SupervisorJobImpl;", "Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/Job;", "p0", "<init>", "(Lkotlinx/coroutines/Job;)V", "", "", "childCancelled", "(Ljava/lang/Throwable;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SupervisorJobImpl extends kotlinx.coroutines.JobImpl {
    @Override // kotlinx.coroutines.JobSupport
    public final boolean childCancelled(java.lang.Throwable p0) {
        return false;
    }

    public SupervisorJobImpl(kotlinx.coroutines.Job job) {
        super(job);
    }
}

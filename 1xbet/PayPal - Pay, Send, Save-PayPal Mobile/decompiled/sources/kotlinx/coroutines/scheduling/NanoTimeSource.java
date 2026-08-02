package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/scheduling/NanoTimeSource;", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "<init>", "()V", "", "nanoTime", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NanoTimeSource extends kotlinx.coroutines.scheduling.SchedulerTimeSource {
    public static final kotlinx.coroutines.scheduling.NanoTimeSource INSTANCE = new kotlinx.coroutines.scheduling.NanoTimeSource();

    private NanoTimeSource() {
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerTimeSource
    public final long nanoTime() {
        return java.lang.System.nanoTime();
    }
}

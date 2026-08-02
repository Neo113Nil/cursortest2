package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0018\u0010\n\u001a\u00060\u0000j\u0002`\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0018\u0010\u000b\u001a\u00060\u0000j\u0002`\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0018\u0010\f\u001a\u00060\u0000j\u0002`\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\r8Á\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f*\f\b\u0000\u0010\u0011\"\u00020\u00002\u00020\u0000"}, d2 = {"", "BUFFER_CAPACITY_BASE", com.visa.cbp.getEncExpo.warmup, "BUFFER_CAPACITY", "MASK", "", "TASK_STOLEN", "J", "NOTHING_TO_STEAL", "Lkotlinx/coroutines/scheduling/StealingMode;", "STEAL_ANY", "STEAL_CPU_ONLY", "STEAL_BLOCKING_ONLY", "Lkotlinx/coroutines/scheduling/Task;", "getMaskForStealingMode", "(Lkotlinx/coroutines/scheduling/Task;)I", "maskForStealingMode", "StealingMode"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WorkQueueKt {
    public static final int BUFFER_CAPACITY = 128;
    public static final int BUFFER_CAPACITY_BASE = 7;
    public static final int MASK = 127;
    public static final long NOTHING_TO_STEAL = -2;
    public static final int STEAL_ANY = 3;
    public static final int STEAL_BLOCKING_ONLY = 1;
    public static final int STEAL_CPU_ONLY = 2;
    public static final long TASK_STOLEN = -1;

    public static final int getMaskForStealingMode(kotlinx.coroutines.scheduling.Task task) {
        return task.taskContext ? 1 : 2;
    }
}

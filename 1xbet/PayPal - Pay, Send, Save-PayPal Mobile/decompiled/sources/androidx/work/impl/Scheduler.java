package androidx.work.impl;

/* loaded from: classes3.dex */
public interface Scheduler {
    public static final int MAX_GREEDY_SCHEDULER_LIMIT = 200;
    public static final int MAX_SCHEDULER_LIMIT = 50;

    void cancel(java.lang.String str);

    boolean hasLimitedSchedulingSlots();

    void schedule(androidx.work.impl.model.WorkSpec... workSpecArr);
}

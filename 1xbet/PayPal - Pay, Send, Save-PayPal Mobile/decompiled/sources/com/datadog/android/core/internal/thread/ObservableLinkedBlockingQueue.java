package com.datadog.android.core.internal.thread;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000 \u0012*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0012B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/core/internal/thread/ObservableLinkedBlockingQueue;", "", "E", "Ljava/util/concurrent/LinkedBlockingQueue;", "", "capacity", "<init>", "(I)V", "", "currentTimestamp", "", "", "dumpQueue", "(J)Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicLong;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicLong;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ObservableLinkedBlockingQueue<E> extends java.util.concurrent.LinkedBlockingQueue<E> {
    private static final long getHighSpeedVideoFpsRangesFor = java.util.concurrent.TimeUnit.SECONDS.toMillis(5);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges;

    public /* synthetic */ ObservableLinkedBlockingQueue(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i);
    }

    public int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return getSize();
    }

    public ObservableLinkedBlockingQueue(int i) {
        super(i);
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    public final java.util.Map<java.lang.String, java.lang.Integer> dumpQueue(long currentTimestamp) {
        java.lang.String name2;
        long j = this.getHighSpeedVideoFpsRanges.get();
        if (currentTimestamp - j <= getHighSpeedVideoFpsRangesFor || !this.getHighSpeedVideoFpsRanges.compareAndSet(j, currentTimestamp)) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Object[] array = super.toArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        for (java.lang.Object obj : array) {
            com.datadog.android.internal.thread.NamedExecutionUnit namedExecutionUnit = obj instanceof com.datadog.android.internal.thread.NamedExecutionUnit ? (com.datadog.android.internal.thread.NamedExecutionUnit) obj : null;
            if (namedExecutionUnit != null && (name2 = namedExecutionUnit.getName()) != null) {
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(name2);
                linkedHashMap.put(name2, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        return linkedHashMap;
    }

    public ObservableLinkedBlockingQueue() {
        this(0, 1, null);
    }
}

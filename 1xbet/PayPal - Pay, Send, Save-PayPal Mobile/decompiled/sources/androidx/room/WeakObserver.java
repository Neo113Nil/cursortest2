package androidx.room;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/room/WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "Landroidx/room/InvalidationTracker;", "tracker", "delegate", "<init>", "(Landroidx/room/InvalidationTracker;Landroidx/room/InvalidationTracker$Observer;)V", "", "", "tables", "", "onInvalidated", "(Ljava/util/Set;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/InvalidationTracker;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoSizes", "Ljava/lang/ref/WeakReference;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WeakObserver extends androidx.room.InvalidationTracker.Observer {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.room.InvalidationTracker getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<androidx.room.InvalidationTracker.Observer> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeakObserver(androidx.room.InvalidationTracker invalidationTracker, androidx.room.InvalidationTracker.Observer observer) {
        super(observer.getTables());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidationTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "");
        this.getHighSpeedVideoFpsRangesFor = invalidationTracker;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(observer);
    }

    @Override // androidx.room.InvalidationTracker.Observer
    public final void onInvalidated(java.util.Set<java.lang.String> tables) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "");
        androidx.room.InvalidationTracker.Observer observer = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (observer == null) {
            this.getHighSpeedVideoFpsRangesFor.removeObserver(this);
        } else {
            observer.onInvalidated(tables);
        }
    }
}

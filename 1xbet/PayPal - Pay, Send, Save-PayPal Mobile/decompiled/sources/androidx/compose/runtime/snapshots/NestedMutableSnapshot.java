package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "dispose", "()V", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NestedMutableSnapshot extends androidx.compose.runtime.snapshots.MutableSnapshot {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.snapshots.MutableSnapshot parent;

    public NestedMutableSnapshot(long j, androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function12, androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot) {
        super(j, snapshotIdSet, function1, function12);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo5471nestedActivated$runtime(this);
    }

    public final androidx.compose.runtime.snapshots.MutableSnapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final androidx.compose.runtime.snapshots.Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        getHighSpeedVideoFpsRanges();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: all -> 0x00dc, TryCatch #0 {, blocks: (B:11:0x0036, B:13:0x003e, B:16:0x0045, B:21:0x0061, B:23:0x0069, B:25:0x007f, B:27:0x008b, B:28:0x0090, B:33:0x0071, B:34:0x007a), top: B:10:0x0036 }] */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        java.util.Map<androidx.compose.runtime.snapshots.StateRecord, ? extends androidx.compose.runtime.snapshots.StateRecord> map;
        java.util.Map<androidx.compose.runtime.snapshots.StateRecord, ? extends androidx.compose.runtime.snapshots.StateRecord> highSpeedVideoFpsRanges;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new androidx.compose.runtime.snapshots.SnapshotApplyResult.Failure(this);
        }
        androidx.collection.MutableScatterSet<androidx.compose.runtime.snapshots.StateObject> modified$runtime = getModified$runtime();
        long snapshotId = getSnapshotId();
        if (modified$runtime != null) {
            highSpeedVideoFpsRanges = androidx.compose.runtime.snapshots.SnapshotKt.getHighSpeedVideoFpsRanges(this.parent.getSnapshotId(), this, this.parent.getInvalid());
            map = highSpeedVideoFpsRanges;
        } else {
            map = null;
        }
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            androidx.compose.runtime.snapshots.SnapshotKt.Camera2StreamConfigurationMap(this);
            if (modified$runtime != null && modified$runtime.get_size() != 0) {
                androidx.compose.runtime.snapshots.SnapshotApplyResult innerApplyLocked$runtime = innerApplyLocked$runtime(this.parent.getSnapshotId(), modified$runtime, map, this.parent.getInvalid());
                if (!kotlin.jvm.internal.Intrinsics.areEqual(innerApplyLocked$runtime, androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE)) {
                    return innerApplyLocked$runtime;
                }
                androidx.collection.MutableScatterSet<androidx.compose.runtime.snapshots.StateObject> modified$runtime2 = this.parent.getModified$runtime();
                if (modified$runtime2 != null) {
                    modified$runtime2.addAll(modified$runtime);
                }
                this.parent.setModified$runtime(modified$runtime);
                setModified$runtime(null);
                if (kotlin.jvm.internal.Intrinsics.compare(this.parent.getSnapshotId(), snapshotId) < 0) {
                    this.parent.advance$runtime();
                }
                androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot = this.parent;
                mutableSnapshot.setInvalid$runtime(mutableSnapshot.getInvalid().clear(snapshotId).andNot(getPreviousIds()));
                this.parent.recordPrevious$runtime(snapshotId);
                this.parent.recordPreviousPinnedSnapshot$runtime(takeoverPinnedSnapshot$runtime());
                this.parent.recordPreviousList$runtime(getPreviousIds());
                this.parent.recordPreviousPinnedSnapshots$runtime(getPreviousPinnedSnapshots());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                setApplied$runtime(true);
                getHighSpeedVideoFpsRanges();
                androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime);
                return androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE;
            }
            closeAndReleasePinning$runtime();
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            if (kotlin.jvm.internal.Intrinsics.compare(this.parent.getSnapshotId(), snapshotId) < 0) {
            }
            androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot2 = this.parent;
            mutableSnapshot2.setInvalid$runtime(mutableSnapshot2.getInvalid().clear(snapshotId).andNot(getPreviousIds()));
            this.parent.recordPrevious$runtime(snapshotId);
            this.parent.recordPreviousPinnedSnapshot$runtime(takeoverPinnedSnapshot$runtime());
            this.parent.recordPreviousList$runtime(getPreviousIds());
            this.parent.recordPreviousPinnedSnapshots$runtime(getPreviousPinnedSnapshots());
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            setApplied$runtime(true);
            getHighSpeedVideoFpsRanges();
            androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime);
            return androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE;
        }
    }

    private final void getHighSpeedVideoFpsRanges() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        this.parent.mo5472nestedDeactivated$runtime(this);
    }
}

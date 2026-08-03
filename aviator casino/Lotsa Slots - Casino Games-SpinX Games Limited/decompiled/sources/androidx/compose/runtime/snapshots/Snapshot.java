package androidx.compose.runtime.snapshots;

/* compiled from: Snapshot.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 S2\u00020\u0001:\u0001SB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u00100\u001a\u00020\"H\u0000¢\u0006\u0002\b1J\r\u00102\u001a\u00020\"H\u0010¢\u0006\u0002\b3J\b\u00104\u001a\u00020\"H\u0016J\"\u00105\u001a\u0002H6\"\u0004\b\u0000\u001062\f\u00107\u001a\b\u0012\u0004\u0012\u0002H608H\u0086\b¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\bH&J\n\u0010;\u001a\u0004\u0018\u00010\u0000H\u0011J\u0015\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020\u0000H ¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020\"2\u0006\u0010=\u001a\u00020\u0000H ¢\u0006\u0002\b@J\r\u0010A\u001a\u00020\"H ¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020\u001aH ¢\u0006\u0002\bEJ\r\u0010F\u001a\u00020\"H\u0000¢\u0006\u0002\bGJ\r\u0010H\u001a\u00020\"H\u0010¢\u0006\u0002\bIJ\u0012\u0010J\u001a\u00020\"2\b\u0010=\u001a\u0004\u0018\u00010\u0000H\u0011J \u0010K\u001a\u00020\u00002\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\"\u0018\u00010!H&J\r\u0010L\u001a\u00020\u0003H\u0000¢\u0006\u0002\bMJ\n\u0010N\u001a\u0004\u0018\u00010\u0000H\u0007J\u0012\u0010O\u001a\u00020\"2\b\u0010P\u001a\u0004\u0018\u00010\u0000H\u0007J\r\u0010Q\u001a\u00020\"H\u0000¢\u0006\u0002\bRR\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0016\u001a\u00020\b8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u0003X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\"\u0018\u00010!X \u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\nR\u0012\u0010'\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R$\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00038P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R \u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\"\u0018\u00010!X \u0004¢\u0006\u0006\u001a\u0004\b/\u0010$\u0082\u0001\u0004TUVW¨\u0006X"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "disposed", "", "getDisposed$runtime_release", "()Z", "setDisposed$runtime_release", "(Z)V", "<set-?>", "getId", "()I", "setId$runtime_release", "(I)V", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "isPinned", "isPinned$runtime_release", "modified", "Landroidx/compose/runtime/collection/IdentityArraySet;", "Landroidx/compose/runtime/snapshots/StateObject;", "getModified$runtime_release", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "pinningTrackingHandle", "getPinningTrackingHandle$annotations", "()V", "readObserver", "Lkotlin/Function1;", "", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "value", "writeCount", "getWriteCount$runtime_release", "setWriteCount$runtime_release", "writeObserver", "getWriteObserver$runtime_release", "closeAndReleasePinning", "closeAndReleasePinning$runtime_release", "closeLocked", "closeLocked$runtime_release", "dispose", "enter", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasPendingChanges", "makeCurrent", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "releasePinnedSnapshotLocked", "releasePinnedSnapshotLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "restoreCurrent", "takeNestedSnapshot", "takeoverPinnedSnapshot", "takeoverPinnedSnapshot$runtime_release", "unsafeEnter", "unsafeLeave", "oldSnapshot", "validateNotDisposed", "validateNotDisposed$runtime_release", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Snapshot {
    private boolean disposed;
    private int id;
    private androidx.compose.runtime.snapshots.SnapshotIdSet invalid;
    private int pinningTrackingHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.snapshots.Snapshot.Companion INSTANCE = new androidx.compose.runtime.snapshots.Snapshot.Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ Snapshot(int i, androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, snapshotIdSet);
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public abstract androidx.compose.runtime.collection.IdentityArraySet<androidx.compose.runtime.snapshots.StateObject> getModified$runtime_release();

    public abstract kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getReadObserver$runtime_release();

    public abstract boolean getReadOnly();

    public abstract androidx.compose.runtime.snapshots.Snapshot getRoot();

    public int getWriteCount$runtime_release() {
        return 0;
    }

    public abstract kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo1730nestedActivated$runtime_release(androidx.compose.runtime.snapshots.Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo1731nestedDeactivated$runtime_release(androidx.compose.runtime.snapshots.Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo1732recordModified$runtime_release(androidx.compose.runtime.snapshots.StateObject state);

    public abstract androidx.compose.runtime.snapshots.Snapshot takeNestedSnapshot(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver);

    private Snapshot(int i, androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.id = i;
        this.pinningTrackingHandle = i != 0 ? androidx.compose.runtime.snapshots.SnapshotKt.trackPinning(i, getInvalid()) : -1;
    }

    /* renamed from: getInvalid$runtime_release, reason: from getter */
    public androidx.compose.runtime.snapshots.SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    public void setInvalid$runtime_release(androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public int getId() {
        return this.id;
    }

    public void setId$runtime_release(int i) {
        this.id = i;
    }

    public void setWriteCount$runtime_release(int i) {
        throw new java.lang.IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.runtime.snapshots.Snapshot takeNestedSnapshot$default(androidx.compose.runtime.snapshots.Snapshot snapshot, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        return snapshot.takeNestedSnapshot(function1);
    }

    public final <T> T enter(kotlin.jvm.functions.Function0<? extends T> block) {
        androidx.compose.runtime.snapshots.Snapshot makeCurrent = makeCurrent();
        try {
            return block.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            restoreCurrent(makeCurrent);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public androidx.compose.runtime.snapshots.Snapshot makeCurrent() {
        androidx.compose.runtime.SnapshotThreadLocal snapshotThreadLocal;
        androidx.compose.runtime.SnapshotThreadLocal snapshotThreadLocal2;
        snapshotThreadLocal = androidx.compose.runtime.snapshots.SnapshotKt.threadSnapshot;
        androidx.compose.runtime.snapshots.Snapshot snapshot = (androidx.compose.runtime.snapshots.Snapshot) snapshotThreadLocal.get();
        snapshotThreadLocal2 = androidx.compose.runtime.snapshots.SnapshotKt.threadSnapshot;
        snapshotThreadLocal2.set(this);
        return snapshot;
    }

    public void restoreCurrent(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        androidx.compose.runtime.SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = androidx.compose.runtime.snapshots.SnapshotKt.threadSnapshot;
        snapshotThreadLocal.set(snapshot);
    }

    public final androidx.compose.runtime.snapshots.Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(androidx.compose.runtime.snapshots.Snapshot oldSnapshot) {
        androidx.compose.runtime.SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = androidx.compose.runtime.snapshots.SnapshotKt.threadSnapshot;
        if (snapshotThreadLocal.get() != this) {
            throw new java.lang.IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
        }
        restoreCurrent(oldSnapshot);
    }

    /* renamed from: getDisposed$runtime_release, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    public final void setDisposed$runtime_release(boolean z) {
        this.disposed = z;
    }

    public final boolean isPinned$runtime_release() {
        return this.pinningTrackingHandle >= 0;
    }

    public void closeLocked$runtime_release() {
        androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet;
        snapshotIdSet = androidx.compose.runtime.snapshots.SnapshotKt.openSnapshots;
        androidx.compose.runtime.snapshots.SnapshotKt.openSnapshots = snapshotIdSet.clear(getId());
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public final void validateNotDisposed$runtime_release() {
        if (!(!this.disposed)) {
            throw new java.lang.IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            androidx.compose.runtime.snapshots.SnapshotKt.releasePinningLocked(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    /* compiled from: Snapshot.kt */
    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0004H\u0001J\"\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0086\b¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011JO\u0010\u0012\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0007J&\u0010\u0019\u001a\u00020\u001a2\u001e\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u001cJ\u001a\u0010\u001e\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0014J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0001J\u0012\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0001J\u0006\u0010\"\u001a\u00020\u0011J6\u0010#\u001a\u00020$2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014J\u001e\u0010%\u001a\u00020\u00042\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014J\"\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010'2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H'0\u000eH\u0086\b¢\u0006\u0002\u0010\u000fJ4\u0010(\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u0002H\f0\u000e¢\u0006\u0002\b)H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006*"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "()V", "current", "Landroidx/compose/runtime/snapshots/Snapshot;", "getCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "isApplyObserverNotificationPending", "", "()Z", "createNonObservableSnapshot", "global", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "notifyObjectsInitialized", "", "observe", "readObserver", "Lkotlin/Function1;", "writeObserver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "openSnapshotCount", "", "registerApplyObserver", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "observer", "Lkotlin/Function2;", "", "registerGlobalWriteObserver", "removeCurrent", "restoreCurrent", "previous", "sendApplyNotifications", "takeMutableSnapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeSnapshot", "withMutableSnapshot", "R", "withoutReadObservation", "Landroidx/compose/runtime/DisallowComposableCalls;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.snapshots.Snapshot getCurrent() {
            return androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot();
        }

        public final boolean isApplyObserverNotificationPending() {
            androidx.compose.runtime.AtomicInt atomicInt;
            atomicInt = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount;
            return atomicInt.get() > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.runtime.snapshots.Snapshot takeSnapshot$default(androidx.compose.runtime.snapshots.Snapshot.Companion companion, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            return companion.takeSnapshot(function1);
        }

        public final androidx.compose.runtime.snapshots.Snapshot takeSnapshot(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver) {
            return androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().takeNestedSnapshot(readObserver);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.runtime.snapshots.MutableSnapshot takeMutableSnapshot$default(androidx.compose.runtime.snapshots.Snapshot.Companion companion, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            return companion.takeMutableSnapshot(function1, function12);
        }

        public final androidx.compose.runtime.snapshots.MutableSnapshot takeMutableSnapshot(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> writeObserver) {
            androidx.compose.runtime.snapshots.MutableSnapshot takeNestedMutableSnapshot;
            androidx.compose.runtime.snapshots.Snapshot currentSnapshot = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot();
            androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot = currentSnapshot instanceof androidx.compose.runtime.snapshots.MutableSnapshot ? (androidx.compose.runtime.snapshots.MutableSnapshot) currentSnapshot : null;
            if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(readObserver, writeObserver)) == null) {
                throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return takeNestedMutableSnapshot;
        }

        public final <T> T global(kotlin.jvm.functions.Function0<? extends T> block) {
            androidx.compose.runtime.snapshots.Snapshot removeCurrent = removeCurrent();
            T invoke = block.invoke();
            androidx.compose.runtime.snapshots.Snapshot.INSTANCE.restoreCurrent(removeCurrent);
            return invoke;
        }

        public final <R> R withMutableSnapshot(kotlin.jvm.functions.Function0<? extends R> block) {
            androidx.compose.runtime.snapshots.MutableSnapshot takeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot = takeMutableSnapshot$default;
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = mutableSnapshot.makeCurrent();
                try {
                    R invoke = block.invoke();
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    mutableSnapshot.restoreCurrent(makeCurrent);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    takeMutableSnapshot$default.apply().check();
                    return invoke;
                } catch (java.lang.Throwable th) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    mutableSnapshot.restoreCurrent(makeCurrent);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th;
                }
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                takeMutableSnapshot$default.dispose();
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object observe$default(androidx.compose.runtime.snapshots.Snapshot.Companion companion, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            return companion.observe(function1, function12, function0);
        }

        public final <T> T observe(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> writeObserver, kotlin.jvm.functions.Function0<? extends T> block) {
            androidx.compose.runtime.SnapshotThreadLocal snapshotThreadLocal;
            androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot transparentObserverMutableSnapshot;
            if (readObserver != null || writeObserver != null) {
                snapshotThreadLocal = androidx.compose.runtime.snapshots.SnapshotKt.threadSnapshot;
                androidx.compose.runtime.snapshots.Snapshot snapshot = (androidx.compose.runtime.snapshots.Snapshot) snapshotThreadLocal.get();
                if (snapshot == null || (snapshot instanceof androidx.compose.runtime.snapshots.MutableSnapshot)) {
                    transparentObserverMutableSnapshot = new androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot(snapshot instanceof androidx.compose.runtime.snapshots.MutableSnapshot ? (androidx.compose.runtime.snapshots.MutableSnapshot) snapshot : null, readObserver, writeObserver, true, false);
                } else {
                    if (readObserver == null) {
                        return block.invoke();
                    }
                    transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(readObserver);
                }
                try {
                    androidx.compose.runtime.snapshots.Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                    try {
                        return block.invoke();
                    } finally {
                        transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    }
                } finally {
                    transparentObserverMutableSnapshot.dispose();
                }
            }
            return block.invoke();
        }

        public final androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot() {
            androidx.compose.runtime.SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = androidx.compose.runtime.snapshots.SnapshotKt.threadSnapshot;
            return androidx.compose.runtime.snapshots.SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((androidx.compose.runtime.snapshots.Snapshot) snapshotThreadLocal.get(), null, false, 6, null);
        }

        public final <T> T withoutReadObservation(kotlin.jvm.functions.Function0<? extends T> block) {
            androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = createNonObservableSnapshot();
            try {
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    return block.invoke();
                } finally {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                }
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                createNonObservableSnapshot.dispose();
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            }
        }

        public final androidx.compose.runtime.snapshots.ObserverHandle registerApplyObserver(final kotlin.jvm.functions.Function2<? super java.util.Set<? extends java.lang.Object>, ? super androidx.compose.runtime.snapshots.Snapshot, kotlin.Unit> observer) {
            kotlin.jvm.functions.Function1 function1;
            java.util.List list;
            function1 = androidx.compose.runtime.snapshots.SnapshotKt.emptyLambda;
            androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot(function1);
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                list = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers;
                androidx.compose.runtime.snapshots.SnapshotKt.applyObservers = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.jvm.functions.Function2<? super java.util.Set<? extends java.lang.Object>, ? super androidx.compose.runtime.snapshots.Snapshot, kotlin.Unit>>) list, observer);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return new androidx.compose.runtime.snapshots.ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    androidx.compose.runtime.snapshots.Snapshot.Companion.registerApplyObserver$lambda$6(kotlin.jvm.functions.Function2.this);
                }
            };
        }

        public final void notifyObjectsInitialized() {
            androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final int openSnapshotCount() {
            androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet;
            snapshotIdSet = androidx.compose.runtime.snapshots.SnapshotKt.openSnapshots;
            return kotlin.collections.CollectionsKt.toList(snapshotIdSet).size();
        }

        public final androidx.compose.runtime.snapshots.Snapshot removeCurrent() {
            androidx.compose.runtime.SnapshotThreadLocal snapshotThreadLocal;
            androidx.compose.runtime.SnapshotThreadLocal snapshotThreadLocal2;
            snapshotThreadLocal = androidx.compose.runtime.snapshots.SnapshotKt.threadSnapshot;
            androidx.compose.runtime.snapshots.Snapshot snapshot = (androidx.compose.runtime.snapshots.Snapshot) snapshotThreadLocal.get();
            if (snapshot != null) {
                snapshotThreadLocal2 = androidx.compose.runtime.snapshots.SnapshotKt.threadSnapshot;
                snapshotThreadLocal2.set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(androidx.compose.runtime.snapshots.Snapshot previous) {
            androidx.compose.runtime.SnapshotThreadLocal snapshotThreadLocal;
            if (previous != null) {
                snapshotThreadLocal = androidx.compose.runtime.snapshots.SnapshotKt.threadSnapshot;
                snapshotThreadLocal.set(previous);
            }
        }

        public final androidx.compose.runtime.snapshots.ObserverHandle registerGlobalWriteObserver(final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> observer) {
            java.util.List list;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                list = androidx.compose.runtime.snapshots.SnapshotKt.globalWriteObservers;
                androidx.compose.runtime.snapshots.SnapshotKt.globalWriteObservers = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>>) list, observer);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot();
            return new androidx.compose.runtime.snapshots.ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda1
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    androidx.compose.runtime.snapshots.Snapshot.Companion.registerGlobalWriteObserver$lambda$9(kotlin.jvm.functions.Function1.this);
                }
            };
        }

        public final void sendApplyNotifications() {
            java.util.concurrent.atomic.AtomicReference atomicReference;
            boolean z;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                atomicReference = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot;
                androidx.compose.runtime.collection.IdentityArraySet<androidx.compose.runtime.snapshots.StateObject> modified$runtime_release = ((androidx.compose.runtime.snapshots.GlobalSnapshot) atomicReference.get()).getModified$runtime_release();
                z = false;
                if (modified$runtime_release != null) {
                    if (modified$runtime_release.isNotEmpty()) {
                        z = true;
                    }
                }
            }
            if (z) {
                androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$6(kotlin.jvm.functions.Function2 function2) {
            java.util.List list;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                list = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers;
                androidx.compose.runtime.snapshots.SnapshotKt.applyObservers = kotlin.collections.CollectionsKt.minus(list, function2);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$9(kotlin.jvm.functions.Function1 function1) {
            java.util.List list;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                list = androidx.compose.runtime.snapshots.SnapshotKt.globalWriteObservers;
                androidx.compose.runtime.snapshots.SnapshotKt.globalWriteObservers = kotlin.collections.CollectionsKt.minus(list, function1);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot();
        }
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}

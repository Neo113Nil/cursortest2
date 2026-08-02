package androidx.room;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0018\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/room/ObservedTableStates;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "Lkotlin/Function1;", "", "Landroidx/room/ObservedTableStates$ObserveOp;", "", "action", "onSync$room_runtime", "(Lkotlin/jvm/functions/Function1;)V", "", "tableIds", "", "onObserverAdded$room_runtime", "([I)Z", "onObserverRemoved$room_runtime", "resetTriggerState$room_runtime", "()V", "forceNeedSync$room_runtime", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/getHighSpeedVideoFpsRanges;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/locks/ReentrantLock;", "", "getInputSizeshNQ4ISI", "[J", "getHighSpeedVideoFpsRanges", "", "[Z", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "ObserveOp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObservedTableStates {
    private volatile boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile boolean getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long[] getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoSizes = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoFpsRangesFor = new java.util.concurrent.locks.ReentrantLock();

    public ObservedTableStates(int i) {
        this.getHighSpeedVideoFpsRanges = new long[i];
        this.Camera2StreamConfigurationMap = new boolean[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final void onSync$room_runtime(kotlin.jvm.functions.Function1<? super androidx.room.ObservedTableStates.ObserveOp[], kotlin.Unit> action) {
        java.lang.Object[] objArr;
        androidx.room.ObservedTableStates.ObserveOp observeOp;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoFpsRangesFor;
        reentrantLock.lock();
        try {
            this.getOutputFormats = true;
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.getHighSpeedVideoSizes;
            reentrantLock2.lock();
            try {
                ?? r6 = 0;
                r6 = 0;
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighResolutionOutputSizeshNQ4ISI = false;
                    int length = this.getHighSpeedVideoFpsRanges.length;
                    androidx.room.ObservedTableStates.ObserveOp[] observeOpArr = new androidx.room.ObservedTableStates.ObserveOp[length];
                    int i = 0;
                    java.lang.Object[] objArr2 = false;
                    while (i < length) {
                        boolean z = this.getHighSpeedVideoFpsRanges[i] > 0;
                        if (z != this.Camera2StreamConfigurationMap[i]) {
                            this.Camera2StreamConfigurationMap[i] = z;
                            observeOp = z ? androidx.room.ObservedTableStates.ObserveOp.ADD : androidx.room.ObservedTableStates.ObserveOp.REMOVE;
                            objArr = true;
                        } else {
                            objArr = objArr2;
                            observeOp = androidx.room.ObservedTableStates.ObserveOp.NO_OP;
                        }
                        observeOpArr[i] = observeOp;
                        i++;
                        objArr2 = objArr;
                    }
                    if (objArr2 != false) {
                        r6 = observeOpArr;
                    }
                }
                if (r6 != 0) {
                    try {
                        if (r6.length != 0) {
                            action.invoke(r6);
                        }
                    } catch (java.lang.Throwable th) {
                        this.getOutputFormats = false;
                        throw th;
                    }
                }
                this.getOutputFormats = false;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                reentrantLock2.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r12.getOutputFormats != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onObserverAdded$room_runtime(int[] tableIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableIds, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoSizes;
        reentrantLock.lock();
        try {
            boolean z = false;
            boolean z2 = false;
            for (int i : tableIds) {
                long[] jArr = this.getHighSpeedVideoFpsRanges;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    z2 = true;
                }
            }
            if (!z2 && !this.getHighResolutionOutputSizeshNQ4ISI) {
            }
            z = true;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r14.getOutputFormats != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onObserverRemoved$room_runtime(int[] tableIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableIds, "");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoSizes;
        reentrantLock.lock();
        try {
            boolean z = false;
            boolean z2 = false;
            for (int i : tableIds) {
                long[] jArr = this.getHighSpeedVideoFpsRanges;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    z2 = true;
                }
            }
            if (!z2 && !this.getHighResolutionOutputSizeshNQ4ISI) {
            }
            z = true;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void resetTriggerState$room_runtime() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoSizes;
        reentrantLock.lock();
        try {
            kotlin.collections.ArraysKt.fill$default(this.Camera2StreamConfigurationMap, false, 0, 0, 6, (java.lang.Object) null);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void forceNeedSync$room_runtime() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighSpeedVideoSizes;
        reentrantLock.lock();
        try {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/room/ObservedTableStates$ObserveOp;", "", "<init>", "(Ljava/lang/String;I)V", "NO_OP", "ADD", "REMOVE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ObserveOp {
        public static final androidx.room.ObservedTableStates.ObserveOp ADD;
        private static final /* synthetic */ androidx.room.ObservedTableStates.ObserveOp[] Camera2StreamConfigurationMap;
        public static final androidx.room.ObservedTableStates.ObserveOp NO_OP;
        public static final androidx.room.ObservedTableStates.ObserveOp REMOVE;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private ObserveOp(java.lang.String str, int i) {
        }

        static {
            androidx.room.ObservedTableStates.ObserveOp observeOp = new androidx.room.ObservedTableStates.ObserveOp("NO_OP", 0);
            NO_OP = observeOp;
            androidx.room.ObservedTableStates.ObserveOp observeOp2 = new androidx.room.ObservedTableStates.ObserveOp("ADD", 1);
            ADD = observeOp2;
            androidx.room.ObservedTableStates.ObserveOp observeOp3 = new androidx.room.ObservedTableStates.ObserveOp("REMOVE", 2);
            REMOVE = observeOp3;
            androidx.room.ObservedTableStates.ObserveOp[] observeOpArr = {observeOp, observeOp2, observeOp3};
            Camera2StreamConfigurationMap = observeOpArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(observeOpArr);
        }

        public static androidx.room.ObservedTableStates.ObserveOp[] values() {
            return (androidx.room.ObservedTableStates.ObserveOp[]) Camera2StreamConfigurationMap.clone();
        }

        public static androidx.room.ObservedTableStates.ObserveOp valueOf(java.lang.String str) {
            return (androidx.room.ObservedTableStates.ObserveOp) java.lang.Enum.valueOf(androidx.room.ObservedTableStates.ObserveOp.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.room.ObservedTableStates.ObserveOp> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }
}

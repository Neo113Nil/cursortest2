package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", i = {0, 1, 1}, l = {307, 314}, m = "invokeSuspend", n = {"connection", "this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class TriggerBasedInvalidationTracker$syncTriggers$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:
    
        if (r14 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0047, code lost:
    
        if (r6 != r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.room.Transactor transactor;
        java.lang.Object inTransaction;
        androidx.room.ObservedTableStates observedTableStates;
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        java.util.concurrent.locks.ReentrantLock reentrantLock2;
        androidx.room.ObservedTableStates.ObserveOp[] observeOpArr;
        androidx.room.ObservedTableStates.ObserveOp observeOp;
        androidx.room.ObservedTableStates observedTableStates2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            transactor = (androidx.room.Transactor) this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = transactor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            inTransaction = transactor.inTransaction(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                reentrantLock2 = (java.util.concurrent.locks.ReentrantLock) this.getHighSpeedVideoFpsRanges;
                observedTableStates2 = (androidx.room.ObservedTableStates) this.getHighSpeedVideoSizes;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    reentrantLock = reentrantLock2;
                    observedTableStates = observedTableStates2;
                    observedTableStates.getOutputFormats = false;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    reentrantLock.unlock();
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    th = th;
                    try {
                        observedTableStates2.getOutputFormats = false;
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
            }
            transactor = (androidx.room.Transactor) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            inTransaction = obj;
        }
        if (!((java.lang.Boolean) inTransaction).booleanValue()) {
            observedTableStates = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
            androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.getHighSpeedVideoFpsRangesFor;
            reentrantLock = observedTableStates.getHighSpeedVideoFpsRangesFor;
            reentrantLock.lock();
            try {
                observedTableStates.getOutputFormats = true;
                java.util.concurrent.locks.ReentrantLock reentrantLock3 = observedTableStates.getHighSpeedVideoSizes;
                reentrantLock3.lock();
                try {
                    if (observedTableStates.getHighResolutionOutputSizeshNQ4ISI) {
                        observedTableStates.getHighResolutionOutputSizeshNQ4ISI = false;
                        int length = observedTableStates.getHighSpeedVideoFpsRanges.length;
                        observeOpArr = new androidx.room.ObservedTableStates.ObserveOp[length];
                        int i2 = 0;
                        boolean z2 = false;
                        while (i2 < length) {
                            boolean z3 = observedTableStates.getHighSpeedVideoFpsRanges[i2] > 0 ? z : false;
                            if (z3 != observedTableStates.Camera2StreamConfigurationMap[i2]) {
                                observedTableStates.Camera2StreamConfigurationMap[i2] = z3;
                                observeOp = z3 ? androidx.room.ObservedTableStates.ObserveOp.ADD : androidx.room.ObservedTableStates.ObserveOp.REMOVE;
                                z2 = true;
                            } else {
                                observeOp = androidx.room.ObservedTableStates.ObserveOp.NO_OP;
                            }
                            observeOpArr[i2] = observeOp;
                            i2++;
                            z = true;
                        }
                    }
                    observeOpArr = null;
                    if (observeOpArr != null) {
                        try {
                            if (observeOpArr.length != 0) {
                                androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE;
                                androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 triggerBasedInvalidationTracker$syncTriggers$2$1$1$1 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(observeOpArr, triggerBasedInvalidationTracker, transactor, null);
                                this.getHighSpeedVideoSizes = observedTableStates;
                                this.getHighSpeedVideoFpsRanges = reentrantLock;
                                this.getHighResolutionOutputSizeshNQ4ISI = 2;
                                if (transactor.withTransaction(sQLiteTransactionType, triggerBasedInvalidationTracker$syncTriggers$2$1$1$1, this) != coroutine_suspended) {
                                    observedTableStates2 = observedTableStates;
                                    reentrantLock2 = reentrantLock;
                                    reentrantLock = reentrantLock2;
                                    observedTableStates = observedTableStates2;
                                }
                                return coroutine_suspended;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            observedTableStates2 = observedTableStates;
                            reentrantLock2 = reentrantLock;
                            observedTableStates2.getOutputFormats = false;
                            throw th;
                        }
                    }
                    observedTableStates.getOutputFormats = false;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    reentrantLock.unlock();
                    return kotlin.Unit.INSTANCE;
                } finally {
                    reentrantLock3.unlock();
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                reentrantLock2 = reentrantLock;
                reentrantLock2.unlock();
                throw th;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.room.Transactor transactor, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1) create(transactor, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        triggerBasedInvalidationTracker$syncTriggers$2$1.getHighSpeedVideoSizes = obj;
        return triggerBasedInvalidationTracker$syncTriggers$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$syncTriggers$2$1(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = triggerBasedInvalidationTracker;
    }
}

package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", i = {0}, l = {418, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "invokeSuspend", n = {"connection"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super java.util.Set<? extends java.lang.Integer>>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r7 != r0) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.room.Transactor transactor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                transactor = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = transactor;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = transactor.inTransaction(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return (java.util.Set) obj;
                }
                transactor = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                return kotlin.collections.SetsKt.emptySet();
            }
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = 2;
            obj = transactor.withTransaction(androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE, new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.AnonymousClass1(this.getHighSpeedVideoSizes, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (java.util.Set) obj;
        } catch (android.database.SQLException unused) {
            return kotlin.collections.SetsKt.emptySet();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", i = {}, l = {426}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<java.util.Set<? extends java.lang.Integer>>, kotlin.coroutines.Continuation<? super java.util.Set<? extends java.lang.Integer>>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker getHighResolutionOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.room.TransactionScope transactionScope = (androidx.room.TransactionScope) this.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object access$checkInvalidatedTables = androidx.room.TriggerBasedInvalidationTracker.access$checkInvalidatedTables(this.getHighResolutionOutputSizeshNQ4ISI, transactionScope, this);
            return access$checkInvalidatedTables == coroutine_suspended ? coroutine_suspended : access$checkInvalidatedTables;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(androidx.room.TransactionScope<java.util.Set<? extends java.lang.Integer>> transactionScope, kotlin.coroutines.Continuation<? super java.util.Set<? extends java.lang.Integer>> continuation) {
            return ((androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.AnonymousClass1) create(transactionScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.AnonymousClass1 anonymousClass1 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = triggerBasedInvalidationTracker;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.room.Transactor transactor, kotlin.coroutines.Continuation<? super java.util.Set<? extends java.lang.Integer>> continuation) {
        return ((androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1) create(transactor, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(this.getHighSpeedVideoSizes, continuation);
        triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1.Camera2StreamConfigurationMap = obj;
        return triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = triggerBasedInvalidationTracker;
    }
}

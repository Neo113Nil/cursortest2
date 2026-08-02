package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", i = {0, 0, 1, 1}, l = {318, 319}, m = "invokeSuspend", n = {"$this$forEachIndexed$iv", "index$iv", "$this$forEachIndexed$iv", "index$iv"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.room.Transactor Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.room.ObservedTableStates.ObserveOp[] getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (androidx.room.TriggerBasedInvalidationTracker.access$stopTrackingTable(r7, r12, r6, r11) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (androidx.room.TriggerBasedInvalidationTracker.access$startTrackingTable(r7, r12, r6, r11) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008a -> B:9:0x008b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        androidx.room.ObservedTableStates.ObserveOp[] observeOpArr;
        androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker;
        androidx.room.Transactor transactor;
        int i2;
        int i3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.getHighSpeedVideoSizesFor;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.room.ObservedTableStates.ObserveOp[] observeOpArr2 = this.getHighSpeedVideoFpsRanges;
            androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker2 = this.getInputFormats;
            androidx.room.Transactor transactor2 = this.Camera2StreamConfigurationMap;
            int length = observeOpArr2.length;
            i = 0;
            observeOpArr = observeOpArr2;
            triggerBasedInvalidationTracker = triggerBasedInvalidationTracker2;
            transactor = transactor2;
            i2 = length;
            i3 = 0;
            if (i3 >= i2) {
            }
        } else {
            if (i4 != 1 && i4 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.getHighSpeedVideoSizes;
            i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i5 = this.getHighSpeedVideoFpsRangesFor;
            androidx.room.Transactor transactor3 = (androidx.room.Transactor) this.getOutputFormats;
            triggerBasedInvalidationTracker = (androidx.room.TriggerBasedInvalidationTracker) this.getInputSizeshNQ4ISI;
            observeOpArr = (androidx.room.ObservedTableStates.ObserveOp[]) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            transactor = transactor3;
            i = i5;
            i3++;
            if (i3 >= i2) {
                int i6 = i + 1;
                int i7 = androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1.WhenMappings.$EnumSwitchMapping$0[observeOpArr[i3].ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        this.getOutputMinFrameDuration = observeOpArr;
                        this.getInputSizeshNQ4ISI = triggerBasedInvalidationTracker;
                        this.getOutputFormats = transactor;
                        this.getHighSpeedVideoFpsRangesFor = i6;
                        this.getHighResolutionOutputSizeshNQ4ISI = i3;
                        this.getHighSpeedVideoSizes = i2;
                        this.getHighSpeedVideoSizesFor = 1;
                    } else {
                        if (i7 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        this.getOutputMinFrameDuration = observeOpArr;
                        this.getInputSizeshNQ4ISI = triggerBasedInvalidationTracker;
                        this.getOutputFormats = transactor;
                        this.getHighSpeedVideoFpsRangesFor = i6;
                        this.getHighResolutionOutputSizeshNQ4ISI = i3;
                        this.getHighSpeedVideoSizes = i2;
                        this.getHighSpeedVideoSizesFor = 2;
                    }
                    i3++;
                    if (i3 >= i2) {
                        return kotlin.Unit.INSTANCE;
                    }
                }
                i = i6;
                i3++;
                if (i3 >= i2) {
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.room.TransactionScope<kotlin.Unit> transactionScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1) create(transactionScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.room.ObservedTableStates.ObserveOp.values().length];
            try {
                iArr[androidx.room.ObservedTableStates.ObserveOp.NO_OP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.room.ObservedTableStates.ObserveOp.ADD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.room.ObservedTableStates.ObserveOp.REMOVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(androidx.room.ObservedTableStates.ObserveOp[] observeOpArr, androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, androidx.room.Transactor transactor, kotlin.coroutines.Continuation<? super androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = observeOpArr;
        this.getInputFormats = triggerBasedInvalidationTracker;
        this.Camera2StreamConfigurationMap = transactor;
    }
}

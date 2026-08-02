package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/Job;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {1003, 1005}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class JobSupport$children$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super kotlinx.coroutines.Job>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.JobSupport getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        if (r4.yield(r7, r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r7.yield(((kotlinx.coroutines.ChildHandleNode) r1).getHighSpeedVideoSizes, r6) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0070 -> B:6:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0083 -> B:6:0x0086). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.NodeList camera2StreamConfigurationMap;
        kotlin.sequences.SequenceScope sequenceScope;
        kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object state$kotlinx_coroutines_core = this.getHighSpeedVideoSizes.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.ChildHandleNode) {
                this.Camera2StreamConfigurationMap = 1;
            } else if ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) && (camera2StreamConfigurationMap = ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getCamera2StreamConfigurationMap()) != null) {
                kotlinx.coroutines.NodeList nodeList = camera2StreamConfigurationMap;
                java.lang.Object next = nodeList.getNext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
                sequenceScope = sequenceScope2;
                lockFreeLinkedListHead = nodeList;
                lockFreeLinkedListNode = lockFreeLinkedListNode2;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead)) {
                }
            }
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) this.getHighResolutionOutputSizeshNQ4ISI;
            lockFreeLinkedListHead = (kotlinx.coroutines.internal.LockFreeLinkedListHead) this.getHighSpeedVideoFpsRanges;
            sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead)) {
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.ChildHandleNode) {
                    kotlinx.coroutines.ChildJob childJob = ((kotlinx.coroutines.ChildHandleNode) lockFreeLinkedListNode).getHighSpeedVideoSizes;
                    this.getHighSpeedVideoFpsRangesFor = sequenceScope;
                    this.getHighSpeedVideoFpsRanges = lockFreeLinkedListHead;
                    this.getHighResolutionOutputSizeshNQ4ISI = lockFreeLinkedListNode;
                    this.Camera2StreamConfigurationMap = 2;
                }
                lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead)) {
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super kotlinx.coroutines.Job> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.JobSupport$children$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.JobSupport$children$1 jobSupport$children$1 = new kotlinx.coroutines.JobSupport$children$1(this.getHighSpeedVideoSizes, continuation);
        jobSupport$children$1.getHighSpeedVideoFpsRangesFor = obj;
        return jobSupport$children$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JobSupport$children$1(kotlinx.coroutines.JobSupport jobSupport, kotlin.coroutines.Continuation<? super kotlinx.coroutines.JobSupport$children$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = jobSupport;
    }
}

package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {64}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class GlobalSnapshotManager$ensureStarted$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x0013, B:7:0x0039, B:9:0x0041, B:10:0x002c, B:14:0x0055, B:21:0x0027), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x0013, B:7:0x0039, B:9:0x0041, B:10:0x002c, B:14:0x0055, B:21:0x0027), top: B:2:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:7:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel<kotlin.Unit> channel;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                channel = this.getHighSpeedVideoFpsRangesFor;
                it = channel.iterator();
                this.getHighResolutionOutputSizeshNQ4ISI = channel;
                this.getHighSpeedVideoFpsRanges = it;
                this.getHighSpeedVideoSizes = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRanges;
                channel = (kotlinx.coroutines.channels.ReceiveChannel) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    atomicBoolean = androidx.compose.ui.platform.GlobalSnapshotManager.getHighSpeedVideoFpsRangesFor;
                    atomicBoolean.set(false);
                    androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
                    this.getHighResolutionOutputSizeshNQ4ISI = channel;
                    this.getHighSpeedVideoFpsRanges = it;
                    this.getHighSpeedVideoSizes = 1;
                    obj = it.hasNext(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(channel, null);
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlobalSnapshotManager$ensureStarted$1(kotlinx.coroutines.channels.Channel<kotlin.Unit> channel, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = channel;
    }
}

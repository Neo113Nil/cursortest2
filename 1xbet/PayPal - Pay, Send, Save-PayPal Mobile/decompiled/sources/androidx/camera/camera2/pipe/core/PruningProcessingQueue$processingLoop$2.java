package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2", f = "PruningProcessingQueue.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, m = "invokeSuspend", n = {"$this$supervisorScope", "processDeferred"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class PruningProcessingQueue$processingLoop$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.core.PruningProcessingQueue<T> Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[Catch: all -> 0x00c2, CancellationException -> 0x00c9, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00c9, all -> 0x00c2, blocks: (B:6:0x0014, B:12:0x0034, B:14:0x005a, B:15:0x0068), top: B:5:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, kotlinx.coroutines.Deferred] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0072 -> B:7:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        kotlinx.coroutines.channels.Channel channel;
        kotlin.collections.ArrayDeque arrayDeque;
        kotlin.collections.ArrayDeque arrayDeque2;
        ?? async$default;
        kotlin.collections.ArrayDeque arrayDeque3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            coroutineScope2 = coroutineScope;
            if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope2)) {
            }
            th = null;
            androidx.camera.camera2.pipe.core.PruningProcessingQueue.access$closeAndReleaseUnprocessedElements(this.Camera2StreamConfigurationMap, th);
            if (th == null) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRanges;
            coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                arrayDeque = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.Camera2StreamConfigurationMap).getInputFormats;
            } catch (java.util.concurrent.CancellationException unused) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            } catch (java.lang.Throwable th) {
                th = th;
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
            }
            if (!arrayDeque.isEmpty() && objectRef.element == 0) {
                arrayDeque2 = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.Camera2StreamConfigurationMap).getInputFormats;
                java.lang.Object first = arrayDeque2.first();
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$deferred$1(this.Camera2StreamConfigurationMap, first, null), 3, null);
                if (async$default.isCancelled()) {
                    arrayDeque3 = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.Camera2StreamConfigurationMap).getInputFormats;
                    arrayDeque3.removeFirst();
                    objectRef.element = async$default;
                } else {
                    if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE()) {
                        java.util.Objects.toString(first);
                    }
                    th = null;
                    androidx.camera.camera2.pipe.core.PruningProcessingQueue.access$closeAndReleaseUnprocessedElements(this.Camera2StreamConfigurationMap, th);
                    if (th == null) {
                        return null;
                    }
                    throw th;
                }
            }
            coroutineScope2 = coroutineScope;
            if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope2)) {
                androidx.camera.camera2.pipe.core.PruningProcessingQueue<T> pruningProcessingQueue = this.Camera2StreamConfigurationMap;
                kotlinx.coroutines.selects.SelectImplementation selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(getGetHighSpeedVideoSizes());
                kotlinx.coroutines.selects.SelectImplementation selectImplementation2 = selectImplementation;
                channel = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) pruningProcessingQueue).getHighSpeedVideoFpsRangesFor;
                selectImplementation2.invoke((kotlinx.coroutines.selects.SelectClause1) channel.getOnReceive(), (kotlin.jvm.functions.Function2) new androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$1(pruningProcessingQueue, null));
                kotlinx.coroutines.Deferred deferred = (kotlinx.coroutines.Deferred) objectRef.element;
                if (deferred != null) {
                    selectImplementation2.invoke(deferred.getOnAwait(), new androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$2(objectRef, null));
                }
                this.getHighSpeedVideoSizes = coroutineScope2;
                this.getHighSpeedVideoFpsRanges = objectRef;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (selectImplementation.doSelect(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                arrayDeque = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.Camera2StreamConfigurationMap).getInputFormats;
                if (!arrayDeque.isEmpty()) {
                    arrayDeque2 = ((androidx.camera.camera2.pipe.core.PruningProcessingQueue) this.Camera2StreamConfigurationMap).getInputFormats;
                    java.lang.Object first2 = arrayDeque2.first();
                    async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$deferred$1(this.Camera2StreamConfigurationMap, first2, null), 3, null);
                    if (async$default.isCancelled()) {
                    }
                }
                coroutineScope2 = coroutineScope;
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope2)) {
                }
            }
            th = null;
            androidx.camera.camera2.pipe.core.PruningProcessingQueue.access$closeAndReleaseUnprocessedElements(this.Camera2StreamConfigurationMap, th);
            if (th == null) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation continuation) {
        return ((androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2 pruningProcessingQueue$processingLoop$2 = new androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2(this.Camera2StreamConfigurationMap, continuation);
        pruningProcessingQueue$processingLoop$2.getHighSpeedVideoSizes = obj;
        return pruningProcessingQueue$processingLoop$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningProcessingQueue$processingLoop$2(androidx.camera.camera2.pipe.core.PruningProcessingQueue<T> pruningProcessingQueue, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = pruningProcessingQueue;
    }
}

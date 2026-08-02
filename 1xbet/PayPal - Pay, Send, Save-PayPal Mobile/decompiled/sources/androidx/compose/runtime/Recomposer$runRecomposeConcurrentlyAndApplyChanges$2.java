package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {1011, 1031, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.Recomposer getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00c6 -> B:16:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        androidx.compose.runtime.ProduceFrameSignal produceFrameSignal;
        boolean inputSizeshNQ4ISI;
        java.lang.Object highSpeedVideoFpsRangesFor;
        androidx.collection.MutableScatterSet mutableScatterSet;
        androidx.compose.runtime.collection.MutableVector mutableVector;
        androidx.compose.runtime.collection.MutableVector mutableVector2;
        kotlinx.coroutines.CancellableContinuation highSpeedVideoFpsRangesFor2;
        boolean outputFormats;
        kotlin.coroutines.Continuation continuation;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i;
        java.util.List outputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoSizes;
        int i3 = 0;
        int i4 = 1;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
            androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock = (androidx.compose.runtime.MonotonicFrameClock) this.getHighResolutionOutputSizeshNQ4ISI;
            boolean z = this.getHighSpeedVideoFpsRangesFor.get(kotlinx.coroutines.Job.INSTANCE) == null;
            kotlin.coroutines.CoroutineContext coroutineContext = this.getHighSpeedVideoFpsRangesFor;
            if (!z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("recomposeCoroutineContext may not contain a Job; found ");
                sb.append(coroutineContext.get(kotlinx.coroutines.Job.INSTANCE));
                androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException(sb.toString());
            }
            kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineScope2.getCoroutineContext().plus(this.getHighSpeedVideoFpsRangesFor).plus(kotlinx.coroutines.JobKt.Job(kotlinx.coroutines.JobKt.getJob(coroutineScope2.getCoroutineContext()))));
            androidx.compose.runtime.ProduceFrameSignal produceFrameSignal2 = new androidx.compose.runtime.ProduceFrameSignal();
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.getHighSpeedVideoFpsRanges, monotonicFrameClock, produceFrameSignal2, null), 3, null);
            coroutineScope = CoroutineScope;
            produceFrameSignal = produceFrameSignal2;
            inputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI();
            if (inputSizeshNQ4ISI) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                launch$default = (kotlinx.coroutines.Job) this.getOutputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizes = 3;
                if (kotlinx.coroutines.JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            launch$default = (kotlinx.coroutines.Job) this.Camera2StreamConfigurationMap;
            produceFrameSignal = (androidx.compose.runtime.ProduceFrameSignal) this.getHighResolutionOutputSizeshNQ4ISI;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
            androidx.compose.runtime.Recomposer recomposer = this.getHighSpeedVideoFpsRanges;
            synchronized (recomposer.b) {
                mutableScatterSet = recomposer.getARTIFICIAL_FRAME_PACKAGE_NAME;
                if (mutableScatterSet.isNotEmpty()) {
                    recomposer.getARTIFICIAL_FRAME_PACKAGE_NAME = new androidx.collection.MutableScatterSet(i3, i4, null);
                }
            }
            java.util.Set<? extends java.lang.Object> wrapIntoSet = androidx.compose.runtime.collection.ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
            if (!wrapIntoSet.isEmpty()) {
                outputSizeshNQ4ISI = recomposer.getOutputSizeshNQ4ISI();
                int size = outputSizeshNQ4ISI.size();
                for (int i5 = i3; i5 < size; i5++) {
                    ((androidx.compose.runtime.ControlledComposition) outputSizeshNQ4ISI.get(i5)).recordModificationsOf(wrapIntoSet);
                }
            }
            mutableVector = recomposer.getHighSpeedVideoSizesFor;
            java.lang.Object[] objArr = mutableVector.content;
            int size2 = mutableVector.getSize();
            int i6 = i3;
            while (i6 < size2) {
                androidx.compose.runtime.ControlledComposition controlledComposition = (androidx.compose.runtime.ControlledComposition) objArr[i6];
                synchronized (recomposer.b) {
                    i = recomposer.getOutputMinFrameDurationlomOqCM;
                    recomposer.getOutputMinFrameDurationlomOqCM = i + 1;
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, androidx.compose.runtime.CompositionKt.getRecomposeCoroutineContext(controlledComposition), null, new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(recomposer, controlledComposition, null), 2, null);
                i6++;
                size2 = size2;
                objArr = objArr;
                recomposer = recomposer;
            }
            androidx.compose.runtime.Recomposer recomposer2 = recomposer;
            mutableVector2 = recomposer2.getHighSpeedVideoSizesFor;
            mutableVector2.clear();
            synchronized (recomposer2.b) {
                highSpeedVideoFpsRangesFor2 = recomposer2.getHighSpeedVideoFpsRangesFor();
                if (highSpeedVideoFpsRangesFor2 != null) {
                    throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            java.lang.Object obj6 = this.getHighSpeedVideoFpsRanges.b;
            androidx.compose.runtime.Recomposer recomposer3 = this.getHighSpeedVideoFpsRanges;
            synchronized (obj6) {
                outputFormats = recomposer3.getOutputFormats();
                if (outputFormats) {
                    java.lang.Object obj7 = produceFrameSignal.getHighSpeedVideoFpsRangesFor;
                    if (obj7 instanceof kotlin.coroutines.Continuation) {
                        obj5 = androidx.compose.runtime.RecomposerKt.getHighResolutionOutputSizeshNQ4ISI;
                        produceFrameSignal.getHighSpeedVideoFpsRangesFor = obj5;
                        continuation = (kotlin.coroutines.Continuation) obj7;
                    } else {
                        obj2 = androidx.compose.runtime.RecomposerKt.Camera2StreamConfigurationMap;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj7, obj2)) {
                            obj3 = androidx.compose.runtime.RecomposerKt.getHighResolutionOutputSizeshNQ4ISI;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(obj7, obj3)) {
                                if (obj7 != null) {
                                    throw new java.lang.IllegalStateException("invalid pendingFrameContinuation ".concat(java.lang.String.valueOf(obj7)).toString());
                                }
                                obj4 = androidx.compose.runtime.RecomposerKt.Camera2StreamConfigurationMap;
                                produceFrameSignal.getHighSpeedVideoFpsRangesFor = obj4;
                            }
                        }
                    }
                }
                continuation = null;
            }
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            }
            coroutineScope = coroutineScope3;
            i3 = 0;
            i4 = 1;
            inputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI();
            if (inputSizeshNQ4ISI) {
                this.getOutputFormats = launch$default;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoSizes = 2;
                if (kotlinx.coroutines.JobKt.cancelAndJoin(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizes = 3;
                if (kotlinx.coroutines.JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
            this.getOutputFormats = coroutineScope;
            this.getHighResolutionOutputSizeshNQ4ISI = produceFrameSignal;
            this.Camera2StreamConfigurationMap = launch$default;
            this.getHighSpeedVideoSizes = i4;
            highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
            if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinx.coroutines.CoroutineScope coroutineScope32 = coroutineScope;
            androidx.compose.runtime.Recomposer recomposer4 = this.getHighSpeedVideoFpsRanges;
            synchronized (recomposer4.b) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function3
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.getOutputFormats = coroutineScope;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.getHighResolutionOutputSizeshNQ4ISI = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Recomposer recomposer, kotlin.coroutines.Continuation<? super androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = coroutineContext;
        this.getHighSpeedVideoFpsRanges = recomposer;
    }
}

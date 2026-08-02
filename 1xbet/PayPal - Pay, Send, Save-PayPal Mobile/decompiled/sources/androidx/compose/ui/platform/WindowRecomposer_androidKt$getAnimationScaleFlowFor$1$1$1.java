package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {115, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Float>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 Camera2StreamConfigurationMap;
    final /* synthetic */ android.net.Uri getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.ContentResolver getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.Unit> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        if (r4.emit(kotlin.coroutines.jvm.internal.Boxing.boxFloat(android.provider.Settings.Global.getFloat(r8.getHighSpeedVideoFpsRanges.getContentResolver(), "animator_duration_scale", 1.0f)), r8) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:7:0x0016, B:9:0x0048, B:12:0x005a, B:14:0x0062, B:24:0x002b, B:26:0x0042), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0084 -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.channels.ChannelIterator<kotlin.Unit> it;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRangesFor.registerContentObserver(this.getHighResolutionOutputSizeshNQ4ISI, false, this.Camera2StreamConfigurationMap);
                it = this.getHighSpeedVideoSizes.iterator();
                this.getInputSizeshNQ4ISI = flowCollector;
                this.getOutputFormats = it;
                this.getOutputMinFrameDuration = 1;
                hasNext = it.hasNext(this);
                if (hasNext != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (kotlinx.coroutines.channels.ChannelIterator) this.getOutputFormats;
                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector2;
                this.getInputSizeshNQ4ISI = flowCollector;
                this.getOutputFormats = it;
                this.getOutputMinFrameDuration = 1;
                hasNext = it.hasNext(this);
                if (hasNext != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    obj = hasNext;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        this.getHighSpeedVideoFpsRangesFor.unregisterContentObserver(this.Camera2StreamConfigurationMap);
                        return kotlin.Unit.INSTANCE;
                    }
                    it.next();
                    this.getInputSizeshNQ4ISI = flowCollector2;
                    this.getOutputFormats = it;
                    this.getOutputMinFrameDuration = 2;
                }
                return coroutine_suspended;
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getOutputFormats;
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.unregisterContentObserver(this.Camera2StreamConfigurationMap);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Float> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.getInputSizeshNQ4ISI = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(android.content.ContentResolver contentResolver, android.net.Uri uri, androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, kotlinx.coroutines.channels.Channel<kotlin.Unit> channel, android.content.Context context, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = contentResolver;
        this.getHighResolutionOutputSizeshNQ4ISI = uri;
        this.Camera2StreamConfigurationMap = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.getHighSpeedVideoSizes = channel;
        this.getHighSpeedVideoFpsRanges = context;
    }
}

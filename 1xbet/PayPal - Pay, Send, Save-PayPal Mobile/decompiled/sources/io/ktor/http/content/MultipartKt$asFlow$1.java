package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lio/ktor/http/content/PartData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.content.MultipartKt$asFlow$1", f = "Multipart.kt", i = {0, 1}, l = {144, 145}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class MultipartKt$asFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super io.ktor.http.content.PartData>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.http.content.MultiPartData getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        io.ktor.http.content.PartData partData;
        java.lang.Object readPart;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
            this.getHighSpeedVideoFpsRanges = 1;
            readPart = this.getHighSpeedVideoSizes.readPart(this);
            if (readPart != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
            this.getHighSpeedVideoFpsRanges = 1;
            readPart = this.getHighSpeedVideoSizes.readPart(this);
            if (readPart != coroutine_suspended) {
                flowCollector2 = flowCollector;
                obj = readPart;
                partData = (io.ktor.http.content.PartData) obj;
                if (partData != null) {
                    return kotlin.Unit.INSTANCE;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
                this.getHighSpeedVideoFpsRanges = 2;
            }
            return coroutine_suspended;
        }
        flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        partData = (io.ktor.http.content.PartData) obj;
        if (partData != null) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super io.ktor.http.content.PartData> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.content.MultipartKt$asFlow$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.content.MultipartKt$asFlow$1 multipartKt$asFlow$1 = new io.ktor.http.content.MultipartKt$asFlow$1(this.getHighSpeedVideoSizes, continuation);
        multipartKt$asFlow$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return multipartKt$asFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$asFlow$1(io.ktor.http.content.MultiPartData multiPartData, kotlin.coroutines.Continuation<? super io.ktor.http.content.MultipartKt$asFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = multiPartData;
    }
}

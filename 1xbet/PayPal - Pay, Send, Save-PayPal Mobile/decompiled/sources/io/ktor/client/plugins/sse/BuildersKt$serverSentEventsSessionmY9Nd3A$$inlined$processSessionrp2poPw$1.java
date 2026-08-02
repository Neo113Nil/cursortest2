package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "io/ktor/client/plugins/sse/BuildersKt$processSession$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 1, 1}, l = {1121, 1124, 1136, 1136}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
/* renamed from: io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession-mY9Nd3A$$inlined$processSession-rp2poPw$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.statement.HttpStatement getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|(1:(1:(1:(1:(2:8|9)(3:11|12|13))(4:14|15|16|17))(4:18|19|20|(2:22|23)(2:26|27)))(2:35|36))(5:49|50|51|(1:53)|25)|37|38|39|40|41|42|(2:44|(0)(0))|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (r5.cleanup(r1, r12) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007a, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[Catch: all -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003f, blocks: (B:20:0x003b, B:22:0x0094, B:26:0x00ad, B:27:0x00b4), top: B:19:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #5 {all -> 0x003f, blocks: (B:20:0x003b, B:22:0x0094, B:26:0x00ad, B:27:0x00b4), top: B:19:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable highSpeedVideoFpsRangesFor;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        io.ktor.client.statement.HttpStatement httpStatement;
        io.ktor.client.statement.HttpResponse httpResponse;
        io.ktor.client.statement.HttpResponse httpResponse2;
        kotlinx.coroutines.CompletableDeferred completableDeferred2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        try {
            try {
                try {
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.CompletableDeferred completableDeferred3 = this.getHighSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = io.ktor.client.plugins.sse.BuildersKt.getHighSpeedVideoFpsRangesFor(null, th);
                    completableDeferred3.completeExceptionally(highSpeedVideoFpsRangesFor);
                }
            } catch (java.util.concurrent.CancellationException e) {
                this.getHighSpeedVideoFpsRangesFor.cancel(e);
            }
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.statement.HttpStatement httpStatement2 = this.getHighResolutionOutputSizeshNQ4ISI;
                completableDeferred = this.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = httpStatement2;
                this.getHighSpeedVideoSizes = completableDeferred;
                this.getInputFormats = 1;
                java.lang.Object fetchStreamingResponse = httpStatement2.fetchStreamingResponse(this);
                if (fetchStreamingResponse != coroutine_suspended) {
                    httpStatement = httpStatement2;
                    obj = fetchStreamingResponse;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.getHighSpeedVideoSizes;
                httpStatement = (io.ktor.client.statement.HttpStatement) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th2 = (java.lang.Throwable) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw th2;
                }
                httpResponse2 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRanges;
                completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) this.getHighSpeedVideoSizes;
                httpStatement = (io.ktor.client.statement.HttpStatement) this.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (obj != null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization");
                    }
                    io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 buildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 = this;
                    completableDeferred2.complete((io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) obj);
                    this.Camera2StreamConfigurationMap = kotlin.Unit.INSTANCE;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getInputFormats = 3;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    httpResponse = httpResponse2;
                    this.Camera2StreamConfigurationMap = th;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getInputFormats = 4;
                    if (httpStatement.cleanup(httpResponse, this) != coroutine_suspended) {
                    }
                }
            }
            httpResponse = (io.ktor.client.statement.HttpResponse) obj;
            io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization.class);
            kotlin.reflect.KType kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization.class);
            io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
            this.Camera2StreamConfigurationMap = httpStatement;
            this.getHighSpeedVideoSizes = completableDeferred;
            this.getHighSpeedVideoFpsRanges = httpResponse;
            this.getInputFormats = 2;
            java.lang.Object bodyNullable = call.bodyNullable(typeInfo, this);
            if (bodyNullable != coroutine_suspended) {
                kotlinx.coroutines.CompletableDeferred completableDeferred4 = completableDeferred;
                httpResponse2 = httpResponse;
                obj = bodyNullable;
                completableDeferred2 = completableDeferred4;
                if (obj != null) {
                }
            }
            return coroutine_suspended;
        } catch (java.util.concurrent.CancellationException e2) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(io.ktor.client.statement.HttpStatement httpStatement, kotlinx.coroutines.CompletableDeferred completableDeferred, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = httpStatement;
        this.getHighSpeedVideoFpsRangesFor = completableDeferred;
    }
}

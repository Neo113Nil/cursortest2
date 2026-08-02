package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 1, 1}, l = {1121, 1124, 1136, 1136}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
/* loaded from: classes3.dex */
public final class BuildersKt$processSession$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<T> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.statement.HttpStatement getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getOutputFormats;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:2)|(1:(1:(1:(1:(2:8|9)(3:11|12|13))(4:14|15|16|17))(8:18|19|20|21|22|(2:24|25)|16|17))(2:34|35))(5:49|50|51|(1:53)|25)|36|37|38|39|40|41|42|(6:44|21|22|(0)|16|17)|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable highSpeedVideoFpsRangesFor;
        io.ktor.client.statement.HttpStatement httpStatement;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        io.ktor.client.statement.HttpResponse httpResponse;
        io.ktor.client.statement.HttpResponse httpResponse2;
        kotlinx.coroutines.CompletableDeferred completableDeferred2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        try {
            try {
                try {
                } catch (java.util.concurrent.CancellationException e) {
                    throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
                }
            } catch (java.util.concurrent.CancellationException e2) {
                this.Camera2StreamConfigurationMap.cancel(e2);
            }
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CompletableDeferred<T> completableDeferred3 = this.Camera2StreamConfigurationMap;
            highSpeedVideoFpsRangesFor = io.ktor.client.plugins.sse.BuildersKt.getHighSpeedVideoFpsRangesFor(null, th);
            completableDeferred3.completeExceptionally(highSpeedVideoFpsRangesFor);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            httpStatement = this.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.CompletableDeferred completableDeferred4 = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = httpStatement;
            this.getHighSpeedVideoSizes = completableDeferred4;
            this.getOutputFormats = 1;
            java.lang.Object fetchStreamingResponse = httpStatement.fetchStreamingResponse(this);
            if (fetchStreamingResponse != coroutine_suspended) {
                completableDeferred = completableDeferred4;
                obj = fetchStreamingResponse;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Throwable th2 = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th2;
            }
            httpResponse2 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRanges;
            completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) this.getHighSpeedVideoSizes;
            httpStatement = (io.ktor.client.statement.HttpStatement) this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                java.lang.Object obj2 = obj;
                io.ktor.client.plugins.sse.BuildersKt$processSession$2 buildersKt$processSession$2 = this;
                completableDeferred2.complete(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.Unit.INSTANCE;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.getOutputFormats = 3;
            } catch (java.lang.Throwable th3) {
                io.ktor.client.statement.HttpResponse httpResponse3 = httpResponse2;
                th = th3;
                httpResponse = httpResponse3;
                this.getHighResolutionOutputSizeshNQ4ISI = th;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.getOutputFormats = 4;
                if (httpStatement.cleanup(httpResponse, this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th;
            }
            if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.getHighSpeedVideoSizes;
        httpStatement = (io.ktor.client.statement.HttpStatement) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        httpResponse = (io.ktor.client.statement.HttpResponse) obj;
        io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null);
        this.getHighResolutionOutputSizeshNQ4ISI = httpStatement;
        this.getHighSpeedVideoSizes = completableDeferred;
        this.getHighSpeedVideoFpsRanges = httpResponse;
        this.getOutputFormats = 2;
        java.lang.Object bodyNullable = call.bodyNullable(typeInfo, this);
        if (bodyNullable != coroutine_suspended) {
            kotlinx.coroutines.CompletableDeferred completableDeferred5 = completableDeferred;
            httpResponse2 = httpResponse;
            obj = bodyNullable;
            completableDeferred2 = completableDeferred5;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
            java.lang.Object obj22 = obj;
            io.ktor.client.plugins.sse.BuildersKt$processSession$2 buildersKt$processSession$22 = this;
            completableDeferred2.complete(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.Unit.INSTANCE;
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getOutputFormats = 3;
            if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
            }
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.sse.BuildersKt$processSession$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.sse.BuildersKt$processSession$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$processSession$2(io.ktor.client.statement.HttpStatement httpStatement, kotlinx.coroutines.CompletableDeferred<T> completableDeferred, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.BuildersKt$processSession$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = httpStatement;
        this.Camera2StreamConfigurationMap = completableDeferred;
    }
}

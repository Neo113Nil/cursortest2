package io.ktor.client.plugins.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", f = "builders.kt", i = {0, 1, 1, 2, 2}, l = {269, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 56, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class BuildersKt$webSocketSession$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.client.statement.HttpStatement getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|(1:(1:(1:(1:(1:(2:9|10)(3:12|13|14))(4:15|16|17|18))(5:19|20|21|22|23))(4:33|34|35|(3:37|(3:39|22|23)|25)(2:40|41)))(2:45|46))(5:59|60|61|(1:63)|25)|47|48|49|50|51|52|(2:54|(0)(0))|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if (r4.cleanup(r1, r14) != r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008d, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:35:0x004e, B:37:0x00a7, B:40:0x00df, B:41:0x00e6), top: B:34:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:35:0x004e, B:37:0x00a7, B:40:0x00df, B:41:0x00e6), top: B:34:0x004e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> completableDeferred;
        io.ktor.client.statement.HttpStatement httpStatement;
        io.ktor.client.statement.HttpResponse httpResponse;
        io.ktor.client.statement.HttpResponse httpResponse2;
        kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> completableDeferred2;
        io.ktor.client.statement.HttpStatement httpStatement2;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            try {
            } catch (java.util.concurrent.CancellationException e) {
                throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
            }
        } catch (java.lang.Throwable th2) {
            this.getHighSpeedVideoSizes.completeExceptionally(th2);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.statement.HttpStatement httpStatement3 = this.getHighSpeedVideoFpsRanges;
            completableDeferred = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = httpStatement3;
            this.getHighResolutionOutputSizeshNQ4ISI = completableDeferred;
            this.getHighSpeedVideoSizesFor = 1;
            java.lang.Object fetchStreamingResponse = httpStatement3.fetchStreamingResponse(this);
            if (fetchStreamingResponse != coroutine_suspended) {
                httpStatement = httpStatement3;
                obj = fetchStreamingResponse;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.getHighResolutionOutputSizeshNQ4ISI;
            httpStatement = (io.ktor.client.statement.HttpStatement) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i == 2) {
                httpResponse2 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRangesFor;
                completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) this.getHighResolutionOutputSizeshNQ4ISI;
                httpStatement = (io.ktor.client.statement.HttpStatement) this.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    httpResponse = httpResponse2;
                    httpStatement2 = httpStatement;
                    java.lang.Throwable th4 = th;
                    httpResponse2 = httpResponse;
                    th = th4;
                    this.Camera2StreamConfigurationMap = th;
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getHighSpeedVideoSizesFor = 5;
                    if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    throw th;
                }
                if (obj != null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                }
                io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) obj;
                io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2 buildersKt$webSocketSession$2 = this;
                final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                completableDeferred2.complete(defaultClientWebSocketSession);
                defaultClientWebSocketSession.getOutgoing().invokeOnClose(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th5) {
                        java.lang.Throwable th6 = th5;
                        if (th6 != null) {
                            CompletableDeferred$default.completeExceptionally(th6);
                        } else {
                            CompletableDeferred$default.complete(kotlin.Unit.INSTANCE);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                });
                this.Camera2StreamConfigurationMap = httpStatement;
                this.getHighResolutionOutputSizeshNQ4ISI = httpResponse2;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizesFor = 3;
                if (CompletableDeferred$default.await(this) != coroutine_suspended) {
                    httpStatement2 = httpStatement;
                    this.Camera2StreamConfigurationMap = kotlin.Unit.INSTANCE;
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoSizesFor = 4;
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                if (i == 4) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Throwable th5 = (java.lang.Throwable) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th5;
            }
            httpResponse2 = (io.ktor.client.statement.HttpResponse) this.getHighResolutionOutputSizeshNQ4ISI;
            httpStatement2 = (io.ktor.client.statement.HttpStatement) this.Camera2StreamConfigurationMap;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = kotlin.Unit.INSTANCE;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoSizesFor = 4;
            } catch (java.lang.Throwable th6) {
                th = th6;
                this.Camera2StreamConfigurationMap = th;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizesFor = 5;
                if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                }
            }
        }
        httpResponse = (io.ktor.client.statement.HttpResponse) obj;
        io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
        kotlin.reflect.KType kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
        this.Camera2StreamConfigurationMap = httpStatement;
        this.getHighResolutionOutputSizeshNQ4ISI = completableDeferred;
        this.getHighSpeedVideoFpsRangesFor = httpResponse;
        this.getHighSpeedVideoSizesFor = 2;
        java.lang.Object bodyNullable = call.bodyNullable(typeInfo, this);
        if (bodyNullable != coroutine_suspended) {
            kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> completableDeferred3 = completableDeferred;
            httpResponse2 = httpResponse;
            obj = bodyNullable;
            completableDeferred2 = completableDeferred3;
            if (obj != null) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BuildersKt$webSocketSession$2(io.ktor.client.statement.HttpStatement httpStatement, kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> completableDeferred, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = httpStatement;
        this.getHighSpeedVideoSizes = completableDeferred;
    }
}

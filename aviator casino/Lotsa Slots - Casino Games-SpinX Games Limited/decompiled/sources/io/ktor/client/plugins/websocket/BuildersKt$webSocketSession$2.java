package io.ktor.client.plugins.websocket;

/* compiled from: builders.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", f = "builders.kt", i = {0, 1, 1, 2, 2}, l = {269, 272, 56, 284, 284}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class BuildersKt$webSocketSession$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> $sessionDeferred;
    final /* synthetic */ io.ktor.client.statement.HttpStatement $statement;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BuildersKt$webSocketSession$2(io.ktor.client.statement.HttpStatement httpStatement, kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> completableDeferred, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2> continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2(this.$statement, this.$sessionDeferred, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|(1:(1:(1:(1:(1:(2:9|10)(3:12|13|14))(4:15|16|17|18))(8:19|20|21|22|23|(1:25)|17|18))(4:33|34|35|(2:37|(1:39)(6:40|22|23|(0)|17|18))(2:41|42)))(2:45|46))(4:61|62|63|(1:65)(1:66))|47|48|49|50|51|52|(1:54)(2:55|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008f, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:35:0x004e, B:37:0x00aa, B:41:0x00e3, B:42:0x00ea), top: B:34:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3 A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:35:0x004e, B:37:0x00aa, B:41:0x00e3, B:42:0x00ea), top: B:34:0x004e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> completableDeferred;
        io.ktor.client.statement.HttpStatement httpStatement;
        io.ktor.client.statement.HttpResponse httpResponse;
        io.ktor.client.statement.HttpStatement httpStatement2;
        io.ktor.client.statement.HttpResponse httpResponse2;
        java.lang.Throwable th;
        kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> completableDeferred2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (java.util.concurrent.CancellationException e) {
                throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
            }
        } catch (java.lang.Throwable th2) {
            this.$sessionDeferred.completeExceptionally(th2);
        }
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.statement.HttpStatement httpStatement3 = this.$statement;
                completableDeferred = this.$sessionDeferred;
                this.L$0 = httpStatement3;
                this.L$1 = completableDeferred;
                this.label = 1;
                java.lang.Object fetchStreamingResponse = httpStatement3.fetchStreamingResponse(this);
                if (fetchStreamingResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpStatement = httpStatement3;
                obj = fetchStreamingResponse;
            } else if (i == 1) {
                completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.L$1;
                httpStatement = (io.ktor.client.statement.HttpStatement) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    httpResponse2 = (io.ktor.client.statement.HttpResponse) this.L$2;
                    completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) this.L$1;
                    httpStatement = (io.ktor.client.statement.HttpStatement) this.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (obj != null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                        }
                        io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) obj;
                        io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2 buildersKt$webSocketSession$2 = this;
                        final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        completableDeferred2.complete(defaultClientWebSocketSession);
                        defaultClientWebSocketSession.getOutgoing().invokeOnClose(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th3) {
                                invoke2(th3);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(java.lang.Throwable th3) {
                                if (th3 != null) {
                                    CompletableDeferred$default.completeExceptionally(th3);
                                } else {
                                    CompletableDeferred$default.complete(kotlin.Unit.INSTANCE);
                                }
                            }
                        });
                        this.L$0 = httpStatement;
                        this.L$1 = httpResponse2;
                        this.L$2 = null;
                        this.label = 3;
                        if (CompletableDeferred$default.await(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        httpStatement2 = httpStatement;
                        this.L$0 = kotlin.Unit.INSTANCE;
                        this.L$1 = null;
                        this.label = 4;
                        if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                        }
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        httpStatement2 = httpStatement;
                        this.L$0 = th;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw th;
                    }
                }
                if (i != 3) {
                    if (i == 4) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th4 = (java.lang.Throwable) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw th4;
                }
                httpResponse2 = (io.ktor.client.statement.HttpResponse) this.L$1;
                httpStatement2 = (io.ktor.client.statement.HttpStatement) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.L$0 = kotlin.Unit.INSTANCE;
                    this.L$1 = null;
                    this.label = 4;
                    if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    this.L$0 = th;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                    }
                }
            }
            io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
            kotlin.reflect.KType kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
            io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
            this.L$0 = httpStatement;
            this.L$1 = completableDeferred;
            this.L$2 = httpResponse;
            this.label = 2;
            java.lang.Object bodyNullable = call.bodyNullable(typeInfo, this);
            if (bodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinx.coroutines.CompletableDeferred<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> completableDeferred3 = completableDeferred;
            httpResponse2 = httpResponse;
            obj = bodyNullable;
            completableDeferred2 = completableDeferred3;
            if (obj != null) {
            }
        } catch (java.lang.Throwable th6) {
            httpStatement2 = httpStatement;
            httpResponse2 = httpResponse;
            th = th6;
            this.L$0 = th;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 5;
            if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
            }
        }
        httpResponse = (io.ktor.client.statement.HttpResponse) obj;
    }
}

package io.ktor.client.plugins.sse;

/* compiled from: builders.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "io/ktor/client/plugins/sse/BuildersKt$processSession$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 1, 1}, l = {1121, 1124, 1136, 1136}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
/* renamed from: io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession-mY9Nd3A$$inlined$processSession-rp2poPw$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred $sessionDeferred;
    final /* synthetic */ io.ktor.client.statement.HttpStatement $statement;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(io.ktor.client.statement.HttpStatement httpStatement, kotlinx.coroutines.CompletableDeferred completableDeferred, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(this.$statement, this.$sessionDeferred, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|(1:(1:(1:(1:(2:8|9)(3:11|12|13))(4:14|15|16|17))(4:18|19|20|(5:22|23|(1:25)|16|17)(2:26|27)))(2:35|36))(4:50|51|52|(1:54)(1:55))|37|38|39|40|41|42|(1:44)(2:45|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007e, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[Catch: all -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003f, blocks: (B:20:0x003b, B:22:0x0099, B:26:0x00b2, B:27:0x00b9), top: B:19:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #5 {all -> 0x003f, blocks: (B:20:0x003b, B:22:0x0099, B:26:0x00b2, B:27:0x00b9), top: B:19:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable mapToSSEException;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        io.ktor.client.statement.HttpStatement httpStatement;
        io.ktor.client.statement.HttpResponse httpResponse;
        io.ktor.client.statement.HttpResponse httpResponse2;
        kotlinx.coroutines.CompletableDeferred completableDeferred2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                try {
                } catch (java.util.concurrent.CancellationException e) {
                    throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
                }
            } catch (java.lang.Throwable th) {
                kotlinx.coroutines.CompletableDeferred completableDeferred3 = this.$sessionDeferred;
                mapToSSEException = io.ktor.client.plugins.sse.BuildersKt.mapToSSEException(null, th);
                completableDeferred3.completeExceptionally(mapToSSEException);
            }
        } catch (java.util.concurrent.CancellationException e2) {
            this.$sessionDeferred.cancel(e2);
        }
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.statement.HttpStatement httpStatement2 = this.$statement;
                completableDeferred = this.$sessionDeferred;
                this.L$0 = httpStatement2;
                this.L$1 = completableDeferred;
                this.label = 1;
                java.lang.Object fetchStreamingResponse = httpStatement2.fetchStreamingResponse(this);
                if (fetchStreamingResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpStatement = httpStatement2;
                obj = fetchStreamingResponse;
            } else if (i == 1) {
                completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.L$1;
                httpStatement = (io.ktor.client.statement.HttpStatement) this.L$0;
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
                    java.lang.Throwable th2 = (java.lang.Throwable) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw th2;
                }
                httpResponse2 = (io.ktor.client.statement.HttpResponse) this.L$2;
                completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) this.L$1;
                httpStatement = (io.ktor.client.statement.HttpStatement) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (obj != null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization");
                    }
                    io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 buildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 = this;
                    completableDeferred2.complete((io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) obj);
                    this.L$0 = kotlin.Unit.INSTANCE;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    httpResponse = httpResponse2;
                    this.L$0 = th;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (httpStatement.cleanup(httpResponse, this) != coroutine_suspended) {
                    }
                }
            }
            io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization.class);
            kotlin.reflect.KType kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization.class);
            io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
            this.L$0 = httpStatement;
            this.L$1 = completableDeferred;
            this.L$2 = httpResponse;
            this.label = 2;
            java.lang.Object bodyNullable = call.bodyNullable(typeInfo, this);
            if (bodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinx.coroutines.CompletableDeferred completableDeferred4 = completableDeferred;
            httpResponse2 = httpResponse;
            obj = bodyNullable;
            completableDeferred2 = completableDeferred4;
            if (obj != null) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            this.L$0 = th;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
            if (httpStatement.cleanup(httpResponse, this) != coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th;
        }
        httpResponse = (io.ktor.client.statement.HttpResponse) obj;
    }
}

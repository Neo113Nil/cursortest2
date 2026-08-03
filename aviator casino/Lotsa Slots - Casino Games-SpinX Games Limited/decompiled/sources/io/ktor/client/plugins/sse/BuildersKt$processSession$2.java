package io.ktor.client.plugins.sse;

/* compiled from: builders.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 1, 1}, l = {1121, 1124, 1136, 1136}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
/* loaded from: classes6.dex */
public final class BuildersKt$processSession$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<T> $sessionDeferred;
    final /* synthetic */ io.ktor.client.statement.HttpStatement $statement;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$processSession$2(io.ktor.client.statement.HttpStatement httpStatement, kotlinx.coroutines.CompletableDeferred<T> completableDeferred, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.BuildersKt$processSession$2> continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.client.plugins.sse.BuildersKt$processSession$2(this.$statement, this.$sessionDeferred, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.sse.BuildersKt$processSession$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:(1:(1:(1:(2:8|9)(3:11|12|13))(4:14|15|16|17))(8:18|19|20|21|22|(1:24)|16|17))(2:33|34))(4:49|50|51|(1:53)(1:54))|36|37|38|39|40|41|(1:43)(6:44|21|22|(0)|16|17)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0081, code lost:
    
        r11 = (kotlin.reflect.KType) null;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
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
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.CompletableDeferred<T> completableDeferred3 = this.$sessionDeferred;
                    mapToSSEException = io.ktor.client.plugins.sse.BuildersKt.mapToSSEException(null, th);
                    completableDeferred3.completeExceptionally(mapToSSEException);
                }
            } catch (java.util.concurrent.CancellationException e) {
                this.$sessionDeferred.cancel(e);
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
                } else {
                    if (i != 1) {
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
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                            java.lang.Object obj2 = obj;
                            io.ktor.client.plugins.sse.BuildersKt$processSession$2 buildersKt$processSession$2 = this;
                            completableDeferred2.complete(obj);
                            this.L$0 = kotlin.Unit.INSTANCE;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th3) {
                            io.ktor.client.statement.HttpResponse httpResponse3 = httpResponse2;
                            th = th3;
                            httpResponse = httpResponse3;
                            this.L$0 = th;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            if (httpStatement.cleanup(httpResponse, this) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw th;
                        }
                    }
                    completableDeferred = (kotlinx.coroutines.CompletableDeferred) this.L$1;
                    httpStatement = (io.ktor.client.statement.HttpStatement) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
                io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null);
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
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                java.lang.Object obj22 = obj;
                io.ktor.client.plugins.sse.BuildersKt$processSession$2 buildersKt$processSession$22 = this;
                completableDeferred2.complete(obj);
                this.L$0 = kotlin.Unit.INSTANCE;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th4) {
                th = th4;
                this.L$0 = th;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (httpStatement.cleanup(httpResponse, this) != coroutine_suspended) {
                }
            }
            httpResponse = (io.ktor.client.statement.HttpResponse) obj;
        } catch (java.util.concurrent.CancellationException e2) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e2);
        }
    }
}

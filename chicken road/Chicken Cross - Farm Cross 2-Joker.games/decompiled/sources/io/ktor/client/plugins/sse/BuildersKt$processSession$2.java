package io.ktor.client.plugins.sse;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.util.reflect.TypeInfo;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: builders.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 1, 1}, l = {1121, 1124, 1136, 1136}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
/* loaded from: classes7.dex */
public final class BuildersKt$processSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompletableDeferred<T> $sessionDeferred;
    final /* synthetic */ HttpStatement $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$processSession$2(HttpStatement httpStatement, CompletableDeferred<T> completableDeferred, Continuation<? super BuildersKt$processSession$2> continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuildersKt$processSession$2(this.$statement, this.$sessionDeferred, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuildersKt$processSession$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    public final Object invokeSuspend(Object obj) {
        Throwable mapToSSEException;
        CompletableDeferred completableDeferred;
        HttpStatement httpStatement;
        HttpResponse httpResponse;
        HttpResponse httpResponse2;
        CompletableDeferred completableDeferred2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                try {
                } catch (Throwable th) {
                    CompletableDeferred<T> completableDeferred3 = this.$sessionDeferred;
                    mapToSSEException = BuildersKt.mapToSSEException(null, th);
                    completableDeferred3.completeExceptionally(mapToSSEException);
                }
            } catch (CancellationException e) {
                this.$sessionDeferred.cancel(e);
            }
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpStatement httpStatement2 = this.$statement;
                    completableDeferred = this.$sessionDeferred;
                    this.L$0 = httpStatement2;
                    this.L$1 = completableDeferred;
                    this.label = 1;
                    Object fetchStreamingResponse = httpStatement2.fetchStreamingResponse(this);
                    if (fetchStreamingResponse == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpStatement = httpStatement2;
                    obj = fetchStreamingResponse;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th2;
                        }
                        httpResponse2 = (HttpResponse) this.L$2;
                        completableDeferred2 = (CompletableDeferred) this.L$1;
                        httpStatement = (HttpStatement) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Intrinsics.reifiedOperationMarker(1, "T");
                            Object obj2 = obj;
                            BuildersKt$processSession$2 buildersKt$processSession$2 = this;
                            completableDeferred2.complete(obj);
                            this.L$0 = Unit.INSTANCE;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            HttpResponse httpResponse3 = httpResponse2;
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
                    completableDeferred = (CompletableDeferred) this.L$1;
                    httpStatement = (HttpStatement) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                HttpClientCall call = httpResponse.getCall();
                Intrinsics.reifiedOperationMarker(4, "T");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                Intrinsics.reifiedOperationMarker(6, "T");
                TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, null);
                this.L$0 = httpStatement;
                this.L$1 = completableDeferred;
                this.L$2 = httpResponse;
                this.label = 2;
                Object bodyNullable = call.bodyNullable(typeInfo, this);
                if (bodyNullable == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CompletableDeferred completableDeferred4 = completableDeferred;
                httpResponse2 = httpResponse;
                obj = bodyNullable;
                completableDeferred2 = completableDeferred4;
                Intrinsics.reifiedOperationMarker(1, "T");
                Object obj22 = obj;
                BuildersKt$processSession$2 buildersKt$processSession$22 = this;
                completableDeferred2.complete(obj);
                this.L$0 = Unit.INSTANCE;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
                this.L$0 = th;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (httpStatement.cleanup(httpResponse, this) != coroutine_suspended) {
                }
            }
            httpResponse = (HttpResponse) obj;
        } catch (CancellationException e2) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e2);
        }
    }
}

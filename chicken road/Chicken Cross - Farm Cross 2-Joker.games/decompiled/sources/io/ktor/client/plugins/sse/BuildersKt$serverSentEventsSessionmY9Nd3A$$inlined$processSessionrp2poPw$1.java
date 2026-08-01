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
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: builders.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "io/ktor/client/plugins/sse/BuildersKt$processSession$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", i = {0, 1, 1}, l = {1121, 1124, 1136, 1136}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
/* renamed from: io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession-mY9Nd3A$$inlined$processSession-rp2poPw$1, reason: invalid class name */
/* loaded from: classes7.dex */
public final class BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompletableDeferred $sessionDeferred;
    final /* synthetic */ HttpStatement $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(HttpStatement httpStatement, CompletableDeferred completableDeferred, Continuation continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(this.$statement, this.$sessionDeferred, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                } catch (CancellationException e) {
                    throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
                }
            } catch (Throwable th) {
                CompletableDeferred completableDeferred3 = this.$sessionDeferred;
                mapToSSEException = BuildersKt.mapToSSEException(null, th);
                completableDeferred3.completeExceptionally(mapToSSEException);
            }
        } catch (CancellationException e2) {
            this.$sessionDeferred.cancel(e2);
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
            } else if (i == 1) {
                completableDeferred = (CompletableDeferred) this.L$1;
                httpStatement = (HttpStatement) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
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
                    if (obj != null) {
                        throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization");
                    }
                    BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 buildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 = this;
                    completableDeferred2.complete((ClientSSESessionWithDeserialization) obj);
                    this.L$0 = Unit.INSTANCE;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (httpStatement.cleanup(httpResponse2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
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
            HttpClientCall call = httpResponse.getCall();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientSSESessionWithDeserialization.class);
            KType kType = Reflection.typeOf(ClientSSESessionWithDeserialization.class);
            TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kType);
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
            if (obj != null) {
            }
        } catch (Throwable th4) {
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
        httpResponse = (HttpResponse) obj;
    }
}

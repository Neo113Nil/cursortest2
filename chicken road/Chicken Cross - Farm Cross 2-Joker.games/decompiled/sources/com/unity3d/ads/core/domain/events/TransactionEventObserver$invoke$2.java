package com.unity3d.ads.core.domain.events;

import androidx.compose.material.MenuKt;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;

/* compiled from: TransactionEventObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "currentTransactionEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", i = {0, 1, 1, 2}, l = {46, 47, 55}, m = "invokeSuspend", n = {"startTime", "fullRequest", "startTime", "startTime"}, s = {"J$0", "L$0", "J$0", "J$0"})
/* loaded from: classes7.dex */
final class TransactionEventObserver$invoke$2 extends SuspendLambda implements Function2<TransactionEventRequestOuterClass.TransactionEventRequest, Continuation<? super Unit>, Object> {
    long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransactionEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionEventObserver$invoke$2(TransactionEventObserver transactionEventObserver, Continuation<? super TransactionEventObserver$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = transactionEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransactionEventObserver$invoke$2 transactionEventObserver$invoke$2 = new TransactionEventObserver$invoke$2(this.this$0, continuation);
        transactionEventObserver$invoke$2.L$0 = obj;
        return transactionEventObserver$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, Continuation<? super Unit> continuation) {
        return ((TransactionEventObserver$invoke$2) create(transactionEventRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[Catch: UnityAdsNetworkException -> 0x00ef, TRY_LEAVE, TryCatch #0 {UnityAdsNetworkException -> 0x00ef, blocks: (B:23:0x002b, B:25:0x009a, B:27:0x00a2, B:33:0x0033, B:35:0x0072, B:39:0x0046), top: B:2:0x000b }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        SendDiagnosticEvent sendDiagnosticEvent;
        long m9541markNowz9LOYto;
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
        Object invoke;
        UniversalRequestOuterClass.UniversalRequest universalRequest;
        GatewayClient gatewayClient;
        GetRequestPolicy getRequestPolicy;
        Object request$default;
        ByteStringDataSource byteStringDataSource;
        SendDiagnosticEvent sendDiagnosticEvent2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (UnityAdsNetworkException e) {
            e = e;
            j = m9541markNowz9LOYto;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = (TransactionEventRequestOuterClass.TransactionEventRequest) this.L$0;
            m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
            UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
            UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
            UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
            UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
            _create.setTransactionEventRequest(transactionEventRequest);
            UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
            getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
            this.J$0 = m9541markNowz9LOYto;
            this.label = 1;
            invoke = getUniversalRequestForPayLoad.invoke(_build, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    m9541markNowz9LOYto = this.J$0;
                    universalRequest = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    request$default = obj;
                    if (((UniversalResponseOuterClass.UniversalResponse) request$default).getError() != null) {
                        byteStringDataSource = this.this$0.iapTransactionStore;
                        ByteString byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                        Intrinsics.checkNotNullExpressionValue(byteString, "toByteString(...)");
                        this.L$0 = null;
                        this.J$0 = m9541markNowz9LOYto;
                        this.label = 3;
                        if (byteStringDataSource.set(byteString, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    j = m9541markNowz9LOYto;
                    sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                } catch (UnityAdsNetworkException e2) {
                    e = e2;
                    sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME;
                    Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j)));
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = TuplesKt.to("reason", e.getClass().getSimpleName());
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getSimpleName();
                    }
                    pairArr[1] = TuplesKt.to("reason_debug", message);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, boxDouble, MapsKt.mapOf(pairArr), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, MenuKt.InTransitionDuration, (Object) null);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            m9541markNowz9LOYto = this.J$0;
            ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        universalRequest = (UniversalRequestOuterClass.UniversalRequest) invoke;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        this.L$0 = universalRequest;
        this.J$0 = m9541markNowz9LOYto;
        this.label = 2;
        request$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, getRequestPolicy.invoke(), OperationType.TRANSACTION_EVENT, this, 1, null);
        if (request$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((UniversalResponseOuterClass.UniversalResponse) request$default).getError() != null) {
        }
        j = m9541markNowz9LOYto;
        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
        return Unit.INSTANCE;
    }
}

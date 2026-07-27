package com.unity3d.ads.core.domain;

import androidx.compose.material.MenuKt;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;

/* compiled from: AndroidTriggerInitializationCompletedRequest.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0096B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "getInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    private final GatewayClient gatewayClient;
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidTriggerInitializationCompletedRequest(GetInitializationCompletedRequest getInitializationCompletedRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|(4:(1:(7:10|11|12|13|14|15|(5:17|18|19|20|21)(2:28|29))(2:35|36))(3:37|38|39)|34|25|26)(4:59|60|61|(1:63))|40|41|42|43|44|45|(1:47)(4:48|14|15|(0)(0))))|67|6|(0)(0)|40|41|42|43|44|45|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0133, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0134, code lost:
    
        r19 = r6;
        r7 = 1;
        r16 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8 A[Catch: Exception -> 0x012d, TRY_LEAVE, TryCatch #3 {Exception -> 0x012d, blocks: (B:15:0x00b0, B:17:0x00b8), top: B:14:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Continuation<? super Unit> continuation) {
        AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        long m9541markNowz9LOYto;
        int i2;
        char c;
        long j;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        if (continuation instanceof AndroidTriggerInitializationCompletedRequest$invoke$1) {
            androidTriggerInitializationCompletedRequest$invoke$1 = (AndroidTriggerInitializationCompletedRequest$invoke$1) continuation;
            if ((androidTriggerInitializationCompletedRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidTriggerInitializationCompletedRequest$invoke$1.label -= Integer.MIN_VALUE;
                AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$12 = androidTriggerInitializationCompletedRequest$invoke$1;
                obj = androidTriggerInitializationCompletedRequest$invoke$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidTriggerInitializationCompletedRequest$invoke$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
                    try {
                        GetInitializationCompletedRequest getInitializationCompletedRequest = this.getInitializationCompletedRequest;
                        androidTriggerInitializationCompletedRequest$invoke$12.J$0 = m9541markNowz9LOYto;
                        androidTriggerInitializationCompletedRequest$invoke$12.label = 1;
                        obj = getInitializationCompletedRequest.invoke(androidTriggerInitializationCompletedRequest$invoke$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        e = e;
                        i2 = 1;
                        c = 2;
                        j = m9541markNowz9LOYto;
                    }
                } else {
                    if (i == 1) {
                        m9541markNowz9LOYto = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e2) {
                            e = e2;
                            j = m9541markNowz9LOYto;
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            c = 2;
                            try {
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                                if (!universalResponse.hasError()) {
                                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME;
                                    Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j)));
                                    Pair[] pairArr = new Pair[3];
                                    pairArr[0] = TuplesKt.to("operation", OperationType.INITIALIZATION_COMPLETED.toString());
                                    i2 = 1;
                                    try {
                                        pairArr[1] = TuplesKt.to("reason", "gateway");
                                        pairArr[c] = TuplesKt.to("reason_debug", universalResponse.getError().getErrorText());
                                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, boxDouble, MapsKt.mapOf(pairArr), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, MenuKt.InTransitionDuration, (Object) null);
                                        return Unit.INSTANCE;
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                } else {
                                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                                    return Unit.INSTANCE;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                i2 = 1;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    }
                    i2 = 1;
                    c = 2;
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME;
                    Double boxDouble2 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j)));
                    Pair[] pairArr2 = new Pair[3];
                    pairArr2[0] = TuplesKt.to("operation", OperationType.INITIALIZATION_COMPLETED.toString());
                    pairArr2[i2] = TuplesKt.to("reason", "uncaught_exception");
                    pairArr2[c] = TuplesKt.to("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, i2, null));
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, boxDouble2, MapsKt.mapOf(pairArr2), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, MenuKt.InTransitionDuration, (Object) null);
                    return Unit.INSTANCE;
                }
                long j2 = m9541markNowz9LOYto;
                UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
                RequestPolicy invoke = this.getRequestPolicy.invoke();
                GatewayClient gatewayClient = this.gatewayClient;
                OperationType operationType = OperationType.INITIALIZATION_COMPLETED;
                androidTriggerInitializationCompletedRequest$invoke$12.J$0 = j2;
                androidTriggerInitializationCompletedRequest$invoke$12.label = 2;
                long j3 = j2;
                c = 2;
                obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, operationType, androidTriggerInitializationCompletedRequest$invoke$12, 1, null);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = j3;
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                if (!universalResponse.hasError()) {
                }
            }
        }
        androidTriggerInitializationCompletedRequest$invoke$1 = new AndroidTriggerInitializationCompletedRequest$invoke$1(this, continuation);
        AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$122 = androidTriggerInitializationCompletedRequest$invoke$1;
        obj = androidTriggerInitializationCompletedRequest$invoke$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidTriggerInitializationCompletedRequest$invoke$122.label;
        if (i != 0) {
        }
        long j22 = m9541markNowz9LOYto;
        UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) obj;
        RequestPolicy invoke2 = this.getRequestPolicy.invoke();
        GatewayClient gatewayClient2 = this.gatewayClient;
        OperationType operationType2 = OperationType.INITIALIZATION_COMPLETED;
        androidTriggerInitializationCompletedRequest$invoke$122.J$0 = j22;
        androidTriggerInitializationCompletedRequest$invoke$122.label = 2;
        long j32 = j22;
        c = 2;
        obj = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, invoke2, operationType2, androidTriggerInitializationCompletedRequest$invoke$122, 1, null);
        if (obj != coroutine_suspended) {
        }
    }
}

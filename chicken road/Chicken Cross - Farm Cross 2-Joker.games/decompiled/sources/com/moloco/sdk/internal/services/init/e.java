package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import androidx.compose.material.TextFieldImplKt;
import com.facebook.login.LoginLogger;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.C4809j;
import com.moloco.sdk.internal.services.InterfaceC4810k;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.services.y;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.MediationInfo;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.reflect.TypeInfo;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class e implements d {
    public static final int j = 8;
    public final y c;
    public final InterfaceC4810k d;
    public final com.moloco.sdk.internal.services.usertracker.f e;
    public final String f;
    public final long g;
    public final HttpClient h;
    public final Uri i;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitApiImpl", f = "InitApi.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {67, 157, 99}, m = "invoke", n = {"this", "appKey", "mediationInfo", "metricsRecorder", "httpRequestTimerEvent", "deviceInfo", "appInfo", "this", "metricsRecorder", "httpRequestTimerEvent", "this", "metricsRecorder", "httpRequestTimerEvent"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10806a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public /* synthetic */ Object h;
        public int j;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return e.this.a(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitApiImpl$invoke$2", f = "InitApi.kt", i = {}, l = {TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Init.SDKInitResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10807a;
        public final /* synthetic */ HttpResponse b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpResponse httpResponse, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = httpResponse;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Init.SDKInitResponse> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KType kType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10807a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, f.f10808a, "Successful Init", null, false, 12, null);
                HttpClientCall call = this.b.getCall();
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
                try {
                    kType = Reflection.typeOf(byte[].class);
                } catch (Throwable unused) {
                    kType = null;
                }
                TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kType);
                this.f10807a = 1;
                obj = call.bodyNullable(typeInfo, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (obj != null) {
                return Init.SDKInitResponse.parseFrom((byte[]) obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
        }
    }

    public e(y deviceInfoService, InterfaceC4810k appInfoService, com.moloco.sdk.internal.services.usertracker.f userTrackerService, String sdkVersion, String endpoint, long j2, HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(appInfoService, "appInfoService");
        Intrinsics.checkNotNullParameter(userTrackerService, "userTrackerService");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.c = deviceInfoService;
        this.d = appInfoService;
        this.e = userTrackerService;
        this.f = sdkVersion;
        this.g = j2;
        this.h = httpClient;
        this.i = Uri.parse(endpoint);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0174 A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #4 {Exception -> 0x0065, blocks: (B:31:0x0060, B:32:0x0162, B:34:0x0174, B:38:0x01b0, B:41:0x01bc, B:44:0x020a), top: B:30:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b0 A[Catch: Exception -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0065, blocks: (B:31:0x0060, B:32:0x0162, B:34:0x0174, B:38:0x01b0, B:41:0x01bc, B:44:0x020a), top: B:30:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // com.moloco.sdk.internal.services.init.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, MediationInfo mediationInfo, MetricsRecorder metricsRecorder, Continuation<? super x<Init.SDKInitResponse, j>> continuation) {
        a aVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        final e eVar;
        MetricsRecorder metricsRecorder2;
        TimerEvent timerEvent;
        String str2;
        final MediationInfo mediationInfo2;
        final C4809j c4809j;
        final com.moloco.sdk.internal.services.x xVar;
        e eVar2;
        TimerEvent timerEvent2;
        MetricsRecorder metricsRecorder3;
        HttpStatusCode status;
        HttpStatusCode.Companion companion;
        x.a aVar2;
        MetricsRecorder metricsRecorder4;
        e eVar3;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.j = i2 - Integer.MIN_VALUE;
                obj = aVar.h;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.j;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.d.c());
                    try {
                        com.moloco.sdk.internal.services.x invoke = this.c.invoke();
                        C4809j invoke2 = this.d.invoke();
                        com.moloco.sdk.internal.services.usertracker.f fVar = this.e;
                        aVar.f10806a = this;
                        str2 = str;
                        aVar.b = str2;
                        mediationInfo2 = mediationInfo;
                        aVar.c = mediationInfo2;
                        aVar.d = metricsRecorder;
                        aVar.e = startTimerEvent;
                        aVar.f = invoke;
                        aVar.g = invoke2;
                        aVar.j = 1;
                        Object b2 = fVar.b(aVar);
                        if (b2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        metricsRecorder2 = metricsRecorder;
                        c4809j = invoke2;
                        eVar = this;
                        xVar = invoke;
                        obj = b2;
                        timerEvent = startTimerEvent;
                    } catch (Exception e) {
                        e = e;
                        eVar = this;
                        metricsRecorder2 = metricsRecorder;
                        timerEvent = startTimerEvent;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            timerEvent2 = (TimerEvent) aVar.c;
                            metricsRecorder3 = (MetricsRecorder) aVar.b;
                            eVar2 = (e) aVar.f10806a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                HttpResponse httpResponse = (HttpResponse) obj;
                                status = httpResponse.getStatus();
                                companion = HttpStatusCode.INSTANCE;
                                if (Intrinsics.areEqual(status, companion.getOK())) {
                                    if (Intrinsics.areEqual(status, companion.getNotFound())) {
                                        metricsRecorder3.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(status.getValue())));
                                        MolocoLogger.error$default(MolocoLogger.INSTANCE, f.f10808a, "http status " + status + ": App not found or AppKey is not correct", null, false, 12, null);
                                        aVar2 = new x.a(new j.b(status.getValue()));
                                    } else {
                                        metricsRecorder3.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(status.getValue())));
                                        MolocoLogger.error$default(MolocoLogger.INSTANCE, f.f10808a, "SDK Init failed with status code: " + status, null, false, 12, null);
                                        aVar2 = new x.a(new j.b(status.getValue()));
                                    }
                                    return aVar2;
                                }
                                metricsRecorder3.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success"));
                                CoroutineContext io2 = com.moloco.sdk.internal.scheduling.b.a().getIo();
                                b bVar = new b(httpResponse, null);
                                aVar.f10806a = eVar2;
                                aVar.b = metricsRecorder3;
                                aVar.c = timerEvent2;
                                aVar.j = 3;
                                obj = BuildersKt.withContext(io2, bVar, aVar);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                metricsRecorder4 = metricsRecorder3;
                                eVar3 = eVar2;
                                return new x.b(obj);
                            } catch (Exception e2) {
                                e = e2;
                                eVar3 = eVar2;
                            }
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            timerEvent2 = (TimerEvent) aVar.c;
                            metricsRecorder4 = (MetricsRecorder) aVar.b;
                            eVar3 = (e) aVar.f10806a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                try {
                                    return new x.b(obj);
                                } catch (Exception e3) {
                                    e = e3;
                                    timerEvent = timerEvent2;
                                    metricsRecorder2 = metricsRecorder4;
                                    eVar = eVar3;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                metricsRecorder3 = metricsRecorder4;
                            }
                        }
                        timerEvent = timerEvent2;
                        eVar = eVar3;
                        metricsRecorder2 = metricsRecorder3;
                        return eVar.a(e, timerEvent, metricsRecorder2);
                    }
                    c4809j = (C4809j) aVar.g;
                    xVar = (com.moloco.sdk.internal.services.x) aVar.f;
                    timerEvent = (TimerEvent) aVar.e;
                    metricsRecorder2 = (MetricsRecorder) aVar.d;
                    MediationInfo mediationInfo3 = (MediationInfo) aVar.c;
                    String str3 = (String) aVar.b;
                    eVar = (e) aVar.f10806a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        mediationInfo2 = mediationInfo3;
                        str2 = str3;
                    } catch (Exception e5) {
                        e = e5;
                    }
                }
                String str4 = (String) obj;
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, f.f10808a, "Requesting Init with appKey: " + str2 + ", mref: " + str4 + ", url: " + eVar.i, false, 4, null);
                HttpClient httpClient = eVar.h;
                String uri = eVar.i.buildUpon().appendQueryParameter(MBridgeConstans.APP_KEY, str2).appendQueryParameter("rid", str4).build().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                HttpRequestKt.url(httpRequestBuilder, uri);
                HttpRequestKt.headers(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.internal.services.init.e$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return e.a(e.this, xVar, mediationInfo2, c4809j, (HeadersBuilder) obj2);
                    }
                });
                com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, eVar.g);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                aVar.f10806a = eVar;
                aVar.b = metricsRecorder2;
                aVar.c = timerEvent;
                aVar.d = null;
                aVar.e = null;
                aVar.f = null;
                aVar.g = null;
                aVar.j = 2;
                obj = httpStatement.execute(aVar);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                eVar2 = eVar;
                timerEvent2 = timerEvent;
                metricsRecorder3 = metricsRecorder2;
                HttpResponse httpResponse2 = (HttpResponse) obj;
                status = httpResponse2.getStatus();
                companion = HttpStatusCode.INSTANCE;
                if (Intrinsics.areEqual(status, companion.getOK())) {
                }
            }
        }
        aVar = new a(continuation);
        obj = aVar.h;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.j;
        if (i != 0) {
        }
        String str42 = (String) obj;
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, f.f10808a, "Requesting Init with appKey: " + str2 + ", mref: " + str42 + ", url: " + eVar.i, false, 4, null);
        HttpClient httpClient2 = eVar.h;
        String uri2 = eVar.i.buildUpon().appendQueryParameter(MBridgeConstans.APP_KEY, str2).appendQueryParameter("rid", str42).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        HttpRequestBuilder httpRequestBuilder2 = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder2, uri2);
        HttpRequestKt.headers(httpRequestBuilder2, new Function1() { // from class: com.moloco.sdk.internal.services.init.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return e.a(e.this, xVar, mediationInfo2, c4809j, (HeadersBuilder) obj2);
            }
        });
        com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder2, eVar.g);
        httpRequestBuilder2.setMethod(HttpMethod.INSTANCE.getGet());
        HttpStatement httpStatement2 = new HttpStatement(httpRequestBuilder2, httpClient2);
        aVar.f10806a = eVar;
        aVar.b = metricsRecorder2;
        aVar.c = timerEvent;
        aVar.d = null;
        aVar.e = null;
        aVar.f = null;
        aVar.g = null;
        aVar.j = 2;
        obj = httpStatement2.execute(aVar);
        if (obj != coroutine_suspended) {
        }
    }

    public static final Unit a(e eVar, com.moloco.sdk.internal.services.x xVar, MediationInfo mediationInfo, C4809j c4809j, HeadersBuilder headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        com.moloco.sdk.internal.n.a(headers, eVar.f, xVar.x(), mediationInfo);
        String b2 = c4809j.b();
        if (Intrinsics.areEqual(b2, "com.example.demo2")) {
            b2 = "com.trickytribe.penetrator";
        }
        headers.append("X-Moloco-App-Bundle", b2);
        return Unit.INSTANCE;
    }

    public final x<Init.SDKInitResponse, j> a(Exception exc, TimerEvent timerEvent, MetricsRecorder metricsRecorder) {
        com.moloco.sdk.internal.services.init.b bVar;
        if (exc instanceof HttpRequestTimeoutException) {
            bVar = com.moloco.sdk.internal.services.init.b.f10802a;
        } else if (exc instanceof SSLHandshakeException) {
            bVar = com.moloco.sdk.internal.services.init.b.d;
        } else if (exc instanceof SocketException) {
            bVar = com.moloco.sdk.internal.services.init.b.c;
        } else {
            bVar = exc instanceof UnknownHostException ? com.moloco.sdk.internal.services.init.b.b : com.moloco.sdk.internal.services.init.b.f;
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, f.f10808a, "SDK Init failed with client exception", exc, false, 8, null);
        metricsRecorder.recordTimerEvent(timerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), bVar.name()));
        return new x.a(new j.a(bVar));
    }
}

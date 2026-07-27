package com.moloco.sdk.internal.services.init;

import com.facebook.login.LoginLogger;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.moloco.sdk.BidRequest;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes7.dex */
public final class l implements k {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.init.d f10817a;
    public final g b;
    public final CoroutineScope c;
    public Init.SDKInitResponse d;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitServiceImpl", f = "InitService.kt", i = {0, 0, 0, 0, 1}, l = {MBSupportMuteAdType.REWARD_VIDEO, BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE}, m = "fetchInitResponse", n = {"this", "appKey", "mediationInfo", "metricsRecorder", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10818a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return l.this.a(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitServiceImpl$fetchInitResponse$3", f = "InitService.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10819a;
        public final /* synthetic */ String c;
        public final /* synthetic */ MediationInfo d;
        public final /* synthetic */ MetricsRecorder e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, MediationInfo mediationInfo, MetricsRecorder metricsRecorder, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = mediationInfo;
            this.e = metricsRecorder;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return l.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10819a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, m.f10822a, "Async fetching init response", null, false, 12, null);
                l lVar = l.this;
                String str = this.c;
                MediationInfo mediationInfo = this.d;
                MetricsRecorder metricsRecorder = this.e;
                this.f10819a = 1;
                if (lVar.a(str, mediationInfo, metricsRecorder, true, (Continuation<? super x<Init.SDKInitResponse, j>>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitServiceImpl", f = "InitService.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 4}, l = {135, 144, 146, 183, 196}, m = "fetchServerInitResponse$moloco_sdk_release", n = {"this", "appKey", "mediationInfo", "metricsRecorder", "result", "asyncFetch", "attempt", "metricsRecorder", "it", "cacheKey", "$this$fetchServerInitResponse_u24lambda_u244_u24lambda_u242_u24lambda_u241", "asyncFetch", "attempt", "metricsRecorder", "it", "asyncFetch", "attempt", "result", "this", "appKey", "mediationInfo", "metricsRecorder", "result", "asyncFetch"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$2", "L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10820a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public boolean g;
        public int h;
        public int i;
        public int j;
        public /* synthetic */ Object k;
        public int m;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return l.this.a((String) null, (MediationInfo) null, (MetricsRecorder) null, false, (Continuation<? super x<Init.SDKInitResponse, j>>) this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitServiceImpl", f = "InitService.kt", i = {0, 0}, l = {68}, m = "performInit", n = {"metricsRecorder", "performInitEvent"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10821a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return l.this.a(null, null, this);
        }
    }

    public l(com.moloco.sdk.internal.services.init.d initApi, g initCache, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(initApi, "initApi");
        Intrinsics.checkNotNullParameter(initCache, "initCache");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f10817a = initApi;
        this.b = initCache;
        this.c = scope;
    }

    @Override // com.moloco.sdk.internal.services.init.k
    public Init.SDKInitResponse a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.moloco.sdk.internal.services.init.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, MediationInfo mediationInfo, Continuation<? super x<Init.SDKInitResponse, j>> continuation) {
        d dVar;
        int i;
        MetricsRecorder metricsRecorder;
        TimerEvent timerEvent;
        x<Init.SDKInitResponse, j> d2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.e = i2 - Integer.MIN_VALUE;
                Object obj = dVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MetricsRecorder create = MetricsRecorder.INSTANCE.create(mediationInfo.getName());
                    TimerEvent startTimerEvent = create.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.c.c());
                    dVar.f10821a = create;
                    dVar.b = startTimerEvent;
                    dVar.e = 1;
                    Object a2 = a(str, mediationInfo, create, dVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    metricsRecorder = create;
                    obj = a2;
                    timerEvent = startTimerEvent;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    timerEvent = (TimerEvent) dVar.b;
                    metricsRecorder = (MetricsRecorder) dVar.f10821a;
                    ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.internal.services.init.c cVar = (com.moloco.sdk.internal.services.init.c) obj;
                d2 = cVar.d();
                if (!(d2 instanceof x.a)) {
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.d.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder.recordCountEvent(countEvent.withTag(dVar2.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("state", cVar.c()));
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(dVar2.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("state", cVar.c()));
                } else if (d2 instanceof x.b) {
                    CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.d.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder.recordCountEvent(countEvent2.withTag(dVar3.c(), "success").withTag("state", cVar.c()));
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(dVar3.c(), "success").withTag("state", cVar.c()));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return cVar.d();
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.e;
        if (i != 0) {
        }
        com.moloco.sdk.internal.services.init.c cVar2 = (com.moloco.sdk.internal.services.init.c) obj2;
        d2 = cVar2.d();
        if (!(d2 instanceof x.a)) {
        }
        return cVar2.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, MediationInfo mediationInfo, MetricsRecorder metricsRecorder, Continuation<? super com.moloco.sdk.internal.services.init.c> continuation) {
        a aVar;
        int i;
        l lVar;
        String str2;
        MetricsRecorder metricsRecorder2;
        MediationInfo mediationInfo2;
        Init.SDKInitResponse sDKInitResponse;
        l lVar2;
        x xVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar2.g;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Init.SDKInitResponse sDKInitResponse2 = this.d;
                    if (sDKInitResponse2 != null) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, m.f10822a, "Returning current session init response", null, false, 12, null);
                        return new com.moloco.sdk.internal.services.init.c(new x.b(sDKInitResponse2), "in_memory");
                    }
                    g gVar = this.b;
                    com.moloco.sdk.internal.services.init.a aVar3 = new com.moloco.sdk.internal.services.init.a(str);
                    aVar2.f10818a = this;
                    aVar2.b = str;
                    aVar2.c = mediationInfo;
                    aVar2.d = metricsRecorder;
                    aVar2.g = 1;
                    obj = gVar.a(aVar3, metricsRecorder, aVar2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lVar = this;
                    str2 = str;
                    metricsRecorder2 = metricsRecorder;
                    mediationInfo2 = mediationInfo;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lVar2 = (l) aVar2.f10818a;
                        ResultKt.throwOnFailure(obj);
                        xVar = (x) obj;
                        if (!(xVar instanceof x.b)) {
                            lVar2.d = (Init.SDKInitResponse) ((x.b) xVar).a();
                        } else if (xVar instanceof x.a) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, m.f10822a, "Fetching init response failed", null, false, 12, null);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return new com.moloco.sdk.internal.services.init.c(xVar, "network");
                    }
                    MetricsRecorder metricsRecorder3 = (MetricsRecorder) aVar2.d;
                    MediationInfo mediationInfo3 = (MediationInfo) aVar2.c;
                    String str3 = (String) aVar2.b;
                    l lVar3 = (l) aVar2.f10818a;
                    ResultKt.throwOnFailure(obj);
                    metricsRecorder2 = metricsRecorder3;
                    mediationInfo2 = mediationInfo3;
                    str2 = str3;
                    lVar = lVar3;
                }
                sDKInitResponse = (Init.SDKInitResponse) obj;
                if (sDKInitResponse == null) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, m.f10822a, "Returning cached init response", null, false, 12, null);
                    lVar.d = sDKInitResponse;
                    BuildersKt__Builders_commonKt.launch$default(lVar.c, null, null, lVar.new b(str2, mediationInfo2, metricsRecorder2, null), 3, null);
                    return new com.moloco.sdk.internal.services.init.c(new x.b(sDKInitResponse), "cache");
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, m.f10822a, "No cached response, fetching from server", null, false, 12, null);
                aVar2.f10818a = lVar;
                aVar2.b = null;
                aVar2.c = null;
                aVar2.d = null;
                aVar2.g = 2;
                obj = lVar.a(str2, mediationInfo2, metricsRecorder2, false, (Continuation<? super x<Init.SDKInitResponse, j>>) aVar2);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lVar2 = lVar;
                xVar = (x) obj;
                if (!(xVar instanceof x.b)) {
                }
                return new com.moloco.sdk.internal.services.init.c(xVar, "network");
            }
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar22.g;
        if (i != 0) {
        }
        sDKInitResponse = (Init.SDKInitResponse) obj2;
        if (sDKInitResponse == null) {
        }
    }

    @Override // com.moloco.sdk.internal.services.init.k
    public Object a(Continuation<? super Unit> continuation) {
        this.d = null;
        Object a2 = this.b.a(continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0345 -> B:14:0x034c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, MediationInfo mediationInfo, MetricsRecorder metricsRecorder, boolean z, Continuation<? super x<Init.SDKInitResponse, j>> continuation) {
        c cVar;
        l lVar;
        int i;
        boolean z2;
        Ref.ObjectRef objectRef;
        c cVar2;
        l lVar2;
        int i2;
        int i3;
        String str2;
        MediationInfo mediationInfo2;
        MetricsRecorder metricsRecorder2;
        Ref.ObjectRef objectRef2;
        T t;
        Init.SDKInitResponse sDKInitResponse;
        boolean z3;
        int i4;
        MetricsRecorder metricsRecorder3;
        Init.SDKInitResponse sDKInitResponse2;
        com.moloco.sdk.internal.services.init.a aVar;
        g gVar;
        boolean z4;
        int i5;
        c cVar3;
        Ref.ObjectRef objectRef3;
        MetricsRecorder metricsRecorder4;
        int i6;
        String str3;
        MediationInfo mediationInfo3;
        l lVar3;
        boolean z5;
        int i7;
        T t2;
        T t3;
        x xVar;
        x xVar2;
        Object valueOf;
        x xVar3;
        x xVar4;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i8 = cVar.m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.m = i8 - Integer.MIN_VALUE;
                lVar = this;
                Object obj = cVar.k;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.m;
                String str4 = "async";
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    z2 = z;
                    objectRef = new Ref.ObjectRef();
                    cVar2 = cVar;
                    lVar2 = lVar;
                    i2 = 0;
                    i3 = 3;
                    str2 = str;
                    mediationInfo2 = mediationInfo;
                    metricsRecorder2 = metricsRecorder;
                    if (i2 < i3) {
                    }
                } else if (i == 1) {
                    i5 = cVar.j;
                    i7 = cVar.i;
                    int i9 = cVar.h;
                    boolean z6 = cVar.g;
                    objectRef = (Ref.ObjectRef) cVar.f;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) cVar.e;
                    metricsRecorder4 = (MetricsRecorder) cVar.d;
                    MediationInfo mediationInfo4 = (MediationInfo) cVar.c;
                    str3 = (String) cVar.b;
                    l lVar4 = (l) cVar.f10820a;
                    ResultKt.throwOnFailure(obj);
                    i6 = i9;
                    z5 = z6;
                    lVar3 = lVar4;
                    mediationInfo3 = mediationInfo4;
                    objectRef3 = objectRef4;
                    t2 = obj;
                    objectRef.element = t2;
                    t3 = objectRef3.element;
                    if (t3 != 0) {
                    }
                    if (xVar instanceof x.b) {
                    }
                } else if (i == 2) {
                    i5 = cVar.h;
                    z4 = cVar.g;
                    gVar = (g) cVar.d;
                    aVar = (com.moloco.sdk.internal.services.init.a) cVar.c;
                    sDKInitResponse2 = (Init.SDKInitResponse) cVar.b;
                    MetricsRecorder metricsRecorder5 = (MetricsRecorder) cVar.f10820a;
                    ResultKt.throwOnFailure(obj);
                    cVar3 = cVar;
                    metricsRecorder3 = metricsRecorder5;
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, m.f10822a, "Updating cache to new init response", null, false, 12, null);
                    cVar3.f10820a = metricsRecorder3;
                    cVar3.b = sDKInitResponse2;
                    cVar3.c = null;
                    cVar3.d = null;
                    cVar3.g = z4;
                    cVar3.h = i5;
                    cVar3.m = 3;
                    if (gVar.a(aVar, metricsRecorder3, sDKInitResponse2, cVar3) != coroutine_suspended) {
                    }
                } else {
                    if (i == 3) {
                        i4 = cVar.h;
                        z3 = cVar.g;
                        sDKInitResponse = (Init.SDKInitResponse) cVar.b;
                        metricsRecorder3 = (MetricsRecorder) cVar.f10820a;
                        ResultKt.throwOnFailure(obj);
                        metricsRecorder3.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.e.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.f.c(), String.valueOf(i4)).withTag(str4, String.valueOf(z3)));
                        return new x.b(sDKInitResponse);
                    }
                    if (i == 4) {
                        objectRef2 = (Ref.ObjectRef) cVar.f10820a;
                        ResultKt.throwOnFailure(obj);
                        t = objectRef2.element;
                        if (t == 0) {
                        }
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i10 = cVar.i;
                        int i11 = cVar.h;
                        boolean z7 = cVar.g;
                        objectRef3 = (Ref.ObjectRef) cVar.e;
                        MetricsRecorder metricsRecorder6 = (MetricsRecorder) cVar.d;
                        MediationInfo mediationInfo5 = (MediationInfo) cVar.c;
                        String str5 = (String) cVar.b;
                        l lVar5 = (l) cVar.f10820a;
                        ResultKt.throwOnFailure(obj);
                        c cVar4 = cVar;
                        String str6 = "async";
                        mediationInfo2 = mediationInfo5;
                        lVar2 = lVar5;
                        str2 = str5;
                        i3 = i11;
                        z5 = z7;
                        metricsRecorder4 = metricsRecorder6;
                        i2 = i10 + 1;
                        str4 = str6;
                        z2 = z5;
                        metricsRecorder2 = metricsRecorder4;
                        objectRef = objectRef3;
                        cVar2 = cVar4;
                        if (i2 < i3) {
                            com.moloco.sdk.internal.services.init.d dVar = lVar2.f10817a;
                            cVar2.f10820a = lVar2;
                            cVar2.b = str2;
                            cVar2.c = mediationInfo2;
                            cVar2.d = metricsRecorder2;
                            cVar2.e = objectRef;
                            cVar2.f = objectRef;
                            cVar2.g = z2;
                            cVar2.h = i3;
                            cVar2.i = i2;
                            cVar2.j = i2;
                            cVar2.m = 1;
                            Object a2 = dVar.a(str2, mediationInfo2, metricsRecorder2, cVar2);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            metricsRecorder4 = metricsRecorder2;
                            i5 = i2;
                            objectRef3 = objectRef;
                            lVar3 = lVar2;
                            str3 = str2;
                            t2 = a2;
                            i6 = i3;
                            mediationInfo3 = mediationInfo2;
                            cVar = cVar2;
                            z5 = z2;
                            i7 = i5;
                            objectRef.element = t2;
                            t3 = objectRef3.element;
                            if (t3 != 0) {
                                Intrinsics.throwUninitializedPropertyAccessException("result");
                                xVar = null;
                            } else {
                                xVar = (x) t3;
                            }
                            if (xVar instanceof x.b) {
                                T t4 = objectRef3.element;
                                if (t4 == 0) {
                                    Intrinsics.throwUninitializedPropertyAccessException("result");
                                    xVar3 = null;
                                } else {
                                    xVar3 = (x) t4;
                                }
                                Intrinsics.checkNotNull(xVar3, "null cannot be cast to non-null type com.moloco.sdk.internal.Result.Success<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.InitFailure>");
                                Init.SDKInitResponse sDKInitResponse3 = (Init.SDKInitResponse) ((x.b) xVar3).a();
                                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                                MolocoLogger.info$default(molocoLogger, m.f10822a, "Init, successful in attempt(#" + i5 + ')', null, false, 12, null);
                                com.moloco.sdk.internal.services.init.a aVar2 = new com.moloco.sdk.internal.services.init.a(str3);
                                g gVar2 = lVar3.b;
                                MolocoLogger.info$default(molocoLogger, m.f10822a, "Clearing cache for old init response", null, false, 12, null);
                                cVar.f10820a = metricsRecorder4;
                                cVar.b = sDKInitResponse3;
                                cVar.c = aVar2;
                                cVar.d = gVar2;
                                cVar.e = null;
                                cVar.f = null;
                                cVar.g = z5;
                                cVar.h = i5;
                                cVar.m = 2;
                                if (gVar2.b(aVar2, metricsRecorder4, cVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                z4 = z5;
                                gVar = gVar2;
                                aVar = aVar2;
                                sDKInitResponse2 = sDKInitResponse3;
                                cVar3 = cVar;
                                metricsRecorder3 = metricsRecorder4;
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, m.f10822a, "Updating cache to new init response", null, false, 12, null);
                                cVar3.f10820a = metricsRecorder3;
                                cVar3.b = sDKInitResponse2;
                                cVar3.c = null;
                                cVar3.d = null;
                                cVar3.g = z4;
                                cVar3.h = i5;
                                cVar3.m = 3;
                                if (gVar.a(aVar, metricsRecorder3, sDKInitResponse2, cVar3) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i4 = i5;
                                z3 = z4;
                                sDKInitResponse = sDKInitResponse2;
                                metricsRecorder3.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.e.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.f.c(), String.valueOf(i4)).withTag(str4, String.valueOf(z3)));
                                return new x.b(sDKInitResponse);
                            }
                            if (xVar instanceof x.a) {
                                T t5 = objectRef3.element;
                                if (t5 == 0) {
                                    Intrinsics.throwUninitializedPropertyAccessException("result");
                                    xVar2 = null;
                                } else {
                                    xVar2 = (x) t5;
                                }
                                Intrinsics.checkNotNull(xVar2, "null cannot be cast to non-null type com.moloco.sdk.internal.Result.Failure<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.InitFailure>");
                                x.a aVar3 = (x.a) xVar2;
                                j jVar = (j) aVar3.a();
                                if (jVar instanceof j.a) {
                                    valueOf = ((j.a) jVar).a();
                                } else {
                                    if (!(jVar instanceof j.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    valueOf = String.valueOf(((j.b) jVar).a());
                                }
                                int i12 = i7;
                                int i13 = i6;
                                metricsRecorder4.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.e.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.f.c(), String.valueOf(i5)).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(valueOf)).withTag(str4, String.valueOf(z5)));
                                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                                MolocoLogger.info$default(molocoLogger2, m.f10822a, "Init attempt(#" + i5 + ") failed with error: " + valueOf, null, false, 12, null);
                                if (!m.a((x.a<Init.SDKInitResponse, j>) aVar3)) {
                                    if (aVar3.a() instanceof j.b) {
                                        MolocoLogger.error$default(molocoLogger2, m.f10822a, "Init response is non-retryable server failure: " + ((j.b) aVar3.a()).a() + ", clearing cache", null, false, 12, null);
                                        g gVar3 = lVar3.b;
                                        com.moloco.sdk.internal.services.init.a aVar4 = new com.moloco.sdk.internal.services.init.a(str3);
                                        cVar.f10820a = objectRef3;
                                        cVar.b = null;
                                        cVar.c = null;
                                        cVar.d = null;
                                        cVar.e = null;
                                        cVar.f = null;
                                        cVar.m = 4;
                                        if (gVar3.b(aVar4, metricsRecorder4, cVar) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        MolocoLogger.error$default(molocoLogger2, m.f10822a, "Init response is non-retryable server or client failure: " + aVar3.a(), null, false, 12, null);
                                    }
                                    objectRef2 = objectRef3;
                                    t = objectRef2.element;
                                    if (t == 0) {
                                        return (x) t;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("result");
                                    return null;
                                }
                                cVar.f10820a = lVar3;
                                cVar.b = str3;
                                cVar.c = mediationInfo3;
                                cVar.d = metricsRecorder4;
                                cVar.e = objectRef3;
                                cVar.f = null;
                                cVar.g = z5;
                                cVar.h = i13;
                                cVar.i = i12;
                                cVar.m = 5;
                                str6 = str4;
                                if (DelayKt.delay(1000L, cVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i10 = i12;
                                cVar4 = cVar;
                                mediationInfo2 = mediationInfo3;
                                i3 = i13;
                                str2 = str3;
                                lVar2 = lVar3;
                                i2 = i10 + 1;
                                str4 = str6;
                                z2 = z5;
                                metricsRecorder2 = metricsRecorder4;
                                objectRef = objectRef3;
                                cVar2 = cVar4;
                                if (i2 < i3) {
                                    MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
                                    StringBuilder sb = new StringBuilder("Moloco SDK Init failed after all retries: ");
                                    Object obj2 = objectRef.element;
                                    if (obj2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("result");
                                        xVar4 = null;
                                    } else {
                                        xVar4 = (x) obj2;
                                    }
                                    MolocoLogger.info$default(molocoLogger3, m.f10822a, sb.append(xVar4).toString(), null, false, 12, null);
                                    T t6 = objectRef.element;
                                    if (t6 != 0) {
                                        return (x) t6;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("result");
                                    return null;
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                }
            }
        }
        lVar = this;
        cVar = lVar.new c(continuation);
        Object obj3 = cVar.k;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.m;
        String str42 = "async";
        if (i != 0) {
        }
    }
}

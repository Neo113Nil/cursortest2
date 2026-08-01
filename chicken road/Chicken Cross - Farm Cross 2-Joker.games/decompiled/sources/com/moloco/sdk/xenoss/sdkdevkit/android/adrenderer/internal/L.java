package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.internal.ortb.model.C4783f;
import com.moloco.sdk.internal.ortb.model.C4785h;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class L implements InterfaceC4812b {
    public static final int m = 8;

    /* renamed from: a, reason: collision with root package name */
    public final C4782e f10919a;
    public final CoroutineScope b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d c;
    public final InterfaceC4827m d;
    public final boolean e;
    public final MetricsRecorder f;
    public com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> g;
    public final MutableStateFlow<Boolean> h;
    public final StateFlow<Boolean> i;
    public Job j;
    public TimerEvent k;
    public String l;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$captureLoadMetrics$2", f = "VastAdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10920a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer e;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10920a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            L l = L.this;
            com.moloco.sdk.internal.utils.f fVar = com.moloco.sdk.internal.utils.f.f10854a;
            com.moloco.sdk.internal.utils.e a2 = fVar.a(this.c.j().j());
            l.l = (a2 == null || (e = a2.e()) == null) ? null : fVar.b(e.intValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1", f = "VastAdLoad.kt", i = {0}, l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 135}, m = "invokeSuspend", n = {"decDeferred"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10921a;
        public /* synthetic */ Object b;
        public final /* synthetic */ InterfaceC4812b.a d;
        public final /* synthetic */ long e;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1", f = "VastAdLoad.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C4823i>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10922a;
            public final /* synthetic */ long b;
            public final /* synthetic */ C4823i c;
            public final /* synthetic */ L d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$a$a, reason: collision with other inner class name */
            public static final class C1514a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C4823i>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f10923a;
                public final /* synthetic */ C4823i b;
                public final /* synthetic */ L c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1514a(C4823i c4823i, L l, Continuation<? super C1514a> continuation) {
                    super(2, continuation);
                    this.b = c4823i;
                    this.c = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C4823i> continuation) {
                    return ((C1514a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1514a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f10923a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C4823i c4823i = this.b;
                        if (c4823i == null) {
                            return null;
                        }
                        L l = this.c;
                        InterfaceC4827m interfaceC4827m = l.d;
                        C4783f ext = l.f10919a.getExt();
                        String mtid = ext != null ? ext.getMtid() : null;
                        this.f10923a = 1;
                        obj = interfaceC4827m.a(c4823i, mtid, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (C4823i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, C4823i c4823i, L l, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c4823i;
                this.d = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C4823i> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10922a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C1514a c1514a = new C1514a(this.c, this.d, null);
                    this.f10922a = 1;
                    obj = TimeoutKt.m9582withTimeoutOrNullKLykuaI(j, c1514a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                C4823i c4823i = (C4823i) obj;
                return c4823i == null ? this.c : c4823i;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1", f = "VastAdLoad.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$b, reason: collision with other inner class name */
        public static final class C1515b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10924a;
            public final /* synthetic */ long b;
            public final /* synthetic */ L c;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$fullLoad$1$vastAdDeferred$1$1", f = "VastAdLoad.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$b$b$a */
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f10925a;
                public final /* synthetic */ L b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(L l, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.b, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f10925a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar = this.b.c;
                        String adm = this.b.f10919a.getAdm();
                        String d = C4785h.d(this.b.f10919a);
                        this.f10925a = 1;
                        obj = dVar.a(adm, d, false, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1515b(long j, L l, Continuation<? super C1515b> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> continuation) {
                return ((C1515b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1515b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10924a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    a aVar = new a(this.c, null);
                    this.f10924a = 1;
                    obj = TimeoutKt.m9581withTimeoutKLykuaI(j, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4812b.a aVar, long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = aVar;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = L.this.new b(this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00fb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v7, types: [kotlinx.coroutines.Deferred] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Deferred async$default2;
            Object await;
            com.moloco.sdk.internal.ortb.model.n dec;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
            Object await2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a2;
            L l;
            InterfaceC4812b.a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.f10921a;
            try {
                if (r2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.b;
                    if (L.this.d() instanceof x.b) {
                        InterfaceC4812b.a aVar3 = this.d;
                        if (aVar3 != null) {
                            aVar3.a();
                        }
                        return Unit.INSTANCE;
                    }
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C1515b(this.e, L.this, null), 3, null);
                    com.moloco.sdk.internal.ortb.model.B player = L.this.f10919a.getExt().getPlayer();
                    async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a(this.e, (player == null || (dec = player.getDec()) == null) ? null : com.moloco.sdk.internal.l.a(dec), L.this, null), 3, null);
                    this.b = async$default2;
                    this.f10921a = 1;
                    await = async$default.await(this);
                    r2 = async$default2;
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            L.this.h.setValue(Boxing.boxBoolean(true));
                            aVar2 = this.d;
                            if (aVar2 != null) {
                                aVar2.a();
                            }
                            return Unit.INSTANCE;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) this.b;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar4;
                        await2 = obj;
                        a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C4823i) await2, 15, null);
                        L.this.a(new x.b(a2));
                        L l2 = L.this;
                        MetricsRecorder metricsRecorder = l2.f;
                        l2.k = metricsRecorder == null ? metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                        l = L.this;
                        this.b = null;
                        this.f10921a = 3;
                        if (l.a(a2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        L.this.h.setValue(Boxing.boxBoolean(true));
                        aVar2 = this.d;
                        if (aVar2 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferred = (Deferred) this.b;
                    ResultKt.throwOnFailure(obj);
                    await = obj;
                    r2 = deferred;
                }
                com.moloco.sdk.internal.x xVar = (com.moloco.sdk.internal.x) await;
                if (!(xVar instanceof x.b)) {
                    if (!(xVar instanceof x.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    L.this.a((Deferred<C4823i>) r2, this.d, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar).a());
                    return Unit.INSTANCE;
                }
                aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) xVar).a();
                this.b = aVar;
                this.f10921a = 2;
                await2 = r2.await(this);
                if (await2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C4823i) await2, 15, null);
                L.this.a(new x.b(a2));
                L l22 = L.this;
                MetricsRecorder metricsRecorder2 = l22.f;
                l22.k = metricsRecorder2 == null ? metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                l = L.this;
                this.b = null;
                this.f10921a = 3;
                if (l.a(a2, this) == coroutine_suspended) {
                }
                L.this.h.setValue(Boxing.boxBoolean(true));
                aVar2 = this.d;
                if (aVar2 != null) {
                }
                return Unit.INSTANCE;
            } catch (TimeoutCancellationException unused) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, M.f10929a, "main VAST ad didn't load due to timeout", false, 4, null);
                Job.DefaultImpls.cancel$default((Job) r2, (CancellationException) null, 1, (Object) null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.b;
                L.this.a(new x.a(aVar5));
                InterfaceC4812b.a aVar6 = this.d;
                if (aVar6 != null) {
                    aVar6.a(aVar5);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1", f = "VastAdLoad.kt", i = {0, 1, 1}, l = {158, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 175, 178}, m = "invokeSuspend", n = {"$this$launch", "vastAdDeferred", "decDeferred"}, s = {"L$0", "L$0", "L$1"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10926a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ InterfaceC4812b.a e;
        public final /* synthetic */ long f;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1", f = "VastAdLoad.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C4823i>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10927a;
            public final /* synthetic */ long b;
            public final /* synthetic */ C4823i c;
            public final /* synthetic */ L d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastAdLoad$streamedLoad$1$decDeferred$1$1", f = "VastAdLoad.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L$c$a$a, reason: collision with other inner class name */
            public static final class C1516a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C4823i>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f10928a;
                public final /* synthetic */ C4823i b;
                public final /* synthetic */ L c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1516a(C4823i c4823i, L l, Continuation<? super C1516a> continuation) {
                    super(2, continuation);
                    this.b = c4823i;
                    this.c = l;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C4823i> continuation) {
                    return ((C1516a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1516a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f10928a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        C4823i c4823i = this.b;
                        if (c4823i == null) {
                            return null;
                        }
                        L l = this.c;
                        InterfaceC4827m interfaceC4827m = l.d;
                        String mtid = l.f10919a.getExt().getMtid();
                        this.f10928a = 1;
                        obj = interfaceC4827m.a(c4823i, mtid, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (C4823i) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, C4823i c4823i, L l, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = c4823i;
                this.d = l;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C4823i> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10927a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.b;
                    C1516a c1516a = new C1516a(this.c, this.d, null);
                    this.f10927a = 1;
                    obj = TimeoutKt.m9582withTimeoutOrNullKLykuaI(j, c1516a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                C4823i c4823i = (C4823i) obj;
                return c4823i == null ? this.c : c4823i;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4812b.a aVar, long j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = L.this.new c(this.e, this.f, continuation);
            cVar.c = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x013d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0155  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object a2;
            Deferred async$default;
            Object a3;
            com.moloco.sdk.internal.x xVar;
            Deferred deferred;
            com.moloco.sdk.internal.ortb.model.n dec;
            com.moloco.sdk.internal.x xVar2;
            Object await;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a a4;
            L l;
            InterfaceC4812b.a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
                if (L.this.d() instanceof x.b) {
                    InterfaceC4812b.a aVar3 = this.e;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    return Unit.INSTANCE;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar = L.this.c;
                String adm = L.this.f10919a.getAdm();
                String d = C4785h.d(L.this.f10919a);
                this.c = coroutineScope;
                this.b = 1;
                a2 = dVar.a(adm, d, true, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            L.this.h.setValue(Boxing.boxBoolean(true));
                            aVar2 = this.e;
                            if (aVar2 != null) {
                                aVar2.a();
                            }
                            return Unit.INSTANCE;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) this.c;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar4;
                        await = obj;
                        a4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C4823i) await, 15, null);
                        L.this.a(new x.b(a4));
                        L l2 = L.this;
                        MetricsRecorder metricsRecorder = l2.f;
                        l2.k = metricsRecorder == null ? metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                        l = L.this;
                        this.c = null;
                        this.b = 4;
                        if (l.a(a4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        L.this.h.setValue(Boxing.boxBoolean(true));
                        aVar2 = this.e;
                        if (aVar2 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    deferred = (Deferred) this.f10926a;
                    com.moloco.sdk.internal.x xVar3 = (com.moloco.sdk.internal.x) this.c;
                    ResultKt.throwOnFailure(obj);
                    xVar = xVar3;
                    a3 = obj;
                    xVar2 = (com.moloco.sdk.internal.x) a3;
                    if (xVar2 instanceof x.b) {
                        if (!(xVar2 instanceof x.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, M.f10929a, "main VAST ad didn't load due to failure or timeout", false, 4, null);
                        x.a aVar5 = (x.a) xVar2;
                        if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k) aVar5.a()).d()) {
                            L.this.b(deferred, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) aVar5.a());
                        } else {
                            L.this.a((Deferred<C4823i>) deferred, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) aVar5.a());
                        }
                        return Unit.INSTANCE;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) xVar).a();
                    this.c = aVar6;
                    this.f10926a = null;
                    this.b = 3;
                    await = deferred.await(this);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = aVar6;
                    a4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a.a(aVar, null, null, null, null, (C4823i) await, 15, null);
                    L.this.a(new x.b(a4));
                    L l22 = L.this;
                    MetricsRecorder metricsRecorder2 = l22.f;
                    l22.k = metricsRecorder2 == null ? metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.w.c()) : null;
                    l = L.this;
                    this.c = null;
                    this.b = 4;
                    if (l.a(a4, this) == coroutine_suspended) {
                    }
                    L.this.h.setValue(Boxing.boxBoolean(true));
                    aVar2 = this.e;
                    if (aVar2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
                a2 = obj;
            }
            CoroutineScope coroutineScope2 = coroutineScope;
            com.moloco.sdk.internal.x xVar4 = (com.moloco.sdk.internal.x) a2;
            com.moloco.sdk.internal.ortb.model.B player = L.this.f10919a.getExt().getPlayer();
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new a(this.f, (player == null || (dec = player.getDec()) == null) ? null : com.moloco.sdk.internal.l.a(dec), L.this, null), 3, null);
            if (!(xVar4 instanceof x.b)) {
                if (!(xVar4 instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                L.this.a((Deferred<C4823i>) async$default, this.e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar4).a());
                return Unit.INSTANCE;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2 = L.this.c;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) xVar4).a();
            long j = this.f;
            this.c = xVar4;
            this.f10926a = async$default;
            this.b = 2;
            a3 = dVar2.a(aVar7, j, this);
            if (a3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            xVar = xVar4;
            deferred = async$default;
            xVar2 = (com.moloco.sdk.internal.x) a3;
            if (xVar2 instanceof x.b) {
            }
        }
    }

    public L(C4782e bid, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, InterfaceC4827m decLoader, boolean z, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        this.f10919a = bid;
        this.b = scope;
        this.c = loadVast;
        this.d = decLoader;
        this.e = z;
        this.f = metricsRecorder;
        this.g = new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f10976a);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public StateFlow<Boolean> isLoaded() {
        return this.i;
    }

    public final TimerEvent c() {
        return this.k;
    }

    public final com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d() {
        return this.g;
    }

    public final String b() {
        return this.l;
    }

    public final void c(long j, InterfaceC4812b.a aVar) {
        Job launch$default;
        Job job = this.j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new c(aVar, j, null), 3, null);
        this.j = launch$default;
    }

    public final void b(long j, InterfaceC4812b.a aVar) {
        Job launch$default;
        Job job = this.j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new b(aVar, j, null), 3, null);
        this.j = launch$default;
    }

    public final void a(com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.g = xVar;
    }

    public final void b(Deferred<C4823i> deferred, InterfaceC4812b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.b;
        this.g = new x.a(cVar);
        if (aVar != null) {
            aVar.a(aVar2);
        }
    }

    public final Integer a() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
        com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> xVar = this.g;
        x.b bVar = xVar instanceof x.b ? (x.b) xVar : null;
        if (bVar == null || (aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) bVar.a()) == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a2 = this.c.a(aVar.j().l());
        if (a2 instanceof c.a) {
            return 100;
        }
        if (a2 instanceof c.C1533c) {
            c.d d = ((c.C1533c) a2).d();
            if (d.d() > 0) {
                return Integer.valueOf((int) ((d.c() * 100) / d.d()));
            }
            return null;
        }
        if (a2 instanceof c.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ L(C4782e c4782e, CoroutineScope coroutineScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar, InterfaceC4827m interfaceC4827m, boolean z, MetricsRecorder metricsRecorder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4782e, coroutineScope, dVar, interfaceC4827m, z, (i & 32) != 0 ? null : metricsRecorder);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public void a(long j, InterfaceC4812b.a aVar) {
        if (this.e) {
            c(j, aVar);
        } else {
            b(j, aVar);
        }
    }

    public final void a(Deferred<C4823i> deferred, InterfaceC4812b.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, M.f10929a, "Vast AD failed to load: " + cVar, null, false, 12, null);
        Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
        this.g = new x.a(cVar);
        if (aVar != null) {
            aVar.a(cVar);
        }
    }

    public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new a(aVar, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}

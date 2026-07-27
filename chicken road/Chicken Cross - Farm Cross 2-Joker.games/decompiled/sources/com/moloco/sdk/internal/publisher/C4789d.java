package com.moloco.sdk.internal.publisher;

import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.a;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.internal.ortb.model.C4783f;
import com.moloco.sdk.internal.ortb.model.C4784g;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* renamed from: com.moloco.sdk.internal.publisher.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4789d implements AdLoad {
    public static final a p = new a(null);
    public static final int q = 8;

    @Deprecated
    public static final String r = "AdLoad";

    /* renamed from: a, reason: collision with root package name */
    public final Function1<Long, Duration> f10606a;
    public final String b;
    public final Function1<C4782e, InterfaceC4812b> c;
    public final com.moloco.sdk.internal.ortb.b d;
    public final q e;
    public final AdFormatType f;
    public final com.moloco.sdk.internal.services.K g;
    public final MetricsRecorder h;
    public final Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> i;
    public final CoroutineScope j;
    public boolean k;
    public String l;
    public C4784g m;
    public final TimerEvent n;
    public Job o;

    /* renamed from: com.moloco.sdk.internal.publisher.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$load$2", f = "AdLoad.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.d$b */
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10607a;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdLoad.Listener d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, AdLoad.Listener listener, long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = listener;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4789d.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C4783f ext;
            C4783f ext2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10607a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4789d c4789d = C4789d.this;
                String str = this.c;
                this.f10607a = 1;
                obj = c4789d.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str2 = (String) obj;
            if (str2 == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdLoadImpl", "Could not pre-process the bid response. Failing the load() call.", null, false, 12, null);
                AdLoad.Listener listener = this.d;
                if (listener != null) {
                    listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(C4789d.this.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR));
                }
                MetricsRecorder metricsRecorder = C4789d.this.h;
                TimerEvent withTag = C4789d.this.n.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
                String c = dVar.c();
                MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                TimerEvent withTag2 = withTag.withTag(c, String.valueOf(errorType.getErrorCode()));
                com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
                String c2 = dVar2.c();
                String name = C4789d.this.f.name();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                metricsRecorder.recordTimerEvent(withTag2.withTag(c2, lowerCase));
                MetricsRecorder metricsRecorder2 = C4789d.this.h;
                CountEvent withTag3 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.m.c()).withTag(dVar.c(), String.valueOf(errorType.getErrorCode()));
                String c3 = dVar2.c();
                String lowerCase2 = C4789d.this.f.name().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                metricsRecorder2.recordCountEvent(withTag3.withTag(c3, lowerCase2));
                return Unit.INSTANCE;
            }
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, C4789d.r, "Processed the bidResponse, proceeding with the load() call.", null, false, 12, null);
            z a2 = C4792g.a(this.d, C4789d.this.n, C4789d.this.f, C4789d.this.h, C4789d.this.i);
            if (Intrinsics.areEqual(C4789d.this.l, str2)) {
                if (C4789d.this.isLoaded()) {
                    com.moloco.sdk.internal.ortb.model.D d = null;
                    MolocoAd createAdInfo$default = MolocoAdKt.createAdInfo$default(C4789d.this.b, null, null, 6, null);
                    long j = this.e;
                    C4789d c4789d2 = C4789d.this;
                    C4782e a3 = c4789d2.a(c4789d2.m);
                    a2.a(createAdInfo$default, j, (a3 == null || (ext2 = a3.getExt()) == null) ? null : ext2.getSdkEvents());
                    C4789d c4789d3 = C4789d.this;
                    C4782e a4 = c4789d3.a(c4789d3.m);
                    if (a4 != null && (ext = a4.getExt()) != null) {
                        d = ext.getSdkEvents();
                    }
                    a2.a(createAdInfo$default, d);
                    return Unit.INSTANCE;
                }
                Job job = C4789d.this.o;
                if (job != null && job.isActive()) {
                    MolocoLogger.info$default(molocoLogger, C4789d.r, "Already loading ad " + C4789d.this.f + ' ' + C4789d.this.b + ". Returning", null, false, 12, null);
                    return Unit.INSTANCE;
                }
            }
            C4789d.this.a(str2, this.e, a2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl", f = "AdLoad.kt", i = {0}, l = {169}, m = "processBidResponse", n = {"bidResponseJson"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.d$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10608a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return C4789d.this.a((String) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1", f = "AdLoad.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.d$d, reason: collision with other inner class name */
    public static final class C1484d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10609a;
        public long b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ String f;
        public final /* synthetic */ z g;
        public final /* synthetic */ long h;

        /* renamed from: com.moloco.sdk.internal.publisher.d$d$a */
        public static final class a implements InterfaceC4812b.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C4789d f10610a;
            public final /* synthetic */ z b;
            public final /* synthetic */ C4782e c;

            @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoad$1", f = "AdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$a, reason: collision with other inner class name */
            public static final class C1485a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f10611a;
                public final /* synthetic */ C4789d b;
                public final /* synthetic */ z c;
                public final /* synthetic */ C4782e d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1485a(C4789d c4789d, z zVar, C4782e c4782e, Continuation<? super C1485a> continuation) {
                    super(2, continuation);
                    this.b = c4789d;
                    this.c = zVar;
                    this.d = c4782e;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C1485a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1485a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C4783f ext;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10611a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.k = true;
                    z zVar = this.c;
                    MolocoAd createAdInfo = MolocoAdKt.createAdInfo(this.b.b, Boxing.boxFloat(this.d.getPrice()), this.d.getCrid());
                    C4789d c4789d = this.b;
                    C4782e a2 = c4789d.a(c4789d.m);
                    zVar.a(createAdInfo, (a2 == null || (ext = a2.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadError$1", f = "AdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$b */
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f10612a;
                public final /* synthetic */ C4789d b;
                public final /* synthetic */ z c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C4789d c4789d, z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = c4789d;
                    this.c = zVar;
                    this.d = cVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C4783f ext;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10612a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.k = false;
                    z zVar = this.c;
                    com.moloco.sdk.internal.t a2 = com.moloco.sdk.internal.u.a(this.b.b, MolocoAdError.ErrorType.AD_LOAD_FAILED, this.d, null, 8, null);
                    C4789d c4789d = this.b;
                    C4782e a3 = c4789d.a(c4789d.m);
                    zVar.a(a2, (a3 == null || (ext = a3.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.INSTANCE;
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdLoadImpl$startLoadJob$1$2$onLoadTimeout$1", f = "AdLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.internal.publisher.d$d$a$c */
            public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f10613a;
                public final /* synthetic */ C4789d b;
                public final /* synthetic */ z c;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(C4789d c4789d, z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.b = c4789d;
                    this.c = zVar;
                    this.d = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C4783f ext;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10613a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.k = false;
                    z zVar = this.c;
                    com.moloco.sdk.internal.t a2 = com.moloco.sdk.internal.u.a(this.b.b, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, this.d, null, 8, null);
                    C4789d c4789d = this.b;
                    C4782e a3 = c4789d.a(c4789d.m);
                    zVar.a(a2, (a3 == null || (ext = a3.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.INSTANCE;
                }
            }

            public a(C4789d c4789d, z zVar, C4782e c4782e) {
                this.f10610a = c4789d;
                this.b = zVar;
                this.c = c4782e;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
            public void a() {
                BuildersKt__Builders_commonKt.launch$default(this.f10610a.j, null, null, new C1485a(this.f10610a, this.b, this.c, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                BuildersKt__Builders_commonKt.launch$default(this.f10610a.j, null, null, new c(this.f10610a, this.b, timeoutError, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                Intrinsics.checkNotNullParameter(internalError, "internalError");
                BuildersKt__Builders_commonKt.launch$default(this.f10610a.j, null, null, new b(this.f10610a, this.b, internalError, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1484d(String str, z zVar, long j, Continuation<? super C1484d> continuation) {
            super(2, continuation);
            this.f = str;
            this.g = zVar;
            this.h = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1484d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1484d c1484d = C4789d.this.new C1484d(this.f, this.g, this.h, continuation);
            c1484d.d = obj;
            return c1484d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0106, code lost:
        
            if (r4 != null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:
        
            if (r2 != null) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C4784g c4784g;
            C4789d c4789d;
            long j;
            Object a2;
            z zVar;
            C4782e a3;
            C4783f ext;
            C4783f ext2;
            String str;
            Map emptyMap;
            C4783f ext3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            com.moloco.sdk.internal.ortb.model.D d = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.d;
                C4789d.this.k = false;
                if (!Intrinsics.areEqual(C4789d.this.l, this.f)) {
                    C4789d.this.l = this.f;
                    C4789d.this.m = null;
                }
                c4784g = C4789d.this.m;
                if (c4784g == null) {
                    c4789d = C4789d.this;
                    String str2 = this.f;
                    z zVar2 = this.g;
                    j = this.h;
                    CoroutineScopeKt.ensureActive(coroutineScope);
                    com.moloco.sdk.internal.ortb.b bVar = c4789d.d;
                    this.d = c4789d;
                    this.f10609a = zVar2;
                    this.b = j;
                    this.c = 1;
                    a2 = bVar.a(str2, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zVar = zVar2;
                }
                a3 = c4784g == null ? C4789d.this.a(c4784g) : null;
                if (a3 != null) {
                    z zVar3 = this.g;
                    C4789d c4789d2 = C4789d.this;
                    com.moloco.sdk.internal.t a4 = com.moloco.sdk.internal.u.a(c4789d2.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.o.e, null, 8, null);
                    C4782e a5 = c4789d2.a(c4789d2.m);
                    if (a5 != null && (ext2 = a5.getExt()) != null) {
                        d = ext2.getSdkEvents();
                    }
                    zVar3.a(a4, d);
                    return Unit.INSTANCE;
                }
                com.moloco.sdk.internal.t a6 = C4790e.a(C4789d.this.f, a3, C4789d.this.b);
                if (a6 == null) {
                    ((InterfaceC4812b) C4789d.this.c.invoke(a3)).a(((Duration) C4789d.this.f10606a.invoke(Boxing.boxLong(this.h))).getRawValue(), new a(C4789d.this, this.g, a3));
                    return Unit.INSTANCE;
                }
                MolocoLogger.INSTANCE.error(C4789d.r, "Adaptive banner bid response missing required dimension fields: " + a6.d().get("missing_fields"), null, true);
                z zVar4 = this.g;
                C4789d c4789d3 = C4789d.this;
                C4782e a7 = c4789d3.a(c4789d3.m);
                if (a7 != null && (ext = a7.getExt()) != null) {
                    d = ext.getSdkEvents();
                }
                zVar4.a(a6, d);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.b;
            zVar = (z) this.f10609a;
            c4789d = (C4789d) this.d;
            ResultKt.throwOnFailure(obj);
            j = j2;
            a2 = obj;
            com.moloco.sdk.internal.x xVar = (com.moloco.sdk.internal.x) a2;
            if (!(xVar instanceof x.b)) {
                if (!(xVar instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                x.a aVar = (x.a) xVar;
                com.moloco.sdk.internal.o a8 = c4789d.a((com.moloco.sdk.internal.ortb.a) aVar.a());
                Object a9 = aVar.a();
                a.C1479a c1479a = a9 instanceof a.C1479a ? (a.C1479a) a9 : null;
                Exception b = c1479a != null ? c1479a.b() : null;
                Object a10 = aVar.a();
                a.b bVar2 = a10 instanceof a.b ? (a.b) a10 : null;
                List<String> b2 = bVar2 != null ? bVar2.b() : null;
                if (b2 != null) {
                    List<String> list = !b2.isEmpty() ? b2 : null;
                    if (list != null) {
                        str = CollectionsKt.joinToString$default(list, ",", " missingFields=", null, 0, null, null, 60, null);
                    }
                }
                str = "";
                MolocoLogger.error$default(MolocoLogger.INSTANCE, C4789d.r, "startLoadJob failed to parse BID json string. subType=" + a8 + str, b, false, 8, null);
                if (b2 != null) {
                    List<String> list2 = !b2.isEmpty() ? b2 : null;
                    if (list2 != null) {
                        String joinToString$default = CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null);
                        if (joinToString$default != null) {
                            emptyMap = MapsKt.mapOf(TuplesKt.to("missing_fields", joinToString$default));
                        }
                    }
                }
                emptyMap = MapsKt.emptyMap();
                zVar.a(com.moloco.sdk.internal.u.a(c4789d.b, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, a8, emptyMap), (com.moloco.sdk.internal.ortb.model.D) null);
                return Unit.INSTANCE;
            }
            C4784g c4784g2 = (C4784g) ((x.b) xVar).a();
            c4789d.m = c4784g2;
            MolocoAd createAdInfo$default = MolocoAdKt.createAdInfo$default(c4789d.b, null, null, 6, null);
            C4782e a11 = c4789d.a(c4789d.m);
            zVar.a(createAdInfo$default, j, (a11 == null || (ext3 = a11.getExt()) == null) ? null : ext3.getSdkEvents());
            c4784g = c4784g2;
            if (c4784g == null) {
            }
            if (a3 != null) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4789d(CoroutineScope scope, Function1<? super Long, Duration> timeout, String adUnitId, Function1<? super C4782e, ? extends InterfaceC4812b> recreateXenossAdLoader, com.moloco.sdk.internal.ortb.b parseBidResponse, q adLoadPreprocessor, AdFormatType adFormatType, com.moloco.sdk.internal.services.K webViewChecker, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        Intrinsics.checkNotNullParameter(parseBidResponse, "parseBidResponse");
        Intrinsics.checkNotNullParameter(adLoadPreprocessor, "adLoadPreprocessor");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10606a = timeout;
        this.b = adUnitId;
        this.c = recreateXenossAdLoader;
        this.d = parseBidResponse;
        this.e = adLoadPreprocessor;
        this.f = adFormatType;
        this.g = webViewChecker;
        this.h = metricsRecorder;
        this.i = function0;
        this.j = CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.n = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.j.c());
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(this.g.a());
        if (m8082exceptionOrNullimpl != null) {
            MolocoLogger.INSTANCE.error(r, "WebView Error: " + m8082exceptionOrNullimpl.getMessage(), m8082exceptionOrNullimpl, true);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(this.b, MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        long a2 = a.h.f10873a.i().a();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdLoadImpl", "load() called with bidResponseJson: " + bidResponseJson, false, 4, null);
        this.n.startTimer();
        MetricsRecorder metricsRecorder = this.h;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.k.c());
        String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.f.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(countEvent.withTag(c2, lowerCase));
        BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new b(bidResponseJson, listener, a2, null), 3, null);
    }

    public final C4782e a(C4784g c4784g) {
        List<com.moloco.sdk.internal.ortb.model.E> b2;
        com.moloco.sdk.internal.ortb.model.E e;
        List<C4782e> b3;
        if (c4784g == null || (b2 = c4784g.b()) == null || (e = b2.get(0)) == null || (b3 = e.b()) == null) {
            return null;
        }
        return b3.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation<? super String> continuation) {
        c cVar;
        int i;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    q qVar = this.e;
                    cVar.f10608a = str;
                    cVar.d = 1;
                    obj = qVar.a(str, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) cVar.f10608a;
                    ResultKt.throwOnFailure(obj);
                }
                String str2 = (String) obj;
                return str2 == null ? str2 : str;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        if (str22 == null) {
        }
    }

    public final void a(String str, long j, z zVar) {
        Job launch$default;
        Job job = this.o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new C1484d(str, zVar, j, null), 3, null);
        this.o = launch$default;
    }

    public final com.moloco.sdk.internal.o a(com.moloco.sdk.internal.ortb.a aVar) {
        if (aVar instanceof a.C1479a) {
            return com.moloco.sdk.internal.o.c;
        }
        if (aVar instanceof a.b) {
            return com.moloco.sdk.internal.o.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C4789d(CoroutineScope coroutineScope, Function1 function1, String str, Function1 function12, com.moloco.sdk.internal.ortb.b bVar, q qVar, AdFormatType adFormatType, com.moloco.sdk.internal.services.K k, MetricsRecorder metricsRecorder, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, function1, str, function12, bVar, qVar, adFormatType, k, metricsRecorder, (i & 512) != 0 ? null : function0);
    }
}

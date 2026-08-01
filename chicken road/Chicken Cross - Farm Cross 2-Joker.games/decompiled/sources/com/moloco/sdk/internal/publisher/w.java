package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4780c;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.internal.ortb.model.C4783f;
import com.moloco.sdk.internal.publisher.A;
import com.moloco.sdk.internal.publisher.w;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4811a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4822h;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class w<T extends AdShowListener> implements FullscreenAd<T>, s {
    public static final a u = new a(null);
    public static final int v = 8;
    public static final String w = "FullscreenAdImpl";

    /* renamed from: a, reason: collision with root package name */
    public final Context f10690a;
    public final InterfaceC4805f b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;
    public final String d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;
    public final Function1<com.moloco.sdk.internal.ortb.model.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> g;
    public final v<T> h;
    public final AdFormatType i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z j;
    public final C4786a k;
    public final MetricsRecorder l;
    public final CoroutineScope m;
    public final TimerEvent n;
    public TimerEvent o;
    public final AdLoad p;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i q;
    public C4780c r;
    public Function1<? super Boolean, Unit> s;
    public Function0<Unit> t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<C4782e, InterfaceC4812b> {
        public b(Object obj) {
            super(1, obj, w.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4812b invoke(C4782e p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((w) this.receiver).a(p0);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1", f = "FullscreenAdImpl.kt", i = {}, l = {280, 282}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10691a;
        public final /* synthetic */ InterfaceC4811a b;
        public final /* synthetic */ A c;
        public final /* synthetic */ w<T> d;

        @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1$1", f = "FullscreenAdImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10692a;
            public /* synthetic */ boolean b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            public final Object a(boolean z, Continuation<? super Boolean> continuation) {
                return ((a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10692a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$listenToAdDisplayState$1$1$2", f = "FullscreenAdImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10693a;
            public /* synthetic */ boolean b;

            public b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            public final Object a(boolean z, Continuation<? super Boolean> continuation) {
                return ((b) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(continuation);
                bVar.b = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10693a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(!this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC4811a interfaceC4811a, A a2, w<? super T> wVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = interfaceC4811a;
            this.c = a2;
            this.d = wVar;
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

        /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10691a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> l = this.b.l();
                a aVar = new a(null);
                this.f10691a = 1;
                if (FlowKt.first(l, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    a2 = this.c;
                    if (a2 != null) {
                        a2.onAdHidden(MolocoAdKt.createAdInfo$default(this.d.d, null, null, 6, null));
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            A a3 = this.c;
            if (a3 != null) {
                A.a.a(a3, MolocoAdKt.createAdInfo$default(this.d.d, null, null, 6, null), null, 2, null);
            }
            StateFlow<Boolean> l2 = this.b.l();
            b bVar = new b(null);
            this.f10691a = 2;
            if (FlowKt.first(l2, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            a2 = this.c;
            if (a2 != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$load$1", f = "FullscreenAdImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10694a;
        public final /* synthetic */ w<T> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdLoad.Listener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(w<? super T> wVar, String str, AdLoad.Listener listener, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = wVar;
            this.c = str;
            this.d = listener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10694a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.p.load(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    public static final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w<T> f10696a;
        public final /* synthetic */ A b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(w<? super T> wVar, A a2) {
            this.f10696a = wVar;
            this.b = a2;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            w<T> wVar = this.f10696a;
            wVar.a(com.moloco.sdk.internal.u.a(wVar.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            A a2 = this.b;
            if (a2 != null) {
                a2.onAdClicked(MolocoAdKt.createAdInfo$default(this.f10696a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, w.w, "Template ad skip button shown, triggering reward callback", null, false, 12, null);
            Function0<Unit> c = this.f10696a.c();
            if (c != null) {
                c.invoke();
            }
            A a2 = this.b;
            if (a2 != null) {
                a2.a();
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.FullscreenAdImpl$show$2", f = "FullscreenAdImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10697a;
        public final /* synthetic */ T b;
        public final /* synthetic */ w<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(T t, w<? super T> wVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = t;
            this.c = wVar;
        }

        public static final C4796k b(w wVar) {
            return wVar.a();
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j c(w wVar) {
            return wVar.b();
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10697a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC4811a interfaceC4811a = null;
            if (this.b != null) {
                v vVar = this.c.h;
                T t = this.b;
                InterfaceC4805f interfaceC4805f = this.c.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = this.c.c;
                final w<T> wVar = this.c;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.internal.publisher.w$g$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.g.a(w.this);
                    }
                };
                final w<T> wVar2 = this.c;
                Function0 function02 = new Function0() { // from class: com.moloco.sdk.internal.publisher.w$g$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.g.b(w.this);
                    }
                };
                AdFormatType adFormatType = this.c.i;
                MetricsRecorder metricsRecorder = this.c.l;
                final w<T> wVar3 = this.c;
                vVar.a(new E(t, interfaceC4805f, aVar, function0, function02, adFormatType, metricsRecorder, new Function0() { // from class: com.moloco.sdk.internal.publisher.w$g$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.g.c(w.this);
                    }
                }));
            } else {
                this.c.h.a((A) null);
            }
            A d = this.c.h.d();
            if (this.c.h.a() instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> a2 = this.c.h.a();
                if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w) {
                    interfaceC4811a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w) a2;
                }
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> a3 = this.c.h.a();
                if (a3 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) {
                    interfaceC4811a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) a3;
                }
            }
            if (interfaceC4811a == null || !this.c.isLoaded()) {
                if (d != null) {
                    d.a(com.moloco.sdk.internal.u.a(this.c.d, MolocoAdError.ErrorType.AD_SHOW_ERROR_NOT_LOADED, com.moloco.sdk.internal.o.f, null, 8, null));
                }
                return Unit.INSTANCE;
            }
            if (interfaceC4811a.l().getValue().booleanValue()) {
                if (d != null) {
                    d.a(com.moloco.sdk.internal.u.a(this.c.d, MolocoAdError.ErrorType.AD_SHOW_ERROR_ALREADY_DISPLAYING, com.moloco.sdk.internal.o.g, null, 8, null));
                }
                return Unit.INSTANCE;
            }
            this.c.a(interfaceC4811a, d);
            if (interfaceC4811a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w) interfaceC4811a).a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u) this.c.b(d));
            } else if (interfaceC4811a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) interfaceC4811a).a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) this.c.q, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) this.c.a(d));
            }
            return Unit.INSTANCE;
        }

        public static final com.moloco.sdk.internal.ortb.model.D a(w wVar) {
            return wVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(Context context, InterfaceC4805f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, Function1<? super com.moloco.sdk.internal.ortb.model.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> generateAggregatedOptions, v<T> adDataHolder, AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(generateAggregatedOptions, "generateAggregatedOptions");
        Intrinsics.checkNotNullParameter(adDataHolder, "adDataHolder");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10690a = context;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = adUnitId;
        this.e = persistentHttpRequest;
        this.f = externalLinkHandler;
        this.g = generateAggregatedOptions;
        this.h = adDataHolder;
        this.i = adFormatType;
        this.j = watermark;
        this.k = adCreateLoadTimeoutManager;
        this.l = metricsRecorder;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.m = CoroutineScope;
        TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.n = startTimerEvent.withTag(c2, lowerCase);
        this.p = C4790e.a(CoroutineScope, new Function1() { // from class: com.moloco.sdk.internal.publisher.w$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w.a(w.this, ((Long) obj).longValue());
            }
        }, adUnitId, new b(this), adFormatType, a.C1507a.f10866a.b(), metricsRecorder, new Function0() { // from class: com.moloco.sdk.internal.publisher.w$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w.k(w.this);
            }
        });
        this.q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) generateAggregatedOptions.invoke(null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j k(w wVar) {
        return wVar.b();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j, long j2) {
        this.k.a(j, j2);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.m, null, 1, null);
        a(this, null, 1, null);
        this.s = null;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    public long mo7561getCreateAdObjectDurationUwyO8pc() {
        return this.k.mo7561getCreateAdObjectDurationUwyO8pc();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.p.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.l.recordTimerEvent(this.n);
        this.o = this.l.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.p.c());
        BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new d(this, bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    public void mo7562setCreateAdObjectDurationLRDsOJo(long j) {
        this.k.mo7562setCreateAdObjectDurationLRDsOJo(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // com.moloco.sdk.publisher.FullscreenAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void show(T t) {
        String lowerCase;
        String name;
        TimerEvent timerEvent = this.o;
        if (timerEvent != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j b2 = b();
            if (b2 != null && (name = b2.name()) != null) {
                lowerCase = name.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.g.toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            MetricsRecorder metricsRecorder = this.l;
            String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
            String lowerCase2 = this.i.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            metricsRecorder.recordTimerEvent(timerEvent.withTag(c2, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
        }
        MetricsRecorder metricsRecorder2 = this.l;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.A.c());
        String c3 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase3 = this.i.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        metricsRecorder2.recordCountEvent(countEvent.withTag(c3, lowerCase3));
        BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new g(t, this, null), 3, null);
    }

    public final Function0<Unit> c() {
        return this.t;
    }

    public final com.moloco.sdk.internal.ortb.model.D d() {
        return this.h.e();
    }

    public final Function1<Boolean, Unit> e() {
        return this.s;
    }

    public final Boolean f() {
        StateFlow<Boolean> k;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> a2 = this.h.a();
        if (a2 == null || (k = a2.k()) == null) {
            return null;
        }
        return k.getValue();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j b() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> a2 = this.h.a();
        if (a2 != null) {
            return a2.getCreativeType();
        }
        return null;
    }

    public final f b(A a2) {
        return new f(this, a2);
    }

    public final C4796k a() {
        return this.h.c();
    }

    public static /* synthetic */ void a(w wVar, com.moloco.sdk.internal.t tVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tVar = null;
        }
        wVar.a(tVar);
    }

    public static final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w<T> f10695a;
        public final /* synthetic */ A b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(w<? super T> wVar, A a2) {
            this.f10695a = wVar;
            this.b = a2;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x
        public void a(boolean z) {
            String eventLink;
            C4780c c4780c = this.f10695a.r;
            if (c4780c != null) {
                w<T> wVar = this.f10695a;
                if (c4780c.getEnabled() && ((!z || c4780c.getOnSkip()) && (eventLink = c4780c.getEventLink()) != null)) {
                    wVar.e.a(eventLink);
                }
            }
            Function1<Boolean, Unit> e = this.f10695a.e();
            if (e != null) {
                e.invoke(Boolean.valueOf(z));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            A a2 = this.b;
            if (a2 != null) {
                a2.onAdClicked(MolocoAdKt.createAdInfo$default(this.f10695a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, w.w, "Ad skip button shown, triggering callback", null, false, 12, null);
            Function0<Unit> c = this.f10695a.c();
            if (c != null) {
                c.invoke();
            }
            A a2 = this.b;
            if (a2 != null) {
                a2.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            w<T> wVar = this.f10695a;
            wVar.a(com.moloco.sdk.internal.u.a(wVar.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.moloco.sdk.internal.t tVar) {
        StateFlow<Boolean> l;
        v<T> vVar = this.h;
        Job b2 = vVar.b();
        if (b2 != null) {
            Job.DefaultImpls.cancel$default(b2, (CancellationException) null, 1, (Object) null);
        }
        vVar.a((Job) null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> a2 = this.h.a();
        boolean z = (a2 == null || (l = a2.l()) == null || !l.getValue().booleanValue()) ? false : true;
        v<T> vVar2 = this.h;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> a3 = vVar2.a();
        if (a3 != null) {
            a3.destroy();
        }
        vVar2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?>) null);
        v<T> vVar3 = this.h;
        A d2 = vVar3.d();
        vVar3.a((A) null);
        if (tVar != null && d2 != null) {
            d2.a(tVar);
        }
        if (z && d2 != null) {
            d2.onAdHidden(MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        }
        this.h.a((com.moloco.sdk.internal.ortb.model.D) null);
        this.h.a((C4796k) null);
    }

    public static final Duration a(w wVar, long j) {
        return Duration.m9424boximpl(wVar.k.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC4812b a(C4782e c4782e) {
        com.moloco.sdk.internal.ortb.model.B player;
        com.moloco.sdk.internal.ortb.model.u experimental;
        Boolean serverRenderingIgnoreNetErrFailed;
        boolean z = true;
        a(this, null, 1, null);
        com.moloco.sdk.internal.ortb.model.z zVar = c4782e.getExt().getCom.ironsource.c8.p java.lang.String();
        if (zVar != null ? Intrinsics.areEqual(zVar.getServerRenderingEnabled(), Boolean.TRUE) : false) {
            com.moloco.sdk.internal.ortb.model.z zVar2 = c4782e.getExt().getCom.ironsource.c8.p java.lang.String();
            if (zVar2 != null && (experimental = zVar2.getExperimental()) != null && (serverRenderingIgnoreNetErrFailed = experimental.getServerRenderingIgnoreNetErrFailed()) != null) {
                z = serverRenderingIgnoreNetErrFailed.booleanValue();
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.a(this.f10690a, c4782e.getAdm(), new com.moloco.sdk.internal.services.t(this.f, this.c), this.j, this.l, z, u.a(c4782e, C4822h.f10984a.c(c4782e.getAdm())));
            v<T> vVar = this.h;
            vVar.a(a2);
            C4783f ext = c4782e.getExt();
            vVar.a(ext != null ? ext.getSdkEvents() : null);
            vVar.a(c4782e.getCom.ironsource.o2.y java.lang.String() != null ? new C4796k(c4782e.getCom.ironsource.o2.y java.lang.String(), Float.valueOf(c4782e.getPrice())) : null);
            return a2;
        }
        Function1<com.moloco.sdk.internal.ortb.model.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function1 = this.g;
        C4783f ext2 = c4782e.getExt();
        this.q = function1.invoke(ext2 != null ? ext2.getPlayer() : null);
        C4783f ext3 = c4782e.getExt();
        this.r = (ext3 == null || (player = ext3.getPlayer()) == null) ? null : player.getAutoStore();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<?, ?> a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.a(this.f10690a, this.c, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j) null, c4782e, this.f, this.j, this.l, 4, (Object) null);
        v<T> vVar2 = this.h;
        vVar2.a(a3);
        C4783f ext4 = c4782e.getExt();
        vVar2.a(ext4 != null ? ext4.getSdkEvents() : null);
        vVar2.a(c4782e.getCom.ironsource.o2.y java.lang.String() != null ? new C4796k(c4782e.getCom.ironsource.o2.y java.lang.String(), Float.valueOf(c4782e.getPrice())) : null);
        return a3;
    }

    public final void a(InterfaceC4811a interfaceC4811a, A a2) {
        Job launch$default;
        v<T> vVar = this.h;
        Job b2 = vVar.b();
        if (b2 != null) {
            Job.DefaultImpls.cancel$default(b2, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.m, null, null, new c(interfaceC4811a, a2, this, null), 3, null);
        vVar.a(launch$default);
    }

    public final void a(Function1<? super Boolean, Unit> function1) {
        this.s = function1;
    }

    public final void a(Function0<Unit> function0) {
        this.t = function0;
    }

    public final e a(A a2) {
        return new e(this, a2);
    }

    public /* synthetic */ w(Context context, InterfaceC4805f interfaceC4805f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function1 function1, v vVar, AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, MetricsRecorder metricsRecorder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC4805f, aVar, str, iVar, rVar, function1, (i & 128) != 0 ? new v(null, null, null, null, null, 31, null) : vVar, adFormatType, zVar, c4786a, metricsRecorder);
    }
}

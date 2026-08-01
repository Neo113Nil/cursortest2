package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class J implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w {
    public static final a s = new a(null);
    public static final int t = 8;
    public static final String u = "TemplateFullscreenAd";

    /* renamed from: a, reason: collision with root package name */
    public final Context f10908a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z b;
    public final r c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i d;
    public final MetricsRecorder e;
    public final CoroutineScope f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j k;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c l;
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a n;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j o;
    public final MutableStateFlow<Boolean> p;
    public final Lazy q;
    public final MutableStateFlow<Boolean> r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$isAdDisplaying$2$1", f = "TemplateFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10909a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            b bVar = new b(continuation);
            bVar.b = z;
            bVar.c = z2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10909a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            boolean z2 = this.c;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, J.u, "isAdDisplaying final: " + (z && z2) + ", _isAdDisplaying: " + z + ", webViewIsDisplaying: " + z2, null, false, 12, null);
            return Boxing.boxBoolean(z && z2);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1", f = "TemplateFullscreenAd.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10910a;
        public /* synthetic */ Object b;
        public final /* synthetic */ d d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$1", f = "TemplateFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10911a;
            public final /* synthetic */ List<Job> b;
            public final /* synthetic */ J c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends Job> list, J j, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = list;
                this.c = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return ((a) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10911a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Iterator<T> it = this.b.iterator();
                while (it.hasNext()) {
                    Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, J.u, "Calling close()", null, false, 12, null);
                FullscreenWebviewActivity.INSTANCE.a();
                Handler handler = new Handler(Looper.getMainLooper());
                final J j = this.c;
                handler.postDelayed(new Runnable() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$c$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        J.c.a.a(J.this);
                    }
                }, 1000L);
                return Unit.INSTANCE;
            }

            public static final void a(J j) {
                j.destroy();
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$1", f = "TemplateFullscreenAd.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10912a;
            public final /* synthetic */ J b;
            public final /* synthetic */ d c;

            public static final class a<T> implements FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ d f10913a;

                public a(d dVar) {
                    this.f10913a = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                    this.f10913a.b();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(J j, d dVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10912a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow<Unit> c = this.b.i.c();
                    a aVar = new a(this.c);
                    this.f10912a = 1;
                    if (c.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$2", f = "TemplateFullscreenAd.kt", i = {}, l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$c$c, reason: collision with other inner class name */
        public static final class C1513c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10914a;
            public final /* synthetic */ J b;
            public final /* synthetic */ d c;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$c$c$a */
            public static final class a<T> implements FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ d f10915a;

                public a(d dVar) {
                    this.f10915a = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                    this.f10915a.a();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1513c(J j, d dVar, Continuation<? super C1513c> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C1513c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1513c(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10914a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Unit> c = this.b.k.c();
                    a aVar = new a(this.c);
                    this.f10914a = 1;
                    if (c.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.TemplateFullscreenAdImpl$show$1$eventHandlers$3", f = "TemplateFullscreenAd.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10916a;
            public final /* synthetic */ J b;
            public final /* synthetic */ d c;

            public static final class a<T> implements FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ d f10917a;

                public a(d dVar) {
                    this.f10917a = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                    this.f10917a.a();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(J j, d dVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = j;
                this.c = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10916a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Unit> c = this.b.l.c();
                    a aVar = new a(this.c);
                    this.f10916a = 1;
                    if (c.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d dVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = J.this.new c(this.d, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Job launch$default;
            Job launch$default2;
            Job launch$default3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10910a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(J.this, this.d, null), 3, null);
                launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1513c(J.this, this.d, null), 3, null);
                launch$default3 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new d(J.this, this.d, null), 3, null);
                List listOf = CollectionsKt.listOf((Object[]) new Job[]{launch$default, launch$default2, launch$default3});
                SharedFlow<Unit> c = J.this.g.c();
                a aVar = new a(listOf, J.this, null);
                this.f10910a = 1;
                if (FlowKt.collectLatest(c, aVar, this) == coroutine_suspended) {
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

    public J(Context context, String adm, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10908a = context;
        this.b = watermark;
        this.c = externalLinkHandler;
        this.d = persistentHttpRequest;
        this.e = metricsRecorder;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.f = CoroutineScope;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d(CoroutineScope);
        this.g = dVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i(CoroutineScope);
        this.h = iVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b(clickthroughService, CoroutineScope);
        this.i = bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h(CoroutineScope);
        this.j = hVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j jVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j(CoroutineScope);
        this.k = jVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(CoroutineScope);
        this.l = cVar;
        Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> of = SetsKt.setOf((Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a[]{dVar, bVar, iVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(metricsRecorder), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g(externalLinkHandler), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f(persistentHttpRequest), hVar, jVar, cVar});
        this.m = of;
        this.n = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(context, adm, of, bVar, iVar, hVar, metricsRecorder, z, aVar);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j c2 = C4822h.f10984a.c(adm);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, u, "Template ad resolved creativeType: " + c2, false, 4, null);
        this.o = c2;
        Boolean bool = Boolean.FALSE;
        this.p = StateFlowKt.MutableStateFlow(bool);
        this.q = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return J.e(J.this);
            }
        });
        this.r = StateFlowKt.MutableStateFlow(bool);
    }

    public static final StateFlow e(J j) {
        return FlowKt.stateIn(FlowKt.flowCombine(j.p, j.n.l(), new b(null)), j.f, SharingStarted.INSTANCE.getEagerly(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "destroy called", null, false, 12, null);
        this.n.destroy();
        FullscreenWebviewActivity.INSTANCE.a();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j getCreativeType() {
        return this.o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public StateFlow<Boolean> isLoaded() {
        return this.n.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public StateFlow<Boolean> k() {
        return this.r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4811a
    public StateFlow<Boolean> l() {
        return (StateFlow) this.q.getValue();
    }

    public static final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v f10918a;
        public final /* synthetic */ J b;

        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, J j) {
            this.f10918a = vVar;
            this.b = j;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = this.f10918a;
            if (vVar != null) {
                vVar.a(internalShowError);
            }
            this.b.destroy();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = this.f10918a;
            if (vVar != null) {
                vVar.b();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, J.u, "Skip button shown, triggering listener callback", null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = this.f10918a;
            if (vVar != null) {
                vVar.a();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar) {
        Intrinsics.checkNotNullParameter(options, "options");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "fullscreen ad show called", null, false, 12, null);
        d dVar = new d(vVar, this);
        this.b.a(this.n.q());
        this.n.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) dVar);
        try {
            FullscreenWebviewActivity.INSTANCE.a(this.f10908a, this.p, this.n, this.e, this.r);
            BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new c(dVar, null), 3, null);
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 36 && (e instanceof UndeclaredThrowableException)) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, u, "Android16BetaFix - Prevented system-level NPE during startActivity", e, false, 8, null);
                dVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.h);
            } else {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, u, "Failed to start fullscreen activity", e, false, 8, null);
                throw e;
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public void a(long j, InterfaceC4812b.a aVar) {
        this.n.a(j, aVar);
    }

    public /* synthetic */ J(Context context, String str, com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, sVar, zVar, rVar, iVar, metricsRecorder, (i & 128) != 0 ? true : z, (i & 256) != 0 ? null : aVar);
    }
}

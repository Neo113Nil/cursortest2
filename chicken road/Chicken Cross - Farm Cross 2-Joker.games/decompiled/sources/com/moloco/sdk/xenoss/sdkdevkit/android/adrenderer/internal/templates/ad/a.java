package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class a implements t<v> {
    public static final C1544a p = new C1544a(null);
    public static final int q = 8;
    public static final String r = "WebviewAd";

    /* renamed from: a, reason: collision with root package name */
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> f11075a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b b;
    public final i c;
    public final h d;
    public final MetricsRecorder e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a f;
    public final CoroutineScope g;
    public final e h;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a k;
    public final Lazy l;
    public final MutableStateFlow<Boolean> m;
    public final Lazy n;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a o;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$a, reason: collision with other inner class name */
    public static final class C1544a {
        public /* synthetic */ C1544a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1544a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$isAdDisplaying$2$1", f = "WebviewAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11076a;
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
            if (this.f11076a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$show$1", f = "WebviewAd.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11078a;
        public final /* synthetic */ v c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.WebviewAd$show$1$error$1", f = "WebviewAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$d$a, reason: collision with other inner class name */
        public static final class C1545a extends SuspendLambda implements Function2<l, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f11079a;
            public /* synthetic */ Object b;

            public C1545a(Continuation<? super C1545a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l lVar, Continuation<? super Boolean> continuation) {
                return ((C1545a) create(lVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1545a c1545a = new C1545a(continuation);
                c1545a.b = obj;
                return c1545a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11079a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((l) this.b) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v vVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11078a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a.this.m.setValue(Boxing.boxBoolean(true));
                MolocoLogger.info$default(MolocoLogger.INSTANCE, a.r, "Ad show called, isAdDisplaying: " + ((Boolean) a.this.m.getValue()).booleanValue(), null, false, 12, null);
                StateFlow<l> unrecoverableError = a.this.q().getUnrecoverableError();
                C1545a c1545a = new C1545a(null);
                this.f11078a = 1;
                obj = FlowKt.first(unrecoverableError, c1545a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            l lVar = (l) obj;
            if (lVar != null) {
                v vVar = this.c;
                MolocoLogger.error$default(MolocoLogger.INSTANCE, a.r, "Ad show error: " + lVar, null, false, 12, null);
                vVar.a(lVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, final String adm, Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> eventHandlers, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b clickthroughEventHandler, i contentLoadedHandler, h playListItemDisplayingEventHandler, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(clickthroughEventHandler, "clickthroughEventHandler");
        Intrinsics.checkNotNullParameter(contentLoadedHandler, "contentLoadedHandler");
        Intrinsics.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f11075a = eventHandlers;
        this.b = clickthroughEventHandler;
        this.c = contentLoadedHandler;
        this.d = playListItemDisplayingEventHandler;
        this.e = metricsRecorder;
        this.f = aVar;
        this.g = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        e eVar = new e(eventHandlers, metricsRecorder);
        this.h = eVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c(context, contentLoadedHandler, playListItemDisplayingEventHandler, metricsRecorder, z, null, 32, null);
        cVar.addJavascriptInterface(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b(eVar), "AndroidTemplateBridge");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b(context, cVar, clickthroughEventHandler);
        this.i = bVar;
        bVar.b();
        this.j = cVar;
        this.k = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(cVar, metricsRecorder);
        this.l = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a(adm, this);
            }
        });
        this.m = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.n = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.c(a.this);
            }
        });
        this.o = k();
    }

    public static final StateFlow c(a aVar) {
        return FlowKt.stateIn(FlowKt.flowCombine(aVar.m, aVar.j.a(), new b(null)), aVar.g, SharingStarted.INSTANCE.getEagerly(), Boolean.FALSE);
    }

    public static Object d(a aVar) {
        return Reflection.property0(new PropertyReference0Impl(aVar.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> A() {
        return this.j.getOrientation$moloco_sdk_release();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, r, "Ad destroy called", null, false, 12, null);
        this.m.setValue(Boolean.FALSE);
        this.i.remove();
        this.j.destroy();
        CoroutineScopeKt.cancel$default(this.g, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public StateFlow<Boolean> isLoaded() {
        return this.o.isLoaded();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a k() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a) this.l.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4811a
    public StateFlow<Boolean> l() {
        return (StateFlow) this.n.getValue();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a o() {
        return this.i;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c q() {
        return this.j;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a v() {
        return this.k;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.i = aVar;
    }

    public static final class c implements InterfaceC4812b.a {
        public final /* synthetic */ InterfaceC4812b.a b;

        public c(InterfaceC4812b.a aVar) {
            this.b = aVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
        public void a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, a.r, "Ad load successful, start collecting playlist item displaying events", null, false, 12, null);
            a.this.q().a(a.this.o(), a.this.f);
            InterfaceC4812b.a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
            Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
            InterfaceC4812b.a aVar = this.b;
            if (aVar != null) {
                aVar.a(timeoutError);
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b.a
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
            Intrinsics.checkNotNullParameter(internalError, "internalError");
            InterfaceC4812b.a aVar = this.b;
            if (aVar != null) {
                aVar.a(internalError);
            }
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a a(String str, a aVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a(str, aVar.g, aVar.j);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void a(v listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new d(listener, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public void a(long j, InterfaceC4812b.a aVar) {
        k().a(j, new c(aVar));
    }

    public /* synthetic */ a(Context context, String str, Set set, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar, i iVar, h hVar, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, set, bVar, iVar, hVar, metricsRecorder, (i & 128) != 0 ? true : z, (i & 256) != 0 ? null : aVar);
    }
}

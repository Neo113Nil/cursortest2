package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.google.zxing.pdf417.PDF417Common;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class G implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10901a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z b;
    public final MetricsRecorder c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j d;
    public final CoroutineScope e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f;
    public final E g;
    public final MutableStateFlow<Boolean> h;
    public final Lazy i;
    public final MutableStateFlow<Boolean> j;
    public final StateFlow<Boolean> k;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$isAdDisplaying$2$1", f = "StaticFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10902a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            a aVar = new a(continuation);
            aVar.b = z;
            aVar.c = z2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10902a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1", f = "StaticFullscreenAd.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"eventHandlers"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10903a;
        public /* synthetic */ Object b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e e;

        public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
            public a(Object obj) {
                super(0, obj, G.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((G) this.receiver).o();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1$eventHandlers$1", f = "StaticFullscreenAd.kt", i = {}, l = {PDF417Common.MAX_ROWS_IN_BARCODE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G$b$b, reason: collision with other inner class name */
        public static final class C1512b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10904a;
            public final /* synthetic */ G b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e c;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1$eventHandlers$1$error$1", f = "StaticFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G$b$b$a */
            public static final class a extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, Continuation<? super Boolean>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f10905a;
                public /* synthetic */ Object b;

                public a(Continuation<? super a> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation<? super Boolean> continuation) {
                    return ((a) create(gVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(continuation);
                    aVar.b = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10905a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.b) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1512b(G g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar, Continuation<? super C1512b> continuation) {
                super(2, continuation);
                this.b = g;
                this.c = eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C1512b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1512b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10904a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> unrecoverableError = this.b.f.getUnrecoverableError();
                    a aVar = new a(null);
                    this.f10904a = 1;
                    obj = FlowKt.first(unrecoverableError, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
                if (gVar != null && (eVar = this.c) != null) {
                    eVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.b(gVar));
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1$eventHandlers$2", f = "StaticFullscreenAd.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10906a;
            public final /* synthetic */ G b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e c;

            public static final class a<T> implements FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e f10907a;

                public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
                    this.f10907a = eVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.f10907a;
                    if (eVar != null) {
                        eVar.b();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(G g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = g;
                this.c = eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10906a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Unit> clickthroughEvent = this.b.f.getClickthroughEvent();
                    a aVar = new a(this.c);
                    this.f10906a = 1;
                    if (clickthroughEvent.collect(aVar, this) == coroutine_suspended) {
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
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = fVar;
            this.e = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = G.this.new b(this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00d8 A[LOOP:1: B:18:0x00d2->B:20:0x00d8, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Job launch$default;
            Job launch$default2;
            List list;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10903a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1512b(G.this, this.e, null), 3, null);
                launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(G.this, this.e, null), 3, null);
                List listOf = CollectionsKt.listOf((Object[]) new Job[]{launch$default, launch$default2});
                try {
                    G.this.h.setValue(Boxing.boxBoolean(true));
                    StaticAdActivity.Companion companion = StaticAdActivity.INSTANCE;
                    Context context = G.this.f10901a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = G.this.f;
                    a aVar2 = new a(G.this);
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.e;
                    Function0<Unit> function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G$b$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return G.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this);
                        }
                    };
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar = this.d;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar = G.this.b;
                    MetricsRecorder metricsRecorder = G.this.c;
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar2 = this.e;
                    Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G$b$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return G.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj2);
                        }
                    };
                    this.b = listOf;
                    this.f10903a = 1;
                    if (companion.a(context, aVar, aVar2, function0, fVar, zVar, metricsRecorder, function1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = listOf;
                } catch (Throwable th) {
                    th = th;
                    list = listOf;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    G.this.h.setValue(Boxing.boxBoolean(false));
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.b;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    it = list.iterator();
                    while (it.hasNext()) {
                        Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
                    }
                    G.this.h.setValue(Boxing.boxBoolean(false));
                    throw th;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Job.DefaultImpls.cancel$default((Job) it2.next(), (CancellationException) null, 1, (Object) null);
            }
            G.this.h.setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }

        public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
            if (eVar != null) {
                eVar.a();
            }
            return Unit.INSTANCE;
        }

        public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            if (eVar != null) {
                eVar.a(cVar);
            }
            return Unit.INSTANCE;
        }
    }

    public G(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adm, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10901a = context;
        this.b = watermark;
        this.c = metricsRecorder;
        this.d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.c;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.e = CoroutineScope;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(context, null, new com.moloco.sdk.internal.services.t(externalLinkHandler, customUserEventBuilderService), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a(), false, null, 50, null);
        this.f = aVar;
        this.g = new E(adm, CoroutineScope, aVar);
        Boolean bool = Boolean.FALSE;
        this.h = StateFlowKt.MutableStateFlow(bool);
        this.i = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return G.g(G.this);
            }
        });
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.j = MutableStateFlow;
        this.k = MutableStateFlow;
    }

    public static final StateFlow g(G g) {
        return FlowKt.stateIn(FlowKt.flowCombine(g.h, g.f.c(), new a(null)), g.e, SharingStarted.INSTANCE.getEagerly(), Boolean.FALSE);
    }

    public static Object h(G g) {
        return Reflection.property0(new PropertyReference0Impl(g.g, E.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.e, null, 1, null);
        this.f.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j getCreativeType() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public StateFlow<Boolean> isLoaded() {
        return this.g.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public StateFlow<Boolean> k() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4811a
    public StateFlow<Boolean> l() {
        return (StateFlow) this.i.getValue();
    }

    public final void o() {
        this.h.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public void a(long j, InterfaceC4812b.a aVar) {
        this.g.a(j, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        Intrinsics.checkNotNullParameter(options, "options");
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new b(options, eVar, null), 3, null);
    }
}

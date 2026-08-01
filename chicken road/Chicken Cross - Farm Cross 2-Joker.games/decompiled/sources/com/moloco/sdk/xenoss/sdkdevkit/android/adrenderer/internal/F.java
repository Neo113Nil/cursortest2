package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class F extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> {
    public static final int r = 8;
    public final Context j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z k;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a l;
    public final E m;
    public final CoroutineScope n;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d o;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j p;
    public final Lazy q;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$isAdDisplaying$2$1", f = "StaticBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10895a;
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
            if (this.f10895a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1", f = "StaticBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10896a;
        public /* synthetic */ Object b;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$1", f = "StaticBanner.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10897a;
            public final /* synthetic */ F b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$1$error$1", f = "StaticBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$a$a, reason: collision with other inner class name */
            public static final class C1510a extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, Continuation<? super Boolean>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f10898a;
                public /* synthetic */ Object b;

                public C1510a(Continuation<? super C1510a> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation<? super Boolean> continuation) {
                    return ((C1510a) create(gVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1510a c1510a = new C1510a(continuation);
                    c1510a.b = obj;
                    return c1510a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10898a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.b) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(F f, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = f;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e adShowListener;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10897a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> unrecoverableError = this.b.l.getUnrecoverableError();
                    C1510a c1510a = new C1510a(null);
                    this.f10897a = 1;
                    obj = FlowKt.first(unrecoverableError, c1510a, this);
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
                if (gVar != null && (adShowListener = this.b.getAdShowListener()) != null) {
                    adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.a(gVar));
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$2", f = "StaticBanner.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$b, reason: collision with other inner class name */
        public static final class C1511b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10899a;
            public final /* synthetic */ F b;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$b$a */
            public static final class a<T> implements FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ F f10900a;

                public a(F f) {
                    this.f10900a = f;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e adShowListener = this.f10900a.getAdShowListener();
                    if (adShowListener != null) {
                        adShowListener.b();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1511b(F f, Continuation<? super C1511b> continuation) {
                super(2, continuation);
                this.b = f;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C1511b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1511b(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10899a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Unit> clickthroughEvent = this.b.l.getClickthroughEvent();
                    a aVar = new a(this.b);
                    this.f10899a = 1;
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

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = F.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10896a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(F.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1511b(F.this, null), 3, null);
            F f = F.this;
            FrameLayout a2 = f.o.a(F.this.j, F.this.l);
            F.this.getWatermark().a(a2);
            f.setAdView(a2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ F(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, E e, CoroutineScope coroutineScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, zVar, aVar, e, coroutineScope, (i & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d() : dVar);
    }

    public static final StateFlow d(F f) {
        return FlowKt.stateIn(FlowKt.flowCombine(super.l(), f.l.c(), new a(null)), f.n, SharingStarted.INSTANCE.getEagerly(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        super.destroy();
        this.l.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j getCreativeType() {
        return this.p;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z getWatermark() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C
    public void k() {
        BuildersKt.launch(this.n, EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new b(null));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4811a
    public StateFlow<Boolean> l() {
        return (StateFlow) this.q.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C
    public E getAdLoader() {
        return this.m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a staticWebView, E adLoader, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d webViewWrapper) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(staticWebView, "staticWebView");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(webViewWrapper, "webViewWrapper");
        this.j = context;
        this.k = watermark;
        this.l = staticWebView;
        this.m = adLoader;
        this.n = scope;
        this.o = webViewWrapper;
        setTag("MolocoStaticBannerView");
        this.p = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.c;
        this.q = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return F.d(F.this);
            }
        });
    }
}

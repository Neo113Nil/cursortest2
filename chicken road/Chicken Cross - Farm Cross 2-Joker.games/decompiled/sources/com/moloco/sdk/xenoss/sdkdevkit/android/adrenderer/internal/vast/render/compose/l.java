package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class l extends FrameLayout {
    public static final f o = new f(null);
    public static final int p = 8;
    public static final CoroutineContext q = com.moloco.sdk.internal.scheduling.b.a().getMainImmediate();

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k f11420a;
    public final Function0<Unit> b;
    public final Q c;
    public final Lifecycle d;
    public final C e;
    public final Function0<Unit> f;
    public final Function3<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k, Q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b> g;
    public CoroutineScope h;
    public final MutableStateFlow<Boolean> i;
    public final MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> j;
    public final MutableStateFlow<Boolean> k;
    public final GestureDetector l;
    public final View m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b n;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        public a(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        public b(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).x();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function3<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k, Q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11421a = new c();

        public c() {
            super(3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.class, "defaultBlurredVideoBackgroundView", "defaultBlurredVideoBackgroundView(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/LinearViewModel;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ViewVisibilityTracker;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/blur/BlurredVideoBackgroundView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b invoke(Context p0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k p1, Q p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(p0, p1, p2);
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> {
        public d(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar) {
            a(lVar);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public e(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onMuteChange", "onMuteChange(Z)V", 0);
        }

        public final void a(boolean z) {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).c(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            return l.q;
        }

        public f() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearView$isPlayerPlayingFlow$1", f = "Linear.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function3<Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11422a;
        public /* synthetic */ boolean b;
        public /* synthetic */ Object c;

        public g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation<? super Boolean> continuation) {
            g gVar = new g(continuation);
            gVar.b = z;
            gVar.c = iVar;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), iVar, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11422a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b || !(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) this.c) instanceof i.a));
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearView$onAttachedToWindow$1", f = "Linear.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11423a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return l.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11423a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            l.this.f11420a.b();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearView$onAttachedToWindow$2", f = "Linear.kt", i = {}, l = {385}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11424a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l f11425a;

            public a(l lVar) {
                this.f11425a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> mVar, Continuation<? super Unit> continuation) {
                this.f11425a.getVideoPlayer$moloco_sdk_release().a(mVar.a().longValue());
                this.f11425a.getVideoPlayer$moloco_sdk_release().setPlay(((Boolean) this.f11425a.k.getValue()).booleanValue());
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b bVar = this.f11425a.n;
                if (bVar != null) {
                    bVar.a(mVar.a().longValue());
                }
                l lVar = this.f11425a;
                lVar.a(((Boolean) lVar.k.getValue()).booleanValue());
                return Unit.INSTANCE;
            }
        }

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return l.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11424a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>> V = l.this.f11420a.V();
                a aVar = new a(l.this);
                this.f11424a = 1;
                if (V.collect(aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearView$onAttachedToWindow$3", f = "Linear.kt", i = {}, l = {399}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11426a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l f11427a;

            public a(l lVar) {
                this.f11427a = lVar;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                this.f11427a.getVideoPlayer$moloco_sdk_release().setMute(z);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return l.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11426a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> r = l.this.f11420a.r();
                a aVar = new a(l.this);
                this.f11426a = 1;
                if (r.collect(aVar, this) == coroutine_suspended) {
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

    public /* synthetic */ l(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Function0 function0, Q q2, Lifecycle lifecycle, C c2, Function3 function3, Function3 function32, Function3 function33, Function2 function2, Function0 function02, Function3 function34, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, kVar, function0, q2, lifecycle, (i2 & 32) != 0 ? new C(context, lifecycle, kVar.P(), q2, null, 16, null) : c2, (i2 & 64) != 0 ? null : function3, (i2 & 128) != 0 ? null : function32, (i2 & 256) != 0 ? null : function33, (i2 & 512) != 0 ? null : function2, (i2 & 1024) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.a();
            }
        } : function02, (i2 & 2048) != 0 ? c.f11421a : function34);
    }

    public static final Unit d(l lVar, boolean z) {
        lVar.k.setValue(Boolean.valueOf(z));
        lVar.e.setPlay(z);
        lVar.a(z);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (super.dispatchTouchEvent(ev)) {
            return true;
        }
        this.l.onTouchEvent(ev);
        return true;
    }

    public final C getVideoPlayer$moloco_sdk_release() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(q));
        this.h = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new h(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new i(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new j(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.h;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.h = null;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(l lVar, a.AbstractC1622a.f firstTapPosition, a.AbstractC1622a.f fVar) {
        Intrinsics.checkNotNullParameter(firstTapPosition, "firstTapPosition");
        Intrinsics.checkNotNullParameter(fVar, "<unused var>");
        Function0<Unit> function0 = lVar.b;
        if (function0 != null) {
            function0.invoke();
        } else {
            lVar.f11420a.b(firstTapPosition);
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(l lVar, boolean z) {
        if (z) {
            lVar.f11420a.H();
        } else {
            lVar.f11420a.J();
        }
        return Unit.INSTANCE;
    }

    public final Flow<Boolean> c() {
        return FlowKt.combine(this.i, this.j, new g(null));
    }

    public static final Unit a(l lVar, boolean z) {
        lVar.f11420a.d(z);
        lVar.i.setValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit a(l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        lVar.f11420a.a(progress);
        lVar.j.setValue(progress);
        return Unit.INSTANCE;
    }

    public static final Unit a(l lVar, a.AbstractC1622a.c button, a.AbstractC1622a.c.EnumC1624a replacedType) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(replacedType, "replacedType");
        lVar.f11420a.a(button);
        lVar.f11420a.a(replacedType);
        return Unit.INSTANCE;
    }

    public final void a(boolean z) {
        if (z) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b bVar = this.n;
            if (bVar != null) {
                bVar.g();
                return;
            }
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b bVar2 = this.n;
        if (bVar2 != null) {
            bVar2.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, Function0<Unit> function0, Q viewVisibilityTracker, Lifecycle lifecycle, C videoPlayer, Function3<? super Context, ? super Flow<Boolean>, ? super Flow<Boolean>, n> function3, Function3<? super Context, ? super Flow<Boolean>, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, w> function32, Function3<? super Context, ? super Flow<Boolean>, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, q> function33, Function2<? super Context, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, k> function2, Function0<Unit> onShouldReplay, Function3<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k, ? super Q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b> function34) {
        super(context);
        k invoke;
        q invoke2;
        View view;
        n invoke3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
        this.f11420a = viewModel;
        this.b = function0;
        this.c = viewVisibilityTracker;
        this.d = lifecycle;
        this.e = videoPlayer;
        this.f = onShouldReplay;
        this.g = function34;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.i = MutableStateFlow;
        MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> MutableStateFlow2 = StateFlowKt.MutableStateFlow(i.b.b);
        this.j = MutableStateFlow2;
        this.k = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(context, (Function2<? super a.AbstractC1622a.f, ? super a.AbstractC1622a.f, Unit>) new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l.a(l.this, (a.AbstractC1622a.f) obj, (a.AbstractC1622a.f) obj2);
            }
        });
        View a2 = x.a(context);
        this.m = a2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b bVar = (!viewModel.D() || function34 == 0) ? null : (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b) function34.invoke(context, viewModel, viewVisibilityTracker);
        this.n = bVar;
        videoPlayer.setOnIsPlaying(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.a(l.this, ((Boolean) obj).booleanValue());
            }
        });
        videoPlayer.setOnIsVisible(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.b(l.this, ((Boolean) obj).booleanValue());
            }
        });
        videoPlayer.setOnProgressChanged(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.a(l.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj);
            }
        });
        videoPlayer.setOnError(new d(viewModel));
        videoPlayer.setUri(viewModel.K());
        addView(a2, new FrameLayout.LayoutParams(-1, -1));
        if (bVar != null) {
            addView(bVar, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(videoPlayer, new FrameLayout.LayoutParams(-1, -1, 1));
        if (function3 != null && (invoke3 = function3.invoke(context, c(), viewModel.r())) != null) {
            invoke3.setOnMuteChange(new e(viewModel));
            invoke3.setOnButtonReplaced(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return l.a(l.this, (a.AbstractC1622a.c) obj, (a.AbstractC1622a.c.EnumC1624a) obj2);
                }
            });
            addView(invoke3);
        }
        if (function32 != null && (view = (w) function32.invoke(context, MutableStateFlow, MutableStateFlow2)) != null) {
            addView(view);
        }
        if (function33 != null && (invoke2 = function33.invoke(context, MutableStateFlow, MutableStateFlow2)) != null) {
            invoke2.setOnShouldPlay(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l.d(l.this, ((Boolean) obj).booleanValue());
                }
            });
            invoke2.setOnShouldReplay(onShouldReplay);
            addView(invoke2);
        }
        if (function2 == null || (invoke = function2.invoke(context, viewModel.S())) == null) {
            return;
        }
        invoke.setOnDisplayed(new a(viewModel));
        invoke.setOnClick(new b(viewModel));
        addView(invoke);
    }
}

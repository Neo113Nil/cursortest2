package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.ironsource.C4555ne;
import com.moloco.sdk.R;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C4836b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class y extends FrameLayout {

    @Deprecated
    public static final String v = "VastRendererView";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f11485a;
    public final Lifecycle b;
    public final Function3<Context, Flow<Boolean>, Flow<Boolean>, n> c;
    public final Function3<Context, Flow<Boolean>, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, w> d;
    public final Function3<Context, Flow<Boolean>, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, q> e;
    public final Function2<Context, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, k> f;
    public final Function5<Context, Flow<Boolean>, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, com.moloco.sdk.internal.s> g;
    public final o h;
    public final Q i;
    public final boolean j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r k;
    public final Function0<Unit> l;
    public Lifecycle m;
    public CoroutineScope n;
    public View o;
    public i.a p;
    public final com.moloco.sdk.internal.s q;
    public final C4836b r;
    public final View s;
    public static final d t = new d(null);
    public static final int u = 8;
    public static final CoroutineContext w = com.moloco.sdk.internal.scheduling.b.a().getMainImmediate();

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3<Context, Flow<? extends Boolean>, Flow<? extends Boolean>, n> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11486a = new a();

        public a() {
            super(3, x.class, "defaultMuteButtonView", "defaultMuteButtonView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/MuteButtonView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke(Context p0, Flow<Boolean> p1, Flow<Boolean> p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return x.a(p0, p1, p2);
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function3<Context, Flow<? extends Boolean>, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, w> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11487a = new b();

        public b() {
            super(3, x.class, "defaultProgressBarView", "defaultProgressBarView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/VastProgressBarView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(Context p0, Flow<Boolean> p1, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return x.c(p0, p1, p2);
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function2<Context, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, k> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11488a = new c();

        public c() {
            super(2, x.class, "defaultVastIconView", "defaultVastIconView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/LinearVastIconView;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke(Context p0, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return x.a(p0, p1);
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            return y.w;
        }

        public d() {
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<a.AbstractC1622a.c, Unit> {
        public e(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC1622a.c p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a.AbstractC1622a.c cVar) {
            a(cVar);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1<a.AbstractC1622a.c, Unit> {
        public f(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC1622a.c p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a.AbstractC1622a.c cVar) {
            a(cVar);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class g extends FunctionReferenceImpl implements Function0<Unit> {
        public g(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onCTA", "onCTA()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).E();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRendererView$onAttachedToWindow$1", f = "VastRenderer.kt", i = {}, l = {636}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11489a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f11490a;

            public a(y yVar) {
                this.f11490a = yVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.a aVar, Continuation<? super Unit> continuation) {
                this.f11490a.a(aVar);
                this.f11490a.b(aVar);
                return Unit.INSTANCE;
            }
        }

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
            return y.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11489a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<i.a> k = y.this.f11485a.k();
                a aVar = new a(y.this);
                this.f11489a = 1;
                if (k.collect(aVar, this) == coroutine_suspended) {
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

    public /* synthetic */ y(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, Lifecycle lifecycle, int i, Function3 function3, Function3 function32, Function3 function33, Function2 function2, Function5 function5, o oVar, Q q, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iVar, (i2 & 4) != 0 ? null : lifecycle, (i2 & 8) != 0 ? -16777216 : i, (i2 & 16) != 0 ? a.f11486a : function3, (i2 & 32) != 0 ? b.f11487a : function32, (i2 & 64) != 0 ? null : function33, (i2 & 128) != 0 ? c.f11488a : function2, (i2 & 256) != 0 ? x.a((String) null, (String) null, (Integer) null, (Integer) null, 15, (Object) null) : function5, (i2 & 512) != 0 ? null : oVar, (i2 & 1024) != 0 ? a.h.f10873a.k() : q, (i2 & 2048) != 0 ? true : z, (i2 & 4096) != 0 ? a.h.f10873a.f() : rVar, (i2 & 8192) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.a();
            }
        } : function0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Lifecycle lifecycle = this.b;
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
            lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
            if (lifecycle == null) {
                lifecycle = a.h.f10873a.j().getLifecycle();
            }
        }
        this.m = lifecycle;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(w));
        this.n = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new h(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.n;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.n = null;
        this.m = null;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public final void b(i.a aVar) {
        int i;
        C4836b c4836b = this.r;
        if (c4836b == null) {
            return;
        }
        if ((aVar instanceof i.a.c) || (aVar instanceof i.a.C1590a)) {
            i = 0;
        } else {
            if (!(aVar instanceof i.a.d) && !(aVar instanceof i.a.b) && aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        c4836b.setVisibility(i);
    }

    public final void a(i.a aVar) {
        View view;
        if (Intrinsics.areEqual(this.p, aVar)) {
            return;
        }
        if (aVar instanceof i.a.C1590a) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h d2 = ((i.a.C1590a) aVar).d();
            o oVar = this.h;
            view = new C4868b(context, d2, oVar != null ? oVar.a() : null);
        } else if (aVar instanceof i.a.c) {
            Lifecycle lifecycle = this.m;
            if (lifecycle == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, v, "Skipping Linear rebuild: lifecycle not resolved (view detached?)", null, false, 12, null);
                return;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d3 = ((i.a.c) aVar).d();
            o oVar2 = this.h;
            view = new l(context2, d3, oVar2 != null ? oVar2.c() : null, this.i, lifecycle, null, this.c, this.d, this.e, this.f, this.l, null, C4555ne.e, null);
        } else {
            if (!(aVar instanceof i.a.d) && !(aVar instanceof i.a.b) && aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            view = null;
        }
        this.p = aVar;
        if (view == null) {
            view = this.s;
        }
        if (this.o == view) {
            return;
        }
        long integer = getResources().getInteger(R.integer.moloco_vast_renderer_crossfade_duration_ms);
        Fade fade = new Fade();
        fade.setDuration(integer);
        TransitionManager.beginDelayedTransition(this, fade);
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
            this.o = null;
        }
        addView(view, RangesKt.coerceAtLeast(getChildCount() - ((this.q != null ? 1 : 0) + (this.r != null ? 1 : 0)), 0), new FrameLayout.LayoutParams(-1, -1, 1));
        this.o = view;
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, Lifecycle lifecycle, int i, Function3<? super Context, ? super Flow<Boolean>, ? super Flow<Boolean>, n> function3, Function3<? super Context, ? super Flow<Boolean>, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, w> function32, Function3<? super Context, ? super Flow<Boolean>, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, q> function33, Function2<? super Context, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, k> function2, Function5<? super Context, ? super Flow<Boolean>, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, com.moloco.sdk.internal.s> function5, o oVar, Q viewVisibilityTracker, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, Function0<Unit> onShouldReplay) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
        this.f11485a = adViewModel;
        this.b = lifecycle;
        this.c = function3;
        this.d = function32;
        this.e = function33;
        this.f = function2;
        this.g = function5;
        this.h = oVar;
        this.i = viewVisibilityTracker;
        this.j = z;
        this.k = externalLinkHandler;
        this.l = onShouldReplay;
        C4836b c4836b = null;
        com.moloco.sdk.internal.s sVar = function5 != 0 ? (com.moloco.sdk.internal.s) function5.invoke(context, adViewModel.o(), adViewModel.k(), new f(adViewModel), new g(adViewModel)) : null;
        this.q = sVar;
        if (z) {
            c4836b = new C4836b(externalLinkHandler, context, null, 0, 12, null);
            int dimensionPixelSize = c4836b.getResources().getDimensionPixelSize(R.dimen.moloco_ad_badge_padding);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            c4836b.setLayoutParams(layoutParams);
            c4836b.setVisibility(8);
            c4836b.setOnButtonRenderedListener(new e(adViewModel));
        }
        this.r = c4836b;
        View a2 = x.a(context);
        this.s = a2;
        setBackgroundColor(i);
        setId(R.id.moloco_fullscreen_ad_view_id);
        addView(a2, new FrameLayout.LayoutParams(-1, -1));
        this.o = a2;
        if (sVar != null) {
            addView(sVar);
        }
        if (c4836b != null) {
            addView(c4836b);
        }
    }
}

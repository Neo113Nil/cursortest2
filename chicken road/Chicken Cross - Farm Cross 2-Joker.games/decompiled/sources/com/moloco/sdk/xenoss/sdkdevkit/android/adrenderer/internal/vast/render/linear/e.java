package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import android.content.Context;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11516a = 8;
    public final n A;
    public final MutableStateFlow<Boolean> B;
    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> C;
    public final MutableStateFlow<Boolean> D;
    public final StateFlow<Boolean> E;
    public final j F;
    public final g G;
    public boolean H;
    public int I;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f b;
    public final boolean c;
    public final boolean d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a e;
    public final r f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k g;
    public final boolean h;
    public final float i;
    public final int j;
    public final int k;
    public final CoroutineScope l;
    public final MutableSharedFlow<d> m;
    public final Flow<d> n;
    public final String o;
    public final MutableStateFlow<Boolean> p;
    public final StateFlow<Boolean> q;
    public final MutableStateFlow<m<Long>> r;
    public final StateFlow<m<Long>> s;
    public final MutableStateFlow<Boolean> t;
    public int u;
    public final boolean v;
    public final String w;
    public final String x;
    public final boolean y;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b z;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$1", f = "LinearControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11517a;
        public /* synthetic */ boolean b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11517a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b) {
                e.this.F.d(Boxing.boxInt(e.this.W()), e.this.o);
            } else {
                e.this.F.c(Boxing.boxInt(e.this.W()), e.this.o);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$onEvent$1", f = "LinearControllerImpl.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11518a;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11518a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = e.this.m;
                d dVar = this.c;
                this.f11518a = 1;
                if (mutableSharedFlow.emit(dVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$vastPrivacyIcon$1", f = "LinearControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11519a;
        public /* synthetic */ boolean b;
        public /* synthetic */ Object c;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> continuation) {
            c cVar = new c(continuation);
            cVar.b = z;
            cVar.c = jVar;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> continuation) {
            return a(bool.booleanValue(), jVar, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11519a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) this.c;
            if (z) {
                return jVar;
            }
            return null;
        }
    }

    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f linear, int i, boolean z, Boolean bool, int i2, boolean z2, boolean z3, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k linkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g adaptiveBlurConfig) {
        String absolutePath;
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        Intrinsics.checkNotNullParameter(adaptiveBlurConfig, "adaptiveBlurConfig");
        this.b = linear;
        this.c = z2;
        this.d = z3;
        this.e = customUserEventBuilderService;
        this.f = externalLinkHandler;
        this.g = linkHandler;
        this.h = adaptiveBlurConfig.g();
        this.i = adaptiveBlurConfig.h();
        this.j = adaptiveBlurConfig.f();
        this.k = adaptiveBlurConfig.e();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.l = CoroutineScope;
        MutableSharedFlow<d> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.m = MutableSharedFlow$default;
        this.n = MutableSharedFlow$default;
        this.o = linear.l();
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z));
        this.p = MutableStateFlow;
        this.q = MutableStateFlow;
        MutableStateFlow<m<Long>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new m(Long.valueOf(i)));
        this.r = MutableStateFlow2;
        this.s = FlowKt.asStateFlow(MutableStateFlow2);
        Boolean bool2 = Boolean.FALSE;
        this.t = StateFlowKt.MutableStateFlow(bool2);
        this.v = a.g.f10872a.b().h();
        if (P()) {
            absolutePath = linear.l();
        } else {
            absolutePath = linear.j().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        }
        this.w = absolutePath;
        String absolutePath2 = linear.j().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
        this.x = absolutePath2;
        this.y = linear.h() != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i3 = linear.i();
        List<String> b2 = i3 != null ? i3.b() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i4 = linear.i();
        this.z = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b(b2, i4 != null ? i4.g() : null, null, 4, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i5 = linear.i();
        y f = i5 != null ? i5.f() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i6 = linear.i();
        Integer valueOf = i6 != null ? Integer.valueOf(i6.h()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i7 = linear.i();
        Integer valueOf2 = i7 != null ? Integer.valueOf(i7.d()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i8 = linear.i();
        n a2 = p.a(f, valueOf, valueOf2, i8 != null ? i8.a() : null, CoroutineScope, context, customUserEventBuilderService, externalLinkHandler, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.e(e.this);
            }
        }, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.f(e.this);
            }
        });
        this.A = a2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool2);
        this.B = MutableStateFlow3;
        this.C = FlowKt.stateIn(FlowKt.combine(MutableStateFlow3, a2.S(), new c(null)), CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), null);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool2);
        this.D = MutableStateFlow4;
        this.E = MutableStateFlow4;
        this.F = j.p.a(linear.n(), customUserEventBuilderService);
        FlowKt.launchIn(FlowKt.onEach(isPlaying(), new a(null)), CoroutineScope);
        this.G = i.a(bool, i2, linear.m());
    }

    public static final Unit e(e eVar) {
        eVar.z.a(Integer.valueOf(eVar.W()), eVar.o);
        return Unit.INSTANCE;
    }

    public static final Unit f(e eVar) {
        eVar.z.b(Integer.valueOf(eVar.W()), eVar.o);
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public boolean D() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void H() {
        this.G.v();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void J() {
        int i;
        this.G.pause();
        this.r.setValue(new m<>(Long.valueOf((!this.t.getValue().booleanValue() || (i = this.u) <= 0) ? W() : i - 10)));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public String K() {
        return this.w;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean N() {
        return this.y;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public boolean P() {
        return this.v;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> S() {
        return this.C;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public float U() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public StateFlow<m<Long>> V() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public int W() {
        return this.I;
    }

    public final void X() {
        this.B.setValue(Boolean.FALSE);
    }

    public final void Y() {
        if (this.d) {
            a(false, f.a());
        }
    }

    public final void Z() {
        if (this.c) {
            a(false, f.a());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void d(boolean z) {
        this.D.setValue(Boolean.valueOf(z));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.l, null, 1, null);
        this.A.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void h() {
        this.H = true;
        this.F.f(Integer.valueOf(W()), this.o);
        String h = this.b.h();
        if (h != null) {
            this.g.c(h);
        }
        a(d.e.b);
        Z();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void i() {
        this.A.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public StateFlow<Boolean> isPlaying() {
        return this.E;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow<d.a> l() {
        return this.G.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public int n() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public StateFlow<Boolean> r() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public String s() {
        return this.x;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public void t() {
        if (!isPlaying().getValue().booleanValue() && this.r.getValue().a().longValue() == 0 && W() == 0) {
            return;
        }
        this.r.setValue(new m<>(0L));
        this.t.setValue(Boolean.FALSE);
        this.F.e(Integer.valueOf(W()), this.o);
        this.H = false;
        this.I = 0;
        this.G.M();
        X();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public int u() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void x() {
        this.A.x();
    }

    public static Object d(e eVar) {
        return Reflection.property0(new PropertyReference0Impl(eVar.G, g.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public Flow<d> a() {
        return this.n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(a.AbstractC1622a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        a(true, position);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void c(boolean z) {
        this.p.setValue(Boolean.valueOf(z));
        j jVar = this.F;
        if (z) {
            jVar.b(Integer.valueOf(W()), this.o);
        } else {
            jVar.g(Integer.valueOf(W()), this.o);
        }
    }

    public final Job a(d dVar) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new b(dVar, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void b() {
        a(d.c.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC1622a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.F.a(button);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r9 >= r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r9 <= r6) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2) {
        int b2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i3 = this.b.i();
        if (i3 == null) {
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r e = i3.e();
        Long c2 = i3.c();
        boolean z = false;
        if (e instanceof r.a) {
            b2 = (i2 / 100) * ((r.a) e).b();
        } else {
            b2 = e instanceof r.b ? (int) ((r.b) e).b() : 0;
        }
        int coerceIn = RangesKt.coerceIn(b2, (ClosedRange<Integer>) new IntRange(0, i2));
        MutableStateFlow<Boolean> mutableStateFlow = this.B;
        if (c2 != null) {
            long j = coerceIn;
            long longValue = c2.longValue() + j;
            long j2 = i;
            if (j <= j2) {
            }
        }
        mutableStateFlow.setValue(Boolean.valueOf(z));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC1622a.c.EnumC1624a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.F.a(buttonType);
    }

    public final void a(boolean z, a.AbstractC1622a.f fVar) {
        String h = this.b.h();
        if (h != null) {
            if (z) {
                this.F.a(fVar, Integer.valueOf(W()), this.o);
            }
            this.g.a(h);
            a(d.a.b);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(new d.C1610d(error));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress) {
        Pair pair;
        Intrinsics.checkNotNullParameter(progress, "progress");
        boolean z = progress instanceof i.a;
        if (z) {
            int a2 = (int) ((i.a) progress).a();
            pair = TuplesKt.to(Integer.valueOf(a2), Integer.valueOf(a2));
        } else if (progress instanceof i.c) {
            i.c cVar = (i.c) progress;
            pair = TuplesKt.to(Integer.valueOf((int) cVar.c()), Integer.valueOf((int) cVar.d()));
        } else if (progress instanceof i.d) {
            pair = TuplesKt.to(Integer.valueOf(W()), Integer.valueOf((int) ((i.d) progress).b()));
        } else {
            if (!Intrinsics.areEqual(progress, i.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        this.I = intValue;
        if (!this.H && !(progress instanceof i.d)) {
            this.F.a(this.o, intValue, intValue2);
        }
        if (z) {
            this.u = intValue2;
            boolean booleanValue = this.t.getValue().booleanValue();
            this.t.setValue(Boolean.TRUE);
            if (!this.H && !booleanValue) {
                a(d.b.b);
                String h = this.b.h();
                if (h != null) {
                    this.g.b(h);
                }
                Y();
            }
            this.H = false;
        }
        this.G.a(intValue, intValue2);
        b(intValue, intValue2);
    }

    public /* synthetic */ e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar, int i, boolean z, Boolean bool, int i2, boolean z2, boolean z3, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, i, z, bool, i2, z2, z3, context, aVar, rVar, kVar, (i3 & 2048) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(false, 0.0f, 0, 0, 15, null) : gVar);
    }
}

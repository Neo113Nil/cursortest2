package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class A implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10888a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z b;
    public final y c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j e;
    public final MraidActivity.Companion f;
    public final String g;
    public final MetricsRecorder h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j i;
    public final CoroutineScope j;
    public InterfaceC4812b.a k;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e l;
    public boolean m;
    public final MutableStateFlow<Boolean> n;
    public final StateFlow<Boolean> o;
    public final MutableStateFlow<Boolean> p;
    public final StateFlow<Boolean> q;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, Unit> {
        public a(Object obj) {
            super(1, obj, A.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/MraidAdError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((A) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
            a(dVar);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        public b(Object obj) {
            super(0, obj, A.class, "destroy", "destroy()V", 0);
        }

        public final void a() {
            ((A) this.receiver).destroy();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        public c(Object obj) {
            super(0, obj, A.class, "onForciblyClosed", "onForciblyClosed()V", 0);
        }

        public final void a() {
            ((A) this.receiver).o();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public A(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, y mraidAdLoader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e mraidBaseAd, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j mraidFullscreenController, MraidActivity.Companion mraidActivity, String str, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(mraidAdLoader, "mraidAdLoader");
        Intrinsics.checkNotNullParameter(mraidBaseAd, "mraidBaseAd");
        Intrinsics.checkNotNullParameter(mraidFullscreenController, "mraidFullscreenController");
        Intrinsics.checkNotNullParameter(mraidActivity, "mraidActivity");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10888a = context;
        this.b = watermark;
        this.c = mraidAdLoader;
        this.d = mraidBaseAd;
        this.e = mraidFullscreenController;
        this.f = mraidActivity;
        this.g = str;
        this.h = metricsRecorder;
        this.i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.b;
        this.j = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.n = MutableStateFlow;
        this.o = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.p = MutableStateFlow2;
        this.q = MutableStateFlow2;
    }

    public static Object b(A a2) {
        return Reflection.property0(new PropertyReference0Impl(a2.c, y.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    public static final Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        if (eVar != null) {
            eVar.a();
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.j, null, 1, null);
        this.d.destroy();
        this.n.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j getCreativeType() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public StateFlow<Boolean> isLoaded() {
        return this.c.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public StateFlow<Boolean> k() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4811a
    public StateFlow<Boolean> l() {
        return this.o;
    }

    public final void o() {
        this.p.setValue(Boolean.TRUE);
    }

    public static final Unit b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        if (eVar != null) {
            eVar.b();
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public void a(long j, InterfaceC4812b.a aVar) {
        this.k = aVar;
        this.d.b(new a(this));
        this.c.a(j, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f options, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.d.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return A.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this);
            }
        });
        this.d.a(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.a(A.this, (String) obj);
            }
        });
        this.l = eVar;
        this.m = true;
        com.moloco.sdk.internal.x<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a2 = this.c.a();
        if (a2 instanceof x.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) ((x.a) a2).a();
            if (eVar != null) {
                eVar.a(dVar);
                return;
            }
            return;
        }
        if (a2 instanceof x.b) {
            if (this.f.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) ((x.b) a2).a(), this.e, this.f10888a, options, this.b, new b(this), new c(this), this.d.Y(), new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return A.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this);
                }
            }, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return A.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj);
                }
            }, this.g, this.h)) {
                this.n.setValue(Boolean.TRUE);
                return;
            } else {
                if (eVar != null) {
                    eVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.j);
                    return;
                }
                return;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Unit a(A a2, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        a2.e.a(url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a());
        return Unit.INSTANCE;
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (eVar != null) {
            eVar.a(error);
        }
        return Unit.INSTANCE;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        if (this.m) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.l;
            if (eVar != null) {
                eVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
                return;
            }
            return;
        }
        InterfaceC4812b.a aVar = this.k;
        if (aVar != null) {
            aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
        }
    }
}

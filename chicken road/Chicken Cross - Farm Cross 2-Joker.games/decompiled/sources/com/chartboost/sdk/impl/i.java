package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f4795a;
    public final Mediation b;
    public final b4 c;
    public final Lazy d;
    public final g0 e;
    public final o0 f;
    public final oi g;
    public final Lazy h;
    public final ScheduledExecutorService i;
    public final sg j;
    public final f2 k;
    public final e l;

    public i(final c0 adType, Function0 get, Mediation mediation, b4 dependencyContainer) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(get, "get");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.f4795a = get;
        this.b = mediation;
        this.c = dependencyContainer;
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.a(i.this, adType);
            }
        });
        this.e = b().b();
        this.f = b().c();
        this.g = dependencyContainer.a().i();
        this.h = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.i$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.a(i.this);
            }
        });
        this.i = dependencyContainer.e().b();
        this.j = dependencyContainer.b().h();
        this.k = dependencyContainer.a().a();
        this.l = new f(dependencyContainer.a()).a();
    }

    public static final l0 a(i iVar, c0 c0Var) {
        return new l0(iVar.c.a(), iVar.c.b(), c0Var, iVar.c.i(), iVar.c.g(), iVar.b, iVar.c.f(), iVar.c.c());
    }

    public final l0 b() {
        return (l0) this.d.getValue();
    }

    public final AtomicReference c() {
        return (AtomicReference) this.h.getValue();
    }

    public final Object a() {
        return ((Function9) this.f4795a.invoke()).invoke(this.e, this.f, this.g, c(), this.i, this.l, this.j, this.k, this.c.c().a());
    }

    public static final AtomicReference a(i iVar) {
        return iVar.c.b().b();
    }

    public /* synthetic */ i(c0 c0Var, Function0 function0, Mediation mediation, b4 b4Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, function0, mediation, (i & 8) != 0 ? b4.b : b4Var);
    }
}

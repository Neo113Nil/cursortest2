package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Fd implements Fq, InterfaceC3694f {

    /* renamed from: a, reason: collision with root package name */
    public final Ed f6556a;
    public final Jd b;

    public Fd(Ed nativeAdUnitComponent) {
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.f6556a = nativeAdUnitComponent;
        this.b = new Jd(nativeAdUnitComponent);
    }

    public final void a() {
        Ok ok = this.b.c;
        C4135uf c4135uf = ok instanceof C4135uf ? (C4135uf) ok : null;
        if (c4135uf != null) {
            Y9 l = c4135uf.l();
            if (l != null) {
                ((Z9) l).a("NativeRenderedState", "takeAction");
            }
            ((C3821je) c4135uf.b.p.getValue()).b();
        }
    }

    @Override // com.inmobi.media.Fq
    public final String a(double d) {
        return Eq.a(this.f6556a.f6535a, d);
    }

    @Override // com.inmobi.media.Fq
    public final String a(int i, double d) {
        return Eq.a(this.f6556a.f6535a, i, d);
    }

    @Override // com.inmobi.media.InterfaceC3694f
    public final Object a(Continuation continuation) {
        Object a2 = this.b.a(continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}

package I;

import h0.C1991e;
import i0.C2006k;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;

/* renamed from: I.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155h extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2489l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f2490m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2491n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155h(long j5, InterfaceC2015a interfaceC2015a, boolean z3) {
        super(1);
        this.f2489l = j5;
        this.f2490m = interfaceC2015a;
        this.f2491n = z3;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        f0.c cVar = (f0.c) obj;
        return cVar.a(new C0154g(this.f2490m, this.f2491n, AbstractC2036a.v(cVar, C1991e.d(cVar.f16923k.d()) / 2.0f), new C2006k(5, this.f2489l)));
    }
}

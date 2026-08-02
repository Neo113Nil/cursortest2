package t;

import a3.AbstractC0467k;
import k0.AbstractC2024d;
import x0.Y;
import x0.Z;
import z0.C2733I;

/* renamed from: t.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2380B extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19325l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f19326m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f19327n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f19328o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f19329p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2380B(Object obj, long j5, long j6, Object obj2, int i) {
        super(1);
        this.f19325l = i;
        this.f19328o = obj;
        this.f19326m = j5;
        this.f19327n = j6;
        this.f19329p = obj2;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f19325l) {
            case 0:
                Y y5 = (Y) obj;
                long j5 = this.f19326m;
                long j6 = this.f19327n;
                int i = ((int) (j5 >> 32)) + ((int) (j6 >> 32));
                int i5 = ((int) (j5 & 4294967295L)) + ((int) (j6 & 4294967295L));
                A.s sVar = (A.s) this.f19329p;
                Z z3 = (Z) this.f19328o;
                y5.getClass();
                Y.a(y5, z3);
                z3.Z(W0.j.c((i << 32) | (4294967295L & i5), z3.f20977o), 0.0f, sVar);
                break;
            default:
                C2733I c2733i = (C2733I) obj;
                c2733i.a();
                AbstractC0467k.l(c2733i, (i0.M) this.f19328o, this.f19326m, this.f19327n, 0.0f, (AbstractC2024d) this.f19329p, 104);
                break;
        }
        return W3.o.f6046a;
    }
}

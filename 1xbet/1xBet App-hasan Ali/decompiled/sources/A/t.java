package A;

import java.util.List;
import java.util.Map;
import p4.InterfaceC2280u;
import x0.P;

/* loaded from: classes.dex */
public final class t implements P {

    /* renamed from: a, reason: collision with root package name */
    public final u f104a;

    /* renamed from: b, reason: collision with root package name */
    public int f105b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f106c;

    /* renamed from: d, reason: collision with root package name */
    public float f107d;

    /* renamed from: e, reason: collision with root package name */
    public final float f108e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2280u f109g;

    /* renamed from: h, reason: collision with root package name */
    public final W0.c f110h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f111j;

    /* renamed from: k, reason: collision with root package name */
    public final int f112k;

    /* renamed from: l, reason: collision with root package name */
    public final int f113l;

    /* renamed from: m, reason: collision with root package name */
    public final int f114m;

    /* renamed from: n, reason: collision with root package name */
    public final x.P f115n;

    /* renamed from: o, reason: collision with root package name */
    public final int f116o;

    /* renamed from: p, reason: collision with root package name */
    public final int f117p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P f118q;

    public t(u uVar, int i, boolean z3, float f, P p5, float f5, boolean z5, InterfaceC2280u interfaceC2280u, W0.c cVar, long j5, List list, int i5, int i6, int i7, x.P p6, int i8, int i9) {
        this.f104a = uVar;
        this.f105b = i;
        this.f106c = z3;
        this.f107d = f;
        this.f108e = f5;
        this.f = z5;
        this.f109g = interfaceC2280u;
        this.f110h = cVar;
        this.i = j5;
        this.f111j = list;
        this.f112k = i5;
        this.f113l = i6;
        this.f114m = i7;
        this.f115n = p6;
        this.f116o = i8;
        this.f117p = i9;
        this.f118q = p5;
    }

    @Override // x0.P
    public final Map a() {
        return this.f118q.a();
    }

    @Override // x0.P
    public final void b() {
        this.f118q.b();
    }

    @Override // x0.P
    public final int c() {
        return this.f118q.c();
    }

    @Override // x0.P
    public final i4.c d() {
        return this.f118q.d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean e(int i, boolean z3) {
        u uVar;
        int i5;
        if (!this.f) {
            ?? r02 = this.f111j;
            if (!r02.isEmpty() && (uVar = this.f104a) != null && (i5 = this.f105b - i) >= 0 && i5 < uVar.f128l) {
                u uVar2 = (u) X3.m.Y(r02);
                u uVar3 = (u) X3.m.e0(r02);
                uVar2.getClass();
                uVar3.getClass();
                int i6 = this.f113l;
                int i7 = this.f112k;
                if (i >= 0 ? Math.min(i7 - uVar2.f126j, i6 - uVar3.f126j) > i : Math.min((uVar2.f126j + uVar2.f128l) - i7, (uVar3.f126j + uVar3.f128l) - i6) > (-i)) {
                    this.f105b -= i;
                    int size = r02.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        u uVar4 = (u) r02.get(i8);
                        uVar4.getClass();
                        uVar4.f126j += i;
                        int[] iArr = uVar4.f131o;
                        int length = iArr.length;
                        for (int i9 = 0; i9 < length; i9++) {
                            if (i9 % 2 == 1) {
                                iArr[i9] = iArr[i9] + i;
                            }
                        }
                        if (z3) {
                            int size2 = uVar4.f120b.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                L1.a.t(uVar4.i.f6878a.g(uVar4.f124g));
                            }
                        }
                    }
                    this.f107d = i;
                    if (!this.f106c && i > 0) {
                        this.f106c = true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x0.P
    public final int getWidth() {
        return this.f118q.getWidth();
    }
}

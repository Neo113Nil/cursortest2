package e2;

import A1.X;
import d6.C0977k;
import u2.C1640q;
import u2.InterfaceC1636m;
import u2.T;
import v2.AbstractC1664a;

/* renamed from: e2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012i extends AbstractC1008e {

    /* renamed from: A, reason: collision with root package name */
    public final C1007d f12635A;

    /* renamed from: B, reason: collision with root package name */
    public C0977k f12636B;

    /* renamed from: C, reason: collision with root package name */
    public long f12637C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f12638D;

    public C1012i(InterfaceC1636m interfaceC1636m, C1640q c1640q, X x4, int i7, Object obj, C1007d c1007d) {
        super(interfaceC1636m, c1640q, 2, x4, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f12635A = c1007d;
    }

    @Override // u2.H
    public final void l() {
        this.f12638D = true;
    }

    @Override // u2.H
    public final void load() {
        if (this.f12637C == 0) {
            this.f12635A.a(this.f12636B, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C1640q a2 = this.f12594b.a(this.f12637C);
            T t7 = this.f12601z;
            F1.h hVar = new F1.h(t7, a2.f16812e, t7.o(a2));
            while (!this.f12638D) {
                try {
                    int f7 = this.f12635A.f12584a.f(hVar, C1007d.f12583A);
                    boolean z4 = false;
                    AbstractC1664a.h(f7 != 1);
                    if (f7 == 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        break;
                    }
                } finally {
                    this.f12637C = hVar.f2534d - this.f12594b.f16812e;
                }
            }
        } finally {
            q6.a.b(this.f12601z);
        }
    }
}

package Ef;

import Hf.AbstractC3139b;
import Hf.w;
import Jf.AbstractC3395a;

/* loaded from: classes10.dex */
public final class q extends AbstractC3395a {

    /* renamed from: a, reason: collision with root package name */
    private final Hf.t f7959a = new Hf.t();

    /* renamed from: b, reason: collision with root package name */
    private int f7960b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7961c;

    public q(int i11) {
        this.f7960b = i11;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final boolean b() {
        return true;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final boolean c(AbstractC3139b abstractC3139b) {
        if (!this.f7961c) {
            return true;
        }
        AbstractC3139b m11 = this.f7959a.m();
        if (!(m11 instanceof Hf.s)) {
            return true;
        }
        ((Hf.s) m11).o(false);
        return true;
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f7959a;
    }

    @Override // Jf.c
    public final b h(h hVar) {
        if (hVar.q()) {
            if (this.f7959a.c() == null) {
                return null;
            }
            AbstractC3139b e11 = hVar.i().e();
            this.f7961c = (e11 instanceof w) || (e11 instanceof Hf.t);
            return b.a(hVar.o());
        }
        int l11 = hVar.l();
        int i11 = this.f7960b;
        if (l11 >= i11) {
            return new b(-1, hVar.j() + i11, false);
        }
        return null;
    }
}

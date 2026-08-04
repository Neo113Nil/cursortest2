package p075k4;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14782e;

    public f(Object obj, Object obj2, h hVar, h hVar2) {
        super(obj, obj2, hVar, hVar2);
        this.f14782e = -1;
    }

    @Override // p075k4.h
    public final boolean e() {
        return false;
    }

    @Override // p075k4.j
    public final j l(Object obj, Object obj2, h hVar, h hVar2) {
        if (obj == null) {
            obj = this.f14784a;
        }
        if (obj2 == null) {
            obj2 = this.f14785b;
        }
        if (hVar == null) {
            hVar = this.f14786c;
        }
        if (hVar2 == null) {
            hVar2 = this.f14787d;
        }
        return new f(obj, obj2, hVar, hVar2);
    }

    @Override // p075k4.j
    public final int n() {
        return 2;
    }

    @Override // p075k4.j
    public final void r(j jVar) {
        if (this.f14782e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f14786c = jVar;
    }

    @Override // p075k4.h
    public final int size() {
        if (this.f14782e == -1) {
            this.f14782e = this.f14787d.size() + this.f14786c.size() + 1;
        }
        return this.f14782e;
    }
}

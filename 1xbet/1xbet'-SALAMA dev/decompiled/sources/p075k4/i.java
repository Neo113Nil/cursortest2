package p075k4;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends j {
    @Override // p075k4.h
    public final boolean e() {
        return true;
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
        return new i(obj, obj2, hVar, hVar2);
    }

    @Override // p075k4.j
    public final int n() {
        return 1;
    }

    @Override // p075k4.h
    public final int size() {
        return this.f14787d.size() + this.f14786c.size() + 1;
    }
}

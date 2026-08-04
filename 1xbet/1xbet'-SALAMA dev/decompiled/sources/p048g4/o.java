package p048g4;

import B1.c;
import N4.a;
import N4.b;
import R5.M;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f13223c = new M(26);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f13224d = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f13225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f13226b;

    public o(M m7, b bVar) {
        this.f13225a = m7;
        this.f13226b = bVar;
    }

    public final void a(a aVar) {
        b bVar;
        b bVar2;
        b bVar3 = this.f13226b;
        e eVar = f13224d;
        if (bVar3 != eVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f13226b;
            if (bVar != eVar) {
                bVar2 = bVar;
            } else {
                this.f13225a = new c(15, this.f13225a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override // N4.b
    public final Object get() {
        return this.f13226b.get();
    }
}

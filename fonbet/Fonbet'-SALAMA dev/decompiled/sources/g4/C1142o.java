package g4;

import R5.M;

/* renamed from: g4.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1142o implements N4.b {

    /* renamed from: c, reason: collision with root package name */
    public static final M f13217c = new M(26);

    /* renamed from: d, reason: collision with root package name */
    public static final C1132e f13218d = new C1132e(1);

    /* renamed from: a, reason: collision with root package name */
    public N4.a f13219a;

    /* renamed from: b, reason: collision with root package name */
    public volatile N4.b f13220b;

    public C1142o(M m7, N4.b bVar) {
        this.f13219a = m7;
        this.f13220b = bVar;
    }

    public final void a(N4.a aVar) {
        N4.b bVar;
        N4.b bVar2;
        N4.b bVar3 = this.f13220b;
        C1132e c1132e = f13218d;
        if (bVar3 != c1132e) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f13220b;
            if (bVar != c1132e) {
                bVar2 = bVar;
            } else {
                this.f13219a = new B1.c(15, this.f13219a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override // N4.b
    public final Object get() {
        return this.f13220b.get();
    }
}

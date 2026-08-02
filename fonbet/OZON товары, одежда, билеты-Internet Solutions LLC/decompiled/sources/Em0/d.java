package Em0;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class d extends c {

    /* renamed from: g, reason: collision with root package name */
    private Bm0.e f8139g;

    public d(Bm0.e eVar) {
        this.f8139g = eVar;
        d(null);
    }

    @Override // Bm0.c
    @NonNull
    public final Bm0.e a() {
        return new Bm0.e(this.f8139g);
    }

    public final void f(Bm0.e eVar) {
        Bm0.e eVar2 = new Bm0.e(eVar);
        this.f8139g = eVar2;
        eVar2.clear();
        d(eVar.toString());
    }
}

package Em0;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: g, reason: collision with root package name */
    private Cm0.b f8125g;

    /* renamed from: h, reason: collision with root package name */
    private Bm0.b f8126h;

    public a(Cm0.b bVar, Bm0.b bVar2) {
        this.f8125g = bVar;
        this.f8126h = bVar2;
        d(bVar2.a());
    }

    @Override // Bm0.c
    @NonNull
    public final Bm0.e a() {
        return new Bm0.d(this.f8125g, this.f8126h).a();
    }
}

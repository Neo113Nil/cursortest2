package Q8;

/* loaded from: classes9.dex */
final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final d<Integer> f23027a = d.b();

    /* renamed from: b, reason: collision with root package name */
    private final d<String> f23028b = d.c();

    b() {
    }

    @Override // Q8.f
    public final void a(M8.g gVar) {
        d<String> dVar = this.f23028b;
        if (dVar.d().a(gVar).equals("001")) {
            this.f23027a.a(gVar);
        } else {
            dVar.a(gVar);
        }
    }

    final M8.g b(int i11) {
        return this.f23027a.e(Integer.valueOf(i11));
    }

    final M8.g c(String str) {
        return this.f23028b.e(str);
    }
}

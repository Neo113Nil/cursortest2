package G7;

/* loaded from: classes9.dex */
final class h extends u {

    /* renamed from: a, reason: collision with root package name */
    private String f9737a;

    final h a(String str) {
        this.f9737a = str;
        return this;
    }

    final e b() {
        String str = this.f9737a;
        if (str != null) {
            return new i(str);
        }
        throw new IllegalStateException("Missing required properties: token");
    }
}

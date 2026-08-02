package H5;

import androidx.collection.C5155y;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f10625b = new g();

    /* renamed from: a, reason: collision with root package name */
    private final C5155y<String, B5.g> f10626a = new C5155y<>(20);

    g() {
    }

    public static g b() {
        return f10625b;
    }

    public final B5.g a(String str) {
        if (str == null) {
            return null;
        }
        return this.f10626a.get(str);
    }

    public final void c(String str, B5.g gVar) {
        if (str == null) {
            return;
        }
        this.f10626a.put(str, gVar);
    }
}

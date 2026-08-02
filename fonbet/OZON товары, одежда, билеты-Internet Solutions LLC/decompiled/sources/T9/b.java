package T9;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b extends S9.d {

    /* renamed from: b, reason: collision with root package name */
    private final char f26914b;

    public b(S9.d dVar, char c11) {
        super(dVar);
        this.f26914b = c11;
    }

    @Override // S9.d
    public final S9.b a(char c11) {
        char c12 = this.f26914b;
        return c12 == c11 ? new S9.b(d(), Character.valueOf(c11), true, Character.valueOf(c11)) : new S9.b(d(), Character.valueOf(c12), false, Character.valueOf(c12));
    }

    @Override // S9.d
    public final S9.b b() {
        S9.d d11 = d();
        char c11 = this.f26914b;
        return new S9.b(d11, Character.valueOf(c11), false, Character.valueOf(c11));
    }

    public final char e() {
        return this.f26914b;
    }

    @Override // S9.d
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        sb2.append(this.f26914b);
        sb2.append("} -> ");
        sb2.append(c() == null ? "null" : c().toString());
        return sb2.toString();
    }
}

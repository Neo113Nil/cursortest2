package H8;

import C.o0;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f10693a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10694b;

    a(String str, String str2) {
        this.f10693a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f10694b = str2;
    }

    @Override // H8.e
    public final String a() {
        return this.f10693a;
    }

    @Override // H8.e
    public final String b() {
        return this.f10694b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10693a.equals(eVar.a()) && this.f10694b.equals(eVar.b());
    }

    public final int hashCode() {
        return ((this.f10693a.hashCode() ^ 1000003) * 1000003) ^ this.f10694b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f10693a);
        sb2.append(", version=");
        return o0.c(sb2, this.f10694b, "}");
    }
}

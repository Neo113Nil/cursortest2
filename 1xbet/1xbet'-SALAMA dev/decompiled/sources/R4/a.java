package R4;

import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6059b;

    public a(String str, String str2) {
        this.f6058a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f6059b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6058a.equals(aVar.f6058a) && this.f6059b.equals(aVar.f6059b);
    }

    public final int hashCode() {
        return ((this.f6058a.hashCode() ^ 1000003) * 1000003) ^ this.f6059b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f6058a);
        sb.append(", version=");
        return k.i(sb, this.f6059b, "}");
    }
}

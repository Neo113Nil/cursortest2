package p135s5;

import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16189c;

    public a(String str, String str2) {
        this.f16187a = str;
        this.f16188b = null;
        this.f16189c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16187a.equals(aVar.f16187a)) {
            return this.f16189c.equals(aVar.f16189c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16189c.hashCode() + (this.f16187a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f16187a);
        sb.append(", function: ");
        return k.i(sb, this.f16189c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f16187a = str;
        this.f16188b = str2;
        this.f16189c = str3;
    }
}

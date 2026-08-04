package p048g4;

import p031e1.k;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13214c;

    public i(int i7, int i8, Class cls) {
        this(q.a(cls), i7, i8);
    }

    public static i a(Class cls) {
        return new i(0, 1, cls);
    }

    public static i b(Class cls) {
        return new i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f13212a.equals(iVar.f13212a) && this.f13213b == iVar.f13213b && this.f13214c == iVar.f13214c;
    }

    public final int hashCode() {
        return ((((this.f13212a.hashCode() ^ 1000003) * 1000003) ^ this.f13213b) * 1000003) ^ this.f13214c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f13212a);
        sb.append(", type=");
        int i7 = this.f13213b;
        if (i7 == 1) {
            str = "required";
        } else {
            str = i7 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i8 = this.f13214c;
        if (i8 == 0) {
            str2 = "direct";
        } else if (i8 == 1) {
            str2 = "provider";
        } else {
            if (i8 != 2) {
                throw new AssertionError(k.d(i8, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return k.i(sb, str2, "}");
    }

    public i(q qVar, int i7, int i8) {
        f.l(qVar, "Null dependency anInterface.");
        this.f13212a = qVar;
        this.f13213b = i7;
        this.f13214c = i8;
    }
}

package P;

import java.util.Arrays;

/* renamed from: P.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000a {

    /* renamed from: a, reason: collision with root package name */
    public final int f289a;

    /* renamed from: b, reason: collision with root package name */
    public final Y.e f290b;

    /* renamed from: c, reason: collision with root package name */
    public final O.b f291c;

    /* renamed from: d, reason: collision with root package name */
    public final String f292d;

    public C0000a(Y.e eVar, O.b bVar, String str) {
        this.f290b = eVar;
        this.f291c = bVar;
        this.f292d = str;
        this.f289a = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0000a)) {
            return false;
        }
        C0000a c0000a = (C0000a) obj;
        return Q.s.e(this.f290b, c0000a.f290b) && Q.s.e(this.f291c, c0000a.f291c) && Q.s.e(this.f292d, c0000a.f292d);
    }

    public final int hashCode() {
        return this.f289a;
    }
}

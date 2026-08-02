package Z3;

import G.g;
import j3.s;
import j3.t;
import j3.u;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m3.C8050C;

/* loaded from: classes8.dex */
public final class a implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f35342a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35343b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35344c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35345d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35346e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35347f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35348g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f35349h;

    public a(int i11, String str, String str2, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f35342a = i11;
        this.f35343b = str;
        this.f35344c = str2;
        this.f35345d = i12;
        this.f35346e = i13;
        this.f35347f = i14;
        this.f35348g = i15;
        this.f35349h = bArr;
    }

    public static a d(C8050C c8050c) {
        int p11 = c8050c.p();
        String m11 = u.m(c8050c.C(c8050c.p(), StandardCharsets.US_ASCII));
        String C11 = c8050c.C(c8050c.p(), StandardCharsets.UTF_8);
        int p12 = c8050c.p();
        int p13 = c8050c.p();
        int p14 = c8050c.p();
        int p15 = c8050c.p();
        int p16 = c8050c.p();
        byte[] bArr = new byte[p16];
        c8050c.n(0, p16, bArr);
        return new a(p11, m11, C11, p12, p13, p14, p15, bArr);
    }

    @Override // j3.t.a
    public final void a(s.a aVar) {
        aVar.I(this.f35342a, this.f35349h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f35342a == aVar.f35342a && this.f35343b.equals(aVar.f35343b) && this.f35344c.equals(aVar.f35344c) && this.f35345d == aVar.f35345d && this.f35346e == aVar.f35346e && this.f35347f == aVar.f35347f && this.f35348g == aVar.f35348g && Arrays.equals(this.f35349h, aVar.f35349h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f35349h) + ((((((((g.a(g.a((527 + this.f35342a) * 31, 31, this.f35343b), 31, this.f35344c) + this.f35345d) * 31) + this.f35346e) * 31) + this.f35347f) * 31) + this.f35348g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f35343b + ", description=" + this.f35344c;
    }
}

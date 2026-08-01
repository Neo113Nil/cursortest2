package sg.bigo.ads.h0;

import sg.bigo.ads.f0.C5115b;

/* renamed from: sg.bigo.ads.h0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5228a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12950a;
    public final C5115b b;
    public d c;
    public int d;
    public String e;

    public C5228a(C5115b c5115b) {
        this.b = c5115b;
        this.f12950a = c5115b.f12782a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C5228a.class) {
            return false;
        }
        C5228a c5228a = (C5228a) obj;
        return this.f12950a.equals(c5228a.f12950a) && this.b.d.equals(c5228a.b.d) && this.b.c.equals(c5228a.b.c);
    }

    public final String toString() {
        return this.b.toString();
    }
}

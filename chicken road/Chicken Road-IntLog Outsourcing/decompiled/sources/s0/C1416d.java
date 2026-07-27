package s0;

import b2.AbstractC0279e;
import g4.C0473r;
import java.util.Set;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416d {

    /* renamed from: i, reason: collision with root package name */
    public static final C1416d f11761i = new C1416d(1, false, false, false, false, -1, -1, C0473r.f5752a);

    /* renamed from: a, reason: collision with root package name */
    public final int f11762a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11763b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11764c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11765d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11766e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11767f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11768g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f11769h;

    public C1416d(int i2, boolean z, boolean z5, boolean z6, boolean z7, long j2, long j6, Set contentUriTriggers) {
        AbstractC0279e.k(i2, "requiredNetworkType");
        kotlin.jvm.internal.i.e(contentUriTriggers, "contentUriTriggers");
        this.f11762a = i2;
        this.f11763b = z;
        this.f11764c = z5;
        this.f11765d = z6;
        this.f11766e = z7;
        this.f11767f = j2;
        this.f11768g = j6;
        this.f11769h = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1416d.class.equals(obj.getClass())) {
            return false;
        }
        C1416d c1416d = (C1416d) obj;
        if (this.f11763b == c1416d.f11763b && this.f11764c == c1416d.f11764c && this.f11765d == c1416d.f11765d && this.f11766e == c1416d.f11766e && this.f11767f == c1416d.f11767f && this.f11768g == c1416d.f11768g && this.f11762a == c1416d.f11762a) {
            return kotlin.jvm.internal.i.a(this.f11769h, c1416d.f11769h);
        }
        return false;
    }

    public final int hashCode() {
        int b6 = ((((((((O.j.b(this.f11762a) * 31) + (this.f11763b ? 1 : 0)) * 31) + (this.f11764c ? 1 : 0)) * 31) + (this.f11765d ? 1 : 0)) * 31) + (this.f11766e ? 1 : 0)) * 31;
        long j2 = this.f11767f;
        int i2 = (b6 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j6 = this.f11768g;
        return this.f11769h.hashCode() + ((i2 + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }
}

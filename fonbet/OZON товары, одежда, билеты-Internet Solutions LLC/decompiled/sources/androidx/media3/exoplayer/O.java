package androidx.media3.exoplayer;

import F3.InterfaceC3018x;
import java.util.Objects;

/* loaded from: classes.dex */
final class O {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3018x.b f43679a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43680b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43681c;

    /* renamed from: d, reason: collision with root package name */
    public final long f43682d;

    /* renamed from: e, reason: collision with root package name */
    public final long f43683e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f43684f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f43685g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f43686h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f43687i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f43688j;

    O(InterfaceC3018x.b bVar, long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16 = true;
        G10.a.c(!z15 || z13);
        G10.a.c(!z14 || z13);
        if (z12 && (z13 || z14 || z15)) {
            z16 = false;
        }
        G10.a.c(z16);
        this.f43679a = bVar;
        this.f43680b = j11;
        this.f43681c = j12;
        this.f43682d = j13;
        this.f43683e = j14;
        this.f43684f = z11;
        this.f43685g = z12;
        this.f43686h = z13;
        this.f43687i = z14;
        this.f43688j = z15;
    }

    public final O a(long j11) {
        if (j11 == this.f43681c) {
            return this;
        }
        return new O(this.f43679a, this.f43680b, j11, this.f43682d, this.f43683e, this.f43684f, this.f43685g, this.f43686h, this.f43687i, this.f43688j);
    }

    public final O b(long j11) {
        if (j11 == this.f43680b) {
            return this;
        }
        return new O(this.f43679a, j11, this.f43681c, this.f43682d, this.f43683e, this.f43684f, this.f43685g, this.f43686h, this.f43687i, this.f43688j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O.class == obj.getClass()) {
            O o11 = (O) obj;
            if (this.f43680b == o11.f43680b && this.f43681c == o11.f43681c && this.f43682d == o11.f43682d && this.f43683e == o11.f43683e && this.f43684f == o11.f43684f && this.f43685g == o11.f43685g && this.f43686h == o11.f43686h && this.f43687i == o11.f43687i && this.f43688j == o11.f43688j && Objects.equals(this.f43679a, o11.f43679a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f43679a.hashCode() + 527) * 31) + ((int) this.f43680b)) * 31) + ((int) this.f43681c)) * 31) + ((int) this.f43682d)) * 31) + ((int) this.f43683e)) * 31) + (this.f43684f ? 1 : 0)) * 31) + (this.f43685g ? 1 : 0)) * 31) + (this.f43686h ? 1 : 0)) * 31) + (this.f43687i ? 1 : 0)) * 31) + (this.f43688j ? 1 : 0);
    }
}

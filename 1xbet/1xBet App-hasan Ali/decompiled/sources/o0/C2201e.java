package o0;

import l3.C2054a;
import n.AbstractC2107A;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2201e {

    /* renamed from: k, reason: collision with root package name */
    public static int f18538k;

    /* renamed from: l, reason: collision with root package name */
    public static final C2054a f18539l = new C2054a(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f18540a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18541b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18542c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18543d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18544e;
    public final y f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18545g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18546h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18547j;

    public C2201e(String str, float f, float f5, float f6, float f7, y yVar, long j5, int i, boolean z3) {
        int i5;
        synchronized (f18539l) {
            i5 = f18538k;
            f18538k = i5 + 1;
        }
        this.f18540a = str;
        this.f18541b = f;
        this.f18542c = f5;
        this.f18543d = f6;
        this.f18544e = f7;
        this.f = yVar;
        this.f18545g = j5;
        this.f18546h = i;
        this.i = z3;
        this.f18547j = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2201e)) {
            return false;
        }
        C2201e c2201e = (C2201e) obj;
        return kotlin.jvm.internal.l.a(this.f18540a, c2201e.f18540a) && W0.f.a(this.f18541b, c2201e.f18541b) && W0.f.a(this.f18542c, c2201e.f18542c) && this.f18543d == c2201e.f18543d && this.f18544e == c2201e.f18544e && this.f.equals(c2201e.f) && i0.p.c(this.f18545g, c2201e.f18545g) && this.f18546h == c2201e.f18546h && this.i == c2201e.i;
    }

    public final int hashCode() {
        return ((AbstractC2107A.o((this.f.hashCode() + AbstractC2107A.n(this.f18544e, AbstractC2107A.n(this.f18543d, AbstractC2107A.n(this.f18542c, AbstractC2107A.n(this.f18541b, this.f18540a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31, this.f18545g) + this.f18546h) * 31) + (this.i ? 1231 : 1237);
    }
}

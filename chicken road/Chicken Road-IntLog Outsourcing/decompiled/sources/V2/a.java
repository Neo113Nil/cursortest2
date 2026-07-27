package V2;

import Y2.h;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3225f = new a("00000000000000000000000000000000", "0000000000000000", Y2.e.f3690d, Y2.a.f3685a, false);

    /* renamed from: a, reason: collision with root package name */
    public final String f3226a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3227b;

    /* renamed from: c, reason: collision with root package name */
    public final Y2.e f3228c;

    /* renamed from: d, reason: collision with root package name */
    public final Y2.b f3229d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3230e;

    public a(String str, String str2, Y2.e eVar, Y2.b bVar, boolean z) {
        this.f3226a = str;
        this.f3227b = str2;
        if (eVar == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f3228c = eVar;
        if (bVar == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f3229d = bVar;
        this.f3230e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3226a.equals(aVar.f3226a) && this.f3227b.equals(aVar.f3227b) && this.f3228c.equals(aVar.f3228c) && this.f3229d.equals(aVar.f3229d) && this.f3230e == aVar.f3230e;
    }

    public final int hashCode() {
        return ((((((((((this.f3226a.hashCode() ^ 1000003) * 1000003) ^ this.f3227b.hashCode()) * 1000003) ^ this.f3228c.hashCode()) * 1000003) ^ this.f3229d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (this.f3230e ? 1231 : 1237);
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=" + this.f3226a + ", spanId=" + this.f3227b + ", traceFlags=" + this.f3228c + ", traceState=" + this.f3229d + ", remote=false, valid=" + this.f3230e + "}";
    }
}

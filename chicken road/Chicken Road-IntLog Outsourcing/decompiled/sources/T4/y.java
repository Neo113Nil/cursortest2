package T4;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public M0.e f3000a;

    /* renamed from: b, reason: collision with root package name */
    public v f3001b;

    /* renamed from: d, reason: collision with root package name */
    public String f3003d;

    /* renamed from: e, reason: collision with root package name */
    public n f3004e;

    /* renamed from: h, reason: collision with root package name */
    public B0.e f3007h;

    /* renamed from: i, reason: collision with root package name */
    public z f3008i;

    /* renamed from: j, reason: collision with root package name */
    public z f3009j;

    /* renamed from: k, reason: collision with root package name */
    public z f3010k;

    /* renamed from: l, reason: collision with root package name */
    public long f3011l;

    /* renamed from: m, reason: collision with root package name */
    public long f3012m;

    /* renamed from: n, reason: collision with root package name */
    public X4.i f3013n;

    /* renamed from: c, reason: collision with root package name */
    public int f3002c = -1;

    /* renamed from: g, reason: collision with root package name */
    public B f3006g = B.f2804a;

    /* renamed from: o, reason: collision with root package name */
    public E f3014o = E.f2816a;

    /* renamed from: f, reason: collision with root package name */
    public L3.j f3005f = new L3.j(3);

    public static void b(String str, z zVar) {
        if (zVar != null) {
            if (zVar.f3023i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (zVar.f3024j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (zVar.f3025k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final z a() {
        int i2 = this.f3002c;
        if (i2 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3002c).toString());
        }
        M0.e eVar = this.f3000a;
        if (eVar == null) {
            throw new IllegalStateException("request == null");
        }
        v vVar = this.f3001b;
        if (vVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f3003d;
        if (str != null) {
            return new z(eVar, vVar, str, i2, this.f3004e, this.f3005f.d(), this.f3006g, this.f3007h, this.f3008i, this.f3009j, this.f3010k, this.f3011l, this.f3012m, this.f3013n, this.f3014o);
        }
        throw new IllegalStateException("message == null");
    }
}

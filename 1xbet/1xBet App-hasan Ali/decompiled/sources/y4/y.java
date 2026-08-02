package y4;

import o0.C2202f;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public C0.c f21437a;

    /* renamed from: b, reason: collision with root package name */
    public v f21438b;

    /* renamed from: d, reason: collision with root package name */
    public String f21440d;

    /* renamed from: e, reason: collision with root package name */
    public l f21441e;

    /* renamed from: g, reason: collision with root package name */
    public B f21442g;

    /* renamed from: h, reason: collision with root package name */
    public z f21443h;
    public z i;

    /* renamed from: j, reason: collision with root package name */
    public z f21444j;

    /* renamed from: k, reason: collision with root package name */
    public long f21445k;

    /* renamed from: l, reason: collision with root package name */
    public long f21446l;

    /* renamed from: m, reason: collision with root package name */
    public A.v f21447m;

    /* renamed from: c, reason: collision with root package name */
    public int f21439c = -1;
    public C2202f f = new C2202f(1);

    public static void b(String str, z zVar) {
        if (zVar != null) {
            if (zVar.f21454q != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (zVar.f21455r != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (zVar.f21456s != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (zVar.f21457t != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final z a() {
        int i = this.f21439c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f21439c).toString());
        }
        C0.c cVar = this.f21437a;
        if (cVar == null) {
            throw new IllegalStateException("request == null");
        }
        v vVar = this.f21438b;
        if (vVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f21440d;
        if (str != null) {
            return new z(cVar, vVar, str, i, this.f21441e, this.f.d(), this.f21442g, this.f21443h, this.i, this.f21444j, this.f21445k, this.f21446l, this.f21447m);
        }
        throw new IllegalStateException("message == null");
    }
}

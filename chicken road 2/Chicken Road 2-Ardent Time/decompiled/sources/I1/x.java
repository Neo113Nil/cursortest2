package I1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public I1.v f844a;

    /* renamed from: b, reason: collision with root package name */
    public I1.t f845b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f847d;

    /* renamed from: e, reason: collision with root package name */
    public I1.k f848e;

    /* renamed from: g, reason: collision with root package name */
    public I1.z f850g;

    /* renamed from: h, reason: collision with root package name */
    public I1.y f851h;

    /* renamed from: i, reason: collision with root package name */
    public I1.y f852i;

    /* renamed from: j, reason: collision with root package name */
    public I1.y f853j;

    /* renamed from: k, reason: collision with root package name */
    public long f854k;

    /* renamed from: l, reason: collision with root package name */
    public long f855l;

    /* renamed from: m, reason: collision with root package name */
    public M1.e f856m;

    /* renamed from: c, reason: collision with root package name */
    public int f846c = -1;

    /* renamed from: f, reason: collision with root package name */
    public I1.l f849f = new I1.l(0);

    public static void b(I1.y yVar, java.lang.String str) {
        if (yVar == null) {
            return;
        }
        if (yVar.f863g != null) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(".body != null", str).toString());
        }
        if (yVar.f864h != null) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(".networkResponse != null", str).toString());
        }
        if (yVar.f865i != null) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(".cacheResponse != null", str).toString());
        }
        if (yVar.f866j != null) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(".priorResponse != null", str).toString());
        }
    }

    public final I1.y a() {
        int i2 = this.f846c;
        if (i2 < 0) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2), "code < 0: ").toString());
        }
        I1.v vVar = this.f844a;
        if (vVar == null) {
            throw new java.lang.IllegalStateException("request == null");
        }
        I1.t tVar = this.f845b;
        if (tVar == null) {
            throw new java.lang.IllegalStateException("protocol == null");
        }
        java.lang.String str = this.f847d;
        if (str != null) {
            return new I1.y(vVar, tVar, str, i2, this.f848e, this.f849f.b(), this.f850g, this.f851h, this.f852i, this.f853j, this.f854k, this.f855l, this.f856m);
        }
        throw new java.lang.IllegalStateException("message == null");
    }
}

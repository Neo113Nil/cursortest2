package i1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public w f1436a;

    /* renamed from: b, reason: collision with root package name */
    public s f1437b;

    /* renamed from: d, reason: collision with root package name */
    public String f1439d;

    /* renamed from: e, reason: collision with root package name */
    public k f1440e;

    /* renamed from: g, reason: collision with root package name */
    public z f1442g;

    /* renamed from: h, reason: collision with root package name */
    public y f1443h;

    /* renamed from: i, reason: collision with root package name */
    public y f1444i;

    /* renamed from: j, reason: collision with root package name */
    public y f1445j;

    /* renamed from: k, reason: collision with root package name */
    public long f1446k;

    /* renamed from: l, reason: collision with root package name */
    public long f1447l;

    /* renamed from: c, reason: collision with root package name */
    public int f1438c = -1;

    /* renamed from: f, reason: collision with root package name */
    public l f1441f = new l(0);

    public static void b(String str, y yVar) {
        if (yVar.f1454g != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (yVar.f1455h != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (yVar.f1456i != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (yVar.f1457j != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    public final y a() {
        if (this.f1436a == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f1437b == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f1438c >= 0) {
            if (this.f1439d != null) {
                return new y(this);
            }
            throw new IllegalStateException("message == null");
        }
        throw new IllegalStateException("code < 0: " + this.f1438c);
    }
}

package I1;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final I1.o f834a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f835b;

    /* renamed from: c, reason: collision with root package name */
    public final I1.m f836c;

    /* renamed from: d, reason: collision with root package name */
    public final I1.w f837d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f838e;

    /* renamed from: f, reason: collision with root package name */
    public I1.c f839f;

    public v(I1.o url, java.lang.String method, I1.m mVar, I1.w wVar, java.util.Map map) {
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(method, "method");
        this.f834a = url;
        this.f835b = method;
        this.f836c = mVar;
        this.f837d = wVar;
        this.f838e = map;
    }

    public final I1.u a() {
        I1.u uVar = new I1.u(false);
        uVar.f833f = new java.util.LinkedHashMap();
        uVar.f830c = this.f834a;
        uVar.f829b = this.f835b;
        uVar.f832e = this.f837d;
        java.util.Map map = this.f838e;
        uVar.f833f = map.isEmpty() ? new java.util.LinkedHashMap() : i1.AbstractC0202u.L(map);
        uVar.f831d = this.f836c.c();
        return uVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request{method=");
        sb.append(this.f835b);
        sb.append(", url=");
        sb.append(this.f834a);
        I1.m mVar = this.f836c;
        if (mVar.size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (java.lang.Object obj : mVar) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i1.AbstractC0191j.J();
                    throw null;
                }
                h1.C0172d c0172d = (h1.C0172d) obj;
                java.lang.String str = (java.lang.String) c0172d.f3295a;
                java.lang.String str2 = (java.lang.String) c0172d.f3296b;
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i2 = i3;
            }
            sb.append(']');
        }
        java.util.Map map = this.f838e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

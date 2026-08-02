package y4;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class z implements Closeable, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final C0.c f21448k;

    /* renamed from: l, reason: collision with root package name */
    public final v f21449l;

    /* renamed from: m, reason: collision with root package name */
    public final String f21450m;

    /* renamed from: n, reason: collision with root package name */
    public final int f21451n;

    /* renamed from: o, reason: collision with root package name */
    public final l f21452o;

    /* renamed from: p, reason: collision with root package name */
    public final m f21453p;

    /* renamed from: q, reason: collision with root package name */
    public final B f21454q;

    /* renamed from: r, reason: collision with root package name */
    public final z f21455r;

    /* renamed from: s, reason: collision with root package name */
    public final z f21456s;

    /* renamed from: t, reason: collision with root package name */
    public final z f21457t;

    /* renamed from: u, reason: collision with root package name */
    public final long f21458u;

    /* renamed from: v, reason: collision with root package name */
    public final long f21459v;

    /* renamed from: w, reason: collision with root package name */
    public final A.v f21460w;

    /* renamed from: x, reason: collision with root package name */
    public C2675c f21461x;

    public z(C0.c cVar, v vVar, String str, int i, l lVar, m mVar, B b3, z zVar, z zVar2, z zVar3, long j5, long j6, A.v vVar2) {
        kotlin.jvm.internal.l.f("request", cVar);
        kotlin.jvm.internal.l.f("protocol", vVar);
        kotlin.jvm.internal.l.f("message", str);
        this.f21448k = cVar;
        this.f21449l = vVar;
        this.f21450m = str;
        this.f21451n = i;
        this.f21452o = lVar;
        this.f21453p = mVar;
        this.f21454q = b3;
        this.f21455r = zVar;
        this.f21456s = zVar2;
        this.f21457t = zVar3;
        this.f21458u = j5;
        this.f21459v = j6;
        this.f21460w = vVar2;
    }

    public static String b(String str, z zVar) {
        zVar.getClass();
        String c5 = zVar.f21453p.c(str);
        if (c5 == null) {
            return null;
        }
        return c5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        B b3 = this.f21454q;
        if (b3 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b3.close();
    }

    public final boolean d() {
        int i = this.f21451n;
        return 200 <= i && i < 300;
    }

    public final y f() {
        y yVar = new y();
        yVar.f21437a = this.f21448k;
        yVar.f21438b = this.f21449l;
        yVar.f21439c = this.f21451n;
        yVar.f21440d = this.f21450m;
        yVar.f21441e = this.f21452o;
        yVar.f = this.f21453p.f();
        yVar.f21442g = this.f21454q;
        yVar.f21443h = this.f21455r;
        yVar.i = this.f21456s;
        yVar.f21444j = this.f21457t;
        yVar.f21445k = this.f21458u;
        yVar.f21446l = this.f21459v;
        yVar.f21447m = this.f21460w;
        return yVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f21449l + ", code=" + this.f21451n + ", message=" + this.f21450m + ", url=" + ((n) this.f21448k.f811b) + '}';
    }
}

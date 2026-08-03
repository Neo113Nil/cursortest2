package I1;

/* loaded from: classes.dex */
public final class y implements java.io.Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final I1.v f857a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.t f858b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f859c;

    /* renamed from: d, reason: collision with root package name */
    public final int f860d;

    /* renamed from: e, reason: collision with root package name */
    public final I1.k f861e;

    /* renamed from: f, reason: collision with root package name */
    public final I1.m f862f;

    /* renamed from: g, reason: collision with root package name */
    public final I1.z f863g;

    /* renamed from: h, reason: collision with root package name */
    public final I1.y f864h;

    /* renamed from: i, reason: collision with root package name */
    public final I1.y f865i;

    /* renamed from: j, reason: collision with root package name */
    public final I1.y f866j;

    /* renamed from: k, reason: collision with root package name */
    public final long f867k;

    /* renamed from: l, reason: collision with root package name */
    public final long f868l;

    /* renamed from: m, reason: collision with root package name */
    public final M1.e f869m;

    public y(I1.v request, I1.t protocol, java.lang.String message, int i2, I1.k kVar, I1.m mVar, I1.z zVar, I1.y yVar, I1.y yVar2, I1.y yVar3, long j2, long j3, M1.e eVar) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(message, "message");
        this.f857a = request;
        this.f858b = protocol;
        this.f859c = message;
        this.f860d = i2;
        this.f861e = kVar;
        this.f862f = mVar;
        this.f863g = zVar;
        this.f864h = yVar;
        this.f865i = yVar2;
        this.f866j = yVar3;
        this.f867k = j2;
        this.f868l = j3;
        this.f869m = eVar;
    }

    public static java.lang.String a(I1.y yVar, java.lang.String str) {
        yVar.getClass();
        java.lang.String a2 = yVar.f862f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    public final I1.x b() {
        I1.x xVar = new I1.x();
        xVar.f844a = this.f857a;
        xVar.f845b = this.f858b;
        xVar.f846c = this.f860d;
        xVar.f847d = this.f859c;
        xVar.f848e = this.f861e;
        xVar.f849f = this.f862f.c();
        xVar.f850g = this.f863g;
        xVar.f851h = this.f864h;
        xVar.f852i = this.f865i;
        xVar.f853j = this.f866j;
        xVar.f854k = this.f867k;
        xVar.f855l = this.f868l;
        xVar.f856m = this.f869m;
        return xVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        I1.z zVar = this.f863g;
        if (zVar == null) {
            throw new java.lang.IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zVar.close();
    }

    public final java.lang.String toString() {
        return "Response{protocol=" + this.f858b + ", code=" + this.f860d + ", message=" + this.f859c + ", url=" + this.f857a.f834a + '}';
    }
}

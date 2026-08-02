package K0;

/* loaded from: classes.dex */
public final class w implements InterfaceC0198c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2871a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2872b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2873c;

    /* renamed from: d, reason: collision with root package name */
    public final V0.q f2874d;

    /* renamed from: e, reason: collision with root package name */
    public final y f2875e;
    public final V0.i f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2876g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2877h;
    public final V0.s i;

    public w(int i, int i5, long j5, V0.q qVar, y yVar, V0.i iVar, int i6, int i7, V0.s sVar) {
        this.f2871a = i;
        this.f2872b = i5;
        this.f2873c = j5;
        this.f2874d = qVar;
        this.f2875e = yVar;
        this.f = iVar;
        this.f2876g = i6;
        this.f2877h = i7;
        this.i = sVar;
        if (W0.o.a(j5, W0.o.f6021c) || W0.o.c(j5) >= 0.0f) {
            return;
        }
        Q0.a.b("lineHeight can't be negative (" + W0.o.c(j5) + ')');
    }

    public final w a(w wVar) {
        if (wVar == null) {
            return this;
        }
        return x.a(this, wVar.f2871a, wVar.f2872b, wVar.f2873c, wVar.f2874d, wVar.f2875e, wVar.f, wVar.f2876g, wVar.f2877h, wVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f2871a == wVar.f2871a && this.f2872b == wVar.f2872b && W0.o.a(this.f2873c, wVar.f2873c) && kotlin.jvm.internal.l.a(this.f2874d, wVar.f2874d) && kotlin.jvm.internal.l.a(this.f2875e, wVar.f2875e) && kotlin.jvm.internal.l.a(this.f, wVar.f) && this.f2876g == wVar.f2876g && this.f2877h == wVar.f2877h && kotlin.jvm.internal.l.a(this.i, wVar.i);
    }

    public final int hashCode() {
        int d5 = (W0.o.d(this.f2873c) + (((this.f2871a * 31) + this.f2872b) * 31)) * 31;
        V0.q qVar = this.f2874d;
        int hashCode = (d5 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        y yVar = this.f2875e;
        int hashCode2 = (hashCode + (yVar != null ? yVar.hashCode() : 0)) * 31;
        V0.i iVar = this.f;
        int hashCode3 = (((((hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.f2876g) * 31) + this.f2877h) * 31;
        V0.s sVar = this.i;
        return hashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) V0.k.a(this.f2871a)) + ", textDirection=" + ((Object) V0.m.a(this.f2872b)) + ", lineHeight=" + ((Object) W0.o.e(this.f2873c)) + ", textIndent=" + this.f2874d + ", platformStyle=" + this.f2875e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) V0.e.a(this.f2876g)) + ", hyphens=" + ((Object) V0.d.a(this.f2877h)) + ", textMotion=" + this.i + ')';
    }
}

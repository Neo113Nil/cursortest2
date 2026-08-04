package p023d1;

import java.util.HashSet;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f12348i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12353e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12349a = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12354f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12355g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f12356h = new e();

    static {
        e eVar = new e();
        c cVar = new c();
        cVar.f12349a = 1;
        cVar.f12354f = -1L;
        cVar.f12355g = -1L;
        new HashSet();
        cVar.f12350b = false;
        cVar.f12351c = false;
        cVar.f12349a = 1;
        cVar.f12352d = false;
        cVar.f12353e = false;
        cVar.f12356h = eVar;
        cVar.f12354f = -1L;
        cVar.f12355g = -1L;
        f12348i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12350b == cVar.f12350b && this.f12351c == cVar.f12351c && this.f12352d == cVar.f12352d && this.f12353e == cVar.f12353e && this.f12354f == cVar.f12354f && this.f12355g == cVar.f12355g && this.f12349a == cVar.f12349a) {
            return this.f12356h.equals(cVar.f12356h);
        }
        return false;
    }

    public final int hashCode() {
        int iE = ((((((((e.e(this.f12349a) * 31) + (this.f12350b ? 1 : 0)) * 31) + (this.f12351c ? 1 : 0)) * 31) + (this.f12352d ? 1 : 0)) * 31) + (this.f12353e ? 1 : 0)) * 31;
        long j = this.f12354f;
        int i7 = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f12355g;
        return this.f12356h.f12359a.hashCode() + ((i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }
}

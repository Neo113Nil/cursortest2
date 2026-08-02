package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: na */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0500na {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0766uh f5343a;

    /* JADX INFO: renamed from: b */
    public final HashMap f5344b;

    public C0500na(InterfaceC0766uh interfaceC0766uh, HashMap map) {
        this.f5343a = interfaceC0766uh;
        this.f5344b = map;
    }

    /* JADX INFO: renamed from: a */
    public final long m3506a(dx0 dx0Var, long j, int i) {
        long jMo159g = j - this.f5343a.mo159g();
        C0537oa c0537oa = (C0537oa) this.f5344b.get(dx0Var);
        long j2 = c0537oa.f5677a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jMo159g), c0537oa.f5678b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0500na)) {
            return false;
        }
        C0500na c0500na = (C0500na) obj;
        return this.f5343a.equals(c0500na.f5343a) && this.f5344b.equals(c0500na.f5344b);
    }

    public final int hashCode() {
        return this.f5344b.hashCode() ^ ((this.f5343a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f5343a + ", values=" + this.f5344b + "}";
    }
}

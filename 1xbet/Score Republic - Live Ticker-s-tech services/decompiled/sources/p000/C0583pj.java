package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: pj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0583pj {

    /* JADX INFO: renamed from: a */
    public final Object f6158a;

    /* JADX INFO: renamed from: b */
    public final C0299hu f6159b;

    /* JADX INFO: renamed from: c */
    public final x60 f6160c;

    /* JADX INFO: renamed from: d */
    public final Object f6161d;

    /* JADX INFO: renamed from: e */
    public final Throwable f6162e;

    public /* synthetic */ C0583pj(Object obj, C0299hu c0299hu, x60 x60Var, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c0299hu, (i & 4) != 0 ? null : x60Var, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX INFO: renamed from: a */
    public static C0583pj m3921a(C0583pj c0583pj, C0299hu c0299hu, CancellationException cancellationException, int i) {
        Object obj = c0583pj.f6158a;
        if ((i & 2) != 0) {
            c0299hu = c0583pj.f6159b;
        }
        C0299hu c0299hu2 = c0299hu;
        x60 x60Var = c0583pj.f6160c;
        Object obj2 = c0583pj.f6161d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = c0583pj.f6162e;
        }
        return new C0583pj(obj, c0299hu2, x60Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0583pj)) {
            return false;
        }
        C0583pj c0583pj = (C0583pj) obj;
        return af0.m187a(this.f6158a, c0583pj.f6158a) && af0.m187a(this.f6159b, c0583pj.f6159b) && af0.m187a(this.f6160c, c0583pj.f6160c) && af0.m187a(this.f6161d, c0583pj.f6161d) && af0.m187a(this.f6162e, c0583pj.f6162e);
    }

    public final int hashCode() {
        Object obj = this.f6158a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0299hu c0299hu = this.f6159b;
        int iHashCode2 = (iHashCode + (c0299hu == null ? 0 : c0299hu.hashCode())) * 31;
        x60 x60Var = this.f6160c;
        int iHashCode3 = (iHashCode2 + (x60Var == null ? 0 : x60Var.hashCode())) * 31;
        Object obj2 = this.f6161d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f6162e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f6158a + ", cancelHandler=" + this.f6159b + ", onCancellation=" + this.f6160c + ", idempotentResume=" + this.f6161d + ", cancelCause=" + this.f6162e + ')';
    }

    public C0583pj(Object obj, C0299hu c0299hu, x60 x60Var, Object obj2, Throwable th) {
        this.f6158a = obj;
        this.f6159b = c0299hu;
        this.f6160c = x60Var;
        this.f6161d = obj2;
        this.f6162e = th;
    }
}

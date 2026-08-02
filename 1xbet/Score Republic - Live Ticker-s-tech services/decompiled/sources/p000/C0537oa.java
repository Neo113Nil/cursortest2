package p000;

import java.util.Set;

/* JADX INFO: renamed from: oa */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0537oa {

    /* JADX INFO: renamed from: a */
    public final long f5677a;

    /* JADX INFO: renamed from: b */
    public final long f5678b;

    /* JADX INFO: renamed from: c */
    public final Set f5679c;

    public C0537oa(long j, long j2, Set set) {
        this.f5677a = j;
        this.f5678b = j2;
        this.f5679c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0537oa) {
            C0537oa c0537oa = (C0537oa) obj;
            if (this.f5677a == c0537oa.f5677a && this.f5678b == c0537oa.f5678b && this.f5679c.equals(c0537oa.f5679c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5677a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f5678b;
        return this.f5679c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f5677a + ", maxAllowedDelay=" + this.f5678b + ", flags=" + this.f5679c + "}";
    }
}

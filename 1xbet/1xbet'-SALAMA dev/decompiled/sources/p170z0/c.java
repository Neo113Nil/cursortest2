package p170z0;

import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18437c;

    public c(long j, long j3, int i7) {
        this.f18435a = j;
        this.f18436b = j3;
        this.f18437c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18435a == cVar.f18435a && this.f18436b == cVar.f18436b && this.f18437c == cVar.f18437c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18437c) + ((Long.hashCode(this.f18436b) + (Long.hashCode(this.f18435a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f18435a);
        sb.append(", ModelVersion=");
        sb.append(this.f18436b);
        sb.append(", TopicCode=");
        return L.i("Topic { ", k.g(sb, this.f18437c, " }"));
    }
}

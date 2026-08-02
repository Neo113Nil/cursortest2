package z0;

import e1.k;
import w1.L;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1810c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18429a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18431c;

    public C1810c(long j, long j3, int i7) {
        this.f18429a = j;
        this.f18430b = j3;
        this.f18431c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1810c)) {
            return false;
        }
        C1810c c1810c = (C1810c) obj;
        return this.f18429a == c1810c.f18429a && this.f18430b == c1810c.f18430b && this.f18431c == c1810c.f18431c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18431c) + ((Long.hashCode(this.f18430b) + (Long.hashCode(this.f18429a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f18429a);
        sb.append(", ModelVersion=");
        sb.append(this.f18430b);
        sb.append(", TopicCode=");
        return L.i("Topic { ", k.g(sb, this.f18431c, " }"));
    }
}

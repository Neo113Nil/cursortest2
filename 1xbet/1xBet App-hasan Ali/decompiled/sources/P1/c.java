package P1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f4703a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4705c;

    public c(int i, long j5, long j6) {
        this.f4703a = j5;
        this.f4704b = j6;
        this.f4705c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4703a == cVar.f4703a && this.f4704b == cVar.f4704b && this.f4705c == cVar.f4705c;
    }

    public final int hashCode() {
        long j5 = this.f4703a;
        int i = ((int) (j5 ^ (j5 >>> 32))) * 31;
        long j6 = this.f4704b;
        return ((i + ((int) ((j6 >>> 32) ^ j6))) * 31) + this.f4705c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f4703a);
        sb.append(", ModelVersion=");
        sb.append(this.f4704b);
        sb.append(", TopicCode=");
        return L1.a.m("Topic { ", L1.a.o(sb, this.f4705c, " }"));
    }
}

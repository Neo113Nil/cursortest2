package j0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f17412a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17413b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17414c;

    public c(int i, long j5, String str) {
        this.f17412a = str;
        this.f17413b = j5;
        this.f17414c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f5, float f6);

    public abstract float e(float f, float f5, float f6);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f17414c == cVar.f17414c && kotlin.jvm.internal.l.a(this.f17412a, cVar.f17412a)) {
            return b.a(this.f17413b, cVar.f17413b);
        }
        return false;
    }

    public abstract long f(float f, float f5, float f6, float f7, c cVar);

    public int hashCode() {
        int hashCode = this.f17412a.hashCode() * 31;
        int i = b.f17411e;
        long j5 = this.f17413b;
        return ((hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f17414c;
    }

    public final String toString() {
        return this.f17412a + " (id=" + this.f17414c + ", model=" + ((Object) b.b(this.f17413b)) + ')';
    }
}

package V5;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
final class n implements T5.f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f28265b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28266c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28267d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f28268e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f28269f;

    /* renamed from: g, reason: collision with root package name */
    private final T5.f f28270g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<?>, T5.m<?>> f28271h;

    /* renamed from: i, reason: collision with root package name */
    private final T5.i f28272i;

    /* renamed from: j, reason: collision with root package name */
    private int f28273j;

    n(Object obj, T5.f fVar, int i11, int i12, Map<Class<?>, T5.m<?>> map, Class<?> cls, Class<?> cls2, T5.i iVar) {
        p6.k.c(obj, "Argument must not be null");
        this.f28265b = obj;
        p6.k.c(fVar, "Signature must not be null");
        this.f28270g = fVar;
        this.f28266c = i11;
        this.f28267d = i12;
        p6.k.c(map, "Argument must not be null");
        this.f28271h = map;
        p6.k.c(cls, "Resource class must not be null");
        this.f28268e = cls;
        p6.k.c(cls2, "Transcode class must not be null");
        this.f28269f = cls2;
        p6.k.c(iVar, "Argument must not be null");
        this.f28272i = iVar;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f28265b.equals(nVar.f28265b) && this.f28270g.equals(nVar.f28270g) && this.f28267d == nVar.f28267d && this.f28266c == nVar.f28266c && this.f28271h.equals(nVar.f28271h) && this.f28268e.equals(nVar.f28268e) && this.f28269f.equals(nVar.f28269f) && this.f28272i.equals(nVar.f28272i)) {
                return true;
            }
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        if (this.f28273j == 0) {
            int hashCode = this.f28265b.hashCode();
            this.f28273j = hashCode;
            int hashCode2 = ((((this.f28270g.hashCode() + (hashCode * 31)) * 31) + this.f28266c) * 31) + this.f28267d;
            this.f28273j = hashCode2;
            int hashCode3 = this.f28271h.hashCode() + (hashCode2 * 31);
            this.f28273j = hashCode3;
            int hashCode4 = this.f28268e.hashCode() + (hashCode3 * 31);
            this.f28273j = hashCode4;
            int hashCode5 = this.f28269f.hashCode() + (hashCode4 * 31);
            this.f28273j = hashCode5;
            this.f28273j = this.f28272i.hashCode() + (hashCode5 * 31);
        }
        return this.f28273j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f28265b + ", width=" + this.f28266c + ", height=" + this.f28267d + ", resourceClass=" + this.f28268e + ", transcodeClass=" + this.f28269f + ", signature=" + this.f28270g + ", hashCode=" + this.f28273j + ", transformations=" + this.f28271h + ", options=" + this.f28272i + '}';
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}

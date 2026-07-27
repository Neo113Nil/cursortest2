package V3;

import R3.d;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3251a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public int f3252b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3253c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3254d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3255e;

    /* renamed from: f, reason: collision with root package name */
    public final b f3256f;

    public c(String str, String str2, d dVar, b bVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f3253c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f3254d = str2;
        this.f3255e = dVar;
        this.f3256f = bVar;
    }

    public static c a(d dVar, U3.b bVar, b bVar2) {
        c cVar = new c(bVar2.f3245b, bVar2.f3246c, dVar, bVar2);
        cVar.f3251a.set(bVar);
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3253c.equalsIgnoreCase(cVar.f3253c) && this.f3254d.equals(cVar.f3254d) && this.f3255e.equals(cVar.f3255e) && this.f3256f.equals(cVar.f3256f);
    }

    public final int hashCode() {
        int i2 = this.f3252b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((((this.f3253c.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f3254d.hashCode()) * 1000003) ^ this.f3255e.hashCode()) * 1000003) ^ this.f3256f.hashCode();
        this.f3252b = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "MetricDescriptor{name=" + this.f3253c + ", description=" + this.f3254d + ", view=" + this.f3255e + ", sourceInstrument=" + this.f3256f + "}";
    }
}

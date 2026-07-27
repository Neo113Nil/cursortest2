package B0;

import P0.j;
import android.content.Context;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f132a;

    /* renamed from: b, reason: collision with root package name */
    public final j f133b;

    /* renamed from: c, reason: collision with root package name */
    public final j f134c;

    /* renamed from: d, reason: collision with root package name */
    public final String f135d;

    public b(Context context, j jVar, j jVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f132a = context;
        if (jVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f133b = jVar;
        if (jVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f134c = jVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f135d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f132a.equals(((b) dVar).f132a)) {
                b bVar = (b) dVar;
                if (this.f133b.equals(bVar.f133b) && this.f134c.equals(bVar.f134c) && this.f135d.equals(bVar.f135d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f132a.hashCode() ^ 1000003) * 1000003) ^ this.f133b.hashCode()) * 1000003) ^ this.f134c.hashCode()) * 1000003) ^ this.f135d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f132a);
        sb.append(", wallClock=");
        sb.append(this.f133b);
        sb.append(", monotonicClock=");
        sb.append(this.f134c);
        sb.append(", backendName=");
        return c.l(sb, this.f135d, "}");
    }
}

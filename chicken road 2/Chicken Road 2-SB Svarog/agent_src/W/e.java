package W;

import g0.h;
import g0.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public i f390b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f391c = f.f393a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f392d = this;

    /* JADX WARN: Multi-variable type inference failed */
    public e(f0.a aVar) {
        this.f390b = (i) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [f0.a, g0.i, java.lang.Object] */
    public final Object a() {
        Object obj;
        Object obj2 = this.f391c;
        f fVar = f.f393a;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f392d) {
            obj = this.f391c;
            if (obj == fVar) {
                ?? r1 = this.f390b;
                h.b(r1);
                obj = r1.a();
                this.f391c = obj;
                this.f390b = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f391c != f.f393a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

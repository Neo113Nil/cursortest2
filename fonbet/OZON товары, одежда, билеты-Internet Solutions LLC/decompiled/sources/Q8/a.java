package Q8;

import Q8.f;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
final class a<T extends f> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final P8.a f23023a;

    /* renamed from: b, reason: collision with root package name */
    private final P8.b f23024b;

    /* renamed from: c, reason: collision with root package name */
    private final T f23025c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f23026d = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    a(P8.a aVar, P8.b bVar, f fVar) {
        this.f23023a = aVar;
        this.f23024b = bVar;
        this.f23025c = fVar;
    }

    public final T a(String str) {
        if (!this.f23026d.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.f23026d.containsKey(str)) {
                        try {
                            Iterator it = this.f23024b.a(this.f23023a.a(str)).iterator();
                            while (it.hasNext()) {
                                this.f23025c.a((M8.g) it.next());
                            }
                            this.f23026d.put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e11) {
                            throw new IllegalStateException("Failed to read file " + str, e11);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f23025c;
    }
}

package N1;

import E.C0028c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class k implements V1.b, V1.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2022a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f2023b;

    /* renamed from: c, reason: collision with root package name */
    public final O1.l f2024c;

    public k() {
        O1.l lVar = O1.l.f2264a;
        this.f2022a = new HashMap();
        this.f2023b = new ArrayDeque();
        this.f2024c = lVar;
    }

    public final void a(C0028c c0028c) {
        O1.l lVar = this.f2024c;
        synchronized (this) {
            try {
                lVar.getClass();
                if (!this.f2022a.containsKey(K1.b.class)) {
                    this.f2022a.put(K1.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f2022a.get(K1.b.class)).put(c0028c, lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

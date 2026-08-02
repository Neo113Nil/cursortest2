package Td;

import Td.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27065b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, h.f<?, ?>> f27066a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final p f27067a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27068b;

        a(int i11, p pVar) {
            this.f27067a = pVar;
            this.f27068b = i11;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27067a == aVar.f27067a && this.f27068b == aVar.f27068b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f27067a) * 65535) + this.f27068b;
        }
    }

    static {
        new f(0);
    }

    f() {
        this.f27066a = new HashMap();
    }

    public static f c() {
        return new f();
    }

    public final void a(h.f<?, ?> fVar) {
        this.f27066a.put(new a(fVar.f27089d.f27083a, fVar.f27086a), fVar);
    }

    public final h.f b(int i11, p pVar) {
        return this.f27066a.get(new a(i11, pVar));
    }

    private f(int i11) {
        this.f27066a = Collections.EMPTY_MAP;
    }
}

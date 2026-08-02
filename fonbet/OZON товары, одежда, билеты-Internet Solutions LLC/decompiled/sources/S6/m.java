package S6;

import S6.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class m {

    public static abstract class a {
        public final void a(int i11, String str) {
            ((HashMap) e()).put(str, String.valueOf(i11));
        }

        public final void b(long j11) {
            ((HashMap) e()).put("tz-offset", String.valueOf(j11));
        }

        public final void c(String str, String str2) {
            ((HashMap) e()).put(str, str2);
        }

        public abstract m d();

        protected abstract Map<String, String> e();

        public abstract a f(Integer num);

        public abstract a g(l lVar);

        public abstract a h(long j11);

        public abstract a i(String str);

        public abstract a j(long j11);
    }

    public static a a() {
        h.a aVar = new h.a();
        aVar.k(new HashMap());
        return aVar;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    protected abstract Map<String, String> c();

    public abstract Integer d();

    public abstract l e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h() {
        String str = c().get("tz-offset");
        if (str == null) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public abstract String j();

    public abstract long k();

    public final a l() {
        h.a aVar = new h.a();
        aVar.i(j());
        aVar.f(d());
        aVar.g(e());
        aVar.h(f());
        aVar.j(k());
        aVar.k(new HashMap(c()));
        return aVar;
    }
}

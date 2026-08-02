package N8;

import U7.i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private a<String, Pattern> f18783a;

    private static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private LinkedHashMap<K, V> f18784a;

        /* renamed from: b, reason: collision with root package name */
        private int f18785b;

        /* renamed from: N8.b$a$a, reason: collision with other inner class name */
        final class C0363a extends LinkedHashMap<K, V> {
            C0363a(int i11) {
                super(i11, 0.75f, true);
            }

            @Override // java.util.LinkedHashMap
            protected final boolean removeEldestEntry(Map.Entry<K, V> entry) {
                return size() > a.this.f18785b;
            }
        }

        public a(int i11) {
            this.f18785b = i11;
            this.f18784a = new C0363a(i.a(i11, 4, 3, 1));
        }

        public final synchronized Object b(String str) {
            return this.f18784a.get(str);
        }

        public final synchronized void c(String str, Pattern pattern) {
            this.f18784a.put(str, pattern);
        }
    }

    public b(int i11) {
        this.f18783a = new a<>(i11);
    }

    public final Pattern a(String str) {
        a<String, Pattern> aVar = this.f18783a;
        Pattern pattern = (Pattern) aVar.b(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        aVar.c(str, compile);
        return compile;
    }
}

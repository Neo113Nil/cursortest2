package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class H {
    public static int a(int i7, Object obj, Object obj2) {
        G g3 = (G) obj;
        F f7 = (F) obj2;
        int i8 = 0;
        if (!g3.isEmpty()) {
            for (Map.Entry entry : g3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                f7.getClass();
                int K02 = C0687k.K0(i7);
                int a2 = F.a(f7.f9111a, key, value);
                i8 += C0687k.M0(a2) + a2 + K02;
            }
        }
        return i8;
    }

    public static G b(Object obj, Object obj2) {
        G g3 = (G) obj;
        G g7 = (G) obj2;
        if (!g7.isEmpty()) {
            if (!g3.f9113a) {
                g3 = g3.b();
            }
            g3.a();
            if (!g7.isEmpty()) {
                g3.putAll(g7);
            }
        }
        return g3;
    }

    public static void c(Object obj) {
        ((G) obj).f9113a = false;
    }
}

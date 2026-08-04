package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class H {
    public static int a(int i7, Object obj, Object obj2) {
        G g3 = (G) obj;
        F f7 = (F) obj2;
        int iM0 = 0;
        if (!g3.isEmpty()) {
            for (Map.Entry entry : g3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                f7.getClass();
                int iK0 = C0666k.K0(i7);
                int iA = F.a(f7.f9111a, key, value);
                iM0 += C0666k.M0(iA) + iA + iK0;
            }
        }
        return iM0;
    }

    public static G b(Object obj, Object obj2) {
        G gB = (G) obj;
        G g3 = (G) obj2;
        if (!g3.isEmpty()) {
            if (!gB.f9113a) {
                gB = gB.b();
            }
            gB.a();
            if (!g3.isEmpty()) {
                gB.putAll(g3);
            }
        }
        return gB;
    }

    public static void c(Object obj) {
        ((G) obj).f9113a = false;
    }
}

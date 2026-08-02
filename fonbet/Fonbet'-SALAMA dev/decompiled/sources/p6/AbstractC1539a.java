package p6;

import C0.C0090i;
import android.util.Log;
import i4.C1267d;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.g;
import k4.C1340b;
import r5.C1577b;
import v4.f;
import v4.h;
import v4.i;
import v4.j;
import v4.o;
import v4.r;
import v4.v;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1539a {
    public static r a(Object obj, r rVar) {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    rVar = c.k(null, map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return j.f17184e;
            }
            if (obj instanceof String) {
                return new v((String) obj, rVar);
            }
            if (obj instanceof Long) {
                return new o((Long) obj, rVar);
            }
            if (obj instanceof Integer) {
                return new o(Long.valueOf(((Integer) obj).intValue()), rVar);
            }
            if (obj instanceof Double) {
                return new i((Double) obj, rVar);
            }
            if (obj instanceof Boolean) {
                return new v4.a((Boolean) obj, rVar);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new C1267d("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new h(map2, rVar);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        r a2 = a(map2.get(str), j.f17184e);
                        if (!a2.isEmpty()) {
                            hashMap.put(v4.c.b(str), a2);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i7 = 0; i7 < list.size(); i7++) {
                    String str2 = "" + i7;
                    r a4 = a(list.get(i7), j.f17184e);
                    if (!a4.isEmpty()) {
                        hashMap.put(v4.c.b(str2), a4);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return j.f17184e;
            }
            C0090i c0090i = f.f17177d;
            return new f(hashMap.size() < 25 ? C1340b.G(new ArrayList(hashMap.keySet()), hashMap, c0090i) : g.h(new ArrayList(hashMap.keySet()), hashMap, c0090i), rVar);
        } catch (ClassCastException e7) {
            throw new C1267d("Failed to parse node", e7);
        }
    }

    public static final void e(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                Q0.a.c(th, th2);
            }
        }
    }

    public static void h(C1577b c1577b) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", C1577b.class).invoke(null, c1577b);
        } catch (Exception e7) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + c1577b + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e7);
        }
    }

    public abstract boolean b(s.g gVar, s.c cVar, s.c cVar2);

    public abstract boolean c(s.g gVar, Object obj, Object obj2);

    public abstract boolean d(s.g gVar, s.f fVar, s.f fVar2);

    public abstract void f(s.f fVar, s.f fVar2);

    public abstract void g(s.f fVar, Thread thread);
}

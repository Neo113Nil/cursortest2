package p115p6;

import C0.C0090i;
import android.util.Log;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p063i4.d;
import p072k1.g;
import p075k4.b;
import v4.c;
import v4.f;
import v4.h;
import v4.i;
import v4.j;
import v4.o;
import v4.r;
import v4.v;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static r a(Object obj, r rVar) {
        HashMap map;
        try {
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".priority")) {
                    rVar = c.k(null, map2.get(".priority"));
                }
                if (map2.containsKey(".value")) {
                    obj = map2.get(".value");
                }
            }
            if (obj == null) {
                return j.f17190e;
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
                throw new d("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map3 = (Map) obj;
                if (map3.containsKey(".sv")) {
                    return new h(map3, rVar);
                }
                map = new HashMap(map3.size());
                for (String str : map3.keySet()) {
                    if (!str.startsWith(".")) {
                        r rVarA = a(map3.get(str), j.f17190e);
                        if (!rVarA.isEmpty()) {
                            map.put(c.b(str), rVarA);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                map = new HashMap(list.size());
                for (int i7 = 0; i7 < list.size(); i7++) {
                    String str2 = "" + i7;
                    r rVarA2 = a(list.get(i7), j.f17190e);
                    if (!rVarA2.isEmpty()) {
                        map.put(c.b(str2), rVarA2);
                    }
                }
            }
            if (map.isEmpty()) {
                return j.f17190e;
            }
            C0090i c0090i = f.f17183d;
            return new f(map.size() < 25 ? b.G(new ArrayList(map.keySet()), map, c0090i) : g.h(new ArrayList(map.keySet()), map, c0090i), rVar);
        } catch (ClassCastException e7) {
            throw new d("Failed to parse node", e7);
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

    public static void h(p128r5.b bVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", p128r5.b.class).invoke(null, bVar);
        } catch (Exception e7) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + bVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e7);
        }
    }

    public abstract boolean b(p129s.g gVar, p129s.c cVar, p129s.c cVar2);

    public abstract boolean c(p129s.g gVar, Object obj, Object obj2);

    public abstract boolean d(p129s.g gVar, p129s.f fVar, p129s.f fVar2);

    public abstract void f(p129s.f fVar, p129s.f fVar2);

    public abstract void g(p129s.f fVar, Thread thread);
}

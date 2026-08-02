package G5;

import A1.C0042s;
import A5.o;
import A5.p;
import A5.q;
import A5.s;
import B.v;
import D3.j;
import D6.y0;
import E4.K;
import W5.AbstractC0486a1;
import W5.RunnableC0521m0;
import Y3.i;
import Y3.l;
import androidx.appcompat.widget.b1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d6.C0977k;
import e1.k;
import i4.C1265b;
import i4.C1267d;
import i4.C1269f;
import i4.C1271h;
import i4.RunnableC1268e;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.sentry.protocol.SentryThread;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import n4.C1468b;
import n4.C1471e;
import n4.C1473g;
import n4.C1479m;
import n4.RunnableC1476j;
import q4.h;
import r4.AbstractC1575b;
import s4.g;
import v4.m;
import v4.r;
import v4.t;
import v4.w;
import w5.C1782b;
import w5.InterfaceC1783c;

/* loaded from: classes2.dex */
public class d implements FlutterFirebasePlugin, InterfaceC1783c, q {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f3055e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f3056a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3057b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public s f3058c;

    /* renamed from: d, reason: collision with root package name */
    public A5.f f3059d;

    public static C1271h b(Map map) {
        C1271h c1271h;
        C1271h c3;
        String str = (String) map.get("appName");
        if (str == null) {
            str = "[DEFAULT]";
        }
        String str2 = (String) map.get("databaseURL");
        if (str2 == null) {
            str2 = "";
        }
        String concat = str.concat(str2);
        HashMap hashMap = f3055e;
        synchronized (hashMap) {
            c1271h = (C1271h) hashMap.get(concat);
        }
        if (c1271h != null) {
            return c1271h;
        }
        i f7 = i.f(str);
        if (str2.isEmpty()) {
            f7.b();
            l lVar = f7.f7665c;
            String str3 = lVar.f7674c;
            if (str3 == null) {
                f7.b();
                if (lVar.f7678g == null) {
                    throw new C1267d("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
                }
                StringBuilder sb = new StringBuilder("https://");
                f7.b();
                str3 = k.i(sb, lVar.f7678g, "-default-rtdb.firebaseio.com");
            }
            c3 = C1271h.c(f7, str3);
        } else {
            c3 = C1271h.c(f7, str2);
        }
        Boolean bool = (Boolean) map.get("loggingEnabled");
        Boolean bool2 = (Boolean) map.get("persistenceEnabled");
        String str4 = (String) map.get("emulatorHost");
        Integer num = (Integer) map.get("emulatorPort");
        Object obj = map.get("cacheSizeBytes");
        if (bool != null) {
            try {
                int i7 = bool.booleanValue() ? 1 : 5;
                synchronized (c3) {
                    c3.a("setLogLevel");
                    c3.f13997b.f(i7);
                }
            } catch (C1267d e7) {
                String message = e7.getMessage();
                if (message == null) {
                    throw e7;
                }
                if (!message.contains("must be made before any other usage of FirebaseDatabase")) {
                    throw e7;
                }
            }
        }
        if (str4 != null && num != null) {
            int intValue = num.intValue();
            if (c3.f13999d != null) {
                throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
            }
            c3.f13998c = new v(str4, intValue, 14);
        }
        if (bool2 != null) {
            boolean booleanValue = bool2.booleanValue();
            synchronized (c3) {
                c3.a("setPersistenceEnabled");
                C1471e c1471e = c3.f13997b;
                synchronized (c1471e) {
                    c1471e.a();
                    c1471e.f15408i = booleanValue;
                }
            }
        }
        if (obj != null) {
            if (obj instanceof Long) {
                c3.d(((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                c3.d(((Integer) obj).intValue());
            }
        }
        HashMap hashMap2 = f3055e;
        synchronized (hashMap2) {
            try {
                if (((C1271h) hashMap2.get(concat)) == null) {
                    hashMap2.put(concat, c3);
                }
            } finally {
            }
        }
        return c3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0022, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j c(Map map) {
        boolean z4;
        boolean z7;
        boolean z8;
        j jVar;
        j jVar2;
        j jVar3;
        j d7 = d(map);
        Object obj = map.get("modifiers");
        Objects.requireNonNull(obj);
        List<Map> list = (List) obj;
        if (!list.isEmpty()) {
            for (Map map2 : list) {
                Object obj2 = map2.get("type");
                Objects.requireNonNull(obj2);
                String str = (String) obj2;
                m mVar = m.f17189a;
                switch (str.hashCode()) {
                    case -1349119146:
                        if (str.equals("cursor")) {
                            z4 = false;
                            break;
                        }
                        z4 = -1;
                        break;
                    case -1207110587:
                        if (str.equals("orderBy")) {
                            z4 = true;
                            break;
                        }
                        z4 = -1;
                        break;
                    case 102976443:
                        if (str.equals("limit")) {
                            z4 = 2;
                            break;
                        }
                        z4 = -1;
                        break;
                    default:
                        z4 = -1;
                        break;
                }
                switch (z4) {
                    case false:
                        Object obj3 = map2.get("name");
                        Objects.requireNonNull(obj3);
                        String str2 = (String) obj3;
                        switch (str2.hashCode()) {
                            case -1897186251:
                                if (str2.equals("startAt")) {
                                    z7 = false;
                                    break;
                                }
                                z7 = -1;
                                break;
                            case -1601257830:
                                if (str2.equals("startAfter")) {
                                    z7 = true;
                                    break;
                                }
                                z7 = -1;
                                break;
                            case 96650862:
                                if (str2.equals("endAt")) {
                                    z7 = 2;
                                    break;
                                }
                                z7 = -1;
                                break;
                            case 1108304954:
                                if (str2.equals("endBefore")) {
                                    z7 = 3;
                                    break;
                                }
                                z7 = -1;
                                break;
                            default:
                                z7 = -1;
                                break;
                        }
                        switch (z7) {
                            case false:
                                Object obj4 = map2.get("value");
                                String str3 = (String) map2.get("key");
                                if (obj4 instanceof Boolean) {
                                    if (str3 == null) {
                                        Boolean bool = (Boolean) obj4;
                                        bool.booleanValue();
                                        d7.getClass();
                                        d7 = d7.m(null, new v4.a(bool, v4.j.f17184e));
                                        break;
                                    } else {
                                        Boolean bool2 = (Boolean) obj4;
                                        bool2.getClass();
                                        d7.getClass();
                                        d7 = d7.m(str3, new v4.a(bool2, v4.j.f17184e));
                                        break;
                                    }
                                } else if (obj4 instanceof Number) {
                                    if (str3 == null) {
                                        double doubleValue = ((Number) obj4).doubleValue();
                                        d7.getClass();
                                        d7 = d7.m(null, new v4.i(Double.valueOf(doubleValue), v4.j.f17184e));
                                        break;
                                    } else {
                                        double doubleValue2 = ((Number) obj4).doubleValue();
                                        d7.getClass();
                                        d7 = d7.m(str3, new v4.i(Double.valueOf(doubleValue2), v4.j.f17184e));
                                        break;
                                    }
                                } else if (str3 == null) {
                                    d7 = d7.l((String) obj4, null);
                                    break;
                                } else {
                                    d7 = d7.l((String) obj4, str3);
                                    break;
                                }
                            case true:
                                Object obj5 = map2.get("value");
                                String str4 = (String) map2.get("key");
                                if (obj5 instanceof Boolean) {
                                    if (str4 == null) {
                                        Boolean bool3 = (Boolean) obj5;
                                        bool3.booleanValue();
                                        d7.getClass();
                                        d7 = d7.m("[MAX_KEY]", new v4.a(bool3, v4.j.f17184e));
                                        break;
                                    } else {
                                        Boolean bool4 = (Boolean) obj5;
                                        bool4.getClass();
                                        d7.getClass();
                                        d7 = d7.m(h.b(str4), new v4.a(bool4, v4.j.f17184e));
                                        break;
                                    }
                                } else if (obj5 instanceof Number) {
                                    if (str4 == null) {
                                        double doubleValue3 = ((Number) obj5).doubleValue();
                                        d7.getClass();
                                        d7 = d7.m("[MAX_KEY]", new v4.i(Double.valueOf(doubleValue3), v4.j.f17184e));
                                        break;
                                    } else {
                                        double doubleValue4 = ((Number) obj5).doubleValue();
                                        d7.getClass();
                                        d7 = d7.m(h.b(str4), new v4.i(Double.valueOf(doubleValue4), v4.j.f17184e));
                                        break;
                                    }
                                } else if (str4 == null) {
                                    String str5 = (String) obj5;
                                    if (str5 == null || !((g) d7.f1726e).f16170g.equals(mVar)) {
                                        d7 = d7.l(str5, "[MAX_KEY]");
                                        break;
                                    } else {
                                        d7 = d7.l(h.b(str5), null);
                                        break;
                                    }
                                } else {
                                    String str6 = (String) obj5;
                                    if (str6 == null) {
                                        d7.getClass();
                                    } else if (((g) d7.f1726e).f16170g.equals(mVar)) {
                                        str6 = h.b(str6);
                                    }
                                    r vVar = str6 != null ? new v4.v(str6, v4.j.f17184e) : v4.j.f17184e;
                                    d7.getClass();
                                    d7 = d7.m(h.b(str4), vVar);
                                    break;
                                }
                                break;
                            case true:
                                Object obj6 = map2.get("value");
                                String str7 = (String) map2.get("key");
                                if (obj6 instanceof Boolean) {
                                    if (str7 == null) {
                                        Boolean bool5 = (Boolean) obj6;
                                        bool5.booleanValue();
                                        d7.getClass();
                                        d7 = d7.h(null, new v4.a(bool5, v4.j.f17184e));
                                        break;
                                    } else {
                                        Boolean bool6 = (Boolean) obj6;
                                        bool6.getClass();
                                        d7.getClass();
                                        d7 = d7.h(str7, new v4.a(bool6, v4.j.f17184e));
                                        break;
                                    }
                                } else if (obj6 instanceof Number) {
                                    if (str7 == null) {
                                        double doubleValue5 = ((Number) obj6).doubleValue();
                                        d7.getClass();
                                        d7 = d7.h(null, new v4.i(Double.valueOf(doubleValue5), v4.j.f17184e));
                                        break;
                                    } else {
                                        double doubleValue6 = ((Number) obj6).doubleValue();
                                        d7.getClass();
                                        d7 = d7.h(str7, new v4.i(Double.valueOf(doubleValue6), v4.j.f17184e));
                                        break;
                                    }
                                } else if (str7 == null) {
                                    d7 = d7.g((String) obj6, null);
                                    break;
                                } else {
                                    d7 = d7.g((String) obj6, str7);
                                    break;
                                }
                            case true:
                                Object obj7 = map2.get("value");
                                String str8 = (String) map2.get("key");
                                if (obj7 instanceof Boolean) {
                                    if (str8 == null) {
                                        Boolean bool7 = (Boolean) obj7;
                                        bool7.booleanValue();
                                        d7.getClass();
                                        d7 = d7.h("[MIN_NAME]", new v4.a(bool7, v4.j.f17184e));
                                        break;
                                    } else {
                                        Boolean bool8 = (Boolean) obj7;
                                        bool8.getClass();
                                        d7.getClass();
                                        d7 = d7.h(h.a(str8), new v4.a(bool8, v4.j.f17184e));
                                        break;
                                    }
                                } else if (obj7 instanceof Number) {
                                    if (str8 == null) {
                                        double doubleValue7 = ((Number) obj7).doubleValue();
                                        d7.getClass();
                                        d7 = d7.h("[MIN_NAME]", new v4.i(Double.valueOf(doubleValue7), v4.j.f17184e));
                                        break;
                                    } else {
                                        double doubleValue8 = ((Number) obj7).doubleValue();
                                        d7.getClass();
                                        d7 = d7.h(h.a(str8), new v4.i(Double.valueOf(doubleValue8), v4.j.f17184e));
                                        break;
                                    }
                                } else if (str8 == null) {
                                    String str9 = (String) obj7;
                                    if (str9 == null || !((g) d7.f1726e).f16170g.equals(mVar)) {
                                        d7 = d7.g(str9, "[MIN_NAME]");
                                        break;
                                    } else {
                                        d7 = d7.g(h.a(str9), null);
                                        break;
                                    }
                                } else {
                                    String str10 = (String) obj7;
                                    if (str10 == null) {
                                        d7.getClass();
                                    } else if (((g) d7.f1726e).f16170g.equals(mVar)) {
                                        str10 = h.a(str10);
                                    }
                                    r vVar2 = str10 != null ? new v4.v(str10, v4.j.f17184e) : v4.j.f17184e;
                                    d7.getClass();
                                    d7 = d7.h(h.a(str8), vVar2);
                                    break;
                                }
                        }
                    case true:
                        Object obj8 = map2.get("name");
                        Objects.requireNonNull(obj8);
                        String str11 = (String) obj8;
                        switch (str11.hashCode()) {
                            case -626148087:
                                if (str11.equals("orderByPriority")) {
                                    z8 = false;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case 729747418:
                                if (str11.equals("orderByKey")) {
                                    z8 = true;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case 1200288727:
                                if (str11.equals("orderByChild")) {
                                    z8 = 2;
                                    break;
                                }
                                z8 = -1;
                                break;
                            case 1217630252:
                                if (str11.equals("orderByValue")) {
                                    z8 = 3;
                                    break;
                                }
                                z8 = -1;
                                break;
                            default:
                                z8 = -1;
                                break;
                        }
                        switch (z8) {
                            case false:
                                d7.o();
                                t tVar = t.f17199a;
                                g a2 = ((g) d7.f1726e).a();
                                a2.f16170g = tVar;
                                j.p(a2);
                                jVar = new j((C1479m) d7.f1723b, (C1473g) d7.f1725d, a2, true);
                                d7 = jVar;
                                break;
                            case true:
                                d7.o();
                                g a4 = ((g) d7.f1726e).a();
                                a4.f16170g = mVar;
                                j.p(a4);
                                jVar2 = new j((C1479m) d7.f1723b, (C1473g) d7.f1725d, a4, true);
                                d7 = jVar2;
                                break;
                            case true:
                                Object obj9 = map2.get("path");
                                Objects.requireNonNull(obj9);
                                String str12 = (String) obj9;
                                d7.getClass();
                                if (str12.equals("$key") || str12.equals(".key")) {
                                    throw new IllegalArgumentException(AbstractC0486a1.h("Can't use '", str12, "' as path, please use orderByKey() instead!"));
                                }
                                if (str12.equals("$priority") || str12.equals(".priority")) {
                                    throw new IllegalArgumentException(AbstractC0486a1.h("Can't use '", str12, "' as path, please use orderByPriority() instead!"));
                                }
                                if (str12.equals("$value") || str12.equals(".value")) {
                                    throw new IllegalArgumentException(AbstractC0486a1.h("Can't use '", str12, "' as path, please use orderByValue() instead!"));
                                }
                                q4.l.c(str12);
                                d7.o();
                                C1473g c1473g = new C1473g(str12);
                                if (c1473g.size() == 0) {
                                    throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
                                }
                                v4.s sVar = new v4.s(c1473g);
                                g a7 = ((g) d7.f1726e).a();
                                a7.f16170g = sVar;
                                jVar2 = new j((C1479m) d7.f1723b, (C1473g) d7.f1725d, a7, true);
                                d7 = jVar2;
                                break;
                                break;
                            case true:
                                d7.o();
                                w wVar = w.f17204a;
                                g a8 = ((g) d7.f1726e).a();
                                a8.f16170g = wVar;
                                jVar = new j((C1479m) d7.f1723b, (C1473g) d7.f1725d, a8, true);
                                d7 = jVar;
                                break;
                        }
                    case true:
                        Object obj10 = map2.get("name");
                        Objects.requireNonNull(obj10);
                        String str13 = (String) obj10;
                        Object obj11 = map2.get("limit");
                        Objects.requireNonNull(obj11);
                        Integer num = (Integer) obj11;
                        int intValue = num.intValue();
                        if ("limitToFirst".equals(str13)) {
                            if (intValue <= 0) {
                                d7.getClass();
                                throw new IllegalArgumentException("Limit must be a positive integer!");
                            }
                            g gVar = (g) d7.f1726e;
                            if (gVar.d()) {
                                throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
                            }
                            g a9 = gVar.a();
                            a9.f16164a = num;
                            a9.f16165b = 1;
                            jVar3 = new j((C1479m) d7.f1723b, (C1473g) d7.f1725d, a9, d7.f1724c);
                        } else if (!"limitToLast".equals(str13)) {
                            continue;
                        } else {
                            if (intValue <= 0) {
                                d7.getClass();
                                throw new IllegalArgumentException("Limit must be a positive integer!");
                            }
                            g gVar2 = (g) d7.f1726e;
                            if (gVar2.d()) {
                                throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
                            }
                            g a10 = gVar2.a();
                            a10.f16164a = num;
                            a10.f16165b = 2;
                            jVar3 = new j((C1479m) d7.f1723b, (C1473g) d7.f1725d, a10, d7.f1724c);
                        }
                        d7 = jVar3;
                        break;
                }
            }
        }
        return d7;
    }

    public static C1269f d(Map map) {
        C1271h b7 = b(map);
        Object obj = map.get("path");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        b7.b();
        q4.l.d(str);
        return new C1269f(b7.f13999d, new C1473g(str));
    }

    public final void a() {
        HashMap hashMap = this.f3057b;
        for (A5.j jVar : hashMap.keySet()) {
            A5.i iVar = (A5.i) hashMap.get(jVar);
            if (iVar != null) {
                iVar.b();
                jVar.a(null);
            }
        }
        hashMap.clear();
        f3055e.clear();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new A0.f(15, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(i iVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new F5.d(1, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        A5.f fVar = c1782b.f18077c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_database", this);
        this.f3059d = fVar;
        s sVar = new s(fVar, "plugins.flutter.io/firebase_database");
        this.f3058c = sVar;
        sVar.b(this);
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f3058c.b(null);
        a();
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, A5.r rVar) {
        final int i7;
        final int i8;
        final int i9;
        final int i10;
        final int i11;
        final int i12;
        final int i13;
        final int i14;
        final int i15;
        final int i16;
        final int i17;
        final Map map;
        Task task;
        i7 = 14;
        i8 = 13;
        i9 = 10;
        i10 = 8;
        i11 = 7;
        i12 = 6;
        i13 = 4;
        i14 = 2;
        i15 = 1;
        i16 = 0;
        i17 = 3;
        map = (Map) oVar.f677b;
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "DatabaseReference#runTransaction":
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                final int i18 = 11;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i19 = 2;
                        int i20 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        Map map2 = map;
                        switch (i18) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource2.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource2.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i21 = dVar.f3056a;
                                    dVar.f3056a = 1 + i21;
                                    sb.append(i21);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource2.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource2.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i20));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource2.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource2.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource2.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource3, c1479m2, 18, false));
                                    taskCompletionSource2.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource3.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource2.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource2.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource2.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource2.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource2.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i19, d11, mVar, booleanValue2));
                                    taskCompletionSource2.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource2.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource2.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i19));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource2.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource2.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource.getTask();
                break;
            case "DatabaseReference#setPriority":
                final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                final int i19 = 5;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i20 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource2;
                        Map map2 = map;
                        switch (i19) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i21 = dVar.f3056a;
                                    dVar.f3056a = 1 + i21;
                                    sb.append(i21);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i20));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource3, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource3.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource2.getTask();
                break;
            case "FirebaseDatabase#purgeOutstandingWrites":
                final TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                final int i20 = 9;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource3;
                        Map map2 = map;
                        switch (i20) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i21 = dVar.f3056a;
                                    dVar.f3056a = 1 + i21;
                                    sb.append(i21);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource3.getTask();
                break;
            case "DatabaseReference#setWithPriority":
                final TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                final int i21 = 12;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource4;
                        Map map2 = map;
                        switch (i21) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource4.getTask();
                break;
            case "DatabaseReference#update":
                final TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource5;
                        Map map2 = map;
                        switch (i11) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource5.getTask();
                break;
            case "FirebaseDatabase#goOffline":
                final TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource6;
                        Map map2 = map;
                        switch (i17) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource6.getTask();
                break;
            case "OnDisconnect#set":
                final TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource7;
                        Map map2 = map;
                        switch (i7) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource7.getTask();
                break;
            case "OnDisconnect#cancel":
                final TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource8;
                        Map map2 = map;
                        switch (i16) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource8.getTask();
                break;
            case "Query#get":
                final TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource9;
                        Map map2 = map;
                        switch (i12) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource9.getTask();
                break;
            case "Query#keepSynced":
                final TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource10;
                        Map map2 = map;
                        switch (i15) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource10.getTask();
                break;
            case "OnDisconnect#update":
                final TaskCompletionSource taskCompletionSource11 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource11;
                        Map map2 = map;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource11.getTask();
                break;
            case "DatabaseReference#set":
                final TaskCompletionSource taskCompletionSource12 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource12;
                        Map map2 = map;
                        switch (i13) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource12.getTask();
                break;
            case "OnDisconnect#setWithPriority":
                final TaskCompletionSource taskCompletionSource13 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource13;
                        Map map2 = map;
                        switch (i9) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource13.getTask();
                break;
            case "FirebaseDatabase#goOnline":
                final TaskCompletionSource taskCompletionSource14 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource14;
                        Map map2 = map;
                        switch (i8) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource14.getTask();
                break;
            case "Query#observe":
                final TaskCompletionSource taskCompletionSource15 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task o7;
                        int i192 = 2;
                        int i202 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource15;
                        Map map2 = map;
                        switch (i14) {
                            case 0:
                                HashMap hashMap = d.f3055e;
                                dVar.getClass();
                                try {
                                    C0977k r7 = d.d(map2).r();
                                    q4.e h6 = q4.k.h();
                                    ((C1479m) r7.f12441b).q(new y0(27, r7, h6, false));
                                    Tasks.await((Task) h6.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap hashMap2 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c3 = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    C1473g c1473g = (C1473g) c3.f1725d;
                                    if (!c1473g.isEmpty() && c1473g.B().equals(v4.c.f17172e)) {
                                        throw new C1267d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C1479m) c3.f1723b).q(new E2.g(c3, booleanValue, 3));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource22.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap hashMap3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c4 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i212 = dVar.f3056a;
                                    dVar.f3056a = 1 + i212;
                                    sb.append(i212);
                                    String sb2 = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, sb2);
                                    b bVar = new b(c4, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource22.setResult(sb2);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource22.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap hashMap4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b7 = d.b(map2);
                                    b7.b();
                                    C1479m c1479m = b7.f13999d;
                                    n4.o oVar2 = n4.o.f15465b;
                                    c1479m.q(new RunnableC1476j(c1479m, i202));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap hashMap5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d7 = d.d(map2);
                                    Tasks.await(d7.s(map2.get("value"), p6.c.k((C1473g) d7.f1725d, null)));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource22.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap hashMap6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d8 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C1473g c1473g2 = (C1473g) d8.f1725d;
                                    r k7 = p6.c.k(c1473g2, obj2);
                                    q4.l.f(c1473g2);
                                    q4.e h7 = q4.k.h();
                                    ((C1479m) d8.f1723b).q(new RunnableC1268e(d8, k7, h7, 1));
                                    Tasks.await((Task) h7.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource22.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap hashMap7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j c7 = d.c(map2);
                                    C1479m c1479m2 = (C1479m) c7.f1723b;
                                    c1479m2.getClass();
                                    TaskCompletionSource taskCompletionSource32 = new TaskCompletionSource();
                                    c1479m2.q(new A2.c(c1479m2, c7, taskCompletionSource32, c1479m2, 18, false));
                                    taskCompletionSource22.setResult((HashMap) new u1.c((C1265b) Tasks.await(taskCompletionSource32.getTask())).f16591b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource22.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap hashMap8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d9 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object a2 = AbstractC1575b.a((Map) obj3);
                                    q4.k.c(a2 instanceof Map);
                                    Map map3 = (Map) a2;
                                    C1468b A7 = C1468b.A(q4.l.a((C1473g) d9.f1725d, map3));
                                    q4.e h8 = q4.k.h();
                                    ((C1479m) d9.f1723b).q(new A2.c(d9, A7, h8, map3, 13, false));
                                    Tasks.await((Task) h8.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource22.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap hashMap9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d10 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map4 = (Map) obj4;
                                    C0977k r8 = d10.r();
                                    TreeMap a4 = q4.l.a((C1473g) r8.f12442c, map4);
                                    q4.e h9 = q4.k.h();
                                    ((C1479m) r8.f12441b).q(new A2.c(r8, a4, h9, map4, 14, false));
                                    Tasks.await((Task) h9.f15857a);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource22.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap hashMap10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b8 = d.b(map2);
                                    b8.b();
                                    b8.f13999d.q(new b1(b8, 11));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource22.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap hashMap11 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0977k r9 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        o7 = r9.o(obj5, p6.c.k((C1473g) r9.f12442c, null));
                                    }
                                    Tasks.await(o7);
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource22.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap hashMap12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d11 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int intValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, intValue);
                                    q4.l.f((C1473g) d11.f1725d);
                                    ((C1479m) d11.f1723b).q(new RunnableC0521m0(i192, d11, mVar, booleanValue2));
                                    taskCompletionSource22.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource22.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap hashMap13 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1269f d12 = d.d(map2);
                                    Tasks.await(d12.s(map2.get("value"), p6.c.k((C1473g) d12.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource22.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap hashMap14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    C1271h b9 = d.b(map2);
                                    b9.b();
                                    C1479m c1479m3 = b9.f13999d;
                                    n4.o oVar3 = n4.o.f15465b;
                                    c1479m3.q(new RunnableC1476j(c1479m3, i192));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource22.setException(e20);
                                    return;
                                }
                            default:
                                HashMap hashMap15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17184e));
                                    taskCompletionSource22.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource22.setException(e21);
                                    return;
                                }
                        }
                    }
                });
                task = taskCompletionSource15.getTask();
                break;
            default:
                ((p) rVar).notImplemented();
                return;
        }
        task.addOnCompleteListener(new K(3, (p) rVar, oVar));
    }
}

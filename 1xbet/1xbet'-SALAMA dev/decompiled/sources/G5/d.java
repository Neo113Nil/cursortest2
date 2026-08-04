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
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.sentry.protocol.SentryThread;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import p031e1.k;
import p063i4.h;
import p098n4.C0929b;
import p098n4.C0932e;
import p098n4.C0934g;
import p098n4.C0940m;
import p098n4.RunnableC0937j;
import p134s4.g;
import v4.m;
import v4.r;
import v4.t;
import v4.w;

/* JADX INFO: loaded from: classes2.dex */
public class d implements FlutterFirebasePlugin, p159w5.c, q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f3055e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3056a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3057b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f3058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A5.f f3059d;

    /* JADX WARN: Code duplicated, block: B:44:0x00b6 A[Catch: d -> 0x00a8, TryCatch #3 {d -> 0x00a8, blocks: (B:27:0x008f, B:31:0x0098, B:33:0x00a3, B:37:0x00a7, B:42:0x00ae, B:44:0x00b6, B:45:0x00c0, B:46:0x00c7, B:48:0x00ca, B:49:0x00ce, B:54:0x00dd, B:61:0x00e4, B:63:0x00e7, B:65:0x00eb, B:66:0x00f5, B:68:0x00f9, B:50:0x00cf, B:51:0x00d6, B:53:0x00dc, B:58:0x00e1, B:52:0x00d7, B:32:0x0099), top: B:96:0x008f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0 A[Catch: d -> 0x00a8, TryCatch #3 {d -> 0x00a8, blocks: (B:27:0x008f, B:31:0x0098, B:33:0x00a3, B:37:0x00a7, B:42:0x00ae, B:44:0x00b6, B:45:0x00c0, B:46:0x00c7, B:48:0x00ca, B:49:0x00ce, B:54:0x00dd, B:61:0x00e4, B:63:0x00e7, B:65:0x00eb, B:66:0x00f5, B:68:0x00f9, B:50:0x00cf, B:51:0x00d6, B:53:0x00dc, B:58:0x00e1, B:52:0x00d7, B:32:0x0099), top: B:96:0x008f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca A[Catch: d -> 0x00a8, TryCatch #3 {d -> 0x00a8, blocks: (B:27:0x008f, B:31:0x0098, B:33:0x00a3, B:37:0x00a7, B:42:0x00ae, B:44:0x00b6, B:45:0x00c0, B:46:0x00c7, B:48:0x00ca, B:49:0x00ce, B:54:0x00dd, B:61:0x00e4, B:63:0x00e7, B:65:0x00eb, B:66:0x00f5, B:68:0x00f9, B:50:0x00cf, B:51:0x00d6, B:53:0x00dc, B:58:0x00e1, B:52:0x00d7, B:32:0x0099), top: B:96:0x008f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7 A[Catch: d -> 0x00a8, TryCatch #3 {d -> 0x00a8, blocks: (B:27:0x008f, B:31:0x0098, B:33:0x00a3, B:37:0x00a7, B:42:0x00ae, B:44:0x00b6, B:45:0x00c0, B:46:0x00c7, B:48:0x00ca, B:49:0x00ce, B:54:0x00dd, B:61:0x00e4, B:63:0x00e7, B:65:0x00eb, B:66:0x00f5, B:68:0x00f9, B:50:0x00cf, B:51:0x00d6, B:53:0x00dc, B:58:0x00e1, B:52:0x00d7, B:32:0x0099), top: B:96:0x008f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb A[Catch: d -> 0x00a8, TryCatch #3 {d -> 0x00a8, blocks: (B:27:0x008f, B:31:0x0098, B:33:0x00a3, B:37:0x00a7, B:42:0x00ae, B:44:0x00b6, B:45:0x00c0, B:46:0x00c7, B:48:0x00ca, B:49:0x00ce, B:54:0x00dd, B:61:0x00e4, B:63:0x00e7, B:65:0x00eb, B:66:0x00f5, B:68:0x00f9, B:50:0x00cf, B:51:0x00d6, B:53:0x00dc, B:58:0x00e1, B:52:0x00d7, B:32:0x0099), top: B:96:0x008f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5 A[Catch: d -> 0x00a8, TryCatch #3 {d -> 0x00a8, blocks: (B:27:0x008f, B:31:0x0098, B:33:0x00a3, B:37:0x00a7, B:42:0x00ae, B:44:0x00b6, B:45:0x00c0, B:46:0x00c7, B:48:0x00ca, B:49:0x00ce, B:54:0x00dd, B:61:0x00e4, B:63:0x00e7, B:65:0x00eb, B:66:0x00f5, B:68:0x00f9, B:50:0x00cf, B:51:0x00d6, B:53:0x00dc, B:58:0x00e1, B:52:0x00d7, B:32:0x0099), top: B:96:0x008f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9 A[Catch: d -> 0x00a8, TRY_LEAVE, TryCatch #3 {d -> 0x00a8, blocks: (B:27:0x008f, B:31:0x0098, B:33:0x00a3, B:37:0x00a7, B:42:0x00ae, B:44:0x00b6, B:45:0x00c0, B:46:0x00c7, B:48:0x00ca, B:49:0x00ce, B:54:0x00dd, B:61:0x00e4, B:63:0x00e7, B:65:0x00eb, B:66:0x00f5, B:68:0x00f9, B:50:0x00cf, B:51:0x00d6, B:53:0x00dc, B:58:0x00e1, B:52:0x00d7, B:32:0x0099), top: B:96:0x008f, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static h b(Map map) {
        h hVar;
        h hVarC;
        boolean zBooleanValue;
        C0932e c0932e;
        int iIntValue;
        String str = (String) map.get("appName");
        if (str == null) {
            str = "[DEFAULT]";
        }
        String str2 = (String) map.get("databaseURL");
        if (str2 == null) {
            str2 = "";
        }
        String strConcat = str.concat(str2);
        HashMap map2 = f3055e;
        synchronized (map2) {
            hVar = (h) map2.get(strConcat);
        }
        if (hVar != null) {
            return hVar;
        }
        i iVarF = i.f(str);
        if (str2.isEmpty()) {
            iVarF.b();
            l lVar = iVarF.f7665c;
            String strI = lVar.f7674c;
            if (strI == null) {
                iVarF.b();
                if (lVar.f7678g == null) {
                    throw new p063i4.d("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
                }
                StringBuilder sb = new StringBuilder("https://");
                iVarF.b();
                strI = k.i(sb, lVar.f7678g, "-default-rtdb.firebaseio.com");
            }
            hVarC = h.c(iVarF, strI);
        } else {
            hVarC = h.c(iVarF, str2);
        }
        Boolean bool = (Boolean) map.get("loggingEnabled");
        Boolean bool2 = (Boolean) map.get("persistenceEnabled");
        String str3 = (String) map.get("emulatorHost");
        Integer num = (Integer) map.get("emulatorPort");
        Object obj = map.get("cacheSizeBytes");
        if (bool != null) {
            try {
                int i7 = bool.booleanValue() ? 1 : 5;
                synchronized (hVarC) {
                    hVarC.a("setLogLevel");
                    hVarC.f14003b.f(i7);
                }
                if (str3 != null && num != null) {
                    iIntValue = num.intValue();
                    if (hVarC.f14005d == null) {
                        throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
                    }
                    hVarC.f14004c = new v(str3, iIntValue, 14);
                }
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                    synchronized (hVarC) {
                        hVarC.a("setPersistenceEnabled");
                        c0932e = hVarC.f14003b;
                        synchronized (c0932e) {
                            c0932e.a();
                            c0932e.f15414i = zBooleanValue;
                        }
                    }
                }
                if (obj != null) {
                    if (obj instanceof Long) {
                        hVarC.d(((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        hVarC.d(((Integer) obj).intValue());
                    }
                }
            } catch (p063i4.d e7) {
                String message = e7.getMessage();
                if (message == null || !message.contains("must be made before any other usage of FirebaseDatabase")) {
                    throw e7;
                }
            }
        } else {
            if (str3 != null) {
                iIntValue = num.intValue();
                if (hVarC.f14005d == null) {
                    throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
                }
                hVarC.f14004c = new v(str3, iIntValue, 14);
            }
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
                synchronized (hVarC) {
                    hVarC.a("setPersistenceEnabled");
                    c0932e = hVarC.f14003b;
                    synchronized (c0932e) {
                        c0932e.a();
                        c0932e.f15414i = zBooleanValue;
                    }
                }
            }
            if (obj != null) {
                if (obj instanceof Long) {
                    hVarC.d(((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    hVarC.d(((Integer) obj).intValue());
                }
            }
        }
        HashMap map3 = f3055e;
        synchronized (map3) {
            try {
                if (((h) map3.get(strConcat)) == null) {
                    map3.put(strConcat, hVarC);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVarC;
    }

    public static j c(Map map) {
        j jVar;
        j jVar2;
        j jVar3;
        j jVarD = d(map);
        Object obj = map.get("modifiers");
        Objects.requireNonNull(obj);
        List<Map> list = (List) obj;
        if (!list.isEmpty()) {
            for (Map map2 : list) {
                Object obj2 = map2.get("type");
                Objects.requireNonNull(obj2);
                String str = (String) obj2;
                m mVar = m.f17195a;
                switch (str) {
                    case "cursor":
                        Object obj3 = map2.get("name");
                        Objects.requireNonNull(obj3);
                        switch ((String) obj3) {
                            case "startAt":
                                Object obj4 = map2.get("value");
                                String str2 = (String) map2.get("key");
                                if (!(obj4 instanceof Boolean)) {
                                    if (obj4 instanceof Number) {
                                        if (str2 == null) {
                                            double dDoubleValue = ((Number) obj4).doubleValue();
                                            jVarD.getClass();
                                            jVarD = jVarD.m(null, new v4.i(Double.valueOf(dDoubleValue), v4.j.f17190e));
                                        } else {
                                            double dDoubleValue2 = ((Number) obj4).doubleValue();
                                            jVarD.getClass();
                                            jVarD = jVarD.m(str2, new v4.i(Double.valueOf(dDoubleValue2), v4.j.f17190e));
                                        }
                                    } else if (str2 == null) {
                                        jVarD = jVarD.l((String) obj4, null);
                                    } else {
                                        jVarD = jVarD.l((String) obj4, str2);
                                    }
                                    break;
                                } else {
                                    if (str2 == null) {
                                        Boolean bool = (Boolean) obj4;
                                        bool.booleanValue();
                                        jVarD.getClass();
                                        jVarD = jVarD.m(null, new v4.a(bool, v4.j.f17190e));
                                    } else {
                                        Boolean bool2 = (Boolean) obj4;
                                        bool2.getClass();
                                        jVarD.getClass();
                                        jVarD = jVarD.m(str2, new v4.a(bool2, v4.j.f17190e));
                                    }
                                    break;
                                }
                                break;
                            case "startAfter":
                                Object obj5 = map2.get("value");
                                String str3 = (String) map2.get("key");
                                if (!(obj5 instanceof Boolean)) {
                                    if (obj5 instanceof Number) {
                                        if (str3 == null) {
                                            double dDoubleValue3 = ((Number) obj5).doubleValue();
                                            jVarD.getClass();
                                            jVarD = jVarD.m("[MAX_KEY]", new v4.i(Double.valueOf(dDoubleValue3), v4.j.f17190e));
                                        } else {
                                            double dDoubleValue4 = ((Number) obj5).doubleValue();
                                            jVarD.getClass();
                                            jVarD = jVarD.m(p120q4.h.b(str3), new v4.i(Double.valueOf(dDoubleValue4), v4.j.f17190e));
                                        }
                                    } else if (str3 == null) {
                                        String str4 = (String) obj5;
                                        jVarD = (str4 == null || !((g) jVarD.f1726e).f16176g.equals(mVar)) ? jVarD.l(str4, "[MAX_KEY]") : jVarD.l(p120q4.h.b(str4), null);
                                    } else {
                                        String strB = (String) obj5;
                                        if (strB == null) {
                                            jVarD.getClass();
                                        } else if (((g) jVarD.f1726e).f16176g.equals(mVar)) {
                                            strB = p120q4.h.b(strB);
                                        }
                                        r vVar = strB != null ? new v4.v(strB, v4.j.f17190e) : v4.j.f17190e;
                                        jVarD.getClass();
                                        jVarD = jVarD.m(p120q4.h.b(str3), vVar);
                                    }
                                    break;
                                } else {
                                    if (str3 == null) {
                                        Boolean bool3 = (Boolean) obj5;
                                        bool3.booleanValue();
                                        jVarD.getClass();
                                        jVarD = jVarD.m("[MAX_KEY]", new v4.a(bool3, v4.j.f17190e));
                                    } else {
                                        Boolean bool4 = (Boolean) obj5;
                                        bool4.getClass();
                                        jVarD.getClass();
                                        jVarD = jVarD.m(p120q4.h.b(str3), new v4.a(bool4, v4.j.f17190e));
                                    }
                                    break;
                                }
                                break;
                            case "endAt":
                                Object obj6 = map2.get("value");
                                String str5 = (String) map2.get("key");
                                if (!(obj6 instanceof Boolean)) {
                                    if (obj6 instanceof Number) {
                                        if (str5 == null) {
                                            double dDoubleValue5 = ((Number) obj6).doubleValue();
                                            jVarD.getClass();
                                            jVarD = jVarD.h(null, new v4.i(Double.valueOf(dDoubleValue5), v4.j.f17190e));
                                        } else {
                                            double dDoubleValue6 = ((Number) obj6).doubleValue();
                                            jVarD.getClass();
                                            jVarD = jVarD.h(str5, new v4.i(Double.valueOf(dDoubleValue6), v4.j.f17190e));
                                        }
                                    } else if (str5 == null) {
                                        jVarD = jVarD.g((String) obj6, null);
                                    } else {
                                        jVarD = jVarD.g((String) obj6, str5);
                                    }
                                    break;
                                } else {
                                    if (str5 == null) {
                                        Boolean bool5 = (Boolean) obj6;
                                        bool5.booleanValue();
                                        jVarD.getClass();
                                        jVarD = jVarD.h(null, new v4.a(bool5, v4.j.f17190e));
                                    } else {
                                        Boolean bool6 = (Boolean) obj6;
                                        bool6.getClass();
                                        jVarD.getClass();
                                        jVarD = jVarD.h(str5, new v4.a(bool6, v4.j.f17190e));
                                    }
                                    break;
                                }
                                break;
                            case "endBefore":
                                Object obj7 = map2.get("value");
                                String str6 = (String) map2.get("key");
                                if (!(obj7 instanceof Boolean)) {
                                    if (obj7 instanceof Number) {
                                        if (str6 == null) {
                                            double dDoubleValue7 = ((Number) obj7).doubleValue();
                                            jVarD.getClass();
                                            jVarD = jVarD.h("[MIN_NAME]", new v4.i(Double.valueOf(dDoubleValue7), v4.j.f17190e));
                                        } else {
                                            double dDoubleValue8 = ((Number) obj7).doubleValue();
                                            jVarD.getClass();
                                            jVarD = jVarD.h(p120q4.h.a(str6), new v4.i(Double.valueOf(dDoubleValue8), v4.j.f17190e));
                                        }
                                    } else if (str6 == null) {
                                        String str7 = (String) obj7;
                                        jVarD = (str7 == null || !((g) jVarD.f1726e).f16176g.equals(mVar)) ? jVarD.g(str7, "[MIN_NAME]") : jVarD.g(p120q4.h.a(str7), null);
                                    } else {
                                        String strA = (String) obj7;
                                        if (strA == null) {
                                            jVarD.getClass();
                                        } else if (((g) jVarD.f1726e).f16176g.equals(mVar)) {
                                            strA = p120q4.h.a(strA);
                                        }
                                        r vVar2 = strA != null ? new v4.v(strA, v4.j.f17190e) : v4.j.f17190e;
                                        jVarD.getClass();
                                        jVarD = jVarD.h(p120q4.h.a(str6), vVar2);
                                    }
                                    break;
                                } else {
                                    if (str6 == null) {
                                        Boolean bool7 = (Boolean) obj7;
                                        bool7.booleanValue();
                                        jVarD.getClass();
                                        jVarD = jVarD.h("[MIN_NAME]", new v4.a(bool7, v4.j.f17190e));
                                    } else {
                                        Boolean bool8 = (Boolean) obj7;
                                        bool8.getClass();
                                        jVarD.getClass();
                                        jVarD = jVarD.h(p120q4.h.a(str6), new v4.a(bool8, v4.j.f17190e));
                                    }
                                    break;
                                }
                                break;
                        }
                        break;
                    case "orderBy":
                        Object obj8 = map2.get("name");
                        Objects.requireNonNull(obj8);
                        switch ((String) obj8) {
                            case "orderByPriority":
                                jVarD.o();
                                t tVar = t.f17205a;
                                g gVarA = ((g) jVarD.f1726e).a();
                                gVarA.f16176g = tVar;
                                j.p(gVarA);
                                jVar = new j((C0940m) jVarD.f1723b, (C0934g) jVarD.f1725d, gVarA, true);
                                jVarD = jVar;
                                break;
                            case "orderByKey":
                                jVarD.o();
                                g gVarA2 = ((g) jVarD.f1726e).a();
                                gVarA2.f16176g = mVar;
                                j.p(gVarA2);
                                jVar2 = new j((C0940m) jVarD.f1723b, (C0934g) jVarD.f1725d, gVarA2, true);
                                jVarD = jVar2;
                                break;
                            case "orderByChild":
                                Object obj9 = map2.get("path");
                                Objects.requireNonNull(obj9);
                                String str8 = (String) obj9;
                                jVarD.getClass();
                                if (str8.equals("$key") || str8.equals(".key")) {
                                    throw new IllegalArgumentException(AbstractC0486a1.h("Can't use '", str8, "' as path, please use orderByKey() instead!"));
                                }
                                if (str8.equals("$priority") || str8.equals(".priority")) {
                                    throw new IllegalArgumentException(AbstractC0486a1.h("Can't use '", str8, "' as path, please use orderByPriority() instead!"));
                                }
                                if (str8.equals("$value") || str8.equals(".value")) {
                                    throw new IllegalArgumentException(AbstractC0486a1.h("Can't use '", str8, "' as path, please use orderByValue() instead!"));
                                }
                                p120q4.l.c(str8);
                                jVarD.o();
                                C0934g c0934g = new C0934g(str8);
                                if (c0934g.size() == 0) {
                                    throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
                                }
                                v4.s sVar = new v4.s(c0934g);
                                g gVarA3 = ((g) jVarD.f1726e).a();
                                gVarA3.f16176g = sVar;
                                jVar2 = new j((C0940m) jVarD.f1723b, (C0934g) jVarD.f1725d, gVarA3, true);
                                jVarD = jVar2;
                                break;
                                break;
                            case "orderByValue":
                                jVarD.o();
                                w wVar = w.f17210a;
                                g gVarA4 = ((g) jVarD.f1726e).a();
                                gVarA4.f16176g = wVar;
                                jVar = new j((C0940m) jVarD.f1723b, (C0934g) jVarD.f1725d, gVarA4, true);
                                jVarD = jVar;
                                break;
                            default:
                                continue;
                                break;
                        }
                        break;
                    case "limit":
                        Object obj10 = map2.get("name");
                        Objects.requireNonNull(obj10);
                        String str9 = (String) obj10;
                        Object obj11 = map2.get("limit");
                        Objects.requireNonNull(obj11);
                        Integer num = (Integer) obj11;
                        int iIntValue = num.intValue();
                        if (!"limitToFirst".equals(str9)) {
                            if (!"limitToLast".equals(str9)) {
                                continue;
                            } else {
                                if (iIntValue <= 0) {
                                    jVarD.getClass();
                                    throw new IllegalArgumentException("Limit must be a positive integer!");
                                }
                                g gVar = (g) jVarD.f1726e;
                                if (gVar.d()) {
                                    throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
                                }
                                g gVarA5 = gVar.a();
                                gVarA5.f16170a = num;
                                gVarA5.f16171b = 2;
                                jVar3 = new j((C0940m) jVarD.f1723b, (C0934g) jVarD.f1725d, gVarA5, jVarD.f1724c);
                            }
                            break;
                        } else {
                            if (iIntValue <= 0) {
                                jVarD.getClass();
                                throw new IllegalArgumentException("Limit must be a positive integer!");
                            }
                            g gVar2 = (g) jVarD.f1726e;
                            if (gVar2.d()) {
                                throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
                            }
                            g gVarA6 = gVar2.a();
                            gVarA6.f16170a = num;
                            gVarA6.f16171b = 1;
                            jVar3 = new j((C0940m) jVarD.f1723b, (C0934g) jVarD.f1725d, gVarA6, jVarD.f1724c);
                        }
                        jVarD = jVar3;
                        break;
                }
            }
        }
        return jVarD;
    }

    public static p063i4.f d(Map map) {
        h hVarB = b(map);
        Object obj = map.get("path");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        hVarB.b();
        p120q4.l.d(str);
        return new p063i4.f(hVarB.f14005d, new C0934g(str));
    }

    public final void a() {
        HashMap map = this.f3057b;
        for (A5.j jVar : map.keySet()) {
            A5.i iVar = (A5.i) map.get(jVar);
            if (iVar != null) {
                iVar.b();
                jVar.a(null);
            }
        }
        map.clear();
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

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        A5.f fVar = bVar.f18083c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_database", this);
        this.f3059d = fVar;
        s sVar = new s(fVar, "plugins.flutter.io/firebase_database");
        this.f3058c = sVar;
        sVar.b(this);
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        this.f3058c.b(null);
        a();
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, A5.r rVar) {
        Task task;
        final int i7 = 14;
        final int i8 = 13;
        final int i9 = 10;
        final int i10 = 8;
        final int i11 = 7;
        final int i12 = 6;
        final int i13 = 4;
        final int i14 = 2;
        final int i15 = 1;
        final int i16 = 0;
        final int i17 = 3;
        final Map map = (Map) oVar.f677b;
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "DatabaseReference#runTransaction":
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                final int i18 = 11;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: G5.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i19 = 2;
                        int i20 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        Map map2 = map;
                        switch (i18) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource2.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource2.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i21 = dVar.f3056a;
                                    dVar.f3056a = 1 + i21;
                                    sb.append(i21);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource2.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource2.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i20));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource2.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource2.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource2.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource3, c0940m2, 18, false));
                                    taskCompletionSource2.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource3.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource2.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource2.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource2.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource2.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource2.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i19, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource2.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource2.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource2.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i19));
                                    taskCompletionSource2.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource2.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i20 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
                        Map map2 = map;
                        switch (i19) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource3.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource3.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i21 = dVar.f3056a;
                                    dVar.f3056a = 1 + i21;
                                    sb.append(i21);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource3.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource3.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i20));
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource3.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource3.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource3.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource4, c0940m2, 18, false));
                                    taskCompletionSource3.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource4.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource3.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource3.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource3.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource3.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource3.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource3.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource3.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource3.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource3.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource3.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource3.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i21 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource4 = taskCompletionSource3;
                        Map map2 = map;
                        switch (i20) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource4.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource4.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i22 = dVar.f3056a;
                                    dVar.f3056a = 1 + i22;
                                    sb.append(i22);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource4.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource4.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i21));
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource4.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource4.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource4.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource5, c0940m2, 18, false));
                                    taskCompletionSource4.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource5.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource4.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource4.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource4.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource4.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource4.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource4.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource4.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource4.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource4.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource4.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource4.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource5 = taskCompletionSource4;
                        Map map2 = map;
                        switch (i21) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource5.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource5.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource5.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource5.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource5.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource5.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource5.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource6, c0940m2, 18, false));
                                    taskCompletionSource5.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource6.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource5.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource5.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource5.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource5.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource5.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource5.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource5.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource5.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource5.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource5.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource5.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource6 = taskCompletionSource5;
                        Map map2 = map;
                        switch (i11) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource6.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource6.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource6.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource6.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource6.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource6.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource6.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource7, c0940m2, 18, false));
                                    taskCompletionSource6.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource7.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource6.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource6.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource6.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource6.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource6.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource6.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource6.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource6.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource6.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource6.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource6.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource7 = taskCompletionSource6;
                        Map map2 = map;
                        switch (i17) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource7.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource7.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource7.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource7.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource7.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource7.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource7.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource8, c0940m2, 18, false));
                                    taskCompletionSource7.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource8.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource7.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource7.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource7.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource7.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource7.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource7.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource7.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource7.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource7.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource7.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource7.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource8 = taskCompletionSource7;
                        Map map2 = map;
                        switch (i7) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource8.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource8.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource8.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource8.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource8.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource8.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource8.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource9, c0940m2, 18, false));
                                    taskCompletionSource8.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource9.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource8.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource8.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource8.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource8.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource8.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource8.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource8.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource8.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource8.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource8.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource8.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource9 = taskCompletionSource8;
                        Map map2 = map;
                        switch (i16) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource9.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource9.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource9.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource9.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource9.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource9.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource9.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource10, c0940m2, 18, false));
                                    taskCompletionSource9.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource10.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource9.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource9.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource9.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource9.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource9.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource9.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource9.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource9.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource9.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource9.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource9.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource10 = taskCompletionSource9;
                        Map map2 = map;
                        switch (i12) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource10.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource10.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource10.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource10.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource10.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource10.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource10.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource11 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource11, c0940m2, 18, false));
                                    taskCompletionSource10.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource11.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource10.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource10.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource10.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource10.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource10.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource10.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource10.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource10.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource10.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource10.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource10.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource11 = taskCompletionSource10;
                        Map map2 = map;
                        switch (i15) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource11.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource11.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource11.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource11.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource11.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource11.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource11.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource12 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource12, c0940m2, 18, false));
                                    taskCompletionSource11.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource12.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource11.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource11.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource11.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource11.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource11.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource11.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource11.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource11.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource11.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource11.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource11.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource12 = taskCompletionSource11;
                        Map map2 = map;
                        switch (i10) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource12.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource12.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource12.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource12.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource12.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource12.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource12.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource13 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource13, c0940m2, 18, false));
                                    taskCompletionSource12.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource13.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource12.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource12.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource12.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource12.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource12.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource12.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource12.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource12.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource12.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource12.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource12.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource13 = taskCompletionSource12;
                        Map map2 = map;
                        switch (i13) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource13.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource13.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource13.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource13.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource13.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource13.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource13.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource14 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource14, c0940m2, 18, false));
                                    taskCompletionSource13.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource14.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource13.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource13.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource13.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource13.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource13.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource13.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource13.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource13.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource13.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource13.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource13.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource14 = taskCompletionSource13;
                        Map map2 = map;
                        switch (i9) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource14.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource14.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource14.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource14.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource14.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource14.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource14.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource15 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource15, c0940m2, 18, false));
                                    taskCompletionSource14.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource15.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource14.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource14.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource14.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource14.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource14.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource14.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource14.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource14.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource14.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource14.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource14.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource15 = taskCompletionSource14;
                        Map map2 = map;
                        switch (i8) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource15.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource15.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource15.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource15.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource15.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource15.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource15.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource16 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource16, c0940m2, 18, false));
                                    taskCompletionSource15.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource16.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource15.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource15.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource15.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource15.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource15.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource15.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource15.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource15.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource15.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource15.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource15.setException(e21);
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

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f3052b;

                    {
                        this.f3052b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskO;
                        int i110 = 2;
                        int i22 = 1;
                        d dVar = this.f3052b;
                        TaskCompletionSource taskCompletionSource16 = taskCompletionSource15;
                        Map map2 = map;
                        switch (i14) {
                            case 0:
                                HashMap map3 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p028d6.k kVarR = d.d(map2).r();
                                    p120q4.e eVarH = p120q4.k.h();
                                    ((C0940m) kVarR.f12447b).q(new y0(27, kVarR, eVarH, false));
                                    Tasks.await((Task) eVarH.f15863a);
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource16.setException(e7);
                                    return;
                                }
                            case 1:
                                HashMap map4 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC = d.c(map2);
                                    Object obj = map2.get("value");
                                    Objects.requireNonNull(obj);
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    C0934g c0934g = (C0934g) jVarC.f1725d;
                                    if (!c0934g.isEmpty() && c0934g.B().equals(v4.c.f17178e)) {
                                        throw new p063i4.d("Can't call keepSynced() on .info paths.");
                                    }
                                    ((C0940m) jVarC.f1723b).q(new E2.g(jVarC, zBooleanValue, 3));
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e8) {
                                    taskCompletionSource16.setException(e8);
                                    return;
                                }
                            case 2:
                                HashMap map5 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC2 = d.c(map2);
                                    String str2 = (String) map2.get("eventChannelNamePrefix");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append("#");
                                    int i23 = dVar.f3056a;
                                    dVar.f3056a = 1 + i23;
                                    sb.append(i23);
                                    String string = sb.toString();
                                    A5.j jVar = new A5.j(dVar.f3059d, string);
                                    b bVar = new b(jVarC2, new C0042s(jVar, 19));
                                    jVar.a(bVar);
                                    dVar.f3057b.put(jVar, bVar);
                                    taskCompletionSource16.setResult(string);
                                    return;
                                } catch (Exception e9) {
                                    taskCompletionSource16.setException(e9);
                                    return;
                                }
                            case 3:
                                HashMap map6 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB = d.b(map2);
                                    hVarB.b();
                                    C0940m c0940m = hVarB.f14005d;
                                    p098n4.o oVar2 = p098n4.o.f15471b;
                                    c0940m.q(new RunnableC0937j(c0940m, i22));
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource16.setException(e10);
                                    return;
                                }
                            case 4:
                                HashMap map7 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD = d.d(map2);
                                    Tasks.await(fVarD.s(map2.get("value"), p115p6.c.k((C0934g) fVarD.f1725d, null)));
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e11) {
                                    taskCompletionSource16.setException(e11);
                                    return;
                                }
                            case 5:
                                HashMap map8 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD2 = d.d(map2);
                                    Object obj2 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    C0934g c0934g2 = (C0934g) fVarD2.f1725d;
                                    r rVarK = p115p6.c.k(c0934g2, obj2);
                                    p120q4.l.f(c0934g2);
                                    p120q4.e eVarH2 = p120q4.k.h();
                                    ((C0940m) fVarD2.f1723b).q(new p063i4.e(fVarD2, rVarK, eVarH2, 1));
                                    Tasks.await((Task) eVarH2.f15863a);
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e12) {
                                    taskCompletionSource16.setException(e12);
                                    return;
                                }
                            case 6:
                                HashMap map9 = d.f3055e;
                                dVar.getClass();
                                try {
                                    j jVarC3 = d.c(map2);
                                    C0940m c0940m2 = (C0940m) jVarC3.f1723b;
                                    c0940m2.getClass();
                                    TaskCompletionSource taskCompletionSource17 = new TaskCompletionSource();
                                    c0940m2.q(new A2.c(c0940m2, jVarC3, taskCompletionSource17, c0940m2, 18, false));
                                    taskCompletionSource16.setResult((HashMap) new p145u1.c((p063i4.b) Tasks.await(taskCompletionSource17.getTask())).f16597b);
                                    return;
                                } catch (Exception e13) {
                                    taskCompletionSource16.setException(e13);
                                    return;
                                }
                            case 7:
                                HashMap map10 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD3 = d.d(map2);
                                    Object obj3 = map2.get("value");
                                    Objects.requireNonNull(obj3);
                                    Object objA = p127r4.b.a((Map) obj3);
                                    p120q4.k.c(objA instanceof Map);
                                    Map map11 = (Map) objA;
                                    C0929b c0929bA = C0929b.A(p120q4.l.a((C0934g) fVarD3.f1725d, map11));
                                    p120q4.e eVarH3 = p120q4.k.h();
                                    ((C0940m) fVarD3.f1723b).q(new A2.c(fVarD3, c0929bA, eVarH3, map11, 13, false));
                                    Tasks.await((Task) eVarH3.f15863a);
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e14) {
                                    taskCompletionSource16.setException(e14);
                                    return;
                                }
                            case 8:
                                HashMap map12 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD4 = d.d(map2);
                                    Object obj4 = map2.get("value");
                                    Objects.requireNonNull(obj4);
                                    Map map13 = (Map) obj4;
                                    p028d6.k kVarR2 = fVarD4.r();
                                    TreeMap treeMapA = p120q4.l.a((C0934g) kVarR2.f12448c, map13);
                                    p120q4.e eVarH4 = p120q4.k.h();
                                    ((C0940m) kVarR2.f12447b).q(new A2.c(kVarR2, treeMapA, eVarH4, map13, 14, false));
                                    Tasks.await((Task) eVarH4.f15863a);
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e15) {
                                    taskCompletionSource16.setException(e15);
                                    return;
                                }
                            case 9:
                                HashMap map14 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB2 = d.b(map2);
                                    hVarB2.b();
                                    hVarB2.f14005d.q(new b1(hVarB2, 11));
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e16) {
                                    taskCompletionSource16.setException(e16);
                                    return;
                                }
                            case 10:
                                HashMap map15 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Object obj5 = map2.get("value");
                                    Object obj6 = map2.get(SentryThread.JsonKeys.PRIORITY);
                                    p028d6.k kVarR3 = d.d(map2).r();
                                    if (obj6 instanceof Double) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, Double.valueOf(((Number) obj6).doubleValue())));
                                    } else if (obj6 instanceof String) {
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, (String) obj6));
                                    } else {
                                        if (obj6 != null) {
                                            throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                                        }
                                        taskO = kVarR3.o(obj5, p115p6.c.k((C0934g) kVarR3.f12448c, null));
                                    }
                                    Tasks.await(taskO);
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e17) {
                                    taskCompletionSource16.setException(e17);
                                    return;
                                }
                            case 11:
                                HashMap map16 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD5 = d.d(map2);
                                    Object obj7 = map2.get("transactionKey");
                                    Objects.requireNonNull(obj7);
                                    int iIntValue = ((Integer) obj7).intValue();
                                    Object obj8 = map2.get("transactionApplyLocally");
                                    Objects.requireNonNull(obj8);
                                    boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                                    B1.m mVar = new B1.m(dVar.f3058c, iIntValue);
                                    p120q4.l.f((C0934g) fVarD5.f1725d);
                                    ((C0940m) fVarD5.f1723b).q(new RunnableC0521m0(i110, fVarD5, mVar, zBooleanValue2));
                                    taskCompletionSource16.setResult((Map) Tasks.await(((TaskCompletionSource) mVar.f1016d).getTask()));
                                    return;
                                } catch (Exception e18) {
                                    taskCompletionSource16.setException(e18);
                                    return;
                                }
                            case 12:
                                HashMap map17 = d.f3055e;
                                dVar.getClass();
                                try {
                                    p063i4.f fVarD6 = d.d(map2);
                                    Tasks.await(fVarD6.s(map2.get("value"), p115p6.c.k((C0934g) fVarD6.f1725d, map2.get(SentryThread.JsonKeys.PRIORITY))));
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e19) {
                                    taskCompletionSource16.setException(e19);
                                    return;
                                }
                            case 13:
                                HashMap map18 = d.f3055e;
                                dVar.getClass();
                                try {
                                    h hVarB3 = d.b(map2);
                                    hVarB3.b();
                                    C0940m c0940m3 = hVarB3.f14005d;
                                    p098n4.o oVar3 = p098n4.o.f15471b;
                                    c0940m3.q(new RunnableC0937j(c0940m3, i110));
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e20) {
                                    taskCompletionSource16.setException(e20);
                                    return;
                                }
                            default:
                                HashMap map19 = d.f3055e;
                                dVar.getClass();
                                try {
                                    Tasks.await(d.d(map2).r().o(map2.get("value"), v4.j.f17190e));
                                    taskCompletionSource16.setResult(null);
                                    return;
                                } catch (Exception e21) {
                                    taskCompletionSource16.setException(e21);
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

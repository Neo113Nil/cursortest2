package g0;

import C0.t;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import h0.C0066b;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import z0.C0865a;
import z0.InterfaceC0866b;

/* loaded from: classes.dex */
public class o implements InterfaceC0866b, D0.j {

    /* renamed from: h, reason: collision with root package name */
    public static String f1127h;

    /* renamed from: l, reason: collision with root package name */
    public static i f1131l;

    /* renamed from: a, reason: collision with root package name */
    public Context f1132a;

    /* renamed from: b, reason: collision with root package name */
    public t f1133b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f1122c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f1123d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1124e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f1125f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static int f1126g = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f1128i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f1129j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static int f1130k = 0;

    public static void a(o oVar, e eVar) {
        oVar.getClass();
        try {
            if (AbstractC0061a.a(eVar.f1079d)) {
                Log.d("Sqflite", eVar.h() + "closing database ");
            }
            eVar.a();
        } catch (Exception e2) {
            Log.e("Sqflite", "error " + e2 + " while closing database " + f1130k);
        }
        synchronized (f1124e) {
            try {
                if (f1123d.isEmpty() && f1131l != null) {
                    if (AbstractC0061a.a(eVar.f1079d)) {
                        Log.d("Sqflite", eVar.h() + "stopping thread");
                    }
                    f1131l.c();
                    f1131l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e b(Y.e eVar, C0.p pVar) {
        Integer num = (Integer) eVar.n("id");
        int intValue = num.intValue();
        e eVar2 = (e) f1123d.get(num);
        if (eVar2 != null) {
            return eVar2;
        }
        pVar.a("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap c(int i2, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i2));
        if (z2) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z3) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // D0.j
    public final void d(final Y.e eVar, final C0.p pVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar2;
        final boolean z2;
        final int i6;
        e eVar3;
        boolean z3;
        i2 = 5;
        i3 = 4;
        i4 = 2;
        String str = (String) eVar.f523b;
        str.getClass();
        i5 = 1;
        eVar2 = null;
        z2 = false;
        z3 = false;
        z2 = false;
        switch (str) {
            case "execute":
                e b2 = b(eVar, pVar);
                if (b2 == null) {
                    return;
                }
                f1131l.a(b2, new k(eVar, pVar, b2, i3));
                return;
            case "closeDatabase":
                Integer num = (Integer) eVar.n("id");
                int intValue = num.intValue();
                e b3 = b(eVar, pVar);
                if (b3 == null) {
                    return;
                }
                if (AbstractC0061a.a(b3.f1079d)) {
                    Log.d("Sqflite", b3.h() + "closing " + intValue + " " + b3.f1077b);
                }
                String str2 = b3.f1077b;
                synchronized (f1124e) {
                    try {
                        f1123d.remove(num);
                        if (b3.f1076a) {
                            f1122c.remove(str2);
                        }
                    } finally {
                    }
                }
                f1131l.a(b3, new m(this, b3, pVar));
                return;
            case "options":
                Object n2 = eVar.n("androidThreadPriority");
                if (n2 != null) {
                    f1128i = ((Integer) n2).intValue();
                }
                Object n3 = eVar.n("androidThreadCount");
                if (n3 != null && !n3.equals(Integer.valueOf(f1129j))) {
                    f1129j = ((Integer) n3).intValue();
                    i iVar = f1131l;
                    if (iVar != null) {
                        iVar.c();
                        f1131l = null;
                    }
                }
                Integer num2 = (Integer) eVar.n("logLevel");
                if (num2 != null) {
                    f1126g = num2.intValue();
                }
                pVar.c(null);
                return;
            case "insert":
                e b4 = b(eVar, pVar);
                if (b4 == null) {
                    return;
                }
                f1131l.a(b4, new k(eVar, pVar, b4, i5));
                return;
            case "update":
                e b5 = b(eVar, pVar);
                if (b5 == null) {
                    return;
                }
                f1131l.a(b5, new k(eVar, pVar, b5, i2));
                return;
            case "androidSetLocale":
                e b6 = b(eVar, pVar);
                if (b6 == null) {
                    return;
                }
                f1131l.a(b6, new k(eVar, b6, pVar));
                return;
            case "deleteDatabase":
                String str3 = (String) eVar.n("path");
                synchronized (f1124e) {
                    try {
                        if (AbstractC0061a.b(f1126g)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f1122c.keySet());
                        }
                        HashMap hashMap = f1122c;
                        Integer num3 = (Integer) hashMap.get(str3);
                        if (num3 != null) {
                            HashMap hashMap2 = f1123d;
                            e eVar4 = (e) hashMap2.get(num3);
                            if (eVar4 != null && eVar4.f1084i.isOpen()) {
                                if (AbstractC0061a.b(f1126g)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar4.h());
                                    sb.append("found single instance ");
                                    sb.append(eVar4.j() ? "(in transaction) " : "");
                                    sb.append(num3);
                                    sb.append(" ");
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                eVar2 = eVar4;
                            }
                        }
                    } finally {
                    }
                }
                n nVar = new n(this, eVar2, str3, pVar);
                i iVar2 = f1131l;
                if (iVar2 != null) {
                    iVar2.a(eVar2, nVar);
                    return;
                } else {
                    nVar.run();
                    return;
                }
            case "debugMode":
                boolean equals = Boolean.TRUE.equals(eVar.f524c);
                if (!equals) {
                    f1126g = 0;
                } else if (equals) {
                    f1126g = 1;
                }
                pVar.c(null);
                return;
            case "openDatabase":
                final String str4 = (String) eVar.n("path");
                final Boolean bool = (Boolean) eVar.n("readOnly");
                final boolean z4 = str4 == null || str4.equals(":memory:");
                if (!Boolean.FALSE.equals(eVar.n("singleInstance")) && !z4) {
                    z2 = true;
                }
                if (z2) {
                    synchronized (f1124e) {
                        try {
                            if (AbstractC0061a.b(f1126g)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f1122c.keySet());
                            }
                            Integer num4 = (Integer) f1122c.get(str4);
                            if (num4 != null && (eVar3 = (e) f1123d.get(num4)) != null) {
                                if (eVar3.f1084i.isOpen()) {
                                    if (AbstractC0061a.b(f1126g)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(eVar3.h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(eVar3.j() ? "(in transaction) " : "");
                                        sb2.append(num4);
                                        sb2.append(" ");
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    pVar.c(c(num4.intValue(), true, eVar3.j()));
                                    return;
                                }
                                if (AbstractC0061a.b(f1126g)) {
                                    Log.d("Sqflite", eVar3.h() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f1124e;
                synchronized (obj) {
                    i6 = f1130k + 1;
                    f1130k = i6;
                }
                final e eVar5 = new e(this.f1132a, str4, i6, z2, f1126g);
                synchronized (obj) {
                    try {
                        if (f1131l == null) {
                            int i7 = f1129j;
                            int i8 = f1128i;
                            i bVar = i7 == 1 ? new H0.b(i8) : new C0.j(i7, i8);
                            f1131l = bVar;
                            bVar.b();
                            if (AbstractC0061a.a(eVar5.f1079d)) {
                                Log.d("Sqflite", eVar5.h() + "starting worker pool with priority " + f1128i);
                            }
                        }
                        eVar5.f1083h = f1131l;
                        if (AbstractC0061a.a(eVar5.f1079d)) {
                            Log.d("Sqflite", eVar5.h() + "opened " + i6 + " " + str4);
                        }
                        f1131l.a(eVar5, new Runnable() { // from class: g0.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z5 = z4;
                                String str5 = str4;
                                C0.p pVar2 = pVar;
                                Boolean bool2 = bool;
                                e eVar6 = eVar5;
                                Y.e eVar7 = eVar;
                                boolean z6 = z2;
                                int i9 = i6;
                                synchronized (o.f1125f) {
                                    if (!z5) {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            pVar2.a("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            eVar6.f1084i = SQLiteDatabase.openDatabase(eVar6.f1077b, null, 1, new d());
                                        } else {
                                            eVar6.k();
                                        }
                                        synchronized (o.f1124e) {
                                            if (z6) {
                                                try {
                                                    o.f1122c.put(str5, Integer.valueOf(i9));
                                                } finally {
                                                }
                                            }
                                            o.f1123d.put(Integer.valueOf(i9), eVar6);
                                        }
                                        if (AbstractC0061a.a(eVar6.f1079d)) {
                                            Log.d("Sqflite", eVar6.h() + "opened " + i9 + " " + str5);
                                        }
                                        pVar2.c(o.c(i9, false, false));
                                    } catch (Exception e2) {
                                        eVar6.i(e2, new C0066b(eVar7, pVar2));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case "batch":
                e b7 = b(eVar, pVar);
                if (b7 == null) {
                    return;
                }
                f1131l.a(b7, new k(b7, eVar, pVar));
                return;
            case "debug":
                String str5 = (String) eVar.n("cmd");
                HashMap hashMap3 = new HashMap();
                if ("get".equals(str5)) {
                    int i9 = f1126g;
                    if (i9 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i9));
                    }
                    HashMap hashMap4 = f1123d;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            e eVar6 = (e) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("path", eVar6.f1077b);
                            hashMap6.put("singleInstance", Boolean.valueOf(eVar6.f1076a));
                            int i10 = eVar6.f1079d;
                            if (i10 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i10));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                pVar.c(hashMap3);
                return;
            case "query":
                e b8 = b(eVar, pVar);
                if (b8 == null) {
                    return;
                }
                f1131l.a(b8, new k(eVar, pVar, b8, i4));
                return;
            case "databaseExists":
                try {
                    z3 = new File((String) eVar.n("path")).exists();
                } catch (Exception unused) {
                }
                pVar.c(Boolean.valueOf(z3));
                return;
            case "queryCursorNext":
                e b9 = b(eVar, pVar);
                if (b9 == null) {
                    return;
                }
                f1131l.a(b9, new k(eVar, pVar, b9, z2 ? 1 : 0));
                return;
            case "getPlatformVersion":
                pVar.c("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f1127h == null) {
                    f1127h = this.f1132a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                pVar.c(f1127h);
                return;
            default:
                pVar.b();
                return;
        }
    }

    @Override // z0.InterfaceC0866b
    public final void onAttachedToEngine(C0865a c0865a) {
        this.f1132a = c0865a.f6800a;
        D0.n nVar = D0.n.f167b;
        D0.h hVar = new D0.h();
        D0.f fVar = c0865a.f6801b;
        t tVar = new t(fVar, "com.tekartik.sqflite", nVar, fVar.d(hVar));
        this.f1133b = tVar;
        tVar.j(this);
    }

    @Override // z0.InterfaceC0866b
    public final void onDetachedFromEngine(C0865a c0865a) {
        this.f1132a = null;
        this.f1133b.j(null);
        this.f1133b = null;
    }
}

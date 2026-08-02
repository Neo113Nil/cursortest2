package i5;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import A5.y;
import B1.m;
import C0.A;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import w5.C1782b;
import w5.InterfaceC1783c;

/* loaded from: classes2.dex */
public class k implements InterfaceC1783c, q {

    /* renamed from: C, reason: collision with root package name */
    public static g f14051C;

    /* renamed from: y, reason: collision with root package name */
    public static String f14057y;

    /* renamed from: a, reason: collision with root package name */
    public Context f14059a;

    /* renamed from: b, reason: collision with root package name */
    public s f14060b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f14052c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f14053d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f14054e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f14055f = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static int f14056x = 0;

    /* renamed from: z, reason: collision with root package name */
    public static int f14058z = 0;

    /* renamed from: A, reason: collision with root package name */
    public static int f14049A = 1;

    /* renamed from: B, reason: collision with root package name */
    public static int f14050B = 0;

    public static void a(k kVar, C1282d c1282d) {
        kVar.getClass();
        try {
            if (AbstractC1279a.a(c1282d.f14017d)) {
                Log.d("Sqflite", c1282d.h() + "closing database ");
            }
            c1282d.a();
        } catch (Exception e7) {
            Log.e("Sqflite", "error " + e7 + " while closing database " + f14050B);
        }
        synchronized (f14054e) {
            try {
                if (f14053d.isEmpty() && f14051C != null) {
                    if (AbstractC1279a.a(c1282d.f14017d)) {
                        Log.d("Sqflite", c1282d.h() + "stopping thread");
                    }
                    f14051C.d();
                    f14051C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1282d b(o oVar, p pVar) {
        Integer num = (Integer) oVar.a("id");
        int intValue = num.intValue();
        C1282d c1282d = (C1282d) f14053d.get(num);
        if (c1282d != null) {
            return c1282d;
        }
        pVar.error("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap c(int i7, boolean z4, boolean z7) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i7));
        if (z4) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z7) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        this.f14059a = c1782b.f18075a;
        y yVar = y.f688b;
        A5.f fVar = c1782b.f18077c;
        s sVar = new s(fVar, "com.tekartik.sqflite", yVar, fVar.e());
        this.f14060b = sVar;
        sVar.b(this);
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f14059a = null;
        this.f14060b.b(null);
        this.f14060b = null;
    }

    @Override // A5.q
    public final void onMethodCall(final o oVar, r rVar) {
        boolean z4;
        C1282d c1282d;
        final int i7;
        C1282d c1282d2;
        String str = oVar.f676a;
        str.getClass();
        z4 = false;
        switch (str) {
            case "execute":
                p pVar = (p) rVar;
                C1282d b7 = b(oVar, pVar);
                if (b7 == null) {
                    return;
                }
                f14051C.a(b7, new i(oVar, pVar, b7, 4));
                return;
            case "closeDatabase":
                Integer num = (Integer) oVar.a("id");
                int intValue = num.intValue();
                p pVar2 = (p) rVar;
                C1282d b8 = b(oVar, pVar2);
                if (b8 == null) {
                    return;
                }
                if (AbstractC1279a.a(b8.f14017d)) {
                    Log.d("Sqflite", b8.h() + "closing " + intValue + " " + b8.f14015b);
                }
                String str2 = b8.f14015b;
                synchronized (f14054e) {
                    try {
                        f14053d.remove(num);
                        if (b8.f14014a) {
                            f14052c.remove(str2);
                        }
                    } finally {
                    }
                }
                f14051C.a(b8, new H2.q(21, this, b8, pVar2, false));
                return;
            case "options":
                Object a2 = oVar.a("androidThreadPriority");
                if (a2 != null) {
                    f14058z = ((Integer) a2).intValue();
                }
                Object a4 = oVar.a("androidThreadCount");
                if (a4 != null && !a4.equals(Integer.valueOf(f14049A))) {
                    f14049A = ((Integer) a4).intValue();
                    g gVar = f14051C;
                    if (gVar != null) {
                        gVar.d();
                        f14051C = null;
                    }
                }
                Integer num2 = (Integer) oVar.a("logLevel");
                if (num2 != null) {
                    f14056x = num2.intValue();
                }
                ((p) rVar).success(null);
                return;
            case "insert":
                p pVar3 = (p) rVar;
                C1282d b9 = b(oVar, pVar3);
                if (b9 == null) {
                    return;
                }
                f14051C.a(b9, new i(oVar, pVar3, b9, 1));
                return;
            case "update":
                p pVar4 = (p) rVar;
                C1282d b10 = b(oVar, pVar4);
                if (b10 == null) {
                    return;
                }
                f14051C.a(b10, new i(oVar, pVar4, b10, 5));
                return;
            case "androidSetLocale":
                p pVar5 = (p) rVar;
                C1282d b11 = b(oVar, pVar5);
                if (b11 == null) {
                    return;
                }
                f14051C.a(b11, new i(oVar, b11, pVar5));
                return;
            case "deleteDatabase":
                String str3 = (String) oVar.a("path");
                synchronized (f14054e) {
                    try {
                        if (AbstractC1279a.b(f14056x)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f14052c.keySet());
                        }
                        HashMap hashMap = f14052c;
                        Integer num3 = (Integer) hashMap.get(str3);
                        if (num3 != null) {
                            HashMap hashMap2 = f14053d;
                            C1282d c1282d3 = (C1282d) hashMap2.get(num3);
                            if (c1282d3 != null && c1282d3.f14022i.isOpen()) {
                                if (AbstractC1279a.b(f14056x)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1282d3.h());
                                    sb.append("found single instance ");
                                    sb.append(c1282d3.j() ? "(in transaction) " : "");
                                    sb.append(num3);
                                    sb.append(" ");
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                c1282d = c1282d3;
                            }
                        }
                        c1282d = null;
                    } finally {
                    }
                }
                A2.c cVar = new A2.c(this, c1282d, str3, (p) rVar, 15, false);
                g gVar2 = f14051C;
                if (gVar2 != null) {
                    gVar2.a(c1282d, cVar);
                    return;
                } else {
                    cVar.run();
                    return;
                }
            case "debugMode":
                boolean equals = Boolean.TRUE.equals(oVar.f677b);
                if (!equals) {
                    f14056x = 0;
                } else if (equals) {
                    f14056x = 1;
                }
                ((p) rVar).success(null);
                return;
            case "openDatabase":
                final String str4 = (String) oVar.a("path");
                final Boolean bool = (Boolean) oVar.a("readOnly");
                boolean z7 = str4 == null || str4.equals(":memory:");
                final boolean z8 = (Boolean.FALSE.equals(oVar.a("singleInstance")) || z7) ? false : true;
                if (z8) {
                    synchronized (f14054e) {
                        try {
                            if (AbstractC1279a.b(f14056x)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f14052c.keySet());
                            }
                            Integer num4 = (Integer) f14052c.get(str4);
                            if (num4 != null && (c1282d2 = (C1282d) f14053d.get(num4)) != null) {
                                if (c1282d2.f14022i.isOpen()) {
                                    if (AbstractC1279a.b(f14056x)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(c1282d2.h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(c1282d2.j() ? "(in transaction) " : "");
                                        sb2.append(num4);
                                        sb2.append(" ");
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    ((p) rVar).success(c(num4.intValue(), true, c1282d2.j()));
                                    return;
                                }
                                if (AbstractC1279a.b(f14056x)) {
                                    Log.d("Sqflite", c1282d2.h() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f14054e;
                synchronized (obj) {
                    i7 = f14050B + 1;
                    f14050B = i7;
                }
                final C1282d c1282d4 = new C1282d(this.f14059a, str4, i7, z8, f14056x);
                synchronized (obj) {
                    try {
                        if (f14051C == null) {
                            int i8 = f14049A;
                            int i9 = f14058z;
                            g mVar = i8 == 1 ? new m(i9, 12) : new A(i8, i9);
                            f14051C = mVar;
                            mVar.start();
                            if (AbstractC1279a.a(c1282d4.f14017d)) {
                                Log.d("Sqflite", c1282d4.h() + "starting worker pool with priority " + f14058z);
                            }
                        }
                        c1282d4.f14021h = f14051C;
                        if (AbstractC1279a.a(c1282d4.f14017d)) {
                            Log.d("Sqflite", c1282d4.h() + "opened " + i7 + " " + str4);
                        }
                        final p pVar6 = (p) rVar;
                        final boolean z9 = z7;
                        f14051C.a(c1282d4, new Runnable() { // from class: i5.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10 = z9;
                                String str5 = str4;
                                p pVar7 = pVar6;
                                Boolean bool2 = bool;
                                C1282d c1282d5 = c1282d4;
                                o oVar2 = oVar;
                                boolean z11 = z8;
                                int i10 = i7;
                                synchronized (k.f14055f) {
                                    if (!z10) {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            pVar7.error("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            c1282d5.f14022i = SQLiteDatabase.openDatabase(c1282d5.f14015b, null, 1, new C1281c());
                                        } else {
                                            c1282d5.k();
                                        }
                                        synchronized (k.f14054e) {
                                            if (z11) {
                                                try {
                                                    k.f14052c.put(str5, Integer.valueOf(i10));
                                                } finally {
                                                }
                                            }
                                            k.f14053d.put(Integer.valueOf(i10), c1282d5);
                                        }
                                        if (AbstractC1279a.a(c1282d5.f14017d)) {
                                            Log.d("Sqflite", c1282d5.h() + "opened " + i10 + " " + str5);
                                        }
                                        pVar7.success(k.c(i10, false, false));
                                    } catch (Exception e7) {
                                        c1282d5.i(e7, new j5.b(oVar2, pVar7));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case "batch":
                p pVar7 = (p) rVar;
                C1282d b12 = b(oVar, pVar7);
                if (b12 == null) {
                    return;
                }
                f14051C.a(b12, new i(b12, oVar, pVar7));
                return;
            case "debug":
                String str5 = (String) oVar.a("cmd");
                HashMap hashMap3 = new HashMap();
                if ("get".equals(str5)) {
                    int i10 = f14056x;
                    if (i10 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i10));
                    }
                    HashMap hashMap4 = f14053d;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            C1282d c1282d5 = (C1282d) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("path", c1282d5.f14015b);
                            hashMap6.put("singleInstance", Boolean.valueOf(c1282d5.f14014a));
                            int i11 = c1282d5.f14017d;
                            if (i11 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i11));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                ((p) rVar).success(hashMap3);
                return;
            case "query":
                p pVar8 = (p) rVar;
                C1282d b13 = b(oVar, pVar8);
                if (b13 == null) {
                    return;
                }
                f14051C.a(b13, new i(oVar, pVar8, b13, 2));
                return;
            case "databaseExists":
                try {
                    z4 = new File((String) oVar.a("path")).exists();
                } catch (Exception unused) {
                }
                ((p) rVar).success(Boolean.valueOf(z4));
                return;
            case "queryCursorNext":
                p pVar9 = (p) rVar;
                C1282d b14 = b(oVar, pVar9);
                if (b14 == null) {
                    return;
                }
                f14051C.a(b14, new i(oVar, pVar9, b14, 0));
                return;
            case "getPlatformVersion":
                ((p) rVar).success("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f14057y == null) {
                    f14057y = this.f14059a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                ((p) rVar).success(f14057y);
                return;
            default:
                ((p) rVar).notImplemented();
                return;
        }
    }
}

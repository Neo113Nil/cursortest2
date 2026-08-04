package p064i5;

import A5.f;
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
import p159w5.b;
import p159w5.c;

/* JADX INFO: loaded from: classes2.dex */
public class k implements c, q {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static g f14057C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static String f14063y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f14065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f14066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f14058c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f14059d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f14060e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f14061f = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f14062x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f14064z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static int f14055A = 1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static int f14056B = 0;

    public static void a(k kVar, d dVar) {
        kVar.getClass();
        try {
            if (a.a(dVar.f14023d)) {
                Log.d("Sqflite", dVar.h() + "closing database ");
            }
            dVar.a();
        } catch (Exception e7) {
            Log.e("Sqflite", "error " + e7 + " while closing database " + f14056B);
        }
        synchronized (f14060e) {
            try {
                if (f14059d.isEmpty() && f14057C != null) {
                    if (a.a(dVar.f14023d)) {
                        Log.d("Sqflite", dVar.h() + "stopping thread");
                    }
                    f14057C.d();
                    f14057C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static d b(o oVar, p pVar) {
        Integer num = (Integer) oVar.a("id");
        int iIntValue = num.intValue();
        d dVar = (d) f14059d.get(num);
        if (dVar != null) {
            return dVar;
        }
        pVar.error("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    public static HashMap c(int i7, boolean z4, boolean z7) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i7));
        if (z4) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z7) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        this.f14065a = bVar.f18081a;
        y yVar = y.f688b;
        f fVar = bVar.f18083c;
        s sVar = new s(fVar, "com.tekartik.sqflite", yVar, fVar.e());
        this.f14066b = sVar;
        sVar.b(this);
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
        this.f14065a = null;
        this.f14066b.b(null);
        this.f14066b = null;
    }

    /* JADX WARN: Code duplicated, block: B:205:0x0471  */
    @Override // A5.q
    public final void onMethodCall(final o oVar, r rVar) {
        d dVar;
        final int i7;
        d dVar2;
        String str = oVar.f676a;
        str.getClass();
        boolean zExists = false;
        switch (str) {
            case "execute":
                p pVar = (p) rVar;
                d dVarB = b(oVar, pVar);
                if (dVarB == null) {
                    return;
                }
                f14057C.a(dVarB, new i(oVar, pVar, dVarB, 4));
                return;
            case "closeDatabase":
                Integer num = (Integer) oVar.a("id");
                int iIntValue = num.intValue();
                p pVar2 = (p) rVar;
                d dVarB2 = b(oVar, pVar2);
                if (dVarB2 == null) {
                    return;
                }
                if (a.a(dVarB2.f14023d)) {
                    Log.d("Sqflite", dVarB2.h() + "closing " + iIntValue + " " + dVarB2.f14021b);
                }
                String str2 = dVarB2.f14021b;
                synchronized (f14060e) {
                    try {
                        f14059d.remove(num);
                        if (dVarB2.f14020a) {
                            f14058c.remove(str2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                f14057C.a(dVarB2, new H2.q(21, this, dVarB2, pVar2, false));
                return;
            case "options":
                Object objA = oVar.a("androidThreadPriority");
                if (objA != null) {
                    f14064z = ((Integer) objA).intValue();
                }
                Object objA2 = oVar.a("androidThreadCount");
                if (objA2 != null && !objA2.equals(Integer.valueOf(f14055A))) {
                    f14055A = ((Integer) objA2).intValue();
                    g gVar = f14057C;
                    if (gVar != null) {
                        gVar.d();
                        f14057C = null;
                    }
                }
                Integer num2 = (Integer) oVar.a("logLevel");
                if (num2 != null) {
                    f14062x = num2.intValue();
                }
                ((p) rVar).success(null);
                return;
            case "insert":
                p pVar3 = (p) rVar;
                d dVarB3 = b(oVar, pVar3);
                if (dVarB3 == null) {
                    return;
                }
                f14057C.a(dVarB3, new i(oVar, pVar3, dVarB3, 1));
                return;
            case "update":
                p pVar4 = (p) rVar;
                d dVarB4 = b(oVar, pVar4);
                if (dVarB4 == null) {
                    return;
                }
                f14057C.a(dVarB4, new i(oVar, pVar4, dVarB4, 5));
                return;
            case "androidSetLocale":
                p pVar5 = (p) rVar;
                d dVarB5 = b(oVar, pVar5);
                if (dVarB5 == null) {
                    return;
                }
                f14057C.a(dVarB5, new i(oVar, dVarB5, pVar5));
                return;
            case "deleteDatabase":
                String str3 = (String) oVar.a("path");
                synchronized (f14060e) {
                    try {
                        if (a.b(f14062x)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f14058c.keySet());
                        }
                        HashMap map = f14058c;
                        Integer num3 = (Integer) map.get(str3);
                        if (num3 != null) {
                            HashMap map2 = f14059d;
                            d dVar3 = (d) map2.get(num3);
                            if (dVar3 == null || !dVar3.f14028i.isOpen()) {
                                dVar = null;
                            } else {
                                if (a.b(f14062x)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(dVar3.h());
                                    sb.append("found single instance ");
                                    sb.append(dVar3.j() ? "(in transaction) " : "");
                                    sb.append(num3);
                                    sb.append(" ");
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                map2.remove(num3);
                                map.remove(str3);
                                dVar = dVar3;
                            }
                        } else {
                            dVar = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                A2.c cVar = new A2.c(this, dVar, str3, (p) rVar, 15, false);
                g gVar2 = f14057C;
                if (gVar2 != null) {
                    gVar2.a(dVar, cVar);
                    return;
                } else {
                    cVar.run();
                    return;
                }
            case "debugMode":
                boolean zEquals = Boolean.TRUE.equals(oVar.f677b);
                if (!zEquals) {
                    f14062x = 0;
                } else if (zEquals) {
                    f14062x = 1;
                }
                ((p) rVar).success(null);
                return;
            case "openDatabase":
                final String str4 = (String) oVar.a("path");
                final Boolean bool = (Boolean) oVar.a("readOnly");
                boolean z4 = str4 == null || str4.equals(":memory:");
                final boolean z7 = (Boolean.FALSE.equals(oVar.a("singleInstance")) || z4) ? false : true;
                if (z7) {
                    synchronized (f14060e) {
                        try {
                            if (a.b(f14062x)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f14058c.keySet());
                            }
                            Integer num4 = (Integer) f14058c.get(str4);
                            if (num4 != null && (dVar2 = (d) f14059d.get(num4)) != null) {
                                if (dVar2.f14028i.isOpen()) {
                                    if (a.b(f14062x)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(dVar2.h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(dVar2.j() ? "(in transaction) " : "");
                                        sb2.append(num4);
                                        sb2.append(" ");
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    ((p) rVar).success(c(num4.intValue(), true, dVar2.j()));
                                    return;
                                }
                                if (a.b(f14062x)) {
                                    Log.d("Sqflite", dVar2.h() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                Object obj = f14060e;
                synchronized (obj) {
                    i7 = f14056B + 1;
                    f14056B = i7;
                    break;
                }
                final d dVar4 = new d(this.f14065a, str4, i7, z7, f14062x);
                synchronized (obj) {
                    try {
                        if (f14057C == null) {
                            int i8 = f14055A;
                            int i9 = f14064z;
                            g mVar = i8 == 1 ? new m(i9, 12) : new A(i8, i9);
                            f14057C = mVar;
                            mVar.start();
                            if (a.a(dVar4.f14023d)) {
                                Log.d("Sqflite", dVar4.h() + "starting worker pool with priority " + f14064z);
                            }
                        }
                        dVar4.f14027h = f14057C;
                        if (a.a(dVar4.f14023d)) {
                            Log.d("Sqflite", dVar4.h() + "opened " + i7 + " " + str4);
                        }
                        final p pVar6 = (p) rVar;
                        final boolean z8 = z4;
                        f14057C.a(dVar4, new Runnable() { // from class: i5.j
                            /* JADX WARN: Code duplicated, block: B:19:0x0057 A[Catch: all -> 0x004c, Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:17:0x004f, B:19:0x0057, B:20:0x0066), top: B:42:0x004f, outer: #2 }] */
                            /* JADX WARN: Code duplicated, block: B:20:0x0066 A[Catch: all -> 0x004c, Exception -> 0x00bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:17:0x004f, B:19:0x0057, B:20:0x0066), top: B:42:0x004f, outer: #2 }] */
                            /* JADX WARN: Code duplicated, block: B:23:0x006c A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:27:0x007a A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:24:0x006e, B:27:0x007a, B:28:0x0083), top: B:43:0x006e, outer: #2 }] */
                            /* JADX WARN: Code duplicated, block: B:31:0x008c A[Catch: all -> 0x004c, TryCatch #2 {, blocks: (B:6:0x0018, B:8:0x002c, B:10:0x0032, B:12:0x0038, B:13:0x0049, B:17:0x004f, B:19:0x0057, B:21:0x0069, B:22:0x006b, B:29:0x0084, B:31:0x008c, B:32:0x00b1, B:35:0x00bc, B:20:0x0066, B:37:0x00be, B:38:0x00c6, B:24:0x006e, B:27:0x007a, B:28:0x0083), top: B:45:0x0018, inners: #0, #1 }] */
                            /* JADX WARN: Code duplicated, block: B:43:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Instruction removed from duplicated block: B:31:0x008c, please report this as an issue */
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z9 = z8;
                                String str5 = str4;
                                p pVar7 = pVar6;
                                Boolean bool2 = bool;
                                d dVar5 = dVar4;
                                o oVar2 = oVar;
                                boolean z10 = z7;
                                int i10 = i7;
                                synchronized (k.f14061f) {
                                    if (z9) {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            dVar5.f14028i = SQLiteDatabase.openDatabase(dVar5.f14021b, null, 1, new c());
                                        } else {
                                            dVar5.k();
                                        }
                                        synchronized (k.f14060e) {
                                            if (!z10) {
                                                k.f14059d.put(Integer.valueOf(i10), dVar5);
                                                if (a.a(dVar5.f14023d)) {
                                                    Log.d("Sqflite", dVar5.h() + "opened " + i10 + " " + str5);
                                                }
                                                pVar7.success(k.c(i10, false, false));
                                                return;
                                            }
                                            k.f14058c.put(str5, Integer.valueOf(i10));
                                            k.f14059d.put(Integer.valueOf(i10), dVar5);
                                            if (a.a(dVar5.f14023d)) {
                                                Log.d("Sqflite", dVar5.h() + "opened " + i10 + " " + str5);
                                            }
                                            pVar7.success(k.c(i10, false, false));
                                            return;
                                        }
                                    }
                                    File file = new File(new File(str5).getParent());
                                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                        pVar7.error("sqlite_error", "open_failed " + str5, null);
                                        return;
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            dVar5.f14028i = SQLiteDatabase.openDatabase(dVar5.f14021b, null, 1, new c());
                                        } else {
                                            dVar5.k();
                                        }
                                        synchronized (k.f14060e) {
                                            if (!z10) {
                                                try {
                                                    k.f14058c.put(str5, Integer.valueOf(i10));
                                                    k.f14059d.put(Integer.valueOf(i10), dVar5);
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            } else {
                                                k.f14059d.put(Integer.valueOf(i10), dVar5);
                                            }
                                        }
                                        if (a.a(dVar5.f14023d)) {
                                            Log.d("Sqflite", dVar5.h() + "opened " + i10 + " " + str5);
                                        }
                                        pVar7.success(k.c(i10, false, false));
                                        return;
                                    } catch (Exception e7) {
                                        dVar5.i(e7, new j5.b(oVar2, pVar7));
                                        return;
                                    }
                                    throw th;
                                }
                            }
                        });
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case "batch":
                p pVar7 = (p) rVar;
                d dVarB6 = b(oVar, pVar7);
                if (dVarB6 == null) {
                    return;
                }
                f14057C.a(dVarB6, new i(dVarB6, oVar, pVar7));
                return;
            case "debug":
                String str5 = (String) oVar.a("cmd");
                HashMap map3 = new HashMap();
                if ("get".equals(str5)) {
                    int i10 = f14062x;
                    if (i10 > 0) {
                        map3.put("logLevel", Integer.valueOf(i10));
                    }
                    HashMap map4 = f14059d;
                    if (!map4.isEmpty()) {
                        HashMap map5 = new HashMap();
                        for (Map.Entry entry : map4.entrySet()) {
                            d dVar5 = (d) entry.getValue();
                            HashMap map6 = new HashMap();
                            map6.put("path", dVar5.f14021b);
                            map6.put("singleInstance", Boolean.valueOf(dVar5.f14020a));
                            int i11 = dVar5.f14023d;
                            if (i11 > 0) {
                                map6.put("logLevel", Integer.valueOf(i11));
                            }
                            map5.put(((Integer) entry.getKey()).toString(), map6);
                        }
                        map3.put("databases", map5);
                    }
                }
                ((p) rVar).success(map3);
                return;
            case "query":
                p pVar8 = (p) rVar;
                d dVarB7 = b(oVar, pVar8);
                if (dVarB7 == null) {
                    return;
                }
                f14057C.a(dVarB7, new i(oVar, pVar8, dVarB7, 2));
                return;
            case "databaseExists":
                try {
                    zExists = new File((String) oVar.a("path")).exists();
                    break;
                } catch (Exception unused) {
                }
                ((p) rVar).success(Boolean.valueOf(zExists));
                return;
            case "queryCursorNext":
                p pVar9 = (p) rVar;
                d dVarB8 = b(oVar, pVar9);
                if (dVarB8 == null) {
                    return;
                }
                f14057C.a(dVarB8, new i(oVar, pVar9, dVarB8, 0));
                return;
            case "getPlatformVersion":
                ((p) rVar).success("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f14063y == null) {
                    f14063y = this.f14065a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                ((p) rVar).success(f14063y);
                return;
            default:
                ((p) rVar).notImplemented();
                return;
        }
    }
}

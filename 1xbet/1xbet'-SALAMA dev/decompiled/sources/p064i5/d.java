package p064i5;

import A1.K0;
import G4.Q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import j5.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f14019n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f14024e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f14027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f14028i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f14030l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f14025f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f14026g = new HashMap();
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14029k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14031m = 0;

    public d(Context context, String str, int i7, boolean z4, int i8) {
        this.f14024e = context;
        this.f14021b = str;
        this.f14020a = z4;
        this.f14022c = i7;
        this.f14023d = i8;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        Object objValueOf;
        HashMap map = null;
        ArrayList arrayList = null;
        int columnCount = 0;
        while (cursor.moveToNext()) {
            if (map == null) {
                arrayList = new ArrayList();
                map = new HashMap();
                columnCount = cursor.getColumnCount();
                map.put("columns", Arrays.asList(cursor.getColumnNames()));
                map.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(columnCount);
            for (int i7 = 0; i7 < columnCount; i7++) {
                int type = cursor.getType(i7);
                if (type == 1) {
                    objValueOf = Long.valueOf(cursor.getLong(i7));
                } else if (type == 2) {
                    objValueOf = Double.valueOf(cursor.getDouble(i7));
                } else if (type != 3) {
                    objValueOf = type != 4 ? null : cursor.getBlob(i7);
                } else {
                    objValueOf = cursor.getString(i7);
                }
                arrayList2.add(objValueOf);
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final void a() {
        HashMap map = this.f14026g;
        if (!map.isEmpty() && a.a(this.f14023d)) {
            Log.d("Sqflite", h() + map.size() + " cursor(s) are left opened");
        }
        this.f14028i.close();
    }

    public final void b(h hVar) {
        try {
            int i7 = hVar.f14040a;
            if (a.b(this.f14023d)) {
                Log.d("Sqflite", h() + "closing cursor " + i7);
            }
            this.f14026g.remove(Integer.valueOf(i7));
            hVar.f14042c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(f fVar) throws Throwable {
        Exception e7;
        Cursor cursorRawQuery;
        if (!g(fVar)) {
            return false;
        }
        SQLiteCursor sQLiteCursor = 0;
        if (fVar.L()) {
            fVar.f(null);
            return true;
        }
        try {
            try {
                cursorRawQuery = this.f14028i.rawQuery("SELECT changes(), last_insert_rowid()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i7 = cursorRawQuery.getInt(0);
                            int i8 = this.f14023d;
                            if (i7 == 0) {
                                if (a.a(i8)) {
                                    Log.d("Sqflite", h() + "no changes (id was " + cursorRawQuery.getLong(1) + ")");
                                }
                                fVar.f(null);
                                cursorRawQuery.close();
                                return true;
                            }
                            long j = cursorRawQuery.getLong(1);
                            if (a.a(i8)) {
                                Log.d("Sqflite", h() + "inserted " + j);
                            }
                            fVar.f(Long.valueOf(j));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e8) {
                        e7 = e8;
                        i(e7, fVar);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return false;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Insert");
                fVar.f(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Throwable th) {
                th = th;
                sQLiteCursor = "SELECT changes(), last_insert_rowid()";
                if (sQLiteCursor != 0) {
                    sQLiteCursor.close();
                }
                throw th;
            }
        } catch (Exception e9) {
            e7 = e9;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (sQLiteCursor != 0) {
                sQLiteCursor.close();
            }
            throw th;
        }
    }

    public final boolean e(f fVar) throws Throwable {
        Cursor cursorRawQueryWithFactory;
        Integer num = (Integer) fVar.I("cursorPageSize");
        String str = (String) fVar.I("sql");
        l lVar = new l(str, (List) fVar.I("arguments"));
        if (a.a(this.f14023d)) {
            Log.d("Sqflite", h() + lVar);
        }
        h hVar = null;
        try {
            cursorRawQueryWithFactory = this.f14028i.rawQueryWithFactory(new Q(lVar, 1), str, a.f14015a, null);
            try {
                try {
                    HashMap mapC = c(cursorRawQueryWithFactory, num);
                    if (num != null && !cursorRawQueryWithFactory.isLast() && !cursorRawQueryWithFactory.isAfterLast()) {
                        int i7 = this.f14031m + 1;
                        this.f14031m = i7;
                        mapC.put("cursorId", Integer.valueOf(i7));
                        h hVar2 = new h(i7, num.intValue(), cursorRawQueryWithFactory);
                        try {
                            this.f14026g.put(Integer.valueOf(i7), hVar2);
                            hVar = hVar2;
                        } catch (Exception e7) {
                            e = e7;
                            hVar = hVar2;
                            i(e, fVar);
                            if (hVar != null) {
                                b(hVar);
                            }
                            if (hVar != null || cursorRawQueryWithFactory == null) {
                                return false;
                            }
                            cursorRawQueryWithFactory.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            hVar = hVar2;
                            if (hVar == null && cursorRawQueryWithFactory != null) {
                                cursorRawQueryWithFactory.close();
                            }
                            throw th;
                        }
                    }
                    fVar.f(mapC);
                    if (hVar == null) {
                        cursorRawQueryWithFactory.close();
                    }
                    return true;
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
            cursorRawQueryWithFactory = null;
        } catch (Throwable th3) {
            th = th3;
            cursorRawQueryWithFactory = null;
        }
    }

    public final boolean f(f fVar) throws Throwable {
        if (!g(fVar)) {
            return false;
        }
        Cursor cursor = null;
        try {
            if (fVar.L()) {
                fVar.f(null);
                return true;
            }
            try {
                Cursor cursorRawQuery = this.f14028i.rawQuery("SELECT changes()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i7 = cursorRawQuery.getInt(0);
                            if (a.a(this.f14023d)) {
                                Log.d("Sqflite", h() + "changed " + i7);
                            }
                            fVar.f(Integer.valueOf(i7));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        cursor = cursorRawQuery;
                        i(e, fVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Update/Delete");
                fVar.f(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final boolean g(f fVar) {
        String str = (String) fVar.I("sql");
        l lVar = new l(str, (List) fVar.I("arguments"));
        if (a.a(this.f14023d)) {
            Log.d("Sqflite", h() + lVar);
        }
        Object objI = fVar.I("inTransaction");
        Boolean bool = objI instanceof Boolean ? (Boolean) objI : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f14028i;
            ArrayList arrayList = new ArrayList();
            List list = lVar.f14068b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.j--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Exception e7) {
            i(e7, fVar);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("[");
        Thread threadCurrentThread = Thread.currentThread();
        sb.append(this.f14022c + "," + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")");
        sb.append("] ");
        return sb.toString();
    }

    public final void i(Exception exc, f fVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            fVar.p("open_failed " + this.f14021b, null);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) fVar.I("sql");
            Collection arrayList = (List) fVar.I("arguments");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            HashMap map = new HashMap();
            map.put("sql", str);
            map.put("arguments", arrayList);
            fVar.p(message, map);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) fVar.I("sql");
        Collection arrayList2 = (List) fVar.I("arguments");
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        HashMap map2 = new HashMap();
        map2.put("sql", str2);
        map2.put("arguments", arrayList2);
        fVar.p(message2, map2);
    }

    public final synchronized boolean j() {
        return this.j > 0;
    }

    public final void k() {
        if (f14019n == null) {
            Context context = this.f14024e;
            boolean z4 = false;
            try {
                String packageName = context.getPackageName();
                if ((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(packageName, 128)).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z4 = true;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            f14019n = Boolean.valueOf(z4);
            if (z4 && a.b(this.f14023d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.f14028i = SQLiteDatabase.openDatabase(this.f14021b, null, f14019n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(b bVar, Runnable runnable) {
        Integer num = (Integer) bVar.I("transactionId");
        Integer num2 = this.f14030l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f14025f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new j5.d(runnable));
            return;
        }
        runnable.run();
        if (this.f14030l != null || arrayList.isEmpty()) {
            return;
        }
        this.f14027h.a(this, new K0(this, 28));
    }
}

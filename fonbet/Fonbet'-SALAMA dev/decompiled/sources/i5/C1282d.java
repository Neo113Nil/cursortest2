package i5;

import A1.K0;
import G4.Q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: i5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1282d {

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f14013n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14015b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14016c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14017d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f14018e;

    /* renamed from: h, reason: collision with root package name */
    public g f14021h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f14022i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f14024l;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f14019f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f14020g = new HashMap();
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f14023k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f14025m = 0;

    public C1282d(Context context, String str, int i7, boolean z4, int i8) {
        this.f14018e = context;
        this.f14015b = str;
        this.f14014a = z4;
        this.f14016c = i7;
        this.f14017d = i8;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i7 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i7 = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                int type = cursor.getType(i8);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i8) : cursor.getString(i8) : Double.valueOf(cursor.getDouble(i8)) : Long.valueOf(cursor.getLong(i8)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final void a() {
        HashMap hashMap = this.f14020g;
        if (!hashMap.isEmpty() && AbstractC1279a.a(this.f14017d)) {
            Log.d("Sqflite", h() + hashMap.size() + " cursor(s) are left opened");
        }
        this.f14022i.close();
    }

    public final void b(h hVar) {
        try {
            int i7 = hVar.f14034a;
            if (AbstractC1279a.b(this.f14017d)) {
                Log.d("Sqflite", h() + "closing cursor " + i7);
            }
            this.f14020g.remove(Integer.valueOf(i7));
            hVar.f14036c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(p3.f fVar) {
        Exception e7;
        Cursor cursor;
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
                cursor = this.f14022i.rawQuery("SELECT changes(), last_insert_rowid()", null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                            int i7 = cursor.getInt(0);
                            int i8 = this.f14017d;
                            if (i7 == 0) {
                                if (AbstractC1279a.a(i8)) {
                                    Log.d("Sqflite", h() + "no changes (id was " + cursor.getLong(1) + ")");
                                }
                                fVar.f(null);
                                cursor.close();
                                return true;
                            }
                            long j = cursor.getLong(1);
                            if (AbstractC1279a.a(i8)) {
                                Log.d("Sqflite", h() + "inserted " + j);
                            }
                            fVar.f(Long.valueOf(j));
                            cursor.close();
                            return true;
                        }
                    } catch (Exception e8) {
                        e7 = e8;
                        i(e7, fVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Insert");
                fVar.f(null);
                if (cursor != null) {
                    cursor.close();
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
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (sQLiteCursor != 0) {
            }
            throw th;
        }
    }

    public final boolean e(p3.f fVar) {
        Cursor cursor;
        Integer num = (Integer) fVar.I("cursorPageSize");
        String str = (String) fVar.I("sql");
        l lVar = new l(str, (List) fVar.I("arguments"));
        if (AbstractC1279a.a(this.f14017d)) {
            Log.d("Sqflite", h() + lVar);
        }
        h hVar = null;
        try {
            cursor = this.f14022i.rawQueryWithFactory(new Q(lVar, 1), str, AbstractC1279a.f14009a, null);
            try {
                try {
                    HashMap c3 = c(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i7 = this.f14025m + 1;
                        this.f14025m = i7;
                        c3.put("cursorId", Integer.valueOf(i7));
                        h hVar2 = new h(i7, num.intValue(), cursor);
                        try {
                            this.f14020g.put(Integer.valueOf(i7), hVar2);
                            hVar = hVar2;
                        } catch (Exception e7) {
                            e = e7;
                            hVar = hVar2;
                            i(e, fVar);
                            if (hVar != null) {
                                b(hVar);
                            }
                            if (hVar != null || cursor == null) {
                                return false;
                            }
                            cursor.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            hVar = hVar2;
                            if (hVar == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    fVar.f(c3);
                    if (hVar == null) {
                        cursor.close();
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
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final boolean f(p3.f fVar) {
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
                Cursor rawQuery = this.f14022i.rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i7 = rawQuery.getInt(0);
                            if (AbstractC1279a.a(this.f14017d)) {
                                Log.d("Sqflite", h() + "changed " + i7);
                            }
                            fVar.f(Integer.valueOf(i7));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        cursor = rawQuery;
                        i(e, fVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Update/Delete");
                fVar.f(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean g(p3.f fVar) {
        String str = (String) fVar.I("sql");
        l lVar = new l(str, (List) fVar.I("arguments"));
        if (AbstractC1279a.a(this.f14017d)) {
            Log.d("Sqflite", h() + lVar);
        }
        Object I7 = fVar.I("inTransaction");
        Boolean bool = I7 instanceof Boolean ? (Boolean) I7 : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f14022i;
            ArrayList arrayList = new ArrayList();
            List list = lVar.f14062b;
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
                } finally {
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
        Thread currentThread = Thread.currentThread();
        sb.append(this.f14016c + "," + currentThread.getName() + "(" + currentThread.getId() + ")");
        sb.append("] ");
        return sb.toString();
    }

    public final void i(Exception exc, p3.f fVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            fVar.p("open_failed " + this.f14015b, null);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) fVar.I("sql");
            Collection collection = (List) fVar.I("arguments");
            if (collection == null) {
                collection = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", collection);
            fVar.p(message, hashMap);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) fVar.I("sql");
        Collection collection2 = (List) fVar.I("arguments");
        if (collection2 == null) {
            collection2 = new ArrayList();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sql", str2);
        hashMap2.put("arguments", collection2);
        fVar.p(message2, hashMap2);
    }

    public final synchronized boolean j() {
        return this.j > 0;
    }

    public final void k() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (f14013n == null) {
            Context context = this.f14018e;
            boolean z4 = false;
            try {
                String packageName = context.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = context.getPackageManager();
                    of = PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
                }
                if (applicationInfo.metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z4 = true;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            f14013n = Boolean.valueOf(z4);
            if (z4 && AbstractC1279a.b(this.f14017d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.f14022i = SQLiteDatabase.openDatabase(this.f14015b, null, f14013n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(j5.b bVar, Runnable runnable) {
        Integer num = (Integer) bVar.I("transactionId");
        Integer num2 = this.f14024l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f14019f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new j5.d(runnable));
            return;
        }
        runnable.run();
        if (this.f14024l != null || arrayList.isEmpty()) {
            return;
        }
        this.f14021h.a(this, new K0(this, 28));
    }
}

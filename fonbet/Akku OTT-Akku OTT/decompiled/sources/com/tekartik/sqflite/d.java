package com.tekartik.sqflite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.CursorUtil$wrapMappedColumns$2;
import com.facebook.O;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class d {
    public static Boolean n;
    public final boolean a;

    @NonNull
    public final String b;
    public final int c;
    public final int d;

    @NonNull
    public final Context e;
    public h h;

    @Nullable
    public SQLiteDatabase i;

    @Nullable
    public Integer l;
    public final ArrayList f = new ArrayList();
    public final HashMap g = new HashMap();
    public int j = 0;
    public int k = 0;
    public int m = 0;

    public d(Context context, String str, int i, int i2, boolean z) {
        this.e = context;
        this.b = str;
        this.a = z;
        this.c = i;
        this.d = i2;
    }

    public static HashMap b(Cursor cursor, @Nullable Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int type = cursor.getType(i2);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i2) : cursor.getString(i2) : Double.valueOf(cursor.getDouble(i2)) : Long.valueOf(cursor.getLong(i2)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final void a(@NonNull l lVar) {
        try {
            int i = lVar.a;
            if (com.baseflow.permissionhandler.a.b(this.d)) {
                g();
            }
            this.g.remove(Integer.valueOf(i));
            lVar.c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(com.tekartik.sqflite.operation.a aVar) {
        Exception e;
        Cursor cursor;
        if (f(aVar)) {
            CursorUtil$wrapMappedColumns$2 cursorUtil$wrapMappedColumns$2 = 0;
            if (aVar.d()) {
                aVar.success(null);
                return true;
            }
            try {
                try {
                    cursor = this.i.rawQuery("SELECT changes(), last_insert_rowid()", null);
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                                int i = cursor.getInt(0);
                                int i2 = this.d;
                                if (i == 0) {
                                    if (i2 >= 1) {
                                        g();
                                        cursor.getLong(1);
                                    }
                                    aVar.success(null);
                                    cursor.close();
                                    return true;
                                }
                                long j = cursor.getLong(1);
                                if (i2 >= 1) {
                                    g();
                                }
                                aVar.success(Long.valueOf(j));
                                cursor.close();
                                return true;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            h(e, aVar);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        }
                    }
                    g();
                    aVar.success(null);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    cursorUtil$wrapMappedColumns$2 = "SELECT changes(), last_insert_rowid()";
                    if (cursorUtil$wrapMappedColumns$2 != 0) {
                        cursorUtil$wrapMappedColumns$2.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursorUtil$wrapMappedColumns$2 != 0) {
                }
                throw th;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tekartik.sqflite.v] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.tekartik.sqflite.operation.a] */
    public final boolean d(@NonNull com.tekartik.sqflite.operation.a aVar) {
        Integer num = (Integer) aVar.b("cursorPageSize");
        String str = (String) aVar.b("sql");
        final ?? vVar = new v(str, (List) aVar.b("arguments"));
        if (this.d >= 1) {
            g();
            vVar.toString();
        }
        l lVar = null;
        try {
            try {
                vVar = this.i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: com.tekartik.sqflite.b
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str2, SQLiteQuery sQLiteQuery) {
                        List<Object> list = v.this.b;
                        if (list != null) {
                            int size = list.size();
                            int i = 0;
                            while (i < size) {
                                Object a = v.a(list.get(i));
                                int i2 = i + 1;
                                if (a == null) {
                                    sQLiteQuery.bindNull(i2);
                                } else if (a instanceof byte[]) {
                                    sQLiteQuery.bindBlob(i2, (byte[]) a);
                                } else if (a instanceof Double) {
                                    sQLiteQuery.bindDouble(i2, ((Double) a).doubleValue());
                                } else if (a instanceof Integer) {
                                    sQLiteQuery.bindLong(i2, ((Integer) a).intValue());
                                } else if (a instanceof Long) {
                                    sQLiteQuery.bindLong(i2, ((Long) a).longValue());
                                } else if (a instanceof String) {
                                    sQLiteQuery.bindString(i2, (String) a);
                                } else {
                                    if (!(a instanceof Boolean)) {
                                        throw new IllegalArgumentException("Could not bind " + a + " from index " + i + ": Supported types are null, byte[], double, long, boolean and String");
                                    }
                                    sQLiteQuery.bindLong(i2, ((Boolean) a).booleanValue() ? 1L : 0L);
                                }
                                i = i2;
                            }
                        }
                        return new SQLiteCursor(sQLiteCursorDriver, str2, sQLiteQuery);
                    }
                }, str, a.a, null);
                try {
                    HashMap b = b(vVar, num);
                    if (num != null && !vVar.isLast() && !vVar.isAfterLast()) {
                        int i = this.m + 1;
                        this.m = i;
                        b.put("cursorId", Integer.valueOf(i));
                        l lVar2 = new l(i, num.intValue(), vVar);
                        try {
                            this.g.put(Integer.valueOf(i), lVar2);
                            lVar = lVar2;
                        } catch (Exception e) {
                            e = e;
                            lVar = lVar2;
                            h(e, aVar);
                            if (lVar != null) {
                                a(lVar);
                            }
                            if (lVar != null || vVar == 0) {
                                return false;
                            }
                            vVar.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            lVar = lVar2;
                            if (lVar == null && vVar != 0) {
                                vVar.close();
                            }
                            throw th;
                        }
                    }
                    aVar.success(b);
                    if (lVar == null) {
                        vVar.close();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            vVar = 0;
        } catch (Throwable th3) {
            th = th3;
            vVar = 0;
        }
    }

    public final boolean e(com.tekartik.sqflite.operation.a aVar) {
        if (f(aVar)) {
            Cursor cursor = null;
            try {
                if (aVar.d()) {
                    aVar.success(null);
                    return true;
                }
                try {
                    Cursor rawQuery = this.i.rawQuery("SELECT changes()", null);
                    if (rawQuery != null) {
                        try {
                            if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                                int i = rawQuery.getInt(0);
                                if (this.d >= 1) {
                                    g();
                                }
                                aVar.success(Integer.valueOf(i));
                                rawQuery.close();
                                return true;
                            }
                        } catch (Exception e) {
                            e = e;
                            cursor = rawQuery;
                            h(e, aVar);
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
                    g();
                    aVar.success(null);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public final boolean f(com.tekartik.sqflite.operation.a aVar) {
        String str = (String) aVar.b("sql");
        List list = (List) aVar.b("arguments");
        if (list == null) {
            list = new ArrayList();
        }
        if (this.d >= 1) {
            g();
            if (!list.isEmpty()) {
                new StringBuilder(" ").append(list);
            }
        }
        Object b = aVar.b("inTransaction");
        Boolean bool = b instanceof Boolean ? (Boolean) b : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.i;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(v.a(it.next()));
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
        } catch (Exception e) {
            h(e, aVar);
            return false;
        }
    }

    public final void g() {
        Thread currentThread = Thread.currentThread();
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(",");
        sb.append(currentThread.getName());
        sb.append("(");
        sb.append(Build.VERSION.SDK_INT >= 36 ? currentThread.threadId() : currentThread.getId());
        sb.append(")");
    }

    public final void h(Exception exc, com.tekartik.sqflite.operation.a aVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            aVar.a(null, "open_failed " + this.b);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) aVar.b("sql");
            Collection collection = (List) aVar.b("arguments");
            if (collection == null) {
                collection = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", collection);
            aVar.a(hashMap, message);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) aVar.b("sql");
        Collection collection2 = (List) aVar.b("arguments");
        if (collection2 == null) {
            collection2 = new ArrayList();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sql", str2);
        hashMap2.put("arguments", collection2);
        aVar.a(hashMap2, message2);
    }

    public final synchronized boolean i() {
        return this.j > 0;
    }

    public final void j() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (n == null) {
            Context context = this.e;
            boolean z = false;
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
                    z = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            n = Boolean.valueOf(z);
            if (z && com.baseflow.permissionhandler.a.b(this.d)) {
                g();
            }
        }
        this.i = SQLiteDatabase.openDatabase(this.b, null, n.booleanValue() ? C.ENCODING_PCM_32BIT : 268435456);
    }

    public final void k(@NonNull com.tekartik.sqflite.operation.c cVar, Runnable runnable) {
        Integer num = (Integer) cVar.b("transactionId");
        Integer num2 = this.l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new com.tekartik.sqflite.operation.e(runnable));
            return;
        }
        runnable.run();
        if (this.l != null || arrayList.isEmpty()) {
            return;
        }
        this.h.c(this, new O(this, 1));
    }
}

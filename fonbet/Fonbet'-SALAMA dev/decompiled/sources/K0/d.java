package K0;

import B3.g;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import e1.C0999f;
import e3.C1023h;
import java.util.ArrayList;
import w1.P2;

/* loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final b[] f3871a;

    /* renamed from: b, reason: collision with root package name */
    public final P2 f3872b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, b[] bVarArr, P2 p22) {
        super(context, str, null, 12, new c(p22, bVarArr));
        p22.getClass();
        this.f3872b = p22;
        this.f3871a = bVarArr;
    }

    public static b a(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || ((SQLiteDatabase) bVar.f3868b) != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase, 0);
        }
        return bVarArr[0];
    }

    public final synchronized b b() {
        this.f3873c = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f3873c) {
            return a(this.f3871a, writableDatabase);
        }
        close();
        return b();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f3871a[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f3871a, sQLiteDatabase);
        this.f3872b.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z4;
        ArrayList arrayList;
        b a2 = a(this.f3871a, sQLiteDatabase);
        P2 p22 = this.f3872b;
        p22.getClass();
        Cursor i7 = a2.i("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (i7.moveToFirst()) {
                if (i7.getInt(0) == 0) {
                    z4 = true;
                    i7.close();
                    C1023h c1023h = (C1023h) p22.f17509c;
                    C1023h.Z(a2);
                    if (!z4) {
                        g b02 = C1023h.b0(a2);
                        if (!b02.f1063b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) b02.f1064c));
                        }
                    }
                    p22.U(a2);
                    int i8 = WorkDatabase_Impl.f9870s;
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1023h.f12667a;
                    arrayList = workDatabase_Impl.f1659g;
                    if (arrayList == null) {
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            ((C0999f) workDatabase_Impl.f1659g.get(i9)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z4 = false;
            i7.close();
            C1023h c1023h2 = (C1023h) p22.f17509c;
            C1023h.Z(a2);
            if (!z4) {
            }
            p22.U(a2);
            int i82 = WorkDatabase_Impl.f9870s;
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c1023h2.f12667a;
            arrayList = workDatabase_Impl2.f1659g;
            if (arrayList == null) {
            }
        } catch (Throwable th) {
            i7.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        this.f3873c = true;
        this.f3872b.O(a(this.f3871a, sQLiteDatabase), i7, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0068  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        boolean z4;
        D0.e eVar;
        if (this.f3873c) {
            return;
        }
        P2 p22 = this.f3872b;
        b a2 = a(this.f3871a, sQLiteDatabase);
        p22.getClass();
        Cursor i7 = a2.i("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (i7.moveToFirst()) {
                if (i7.getInt(0) != 0) {
                    z4 = true;
                    i7.close();
                    if (z4) {
                        g b02 = C1023h.b0(a2);
                        if (!b02.f1063b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) b02.f1064c));
                        }
                        p22.U(a2);
                    } else {
                        Cursor h6 = a2.h(new J0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 0));
                        try {
                            String string = h6.moveToFirst() ? h6.getString(0) : null;
                            h6.close();
                            if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                            }
                        } catch (Throwable th) {
                            h6.close();
                            throw th;
                        }
                    }
                    C1023h c1023h = (C1023h) p22.f17509c;
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1023h.f12667a;
                    int i8 = WorkDatabase_Impl.f9870s;
                    workDatabase_Impl.f1653a = a2;
                    a2.g("PRAGMA foreign_keys = ON");
                    eVar = ((WorkDatabase_Impl) c1023h.f12667a).f1656d;
                    synchronized (eVar) {
                        try {
                            if (eVar.f1635e) {
                                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                            } else {
                                a2.g("PRAGMA temp_store = MEMORY;");
                                a2.g("PRAGMA recursive_triggers='ON';");
                                a2.g("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                                eVar.c(a2);
                                eVar.f1636f = new f(((SQLiteDatabase) a2.f3868b).compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                                eVar.f1635e = true;
                            }
                        } finally {
                        }
                    }
                    ArrayList arrayList = ((WorkDatabase_Impl) c1023h.f12667a).f1659g;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            ((C0999f) ((WorkDatabase_Impl) c1023h.f12667a).f1659g.get(i9)).getClass();
                            a2.a();
                            try {
                                int i10 = WorkDatabase.f9869k;
                                a2.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                a2.j();
                                a2.f();
                            } catch (Throwable th2) {
                                a2.f();
                                throw th2;
                            }
                        }
                    }
                    p22.f17508b = null;
                    return;
                }
            }
            z4 = false;
            i7.close();
            if (z4) {
            }
            C1023h c1023h2 = (C1023h) p22.f17509c;
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c1023h2.f12667a;
            int i82 = WorkDatabase_Impl.f9870s;
            workDatabase_Impl2.f1653a = a2;
            a2.g("PRAGMA foreign_keys = ON");
            eVar = ((WorkDatabase_Impl) c1023h2.f12667a).f1656d;
            synchronized (eVar) {
            }
        } catch (Throwable th3) {
            i7.close();
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        this.f3873c = true;
        this.f3872b.O(a(this.f3871a, sQLiteDatabase), i7, i8);
    }
}

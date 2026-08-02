package Y1;

import A0.J0;
import G.v;
import R1.i;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import g2.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends SQLiteOpenHelper implements AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final b[] f6126k;

    /* renamed from: l, reason: collision with root package name */
    public final v f6127l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6128m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, b[] bVarArr, v vVar) {
        super(context, str, null, 12, new c(vVar, bVarArr));
        vVar.getClass();
        this.f6127l = vVar;
        this.f6126k = bVarArr;
    }

    public static b b(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || ((SQLiteDatabase) bVar.f6123l) != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase, 0);
        }
        return bVarArr[0];
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f6126k[0] = null;
    }

    public final synchronized b d() {
        this.f6128m = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f6128m) {
            return b(this.f6126k, writableDatabase);
        }
        close();
        return d();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        b(this.f6126k, sQLiteDatabase);
        this.f6127l.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z3;
        ArrayList arrayList;
        b b3 = b(this.f6126k, sQLiteDatabase);
        v vVar = this.f6127l;
        vVar.getClass();
        Cursor n5 = b3.n("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (n5.moveToFirst()) {
                if (n5.getInt(0) == 0) {
                    z3 = true;
                    n5.close();
                    J0 j02 = (J0) vVar.f1750m;
                    J0.j(b3);
                    if (!z3) {
                        i v4 = J0.v(b3);
                        if (!v4.f5159b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + v4.f5158a);
                        }
                    }
                    vVar.q(b3);
                    int i = WorkDatabase_Impl.f7100s;
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) j02.f304k;
                    arrayList = workDatabase_Impl.f5156g;
                    if (arrayList == null) {
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            ((g) workDatabase_Impl.f5156g.get(i5)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z3 = false;
            n5.close();
            J0 j022 = (J0) vVar.f1750m;
            J0.j(b3);
            if (!z3) {
            }
            vVar.q(b3);
            int i6 = WorkDatabase_Impl.f7100s;
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) j022.f304k;
            arrayList = workDatabase_Impl2.f5156g;
            if (arrayList == null) {
            }
        } catch (Throwable th) {
            n5.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i5) {
        this.f6128m = true;
        this.f6127l.m(b(this.f6126k, sQLiteDatabase), i, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0069  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        boolean z3;
        R1.d dVar;
        if (this.f6128m) {
            return;
        }
        v vVar = this.f6127l;
        b b3 = b(this.f6126k, sQLiteDatabase);
        vVar.getClass();
        Cursor n5 = b3.n("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (n5.moveToFirst()) {
                if (n5.getInt(0) != 0) {
                    z3 = true;
                    n5.close();
                    if (z3) {
                        i v4 = J0.v(b3);
                        if (!v4.f5159b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + v4.f5158a);
                        }
                        vVar.q(b3);
                    } else {
                        Cursor m5 = b3.m(new H3.g("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 4));
                        try {
                            String string = m5.moveToFirst() ? m5.getString(0) : null;
                            m5.close();
                            if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                            }
                        } catch (Throwable th) {
                            m5.close();
                            throw th;
                        }
                    }
                    J0 j02 = (J0) vVar.f1750m;
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) j02.f304k;
                    int i = WorkDatabase_Impl.f7100s;
                    workDatabase_Impl.f5151a = b3;
                    b3.l("PRAGMA foreign_keys = ON");
                    dVar = ((WorkDatabase_Impl) j02.f304k).f5154d;
                    synchronized (dVar) {
                        try {
                            if (dVar.f5136e) {
                                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                            } else {
                                b3.l("PRAGMA temp_store = MEMORY;");
                                b3.l("PRAGMA recursive_triggers='ON';");
                                b3.l("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                                dVar.c(b3);
                                dVar.f = new f(((SQLiteDatabase) b3.f6123l).compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                                dVar.f5136e = true;
                            }
                        } finally {
                        }
                    }
                    ArrayList arrayList = ((WorkDatabase_Impl) j02.f304k).f5156g;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            ((g) ((WorkDatabase_Impl) j02.f304k).f5156g.get(i5)).getClass();
                            b3.b();
                            try {
                                int i6 = WorkDatabase.f7099k;
                                b3.l("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f7098j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                b3.p();
                                b3.k();
                            } catch (Throwable th2) {
                                b3.k();
                                throw th2;
                            }
                        }
                    }
                    vVar.f1749l = null;
                    return;
                }
            }
            z3 = false;
            n5.close();
            if (z3) {
            }
            J0 j022 = (J0) vVar.f1750m;
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) j022.f304k;
            int i7 = WorkDatabase_Impl.f7100s;
            workDatabase_Impl2.f5151a = b3;
            b3.l("PRAGMA foreign_keys = ON");
            dVar = ((WorkDatabase_Impl) j022.f304k).f5154d;
            synchronized (dVar) {
            }
        } catch (Throwable th3) {
            n5.close();
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i5) {
        this.f6128m = true;
        this.f6127l.m(b(this.f6126k, sQLiteDatabase), i, i5);
    }
}

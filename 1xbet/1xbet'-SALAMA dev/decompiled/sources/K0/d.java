package K0;

import B3.g;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import p033e3.h;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f3871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P2 f3872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, b[] bVarArr, P2 p5) {
        super(context, str, null, 12, new c(p5, bVarArr));
        p5.getClass();
        this.f3872b = p5;
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

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        b bVarA = a(this.f3871a, sQLiteDatabase);
        P2 p5 = this.f3872b;
        p5.getClass();
        Cursor cursorI = bVarA.i("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z4 = cursorI.moveToFirst() && cursorI.getInt(0) == 0;
            cursorI.close();
            h hVar = (h) p5.f17515c;
            h.Z(bVarA);
            if (!z4) {
                g gVarB0 = h.b0(bVarA);
                if (!gVarB0.f1063b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) gVarB0.f1064c));
                }
            }
            p5.U(bVarA);
            int i7 = WorkDatabase_Impl.f9870s;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) hVar.f12673a;
            ArrayList arrayList = workDatabase_Impl.f1659g;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((p031e1.f) workDatabase_Impl.f1659g.get(i8)).getClass();
                }
            }
        } catch (Throwable th) {
            cursorI.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        this.f3873c = true;
        this.f3872b.O(a(this.f3871a, sQLiteDatabase), i7, i8);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f3873c) {
            return;
        }
        P2 p5 = this.f3872b;
        b bVarA = a(this.f3871a, sQLiteDatabase);
        p5.getClass();
        Cursor cursorI = bVarA.i("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z4 = cursorI.moveToFirst() && cursorI.getInt(0) != 0;
            cursorI.close();
            if (z4) {
                Cursor cursorH = bVarA.h(new J0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 0));
                try {
                    String string = cursorH.moveToFirst() ? cursorH.getString(0) : null;
                    cursorH.close();
                    if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    cursorH.close();
                    throw th;
                }
            } else {
                g gVarB0 = h.b0(bVarA);
                if (!gVarB0.f1063b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) gVarB0.f1064c));
                }
                p5.U(bVarA);
            }
            h hVar = (h) p5.f17515c;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) hVar.f12673a;
            int i7 = WorkDatabase_Impl.f9870s;
            workDatabase_Impl.f1653a = bVarA;
            bVarA.g("PRAGMA foreign_keys = ON");
            D0.e eVar = ((WorkDatabase_Impl) hVar.f12673a).f1656d;
            synchronized (eVar) {
                try {
                    if (eVar.f1635e) {
                        Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    } else {
                        bVarA.g("PRAGMA temp_store = MEMORY;");
                        bVarA.g("PRAGMA recursive_triggers='ON';");
                        bVarA.g("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                        eVar.c(bVarA);
                        eVar.f1636f = new f(((SQLiteDatabase) bVarA.f3868b).compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                        eVar.f1635e = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ArrayList arrayList = ((WorkDatabase_Impl) hVar.f12673a).f1659g;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((p031e1.f) ((WorkDatabase_Impl) hVar.f12673a).f1659g.get(i8)).getClass();
                    bVarA.a();
                    try {
                        int i9 = WorkDatabase.f9869k;
                        bVarA.g("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                        bVarA.j();
                        bVarA.f();
                    } catch (Throwable th3) {
                        bVarA.f();
                        throw th3;
                    }
                }
            }
            p5.f17514b = null;
        } catch (Throwable th4) {
            cursorI.close();
            throw th4;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        this.f3873c = true;
        this.f3872b.O(a(this.f3871a, sQLiteDatabase), i7, i8);
    }
}

package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ay1 extends mx1 {

    /* JADX INFO: renamed from: n */
    public static final String[] f655n = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: l */
    public final pt1 f656l;

    /* JADX INFO: renamed from: m */
    public boolean f657m;

    public ay1(f02 f02Var) {
        super(f02Var);
        this.f656l = new pt1(this, ((f02) this.f7192j).f2242j);
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: D */
    public final boolean mo533D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m534E() {
        int iDelete;
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        try {
            SQLiteDatabase sQLiteDatabaseM536G = m536G();
            if (sQLiteDatabaseM536G == null || (iDelete = sQLiteDatabaseM536G.delete("messages", null, null)) <= 0) {
                return;
            }
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5313b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5313b(e, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r4
      0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: F */
    public final void m535F() {
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        if (!this.f657m && f02Var.f2242j.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM536G = m536G();
                        if (sQLiteDatabaseM536G == null) {
                            this.f657m = true;
                            return;
                        }
                        sQLiteDatabaseM536G.beginTransaction();
                        sQLiteDatabaseM536G.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseM536G.setTransactionSuccessful();
                        sQLiteDatabaseM536G.endTransaction();
                        sQLiteDatabaseM536G.close();
                        return;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        ky1 ky1Var = f02Var.f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4600o.m5313b(e, "Error deleting app launch break from local database");
                        this.f657m = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e2) {
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5313b(e2, "Error deleting app launch break from local database");
                    this.f657m = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            ky1 ky1Var3 = f02Var.f2247o;
            f02.m1560m(ky1Var3);
            ky1Var3.f4603r.m5312a("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX INFO: renamed from: G */
    public final SQLiteDatabase m536G() {
        if (this.f657m) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f656l.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f657m = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
      0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX INFO: renamed from: H */
    public final boolean m537H(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseM536G;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        boolean z3 = false;
        z3 = false;
        if (!this.f657m) {
            bt1 bt1Var = f02Var.f2245m;
            ky1 ky1Var = f02Var.f2247o;
            ix1 ix1Var = jx1.f4157W0;
            Cursor cursor = null;
            cursor = null;
            z72 z72VarM5217E = bt1Var.m770L(null, ix1Var) ? f02Var.m1575r().m5217E(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (f02Var.f2245m.m770L(null, ix1Var) && z72VarM5217E != null) {
                contentValues.put("app_version", z72VarM5217E.f9657l);
                contentValues.put("app_version_int", Long.valueOf(z72VarM5217E.f9664s));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseM536G = m536G();
                    if (sQLiteDatabaseM536G == null) {
                        this.f657m = true;
                    } else {
                        try {
                            sQLiteDatabaseM536G.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseM536G.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseM536G != null) {
                                            sQLiteDatabaseM536G.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM536G != null) {
                                        sQLiteDatabaseM536G.close();
                                    }
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    f02.m1560m(ky1Var);
                                    ky1Var.f4600o.m5313b(e, "Error writing entry; local database full");
                                    this.f657m = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM536G != null) {
                                        sQLiteDatabaseM536G.close();
                                    }
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabaseM536G != null) {
                                        sQLiteDatabaseM536G.endTransaction();
                                    }
                                    f02.m1560m(ky1Var);
                                    ky1Var.f4600o.m5313b(e, "Error writing entry to local database");
                                    this.f657m = z2;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM536G != null) {
                                        sQLiteDatabaseM536G.close();
                                    }
                                    i3++;
                                    z3 = z;
                                }
                            }
                            if (j >= 100000) {
                                f02.m1560m(ky1Var);
                                ky1Var.f4600o.m5312a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseM536G.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    f02.m1560m(ky1Var);
                                    wc1 wc1Var = ky1Var.f4600o;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                wc1Var.m5315d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                f02.m1560m(ky1Var);
                                                ky1Var.f4600o.m5313b(e, "Error writing entry; local database full");
                                                this.f657m = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM536G != null) {
                                                    sQLiteDatabaseM536G.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                if (sQLiteDatabaseM536G != null) {
                                                    sQLiteDatabaseM536G.endTransaction();
                                                }
                                                f02.m1560m(ky1Var);
                                                ky1Var.f4600o.m5313b(e, "Error writing entry to local database");
                                                this.f657m = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM536G != null) {
                                                    sQLiteDatabaseM536G.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM536G != null) {
                                                sQLiteDatabaseM536G.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        f02.m1560m(ky1Var);
                                        ky1Var.f4600o.m5313b(e, "Error writing entry; local database full");
                                        this.f657m = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM536G != null) {
                                            sQLiteDatabaseM536G.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        z2 = true;
                                        if (sQLiteDatabaseM536G != null && sQLiteDatabaseM536G.inTransaction()) {
                                            sQLiteDatabaseM536G.endTransaction();
                                        }
                                        f02.m1560m(ky1Var);
                                        ky1Var.f4600o.m5313b(e, "Error writing entry to local database");
                                        this.f657m = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM536G != null) {
                                            sQLiteDatabaseM536G.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseM536G.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseM536G.setTransactionSuccessful();
                            sQLiteDatabaseM536G.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseM536G.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM536G = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM536G = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseM536G = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseM536G = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5312a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}

package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class qf {
    private static final Object gm = new Object();
    private gm pcc;
    private Context sf;

    qf(Context context) {
        try {
            this.sf = context == null ? lu.pcc() : context.getApplicationContext();
            if (this.pcc == null) {
                this.pcc = new gm();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context gm() {
        Context context = this.sf;
        return context == null ? lu.pcc() : context;
    }

    public class gm {
        private SQLiteDatabase sf = null;

        public gm() {
        }

        private synchronized void sf() {
            pcc pccVar;
            try {
                synchronized (qf.gm) {
                    SQLiteDatabase sQLiteDatabase = this.sf;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        if (com.bytedance.sdk.component.utils.fum.pcc(qf.this.gm())) {
                            qf qfVar = qf.this;
                            pccVar = qfVar.new pcc(qfVar.gm(), "ttopensdk.db");
                        } else {
                            qf qfVar2 = qf.this;
                            pccVar = qfVar2.new pcc(qfVar2.gm(), "ttopensdk_" + com.bytedance.sdk.component.utils.fum.gm(qf.this.gm()) + ".db");
                        }
                        SQLiteDatabase writableDatabase = pccVar.getWritableDatabase();
                        this.sf = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", th.getMessage());
                if (gm()) {
                    throw th;
                }
            }
        }

        public SQLiteDatabase pcc() {
            sf();
            return this.sf;
        }

        public synchronized Cursor pcc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                sf();
                cursor = this.sf.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", th.getMessage());
                sf sfVar = new sf();
                if (gm()) {
                    throw th;
                }
                cursor = sfVar;
            }
            return cursor;
        }

        public synchronized int pcc(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                sf();
                i = this.sf.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", e.getMessage());
                if (gm()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        public synchronized long pcc(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                sf();
                j = this.sf.replace(str, str2, contentValues);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", e.getMessage());
                if (gm()) {
                    throw e;
                }
                j = -1;
            }
            return j;
        }

        public synchronized int pcc(String str, String str2, String[] strArr) {
            int i;
            try {
                sf();
                i = this.sf.delete(str, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", e.getMessage());
                if (gm()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        private synchronized boolean gm() {
            SQLiteDatabase sQLiteDatabase = this.sf;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }
    }

    private class pcc extends SQLiteOpenHelper {
        final Context pcc;

        public pcc(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 11);
            this.pcc = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                pcc(sQLiteDatabase, this.pcc);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", th.getMessage());
            }
        }

        private void pcc(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.oo.pcc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.vh.gm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.dax.pcc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.jr.pcc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.qy.sf.pcc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.lu.gm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.pcc.sf.sf.gm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.hc.pcc.gm.gm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.nac.pcc());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    gm(sQLiteDatabase);
                    pcc(sQLiteDatabase, qf.this.sf);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.gm(th.getMessage(), new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    gm(sQLiteDatabase);
                } catch (Throwable unused) {
                }
            }
            pcc(sQLiteDatabase, qf.this.sf);
            switch (i) {
                case 1:
                    pcc(sQLiteDatabase);
                    break;
                case 2:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                    pcc(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.dax.pcc());
                    pcc(sQLiteDatabase);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.pcc.sf.sf.gm());
                    pcc(sQLiteDatabase);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.jr.pcc());
                    pcc(sQLiteDatabase);
                    break;
                case 6:
                    pcc(sQLiteDatabase);
                    break;
            }
            if (i < 11) {
                try {
                    sf(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.qy.sf.pcc(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.gm("DBHelper", th.getMessage());
                }
            }
        }

        private void pcc(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.oo.sf());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.vh.oo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.dax.sf());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.jr.sf());
        }

        private void sf(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.hc.pcc.gm.oo());
        }

        private void gm(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> oo = oo(sQLiteDatabase);
            if (oo == null || oo.size() <= 0) {
                return;
            }
            Iterator<String> it = oo.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        
            if (r1 != null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        
            r1.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
        
            if (r1 != null) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ArrayList<String> oo(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public gm pcc() {
        return this.pcc;
    }

    private class sf extends AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }

        private sf() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }
    }
}

package com.bytedance.sdk.openadsdk.core.qf;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.openadsdk.core.lu;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
class gm {
    private static final Object gm = new Object();
    private C0171gm pcc;
    private Context sf;

    gm(Context context) {
        try {
            this.sf = context == null ? lu.pcc() : context.getApplicationContext();
            if (this.pcc == null) {
                this.pcc = new C0171gm();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context gm() {
        Context context = this.sf;
        return context == null ? lu.pcc() : context;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.qf.gm$gm, reason: collision with other inner class name */
    public class C0171gm {
        private SQLiteDatabase sf = null;

        public C0171gm() {
        }

        private synchronized void pcc() {
            pcc pccVar;
            try {
                synchronized (gm.gm) {
                    SQLiteDatabase sQLiteDatabase = this.sf;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        if (fum.pcc(gm.this.gm())) {
                            gm gmVar = gm.this;
                            pccVar = gmVar.new pcc(gmVar.gm(), "pag_business.db");
                        } else {
                            gm gmVar2 = gm.this;
                            pccVar = gmVar2.new pcc(gmVar2.gm(), "pag_business_" + fum.gm(gm.this.gm()) + ".db");
                        }
                        SQLiteDatabase writableDatabase = pccVar.getWritableDatabase();
                        this.sf = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
                if (sf()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor pcc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                pcc();
                cursor = this.sf.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                th.getMessage();
                sf sfVar = new sf();
                if (sf()) {
                    throw th;
                }
                cursor = sfVar;
            }
            return cursor;
        }

        public synchronized int pcc(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                pcc();
                i = this.sf.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                e.getMessage();
                if (sf()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        public synchronized long pcc(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                pcc();
                j = this.sf.replace(str, str2, contentValues);
            } catch (Exception e) {
                e.getMessage();
                if (sf()) {
                    throw e;
                }
                j = -1;
            }
            return j;
        }

        public long sf(String str, String str2, ContentValues contentValues) {
            try {
                pcc();
                SQLiteDatabase sQLiteDatabase = this.sf;
                if (sQLiteDatabase == null) {
                    return -1L;
                }
                return sQLiteDatabase.insertWithOnConflict(str, str2, contentValues, 5);
            } catch (Exception e) {
                e.getMessage();
                return -1L;
            }
        }

        public synchronized int pcc(String str, String str2, String[] strArr) {
            int i;
            try {
                pcc();
                i = this.sf.delete(str, str2, strArr);
            } catch (Exception e) {
                e.getMessage();
                if (sf()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        private synchronized boolean sf() {
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
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
            this.pcc = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                pcc(sQLiteDatabase, this.pcc);
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        private void pcc(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gbb.pcc.pcc.sf.vj());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.gbb.pcc.pcc.sf.wh());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    pcc(sQLiteDatabase);
                    pcc(sQLiteDatabase, gm.this.sf);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                if (i <= i2) {
                    pcc(sQLiteDatabase, gm.this.sf);
                } else {
                    pcc(sQLiteDatabase);
                    pcc(sQLiteDatabase, gm.this.sf);
                }
            } catch (Throwable unused) {
            }
        }

        private void pcc(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> sf = sf(sQLiteDatabase);
            if (sf == null || sf.size() <= 0) {
                return;
            }
            Iterator<String> it = sf.iterator();
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
        private ArrayList<String> sf(SQLiteDatabase sQLiteDatabase) {
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

    public C0171gm pcc() {
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

package com.bytedance.sdk.component.wh.pcc.pcc.pcc;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.wh;
import com.bytedance.sdk.component.wh.pcc.qf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class oo extends SQLiteOpenHelper {
    final Context pcc;

    public oo(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.pcc = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            pcc(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    private void pcc(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.pcc.sf(qf.wh().gm().sf()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.oo.gm(qf.wh().gm().pcc()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.qf.gm(qf.wh().gm().oo()));
        sQLiteDatabase.execSQL(wh.pcc(qf.wh().gm().vj()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.wh.pcc.wh.wh.sf());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                sf(sQLiteDatabase);
                pcc(sQLiteDatabase);
            } else {
                pcc(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private void sf(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> gm = gm(sQLiteDatabase);
        if (gm == null || gm.size() <= 0) {
            return;
        }
        Iterator<String> it = gm.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> gm(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                rawQuery.close();
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}

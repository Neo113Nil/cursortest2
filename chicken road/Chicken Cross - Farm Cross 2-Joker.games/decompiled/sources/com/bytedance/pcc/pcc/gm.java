package com.bytedance.pcc.pcc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.pcc.gm;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class gm extends SQLiteOpenHelper {
    private final Context pcc;
    private final ConcurrentHashMap<Class<? extends com.bytedance.pcc.pcc>, qf<? extends com.bytedance.pcc.pcc>> sf;

    public gm(Context context, sf sfVar, gm.vj vjVar) {
        super(context, pcc("events_" + vjVar.gm()), (SQLiteDatabase.CursorFactory) null, 1);
        this.pcc = context;
        this.sf = sfVar.sf();
        setWriteAheadLoggingEnabled(vjVar.wh());
    }

    private static String pcc(String str) {
        return str + "_" + com.bytedance.pcc.pcc.sf.gm.pcc();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        pcc(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        try {
            if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                sQLiteDatabase.execSQL("PRAGMA synchronous = NORMAL;");
            }
        } catch (Exception unused) {
        }
    }

    private void pcc(SQLiteDatabase sQLiteDatabase) {
        for (qf<? extends com.bytedance.pcc.pcc> qfVar : this.sf.values()) {
            try {
                sQLiteDatabase.execSQL(qfVar.qf());
                String kj = qfVar.kj();
                String str = "CREATE INDEX IF NOT EXISTS idx_" + kj + "_data_id ON " + kj + " (data_id);";
                String str2 = "CREATE INDEX IF NOT EXISTS idx_" + kj + "_create_time ON " + kj + " (create_time);";
                sQLiteDatabase.execSQL(str);
                sQLiteDatabase.execSQL(str2);
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_" + kj + "_priority ON " + kj + " (priority);");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            sf(sQLiteDatabase);
        }
        pcc(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            sf(sQLiteDatabase);
            pcc(sQLiteDatabase);
        }
    }

    private void sf(SQLiteDatabase sQLiteDatabase) {
        Iterator<qf<? extends com.bytedance.pcc.pcc>> it = this.sf.values().iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(it.next().kj())));
            } catch (Exception unused) {
            }
        }
    }
}

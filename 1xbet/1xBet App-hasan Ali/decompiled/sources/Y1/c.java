package Y1;

import G.v;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f6124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f6125b;

    public c(v vVar, b[] bVarArr) {
        this.f6124a = vVar;
        this.f6125b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b b3 = d.b(this.f6125b, sQLiteDatabase);
        this.f6124a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) b3.f6123l).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) b3.f6123l;
        if (!sQLiteDatabase2.isOpen()) {
            v.f(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                b3.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    v.f((String) it.next().second);
                }
            } else {
                v.f(sQLiteDatabase2.getPath());
            }
        }
    }
}

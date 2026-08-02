package K0;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import w1.P2;

/* loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P2 f3869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f3870b;

    public c(P2 p22, b[] bVarArr) {
        this.f3869a = p22;
        this.f3870b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b a2 = d.a(this.f3870b, sQLiteDatabase);
        this.f3869a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) a2.f3868b).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) a2.f3868b;
        if (!sQLiteDatabase2.isOpen()) {
            P2.o(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                a2.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    P2.o((String) it.next().second);
                }
            } else {
                P2.o(sQLiteDatabase2.getPath());
            }
        }
    }
}

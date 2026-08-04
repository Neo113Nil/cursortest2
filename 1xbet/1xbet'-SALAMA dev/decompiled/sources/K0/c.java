package K0;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P2 f3869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f3870b;

    public c(P2 p5, b[] bVarArr) {
        this.f3869a = p5;
        this.f3870b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b bVarA = d.a(this.f3870b, sQLiteDatabase);
        this.f3869a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) bVarA.f3868b).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) bVarA.f3868b;
        if (!sQLiteDatabase2.isOpen()) {
            P2.o(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                bVarA.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<Pair<String, String>> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    P2.o((String) it.next().second);
                }
            } else {
                P2.o(sQLiteDatabase2.getPath());
            }
        }
    }
}

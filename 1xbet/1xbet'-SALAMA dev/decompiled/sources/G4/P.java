package G4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R4.c f2925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2926b;

    public P(Context context, R4.c cVar, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 17);
        this.f2925a = cVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f2926b = true;
        sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f2926b) {
            onConfigure(sQLiteDatabase);
        }
        new V0(12, sQLiteDatabase, this.f2925a, false).X(0);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        if (this.f2926b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f2926b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        if (!this.f2926b) {
            onConfigure(sQLiteDatabase);
        }
        new V0(12, sQLiteDatabase, this.f2925a, false).X(i7);
    }
}

package K0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* loaded from: classes.dex */
public final class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0.d f3865a;

    public a(J0.d dVar) {
        this.f3865a = dVar;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f3865a.b(new b(sQLiteQuery, 1));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}

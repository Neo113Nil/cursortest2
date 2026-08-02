package G4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2928b;

    public /* synthetic */ Q(Object obj, int i7) {
        this.f2927a = i7;
        this.f2928b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f2927a) {
            case 0:
                S.Y(sQLiteQuery, (Object[]) this.f2928b);
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                List list = ((i5.l) this.f2928b).f14062b;
                if (list != null) {
                    int size = list.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object a2 = i5.l.a(list.get(i7));
                        int i8 = i7 + 1;
                        if (a2 == null) {
                            sQLiteQuery.bindNull(i8);
                        } else if (a2 instanceof byte[]) {
                            sQLiteQuery.bindBlob(i8, (byte[]) a2);
                        } else if (a2 instanceof Double) {
                            sQLiteQuery.bindDouble(i8, ((Double) a2).doubleValue());
                        } else if (a2 instanceof Integer) {
                            sQLiteQuery.bindLong(i8, ((Integer) a2).intValue());
                        } else if (a2 instanceof Long) {
                            sQLiteQuery.bindLong(i8, ((Long) a2).longValue());
                        } else if (a2 instanceof String) {
                            sQLiteQuery.bindString(i8, (String) a2);
                        } else {
                            if (!(a2 instanceof Boolean)) {
                                throw new IllegalArgumentException("Could not bind " + a2 + " from index " + i7 + ": Supported types are null, byte[], double, long, boolean and String");
                            }
                            sQLiteQuery.bindLong(i8, ((Boolean) a2).booleanValue() ? 1L : 0L);
                        }
                        i7 = i8;
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}

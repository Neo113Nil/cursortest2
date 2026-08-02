package Z6;

import Z6.y;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes9.dex */
public final /* synthetic */ class v implements y.a {
    @Override // Z6.y.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}

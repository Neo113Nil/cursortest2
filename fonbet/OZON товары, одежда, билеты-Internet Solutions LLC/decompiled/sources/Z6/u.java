package Z6;

import Z6.y;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes9.dex */
public final /* synthetic */ class u implements y.a {
    @Override // Z6.y.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}

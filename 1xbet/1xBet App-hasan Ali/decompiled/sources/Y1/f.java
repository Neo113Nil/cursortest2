package Y1;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: n, reason: collision with root package name */
    public final SQLiteStatement f6136n;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f6136n = sQLiteStatement;
    }

    public final void r() {
        this.f6136n.executeUpdateDelete();
    }
}

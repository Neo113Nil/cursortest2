package K0;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteStatement f3881d;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f3881d = sQLiteStatement;
    }

    public final void k() {
        this.f3881d.executeUpdateDelete();
    }
}

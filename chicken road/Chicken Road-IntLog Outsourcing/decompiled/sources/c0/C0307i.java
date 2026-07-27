package c0;

import android.database.sqlite.SQLiteStatement;
import b0.InterfaceC0262c;

/* renamed from: c0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307i extends C0306h implements InterfaceC0262c {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f4892b;

    public C0307i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f4892b = sQLiteStatement;
    }

    public final int a() {
        return this.f4892b.executeUpdateDelete();
    }
}

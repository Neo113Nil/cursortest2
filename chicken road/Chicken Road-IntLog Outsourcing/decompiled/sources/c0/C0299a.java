package c0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import b0.InterfaceC0263d;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0299a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4866b;

    public /* synthetic */ C0299a(int i2, Object obj) {
        this.f4865a = i2;
        this.f4866b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f4865a) {
            case 0:
                InterfaceC0263d interfaceC0263d = (InterfaceC0263d) this.f4866b;
                kotlin.jvm.internal.i.b(sQLiteQuery);
                interfaceC0263d.b(new C0306h(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                return (Cursor) ((C0300b) this.f4866b).invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}

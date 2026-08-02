package Y1;

import H3.g;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* loaded from: classes.dex */
public class b implements AutoCloseable, Closeable {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f6121m = new String[0];

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6122k;

    /* renamed from: l, reason: collision with root package name */
    public final SQLiteClosable f6123l;

    public /* synthetic */ b(SQLiteClosable sQLiteClosable, int i) {
        this.f6122k = i;
        this.f6123l = sQLiteClosable;
    }

    public void b() {
        ((SQLiteDatabase) this.f6123l).beginTransaction();
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.f6122k) {
            case 0:
                ((SQLiteDatabase) this.f6123l).close();
                break;
            default:
                ((SQLiteProgram) this.f6123l).close();
                break;
        }
    }

    public void d(int i, byte[] bArr) {
        ((SQLiteProgram) this.f6123l).bindBlob(i, bArr);
    }

    public void f(int i, long j5) {
        ((SQLiteProgram) this.f6123l).bindLong(i, j5);
    }

    public void h(int i) {
        ((SQLiteProgram) this.f6123l).bindNull(i);
    }

    public void i(String str, int i) {
        ((SQLiteProgram) this.f6123l).bindString(i, str);
    }

    public void k() {
        ((SQLiteDatabase) this.f6123l).endTransaction();
    }

    public void l(String str) {
        ((SQLiteDatabase) this.f6123l).execSQL(str);
    }

    public Cursor m(X1.c cVar) {
        return ((SQLiteDatabase) this.f6123l).rawQueryWithFactory(new a(cVar), cVar.d(), f6121m, null);
    }

    public Cursor n(String str) {
        return m(new g(str, 4));
    }

    public void p() {
        ((SQLiteDatabase) this.f6123l).setTransactionSuccessful();
    }
}

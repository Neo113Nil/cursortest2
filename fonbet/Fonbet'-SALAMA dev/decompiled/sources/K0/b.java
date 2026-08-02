package K0;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* loaded from: classes.dex */
public class b implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3866c = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3867a;

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteClosable f3868b;

    public /* synthetic */ b(SQLiteClosable sQLiteClosable, int i7) {
        this.f3867a = i7;
        this.f3868b = sQLiteClosable;
    }

    public void a() {
        ((SQLiteDatabase) this.f3868b).beginTransaction();
    }

    public void b(int i7, byte[] bArr) {
        ((SQLiteProgram) this.f3868b).bindBlob(i7, bArr);
    }

    public void c(int i7, long j) {
        ((SQLiteProgram) this.f3868b).bindLong(i7, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3867a) {
            case 0:
                ((SQLiteDatabase) this.f3868b).close();
                break;
            default:
                ((SQLiteProgram) this.f3868b).close();
                break;
        }
    }

    public void d(int i7) {
        ((SQLiteProgram) this.f3868b).bindNull(i7);
    }

    public void e(int i7, String str) {
        ((SQLiteProgram) this.f3868b).bindString(i7, str);
    }

    public void f() {
        ((SQLiteDatabase) this.f3868b).endTransaction();
    }

    public void g(String str) {
        ((SQLiteDatabase) this.f3868b).execSQL(str);
    }

    public Cursor h(J0.d dVar) {
        return ((SQLiteDatabase) this.f3868b).rawQueryWithFactory(new a(dVar), dVar.a(), f3866c, null);
    }

    public Cursor i(String str) {
        return h(new J0.a(str, 0));
    }

    public void j() {
        ((SQLiteDatabase) this.f3868b).setTransactionSuccessful();
    }
}

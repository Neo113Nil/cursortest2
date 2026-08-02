package P4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import fd.InterfaceC6512o;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements O4.b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String[] f21810b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String[] f21811c = new String[0];

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SQLiteDatabase f21812a;

    static final class a extends AbstractC7737t implements InterfaceC6512o<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O4.e f21813b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O4.e eVar) {
            super(4);
            this.f21813b = eVar;
        }

        @Override // fd.InterfaceC6512o
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            SQLiteQuery sQLiteQuery2 = sQLiteQuery;
            Intrinsics.f(sQLiteQuery2);
            this.f21813b.d(new h(sQLiteQuery2));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery2);
        }
    }

    public c(@NotNull SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f21812a = delegate;
    }

    @Override // O4.b
    public final void A() {
        this.f21812a.beginTransaction();
    }

    @Override // O4.b
    @NotNull
    public final O4.f C1(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f21812a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new i(compileStatement);
    }

    @Override // O4.b
    @NotNull
    public final Cursor G(@NotNull O4.e query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final a aVar = new a(query);
        Cursor rawQueryWithFactory = this.f21812a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: P4.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                InterfaceC6512o tmp0 = InterfaceC6512o.this;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.c(), f21811c, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // O4.b
    public final void H1(@NotNull Object[] bindArgs) throws SQLException {
        Intrinsics.checkNotNullParameter("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f21812a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    @Override // O4.b
    public final void J() {
        this.f21812a.beginTransactionNonExclusive();
    }

    @Override // O4.b
    @NotNull
    public final Cursor N1(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return G(new O4.a(query));
    }

    @Override // O4.b
    public final void O0(@NotNull String sql) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f21812a.execSQL(sql);
    }

    @Override // O4.b
    public final boolean T1() {
        return this.f21812a.inTransaction();
    }

    @Override // O4.b
    public final boolean W1() {
        SQLiteDatabase sQLiteDatabase = this.f21812a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // O4.b
    @NotNull
    public final Cursor Y0(@NotNull final O4.e query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        String sql = query.c();
        String[] selectionArgs = f21811c;
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: P4.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                O4.e query2 = O4.e.this;
                Intrinsics.checkNotNullParameter(query2, "$query");
                Intrinsics.f(sQLiteQuery);
                query2.d(new h(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        SQLiteDatabase sQLiteDatabase = this.f21812a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, null, cancellationSignal);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // O4.b
    public final int Z1(@NotNull ContentValues values, Object[] objArr) {
        Intrinsics.checkNotNullParameter("WorkSpec", "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f21810b[3]);
        sb2.append("WorkSpec SET ");
        int i11 = 0;
        for (String str : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str);
            objArr2[i11] = values.get(str);
            sb2.append("=?");
            i11++;
        }
        for (int i12 = size; i12 < length; i12++) {
            objArr2[i12] = objArr[i12 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        O4.f statement = C1(sb3);
        Intrinsics.checkNotNullParameter(statement, "statement");
        int length2 = objArr2.length;
        int i13 = 0;
        while (i13 < length2) {
            Object obj = objArr2[i13];
            i13++;
            if (obj == null) {
                statement.C0(i13);
            } else if (obj instanceof byte[]) {
                statement.q0(i13, (byte[]) obj);
            } else if (obj instanceof Float) {
                statement.S0(i13, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                statement.S0(i13, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                statement.m0(i13, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                statement.m0(i13, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                statement.m0(i13, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                statement.m0(i13, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                statement.e0(i13, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i13 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                statement.m0(i13, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((i) statement).C();
    }

    public final List<Pair<String, String>> c() {
        return this.f21812a.getAttachedDbs();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21812a.close();
    }

    public final String d() {
        return this.f21812a.getPath();
    }

    @Override // O4.b
    public final void f1() {
        this.f21812a.setTransactionSuccessful();
    }

    @Override // O4.b
    public final void i1() {
        this.f21812a.endTransaction();
    }

    @Override // O4.b
    public final boolean isOpen() {
        return this.f21812a.isOpen();
    }

    public final boolean j(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.d(this.f21812a, sqLiteDatabase);
    }
}

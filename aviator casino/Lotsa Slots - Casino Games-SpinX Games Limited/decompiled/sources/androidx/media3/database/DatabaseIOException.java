package androidx.media3.database;

/* loaded from: classes2.dex */
public final class DatabaseIOException extends java.io.IOException {
    public DatabaseIOException(android.database.SQLException sQLException) {
        super(sQLException);
    }

    public DatabaseIOException(android.database.SQLException sQLException, java.lang.String str) {
        super(str, sQLException);
    }
}

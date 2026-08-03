package androidx.media3.database;

/* loaded from: classes2.dex */
public interface DatabaseProvider {
    public static final java.lang.String TABLE_PREFIX = "ExoPlayer";

    android.database.sqlite.SQLiteDatabase getReadableDatabase();

    android.database.sqlite.SQLiteDatabase getWritableDatabase();
}

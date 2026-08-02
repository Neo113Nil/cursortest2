package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public interface SQLiteDatabaseHook {
    void postKey(net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection);

    void preKey(net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection);
}

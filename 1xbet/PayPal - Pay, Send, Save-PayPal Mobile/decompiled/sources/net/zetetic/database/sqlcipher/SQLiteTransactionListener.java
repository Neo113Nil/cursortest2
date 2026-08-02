package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public interface SQLiteTransactionListener {
    void onBegin();

    void onCommit();

    void onRollback();
}

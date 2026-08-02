package net.zetetic.database.sqlcipher;

/* loaded from: classes17.dex */
public class DatabaseObjectNotClosedException extends java.lang.RuntimeException {
    private static final java.lang.String s = "Application did not close the cursor or database object that was opened here";

    public DatabaseObjectNotClosedException() {
        super(s);
    }
}

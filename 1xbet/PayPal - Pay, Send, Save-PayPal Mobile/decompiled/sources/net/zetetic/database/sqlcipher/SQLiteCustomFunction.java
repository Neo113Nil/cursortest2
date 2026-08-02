package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteCustomFunction {
    public final net.zetetic.database.sqlcipher.SQLiteDatabase.CustomFunction callback;

    /* renamed from: name, reason: collision with root package name */
    public final java.lang.String f7028name;
    public final int numArgs;

    public SQLiteCustomFunction(java.lang.String str, int i, net.zetetic.database.sqlcipher.SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("name must not be null.");
        }
        this.f7028name = str;
        this.numArgs = i;
        this.callback = customFunction;
    }

    private void dispatchCallback(java.lang.String[] strArr) {
        this.callback.callback(strArr);
    }
}

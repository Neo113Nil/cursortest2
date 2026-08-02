package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteDatabaseConfiguration {
    private static final java.util.regex.Pattern EMAIL_IN_DB_PATTERN = java.util.regex.Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    public static final java.lang.String MEMORY_DB_PATH = ":memory:";
    public final java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteCustomFunction> customFunctions;
    public net.zetetic.database.sqlcipher.SQLiteDatabaseHook databaseHook;
    public boolean foreignKeyConstraintsEnabled;
    public final java.lang.String label;
    public java.util.Locale locale;
    public int maxSqlCacheSize;
    public int openFlags;
    public byte[] password;
    public final java.lang.String path;

    public SQLiteDatabaseConfiguration(java.lang.String str, int i) {
        this(str, i, null, null);
    }

    public SQLiteDatabaseConfiguration(java.lang.String str, int i, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.customFunctions = new java.util.ArrayList<>();
        if (str == null) {
            throw new java.lang.IllegalArgumentException("path must not be null.");
        }
        this.path = str;
        this.label = stripPathForLogs(str);
        this.openFlags = i;
        this.password = bArr;
        this.databaseHook = sQLiteDatabaseHook;
        this.maxSqlCacheSize = 25;
        this.locale = java.util.Locale.getDefault();
    }

    public SQLiteDatabaseConfiguration(net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.customFunctions = new java.util.ArrayList<>();
        if (sQLiteDatabaseConfiguration == null) {
            throw new java.lang.IllegalArgumentException("other must not be null.");
        }
        this.path = sQLiteDatabaseConfiguration.path;
        this.label = sQLiteDatabaseConfiguration.label;
        updateParametersFrom(sQLiteDatabaseConfiguration);
    }

    public final void updateParametersFrom(net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new java.lang.IllegalArgumentException("other must not be null.");
        }
        if (!this.path.equals(sQLiteDatabaseConfiguration.path)) {
            throw new java.lang.IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.openFlags = sQLiteDatabaseConfiguration.openFlags;
        this.maxSqlCacheSize = sQLiteDatabaseConfiguration.maxSqlCacheSize;
        this.locale = sQLiteDatabaseConfiguration.locale;
        this.foreignKeyConstraintsEnabled = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
        this.password = sQLiteDatabaseConfiguration.password;
        this.databaseHook = sQLiteDatabaseConfiguration.databaseHook;
        this.customFunctions.clear();
        this.customFunctions.addAll(sQLiteDatabaseConfiguration.customFunctions);
    }

    public final boolean isInMemoryDb() {
        return this.path.equalsIgnoreCase(MEMORY_DB_PATH);
    }

    private static java.lang.String stripPathForLogs(java.lang.String str) {
        int indexOf = str.indexOf(63);
        if (indexOf >= 0) {
            str = (java.lang.String) str.subSequence(0, indexOf);
        }
        return str.indexOf(64) == -1 ? str : EMAIL_IN_DB_PATTERN.matcher(str).replaceAll("XX@YY");
    }
}

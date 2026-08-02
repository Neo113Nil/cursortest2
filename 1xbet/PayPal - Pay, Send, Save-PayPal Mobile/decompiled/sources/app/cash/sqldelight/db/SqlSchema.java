package app.cash.sqldelight.db;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult;", "", "T", "", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "create", "(Lapp/cash/sqldelight/db/SqlDriver;)Lapp/cash/sqldelight/db/QueryResult;", "", "oldVersion", "newVersion", "", "Lapp/cash/sqldelight/db/AfterVersion;", "callbacks", "migrate", "(Lapp/cash/sqldelight/db/SqlDriver;JJ[Lapp/cash/sqldelight/db/AfterVersion;)Lapp/cash/sqldelight/db/QueryResult;", "getVersion", "()J", "version"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SqlSchema<T extends app.cash.sqldelight.db.QueryResult<kotlin.Unit>> {
    T create(app.cash.sqldelight.db.SqlDriver driver);

    long getVersion();

    T migrate(app.cash.sqldelight.db.SqlDriver driver, long oldVersion, long newVersion, app.cash.sqldelight.db.AfterVersion... callbacks);
}

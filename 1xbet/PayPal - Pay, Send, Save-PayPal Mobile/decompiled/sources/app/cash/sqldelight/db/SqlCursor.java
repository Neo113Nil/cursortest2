package app.cash.sqldelight.db;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lapp/cash/sqldelight/db/SqlCursor;", "", "", "index", "", "getBoolean", "(I)Ljava/lang/Boolean;", "", "getBytes", "(I)[B", "", "getDouble", "(I)Ljava/lang/Double;", "", "getLong", "(I)Ljava/lang/Long;", "", "getString", "(I)Ljava/lang/String;", "Lapp/cash/sqldelight/db/QueryResult;", io.ktor.http.LinkHeader.Rel.Next, "()Lapp/cash/sqldelight/db/QueryResult;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SqlCursor {
    java.lang.Boolean getBoolean(int index);

    byte[] getBytes(int index);

    java.lang.Double getDouble(int index);

    java.lang.Long getLong(int index);

    java.lang.String getString(int index);

    app.cash.sqldelight.db.QueryResult<java.lang.Boolean> next();
}

package androidx.room;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b"}, d2 = {"Landroidx/room/RoomOpenDelegate;", "Landroidx/room/RoomOpenDelegateMarker;", "", "version", "", "identityHash", "legacyIdentityHash", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "Landroidx/sqlite/SQLiteConnection;", "connection", "", "onCreate", "(Landroidx/sqlite/SQLiteConnection;)V", "onPreMigrate", "Landroidx/room/RoomOpenDelegate$ValidationResult;", "onValidateSchema", "(Landroidx/sqlite/SQLiteConnection;)Landroidx/room/RoomOpenDelegate$ValidationResult;", "onPostMigrate", "onOpen", "createAllTables", "dropAllTables", com.visa.cbp.getEncExpo.warmup, "getVersion", "()I", "Ljava/lang/String;", "getIdentityHash", "()Ljava/lang/String;", "getLegacyIdentityHash", "ValidationResult"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RoomOpenDelegate implements androidx.room.RoomOpenDelegateMarker {
    private final java.lang.String identityHash;
    private final java.lang.String legacyIdentityHash;
    private final int version;

    public abstract void createAllTables(androidx.database.SQLiteConnection connection);

    public abstract void dropAllTables(androidx.database.SQLiteConnection connection);

    public abstract void onCreate(androidx.database.SQLiteConnection connection);

    public abstract void onOpen(androidx.database.SQLiteConnection connection);

    public abstract void onPostMigrate(androidx.database.SQLiteConnection connection);

    public abstract void onPreMigrate(androidx.database.SQLiteConnection connection);

    public abstract androidx.room.RoomOpenDelegate.ValidationResult onValidateSchema(androidx.database.SQLiteConnection connection);

    public RoomOpenDelegate(int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.version = i;
        this.identityHash = str;
        this.legacyIdentityHash = str2;
    }

    public final int getVersion() {
        return this.version;
    }

    public final java.lang.String getIdentityHash() {
        return this.identityHash;
    }

    public final java.lang.String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\t"}, d2 = {"Landroidx/room/RoomOpenDelegate$ValidationResult;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "Z", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ValidationResult {
        public final java.lang.String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z, java.lang.String str) {
            this.isValid = z;
            this.expectedFoundMsg = str;
        }
    }
}

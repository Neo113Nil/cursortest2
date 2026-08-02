package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t"}, d2 = {"Landroidx/room/RoomMasterTable;", "", "<init>", "()V", "", "hash", "createInsertQuery", "(Ljava/lang/String;)Ljava/lang/String;", "TABLE_NAME", "Ljava/lang/String;", "NAME", "DEFAULT_ID", "CREATE_QUERY", "READ_QUERY"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoomMasterTable {
    public static final java.lang.String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
    public static final java.lang.String DEFAULT_ID = "42";
    public static final androidx.room.RoomMasterTable INSTANCE = new androidx.room.RoomMasterTable();
    public static final java.lang.String NAME = "room_master_table";
    public static final java.lang.String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";
    public static final java.lang.String TABLE_NAME = "room_master_table";

    private RoomMasterTable() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String createInsertQuery(java.lang.String hash) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hash, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(hash);
        sb.append("')");
        return sb.toString();
    }
}

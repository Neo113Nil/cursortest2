package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/RoomWarnings;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class RoomWarnings {
    public static final java.lang.String AMBIGUOUS_COLUMN_IN_RESULT = "ROOM_AMBIGUOUS_COLUMN_IN_RESULT";
    public static final java.lang.String CANNOT_CREATE_VERIFICATION_DATABASE = "ROOM_CANNOT_CREATE_VERIFICATION_DATABASE";
    public static final java.lang.String CURSOR_MISMATCH = "ROOM_CURSOR_MISMATCH";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.RoomWarnings.Companion INSTANCE = new androidx.room.RoomWarnings.Companion(null);
    public static final java.lang.String DEFAULT_CONSTRUCTOR = "ROOM_DEFAULT_CONSTRUCTOR";
    public static final java.lang.String DOES_NOT_IMPLEMENT_EQUALS_HASHCODE = "ROOM_TYPE_DOES_NOT_IMPLEMENT_EQUALS_HASHCODE";
    public static final java.lang.String INDEX_FROM_EMBEDDED_ENTITY_IS_DROPPED = "ROOM_EMBEDDED_ENTITY_INDEX_IS_DROPPED";
    public static final java.lang.String INDEX_FROM_EMBEDDED_FIELD_IS_DROPPED = "ROOM_EMBEDDED_INDEX_IS_DROPPED";
    public static final java.lang.String INDEX_FROM_PARENT_FIELD_IS_DROPPED = "ROOM_PARENT_FIELD_INDEX_IS_DROPPED";
    public static final java.lang.String INDEX_FROM_PARENT_IS_DROPPED = "ROOM_PARENT_INDEX_IS_DROPPED";
    public static final java.lang.String MISMATCHED_GETTER = "ROOM_MISMATCHED_GETTER_TYPE";
    public static final java.lang.String MISMATCHED_SETTER = "ROOM_MISMATCHED_SETTER_TYPE";
    public static final java.lang.String MISSING_INDEX_ON_FOREIGN_KEY_CHILD = "ROOM_MISSING_FOREIGN_KEY_CHILD_INDEX";
    public static final java.lang.String MISSING_INDEX_ON_JUNCTION = "MISSING_INDEX_ON_JUNCTION";
    public static final java.lang.String MISSING_JAVA_TMP_DIR = "ROOM_MISSING_JAVA_TMP_DIR";
    public static final java.lang.String MISSING_SCHEMA_LOCATION = "ROOM_MISSING_SCHEMA_LOCATION";
    public static final java.lang.String PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED = "ROOM_EMBEDDED_PRIMARY_KEY_IS_DROPPED";
    public static final java.lang.String QUERY_MISMATCH = "ROOM_QUERY_MISMATCH";
    public static final java.lang.String RELATION_QUERY_WITHOUT_TRANSACTION = "ROOM_RELATION_QUERY_WITHOUT_TRANSACTION";
    public static final java.lang.String RELATION_TYPE_MISMATCH = "ROOM_RELATION_TYPE_MISMATCH";
    public static final java.lang.String UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE = "ROOM_UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE";

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\b\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006"}, d2 = {"Landroidx/room/RoomWarnings$Companion;", "", "<init>", "()V", "", "QUERY_MISMATCH", "Ljava/lang/String;", "CURSOR_MISMATCH", "getCURSOR_MISMATCH$annotations", "DOES_NOT_IMPLEMENT_EQUALS_HASHCODE", "MISSING_JAVA_TMP_DIR", "CANNOT_CREATE_VERIFICATION_DATABASE", "PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED", "INDEX_FROM_EMBEDDED_FIELD_IS_DROPPED", "INDEX_FROM_EMBEDDED_ENTITY_IS_DROPPED", "INDEX_FROM_PARENT_IS_DROPPED", "INDEX_FROM_PARENT_FIELD_IS_DROPPED", "RELATION_TYPE_MISMATCH", "MISSING_SCHEMA_LOCATION", "MISSING_INDEX_ON_FOREIGN_KEY_CHILD", androidx.room.RoomWarnings.MISSING_INDEX_ON_JUNCTION, "DEFAULT_CONSTRUCTOR", "RELATION_QUERY_WITHOUT_TRANSACTION", "MISMATCHED_GETTER", "MISMATCHED_SETTER", "AMBIGUOUS_COLUMN_IN_RESULT", "UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @kotlin.Deprecated(message = "Replaced by QUERY_MISMATCH.", replaceWith = @kotlin.ReplaceWith(expression = "QUERY_MISMATCH", imports = {}))
        public static /* synthetic */ void getCURSOR_MISMATCH$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(message = "This type should not be instantiated as it contains only static methods. ")
    public RoomWarnings() {
    }
}

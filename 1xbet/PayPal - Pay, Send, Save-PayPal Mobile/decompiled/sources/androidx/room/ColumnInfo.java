package androidx.room;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\u0002\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\rB2\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0006\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\t\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/room/ColumnInfo;", "", "", "name", "", "typeAffinity", "", "index", "collate", "defaultValue", "()Ljava/lang/String;", "()I", "()Z", "Companion", "SQLiteTypeAffinity", "Collate"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface ColumnInfo {
    public static final int BINARY = 2;
    public static final int BLOB = 5;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.ColumnInfo.Companion INSTANCE = androidx.room.ColumnInfo.Companion.Camera2StreamConfigurationMap;
    public static final java.lang.String INHERIT_FIELD_NAME = "[field-name]";
    public static final int INTEGER = 3;
    public static final int LOCALIZED = 5;
    public static final int NOCASE = 3;
    public static final int REAL = 4;
    public static final int RTRIM = 4;
    public static final int TEXT = 2;
    public static final int UNDEFINED = 1;
    public static final int UNICODE = 6;
    public static final int UNSPECIFIED = 1;
    public static final java.lang.String VALUE_UNSPECIFIED = "[value-unspecified]";

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/room/ColumnInfo$Collate;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface Collate {
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/room/ColumnInfo$SQLiteTypeAffinity;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface SQLiteTypeAffinity {
    }

    int collate() default 1;

    java.lang.String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    java.lang.String name() default "[field-name]";

    int typeAffinity() default 1;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006"}, d2 = {"Landroidx/room/ColumnInfo$Companion;", "", "<init>", "()V", "", "INHERIT_FIELD_NAME", "Ljava/lang/String;", "", "UNDEFINED", com.visa.cbp.getEncExpo.warmup, "TEXT", "INTEGER", "REAL", "BLOB", "UNSPECIFIED", "BINARY", "NOCASE", "RTRIM", "LOCALIZED", "UNICODE", "VALUE_UNSPECIFIED"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static final int BINARY = 2;
        public static final int BLOB = 5;
        static final /* synthetic */ androidx.room.ColumnInfo.Companion Camera2StreamConfigurationMap = new androidx.room.ColumnInfo.Companion();
        public static final java.lang.String INHERIT_FIELD_NAME = "[field-name]";
        public static final int INTEGER = 3;
        public static final int LOCALIZED = 5;
        public static final int NOCASE = 3;
        public static final int REAL = 4;
        public static final int RTRIM = 4;
        public static final int TEXT = 2;
        public static final int UNDEFINED = 1;
        public static final int UNICODE = 6;
        public static final int UNSPECIFIED = 1;
        public static final java.lang.String VALUE_UNSPECIFIED = "[value-unspecified]";

        private Companion() {
        }
    }
}

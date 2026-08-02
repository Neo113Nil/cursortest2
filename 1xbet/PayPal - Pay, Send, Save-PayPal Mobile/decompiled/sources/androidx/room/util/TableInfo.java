package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001b2\u00020\u0001:\u0005\u001c\u001b\u001d\u001e\u001fBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rB3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a"}, d2 = {"Landroidx/room/util/TableInfo;", "", "", "name", "", "Landroidx/room/util/TableInfo$Column;", "columns", "", "Landroidx/room/util/TableInfo$ForeignKey;", "foreignKeys", "Landroidx/room/util/TableInfo$Index;", "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Ljava/util/Map;", "Ljava/util/Set;", "Companion", "CreatedFrom", "Column", "ForeignKey", "Index"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.util.TableInfo.Companion INSTANCE = new androidx.room.util.TableInfo.Companion(null);
    public final java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> columns;
    public final java.util.Set<androidx.room.util.TableInfo.ForeignKey> foreignKeys;
    public final java.util.Set<androidx.room.util.TableInfo.Index> indices;
    public final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/room/util/TableInfo$CreatedFrom;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface CreatedFrom {
    }

    public TableInfo(java.lang.String str, java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> map, java.util.Set<androidx.room.util.TableInfo.ForeignKey> set, java.util.Set<androidx.room.util.TableInfo.Index> set2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.name = str;
        this.columns = map;
        this.foreignKeys = set;
        this.indices = set2;
    }

    public /* synthetic */ TableInfo(java.lang.String str, java.util.Map map, java.util.Set set, java.util.Set set2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, set, (i & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "No longer used by generated code.")
    public TableInfo(java.lang.String str, java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> map, java.util.Set<androidx.room.util.TableInfo.ForeignKey> set) {
        this(str, map, set, kotlin.collections.SetsKt.emptySet());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
    }

    public final boolean equals(java.lang.Object other) {
        return androidx.room.util.TableInfoKt.equalsCommon(this, other);
    }

    public final int hashCode() {
        return androidx.room.util.TableInfoKt.hashCodeCommon(this);
    }

    public final java.lang.String toString() {
        return androidx.room.util.TableInfoKt.toStringCommon(this);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010"}, d2 = {"Landroidx/room/util/TableInfo$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "tableName", "Landroidx/room/util/TableInfo;", "read", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/TableInfo;", "Landroidx/sqlite/SQLiteConnection;", "connection", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;", "", "CREATED_FROM_UNKNOWN", com.visa.cbp.getEncExpo.warmup, "CREATED_FROM_ENTITY", "CREATED_FROM_DATABASE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.Deprecated(message = "No longer used by generated code.")
        @kotlin.jvm.JvmStatic
        public final androidx.room.util.TableInfo read(androidx.database.db.SupportSQLiteDatabase database, java.lang.String tableName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "");
            return read(new androidx.database.driver.SupportSQLiteConnection(database), tableName);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.room.util.TableInfo read(androidx.database.SQLiteConnection connection, java.lang.String tableName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "");
            return androidx.room.util.SchemaInfoUtilKt.readTableInfo(connection, tableName);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0011\u0010\n\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u0012\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/room/util/TableInfo$Column;", "", "", "name", "type", "", "notNull", "", "primaryKeyPosition", "defaultValue", "createdFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Z", com.visa.cbp.getEncExpo.warmup, "affinity", "getAffinity$annotations", "()V", "isPrimaryKey", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Column {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.room.util.TableInfo.Column.Companion INSTANCE = new androidx.room.util.TableInfo.Column.Companion(null);
        public final int affinity;
        public final int createdFrom;
        public final java.lang.String defaultValue;
        public final java.lang.String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final java.lang.String type;

        public static /* synthetic */ void getAffinity$annotations() {
        }

        public Column(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.name = str;
            this.type = str2;
            this.notNull = z;
            this.primaryKeyPosition = i;
            this.defaultValue = str3;
            this.createdFrom = i2;
            this.affinity = androidx.room.util.SchemaInfoUtilKt.findAffinity(str2);
        }

        public final boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(message = "No longer used by generated code.")
        public Column(java.lang.String str, java.lang.String str2, boolean z, int i) {
            this(str, str2, z, i, null, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/room/util/TableInfo$Column$Companion;", "", "<init>", "()V", "", "current", "other", "", "defaultValueEquals", "(Ljava/lang/String;Ljava/lang/String;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final boolean defaultValueEquals(java.lang.String current, java.lang.String other) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "");
                return androidx.room.util.TableInfoKt.defaultValueEqualsCommon(current, other);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final boolean equals(java.lang.Object other) {
            return androidx.room.util.TableInfoKt.equalsCommon(this, other);
        }

        public final int hashCode() {
            return androidx.room.util.TableInfoKt.hashCodeCommon(this);
        }

        public final java.lang.String toString() {
            return androidx.room.util.TableInfoKt.toStringCommon(this);
        }

        @kotlin.jvm.JvmStatic
        public static final boolean defaultValueEquals(java.lang.String str, java.lang.String str2) {
            return INSTANCE.defaultValueEquals(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKey;", "", "", "referenceTable", "onDelete", "onUpdate", "", "columnNames", "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ForeignKey {
        public final java.util.List<java.lang.String> columnNames;
        public final java.lang.String onDelete;
        public final java.lang.String onUpdate;
        public final java.util.List<java.lang.String> referenceColumnNames;
        public final java.lang.String referenceTable;

        public ForeignKey(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = list;
            this.referenceColumnNames = list2;
        }

        public final boolean equals(java.lang.Object other) {
            return androidx.room.util.TableInfoKt.equalsCommon(this, other);
        }

        public final int hashCode() {
            return androidx.room.util.TableInfoKt.hashCodeCommon(this);
        }

        public final java.lang.String toString() {
            return androidx.room.util.TableInfoKt.toStringCommon(this);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016"}, d2 = {"Landroidx/room/util/TableInfo$Index;", "", "", "name", "", "unique", "", "columns", "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;ZLjava/util/List;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Z", "Ljava/util/List;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Index {
        public static final java.lang.String DEFAULT_PREFIX = "index_";
        public final java.util.List<java.lang.String> columns;
        public final java.lang.String name;
        public java.util.List<java.lang.String> orders;
        public final boolean unique;

        public Index(java.lang.String str, boolean z, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.name = str;
            this.unique = z;
            this.columns = list;
            this.orders = list2;
            java.util.ArrayList arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add("ASC");
                }
                arrayList = arrayList2;
            }
            this.orders = arrayList;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        @kotlin.Deprecated(message = "No longer used by generated code.")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Index(java.lang.String str, boolean z, java.util.List<java.lang.String> list) {
            this(str, z, list, r1);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
        }

        public final boolean equals(java.lang.Object other) {
            return androidx.room.util.TableInfoKt.equalsCommon(this, other);
        }

        public final int hashCode() {
            return androidx.room.util.TableInfoKt.hashCodeCommon(this);
        }

        public final java.lang.String toString() {
            return androidx.room.util.TableInfoKt.toStringCommon(this);
        }
    }

    @kotlin.Deprecated(message = "No longer used by generated code.")
    @kotlin.jvm.JvmStatic
    public static final androidx.room.util.TableInfo read(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        return INSTANCE.read(supportSQLiteDatabase, str);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.room.util.TableInfo read(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        return INSTANCE.read(sQLiteConnection, str);
    }
}

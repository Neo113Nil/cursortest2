package androidx.room;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\n\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000fJ?\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\n\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00108\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00108\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/room/Room;", "", "<init>", "()V", "Landroidx/room/RoomDatabase;", "T", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "Landroidx/room/RoomDatabase$Builder;", "inMemoryDatabaseBuilder", "(Landroid/content/Context;Ljava/lang/Class;)Landroidx/room/RoomDatabase$Builder;", "Lkotlin/Function0;", "factory", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)Landroidx/room/RoomDatabase$Builder;", "", "name", "databaseBuilder", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/room/RoomDatabase$Builder;", "LOG_TAG", "Ljava/lang/String;", "MASTER_TABLE_NAME"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Room {
    public static final androidx.room.Room INSTANCE = new androidx.room.Room();
    public static final java.lang.String LOG_TAG = "ROOM";
    public static final java.lang.String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    @kotlin.jvm.JvmStatic
    public static final <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> inMemoryDatabaseBuilder(android.content.Context context, java.lang.Class<T> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "");
        return new androidx.room.RoomDatabase.Builder<>(context, klass, null);
    }

    public static /* synthetic */ androidx.room.RoomDatabase.Builder inMemoryDatabaseBuilder$default(androidx.room.Room room, android.content.Context context, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            kotlin.jvm.internal.Intrinsics.needClassReification();
            function0 = androidx.room.Room$inMemoryDatabaseBuilder$1.INSTANCE;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return new androidx.room.RoomDatabase.Builder(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.room.RoomDatabase.class), null, function0, context);
    }

    public final /* synthetic */ <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> inMemoryDatabaseBuilder(android.content.Context context, kotlin.jvm.functions.Function0<? extends T> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return new androidx.room.RoomDatabase.Builder<>(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.room.RoomDatabase.class), null, factory, context);
    }

    @kotlin.jvm.JvmStatic
    public static final <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(android.content.Context context, java.lang.Class<T> klass, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "");
        java.lang.String str = name2;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(name2, net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
        }
        return new androidx.room.RoomDatabase.Builder<>(context, klass, name2);
    }

    public static /* synthetic */ androidx.room.RoomDatabase.Builder databaseBuilder$default(androidx.room.Room room, android.content.Context context, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            kotlin.jvm.internal.Intrinsics.needClassReification();
            function0 = androidx.room.Room$databaseBuilder$3.INSTANCE;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().".toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().".toString());
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return new androidx.room.RoomDatabase.Builder(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.room.RoomDatabase.class), str, function0, context);
    }

    public final /* synthetic */ <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(android.content.Context context, java.lang.String name2, kotlin.jvm.functions.Function0<? extends T> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        if (kotlin.text.StringsKt.isBlank(name2)) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().".toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(name2, net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().".toString());
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return new androidx.room.RoomDatabase.Builder<>(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.room.RoomDatabase.class), name2, factory, context);
    }
}

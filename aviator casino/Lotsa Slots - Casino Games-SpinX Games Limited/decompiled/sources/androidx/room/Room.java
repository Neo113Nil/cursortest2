package androidx.room;

/* compiled from: Room.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J/\u0010\u0010\u001a\u0002H\t\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0013J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/room/Room;", "", "()V", "CURSOR_CONV_SUFFIX", "", "LOG_TAG", "MASTER_TABLE_NAME", "databaseBuilder", "Landroidx/room/RoomDatabase$Builder;", "T", "Landroidx/room/RoomDatabase;", "context", "Landroid/content/Context;", "klass", "Ljava/lang/Class;", "name", "getGeneratedImplementation", "C", "suffix", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "inMemoryDatabaseBuilder", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Room {
    private static final java.lang.String CURSOR_CONV_SUFFIX = "_CursorConverter";
    public static final androidx.room.Room INSTANCE = new androidx.room.Room();
    public static final java.lang.String LOG_TAG = "ROOM";
    public static final java.lang.String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    @kotlin.jvm.JvmStatic
    public static final <T, C> T getGeneratedImplementation(java.lang.Class<C> klass, java.lang.String suffix) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        java.lang.Package r1 = klass.getPackage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        java.lang.String fullPackage = r1.getName();
        java.lang.String canonicalName = klass.getCanonicalName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(canonicalName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        java.lang.String str2 = kotlin.text.StringsKt.replace$default(canonicalName, '.', '_', false, 4, (java.lang.Object) null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + '.' + str2;
            }
            java.lang.Class<?> cls = java.lang.Class.forName(str, true, klass.getClassLoader());
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.newInstance();
        } catch (java.lang.ClassNotFoundException unused) {
            throw new java.lang.RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (java.lang.IllegalAccessException unused2) {
            throw new java.lang.RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
        } catch (java.lang.InstantiationException unused3) {
            throw new java.lang.RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
        }
    }

    @kotlin.jvm.JvmStatic
    public static final <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> inMemoryDatabaseBuilder(android.content.Context context, java.lang.Class<T> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        return new androidx.room.RoomDatabase.Builder<>(context, klass, null);
    }

    @kotlin.jvm.JvmStatic
    public static final <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(android.content.Context context, java.lang.Class<T> klass, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        java.lang.String str = name;
        if (!(!(str == null || kotlin.text.StringsKt.isBlank(str)))) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
        }
        return new androidx.room.RoomDatabase.Builder<>(context, klass, name);
    }
}

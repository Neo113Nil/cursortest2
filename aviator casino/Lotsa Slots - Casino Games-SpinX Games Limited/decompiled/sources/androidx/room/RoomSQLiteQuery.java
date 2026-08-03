package androidx.room;

/* compiled from: RoomSQLiteQuery.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u000256B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0010H\u0016J\u0018\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004H\u0016J\u0018\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001bH\u0016J\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020#H\u0016J\b\u0010/\u001a\u00020#H\u0016J\u000e\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u0000J\u0016\u00102\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u0004J\u0006\u00104\u001a\u00020#R\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR \u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u0012\u0004\b\u0011\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\rR\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\rR\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u0012\u0004\b \u0010\r¨\u00067"}, d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "capacity", "", "(I)V", "<set-?>", "argCount", "getArgCount", "()I", "bindingTypes", "", "getBindingTypes$annotations", "()V", "blobBindings", "", "", "getBlobBindings$annotations", "[[B", "getCapacity", "doubleBindings", "", "getDoubleBindings$annotations", "longBindings", "", "getLongBindings$annotations", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "", "sql", "getSql", "()Ljava/lang/String;", "stringBindings", "getStringBindings$annotations", "[Ljava/lang/String;", "bindBlob", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "value", "bindDouble", "", "bindLong", "", "bindNull", "bindString", "bindTo", "statement", "clearBindings", "close", "copyArgumentsFrom", "other", com.ironsource.X3.a.f, "initArgCount", "release", "Binding", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RoomSQLiteQuery implements androidx.sqlite.db.SupportSQLiteQuery, androidx.sqlite.db.SupportSQLiteProgram {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;
    private final int[] bindingTypes;
    public final byte[][] blobBindings;
    private final int capacity;
    public final double[] doubleBindings;
    public final long[] longBindings;
    private volatile java.lang.String query;
    public final java.lang.String[] stringBindings;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.RoomSQLiteQuery.Companion INSTANCE = new androidx.room.RoomSQLiteQuery.Companion(null);
    public static final java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> queryPool = new java.util.TreeMap<>();

    /* compiled from: RoomSQLiteQuery.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface Binding {
    }

    public /* synthetic */ RoomSQLiteQuery(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.room.RoomSQLiteQuery acquire(java.lang.String str, int i) {
        return INSTANCE.acquire(str, i);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.room.RoomSQLiteQuery copyFrom(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery) {
        return INSTANCE.copyFrom(supportSQLiteQuery);
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    public static /* synthetic */ void getLongBindings$annotations() {
    }

    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    private RoomSQLiteQuery(int i) {
        this.capacity = i;
        int i2 = i + 1;
        this.bindingTypes = new int[i2];
        this.longBindings = new long[i2];
        this.doubleBindings = new double[i2];
        this.stringBindings = new java.lang.String[i2];
        this.blobBindings = new byte[i2][];
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final void init(java.lang.String query, int initArgCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
        this.argCount = initArgCount;
    }

    public final void release() {
        java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(java.lang.Integer.valueOf(this.capacity), this);
            INSTANCE.prunePoolLocked$room_runtime_release();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* renamed from: getSql */
    public java.lang.String getQuery() {
        java.lang.String str = this.query;
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(androidx.sqlite.db.SupportSQLiteProgram statement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.bindingTypes[i];
            if (i2 == 1) {
                statement.bindNull(i);
            } else if (i2 == 2) {
                statement.bindLong(i, this.longBindings[i]);
            } else if (i2 == 3) {
                statement.bindDouble(i, this.doubleBindings[i]);
            } else if (i2 == 4) {
                java.lang.String str = this.stringBindings[i];
                if (str == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                statement.bindString(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.blobBindings[i];
                if (bArr == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                statement.bindBlob(i, bArr);
            }
            if (i == argCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int index) {
        this.bindingTypes[index] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        this.bindingTypes[index] = 2;
        this.longBindings[index] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        this.bindingTypes[index] = 3;
        this.doubleBindings[index] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int index, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[index] = 4;
        this.stringBindings[index] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int index, byte[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[index] = 5;
        this.blobBindings[index] = value;
    }

    public final void copyArgumentsFrom(androidx.room.RoomSQLiteQuery other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int argCount = other.getArgCount() + 1;
        java.lang.System.arraycopy(other.bindingTypes, 0, this.bindingTypes, 0, argCount);
        java.lang.System.arraycopy(other.longBindings, 0, this.longBindings, 0, argCount);
        java.lang.System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, argCount);
        java.lang.System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, argCount);
        java.lang.System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        java.util.Arrays.fill(this.bindingTypes, 1);
        java.util.Arrays.fill(this.stringBindings, (java.lang.Object) null);
        java.util.Arrays.fill(this.blobBindings, (java.lang.Object) null);
        this.query = null;
    }

    /* compiled from: RoomSQLiteQuery.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\r\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002¨\u0006\u001b"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "()V", "BLOB", "", "DESIRED_POOL_SIZE", "getDESIRED_POOL_SIZE$annotations", "DOUBLE", "LONG", "NULL", "POOL_LIMIT", "getPOOL_LIMIT$annotations", "STRING", "queryPool", "Ljava/util/TreeMap;", "Landroidx/room/RoomSQLiteQuery;", "getQueryPool$annotations", "acquire", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "", "argumentCount", "copyFrom", "supportSQLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "prunePoolLocked", "", "prunePoolLocked$room_runtime_release", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        public static /* synthetic */ void getQueryPool$annotations() {
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.room.RoomSQLiteQuery copyFrom(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
            final androidx.room.RoomSQLiteQuery acquire = acquire(supportSQLiteQuery.getQuery(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new androidx.sqlite.db.SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindBlob(int index, byte[] value) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                    androidx.room.RoomSQLiteQuery.this.bindBlob(index, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindDouble(int index, double value) {
                    androidx.room.RoomSQLiteQuery.this.bindDouble(index, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindLong(int index, long value) {
                    androidx.room.RoomSQLiteQuery.this.bindLong(index, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindNull(int index) {
                    androidx.room.RoomSQLiteQuery.this.bindNull(index);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindString(int index, java.lang.String value) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                    androidx.room.RoomSQLiteQuery.this.bindString(index, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void clearBindings() {
                    androidx.room.RoomSQLiteQuery.this.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    androidx.room.RoomSQLiteQuery.this.close();
                }
            });
            return acquire;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.room.RoomSQLiteQuery acquire(java.lang.String query, int argumentCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
            synchronized (androidx.room.RoomSQLiteQuery.queryPool) {
                java.util.Map.Entry<java.lang.Integer, androidx.room.RoomSQLiteQuery> ceilingEntry = androidx.room.RoomSQLiteQuery.queryPool.ceilingEntry(java.lang.Integer.valueOf(argumentCount));
                if (ceilingEntry != null) {
                    androidx.room.RoomSQLiteQuery.queryPool.remove(ceilingEntry.getKey());
                    androidx.room.RoomSQLiteQuery sqliteQuery = ceilingEntry.getValue();
                    sqliteQuery.init(query, argumentCount);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                    return sqliteQuery;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                androidx.room.RoomSQLiteQuery roomSQLiteQuery = new androidx.room.RoomSQLiteQuery(argumentCount, null);
                roomSQLiteQuery.init(query, argumentCount);
                return roomSQLiteQuery;
            }
        }

        public final void prunePoolLocked$room_runtime_release() {
            if (androidx.room.RoomSQLiteQuery.queryPool.size() <= 15) {
                return;
            }
            int size = androidx.room.RoomSQLiteQuery.queryPool.size() - 10;
            java.util.Iterator<java.lang.Integer> it = androidx.room.RoomSQLiteQuery.queryPool.descendingKeySet().iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i;
            }
        }
    }
}

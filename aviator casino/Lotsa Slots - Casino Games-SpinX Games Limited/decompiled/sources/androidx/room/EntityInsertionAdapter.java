package androidx.room;

/* compiled from: EntityInsertionAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u001b\u0010\f\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0010J\u0014\u0010\f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J#\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u001aJ!\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¨\u0006\u001f"}, d2 = {"Landroidx/room/EntityInsertionAdapter;", "T", "Landroidx/room/SharedSQLiteStatement;", "database", "Landroidx/room/RoomDatabase;", "(Landroidx/room/RoomDatabase;)V", "bind", "", "statement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "entity", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V", "insert", "(Ljava/lang/Object;)V", "entities", "", "([Ljava/lang/Object;)V", "", "insertAndReturnId", "", "(Ljava/lang/Object;)J", "insertAndReturnIdsArray", "", "([Ljava/lang/Object;)[J", "", "insertAndReturnIdsArrayBox", "([Ljava/lang/Object;)[Ljava/lang/Long;", "(Ljava/util/Collection;)[Ljava/lang/Long;", "insertAndReturnIdsList", "", "([Ljava/lang/Object;)Ljava/util/List;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class EntityInsertionAdapter<T> extends androidx.room.SharedSQLiteStatement {
    protected abstract void bind(androidx.sqlite.db.SupportSQLiteStatement statement, T entity);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(androidx.room.RoomDatabase database) {
        super(database);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
    }

    public final void insert(T entity) {
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, entity);
            acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final void insert(T[] entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            for (T t : entities) {
                bind(acquire, t);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }

    public final void insert(java.lang.Iterable<? extends T> entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            java.util.Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T entity) {
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, entity);
            return acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(java.util.Collection<? extends T> entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i = 0;
            for (T t : entities) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                bind(acquire, t);
                jArr[i] = acquire.executeInsert();
                i = i2;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                bind(acquire, entities[i]);
                jArr[i2] = acquire.executeInsert();
                i++;
                i2 = i3;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final java.lang.Long[] insertAndReturnIdsArrayBox(java.util.Collection<? extends T> entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        java.util.Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            java.lang.Long[] lArr = new java.lang.Long[size];
            for (int i = 0; i < size; i++) {
                bind(acquire, it.next());
                lArr[i] = java.lang.Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Long[] insertAndReturnIdsArrayBox(T[] entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        java.util.Iterator it = kotlin.jvm.internal.ArrayIteratorKt.iterator(entities);
        try {
            int length = entities.length;
            java.lang.Long[] lArr = new java.lang.Long[length];
            for (int i = 0; i < length; i++) {
                bind(acquire, it.next());
                lArr[i] = java.lang.Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final java.util.List<java.lang.Long> insertAndReturnIdsList(T[] entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            for (T t : entities) {
                bind(acquire, t);
                createListBuilder.add(java.lang.Long.valueOf(acquire.executeInsert()));
            }
            return kotlin.collections.CollectionsKt.build(createListBuilder);
        } finally {
            release(acquire);
        }
    }

    public final java.util.List<java.lang.Long> insertAndReturnIdsList(java.util.Collection<? extends T> entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        androidx.sqlite.db.SupportSQLiteStatement acquire = acquire();
        try {
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            java.util.Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                createListBuilder.add(java.lang.Long.valueOf(acquire.executeInsert()));
            }
            return kotlin.collections.CollectionsKt.build(createListBuilder);
        } finally {
            release(acquire);
        }
    }
}

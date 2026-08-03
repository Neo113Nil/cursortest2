package androidx.room;

/* compiled from: EntityUpsertionAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0013\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u001b\u0010\f\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0002\u0010\u0011J\u0014\u0010\f\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J#\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00102\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0002\u0010\u001bJ!\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0002\u0010\u001fJ\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/room/EntityUpsertionAdapter;", "T", "", "insertionAdapter", "Landroidx/room/EntityInsertionAdapter;", "updateAdapter", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "(Landroidx/room/EntityInsertionAdapter;Landroidx/room/EntityDeletionOrUpdateAdapter;)V", "checkUniquenessException", "", "ex", "Landroid/database/sqlite/SQLiteConstraintException;", "upsert", "entity", "(Ljava/lang/Object;)V", "entities", "", "([Ljava/lang/Object;)V", "", "upsertAndReturnId", "", "(Ljava/lang/Object;)J", "upsertAndReturnIdsArray", "", "([Ljava/lang/Object;)[J", "", "upsertAndReturnIdsArrayBox", "([Ljava/lang/Object;)[Ljava/lang/Long;", "(Ljava/util/Collection;)[Ljava/lang/Long;", "upsertAndReturnIdsList", "", "([Ljava/lang/Object;)Ljava/util/List;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class EntityUpsertionAdapter<T> {
    private final androidx.room.EntityInsertionAdapter<T> insertionAdapter;
    private final androidx.room.EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(androidx.room.EntityInsertionAdapter<T> insertionAdapter, androidx.room.EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insertionAdapter, "insertionAdapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    public final void upsert(T entity) {
        try {
            this.insertionAdapter.insert((androidx.room.EntityInsertionAdapter<T>) entity);
        } catch (android.database.sqlite.SQLiteConstraintException e) {
            checkUniquenessException(e);
            this.updateAdapter.handle(entity);
        }
    }

    public final long upsertAndReturnId(T entity) {
        try {
            return this.insertionAdapter.insertAndReturnId(entity);
        } catch (android.database.sqlite.SQLiteConstraintException e) {
            checkUniquenessException(e);
            this.updateAdapter.handle(entity);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(T[] entities) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                j = this.insertionAdapter.insertAndReturnId(entities[i]);
            } catch (android.database.sqlite.SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(entities[i]);
                j = -1;
            }
            jArr[i] = j;
        }
        return jArr;
    }

    public final long[] upsertAndReturnIdsArray(java.util.Collection<? extends T> entities) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        java.util.Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                j = this.insertionAdapter.insertAndReturnId(next);
            } catch (android.database.sqlite.SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(next);
                j = -1;
            }
            jArr[i] = j;
        }
        return jArr;
    }

    public final java.util.List<java.lang.Long> upsertAndReturnIdsList(T[] entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        for (T t : entities) {
            try {
                createListBuilder.add(java.lang.Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (android.database.sqlite.SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
                createListBuilder.add(-1L);
            }
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public final java.util.List<java.lang.Long> upsertAndReturnIdsList(java.util.Collection<? extends T> entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        for (T t : entities) {
            try {
                createListBuilder.add(java.lang.Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (android.database.sqlite.SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
                createListBuilder.add(-1L);
            }
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public final java.lang.Long[] upsertAndReturnIdsArrayBox(T[] entities) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        java.lang.Long[] lArr = new java.lang.Long[length];
        for (int i = 0; i < length; i++) {
            try {
                j = this.insertionAdapter.insertAndReturnId(entities[i]);
            } catch (android.database.sqlite.SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(entities[i]);
                j = -1;
            }
            lArr[i] = java.lang.Long.valueOf(j);
        }
        return lArr;
    }

    public final java.lang.Long[] upsertAndReturnIdsArrayBox(java.util.Collection<? extends T> entities) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        java.util.Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        java.lang.Long[] lArr = new java.lang.Long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                j = this.insertionAdapter.insertAndReturnId(next);
            } catch (android.database.sqlite.SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(next);
                j = -1;
            }
            lArr[i] = java.lang.Long.valueOf(j);
        }
        return lArr;
    }

    private final void checkUniquenessException(android.database.sqlite.SQLiteConstraintException ex) {
        java.lang.String message = ex.getMessage();
        if (message == null) {
            throw ex;
        }
        if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) "1555", true)) {
            throw ex;
        }
    }

    public final void upsert(T[] entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t : entities) {
            try {
                this.insertionAdapter.insert((androidx.room.EntityInsertionAdapter<T>) t);
            } catch (android.database.sqlite.SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
            }
        }
    }

    public final void upsert(java.lang.Iterable<? extends T> entities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t : entities) {
            try {
                this.insertionAdapter.insert((androidx.room.EntityInsertionAdapter<T>) t);
            } catch (android.database.sqlite.SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
            }
        }
    }
}

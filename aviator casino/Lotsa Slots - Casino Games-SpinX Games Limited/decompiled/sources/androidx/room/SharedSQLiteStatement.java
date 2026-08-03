package androidx.room;

/* compiled from: SharedSQLiteStatement.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\u0012H$J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "database", "Landroidx/room/RoomDatabase;", "(Landroidx/room/RoomDatabase;)V", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stmt", "Landroidx/sqlite/db/SupportSQLiteStatement;", "getStmt", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "stmt$delegate", "Lkotlin/Lazy;", "acquire", "assertNotMainThread", "", "createNewStatement", "createQuery", "", "canUseCached", "", "release", "statement", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SharedSQLiteStatement {
    private final androidx.room.RoomDatabase database;
    private final java.util.concurrent.atomic.AtomicBoolean lock;

    /* renamed from: stmt$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy stmt;

    protected abstract java.lang.String createQuery();

    public SharedSQLiteStatement(androidx.room.RoomDatabase database) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
        this.lock = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.stmt = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.sqlite.db.SupportSQLiteStatement>() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.sqlite.db.SupportSQLiteStatement invoke() {
                androidx.sqlite.db.SupportSQLiteStatement createNewStatement;
                createNewStatement = androidx.room.SharedSQLiteStatement.this.createNewStatement();
                return createNewStatement;
            }
        });
    }

    private final androidx.sqlite.db.SupportSQLiteStatement getStmt() {
        return (androidx.sqlite.db.SupportSQLiteStatement) this.stmt.getValue();
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.sqlite.db.SupportSQLiteStatement createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final androidx.sqlite.db.SupportSQLiteStatement getStmt(boolean canUseCached) {
        if (canUseCached) {
            return getStmt();
        }
        return createNewStatement();
    }

    public androidx.sqlite.db.SupportSQLiteStatement acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    public void release(androidx.sqlite.db.SupportSQLiteStatement statement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }
}

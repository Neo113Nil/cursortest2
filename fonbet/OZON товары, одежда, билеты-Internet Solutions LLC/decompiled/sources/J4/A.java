package J4;

import Sc.InterfaceC4008j;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class A {

    @NotNull
    private final s database;

    @NotNull
    private final AtomicBoolean lock;

    @NotNull
    private final InterfaceC4008j stmt$delegate;

    static final class a extends AbstractC7737t implements Function0<O4.f> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final O4.f invoke() {
            return A.this.createNewStatement();
        }
    }

    public A(@NotNull s database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = Sc.k.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O4.f createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final O4.f getStmt() {
        return (O4.f) this.stmt$delegate.getValue();
    }

    @NotNull
    public O4.f acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    @NotNull
    protected abstract String createQuery();

    public void release(@NotNull O4.f statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    private final O4.f getStmt(boolean z11) {
        return z11 ? getStmt() : createNewStatement();
    }
}

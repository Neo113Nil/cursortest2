package R1;

import L4.n;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public volatile Y1.b f5151a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f5152b;

    /* renamed from: c, reason: collision with root package name */
    public X1.b f5153c;

    /* renamed from: d, reason: collision with root package name */
    public final d f5154d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5155e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f5156g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f5157h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public h() {
        new ConcurrentHashMap();
        this.f5154d = d();
    }

    public final void a() {
        if (!this.f5155e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.f5153c.z().f6123l).inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        Y1.b z3 = this.f5153c.z();
        this.f5154d.c(z3);
        z3.b();
    }

    public abstract d d();

    public abstract X1.b e(n nVar);

    public final void f() {
        this.f5153c.z().k();
        if (((SQLiteDatabase) this.f5153c.z().f6123l).inTransaction()) {
            return;
        }
        d dVar = this.f5154d;
        if (dVar.f5135d.compareAndSet(false, true)) {
            dVar.f5134c.f5152b.execute(dVar.i);
        }
    }

    public final Cursor g(X1.c cVar) {
        a();
        b();
        return this.f5153c.z().m(cVar);
    }

    public final void h() {
        this.f5153c.z().p();
    }
}

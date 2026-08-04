package D0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile K0.b f1653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f1654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public J0.c f1655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f1659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f1660h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f1661i = new ThreadLocal();

    public j() {
        new ConcurrentHashMap();
        this.f1656d = d();
    }

    public final void a() {
        if (!this.f1657e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.f1655c.l().f3868b).inTransaction() && this.f1661i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        K0.b bVarL = this.f1655c.l();
        this.f1656d.c(bVarL);
        bVarL.a();
    }

    public abstract e d();

    public abstract J0.c e(a aVar);

    public final void f() {
        this.f1655c.l().f();
        if (((SQLiteDatabase) this.f1655c.l().f3868b).inTransaction()) {
            return;
        }
        e eVar = this.f1656d;
        if (eVar.f1634d.compareAndSet(false, true)) {
            eVar.f1633c.f1654b.execute(eVar.f1639i);
        }
    }

    public final Cursor g(J0.d dVar) {
        a();
        b();
        return this.f1655c.l().h(dVar);
    }

    public final void h() {
        this.f1655c.l().j();
    }
}

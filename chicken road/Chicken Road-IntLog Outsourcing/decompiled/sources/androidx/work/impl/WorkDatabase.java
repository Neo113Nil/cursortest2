package androidx.work.impl;

import B0.e;
import B0.l;
import B0.n;
import B0.r;
import B0.t;
import X.b;
import X.c;
import X.f;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.Looper;
import b0.InterfaceC0261b;
import b0.InterfaceC0263d;
import c0.C0299a;
import c0.C0301c;
import g4.C0471p;
import g4.C0472q;
import g4.C0473r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class WorkDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0301c f4719a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f4720b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0261b f4721c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4723e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f4724f;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f4728j;

    /* renamed from: d, reason: collision with root package name */
    public final f f4722d = d();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f4725g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f4726h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f4727i = new ThreadLocal();

    public WorkDatabase() {
        i.d(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f4728j = new LinkedHashMap();
    }

    public static Object q(Class cls, InterfaceC0261b interfaceC0261b) {
        if (cls.isInstance(interfaceC0261b)) {
            return interfaceC0261b;
        }
        if (interfaceC0261b instanceof c) {
            return q(cls, ((c) interfaceC0261b).a());
        }
        return null;
    }

    public final void a() {
        if (!this.f4723e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!h().z().q() && this.f4727i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        C0301c z = h().z();
        this.f4722d.c(z);
        if (z.y()) {
            z.b();
        } else {
            z.a();
        }
    }

    public abstract f d();

    public abstract InterfaceC0261b e(b bVar);

    public abstract B0.c f();

    public List g(LinkedHashMap autoMigrationSpecs) {
        i.e(autoMigrationSpecs, "autoMigrationSpecs");
        return C0471p.f5750a;
    }

    public final InterfaceC0261b h() {
        InterfaceC0261b interfaceC0261b = this.f4721c;
        if (interfaceC0261b != null) {
            return interfaceC0261b;
        }
        i.l("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return C0473r.f5752a;
    }

    public Map j() {
        return C0472q.f5751a;
    }

    public final void k() {
        h().z().g();
        if (h().z().q()) {
            return;
        }
        f fVar = this.f4722d;
        if (fVar.f3464e.compareAndSet(false, true)) {
            Executor executor = fVar.f3460a.f4720b;
            if (executor != null) {
                executor.execute(fVar.f3471l);
            } else {
                i.l("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract e l();

    public final Cursor m(InterfaceC0263d interfaceC0263d, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null) {
            return h().z().A(interfaceC0263d);
        }
        C0301c z = h().z();
        z.getClass();
        String sql = interfaceC0263d.a();
        String[] strArr = C0301c.f4869d;
        i.b(cancellationSignal);
        C0299a c0299a = new C0299a(0, interfaceC0263d);
        SQLiteDatabase sQLiteDatabase = z.f4870a;
        i.e(sQLiteDatabase, "sQLiteDatabase");
        i.e(sql, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c0299a, sql, strArr, null, cancellationSignal);
        i.d(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public final Object n(Callable callable) {
        c();
        try {
            Object call = callable.call();
            o();
            return call;
        } finally {
            k();
        }
    }

    public final void o() {
        h().z().D();
    }

    public abstract B0.i p();

    public abstract l r();

    public abstract n s();

    public abstract r t();

    public abstract t u();
}

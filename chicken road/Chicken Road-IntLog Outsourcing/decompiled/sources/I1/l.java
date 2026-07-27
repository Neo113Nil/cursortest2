package I1;

import C0.p;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import o1.u;

/* loaded from: classes.dex */
public final class l implements m, e, d, b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1256a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1257b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f1258c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1259d;

    public l(p pVar, b bVar) {
        this.f1256a = 0;
        this.f1257b = new Object();
        this.f1258c = pVar;
        this.f1259d = bVar;
    }

    private final void d(Task task) {
        if (task.e() || ((o) task).f1266d) {
            return;
        }
        synchronized (this.f1257b) {
            try {
                if (((d) this.f1259d) == null) {
                    return;
                }
                ((p) this.f1258c).getClass();
                synchronized (this.f1257b) {
                    try {
                        d dVar = (d) this.f1259d;
                        if (dVar != null) {
                            Exception b6 = task.b();
                            u.g(b6);
                            dVar.c(b6);
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    @Override // I1.b
    public void a() {
        ((o) this.f1259d).l();
    }

    @Override // I1.m
    public final void b(Task task) {
        switch (this.f1256a) {
            case 0:
                if (((o) task).f1266d) {
                    synchronized (this.f1257b) {
                        try {
                            if (((b) this.f1259d) != null) {
                                ((p) this.f1258c).getClass();
                                synchronized (this.f1257b) {
                                    try {
                                        b bVar = (b) this.f1259d;
                                        if (bVar != null) {
                                            bVar.a();
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f1257b) {
                    try {
                        if (((c) this.f1259d) == null) {
                            return;
                        }
                        this.f1258c.execute(new A0.a(this, 20, task));
                        return;
                    } finally {
                    }
                }
            case 2:
                d(task);
                return;
            case 3:
                if (task.e()) {
                    synchronized (this.f1257b) {
                        try {
                            if (((e) this.f1259d) != null) {
                                this.f1258c.execute(new A0.a(this, 21, task));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f1258c.execute(new A0.a(this, 22, task));
                return;
        }
    }

    @Override // I1.d
    public void c(Exception exc) {
        ((o) this.f1259d).j(exc);
    }

    @Override // I1.e
    public void onSuccess(Object obj) {
        ((o) this.f1259d).k(obj);
    }

    public l(p pVar, d dVar) {
        this.f1256a = 2;
        this.f1257b = new Object();
        this.f1258c = pVar;
        this.f1259d = dVar;
    }

    public l(Executor executor, c cVar) {
        this.f1256a = 1;
        this.f1257b = new Object();
        this.f1258c = executor;
        this.f1259d = cVar;
    }

    public l(Executor executor, e eVar) {
        this.f1256a = 3;
        this.f1257b = new Object();
        this.f1258c = executor;
        this.f1259d = eVar;
    }

    public l(Executor executor, g gVar, o oVar) {
        this.f1256a = 4;
        this.f1258c = executor;
        this.f1257b = gVar;
        this.f1259d = oVar;
    }
}

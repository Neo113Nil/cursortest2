package g2;

import D3.n;
import S2.q;
import a3.AbstractC0467k;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import f2.C1944b;
import f2.C1949g;
import f2.C1951i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import n2.C2185a;
import p2.AbstractC2253k;
import p2.ExecutorC2251i;
import q2.C2307j;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1978b implements InterfaceC1977a {

    /* renamed from: v, reason: collision with root package name */
    public static final String f17094v = f2.m.f("Processor");

    /* renamed from: l, reason: collision with root package name */
    public final Context f17096l;

    /* renamed from: m, reason: collision with root package name */
    public final C1944b f17097m;

    /* renamed from: n, reason: collision with root package name */
    public final v3.e f17098n;

    /* renamed from: o, reason: collision with root package name */
    public final WorkDatabase f17099o;

    /* renamed from: r, reason: collision with root package name */
    public final List f17102r;

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f17101q = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f17100p = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f17103s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f17104t = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public PowerManager.WakeLock f17095k = null;

    /* renamed from: u, reason: collision with root package name */
    public final Object f17105u = new Object();

    public C1978b(Context context, C1944b c1944b, v3.e eVar, WorkDatabase workDatabase, List list) {
        this.f17096l = context;
        this.f17097m = c1944b;
        this.f17098n = eVar;
        this.f17099o = workDatabase;
        this.f17102r = list;
    }

    public static boolean c(String str, m mVar) {
        boolean z3;
        if (mVar == null) {
            f2.m.d().a(f17094v, L1.a.m("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        mVar.f17140C = true;
        mVar.h();
        E3.a aVar = mVar.f17139B;
        if (aVar != null) {
            z3 = aVar.isDone();
            mVar.f17139B.cancel(true);
        } else {
            z3 = false;
        }
        ListenableWorker listenableWorker = mVar.f17146p;
        if (listenableWorker == null || z3) {
            f2.m.d().a(m.f17137D, "WorkSpec " + mVar.f17145o + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        f2.m.d().a(f17094v, L1.a.m("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    @Override // g2.InterfaceC1977a
    public final void a(String str, boolean z3) {
        synchronized (this.f17105u) {
            try {
                this.f17101q.remove(str);
                int i = 0;
                f2.m.d().a(f17094v, C1978b.class.getSimpleName() + " " + str + " executed; reschedule = " + z3, new Throwable[0]);
                ArrayList arrayList = this.f17104t;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((InterfaceC1977a) obj).a(str, z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC1977a interfaceC1977a) {
        synchronized (this.f17105u) {
            this.f17104t.add(interfaceC1977a);
        }
    }

    public final boolean d(String str) {
        boolean contains;
        synchronized (this.f17105u) {
            contains = this.f17103s.contains(str);
        }
        return contains;
    }

    public final boolean e(String str) {
        boolean z3;
        synchronized (this.f17105u) {
            try {
                z3 = this.f17101q.containsKey(str) || this.f17100p.containsKey(str);
            } finally {
            }
        }
        return z3;
    }

    public final void f(InterfaceC1977a interfaceC1977a) {
        synchronized (this.f17105u) {
            this.f17104t.remove(interfaceC1977a);
        }
    }

    public final void g(String str, C1949g c1949g) {
        synchronized (this.f17105u) {
            try {
                f2.m.d().e(f17094v, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.f17101q.remove(str);
                if (mVar != null) {
                    if (this.f17095k == null) {
                        PowerManager.WakeLock a5 = AbstractC2253k.a(this.f17096l, "ProcessorForegroundLck");
                        this.f17095k = a5;
                        a5.acquire();
                    }
                    this.f17100p.put(str, mVar);
                    Intent d5 = C2185a.d(this.f17096l, str, c1949g);
                    Context context = this.f17096l;
                    if (Build.VERSION.SDK_INT >= 26) {
                        D0.c.q(context, d5);
                    } else {
                        context.startService(d5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(String str, v3.e eVar) {
        synchronized (this.f17105u) {
            try {
                if (e(str)) {
                    f2.m.d().a(f17094v, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f17096l;
                C1944b c1944b = this.f17097m;
                v3.e eVar2 = this.f17098n;
                WorkDatabase workDatabase = this.f17099o;
                v3.e eVar3 = new v3.e(17);
                Context applicationContext = context.getApplicationContext();
                List list = this.f17102r;
                if (eVar == null) {
                    eVar = eVar3;
                }
                m mVar = new m();
                mVar.f17148r = new C1951i();
                mVar.f17138A = new C2307j();
                mVar.f17139B = null;
                mVar.f17141k = applicationContext;
                mVar.f17147q = eVar2;
                mVar.f17150t = this;
                mVar.f17142l = str;
                mVar.f17143m = list;
                mVar.f17144n = eVar;
                mVar.f17146p = null;
                mVar.f17149s = c1944b;
                mVar.f17151u = workDatabase;
                mVar.f17152v = workDatabase.n();
                mVar.f17153w = workDatabase.i();
                mVar.f17154x = workDatabase.o();
                C2307j c2307j = mVar.f17138A;
                q qVar = new q(5);
                qVar.f5347l = this;
                qVar.f5348m = str;
                qVar.f5349n = c2307j;
                c2307j.a(qVar, (n) this.f17098n.f20434n);
                this.f17101q.put(str, mVar);
                ((ExecutorC2251i) this.f17098n.f20432l).execute(mVar);
                f2.m.d().a(f17094v, AbstractC0467k.v(C1978b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f17105u) {
            try {
                if (this.f17100p.isEmpty()) {
                    Context context = this.f17096l;
                    String str = C2185a.f18458t;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f17096l.startService(intent);
                    } catch (Throwable th) {
                        f2.m.d().b(f17094v, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f17095k;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f17095k = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean c5;
        synchronized (this.f17105u) {
            f2.m.d().a(f17094v, "Processor stopping foreground work " + str, new Throwable[0]);
            c5 = c(str, (m) this.f17100p.remove(str));
        }
        return c5;
    }

    public final boolean k(String str) {
        boolean c5;
        synchronized (this.f17105u) {
            f2.m.d().a(f17094v, "Processor stopping background work " + str, new Throwable[0]);
            c5 = c(str, (m) this.f17101q.remove(str));
        }
        return c5;
    }
}

package p031e1;

import H2.q;
import L.f;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v4.media.session.t;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p023d1.h;
import p023d1.n;
import p080l1.a;
import p096n1.j;
import p103o1.k;
import p155w1.C1050x1;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f12514C = n.g("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p023d1.b f12519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1050x1 f12520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f12521e;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f12524y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f12523x = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f12522f = new HashMap();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f12525z = new HashSet();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f12515A = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f12517a = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f12516B = new Object();

    public b(Context context, p023d1.b bVar, C1050x1 c1050x1, WorkDatabase workDatabase, List list) {
        this.f12518b = context;
        this.f12519c = bVar;
        this.f12520d = c1050x1;
        this.f12521e = workDatabase;
        this.f12524y = list;
    }

    public static boolean c(String str, m mVar) {
        boolean zIsDone;
        if (mVar == null) {
            n.d().b(f12514C, L.i("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        mVar.f12566J = true;
        mVar.h();
        I3.b bVar = mVar.f12565I;
        if (bVar != null) {
            zIsDone = bVar.isDone();
            mVar.f12565I.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = mVar.f12572f;
        if (listenableWorker == null || zIsDone) {
            n.d().b(m.f12556K, "WorkSpec " + mVar.f12571e + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        n.d().b(f12514C, L.i("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(a aVar) {
        synchronized (this.f12516B) {
            this.f12515A.add(aVar);
        }
    }

    @Override // p031e1.a
    public final void b(String str, boolean z4) {
        synchronized (this.f12516B) {
            try {
                this.f12523x.remove(str);
                n.d().b(f12514C, b.class.getSimpleName() + " " + str + " executed; reschedule = " + z4, new Throwable[0]);
                Iterator it = this.f12515A.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(str, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z4;
        synchronized (this.f12516B) {
            try {
                z4 = this.f12523x.containsKey(str) || this.f12522f.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public final void e(a aVar) {
        synchronized (this.f12516B) {
            this.f12515A.remove(aVar);
        }
    }

    public final void f(String str, h hVar) {
        synchronized (this.f12516B) {
            try {
                n.d().e(f12514C, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.f12523x.remove(str);
                if (mVar != null) {
                    if (this.f12517a == null) {
                        PowerManager.WakeLock wakeLockA = j.a(this.f12518b, "ProcessorForegroundLck");
                        this.f12517a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f12522f.put(str, mVar);
                    G.h.startForegroundService(this.f12518b, a.c(this.f12518b, str, hVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, t tVar) {
        synchronized (this.f12516B) {
            try {
                if (d(str)) {
                    n.d().b(f12514C, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f12518b;
                p023d1.b bVar = this.f12519c;
                C1050x1 c1050x1 = this.f12520d;
                WorkDatabase workDatabase = this.f12521e;
                t tVar2 = new t(18);
                Context applicationContext = context.getApplicationContext();
                List list = this.f12524y;
                if (tVar == null) {
                    tVar = tVar2;
                }
                m mVar = new m();
                mVar.f12574y = new p023d1.j();
                mVar.f12564H = new k();
                mVar.f12565I = null;
                mVar.f12567a = applicationContext;
                mVar.f12573x = c1050x1;
                mVar.f12557A = this;
                mVar.f12568b = str;
                mVar.f12569c = list;
                mVar.f12570d = tVar;
                mVar.f12572f = null;
                mVar.f12575z = bVar;
                mVar.f12558B = workDatabase;
                mVar.f12559C = workDatabase.n();
                mVar.f12560D = workDatabase.i();
                mVar.f12561E = workDatabase.o();
                k kVar = mVar.f12564H;
                q qVar = new q(16);
                qVar.f3287b = this;
                qVar.f3288c = str;
                qVar.f3289d = kVar;
                kVar.addListener(qVar, (f) this.f12520d.f17933d);
                this.f12523x.put(str, mVar);
                ((p096n1.h) this.f12520d.f17931b).execute(mVar);
                n.d().b(f12514C, k.f(b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f12516B) {
            try {
                if (this.f12522f.isEmpty()) {
                    Context context = this.f12518b;
                    String str = a.f14866A;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f12518b.startService(intent);
                    } catch (Throwable th) {
                        n.d().c(f12514C, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f12517a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f12517a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean zC;
        synchronized (this.f12516B) {
            n.d().b(f12514C, "Processor stopping foreground work " + str, new Throwable[0]);
            zC = c(str, (m) this.f12522f.remove(str));
        }
        return zC;
    }

    public final boolean j(String str) {
        boolean zC;
        synchronized (this.f12516B) {
            n.d().b(f12514C, "Processor stopping background work " + str, new Throwable[0]);
            zC = c(str, (m) this.f12523x.remove(str));
        }
        return zC;
    }
}

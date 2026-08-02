package e1;

import H2.q;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v4.media.session.t;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import d1.C0949b;
import d1.C0955h;
import d1.C0957j;
import d1.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l1.C1377a;
import n1.AbstractC1455j;
import n1.ExecutorC1453h;
import o1.C1501k;
import w1.C1759x1;
import w1.L;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995b implements InterfaceC0994a {

    /* renamed from: C, reason: collision with root package name */
    public static final String f12508C = n.g("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f12512b;

    /* renamed from: c, reason: collision with root package name */
    public final C0949b f12513c;

    /* renamed from: d, reason: collision with root package name */
    public final C1759x1 f12514d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f12515e;

    /* renamed from: y, reason: collision with root package name */
    public final List f12518y;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f12517x = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f12516f = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f12519z = new HashSet();

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f12509A = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f12511a = null;

    /* renamed from: B, reason: collision with root package name */
    public final Object f12510B = new Object();

    public C0995b(Context context, C0949b c0949b, C1759x1 c1759x1, WorkDatabase workDatabase, List list) {
        this.f12512b = context;
        this.f12513c = c0949b;
        this.f12514d = c1759x1;
        this.f12515e = workDatabase;
        this.f12518y = list;
    }

    public static boolean c(String str, m mVar) {
        boolean z4;
        if (mVar == null) {
            n.d().b(f12508C, L.i("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        mVar.f12560J = true;
        mVar.h();
        I3.b bVar = mVar.f12559I;
        if (bVar != null) {
            z4 = bVar.isDone();
            mVar.f12559I.cancel(true);
        } else {
            z4 = false;
        }
        ListenableWorker listenableWorker = mVar.f12566f;
        if (listenableWorker == null || z4) {
            n.d().b(m.f12550K, "WorkSpec " + mVar.f12565e + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        n.d().b(f12508C, L.i("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(InterfaceC0994a interfaceC0994a) {
        synchronized (this.f12510B) {
            this.f12509A.add(interfaceC0994a);
        }
    }

    @Override // e1.InterfaceC0994a
    public final void b(String str, boolean z4) {
        synchronized (this.f12510B) {
            try {
                this.f12517x.remove(str);
                n.d().b(f12508C, C0995b.class.getSimpleName() + " " + str + " executed; reschedule = " + z4, new Throwable[0]);
                Iterator it = this.f12509A.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0994a) it.next()).b(str, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z4;
        synchronized (this.f12510B) {
            try {
                z4 = this.f12517x.containsKey(str) || this.f12516f.containsKey(str);
            } finally {
            }
        }
        return z4;
    }

    public final void e(InterfaceC0994a interfaceC0994a) {
        synchronized (this.f12510B) {
            this.f12509A.remove(interfaceC0994a);
        }
    }

    public final void f(String str, C0955h c0955h) {
        synchronized (this.f12510B) {
            try {
                n.d().e(f12508C, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.f12517x.remove(str);
                if (mVar != null) {
                    if (this.f12511a == null) {
                        PowerManager.WakeLock a2 = AbstractC1455j.a(this.f12512b, "ProcessorForegroundLck");
                        this.f12511a = a2;
                        a2.acquire();
                    }
                    this.f12516f.put(str, mVar);
                    G.h.startForegroundService(this.f12512b, C1377a.c(this.f12512b, str, c0955h));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, t tVar) {
        synchronized (this.f12510B) {
            try {
                if (d(str)) {
                    n.d().b(f12508C, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f12512b;
                C0949b c0949b = this.f12513c;
                C1759x1 c1759x1 = this.f12514d;
                WorkDatabase workDatabase = this.f12515e;
                t tVar2 = new t(18);
                Context applicationContext = context.getApplicationContext();
                List list = this.f12518y;
                if (tVar == null) {
                    tVar = tVar2;
                }
                m mVar = new m();
                mVar.f12568y = new C0957j();
                mVar.f12558H = new C1501k();
                mVar.f12559I = null;
                mVar.f12561a = applicationContext;
                mVar.f12567x = c1759x1;
                mVar.f12551A = this;
                mVar.f12562b = str;
                mVar.f12563c = list;
                mVar.f12564d = tVar;
                mVar.f12566f = null;
                mVar.f12569z = c0949b;
                mVar.f12552B = workDatabase;
                mVar.f12553C = workDatabase.n();
                mVar.f12554D = workDatabase.i();
                mVar.f12555E = workDatabase.o();
                C1501k c1501k = mVar.f12558H;
                q qVar = new q(16);
                qVar.f3287b = this;
                qVar.f3288c = str;
                qVar.f3289d = c1501k;
                c1501k.addListener(qVar, (L.f) this.f12514d.f17927d);
                this.f12517x.put(str, mVar);
                ((ExecutorC1453h) this.f12514d.f17925b).execute(mVar);
                n.d().b(f12508C, k.f(C0995b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f12510B) {
            try {
                if (this.f12516f.isEmpty()) {
                    Context context = this.f12512b;
                    String str = C1377a.f14860A;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f12512b.startService(intent);
                    } catch (Throwable th) {
                        n.d().c(f12508C, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f12511a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f12511a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean c3;
        synchronized (this.f12510B) {
            n.d().b(f12508C, "Processor stopping foreground work " + str, new Throwable[0]);
            c3 = c(str, (m) this.f12516f.remove(str));
        }
        return c3;
    }

    public final boolean j(String str) {
        boolean c3;
        synchronized (this.f12510B) {
            n.d().b(f12508C, "Processor stopping background work " + str, new Throwable[0]);
            c3 = c(str, (m) this.f12517x.remove(str));
        }
        return c3;
    }
}

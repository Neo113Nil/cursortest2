package D3;

import G.v;
import I.C0160m;
import I.C0162o;
import Q2.C0387u0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.internal.ads.C0634Ld;
import com.google.android.gms.internal.ads.C0786b4;
import com.google.android.gms.internal.ads.C0875d4;
import com.google.android.gms.internal.ads.C1394on;
import com.google.android.gms.internal.ads.C1414p6;
import com.google.android.gms.internal.ads.C1484qn;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Jr;
import com.google.android.gms.internal.ads.Jw;
import com.google.android.gms.internal.ads.Kw;
import com.google.android.gms.internal.ads.Mr;
import com.google.android.gms.internal.ads.My;
import com.google.android.gms.internal.ads.R5;
import com.google.android.gms.internal.ads.S5;
import com.google.android.gms.internal.ads.V3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import r.C2338p;
import t0.r;
import t0.u;

/* loaded from: classes.dex */
public final class l implements Jw {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f960k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f961l;

    /* renamed from: m, reason: collision with root package name */
    public Object f962m;

    /* renamed from: n, reason: collision with root package name */
    public Object f963n;

    public l(int i) {
        this.f960k = i;
        switch (i) {
            case 3:
                this.f962m = new Object();
                this.f963n = null;
                this.f961l = false;
                break;
            case 5:
                this.f963n = U2.c.f5860b;
                break;
            case 8:
                this.f962m = new ArrayList();
                this.f963n = My.f10755b;
                this.f961l = false;
                break;
            default:
                this.f962m = new Object();
                break;
        }
    }

    public static /* bridge */ /* synthetic */ void m(l lVar) {
        synchronized (lVar.f962m) {
            try {
                C1414p6 c1414p6 = (C1414p6) lVar.f963n;
                if (c1414p6 == null) {
                    return;
                }
                c1414p6.l();
                lVar.f963n = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(long j5) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((v) this.f963n).f1749l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (r.a(((u) obj).f19516a, j5)) {
                break;
            }
            i++;
        }
        u uVar = (u) obj;
        if (uVar != null) {
            return uVar.f19522h;
        }
        return false;
    }

    public int b() {
        C0160m c0160m = (C0160m) this.f963n;
        int i = c0160m.f2498b;
        int i5 = c0160m.f2499c;
        if (i < i5) {
            return 2;
        }
        return i > i5 ? 1 : 3;
    }

    public Activity c() {
        synchronized (this.f962m) {
            try {
                R5 r5 = (R5) this.f963n;
                if (r5 == null) {
                    return null;
                }
                return r5.f11327k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d(int i) {
        if (this.f961l) {
            return;
        }
        this.f961l = true;
        n(new C0387u0(i, "Error from: " + ((C1394on) this.f962m).f14848a + ", code: " + i, "undefined", null, null));
    }

    public void e(k kVar) {
        synchronized (this.f962m) {
            try {
                if (((ArrayDeque) this.f963n) == null) {
                    this.f963n = new ArrayDeque();
                }
                ((ArrayDeque) this.f963n).add(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Application f() {
        synchronized (this.f962m) {
            R5 r5 = (R5) this.f963n;
            if (r5 == null) {
                return null;
            }
            return r5.f11328l;
        }
    }

    public void g(o oVar) {
        k kVar;
        synchronized (this.f962m) {
            if (((ArrayDeque) this.f963n) != null && !this.f961l) {
                this.f961l = true;
                while (true) {
                    synchronized (this.f962m) {
                        try {
                            kVar = (k) ((ArrayDeque) this.f963n).poll();
                            if (kVar == null) {
                                this.f961l = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    kVar.a(oVar);
                }
            }
        }
    }

    public synchronized void h(C0387u0 c0387u0) {
        if (this.f961l) {
            return;
        }
        this.f961l = true;
        n(c0387u0);
    }

    public void i(S5 s5) {
        synchronized (this.f962m) {
            try {
                if (((R5) this.f963n) == null) {
                    this.f963n = new R5();
                }
                ((R5) this.f963n).a(s5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void j(String str, int i) {
        try {
            if (this.f961l) {
                return;
            }
            this.f961l = true;
            if (str == null) {
                str = "Error from: " + ((C1394on) this.f962m).f14848a + ", code: " + i;
            }
            n(new C0387u0(i, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void k() {
        ((C0634Ld) this.f963n).b(null);
    }

    public void l(Context context) {
        synchronized (this.f962m) {
            try {
                if (!this.f961l) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        U2.j.i("Can not cast Context to Application");
                        return;
                    }
                    if (((R5) this.f963n) == null) {
                        this.f963n = new R5();
                    }
                    R5 r5 = (R5) this.f963n;
                    if (!r5.f11335s) {
                        application.registerActivityLifecycleCallbacks(r5);
                        if (context instanceof Activity) {
                            r5.c((Activity) context);
                        }
                        r5.f11328l = application;
                        r5.f11336t = ((Long) Q2.r.f5053d.f5056c.a(F7.f8762T0)).longValue();
                        r5.f11335s = true;
                    }
                    this.f961l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void n(C0387u0 c0387u0) {
        int i = 1;
        if (true == ((Boolean) Q2.r.f5053d.f5056c.a(F7.i5)).booleanValue()) {
            i = 3;
        }
        ((C0634Ld) this.f963n).c(new C1484qn(i, c0387u0));
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        Jr jr = (Jr) this.f963n;
        jr.g(true);
        Mr mr = (Mr) this.f962m;
        mr.a(jr);
        if (this.f961l) {
            mr.h();
        }
    }

    public void p(S5 s5) {
        synchronized (this.f962m) {
            try {
                R5 r5 = (R5) this.f963n;
                if (r5 == null) {
                    return;
                }
                r5.b(s5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f960k) {
            case 1:
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(this.f961l);
                sb.append(", crossed=");
                int b3 = b();
                sb.append(b3 != 1 ? b3 != 2 ? b3 != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED");
                sb.append(", info=\n\t");
                sb.append((C0160m) this.f963n);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        Jr jr = (Jr) this.f963n;
        if (jr.k()) {
            jr.f(th);
            jr.g(false);
            Mr mr = (Mr) this.f962m;
            mr.a(jr);
            if (this.f961l) {
                mr.h();
            }
        }
    }

    public l(Context context, int i) {
        this.f960k = i;
        switch (i) {
            case 5:
                ExecutorService executorService = U2.c.f5860b;
                this.f963n = executorService;
                executorService.execute(new Kw(6, this, context));
                break;
            default:
                this.f962m = new Object();
                break;
        }
    }

    public l(C1394on c1394on, C0634Ld c0634Ld) {
        this.f960k = 6;
        this.f962m = c1394on;
        this.f963n = c0634Ld;
        this.f961l = false;
    }

    public l(Mr mr, Jr jr, boolean z3) {
        this.f960k = 7;
        this.f962m = mr;
        this.f963n = jr;
        this.f961l = z3;
    }

    public l(V3 v32) {
        this.f960k = 2;
        this.f962m = v32.z();
        this.f961l = v32.C();
        this.f963n = v32.x();
        v32.y();
    }

    public l(String str) {
        this.f960k = 2;
        this.f962m = str;
        this.f961l = false;
        this.f963n = C0786b4.x();
        int i = C0875d4.zza;
    }

    public l(C2338p c2338p, v vVar) {
        this.f960k = 9;
        this.f962m = c2338p;
        this.f963n = vVar;
    }

    public l(boolean z3, C0162o c0162o, C0160m c0160m) {
        this.f960k = 1;
        this.f961l = z3;
        this.f962m = c0162o;
        this.f963n = c0160m;
    }
}

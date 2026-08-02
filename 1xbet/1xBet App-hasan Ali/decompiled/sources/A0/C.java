package A0;

import Q2.InterfaceC0392x;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.AbstractC0745a8;
import com.google.android.gms.internal.ads.C1639u7;
import com.google.android.gms.internal.ads.InterfaceC0661Pc;
import com.google.android.gms.internal.ads.U5;
import com.google.android.gms.internal.ads.U9;
import e2.C1930k;
import f2.C1951i;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import k2.C2032c;
import k3.InterfaceC2035c;
import n.C2140j;
import p.C2236b;
import s1.C2359a;
import z1.DialogInterfaceOnCancelListenerC2770b;

/* loaded from: classes.dex */
public final class C implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f157k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f158l;

    public /* synthetic */ C(int i, Object obj) {
        this.f157k = i;
        this.f158l = obj;
    }

    private final void b() {
        synchronized (((D3.j) this.f158l).f958m) {
            D3.i iVar = ((D3.j) this.f158l).f959n;
            if (iVar != null) {
                ((D3.o) iVar.f953l).g();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        ReentrantReadWriteLock.ReadLock readLock = ((R1.d) this.f158l).f5134c.f5157h.readLock();
        HashSet hashSet = null;
        try {
            try {
                readLock.lock();
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            readLock.unlock();
            if (hashSet == null) {
                return;
            } else {
                return;
            }
        } catch (IllegalStateException e5) {
            e = e5;
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            readLock.unlock();
            if (hashSet == null) {
            }
        }
        if (!((R1.d) this.f158l).a()) {
            readLock.unlock();
            return;
        }
        if (!((R1.d) this.f158l).f5135d.compareAndSet(true, false)) {
            readLock.unlock();
            return;
        }
        if (((SQLiteDatabase) ((R1.d) this.f158l).f5134c.f5153c.z().f6123l).inTransaction()) {
            readLock.unlock();
            return;
        }
        WorkDatabase_Impl workDatabase_Impl = ((R1.d) this.f158l).f5134c;
        if (workDatabase_Impl.f) {
            Y1.b z3 = workDatabase_Impl.f5153c.z();
            z3.b();
            try {
                hashSet = a();
                z3.p();
                z3.k();
            } catch (Throwable th2) {
                z3.k();
                throw th2;
            }
        } else {
            hashSet = a();
        }
        readLock.unlock();
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        synchronized (((R1.d) this.f158l).f5138h) {
            try {
                C2236b c2236b = (C2236b) ((R1.d) this.f158l).f5138h.iterator();
                if (c2236b.hasNext()) {
                    ((R1.c) ((Map.Entry) c2236b.next()).getValue()).getClass();
                    throw null;
                }
            } finally {
            }
        }
    }

    private final void d() {
        T2.I i = (T2.I) this.f158l;
        if (i.f5645b) {
            if (!(i.k() && i.l()) && ((Boolean) AbstractC0745a8.f12641b.s()).booleanValue()) {
                synchronized (i.f5644a) {
                    try {
                        if (Looper.getMainLooper() == null) {
                            return;
                        }
                        if (i.f5648e == null) {
                            i.f5648e = new U5();
                        }
                        i.f5648e.b();
                        U2.j.h("start fetching content...");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private final void e() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f158l;
        String b3 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(b3)) {
            f2.m.d().b(ConstraintTrackingWorker.f7123u, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f7127s.j(new C1951i());
            return;
        }
        ListenableWorker a5 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b3, constraintTrackingWorker.f7124p);
        constraintTrackingWorker.f7128t = a5;
        if (a5 == null) {
            f2.m.d().a(ConstraintTrackingWorker.f7123u, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f7127s.j(new C1951i());
            return;
        }
        o2.i h3 = g2.l.Q(constraintTrackingWorker.getApplicationContext()).f17130m.n().h(constraintTrackingWorker.getId().toString());
        if (h3 == null) {
            constraintTrackingWorker.f7127s.j(new C1951i());
            return;
        }
        C2032c c2032c = new C2032c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
        c2032c.c(Collections.singletonList(h3));
        if (!c2032c.a(constraintTrackingWorker.getId().toString())) {
            f2.m.d().a(ConstraintTrackingWorker.f7123u, L1.a.n("Constraints not met for delegate ", b3, ". Requesting retry."), new Throwable[0]);
            constraintTrackingWorker.f7127s.j(new f2.j());
            return;
        }
        f2.m.d().a(ConstraintTrackingWorker.f7123u, L1.a.m("Constraints met for delegate ", b3), new Throwable[0]);
        try {
            E3.a startWork = constraintTrackingWorker.f7128t.startWork();
            startWork.a(new D3.h(26, constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
        } catch (Throwable th) {
            f2.m d5 = f2.m.d();
            String str = ConstraintTrackingWorker.f7123u;
            d5.a(str, L1.a.n("Delegated worker ", b3, " threw exception in startWork."), th);
            synchronized (constraintTrackingWorker.f7125q) {
                try {
                    if (constraintTrackingWorker.f7126r) {
                        f2.m.d().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.f7127s.j(new f2.j());
                    } else {
                        constraintTrackingWorker.f7127s.j(new C1951i());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor g5 = ((R1.d) this.f158l).f5134c.g(new H3.g("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 4));
        while (g5.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(g5.getInt(0)));
            } catch (Throwable th) {
                g5.close();
                throw th;
            }
        }
        g5.close();
        if (!hashSet.isEmpty()) {
            ((R1.d) this.f158l).f.r();
        }
        return hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B4.a c5;
        long j5;
        C2140j c2140j;
        switch (this.f157k) {
            case 0:
                F f = (F) this.f158l;
                f.removeCallbacks(this);
                MotionEvent motionEvent = f.f195C0;
                if (motionEvent != null) {
                    boolean z3 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z3) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    F f5 = (F) this.f158l;
                    f5.L(motionEvent, i, f5.f197D0, false);
                    return;
                }
                return;
            case 1:
                break;
            case 2:
                b();
                return;
            case 3:
                InterfaceC0392x interfaceC0392x = ((Q2.K0) this.f158l).f4929k.f4930k;
                if (interfaceC0392x != null) {
                    try {
                        interfaceC0392x.x(1);
                        return;
                    } catch (RemoteException e3) {
                        U2.j.j("Could not notify onAdFailedToLoad event.", e3);
                        return;
                    }
                }
                return;
            case 4:
                InterfaceC0392x interfaceC0392x2 = ((Q2.M0) this.f158l).f4933k;
                if (interfaceC0392x2 != null) {
                    try {
                        interfaceC0392x2.x(1);
                        return;
                    } catch (RemoteException e5) {
                        U2.j.j("Could not notify onAdFailedToLoad event.", e5);
                        return;
                    }
                }
                return;
            case 5:
                U9 u9 = ((Q2.N0) this.f158l).f4934k;
                if (u9 != null) {
                    try {
                        u9.x1(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e6) {
                        U2.j.j("Could not notify onComplete event.", e6);
                        return;
                    }
                }
                return;
            case 6:
                InterfaceC0661Pc interfaceC0661Pc = (InterfaceC0661Pc) this.f158l;
                if (interfaceC0661Pc != null) {
                    try {
                        interfaceC0661Pc.x(1);
                        return;
                    } catch (RemoteException e7) {
                        U2.j.k("#007 Could not call remote method.", e7);
                        return;
                    }
                }
                return;
            case 7:
                c();
                return;
            case 8:
                ((S2.d) this.f158l).p();
                return;
            case 9:
                Thread.currentThread();
                J2.a aVar = (J2.a) this.f158l;
                aVar.getClass();
                aVar.k();
                return;
            case 10:
                d();
                return;
            case 11:
                Worker worker = (Worker) this.f158l;
                try {
                    worker.f7089p.j(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.f7089p.k(th);
                    return;
                }
            case 12:
                j.e eVar = (j.e) this.f158l;
                eVar.a(true);
                eVar.invalidateSelf();
                return;
            case 13:
                ((l3.m) this.f158l).e();
                return;
            case 14:
                InterfaceC2035c interfaceC2035c = ((l3.m) ((C1930k) this.f158l).f16910l).f17807l;
                interfaceC2035c.f(interfaceC2035c.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((l3.u) this.f158l).f17843r.b(new j3.b(4));
                return;
            case 16:
                throw null;
            case 17:
                n.T t5 = (n.T) this.f158l;
                t5.f18193v = null;
                t5.drawableStateChanged();
                return;
            case 18:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f158l;
                if (searchView$SearchAutoComplete.f6750p) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f6750p = false;
                    return;
                }
                return;
            case 19:
                ActionMenuView actionMenuView = ((Toolbar) this.f158l).f6776k;
                if (actionMenuView == null || (c2140j = actionMenuView.f6730C) == null) {
                    return;
                }
                c2140j.i();
                return;
            case 20:
                s1.c cVar = (s1.c) this.f158l;
                if (cVar.f19198y) {
                    boolean z5 = cVar.f19196w;
                    C2359a c2359a = cVar.f19184k;
                    if (z5) {
                        cVar.f19196w = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c2359a.f19179e = currentAnimationTimeMillis;
                        c2359a.f19180g = -1L;
                        c2359a.f = currentAnimationTimeMillis;
                        c2359a.f19181h = 0.5f;
                    }
                    if ((c2359a.f19180g > 0 && AnimationUtils.currentAnimationTimeMillis() > c2359a.f19180g + c2359a.i) || !cVar.i()) {
                        cVar.f19198y = false;
                        return;
                    }
                    boolean z6 = cVar.f19197x;
                    ListView listView = cVar.f19186m;
                    if (z6) {
                        cVar.f19197x = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c2359a.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a5 = c2359a.a(currentAnimationTimeMillis2);
                    long j6 = currentAnimationTimeMillis2 - c2359a.f;
                    c2359a.f = currentAnimationTimeMillis2;
                    cVar.f19183A.scrollListBy((int) (j6 * ((a5 * 4.0f) + ((-4.0f) * a5 * a5)) * c2359a.f19178d));
                    Field field = n1.C.f18360a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case C1639u7.zzm /* 21 */:
                e();
                return;
            case 22:
                v3.e eVar2 = (v3.e) this.f158l;
                long j7 = v3.e.S((Context) eVar2.f20432l).getLong("app_set_id_last_used_time", -1L);
                long j8 = j7 != -1 ? j7 + 33696000000L : -1L;
                if (j8 == -1 || System.currentTimeMillis() <= j8) {
                    return;
                }
                Context context = (Context) eVar2.f20432l;
                if (!v3.e.S(context).edit().remove("app_set_id").commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 23:
                ((DialogInterfaceOnCancelListenerC2770b) this.f158l).f21891t.onDismiss(null);
                return;
            default:
                ((T2.r) this.f158l).i();
                throw null;
        }
        while (true) {
            B4.d dVar = (B4.d) this.f158l;
            synchronized (dVar) {
                c5 = dVar.c();
            }
            if (c5 == null) {
                return;
            }
            B4.c cVar2 = c5.f757c;
            kotlin.jvm.internal.l.c(cVar2);
            B4.d dVar2 = (B4.d) this.f158l;
            boolean isLoggable = B4.d.f766j.isLoggable(Level.FINE);
            if (isLoggable) {
                J0 j02 = cVar2.f760a.f767a;
                j5 = System.nanoTime();
                N4.b.g(c5, cVar2, "starting");
            } else {
                j5 = -1;
            }
            try {
                B4.d.a(dVar2, c5);
                if (isLoggable) {
                    J0 j03 = cVar2.f760a.f767a;
                    N4.b.g(c5, cVar2, "finished run in ".concat(N4.b.w(System.nanoTime() - j5)));
                }
            } catch (Throwable th2) {
                try {
                    ((ThreadPoolExecutor) dVar2.f767a.f304k).execute(this);
                    throw th2;
                } catch (Throwable th3) {
                    if (isLoggable) {
                        J0 j04 = cVar2.f760a.f767a;
                        N4.b.g(c5, cVar2, "failed a run in ".concat(N4.b.w(System.nanoTime() - j5)));
                    }
                    throw th3;
                }
            }
        }
    }

    public C(l3.k kVar, C2.h hVar) {
        this.f157k = 16;
        this.f158l = hVar;
    }
}

package B;

import E.G;
import G0.B;
import G0.C0051a;
import G0.C0054d;
import G0.C0060j;
import G0.F;
import G0.O;
import R.m;
import W.C0158c;
import W.C0162g;
import W.s;
import android.animation.ValueAnimator;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.A;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.Worker;
import b2.AbstractC0279e;
import c0.C0301c;
import c0.C0307i;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import g4.C0473r;
import h4.C0491i;
import io.appmetrica.analytics.impl.C0793l9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.AbstractC1252y;
import l.C1237i;
import m1.InterfaceC1276c;
import n1.BinderC1312P;
import n1.C1300D;
import n1.C1334u;
import n1.W;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f103b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f102a = i2;
        this.f103b = obj;
    }

    private final void b() {
        Set set;
        ReentrantReadWriteLock.ReadLock readLock = ((X.f) this.f103b).f3460a.f4726h.readLock();
        kotlin.jvm.internal.i.d(readLock, "readWriteLock.readLock()");
        readLock.lock();
        try {
            try {
            } finally {
                readLock.unlock();
                ((X.f) this.f103b).getClass();
            }
        } catch (SQLiteException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
            set = C0473r.f5752a;
        } catch (IllegalStateException e6) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
            set = C0473r.f5752a;
        }
        if (((X.f) this.f103b).a()) {
            if (((X.f) this.f103b).f3464e.compareAndSet(true, false)) {
                if (((X.f) this.f103b).f3460a.h().z().q()) {
                    return;
                }
                C0301c z = ((X.f) this.f103b).f3460a.h().z();
                z.b();
                try {
                    set = a();
                    z.D();
                    if (set.isEmpty()) {
                        return;
                    }
                    X.f fVar = (X.f) this.f103b;
                    synchronized (fVar.f3468i) {
                        Iterator it = fVar.f3468i.iterator();
                        while (true) {
                            n.b bVar = (n.b) it;
                            if (bVar.hasNext()) {
                                ((X.e) ((Map.Entry) bVar.next()).getValue()).a(set);
                            }
                        }
                    }
                } finally {
                    z.g();
                }
            }
        }
    }

    private final void c() {
        Object obj;
        synchronized (((A) this.f103b).f4512a) {
            obj = ((A) this.f103b).f4515d;
            ((A) this.f103b).f4515d = A.f4511i;
        }
        ((A) this.f103b).b(obj);
    }

    public C0491i a() {
        X.f fVar = (X.f) this.f103b;
        C0491i c0491i = new C0491i();
        Cursor m6 = fVar.f3460a.m(new C0051a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        try {
            Cursor cursor = m6;
            while (cursor.moveToNext()) {
                c0491i.add(Integer.valueOf(cursor.getInt(0)));
            }
            AbstractC1477a.e(m6, null);
            C0491i e3 = e5.g.e(c0491i);
            if (!e3.f5824a.isEmpty()) {
                if (((X.f) this.f103b).f3466g == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                C0307i c0307i = ((X.f) this.f103b).f3466g;
                if (c0307i == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                c0307i.a();
            }
            return e3;
        } finally {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4.a b6;
        long j2;
        C1237i c1237i;
        boolean z = false;
        switch (this.f102a) {
            case 0:
                Object obj = ((V0.j) this.f103b).f3212b;
                return;
            case 1:
                B b7 = (B) this.f103b;
                C0054d c0054d = b7.f743b;
                c0054d.t(0);
                C0060j c0060j = O.f782l;
                c0054d.H(24, 6, c0060j);
                b7.a(c0060j);
                return;
            case 2:
                H1.a aVar = (H1.a) this.f103b;
                synchronized (aVar.f1123a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f1132j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f1125c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                I.f fVar = (I.f) this.f103b;
                if (fVar.f1237o) {
                    boolean z5 = fVar.f1235m;
                    I.a aVar2 = fVar.f1223a;
                    if (z5) {
                        fVar.f1235m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f1216e = currentAnimationTimeMillis;
                        aVar2.f1218g = -1L;
                        aVar2.f1217f = currentAnimationTimeMillis;
                        aVar2.f1219h = 0.5f;
                    }
                    if ((aVar2.f1218g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f1218g + aVar2.f1220i) || !fVar.e()) {
                        fVar.f1237o = false;
                        return;
                    }
                    boolean z6 = fVar.f1236n;
                    ListView listView = fVar.f1225c;
                    if (z6) {
                        fVar.f1236n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f1217f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a6 = aVar2.a(currentAnimationTimeMillis2);
                    long j6 = currentAnimationTimeMillis2 - aVar2.f1217f;
                    aVar2.f1217f = currentAnimationTimeMillis2;
                    fVar.f1239q.scrollListBy((int) (j6 * ((a6 * 4.0f) + ((-4.0f) * a6 * a6)) * aVar2.f1215d));
                    Field field = G.f566a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                ((L.c) this.f103b).i(0);
                return;
            case 5:
                ((R.e) this.f103b).f2576l.onDismiss(null);
                return;
            case 6:
                R.f fVar2 = (R.f) this.f103b;
                if (fVar2.f2586e != null) {
                    if (fVar2.f2586e == null) {
                        B4.i iVar = new B4.i(8, z);
                        Object obj2 = R.f.f2581k;
                        iVar.f311b = obj2;
                        iVar.f312c = obj2;
                        iVar.f313d = obj2;
                        fVar2.f2586e = iVar;
                    }
                    fVar2.f2586e.getClass();
                    return;
                }
                return;
            case 7:
                ((m) this.f103b).i();
                throw null;
            case 8:
                C0162g c0162g = (C0162g) this.f103b;
                int i2 = c0162g.f3337v;
                ValueAnimator valueAnimator = c0162g.f3336u;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c0162g.f3337v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(PermissionsViewModel.DELAY_TIME_CALLBACK_CALL);
                valueAnimator.start();
                return;
            case 9:
                s sVar = ((RecyclerView) this.f103b).f4633D;
                if (sVar != null) {
                    C0158c c0158c = (C0158c) sVar;
                    ArrayList arrayList = c0158c.f3300e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0158c.f3302g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0158c.f3303h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0158c.f3301f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0158c.f3305j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            AbstractC0279e.o(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            AbstractC0279e.o(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0158c.f3306k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            AbstractC0279e.o(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            AbstractC0279e.o(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0158c.f3304i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0158c.f3365c : 0L, isEmpty3 ? 0L : c0158c.f3366d);
                        arrayList9.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 10:
                ((StaggeredGridLayoutManager) this.f103b).J();
                return;
            case 11:
                W4.d dVar = (W4.d) this.f103b;
                synchronized (dVar) {
                    dVar.f3440g++;
                    b6 = dVar.b();
                }
                if (b6 == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                do {
                    W4.a aVar3 = b6;
                    try {
                        currentThread.setName(aVar3.f3420a);
                        Logger logger = ((W4.d) this.f103b).f3435b;
                        W4.c cVar = aVar3.f3422c;
                        kotlin.jvm.internal.i.b(cVar);
                        boolean isLoggable = logger.isLoggable(Level.FINE);
                        if (isLoggable) {
                            V0.j jVar = cVar.f3426a.f3434a;
                            j2 = System.nanoTime();
                            e5.g.b(logger, aVar3, cVar, "starting");
                        } else {
                            j2 = -1;
                        }
                        try {
                            long a7 = aVar3.a();
                            if (isLoggable) {
                                V0.j jVar2 = cVar.f3426a.f3434a;
                                e5.g.b(logger, aVar3, cVar, "finished run in " + e5.g.n(System.nanoTime() - j2));
                            }
                            W4.d dVar2 = (W4.d) this.f103b;
                            synchronized (dVar2) {
                                W4.d.a(dVar2, aVar3, a7, true);
                                b6 = dVar2.b();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            W4.d dVar3 = (W4.d) this.f103b;
                            synchronized (dVar3) {
                                W4.d.a(dVar3, aVar3, -1L, false);
                                if (!(th instanceof InterruptedException)) {
                                    throw th;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th2) {
                            currentThread.setName(name);
                            throw th2;
                        }
                    }
                } while (b6 != null);
                currentThread.setName(name);
                return;
            case 12:
                b();
                return;
            case 13:
                c();
                return;
            case 14:
                if (((I1.h) this.f103b).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 15:
                AbstractC1252y abstractC1252y = (AbstractC1252y) this.f103b;
                abstractC1252y.f10995m = null;
                abstractC1252y.drawableStateChanged();
                return;
            case 16:
                ActionMenuView actionMenuView = ((Toolbar) this.f103b).f4267a;
                if (actionMenuView == null || (c1237i = actionMenuView.f4158s) == null) {
                    return;
                }
                c1237i.k();
                return;
            case 17:
                C1334u c1334u = (C1334u) this.f103b;
                l1.g gVar = c1334u.f11419d;
                Context context = c1334u.f11418c;
                gVar.getClass();
                if (l1.i.f11013a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e3) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e3);
                    return;
                }
            case 18:
                ((C1300D) this.f103b).e();
                return;
            case C0793l9.f8681C /* 19 */:
                InterfaceC1276c interfaceC1276c = ((C1300D) ((V0.j) this.f103b).f3212b).f11294e;
                interfaceC1276c.c(interfaceC1276c.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case C0793l9.f8682D /* 20 */:
                ((BinderC1312P) this.f103b).f11339j.b(new l1.b(4));
                return;
            case C0793l9.f8683E /* 21 */:
                throw null;
            case 22:
                Worker worker = (Worker) this.f103b;
                try {
                    worker.f4708a.k(worker.a());
                    return;
                } catch (Throwable th3) {
                    worker.f4708a.l(th3);
                    return;
                }
            default:
                x1.e eVar = (x1.e) this.f103b;
                long j7 = x1.e.w((Context) eVar.f12265a).getLong("app_set_id_last_used_time", -1L);
                long j8 = j7 != -1 ? j7 + 33696000000L : -1L;
                if (j8 == -1 || System.currentTimeMillis() <= j8) {
                    return;
                }
                Context context2 = (Context) eVar.f12265a;
                if (!x1.e.w(context2).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String valueOf = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context2.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
        }
    }

    public a(W w3, F f3) {
        this.f102a = 21;
        this.f103b = f3;
    }

    public a(V0.j jVar, int i2) {
        this.f102a = 0;
        this.f103b = jVar;
    }
}

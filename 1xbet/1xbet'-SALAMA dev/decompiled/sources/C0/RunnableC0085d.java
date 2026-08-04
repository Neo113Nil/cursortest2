package C0;

import A1.x0;
import F2.InterfaceC0266z;
import F2.Z0;
import F2.b1;
import F2.c1;
import I2.AbstractC0308p;
import K4.AbstractC0315b;
import P.U;
import U5.AbstractC0457y;
import U5.W;
import U5.l0;
import W5.AbstractC0486a1;
import W5.C0496e;
import W5.C0516k1;
import W5.C0522m1;
import W5.C0538s0;
import W5.F0;
import W5.I0;
import W5.K1;
import W5.M1;
import W5.O;
import W5.P0;
import W5.Q0;
import W5.R1;
import W5.RunnableC0518l0;
import W5.Y0;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.C0628l0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.zzayw;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbdp;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzbwa;
import io.sentry.HttpStatusCodeRange;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;

/* JADX INFO: renamed from: C0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0085d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1259b;

    public /* synthetic */ RunnableC0085d(Object obj, int i7) {
        this.f1258a = i7;
        this.f1259b = obj;
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor cursorG = ((D0.e) this.f1259b).f1633c.g(new J0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 0));
        while (cursorG.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorG.getInt(0)));
            } catch (Throwable th) {
                cursorG.close();
                throw th;
            }
        }
        cursorG.close();
        if (!hashSet.isEmpty()) {
            ((D0.e) this.f1259b).f1636f.k();
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? A7;
        int i7 = 0;
        switch (this.f1258a) {
            case 0:
                C0089h c0089h = (C0089h) this.f1259b;
                int i8 = c0089h.f1286v;
                ValueAnimator valueAnimator = c0089h.f1285u;
                if (i8 == 1) {
                    valueAnimator.cancel();
                } else if (i8 != 2) {
                    return;
                }
                c0089h.f1286v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(HttpStatusCodeRange.DEFAULT_MIN);
                valueAnimator.start();
                return;
            case 1:
                t tVar = ((RecyclerView) this.f1259b).f9707U;
                if (tVar != null) {
                    C0084c c0084c = (C0084c) tVar;
                    ArrayList arrayList = c0084c.f1248e;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0084c.f1250g;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0084c.f1251h;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0084c.f1249f;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!zIsEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0084c.j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!zIsEmpty) {
                            AbstractC0486a1.n(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            AbstractC0486a1.n(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!zIsEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0084c.f1253k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!zIsEmpty) {
                            AbstractC0486a1.n(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            AbstractC0486a1.n(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (zIsEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0084c.f1252i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
                        Math.max(!zIsEmpty2 ? c0084c.f1312c : 0L, zIsEmpty3 ? 0L : c0084c.f1313d);
                        throw p031e1.k.c(arrayList9, 0);
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
            case 2:
                ((StaggeredGridLayoutManager) this.f1259b).J();
                return;
            case 3:
                ReentrantReadWriteLock.ReadLock lock = ((D0.e) this.f1259b).f1633c.f1660h.readLock();
                try {
                    try {
                        lock.lock();
                        if (((D0.e) this.f1259b).a() && ((D0.e) this.f1259b).f1634d.compareAndSet(true, false) && !((SQLiteDatabase) ((D0.e) this.f1259b).f1633c.f1655c.l().f3868b).inTransaction()) {
                            WorkDatabase_Impl workDatabase_Impl = ((D0.e) this.f1259b).f1633c;
                            boolean z4 = workDatabase_Impl.f1658f;
                            if (z4) {
                                try {
                                    K0.b bVarL = workDatabase_Impl.f1655c.l();
                                    bVarL.a();
                                    try {
                                        HashSet hashSetA = a();
                                        try {
                                            bVarL.j();
                                            bVarL.f();
                                            A7 = hashSetA;
                                        } catch (Throwable th) {
                                            th = th;
                                            bVarL.f();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    A7 = z4;
                                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                                } catch (IllegalStateException e8) {
                                    e = e8;
                                    A7 = z4;
                                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                                }
                            } else {
                                A7 = a();
                            }
                            lock.unlock();
                            if (A7 == 0 || A7.isEmpty()) {
                                return;
                            }
                            synchronized (((D0.e) this.f1259b).f1638h) {
                                try {
                                    p101o.b bVar = (p101o.b) ((D0.e) this.f1259b).f1638h.iterator();
                                    if (bVar.hasNext()) {
                                        ((D0.d) ((Map.Entry) bVar.next()).getValue()).getClass();
                                        throw null;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            return;
                        }
                        lock.unlock();
                        return;
                    } catch (Throwable th4) {
                        lock.unlock();
                        throw th4;
                    }
                } catch (SQLiteException | IllegalStateException e9) {
                    e = e9;
                    A7 = 0;
                }
                break;
            case 4:
                InterfaceC0266z interfaceC0266z = ((Z0) this.f1259b).f2649a.f2650a;
                if (interfaceC0266z != null) {
                    try {
                        interfaceC0266z.zze(1);
                        return;
                    } catch (RemoteException e10) {
                        J2.j.h("Could not notify onAdFailedToLoad event.", e10);
                        return;
                    }
                }
                return;
            case 5:
                InterfaceC0266z interfaceC0266z2 = ((b1) this.f1259b).f2654a;
                if (interfaceC0266z2 != null) {
                    try {
                        interfaceC0266z2.zze(1);
                        return;
                    } catch (RemoteException e11) {
                        J2.j.h("Could not notify onAdFailedToLoad event.", e11);
                        return;
                    }
                }
                return;
            case 6:
                zzble zzbleVar = ((c1) this.f1259b).f2657a;
                if (zzbleVar != null) {
                    try {
                        zzbleVar.zzb(Collections.emptyList());
                        return;
                    } catch (RemoteException e12) {
                        J2.j.h("Could not notify onComplete event.", e12);
                        return;
                    }
                }
                return;
            case 7:
                zzbwa zzbwaVar = (zzbwa) this.f1259b;
                if (zzbwaVar != null) {
                    try {
                        zzbwaVar.zze(1);
                        return;
                    } catch (RemoteException e13) {
                        J2.j.i("#007 Could not call remote method.", e13);
                        return;
                    }
                }
                return;
            case 8:
                ((H2.j) this.f1259b).zzc();
                return;
            case 9:
                Thread threadCurrentThread = Thread.currentThread();
                AbstractC0308p abstractC0308p = (AbstractC0308p) this.f1259b;
                abstractC0308p.zzb = threadCurrentThread;
                abstractC0308p.zza();
                return;
            case 10:
                I2.M m7 = (I2.M) this.f1259b;
                if (m7.f3552b) {
                    if (!(m7.i() && m7.j()) && ((Boolean) zzbdp.zzb.zze()).booleanValue()) {
                        synchronized (m7.f3551a) {
                            try {
                                if (Looper.getMainLooper() == null) {
                                    return;
                                }
                                if (m7.f3555e == null) {
                                    m7.f3555e = new zzayw();
                                }
                                m7.f3555e.zzd();
                                int i9 = I2.J.f3546b;
                                J2.j.f("start fetching content...");
                                return;
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                    return;
                }
                return;
            case 11:
                AbstractC0315b abstractC0315b = (AbstractC0315b) this.f1259b;
                if (abstractC0315b.c()) {
                    abstractC0315b.a(K4.x.f4072a, l0.f6536e);
                    return;
                }
                return;
            case 12:
                Object obj = ((x0) this.f1259b).f613b;
                return;
            case 13:
                V.g gVar = (V.g) this.f1259b;
                if (gVar.f6615F) {
                    boolean z7 = gVar.f6613D;
                    V.a aVar = gVar.f6618a;
                    if (z7) {
                        gVar.f6613D = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f6604e = jCurrentAnimationTimeMillis;
                        aVar.f6606g = -1L;
                        aVar.f6605f = jCurrentAnimationTimeMillis;
                        aVar.f6607h = 0.5f;
                    }
                    if ((aVar.f6606g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f6606g + ((long) aVar.f6608i)) || !gVar.e()) {
                        gVar.f6615F = false;
                        return;
                    }
                    boolean z8 = gVar.f6614E;
                    ListView listView = gVar.f6620c;
                    if (z8) {
                        gVar.f6614E = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f6605f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - aVar.f6605f;
                    aVar.f6605f = jCurrentAnimationTimeMillis2;
                    gVar.f6617H.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f6603d));
                    WeakHashMap weakHashMap = U.f5037a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 14:
                ((W5.I) this.f1259b).f6819a.j();
                return;
            case 15:
                ((O) this.f1259b).f6891a.u();
                return;
            case 16:
                C0538s0 c0538s0 = (C0538s0) ((W5.E) this.f1259b).f6761b;
                Y0 y4 = c0538s0.f7356r;
                c0538s0.f7355q = null;
                c0538s0.f7356r = null;
                y4.e(l0.f6544n.g("InternalSubchannel closed transport due to address change"));
                return;
            case 17:
                ((Q0) ((W5.C) this.f1259b).f6750b).C();
                return;
            case 18:
                Q0 q1 = ((I0) this.f1259b).f6823e;
                q1.f6972p.f();
                if (q1.f6982z) {
                    q1.f6981y.k();
                    return;
                }
                return;
            case 19:
                C0538s0 c0538s1 = ((P0) this.f1259b).f6915f;
                l0 l0Var = Q0.f6926k0;
                c0538s1.getClass();
                c0538s1.f7349k.execute(new RunnableC0518l0(c0538s1, l0Var, i7));
                return;
            case 20:
                C0522m1 c0522m1 = (C0522m1) this.f1259b;
                c0522m1.f7286k = null;
                if (c0522m1.f7284h.b()) {
                    c0522m1.e();
                    return;
                }
                return;
            case zzbbd.zzt.zzm /* 21 */:
                ((AbstractC0457y) ((C0516k1) this.f1259b).f7266c).l();
                return;
            case 22:
                F0 f7 = (F0) this.f1259b;
                if (f7.f6801z) {
                    return;
                }
                f7.f6796u.u();
                return;
            case 23:
                K1 k7 = (K1) this.f1259b;
                F0 f8 = (F0) k7.f6844c.f7233c;
                M1 m8 = k7.f6843b;
                W w7 = F0.f6769E;
                f8.r(m8);
                return;
            case 24:
                ((R1) this.f1259b).k();
                return;
            case 25:
                X5.c cVar = (X5.c) this.f1259b;
                try {
                    N6.b bVar2 = cVar.f7495z;
                    if (bVar2 != null) {
                        N6.d dVar = cVar.f7488b;
                        long j3 = dVar.f4797b;
                        if (j3 > 0) {
                            bVar2.m(dVar, j3);
                        }
                    }
                } catch (IOException e14) {
                    cVar.f7490d.p(e14);
                }
                N6.d dVar2 = cVar.f7488b;
                X5.m mVar = cVar.f7490d;
                try {
                    N6.b bVar3 = cVar.f7495z;
                    if (bVar3 != null) {
                        bVar3.close();
                    }
                } catch (IOException e15) {
                    mVar.p(e15);
                }
                try {
                    Socket socket = cVar.f7483A;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e16) {
                    mVar.p(e16);
                    return;
                }
            case 26:
                C0083b c0083b = (C0083b) this.f1259b;
                long j7 = c0083b.f1246b;
                long jMax = Math.max(2 * j7, j7);
                C0496e c0496e = (C0496e) c0083b.f1247c;
                if (c0496e.f7186b.compareAndSet(j7, jMax)) {
                    C0496e.f7184c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{c0496e.f7185a, Long.valueOf(jMax)});
                    return;
                }
                return;
            case 27:
                ((X5.m) this.f1259b).getClass();
                X5.m mVar2 = (X5.m) this.f1259b;
                mVar2.f7593o.execute(mVar2.f7598t);
                synchronized (((X5.m) this.f1259b).f7589k) {
                    X5.m mVar3 = (X5.m) this.f1259b;
                    mVar3.f7567C = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    mVar3.t();
                    break;
                }
                ((X5.m) this.f1259b).getClass();
                return;
            case 28:
                ((p004a0.a) this.f1259b).s(0);
                return;
            default:
                C0628l0 c0628l0 = (C0628l0) this.f1259b;
                c0628l0.f8685C = null;
                c0628l0.drawableStateChanged();
                return;
        }
    }

    public RunnableC0085d(x0 x0Var, int i7) {
        this.f1258a = 12;
        this.f1259b = x0Var;
    }
}

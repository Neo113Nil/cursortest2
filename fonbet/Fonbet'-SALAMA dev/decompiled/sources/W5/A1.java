package W5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import d1.C0955h;
import e3.C1023h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;
import l1.C1377a;
import n1.C1450e;
import n1.C1458m;
import o1.C1491a;
import o1.C1501k;
import org.json.JSONException;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class A1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6739a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6740b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6741c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6742d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6743e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6744f;

    public /* synthetic */ A1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f6739a = i7;
        this.f6744f = obj;
        this.f6740b = obj2;
        this.f6741c = obj3;
        this.f6742d = obj4;
        this.f6743e = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5.l0 l0Var;
        com.google.firebase.storage.h a2;
        switch (this.f6739a) {
            case 0:
                for (M1 m12 : (Collection) this.f6740b) {
                    if (m12 != ((M1) this.f6741c)) {
                        m12.f6877a.f(F0.f6771G);
                    }
                }
                Future future = (Future) this.f6742d;
                if (future != null) {
                    future.cancel(false);
                }
                Future future2 = (Future) this.f6743e;
                if (future2 != null) {
                    future2.cancel(false);
                }
                F0 f02 = (F0) this.f6744f;
                w1.F0 f03 = ((Q0) f02.f6776D.f6750b).f6938I;
                synchronized (f03.f17373b) {
                    try {
                        ((HashSet) f03.f17374c).remove(f02);
                        if (((HashSet) f03.f17374c).isEmpty()) {
                            l0Var = (U5.l0) f03.f17375d;
                            f03.f17374c = new HashSet();
                        } else {
                            l0Var = null;
                        }
                    } finally {
                    }
                }
                if (l0Var != null) {
                    ((Q0) f03.f17376e).f6937H.e(l0Var);
                    return;
                }
                return;
            case 1:
                com.google.firebase.storage.m mVar = (com.google.firebase.storage.m) this.f6740b;
                C1726n0 b7 = mVar.b();
                com.google.firebase.storage.f fVar = mVar.f12045b;
                T4.b bVar = new T4.b(b7, fVar.f12012a, (Integer) this.f6744f, (String) this.f6743e);
                ((S4.e) this.f6742d).b(bVar, true);
                boolean l7 = bVar.l();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6741c;
                if (l7) {
                    try {
                        a2 = com.google.firebase.storage.h.a(fVar, bVar.i());
                    } catch (JSONException e7) {
                        Log.e("ListTask", "Unable to parse response body. " + bVar.f6358f, e7);
                        taskCompletionSource.setException(com.google.firebase.storage.i.b(e7, 0));
                        return;
                    }
                } else {
                    a2 = null;
                }
                if (taskCompletionSource != null) {
                    bVar.a(taskCompletionSource, a2);
                    return;
                }
                return;
            case 2:
                com.google.firebase.storage.m mVar2 = (com.google.firebase.storage.m) this.f6740b;
                T4.g gVar = new T4.g(mVar2.b(), mVar2.f12045b.f12012a, ((com.google.firebase.storage.j) this.f6742d).a());
                ((S4.e) this.f6744f).b(gVar, true);
                boolean l8 = gVar.l();
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f6741c;
                if (l8) {
                    try {
                        this.f6743e = new B3.g(gVar.i(), mVar2).d();
                    } catch (JSONException e8) {
                        Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + gVar.f6358f, e8);
                        taskCompletionSource2.setException(com.google.firebase.storage.i.b(e8, 0));
                        return;
                    }
                }
                gVar.a(taskCompletionSource2, (com.google.firebase.storage.j) this.f6743e);
                return;
            case 3:
                try {
                    if (!(((C1501k) this.f6740b).f15567a instanceof C1491a)) {
                        String uuid = ((UUID) this.f6741c).toString();
                        int h6 = ((C1458m) this.f6744f).f15333c.h(uuid);
                        if (h6 == 0 || AbstractC0486a1.b(h6)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((C1458m) this.f6744f).f15332b.f(uuid, (C0955h) this.f6742d);
                        ((Context) this.f6743e).startService(C1377a.a((Context) this.f6743e, uuid, (C0955h) this.f6742d));
                    }
                    ((C1501k) this.f6740b).i(null);
                    return;
                } catch (Throwable th) {
                    ((C1501k) this.f6740b).j(th);
                    return;
                }
            default:
                IBinder binder = ((Messenger) ((C1450e) this.f6740b).f15308b).getBinder();
                C1023h c1023h = (C1023h) this.f6744f;
                q0.h hVar = (q0.h) ((q0.s) c1023h.f12667a).f15781e.getOrDefault(binder, null);
                String str = (String) this.f6741c;
                if (hVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str);
                    return;
                }
                q0.s sVar = (q0.s) c1023h.f12667a;
                sVar.getClass();
                HashMap hashMap = hVar.f15743e;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new ArrayList();
                }
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    IBinder iBinder = (IBinder) this.f6742d;
                    Bundle bundle = (Bundle) this.f6743e;
                    if (!hasNext) {
                        list.add(new O.b(iBinder, bundle));
                        hashMap.put(str, list);
                        sVar.e(str, hVar, bundle, null);
                        return;
                    }
                    O.b bVar2 = (O.b) it.next();
                    if (iBinder == bVar2.f4824a) {
                        Bundle bundle2 = (Bundle) bVar2.f4825b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    public A1(com.google.firebase.storage.m mVar, TaskCompletionSource taskCompletionSource, com.google.firebase.storage.j jVar) {
        this.f6739a = 2;
        this.f6743e = null;
        this.f6740b = mVar;
        this.f6741c = taskCompletionSource;
        this.f6742d = jVar;
        com.google.firebase.storage.f fVar = mVar.f12045b;
        Y3.i iVar = fVar.f12012a;
        iVar.b();
        this.f6744f = new S4.e(iVar.f7663a, fVar.b(), fVar.a(), fVar.f12018g);
    }

    public A1(com.google.firebase.storage.m mVar, Integer num, String str, TaskCompletionSource taskCompletionSource) {
        this.f6739a = 1;
        com.google.android.gms.common.internal.D.i(mVar);
        this.f6740b = mVar;
        this.f6744f = num;
        this.f6743e = str;
        this.f6741c = taskCompletionSource;
        com.google.firebase.storage.f fVar = mVar.f12045b;
        Y3.i iVar = fVar.f12012a;
        iVar.b();
        this.f6742d = new S4.e(iVar.f7663a, fVar.b(), fVar.a(), fVar.f12017f);
    }
}

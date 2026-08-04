package W5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;
import org.json.JSONException;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class A1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
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
        com.google.firebase.storage.h hVarA;
        switch (this.f6739a) {
            case 0:
                for (M1 m7 : (Collection) this.f6740b) {
                    if (m7 != ((M1) this.f6741c)) {
                        m7.f6877a.f(F0.f6771G);
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
                F0 f7 = (F0) this.f6744f;
                p155w1.F0 f8 = ((Q0) f7.f6776D.f6750b).f6938I;
                synchronized (f8.f17379b) {
                    try {
                        ((HashSet) f8.f17380c).remove(f7);
                        if (((HashSet) f8.f17380c).isEmpty()) {
                            l0Var = (U5.l0) f8.f17381d;
                            f8.f17380c = new HashSet();
                        } else {
                            l0Var = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (l0Var != null) {
                    ((Q0) f8.f17382e).f6937H.e(l0Var);
                    return;
                }
                return;
            case 1:
                com.google.firebase.storage.m mVar = (com.google.firebase.storage.m) this.f6740b;
                C1017n0 c1017n0B = mVar.b();
                com.google.firebase.storage.f fVar = mVar.f12045b;
                T4.b bVar = new T4.b(c1017n0B, fVar.f12012a, (Integer) this.f6744f, (String) this.f6743e);
                ((S4.e) this.f6742d).b(bVar, true);
                boolean zL = bVar.l();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6741c;
                if (zL) {
                    try {
                        hVarA = com.google.firebase.storage.h.a(fVar, bVar.i());
                    } catch (JSONException e7) {
                        Log.e("ListTask", "Unable to parse response body. " + bVar.f6358f, e7);
                        taskCompletionSource.setException(com.google.firebase.storage.i.b(e7, 0));
                        return;
                    }
                    break;
                } else {
                    hVarA = null;
                }
                if (taskCompletionSource != null) {
                    bVar.a(taskCompletionSource, hVarA);
                    return;
                }
                return;
            case 2:
                com.google.firebase.storage.m mVar2 = (com.google.firebase.storage.m) this.f6740b;
                T4.g gVar = new T4.g(mVar2.b(), mVar2.f12045b.f12012a, ((com.google.firebase.storage.j) this.f6742d).a());
                ((S4.e) this.f6744f).b(gVar, true);
                boolean zL2 = gVar.l();
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f6741c;
                if (zL2) {
                    try {
                        this.f6743e = new B3.g(gVar.i(), mVar2).d();
                    } catch (JSONException e8) {
                        Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + gVar.f6358f, e8);
                        taskCompletionSource2.setException(com.google.firebase.storage.i.b(e8, 0));
                        return;
                    }
                    break;
                }
                gVar.a(taskCompletionSource2, (com.google.firebase.storage.j) this.f6743e);
                return;
            case 3:
                try {
                    if (!(((p103o1.k) this.f6740b).f15573a instanceof p103o1.a)) {
                        String string = ((UUID) this.f6741c).toString();
                        int iH = ((p096n1.m) this.f6744f).f15339c.h(string);
                        if (iH == 0 || AbstractC0486a1.b(iH)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((p096n1.m) this.f6744f).f15338b.f(string, (p023d1.h) this.f6742d);
                        ((Context) this.f6743e).startService(p080l1.a.a((Context) this.f6743e, string, (p023d1.h) this.f6742d));
                    }
                    ((p103o1.k) this.f6740b).i(null);
                    return;
                } catch (Throwable th2) {
                    ((p103o1.k) this.f6740b).j(th2);
                    return;
                }
            default:
                IBinder binder = ((Messenger) ((p096n1.e) this.f6740b).f15314b).getBinder();
                p033e3.h hVar = (p033e3.h) this.f6744f;
                p117q0.h hVar2 = (p117q0.h) ((p117q0.s) hVar.f12673a).f15787e.getOrDefault(binder, null);
                String str = (String) this.f6741c;
                if (hVar2 == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str);
                    return;
                }
                p117q0.s sVar = (p117q0.s) hVar.f12673a;
                sVar.getClass();
                HashMap map = hVar2.f15749e;
                List arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    IBinder iBinder = (IBinder) this.f6742d;
                    Bundle bundle = (Bundle) this.f6743e;
                    if (!zHasNext) {
                        arrayList.add(new O.b(iBinder, bundle));
                        map.put(str, arrayList);
                        sVar.e(str, hVar2, bundle, null);
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

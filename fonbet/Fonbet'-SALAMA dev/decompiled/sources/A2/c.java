package A2;

import A5.p;
import B3.g;
import E2.f;
import E4.CallableC0180m;
import P2.A;
import P2.BinderC0386l;
import P2.L;
import P2.o;
import S2.d;
import S4.e;
import U5.b0;
import U5.l0;
import W5.AbstractC0484a;
import W5.EnumC0543u;
import W5.F0;
import W5.O;
import W5.a2;
import W5.b2;
import W5.c2;
import Y4.D;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.media.session.t;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbwc;
import com.google.android.gms.internal.ads.zzbwn;
import com.google.android.gms.internal.ads.zzbyc;
import com.google.android.gms.internal.ads.zzdqk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.j;
import com.google.firebase.storage.m;
import d1.C0954g;
import d1.n;
import d6.C0977k;
import e3.C1023h;
import i4.C1265b;
import i4.C1269f;
import i5.AbstractC1279a;
import i5.C1282d;
import i5.k;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import l4.C1392c;
import l4.C1403n;
import l4.C1404o;
import l4.EnumC1402m;
import l4.s;
import m.C1420d;
import m.ViewOnKeyListenerC1421e;
import m1.C1427b;
import m1.C1432g;
import m1.i;
import n1.C1450e;
import n1.C1459n;
import n4.C1468b;
import n4.C1471e;
import n4.C1473g;
import n4.C1474h;
import n4.C1479m;
import n4.y;
import o1.C1501k;
import o3.BinderC1507b;
import org.json.JSONException;
import p6.AbstractC1539a;
import s4.h;
import v4.l;
import v4.r;
import w1.C1719l1;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f619a;

    /* renamed from: b, reason: collision with root package name */
    public Object f620b;

    /* renamed from: c, reason: collision with root package name */
    public Object f621c;

    /* renamed from: d, reason: collision with root package name */
    public Object f622d;

    /* renamed from: e, reason: collision with root package name */
    public Object f623e;

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean contains;
        i l7;
        switch (this.f619a) {
            case 0:
                Context context = (Context) this.f620b;
                try {
                    new zzazy(context, (String) this.f621c, ((y2.i) this.f622d).f18154a, (a) this.f623e).zza();
                    return;
                } catch (IllegalStateException e7) {
                    zzbtl.zza(context).zzh(e7, "AppOpenAd.load");
                    return;
                }
            case 1:
                Context context2 = (Context) this.f620b;
                try {
                    new zzblt(context2, (String) this.f621c).zza(((y2.i) this.f622d).f18154a, (K2.b) this.f623e);
                    return;
                } catch (IllegalStateException e8) {
                    zzbtl.zza(context2).zzh(e8, "InterstitialAd.load");
                    return;
                }
            case 2:
                o oVar = (o) this.f620b;
                String str = (String) this.f621c;
                BinderC0386l binderC0386l = (BinderC0386l) this.f622d;
                zzbyc zzbycVar = (zzbyc) this.f623e;
                A a2 = oVar.f5539b;
                a2.e();
                synchronized (a2.f5403d) {
                    contains = a2.f5400a.contains(str);
                }
                if (contains || oVar.b()) {
                    return;
                }
                binderC0386l.zzf(new BinderC1507b(oVar.f5538a), zzbycVar, null);
                return;
            case 3:
                L l8 = (L) this.f620b;
                zzdqk zzdqkVar = (zzdqk) this.f621c;
                l8.d(zzdqkVar, (ArrayDeque) this.f622d, "to");
                l8.d(zzdqkVar, (ArrayDeque) this.f623e, "of");
                return;
            case 4:
                Context context3 = (Context) this.f620b;
                try {
                    new zzbwc(context3, (String) this.f621c).zza(((z2.b) this.f622d).f18154a, (d) this.f623e);
                    return;
                } catch (IllegalStateException e9) {
                    zzbtl.zza(context3).zzh(e9, "RewardedAd.loadAdManager");
                    return;
                }
            case 5:
                Context context4 = (Context) this.f620b;
                try {
                    new zzbwc(context4, (String) this.f621c).zza(((y2.i) this.f622d).f18154a, (d) this.f623e);
                    return;
                } catch (IllegalStateException e10) {
                    zzbtl.zza(context4).zzh(e10, "RewardedAd.load");
                    return;
                }
            case 6:
                Context context5 = (Context) this.f620b;
                try {
                    new zzbwn(context5, (String) this.f621c).zza(((z2.b) this.f622d).f18154a, (T2.b) this.f623e);
                    return;
                } catch (IllegalStateException e11) {
                    zzbtl.zza(context5).zzh(e11, "RewardedInterstitialAdManager.load");
                    return;
                }
            case 7:
                Context context6 = (Context) this.f620b;
                try {
                    new zzbwn(context6, (String) this.f621c).zza(((y2.i) this.f622d).f18154a, (T2.b) this.f623e);
                    return;
                } catch (IllegalStateException e12) {
                    zzbtl.zza(context6).zzh(e12, "RewardedInterstitialAd.load");
                    return;
                }
            case 8:
                ((AbstractC0484a) this.f623e).b((l0) this.f620b, (EnumC0543u) this.f621c, (b0) this.f622d);
                return;
            case 9:
                ((O) this.f623e).f6891a.F((l0) this.f620b, (EnumC0543u) this.f621c, (b0) this.f622d);
                return;
            case 10:
                F0 f02 = (F0) this.f623e;
                f02.f6801z = true;
                f02.f6796u.F((l0) this.f620b, (EnumC0543u) this.f621c, (b0) this.f622d);
                return;
            case 11:
                synchronized (((c2) this.f623e)) {
                    try {
                        if (((a2) this.f620b).f7121b == 0) {
                            try {
                                ((b2) this.f621c).l(this.f622d);
                                ((c2) this.f623e).f7157a.remove((b2) this.f621c);
                                if (((c2) this.f623e).f7157a.isEmpty()) {
                                    ((c2) this.f623e).f7159c.shutdown();
                                    ((c2) this.f623e).f7159c = null;
                                }
                            } catch (Throwable th) {
                                ((c2) this.f623e).f7157a.remove((b2) this.f621c);
                                if (((c2) this.f623e).f7157a.isEmpty()) {
                                    ((c2) this.f623e).f7159c.shutdown();
                                    ((c2) this.f623e).f7159c = null;
                                }
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 12:
                m mVar = (m) this.f620b;
                T4.a aVar = new T4.a(mVar.b(), mVar.f12045b.f12012a, 1);
                ((e) this.f623e).b(aVar, true);
                boolean l9 = aVar.l();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f621c;
                if (l9) {
                    try {
                        this.f622d = new g(aVar.i(), mVar).d();
                    } catch (JSONException e13) {
                        Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + aVar.f6358f, e13);
                        taskCompletionSource.setException(com.google.firebase.storage.i.b(e13, 0));
                        return;
                    }
                }
                if (taskCompletionSource != null) {
                    aVar.a(taskCompletionSource, (j) this.f622d);
                    return;
                }
                return;
            case 13:
                C1269f c1269f = (C1269f) this.f623e;
                C1479m c1479m = (C1479m) c1269f.f1723b;
                q4.j jVar = (q4.j) ((q4.e) this.f621c).f15858b;
                t tVar = c1479m.f15455i;
                boolean r02 = tVar.r0();
                C1473g c1473g = (C1473g) c1269f.f1725d;
                if (r02) {
                    tVar.W(null, "update: " + c1473g, new Object[0]);
                }
                t tVar2 = c1479m.f15456k;
                boolean r03 = tVar2.r0();
                Map map = (Map) this.f622d;
                if (r03) {
                    tVar2.W(null, "update: " + c1473g + " " + map, new Object[0]);
                }
                C1468b c1468b = (C1468b) this.f620b;
                q4.c cVar = c1468b.f15392a;
                if (cVar.isEmpty()) {
                    if (tVar.r0()) {
                        tVar.W(null, "update called with no changes. No-op", new Object[0]);
                    }
                    c1479m.i(jVar, null, c1473g);
                    return;
                }
                C1468b P7 = D.P(c1468b, c1479m.f15459n, c1473g, D.p(c1479m.f15448b));
                long j = c1479m.f15457l;
                c1479m.f15457l = 1 + j;
                n4.D d7 = c1479m.f15459n;
                d7.getClass();
                c1479m.m((List) d7.f15365g.j(new y(d7, true, c1473g, c1468b, j, P7)));
                c1479m.f15449c.f("m", c1473g.l(), map, null, new C1474h(c1479m, c1473g, j, jVar, 0));
                Iterator it = cVar.iterator();
                while (it.hasNext()) {
                    c1479m.p(c1479m.a(c1473g.m((C1473g) ((Map.Entry) it.next()).getKey()), -9));
                }
                return;
            case 14:
                C0977k c0977k = (C0977k) this.f623e;
                C1479m c1479m2 = (C1479m) c0977k.f12441b;
                C1473g c1473g2 = (C1473g) c0977k.f12442c;
                q4.j jVar2 = (q4.j) ((q4.e) this.f621c).f15858b;
                s sVar = c1479m2.f15449c;
                ArrayList l10 = c1473g2.l();
                k1.g gVar = new k1.g(c1479m2, c1473g2, (TreeMap) this.f620b, jVar2, false);
                sVar.f14983G = true;
                boolean a4 = sVar.a();
                Map map2 = (Map) this.f622d;
                if (a4) {
                    sVar.n("om", l10, map2, gVar);
                } else {
                    sVar.f14995m.add(new C1403n("om", l10, map2, gVar));
                }
                sVar.c();
                return;
            case 15:
                synchronized (k.f14055f) {
                    C1282d c1282d = (C1282d) this.f620b;
                    if (c1282d != null) {
                        k.a((k) this.f623e, c1282d);
                    }
                    try {
                        if (AbstractC1279a.b(k.f14056x)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f621c));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f621c));
                    } catch (Exception e14) {
                        Log.e("Sqflite", "error " + e14 + " while closing database " + k.f14050B);
                    }
                }
                ((p) this.f622d).success(null);
                return;
            case 16:
                C1420d c1420d = (C1420d) this.f620b;
                if (c1420d != null) {
                    C1719l1 c1719l1 = (C1719l1) this.f623e;
                    ((ViewOnKeyListenerC1421e) c1719l1.f17771a).f15098Q = true;
                    c1420d.f15080b.c(false);
                    ((ViewOnKeyListenerC1421e) c1719l1.f17771a).f15098Q = false;
                }
                m.m mVar2 = (m.m) this.f621c;
                if (mVar2.isEnabled() && mVar2.hasSubMenu()) {
                    ((m.k) this.f622d).q(mVar2, null, 4);
                    return;
                }
                return;
            case 17:
                C1501k c1501k = (C1501k) this.f622d;
                UUID uuid = (UUID) this.f620b;
                String uuid2 = uuid.toString();
                n d8 = n.d();
                String str2 = C1459n.f15334c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                C0954g c0954g = (C0954g) this.f621c;
                sb.append(c0954g);
                sb.append(")");
                d8.b(str2, sb.toString(), new Throwable[0]);
                C1459n c1459n = (C1459n) this.f623e;
                WorkDatabase workDatabase = c1459n.f15335a;
                WorkDatabase workDatabase2 = c1459n.f15335a;
                workDatabase.c();
                try {
                    l7 = workDatabase2.n().l(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (l7 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (l7.f15217b == 2) {
                    C1432g c1432g = new C1432g(uuid2, c0954g);
                    k1.g m7 = workDatabase2.m();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) m7.f14674a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((C1427b) m7.f14675b).e(c1432g);
                        workDatabase_Impl.h();
                        workDatabase_Impl.f();
                    } catch (Throwable th2) {
                        workDatabase_Impl.f();
                        throw th2;
                    }
                } else {
                    n.d().i(str2, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.", new Throwable[0]);
                }
                c1501k.i(null);
                workDatabase2.h();
                return;
            case 18:
                C1479m c1479m3 = (C1479m) this.f623e;
                n4.D d9 = c1479m3.f15459n;
                final D3.j jVar3 = (D3.j) this.f620b;
                h i7 = jVar3.i();
                d9.getClass();
                r rVar = (r) d9.f15365g.j(new CallableC0180m(2, d9, i7));
                final TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f621c;
                C1479m c1479m4 = (C1479m) jVar3.f1723b;
                C1473g c1473g3 = (C1473g) jVar3.f1725d;
                if (rVar != null) {
                    taskCompletionSource2.setResult(new C1265b(new C1269f(c1479m4, c1473g3), l.m(rVar)));
                    return;
                }
                n4.D d10 = c1479m3.f15459n;
                h i8 = jVar3.i();
                d10.getClass();
                d10.f15365g.j(new f(4, d10, i8, false));
                n4.D d11 = c1479m3.f15459n;
                d11.getClass();
                C1269f c1269f2 = new C1269f(c1479m4, c1473g3);
                l lVar = d11.f15365g.u(jVar3.i()).f16147a;
                final C1265b c1265b = new C1265b(c1269f2, lVar);
                boolean isEmpty = lVar.f17186a.isEmpty();
                C1471e c1471e = c1479m3.f15454h;
                if (!isEmpty) {
                    ((L4.b) c1471e.f15404e.f8076b).schedule(new io.sentry.cache.f(7, taskCompletionSource2, c1265b), 3000L, TimeUnit.MILLISECONDS);
                }
                s sVar2 = c1479m3.f15449c;
                ArrayList l11 = c1473g3.l();
                HashMap b7 = jVar3.i().f16173b.b();
                sVar2.getClass();
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                long j3 = sVar2.j;
                sVar2.j = 1 + j3;
                HashMap hashMap = new HashMap();
                hashMap.put("p", D.M(l11));
                hashMap.put("q", b7);
                sVar2.f14997o.put(Long.valueOf(j3), new C1404o(hashMap, new C1392c(taskCompletionSource3)));
                if (sVar2.f14991h == EnumC1402m.f14957e) {
                    sVar2.l(Long.valueOf(j3));
                }
                sVar2.c();
                Task task = taskCompletionSource3.getTask();
                L4.b bVar = (L4.b) c1471e.f15404e.f8076b;
                final C1479m c1479m5 = (C1479m) this.f622d;
                task.addOnCompleteListener(bVar, new OnCompleteListener() { // from class: n4.k
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        List list;
                        A2.c cVar2 = A2.c.this;
                        cVar2.getClass();
                        TaskCompletionSource taskCompletionSource4 = taskCompletionSource2;
                        if (taskCompletionSource4.getTask().isComplete()) {
                            return;
                        }
                        if (!task2.isSuccessful()) {
                            C1265b c1265b2 = c1265b;
                            if (!c1265b2.f13985a.f17186a.isEmpty()) {
                                taskCompletionSource4.setResult(c1265b2);
                                return;
                            }
                            Exception exception = task2.getException();
                            Objects.requireNonNull(exception);
                            taskCompletionSource4.setException(exception);
                            return;
                        }
                        v4.r a7 = AbstractC1539a.a(task2.getResult(), v4.j.f17184e);
                        D3.j jVar4 = jVar3;
                        s4.h i9 = jVar4.i();
                        C1479m c1479m6 = (C1479m) cVar2.f623e;
                        c1479m6.k(i9, true, true);
                        boolean h6 = i9.f16173b.h();
                        C1473g c1473g4 = i9.f16172a;
                        if (h6) {
                            list = c1479m6.f15459n.g(c1473g4, a7);
                        } else {
                            D d12 = c1479m6.f15459n;
                            list = (List) d12.f15365g.j(new t(d12, d12.m(i9), c1473g4, a7, 1));
                        }
                        c1479m5.m(list);
                        taskCompletionSource4.setResult(new C1265b(new C1269f((C1479m) jVar4.f1723b, (C1473g) jVar4.f1725d), new v4.l(a7, jVar4.i().f16173b.f16170g)));
                        c1479m6.k(i9, false, true);
                    }
                });
                return;
            case 19:
                IBinder binder = ((Messenger) ((C1450e) this.f620b).f15308b).getBinder();
                C1023h c1023h = (C1023h) this.f623e;
                q0.h hVar = (q0.h) ((q0.s) c1023h.f12667a).f15781e.getOrDefault(binder, null);
                String str3 = (String) this.f621c;
                if (hVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str3);
                    return;
                }
                ((q0.s) c1023h.f12667a).getClass();
                HashMap hashMap2 = hVar.f15743e;
                IBinder iBinder = (IBinder) this.f622d;
                boolean z4 = false;
                if (iBinder != null) {
                    List list = (List) hashMap2.get(str3);
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (iBinder == ((O.b) it2.next()).f4824a) {
                                it2.remove();
                                z4 = true;
                            }
                        }
                        if (list.size() == 0) {
                            hashMap2.remove(str3);
                        }
                    }
                } else if (hashMap2.remove(str3) != null) {
                    z4 = true;
                }
                if (z4) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + str3 + " which is not subscribed");
                return;
            case 20:
                IBinder binder2 = ((Messenger) ((C1450e) this.f620b).f15308b).getBinder();
                C1023h c1023h2 = (C1023h) this.f623e;
                q0.h hVar2 = (q0.h) ((q0.s) c1023h2.f12667a).f15781e.getOrDefault(binder2, null);
                String str4 = (String) this.f621c;
                if (hVar2 == null) {
                    w1.L.l("getMediaItem for callback that isn't registered id=", str4, "MBServiceCompat");
                    return;
                }
                q0.s sVar3 = (q0.s) c1023h2.f12667a;
                sVar3.getClass();
                q0.g gVar2 = new q0.g(str4, (ResultReceiver) this.f622d, 0);
                sVar3.d(str4, gVar2);
                if (!gVar2.b()) {
                    throw new IllegalStateException(w1.L.i("onLoadItem must call detach() or sendResult() before returning for id=", str4));
                }
                return;
            default:
                Context context7 = (Context) this.f620b;
                try {
                    new zzblt(context7, (String) this.f621c).zza(((z2.b) this.f622d).f18154a, (z2.d) this.f623e);
                    return;
                } catch (IllegalStateException e15) {
                    zzbtl.zza(context7).zzh(e15, "AdManagerInterstitialAd.load");
                    return;
                }
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f619a = i7;
        this.f620b = obj;
        this.f621c = obj2;
        this.f622d = obj3;
        this.f623e = obj4;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i7, boolean z4) {
        this.f619a = i7;
        this.f623e = obj;
        this.f620b = obj2;
        this.f621c = obj3;
        this.f622d = obj4;
    }
}

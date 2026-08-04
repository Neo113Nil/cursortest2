package A2;

import A2.c;
import A5.p;
import B3.g;
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
import org.json.JSONException;
import p028d6.k;
import p063i4.b;
import p063i4.f;
import p083l4.n;
import p083l4.s;
import p086m.C0927d;
import p098n4.C0929b;
import p098n4.C0932e;
import p098n4.C0934g;
import p098n4.C0935h;
import p098n4.C0940m;
import p098n4.y;
import p115p6.a;
import p134s4.h;
import p155w1.C1010l1;
import p167y2.i;
import v4.l;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f623e;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContains;
        switch (this.f619a) {
            case 0:
                Context context = (Context) this.f620b;
                try {
                    new zzazy(context, (String) this.f621c, ((i) this.f622d).f18160a, (a) this.f623e).zza();
                    return;
                } catch (IllegalStateException e7) {
                    zzbtl.zza(context).zzh(e7, "AppOpenAd.load");
                    return;
                }
            case 1:
                Context context2 = (Context) this.f620b;
                try {
                    new zzblt(context2, (String) this.f621c).zza(((i) this.f622d).f18160a, (K2.b) this.f623e);
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
                    zContains = a2.f5400a.contains(str);
                    break;
                }
                if (zContains || oVar.b()) {
                    return;
                }
                binderC0386l.zzf(new p105o3.b(oVar.f5538a), zzbycVar, null);
                return;
            case 3:
                L l7 = (L) this.f620b;
                zzdqk zzdqkVar = (zzdqk) this.f621c;
                l7.d(zzdqkVar, (ArrayDeque) this.f622d, "to");
                l7.d(zzdqkVar, (ArrayDeque) this.f623e, "of");
                return;
            case 4:
                Context context3 = (Context) this.f620b;
                try {
                    new zzbwc(context3, (String) this.f621c).zza(((p172z2.b) this.f622d).f18160a, (d) this.f623e);
                    return;
                } catch (IllegalStateException e9) {
                    zzbtl.zza(context3).zzh(e9, "RewardedAd.loadAdManager");
                    return;
                }
            case 5:
                Context context4 = (Context) this.f620b;
                try {
                    new zzbwc(context4, (String) this.f621c).zza(((i) this.f622d).f18160a, (d) this.f623e);
                    return;
                } catch (IllegalStateException e10) {
                    zzbtl.zza(context4).zzh(e10, "RewardedAd.load");
                    return;
                }
            case 6:
                Context context5 = (Context) this.f620b;
                try {
                    new zzbwn(context5, (String) this.f621c).zza(((p172z2.b) this.f622d).f18160a, (T2.b) this.f623e);
                    return;
                } catch (IllegalStateException e11) {
                    zzbtl.zza(context5).zzh(e11, "RewardedInterstitialAdManager.load");
                    return;
                }
            case 7:
                Context context6 = (Context) this.f620b;
                try {
                    new zzbwn(context6, (String) this.f621c).zza(((i) this.f622d).f18160a, (T2.b) this.f623e);
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
                F0 f7 = (F0) this.f623e;
                f7.f6801z = true;
                f7.f6796u.F((l0) this.f620b, (EnumC0543u) this.f621c, (b0) this.f622d);
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
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 12:
                m mVar = (m) this.f620b;
                T4.a aVar = new T4.a(mVar.b(), mVar.f12045b.f12012a, 1);
                ((e) this.f623e).b(aVar, true);
                boolean zL = aVar.l();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f621c;
                if (zL) {
                    try {
                        this.f622d = new g(aVar.i(), mVar).d();
                    } catch (JSONException e13) {
                        Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + aVar.f6358f, e13);
                        taskCompletionSource.setException(com.google.firebase.storage.i.b(e13, 0));
                        return;
                    }
                    break;
                }
                if (taskCompletionSource != null) {
                    aVar.a(taskCompletionSource, (j) this.f622d);
                    return;
                }
                return;
            case 13:
                f fVar = (f) this.f623e;
                C0940m c0940m = (C0940m) fVar.f1723b;
                p120q4.j jVar = (p120q4.j) ((p120q4.e) this.f621c).f15864b;
                t tVar = c0940m.f15461i;
                boolean zR0 = tVar.r0();
                C0934g c0934g = (C0934g) fVar.f1725d;
                if (zR0) {
                    tVar.W(null, "update: " + c0934g, new Object[0]);
                }
                t tVar2 = c0940m.f15462k;
                boolean zR1 = tVar2.r0();
                Map map = (Map) this.f622d;
                if (zR1) {
                    tVar2.W(null, "update: " + c0934g + " " + map, new Object[0]);
                }
                C0929b c0929b = (C0929b) this.f620b;
                p120q4.c cVar = c0929b.f15398a;
                if (cVar.isEmpty()) {
                    if (tVar.r0()) {
                        tVar.W(null, "update called with no changes. No-op", new Object[0]);
                    }
                    c0940m.i(jVar, null, c0934g);
                    return;
                }
                C0929b c0929bP = D.P(c0929b, c0940m.f15465n, c0934g, D.p(c0940m.f15454b));
                long j = c0940m.f15463l;
                c0940m.f15463l = 1 + j;
                p098n4.D d7 = c0940m.f15465n;
                d7.getClass();
                c0940m.m((List) d7.f15371g.j(new y(d7, true, c0934g, c0929b, j, c0929bP)));
                c0940m.f15455c.f("m", c0934g.l(), map, null, new C0935h(c0940m, c0934g, j, jVar, 0));
                Iterator it = cVar.iterator();
                while (it.hasNext()) {
                    c0940m.p(c0940m.a(c0934g.m((C0934g) ((Map.Entry) it.next()).getKey()), -9));
                }
                return;
            case 14:
                k kVar = (k) this.f623e;
                C0940m c0940m2 = (C0940m) kVar.f12447b;
                C0934g c0934g2 = (C0934g) kVar.f12448c;
                p120q4.j jVar2 = (p120q4.j) ((p120q4.e) this.f621c).f15864b;
                s sVar = c0940m2.f15455c;
                ArrayList arrayListL = c0934g2.l();
                p072k1.g gVar = new p072k1.g(c0940m2, c0934g2, (TreeMap) this.f620b, jVar2, false);
                sVar.f14989G = true;
                boolean zA = sVar.a();
                Map map2 = (Map) this.f622d;
                if (zA) {
                    sVar.n("om", arrayListL, map2, gVar);
                } else {
                    sVar.f15001m.add(new n("om", arrayListL, map2, gVar));
                }
                sVar.c();
                return;
            case 15:
                synchronized (p064i5.k.f14061f) {
                    p064i5.d dVar = (p064i5.d) this.f620b;
                    if (dVar != null) {
                        p064i5.k.a((p064i5.k) this.f623e, dVar);
                    }
                    try {
                        if (p064i5.a.b(p064i5.k.f14062x)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f621c));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f621c));
                    } catch (Exception e14) {
                        Log.e("Sqflite", "error " + e14 + " while closing database " + p064i5.k.f14056B);
                    }
                    break;
                }
                ((p) this.f622d).success(null);
                return;
            case 16:
                C0927d c0927d = (C0927d) this.f620b;
                if (c0927d != null) {
                    C1010l1 c1010l1 = (C1010l1) this.f623e;
                    ((p086m.e) c1010l1.f17777a).f15104Q = true;
                    c0927d.f15086b.c(false);
                    ((p086m.e) c1010l1.f17777a).f15104Q = false;
                }
                p086m.m mVar2 = (p086m.m) this.f621c;
                if (mVar2.isEnabled() && mVar2.hasSubMenu()) {
                    ((p086m.k) this.f622d).q(mVar2, null, 4);
                    return;
                }
                return;
            case 17:
                p103o1.k kVar2 = (p103o1.k) this.f622d;
                UUID uuid = (UUID) this.f620b;
                String string = uuid.toString();
                p023d1.n nVarD = p023d1.n.d();
                String str2 = p096n1.n.f15340c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                p023d1.g gVar2 = (p023d1.g) this.f621c;
                sb.append(gVar2);
                sb.append(")");
                nVarD.b(str2, sb.toString(), new Throwable[0]);
                p096n1.n nVar = (p096n1.n) this.f623e;
                WorkDatabase workDatabase = nVar.f15341a;
                WorkDatabase workDatabase2 = nVar.f15341a;
                workDatabase.c();
                try {
                    p088m1.i iVarL = workDatabase2.n().l(string);
                    if (iVarL == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (iVarL.f15223b == 2) {
                        p088m1.g gVar3 = new p088m1.g(string, gVar2);
                        p072k1.g gVarM = workDatabase2.m();
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) gVarM.f14680a;
                        workDatabase_Impl.b();
                        workDatabase_Impl.c();
                        try {
                            ((p088m1.b) gVarM.f14681b).e(gVar3);
                            workDatabase_Impl.h();
                            workDatabase_Impl.f();
                        } catch (Throwable th3) {
                            workDatabase_Impl.f();
                            throw th3;
                        }
                    } else {
                        p023d1.n.d().i(str2, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.", new Throwable[0]);
                    }
                    kVar2.i(null);
                    workDatabase2.h();
                } catch (Throwable th4) {
                    try {
                        p023d1.n.d().c(p096n1.n.f15340c, "Error updating Worker progress", th4);
                        kVar2.j(th4);
                    } finally {
                        workDatabase2.f();
                    }
                    break;
                }
                return;
            case 18:
                C0940m c0940m3 = (C0940m) this.f623e;
                p098n4.D d8 = c0940m3.f15465n;
                final D3.j jVar3 = (D3.j) this.f620b;
                h hVarI = jVar3.i();
                d8.getClass();
                r rVar = (r) d8.f15371g.j(new CallableC0180m(2, d8, hVarI));
                final TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f621c;
                C0940m c0940m4 = (C0940m) jVar3.f1723b;
                C0934g c0934g3 = (C0934g) jVar3.f1725d;
                if (rVar != null) {
                    taskCompletionSource2.setResult(new p063i4.b(new f(c0940m4, c0934g3), l.m(rVar)));
                    return;
                }
                p098n4.D d9 = c0940m3.f15465n;
                h hVarI2 = jVar3.i();
                d9.getClass();
                d9.f15371g.j(new E2.f(4, d9, hVarI2, false));
                p098n4.D d10 = c0940m3.f15465n;
                d10.getClass();
                f fVar2 = new f(c0940m4, c0934g3);
                l lVar = d10.f15371g.u(jVar3.i()).f16153a;
                final p063i4.b bVar = new p063i4.b(fVar2, lVar);
                boolean zIsEmpty = lVar.f17192a.isEmpty();
                C0932e c0932e = c0940m3.f15460h;
                if (!zIsEmpty) {
                    ((L4.b) c0932e.f15410e.f8076b).schedule(new io.sentry.cache.f(7, taskCompletionSource2, bVar), 3000L, TimeUnit.MILLISECONDS);
                }
                s sVar2 = c0940m3.f15455c;
                ArrayList arrayListL2 = c0934g3.l();
                HashMap mapB = jVar3.i().f16179b.b();
                sVar2.getClass();
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                long j3 = sVar2.j;
                sVar2.j = 1 + j3;
                HashMap map3 = new HashMap();
                map3.put("p", D.M(arrayListL2));
                map3.put("q", mapB);
                sVar2.f15003o.put(Long.valueOf(j3), new p083l4.o(map3, new p083l4.c(taskCompletionSource3)));
                if (sVar2.f14997h == p083l4.m.f14963e) {
                    sVar2.l(Long.valueOf(j3));
                }
                sVar2.c();
                Task task = taskCompletionSource3.getTask();
                L4.b bVar2 = (L4.b) c0932e.f15410e.f8076b;
                final C0940m c0940m5 = (C0940m) this.f622d;
                task.addOnCompleteListener(bVar2, new OnCompleteListener() { // from class: n4.k
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        List listG;
                        c cVar2 = this.f15436a;
                        cVar2.getClass();
                        TaskCompletionSource taskCompletionSource4 = taskCompletionSource2;
                        if (taskCompletionSource4.getTask().isComplete()) {
                            return;
                        }
                        if (!task2.isSuccessful()) {
                            b bVar3 = bVar;
                            if (!bVar3.f13991a.f17192a.isEmpty()) {
                                taskCompletionSource4.setResult(bVar3);
                                return;
                            }
                            Exception exception = task2.getException();
                            Objects.requireNonNull(exception);
                            taskCompletionSource4.setException(exception);
                            return;
                        }
                        r rVarA = a.a(task2.getResult(), v4.j.f17190e);
                        D3.j jVar4 = jVar3;
                        h hVarI3 = jVar4.i();
                        C0940m c0940m6 = (C0940m) cVar2.f623e;
                        c0940m6.k(hVarI3, true, true);
                        boolean zH = hVarI3.f16179b.h();
                        C0934g c0934g4 = hVarI3.f16178a;
                        if (zH) {
                            listG = c0940m6.f15465n.g(c0934g4, rVarA);
                        } else {
                            D d11 = c0940m6.f15465n;
                            listG = (List) d11.f15371g.j(new t(d11, d11.m(hVarI3), c0934g4, rVarA, 1));
                        }
                        c0940m5.m(listG);
                        taskCompletionSource4.setResult(new b(new f((C0940m) jVar4.f1723b, (C0934g) jVar4.f1725d), new l(rVarA, jVar4.i().f16179b.f16176g)));
                        c0940m6.k(hVarI3, false, true);
                    }
                });
                return;
            case 19:
                IBinder binder = ((Messenger) ((p096n1.e) this.f620b).f15314b).getBinder();
                p033e3.h hVar = (p033e3.h) this.f623e;
                p117q0.h hVar2 = (p117q0.h) ((p117q0.s) hVar.f12673a).f15787e.getOrDefault(binder, null);
                String str3 = (String) this.f621c;
                if (hVar2 == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str3);
                    return;
                }
                ((p117q0.s) hVar.f12673a).getClass();
                HashMap map4 = hVar2.f15749e;
                IBinder iBinder = (IBinder) this.f622d;
                boolean z4 = false;
                if (iBinder != null) {
                    List list = (List) map4.get(str3);
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (iBinder == ((O.b) it2.next()).f4824a) {
                                it2.remove();
                                z4 = true;
                            }
                        }
                        if (list.size() == 0) {
                            map4.remove(str3);
                        }
                    }
                } else if (map4.remove(str3) != null) {
                    z4 = true;
                }
                if (z4) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + str3 + " which is not subscribed");
                return;
            case 20:
                IBinder binder2 = ((Messenger) ((p096n1.e) this.f620b).f15314b).getBinder();
                p033e3.h hVar3 = (p033e3.h) this.f623e;
                p117q0.h hVar4 = (p117q0.h) ((p117q0.s) hVar3.f12673a).f15787e.getOrDefault(binder2, null);
                String str4 = (String) this.f621c;
                if (hVar4 == null) {
                    p155w1.L.l("getMediaItem for callback that isn't registered id=", str4, "MBServiceCompat");
                    return;
                }
                p117q0.s sVar3 = (p117q0.s) hVar3.f12673a;
                sVar3.getClass();
                p117q0.g gVar4 = new p117q0.g(str4, (ResultReceiver) this.f622d, 0);
                sVar3.d(str4, gVar4);
                if (!gVar4.b()) {
                    throw new IllegalStateException(p155w1.L.i("onLoadItem must call detach() or sendResult() before returning for id=", str4));
                }
                return;
            default:
                Context context7 = (Context) this.f620b;
                try {
                    new zzblt(context7, (String) this.f621c).zza(((p172z2.b) this.f622d).f18160a, (p172z2.d) this.f623e);
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

package E4;

import G4.C0274g;
import G4.C0279l;
import G4.C0292z;
import G4.InterfaceC0268a;
import Y4.I0;
import b4.C0784d;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.Timestamp;
import g4.C1144q;
import g4.C1145r;
import g4.InterfaceC1131d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements L4.o, L4.p, InterfaceC1131d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2227c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2228d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f2225a = obj;
        this.f2226b = obj2;
        this.f2227c = obj3;
        this.f2228d = obj4;
    }

    @Override // L4.o
    public void a(Object obj) {
        C4.e eVar = (C4.e) obj;
        t tVar = (t) this.f2225a;
        tVar.getClass();
        if (!((AtomicBoolean) this.f2226b).compareAndSet(false, true)) {
            ((L4.f) this.f2228d).a(new A0.f(7, tVar, eVar));
        } else {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2227c;
            p3.f.O("Already fulfilled first user task", !taskCompletionSource.getTask().isComplete(), new Object[0]);
            taskCompletionSource.setResult(eVar);
        }
    }

    @Override // g4.InterfaceC1131d
    public Object e(C1145r c1145r) {
        return new C0784d((Y3.i) c1145r.a(Y3.i.class), c1145r.d(M4.f.class), (Executor) c1145r.f((C1144q) this.f2225a), (Executor) c1145r.f((C1144q) this.f2226b), (Executor) c1145r.f((C1144q) this.f2227c), (ScheduledExecutorService) c1145r.f((C1144q) this.f2228d));
    }

    @Override // L4.p
    public Object get() {
        C0279l c0279l = (C0279l) this.f2225a;
        HashMap n2 = c0279l.f2995e.n((HashSet) this.f2226b);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : n2.entrySet()) {
            if (t.e.b(((H4.k) entry.getValue()).f3324b, 1)) {
                hashSet.add((H4.h) entry.getKey());
            }
        }
        k1.g gVar = c0279l.f2996f;
        gVar.getClass();
        HashMap hashMap = new HashMap();
        gVar.L(hashMap, n2.keySet());
        HashMap n7 = gVar.n(n2, hashMap, new HashSet());
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f2227c;
        Iterator it = list.iterator();
        while (true) {
            H4.l lVar = null;
            if (!it.hasNext()) {
                break;
            }
            I4.h hVar = (I4.h) it.next();
            H4.k kVar = ((C0292z) n7.get(hVar.f3670a)).f3044a;
            for (I4.g gVar2 : hVar.f3672c) {
                I0 b7 = gVar2.f3669b.b(kVar.f3327e.f(gVar2.f3668a));
                if (b7 != null) {
                    if (lVar == null) {
                        lVar = new H4.l();
                    }
                    lVar.g(gVar2.f3668a, b7);
                }
            }
            if (lVar != null) {
                arrayList.add(new I4.m(hVar.f3670a, lVar, H4.l.c(lVar.b().N()), I4.n.a(true)));
            }
        }
        I4.i d7 = c0279l.f2993c.d((Timestamp) this.f2228d, arrayList, list);
        HashMap hashMap2 = new HashMap();
        Iterator it2 = d7.b().iterator();
        while (it2.hasNext()) {
            H4.h hVar2 = (H4.h) it2.next();
            H4.k kVar2 = ((C0292z) n7.get(hVar2)).f3044a;
            I4.f a2 = d7.a(kVar2, ((C0292z) n7.get(hVar2)).f3045b);
            if (hashSet.contains(hVar2)) {
                a2 = null;
            }
            I4.h c3 = I4.h.c(kVar2, a2);
            if (c3 != null) {
                hashMap2.put(hVar2, c3);
            }
            if (t.e.b(kVar2.f3324b, 1)) {
                kVar2.b(H4.n.f3332b);
            }
        }
        InterfaceC0268a interfaceC0268a = c0279l.f2994d;
        int i7 = d7.f3673a;
        interfaceC0268a.b(i7, hashMap2);
        return C0274g.a(i7, n7);
    }
}

package B4;

import G4.C0279l;
import android.util.SparseArray;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0909j;
import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import io.sentry.flutter.SentryFlutterPlugin;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import k4.AbstractC1341c;
import k4.C1343e;
import w1.V0;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements L4.n, L4.p, Scope.IWithTransaction, ScopeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1076c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1077d;

    public /* synthetic */ E(Object obj, Object obj2, Object obj3, int i7) {
        this.f1074a = i7;
        this.f1075b = obj;
        this.f1076c = obj2;
        this.f1077d = obj3;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((SentryGestureListener) this.f1075b).lambda$applyScope$3((IScope) this.f1076c, (ITransaction) this.f1077d, iTransaction);
    }

    @Override // L4.n
    public Object apply(Object obj) {
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f1075b;
        firebaseFirestore.getClass();
        return Tasks.call((ThreadPoolExecutor) this.f1076c, new G(firebaseFirestore, (B1.c) this.f1077d, (E4.J) obj, 0));
    }

    @Override // L4.p
    public Object get() {
        C0279l c0279l;
        long j;
        Iterator it;
        switch (this.f1074a) {
            case 1:
                C0279l c0279l2 = (C0279l) this.f1075b;
                I4.j jVar = (I4.j) this.f1076c;
                P6.b bVar = c0279l2.f2991a;
                long l7 = bVar.r().l();
                Iterator it2 = ((Map) jVar.f3678b).entrySet().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    G4.Y y4 = c0279l2.f2999i;
                    if (!hasNext) {
                        C0279l c0279l3 = c0279l2;
                        Map map = (Map) jVar.f3681e;
                        for (H4.h hVar : map.keySet()) {
                            if (((Set) jVar.f3682f).contains(hVar)) {
                                bVar.r().x(hVar);
                            }
                        }
                        V0 d7 = c0279l3.d(map);
                        H4.n g3 = y4.g();
                        H4.n nVar = H4.n.f3332b;
                        H4.n nVar2 = (H4.n) this.f1077d;
                        if (!nVar2.equals(nVar)) {
                            p3.f.O("Watch stream reverted to previous snapshot?? (%s < %s)", nVar2.compareTo(g3) >= 0, nVar2, g3);
                            y4.h(nVar2);
                        }
                        return c0279l3.f2996f.F((HashMap) d7.f17562b, (HashSet) d7.f17563c);
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    Integer num = (Integer) entry.getKey();
                    int intValue = num.intValue();
                    K4.z zVar = (K4.z) entry.getValue();
                    SparseArray sparseArray = c0279l2.f3000k;
                    G4.Z z4 = (G4.Z) sparseArray.get(intValue);
                    if (z4 != null) {
                        y4.d(zVar.f4083e, intValue);
                        y4.a(zVar.f4081c, intValue);
                        G4.Z b7 = z4.b(l7);
                        if (((Map) jVar.f3680d).containsKey(num)) {
                            C0909j c0909j = AbstractC0911k.f12212b;
                            H4.n nVar3 = H4.n.f3332b;
                            G4.Z a2 = b7.a(c0909j, nVar3);
                            j = l7;
                            it = it2;
                            c0279l = c0279l2;
                            b7 = new G4.Z(a2.f2953a, a2.f2954b, a2.f2955c, a2.f2956d, a2.f2957e, nVar3, a2.f2959g, null);
                        } else {
                            c0279l = c0279l2;
                            j = l7;
                            it = it2;
                            AbstractC0911k abstractC0911k = zVar.f4079a;
                            if (!abstractC0911k.isEmpty()) {
                                b7 = b7.a(abstractC0911k, (H4.n) jVar.f3679c);
                            }
                        }
                        sparseArray.put(intValue, b7);
                        if (C0279l.e(z4, b7, zVar)) {
                            y4.c(b7);
                        }
                        l7 = j;
                        it2 = it;
                        c0279l2 = c0279l;
                    }
                }
            default:
                C0279l c0279l4 = (C0279l) this.f1075b;
                C1343e c1343e = H4.h.f3317c;
                HashMap hashMap = new HashMap();
                for (Map.Entry entry2 : (AbstractC1341c) this.f1076c) {
                    H4.h hVar2 = (H4.h) entry2.getKey();
                    H4.k kVar = (H4.k) entry2.getValue();
                    if (kVar.d()) {
                        c1343e = c1343e.l(hVar2);
                    }
                    hashMap.put(hVar2, kVar);
                }
                G4.Z z7 = (G4.Z) this.f1077d;
                int i7 = z7.f2954b;
                G4.Y y5 = c0279l4.f2999i;
                y5.i(i7);
                y5.a(c1343e, z7.f2954b);
                V0 d8 = c0279l4.d(hashMap);
                return c0279l4.f2996f.F((HashMap) d8.f17562b, (HashSet) d8.f17563c);
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        SentryFlutterPlugin.setContexts$lambda$5((String) this.f1075b, this.f1076c, (A5.r) this.f1077d, iScope);
    }
}

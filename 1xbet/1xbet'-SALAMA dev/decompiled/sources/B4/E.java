package B4;

import G4.C0279l;
import android.util.SparseArray;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0865j;
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
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class E implements L4.n, L4.p, Scope.IWithTransaction, ScopeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
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
                long jL = bVar.r().l();
                Iterator it2 = ((Map) jVar.f3678b).entrySet().iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    G4.Y y4 = c0279l2.f2999i;
                    if (!zHasNext) {
                        C0279l c0279l3 = c0279l2;
                        Map map = (Map) jVar.f3681e;
                        for (H4.h hVar : map.keySet()) {
                            if (((Set) jVar.f3682f).contains(hVar)) {
                                bVar.r().x(hVar);
                            }
                        }
                        V0 v0D = c0279l3.d(map);
                        H4.n nVarG = y4.g();
                        H4.n nVar = H4.n.f3332b;
                        H4.n nVar2 = (H4.n) this.f1077d;
                        if (!nVar2.equals(nVar)) {
                            p113p3.f.O("Watch stream reverted to previous snapshot?? (%s < %s)", nVar2.compareTo(nVarG) >= 0, nVar2, nVarG);
                            y4.h(nVar2);
                        }
                        return c0279l3.f2996f.F((HashMap) v0D.f17568b, (HashSet) v0D.f17569c);
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    Integer num = (Integer) entry.getKey();
                    int iIntValue = num.intValue();
                    K4.z zVar = (K4.z) entry.getValue();
                    SparseArray sparseArray = c0279l2.f3000k;
                    G4.Z z4 = (G4.Z) sparseArray.get(iIntValue);
                    if (z4 != null) {
                        y4.d(zVar.f4083e, iIntValue);
                        y4.a(zVar.f4081c, iIntValue);
                        G4.Z zB = z4.b(jL);
                        if (((Map) jVar.f3680d).containsKey(num)) {
                            C0865j c0865j = AbstractC0867k.f12212b;
                            H4.n nVar3 = H4.n.f3332b;
                            G4.Z zA = zB.a(c0865j, nVar3);
                            j = jL;
                            it = it2;
                            c0279l = c0279l2;
                            zB = new G4.Z(zA.f2953a, zA.f2954b, zA.f2955c, zA.f2956d, zA.f2957e, nVar3, zA.f2959g, null);
                        } else {
                            c0279l = c0279l2;
                            j = jL;
                            it = it2;
                            AbstractC0867k abstractC0867k = zVar.f4079a;
                            if (!abstractC0867k.isEmpty()) {
                                zB = zB.a(abstractC0867k, (H4.n) jVar.f3679c);
                            }
                        }
                        sparseArray.put(iIntValue, zB);
                        if (C0279l.e(z4, zB, zVar)) {
                            y4.c(zB);
                        }
                        jL = j;
                        it2 = it;
                        c0279l2 = c0279l;
                    }
                }
                break;
            default:
                C0279l c0279l4 = (C0279l) this.f1075b;
                p075k4.e eVarL = H4.h.f3317c;
                HashMap map2 = new HashMap();
                for (Map.Entry entry2 : (p075k4.c) this.f1076c) {
                    H4.h hVar2 = (H4.h) entry2.getKey();
                    H4.k kVar = (H4.k) entry2.getValue();
                    if (kVar.d()) {
                        eVarL = eVarL.l(hVar2);
                    }
                    map2.put(hVar2, kVar);
                }
                G4.Z z7 = (G4.Z) this.f1077d;
                int i7 = z7.f2954b;
                G4.Y y5 = c0279l4.f2999i;
                y5.i(i7);
                y5.a(eVarL, z7.f2954b);
                V0 v0D2 = c0279l4.d(map2);
                return c0279l4.f2996f.F((HashMap) v0D2.f17568b, (HashSet) v0D2.f17569c);
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        SentryFlutterPlugin.setContexts$lambda$5((String) this.f1075b, this.f1076c, (A5.r) this.f1077d, iScope);
    }
}

package B4;

import A1.K0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class G implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1083d;

    public /* synthetic */ G(Object obj, Object obj2, Object obj3, int i7) {
        this.f1080a = i7;
        this.f1081b = obj;
        this.f1082c = obj2;
        this.f1083d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        e0 e0VarA;
        H4.h hVar;
        switch (this.f1080a) {
            case 0:
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f1081b;
                firebaseFirestore.getClass();
                h0 h0Var = new h0((E4.J) this.f1083d, firebaseFirestore);
                B1.c cVar = (B1.c) this.f1082c;
                I5.e eVar = (I5.e) cVar.f978b;
                B1.c cVar2 = eVar.f3708a;
                ((H5.e) cVar2.f978b).f3365d.put((String) cVar2.f979c, h0Var);
                HashMap map = new HashMap();
                FirebaseFirestore firebaseFirestore2 = eVar.f3709b;
                Y3.i iVar = firebaseFirestore2.f11968g;
                iVar.b();
                map.put("appName", iVar.f7664b);
                eVar.f3715y.post(new I5.d((A5.h) cVar.f979c, map, 1));
                try {
                    if (!eVar.f3712e.tryAcquire(eVar.f3710c.longValue(), TimeUnit.MILLISECONDS)) {
                        return new H5.f(new I("timed out", H.DEADLINE_EXCEEDED));
                    }
                    if (eVar.f3714x.isEmpty()) {
                        return new H5.f();
                    }
                    if (eVar.f3713f == 2) {
                        return new H5.f();
                    }
                    for (H5.w wVar : eVar.f3714x) {
                        C0070n c0070nD = firebaseFirestore2.d(wVar.f3420b);
                        int iE = p136t.e.e(wVar.f3419a);
                        E4.J j = h0Var.f1160a;
                        FirebaseFirestore firebaseFirestore3 = h0Var.f1161b;
                        H4.h hVar2 = c0070nD.f1179a;
                        if (iE == 1) {
                            Map map2 = wVar.f3421c;
                            Objects.requireNonNull(map2);
                            android.support.v4.media.session.t tVarP = firebaseFirestore3.f11969h.p(map2);
                            firebaseFirestore3.k(c0070nD);
                            j.getClass();
                            try {
                                hVar = hVar2;
                                try {
                                    List listSingletonList = Collections.singletonList(new I4.m(hVar2, (H4.l) tVarP.f8076b, (I4.f) tVarP.f8077c, j.b(hVar2), (List) tVarP.f8078d));
                                    p113p3.f.O("A transaction object cannot be used after its update callback has been invoked.", !j.f2135d, new Object[0]);
                                    j.f2134c.addAll(listSingletonList);
                                } catch (I e7) {
                                    e = e7;
                                    j.f2136e = e;
                                }
                            } catch (I e8) {
                                e = e8;
                                hVar = hVar2;
                            }
                            j.f2137f.add(hVar);
                            break;
                        } else if (iE == 2) {
                            H5.p pVar = wVar.f3422d;
                            Objects.requireNonNull(pVar);
                            Boolean bool = pVar.f3393a;
                            if (bool == null || !bool.booleanValue()) {
                                List list = pVar.f3394b;
                                e0VarA = list != null ? e0.a(p003a.a.h0(list)) : null;
                            } else {
                                e0VarA = e0.f1152d;
                            }
                            Map map3 = wVar.f3421c;
                            Objects.requireNonNull(map3);
                            Map map4 = map3;
                            if (e0VarA == null) {
                                h0Var.c(c0070nD, map4, e0.f1151c);
                            } else {
                                h0Var.c(c0070nD, map4, e0VarA);
                            }
                        } else if (iE == 3) {
                            firebaseFirestore3.k(c0070nD);
                            List listSingletonList2 = Collections.singletonList(new I4.e(hVar2, j.a(hVar2)));
                            p113p3.f.O("A transaction object cannot be used after its update callback has been invoked.", !j.f2135d, new Object[0]);
                            j.f2134c.addAll(listSingletonList2);
                            j.f2137f.add(hVar2);
                        }
                    }
                    return new H5.f();
                } catch (InterruptedException unused) {
                    return new H5.f(new I("interrupted", H.DEADLINE_EXCEEDED));
                }
            case 1:
                E4.t tVar = (E4.t) this.f1081b;
                E4.H h6 = tVar.f2237i;
                h6.getClass();
                E4.L l7 = new E4.L();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                l7.f2146f = taskCompletionSource;
                L4.f fVar = tVar.f2232d;
                l7.f2142b = fVar;
                l7.f2143c = h6.f2112b;
                l7.f2144d = (E) this.f1083d;
                l7.f2141a = ((i0) this.f1082c).f1166a;
                L4.m mVar = new L4.m(fVar, L4.e.f4357y, 1000L, 60000L);
                l7.f2145e = mVar;
                l7.f2141a--;
                mVar.a(new K0(l7, 2));
                return taskCompletionSource.getTask();
            default:
                p056h4.f fVar2 = (p056h4.f) this.f1081b;
                fVar2.getClass();
                return fVar2.f13558a.submit(new K5.a(14, (Callable) this.f1082c, (C1010l1) this.f1083d));
        }
    }
}

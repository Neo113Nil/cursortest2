package A0;

import B4.K;
import B4.T;
import B4.W;
import E4.RunnableC0179l;
import E4.t;
import E5.r;
import K4.AbstractC0315b;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0847a;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArraySet;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18d;

    public /* synthetic */ a(Object obj, int i7, Object obj2, int i8) {
        this.f15a = i8;
        this.f17c = obj;
        this.f16b = i7;
        this.f18d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15a) {
            case 0:
                ((d) ((b) this.f17c).f22d).c(this.f16b, (Serializable) this.f18d);
                return;
            case 1:
                H5.m mVar = (H5.m) this.f17c;
                int i7 = this.f16b;
                r rVar = (r) this.f18d;
                FirebaseFirestore firebaseFirestoreA = H5.e.a(mVar);
                C1017n0 c1017n0 = firebaseFirestoreA.f11971k;
                c1017n0.k();
                if (firebaseFirestoreA.f11973m == null) {
                    K k7 = firebaseFirestoreA.j;
                    T t7 = k7.f1109e;
                    if ((t7 != null ? t7 instanceof W : k7.f1107c) || (t7 instanceof W)) {
                        p096n1.e eVar = new p096n1.e(1);
                        eVar.f15314b = c1017n0;
                        firebaseFirestoreA.f11973m = eVar;
                    }
                }
                p096n1.e eVar2 = firebaseFirestoreA.f11973m;
                if (eVar2 != null) {
                    int iE = p136t.e.e(i7);
                    if (iE == 0) {
                        C1017n0 c1017n1 = (C1017n0) eVar2.f15314b;
                        synchronized (c1017n1) {
                            c1017n1.k();
                            ((t) c1017n1.f17812c).c(true);
                        }
                    } else if (iE == 1) {
                        C1017n0 c1017n2 = (C1017n0) eVar2.f15314b;
                        synchronized (c1017n2) {
                            c1017n2.k();
                            ((t) c1017n2.f17812c).c(false);
                        }
                    } else if (iE == 2) {
                        C1017n0 c1017n3 = (C1017n0) eVar2.f15314b;
                        synchronized (c1017n3) {
                            c1017n3.k();
                            t tVar = (t) c1017n3.f17812c;
                            tVar.e();
                            tVar.f2232d.a(new RunnableC0179l(tVar, 3));
                        }
                    }
                } else {
                    Log.d("FlutterFirestorePlugin", "`PersistentCacheIndexManager` is not available.");
                }
                rVar.success(null);
                return;
            case 2:
                B1.m mVar2 = (B1.m) this.f17c;
                boolean zE = Q0.a.E();
                int i8 = this.f16b;
                AbstractC0847a abstractC0847a = (AbstractC0847a) this.f18d;
                AbstractC0315b abstractC0315b = (AbstractC0315b) mVar2.f1016d;
                if (zE) {
                    Q0.a.v(1, abstractC0315b.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(abstractC0315b)), Integer.valueOf(i8), abstractC0847a);
                }
                if (i8 == 1) {
                    abstractC0315b.e(abstractC0847a);
                    return;
                } else {
                    abstractC0315b.f(abstractC0847a);
                    return;
                }
            case 3:
                ((p109p.r) this.f17c).onGreatestScrollPercentageIncreased(this.f16b, (Bundle) this.f18d);
                return;
            default:
                for (p151v2.g gVar : (CopyOnWriteArraySet) this.f17c) {
                    if (!gVar.f17114d) {
                        int i9 = this.f16b;
                        if (i9 != -1) {
                            gVar.f17112b.c(i9);
                        }
                        gVar.f17113c = true;
                        ((p151v2.e) this.f18d).invoke(gVar.f17111a);
                    }
                }
                return;
        }
    }
}

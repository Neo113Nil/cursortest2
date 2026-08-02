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
import com.google.protobuf.AbstractC0891a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import n1.C1450e;
import p.InterfaceC1531r;
import w1.C1726n0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17c;

    /* renamed from: d, reason: collision with root package name */
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
                FirebaseFirestore a2 = H5.e.a(mVar);
                C1726n0 c1726n0 = a2.f11971k;
                c1726n0.k();
                if (a2.f11973m == null) {
                    K k7 = a2.j;
                    T t7 = k7.f1109e;
                    if ((t7 != null ? t7 instanceof W : k7.f1107c) || (t7 instanceof W)) {
                        C1450e c1450e = new C1450e(1);
                        c1450e.f15308b = c1726n0;
                        a2.f11973m = c1450e;
                    }
                }
                C1450e c1450e2 = a2.f11973m;
                if (c1450e2 != null) {
                    int e7 = t.e.e(i7);
                    if (e7 == 0) {
                        C1726n0 c1726n02 = (C1726n0) c1450e2.f15308b;
                        synchronized (c1726n02) {
                            c1726n02.k();
                            ((t) c1726n02.f17806c).c(true);
                        }
                    } else if (e7 == 1) {
                        C1726n0 c1726n03 = (C1726n0) c1450e2.f15308b;
                        synchronized (c1726n03) {
                            c1726n03.k();
                            ((t) c1726n03.f17806c).c(false);
                        }
                    } else if (e7 == 2) {
                        C1726n0 c1726n04 = (C1726n0) c1450e2.f15308b;
                        synchronized (c1726n04) {
                            c1726n04.k();
                            t tVar = (t) c1726n04.f17806c;
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
                boolean E7 = Q0.a.E();
                int i8 = this.f16b;
                AbstractC0891a abstractC0891a = (AbstractC0891a) this.f18d;
                AbstractC0315b abstractC0315b = (AbstractC0315b) mVar2.f1016d;
                if (E7) {
                    Q0.a.v(1, abstractC0315b.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(abstractC0315b)), Integer.valueOf(i8), abstractC0891a);
                }
                if (i8 == 1) {
                    abstractC0315b.e(abstractC0891a);
                    return;
                } else {
                    abstractC0315b.f(abstractC0891a);
                    return;
                }
            case 3:
                ((InterfaceC1531r) this.f17c).onGreatestScrollPercentageIncreased(this.f16b, (Bundle) this.f18d);
                return;
            default:
                Iterator it = ((CopyOnWriteArraySet) this.f17c).iterator();
                while (it.hasNext()) {
                    v2.g gVar = (v2.g) it.next();
                    if (!gVar.f17108d) {
                        int i9 = this.f16b;
                        if (i9 != -1) {
                            gVar.f17106b.c(i9);
                        }
                        gVar.f17107c = true;
                        ((v2.e) this.f18d).invoke(gVar.f17105a);
                    }
                }
                return;
        }
    }
}

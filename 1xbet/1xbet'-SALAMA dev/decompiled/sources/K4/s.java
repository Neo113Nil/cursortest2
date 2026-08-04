package K4;

import A1.W;
import E4.RunnableC0179l;
import F2.C0247p;
import U5.AbstractC0438e;
import U5.C0436c;
import U5.C0437d;
import U5.C0443j;
import U5.Q;
import U5.S;
import U5.T;
import U5.U;
import U5.V;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4060b;

    public /* synthetic */ s(Object obj, int i7) {
        this.f4059a = i7;
        this.f4060b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        V v6;
        List list;
        int i7 = 0;
        switch (this.f4059a) {
            case 0:
                C0247p c0247p = (C0247p) this.f4060b;
                Context context = (Context) c0247p.f2710e;
                D3.j jVar = (D3.j) c0247p.f2711f;
                try {
                    p163x3.a.a(context);
                    break;
                } catch (com.google.android.gms.common.e | com.google.android.gms.common.f | IllegalStateException e7) {
                    Q0.a.v(2, "GrpcCallProvider", "Failed to update ssl context: %s", e7);
                }
                String str = (String) jVar.f1726e;
                Logger logger = V.f6443c;
                synchronized (V.class) {
                    try {
                        if (V.f6444d == null) {
                            List<T> listK = AbstractC0438e.k(T.class, V.a(), T.class.getClassLoader(), new C0443j(7));
                            V.f6444d = new V();
                            for (T t7 : listK) {
                                V.f6443c.fine("Service loader found " + t7);
                                V v7 = V.f6444d;
                                synchronized (v7) {
                                    p113p3.f.d("isAvailable() returned false", t7.b());
                                    v7.f6445a.add(t7);
                                    break;
                                }
                            }
                            V v8 = V.f6444d;
                            synchronized (v8) {
                                ArrayList arrayList = new ArrayList(v8.f6445a);
                                Collections.sort(arrayList, Collections.reverseOrder(new U()));
                                v8.f6446b = Collections.unmodifiableList(arrayList);
                            }
                        }
                        v6 = V.f6444d;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (v6) {
                    list = v6.f6446b;
                }
                T t8 = list.isEmpty() ? null : (T) list.get(0);
                if (t8 == null) {
                    throw new W("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
                }
                S sA = t8.a(str);
                if (!jVar.f1724c) {
                    sA.c();
                }
                sA.b(TimeUnit.SECONDS);
                V5.b bVar = new V5.b(sA);
                bVar.f6681b = context;
                Q qA = bVar.a();
                ((L4.f) c0247p.f2707b).a(new t(c0247p, (V5.a) qA, i7));
                C0437d c0437dC = C0437d.f6473i.c(p020c6.b.f10450a, p020c6.a.f10448a);
                m mVar = (m) c0247p.f2712g;
                C0436c c0436cB = C0437d.b(c0437dC);
                c0436cB.f6464d = mVar;
                C0437d c0437d = new C0437d(c0436cB);
                L4.d dVar = ((L4.f) c0247p.f2707b).f4359a;
                C0436c c0436cB2 = C0437d.b(c0437d);
                c0436cB2.f6463c = dVar;
                c0247p.f2708c = new C0437d(c0436cB2);
                Q0.a.v(1, "GrpcCallProvider", "Channel successfully reset.", new Object[0]);
                return qA;
            case 1:
                ((Runnable) this.f4060b).run();
                return null;
            case 2:
                ((RunnableC0179l) this.f4060b).run();
                return null;
            case 3:
                return new S0.i((JsReplyProxyBoundaryInterface) this.f4060b);
            default:
                S0.D d7 = new S0.D();
                d7.f6232a = (WebViewRendererBoundaryInterface) this.f4060b;
                return d7;
        }
    }
}

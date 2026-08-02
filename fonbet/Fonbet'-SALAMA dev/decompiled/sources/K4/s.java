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
import c6.AbstractC0823b;
import c6.EnumC0822a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import x3.AbstractC1788a;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4059a;

    /* renamed from: b, reason: collision with root package name */
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
                    AbstractC1788a.a(context);
                } catch (com.google.android.gms.common.e | com.google.android.gms.common.f | IllegalStateException e7) {
                    Q0.a.v(2, "GrpcCallProvider", "Failed to update ssl context: %s", e7);
                }
                String str = (String) jVar.f1726e;
                Logger logger = V.f6443c;
                synchronized (V.class) {
                    try {
                        if (V.f6444d == null) {
                            List<T> k7 = AbstractC0438e.k(T.class, V.a(), T.class.getClassLoader(), new C0443j(7));
                            V.f6444d = new V();
                            for (T t7 : k7) {
                                V.f6443c.fine("Service loader found " + t7);
                                V v7 = V.f6444d;
                                synchronized (v7) {
                                    p3.f.d("isAvailable() returned false", t7.b());
                                    v7.f6445a.add(t7);
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
                S a2 = t8.a(str);
                if (!jVar.f1724c) {
                    a2.c();
                }
                a2.b(TimeUnit.SECONDS);
                V5.b bVar = new V5.b(a2);
                bVar.f6681b = context;
                Q a4 = bVar.a();
                ((L4.f) c0247p.f2707b).a(new t(c0247p, (V5.a) a4, i7));
                C0437d c3 = C0437d.f6473i.c(AbstractC0823b.f10450a, EnumC0822a.f10448a);
                m mVar = (m) c0247p.f2712g;
                C0436c b7 = C0437d.b(c3);
                b7.f6464d = mVar;
                C0437d c0437d = new C0437d(b7);
                L4.d dVar = ((L4.f) c0247p.f2707b).f4359a;
                C0436c b8 = C0437d.b(c0437d);
                b8.f6463c = dVar;
                c0247p.f2708c = new C0437d(b8);
                Q0.a.v(1, "GrpcCallProvider", "Channel successfully reset.", new Object[0]);
                return a4;
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

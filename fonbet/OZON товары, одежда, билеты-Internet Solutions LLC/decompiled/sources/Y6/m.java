package Y6;

import B90.T;
import B90.a0;
import C.l0;
import S6.m;
import S6.r;
import T6.f;
import T6.g;
import V6.c;
import a7.C4957a;
import a7.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b7.InterfaceC5572a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34678a;

    /* renamed from: b, reason: collision with root package name */
    private final T6.e f34679b;

    /* renamed from: c, reason: collision with root package name */
    private final Z6.d f34680c;

    /* renamed from: d, reason: collision with root package name */
    private final q f34681d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f34682e;

    /* renamed from: f, reason: collision with root package name */
    private final a7.b f34683f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC5572a f34684g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5572a f34685h;

    /* renamed from: i, reason: collision with root package name */
    private final Z6.c f34686i;

    public m(Context context, T6.e eVar, Z6.d dVar, q qVar, Executor executor, a7.b bVar, InterfaceC5572a interfaceC5572a, InterfaceC5572a interfaceC5572a2, Z6.c cVar) {
        this.f34678a = context;
        this.f34679b = eVar;
        this.f34680c = dVar;
        this.f34681d = qVar;
        this.f34682e = executor;
        this.f34683f = bVar;
        this.f34684g = interfaceC5572a;
        this.f34685h = interfaceC5572a2;
        this.f34686i = cVar;
    }

    public static /* synthetic */ void b(m mVar, Iterable iterable, r rVar, long j11) {
        Z6.d dVar = mVar.f34680c;
        dVar.p1(iterable);
        dVar.E(mVar.f34684g.t() + j11, rVar);
    }

    public static /* synthetic */ void h(m mVar, HashMap hashMap) {
        mVar.getClass();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            mVar.f34686i.j(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
    }

    public static void i(final m mVar, final r rVar, final int i11, Runnable runnable) {
        a7.b bVar = mVar.f34683f;
        try {
            try {
                Z6.d dVar = mVar.f34680c;
                Objects.requireNonNull(dVar);
                bVar.c(new Gk0.b(dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) mVar.f34678a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    bVar.c(new b.a() { // from class: Y6.g
                        @Override // a7.b.a
                        public final Object execute() {
                            m.this.f34681d.a(rVar, i11 + 1);
                            return null;
                        }
                    });
                } else {
                    mVar.j(rVar, i11);
                }
                runnable.run();
            } catch (C4957a unused) {
                mVar.f34681d.a(rVar, i11 + 1);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    public final void j(r rVar, int i11) {
        T6.g a11;
        T6.m mVar = this.f34679b.get(rVar.b());
        T6.g.e(0L);
        final long j11 = 0;
        while (true) {
            l0 l0Var = new l0(this, rVar);
            a7.b bVar = this.f34683f;
            if (!((Boolean) bVar.c(l0Var)).booleanValue()) {
                final r rVar2 = rVar;
                bVar.c(new b.a() { // from class: Y6.l
                    @Override // a7.b.a
                    public final Object execute() {
                        r3.f34680c.E(m.this.f34684g.t() + j11, rVar2);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) bVar.c(new h(this, rVar));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (mVar == null) {
                W6.a.a(rVar, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                a11 = T6.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Z6.j) it.next()).a());
                }
                if (rVar.c() != null) {
                    Z6.c cVar = this.f34686i;
                    Objects.requireNonNull(cVar);
                    V6.a aVar = (V6.a) bVar.c(new T(cVar));
                    m.a a12 = S6.m.a();
                    a12.h(this.f34684g.t());
                    a12.j(this.f34685h.t());
                    a12.i("GDT_CLIENT_METRICS");
                    Q6.c b11 = Q6.c.b("proto");
                    aVar.getClass();
                    a12.g(new S6.l(b11, S6.o.a(aVar)));
                    arrayList.add(mVar.b(a12.d()));
                }
                f.a a13 = T6.f.a();
                a13.b(arrayList);
                a13.c(rVar.c());
                a11 = mVar.a(a13.a());
            }
            if (a11.c() == g.a.TRANSIENT_ERROR) {
                final r rVar3 = rVar;
                bVar.c(new b.a() { // from class: Y6.i
                    @Override // a7.b.a
                    public final Object execute() {
                        r rVar4 = rVar3;
                        m.b(m.this, iterable, rVar4, j11);
                        return null;
                    }
                });
                this.f34681d.b(rVar3, i11 + 1, true);
                return;
            }
            r rVar4 = rVar;
            bVar.c(new b.a() { // from class: Y6.j
                @Override // a7.b.a
                public final Object execute() {
                    m.this.f34680c.N0(iterable);
                    return null;
                }
            });
            if (a11.c() == g.a.OK) {
                j11 = Math.max(j11, a11.b());
                if (rVar4.c() != null) {
                    bVar.c(new a0(this, 3));
                }
            } else if (a11.c() == g.a.INVALID_PAYLOAD) {
                HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String j12 = ((Z6.j) it2.next()).a().j();
                    if (hashMap.containsKey(j12)) {
                        hashMap.put(j12, Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                    } else {
                        hashMap.put(j12, 1);
                    }
                }
                bVar.c(new k(this, hashMap));
            }
            rVar = rVar4;
        }
    }

    public final void k(final r rVar, final int i11, final Runnable runnable) {
        this.f34682e.execute(new Runnable() { // from class: Y6.f
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                m.i(m.this, rVar, i11, runnable2);
            }
        });
    }
}

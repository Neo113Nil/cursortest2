package R3;

import a4.C0195a;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class v implements X2.s, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f2661h = Logger.getLogger(v.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2662a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2663b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2664c;

    /* renamed from: d, reason: collision with root package name */
    public final Y3.b f2665d;

    /* renamed from: e, reason: collision with root package name */
    public final B0.n f2666e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f2667f;

    /* renamed from: g, reason: collision with root package name */
    public final L3.i f2668g;

    public v(ArrayList arrayList, IdentityHashMap identityHashMap, ArrayList arrayList2, C0195a c0195a, W3.a aVar, L3.i iVar) {
        J3.d dVar = J3.d.f1367a;
        this.f2667f = new AtomicBoolean(false);
        long a6 = dVar.a(true);
        this.f2662a = arrayList;
        List list = (List) identityHashMap.entrySet().stream().map(new M3.n(1, arrayList)).collect(Collectors.toList());
        this.f2663b = list;
        this.f2664c = arrayList2;
        this.f2665d = new Y3.b(c0195a, a6, aVar);
        this.f2666e = new B0.n(new M3.n(2, this));
        this.f2668g = iVar;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            X3.a aVar2 = (X3.a) it.next();
            new ArrayList(arrayList2).add(new l1.j(12));
            aVar2.getClass();
            throw null;
        }
    }

    @Override // X2.s
    public final X2.r a(String str) {
        if (this.f2663b.isEmpty()) {
            return X2.h.f3518a.a(str);
        }
        if (str == null || str.isEmpty()) {
            f2661h.fine("Meter requested without instrumentation scope name.");
            str = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
        }
        return new B0.e(this.f2666e, 7, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final J3.c shutdown() {
        if (!this.f2667f.compareAndSet(false, true)) {
            f2661h.info("Multiple close calls");
            return J3.c.f1361e;
        }
        List list = this.f2663b;
        if (list.isEmpty()) {
            return J3.c.f1361e;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return J3.c.d(arrayList);
        }
        ((X3.a) it.next()).getClass();
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkMeterProvider{clock=");
        Y3.b bVar = this.f2665d;
        bVar.getClass();
        sb.append(J3.d.f1367a);
        sb.append(", resource=");
        sb.append(bVar.f3697a);
        sb.append(", metricReaders=");
        sb.append(this.f2663b.stream().map(new A3.b(18)).collect(Collectors.toList()));
        sb.append(", metricProducers=");
        sb.append(this.f2664c);
        sb.append(", views=");
        sb.append(this.f2662a);
        sb.append(", meterConfigurator=");
        sb.append(this.f2668g);
        sb.append("}");
        return sb.toString();
    }
}

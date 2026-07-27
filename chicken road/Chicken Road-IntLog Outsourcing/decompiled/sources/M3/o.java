package M3;

import a4.AbstractC0197c;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class o implements W2.h, Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f1981e = Logger.getLogger(o.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final i f1982a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.n f1983b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1984c;

    /* renamed from: d, reason: collision with root package name */
    public final L3.i f1985d;

    public o(AbstractC0197c abstractC0197c, Supplier supplier, ArrayList arrayList, L3.i iVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((h) it.next());
        }
        h jVar = arrayList2.isEmpty() ? k.f1968a : arrayList2.size() == 1 ? (h) arrayList2.get(0) : new j(new ArrayList(arrayList2));
        this.f1982a = new i(abstractC0197c, supplier, jVar);
        this.f1983b = new B0.n(new n(0, this));
        this.f1985d = iVar;
        this.f1984c = jVar instanceof k;
    }

    @Override // W2.h
    public final W2.g a(String str) {
        if (this.f1984c) {
            return ((W2.h) V2.d.c(W2.d.f3408a, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).a(str);
        }
        if (str.isEmpty()) {
            f1981e.fine("Logger requested without instrumentation scope name.");
            str = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
        }
        return new x1.e(this.f1983b, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // W2.h
    public final W2.f get() {
        return (W2.f) this.f1983b.a(Q2.a.f2475d, "noop");
    }

    public final J3.c shutdown() {
        J3.c cVar;
        if (this.f1982a.f1965e != null) {
            f1981e.log(Level.INFO, "Calling shutdown() multiple times.");
            return J3.c.f1361e;
        }
        i iVar = this.f1982a;
        synchronized (iVar.f1961a) {
            try {
                if (iVar.f1965e != null) {
                    cVar = iVar.f1965e;
                } else {
                    iVar.f1965e = iVar.f1964d.shutdown();
                    cVar = iVar.f1965e;
                }
            } finally {
            }
        }
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkLoggerProvider{clock=");
        i iVar = this.f1982a;
        iVar.getClass();
        sb.append(J3.d.f1367a);
        sb.append(", resource=");
        sb.append(iVar.f1962b);
        sb.append(", logLimits=");
        sb.append((g) iVar.f1963c.get());
        sb.append(", logRecordProcessor=");
        sb.append(iVar.f1964d);
        sb.append(", loggerConfigurator=");
        sb.append(this.f1985d);
        sb.append('}');
        return sb.toString();
    }
}

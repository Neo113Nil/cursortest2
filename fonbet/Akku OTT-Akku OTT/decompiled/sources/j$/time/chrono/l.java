package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public interface l extends Comparable {
    InterfaceC1035b B(TemporalAccessor temporalAccessor);

    InterfaceC1035b F();

    InterfaceC1035b J(int i, int i2, int i3);

    InterfaceC1035b L(Map map, j$.time.format.x xVar);

    ChronoZonedDateTime M(Instant instant, ZoneId zoneId);

    boolean equals(Object obj);

    int hashCode();

    InterfaceC1035b l(long j);

    String m();

    String q();

    InterfaceC1035b r(int i, int i2);

    j$.time.temporal.u t(j$.time.temporal.a aVar);

    String toString();

    List u();

    m w(int i);

    int x(m mVar, int i);

    static l n(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.b(j$.time.temporal.r.b);
        s sVar = s.c;
        if (lVar != null) {
            return lVar;
        }
        Objects.requireNonNull(sVar, "defaultObj");
        return sVar;
    }

    static l of(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC1034a.a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC1034a.a;
            l lVar = (l) concurrentHashMap2.get(str);
            if (lVar == null) {
                lVar = (l) AbstractC1034a.b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap2.get(ExifInterface.TAG_RW2_ISO) != null) {
                Iterator it = ServiceLoader.load(l.class).iterator();
                while (it.hasNext()) {
                    l lVar2 = (l) it.next();
                    if (str.equals(lVar2.m()) || str.equals(lVar2.q())) {
                        return lVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: ".concat(str));
            }
            o oVar = o.l;
            oVar.getClass();
            AbstractC1034a.v(oVar, "Hijrah-umalqura");
            v vVar = v.c;
            vVar.getClass();
            AbstractC1034a.v(vVar, "Japanese");
            A a = A.c;
            a.getClass();
            AbstractC1034a.v(a, "Minguo");
            G g = G.c;
            g.getClass();
            AbstractC1034a.v(g, "ThaiBuddhist");
            try {
                for (AbstractC1034a abstractC1034a : Arrays.asList(new AbstractC1034a[0])) {
                    if (!abstractC1034a.m().equals(ExifInterface.TAG_RW2_ISO)) {
                        AbstractC1034a.v(abstractC1034a, abstractC1034a.m());
                    }
                }
                s sVar = s.c;
                sVar.getClass();
                AbstractC1034a.v(sVar, ExifInterface.TAG_RW2_ISO);
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    default InterfaceC1038e C(LocalDateTime localDateTime) {
        try {
            return B(localDateTime).E(j$.time.k.A(localDateTime));
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }
}

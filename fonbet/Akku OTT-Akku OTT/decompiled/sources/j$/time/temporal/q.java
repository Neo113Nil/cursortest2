package j$.time.temporal;

import j$.time.format.w;
import j$.time.format.x;
import java.util.Map;

/* loaded from: classes6.dex */
public interface q {
    long I(TemporalAccessor temporalAccessor);

    m O(m mVar, long j);

    boolean isDateBased();

    boolean o(TemporalAccessor temporalAccessor);

    u range();

    u v(TemporalAccessor temporalAccessor);

    default TemporalAccessor A(Map map, w wVar, x xVar) {
        return null;
    }
}

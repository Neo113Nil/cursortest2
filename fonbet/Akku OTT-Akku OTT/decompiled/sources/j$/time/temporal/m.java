package j$.time.temporal;

/* loaded from: classes6.dex */
public interface m extends TemporalAccessor {
    m c(long j, q qVar);

    m d(long j, s sVar);

    /* renamed from: i */
    m k(j$.time.g gVar);

    default m a(long j, s sVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, sVar).d(1L, sVar) : d(-j, sVar);
    }
}

package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "", "read", "()J", "Lkotlin/time/Duration;", "duration", "", "plusAssign-LRDsOJo", "(J)V", "plusAssign", "p0", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TestTimeSource extends kotlin.time.AbstractLongTimeSource {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI;

    public TestTimeSource() {
        super(kotlin.time.DurationUnit.NANOSECONDS);
        markNow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.time.AbstractLongTimeSource
    /* renamed from: read, reason: from getter */
    public final long getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m24025plusAssignLRDsOJo(long duration) {
        long m23976toLongimpl = kotlin.time.Duration.m23976toLongimpl(duration, getUnit());
        if (((m23976toLongimpl - 1) | 1) != Long.MAX_VALUE) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            long j2 = j + m23976toLongimpl;
            if ((m23976toLongimpl ^ j) >= 0 && (j ^ j2) < 0) {
                getHighSpeedVideoFpsRangesFor(duration);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = j2;
            return;
        }
        long m23945divUwyO8pc = kotlin.time.Duration.m23945divUwyO8pc(duration, 2);
        if ((1 | (kotlin.time.Duration.m23976toLongimpl(m23945divUwyO8pc, getUnit()) - 1)) != Long.MAX_VALUE) {
            long j3 = this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                m24025plusAssignLRDsOJo(m23945divUwyO8pc);
                m24025plusAssignLRDsOJo(kotlin.time.Duration.m23965minusLRDsOJo(duration, m23945divUwyO8pc));
                return;
            } catch (java.lang.IllegalStateException e) {
                this.getHighResolutionOutputSizeshNQ4ISI = j3;
                throw e;
            }
        }
        getHighSpeedVideoFpsRangesFor(duration);
    }

    private final void getHighSpeedVideoFpsRangesFor(long p0) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TestTimeSource will overflow if its reading ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(kotlin.time.DurationUnitKt.shortName(getUnit()));
        sb.append(" is advanced by ");
        sb.append((java.lang.Object) kotlin.time.Duration.m23977toStringimpl(p0));
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalStateException(sb.toString());
    }
}

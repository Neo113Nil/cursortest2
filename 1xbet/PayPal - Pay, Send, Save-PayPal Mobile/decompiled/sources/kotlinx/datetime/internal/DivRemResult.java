package kotlinx.datetime.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\f\u0010\b"}, d2 = {"Lkotlinx/datetime/internal/DivRemResult;", "", "", "q", "r", "<init>", "(JJ)V", "component1", "()J", "component2", "J", "getQ", "getR"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivRemResult {
    private final long q;
    private final long r;

    public DivRemResult(long j, long j2) {
        this.q = j;
        this.r = j2;
    }

    public final long getQ() {
        return this.q;
    }

    public final long getR() {
        return this.r;
    }

    /* renamed from: component1, reason: from getter */
    public final long getQ() {
        return this.q;
    }

    /* renamed from: component2, reason: from getter */
    public final long getR() {
        return this.r;
    }
}

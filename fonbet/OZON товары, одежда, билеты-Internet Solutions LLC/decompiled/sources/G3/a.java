package G3;

import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public abstract class a implements e {

    /* renamed from: b, reason: collision with root package name */
    private final long f9668b;

    /* renamed from: c, reason: collision with root package name */
    private long f9669c = -1;

    public a(long j11) {
        this.f9668b = j11;
    }

    protected final void c() {
        long j11 = this.f9669c;
        if (j11 < 0 || j11 > this.f9668b) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.f9669c;
    }

    @Override // G3.e
    public final boolean next() {
        long j11 = this.f9669c + 1;
        this.f9669c = j11;
        return !(j11 > this.f9668b);
    }
}

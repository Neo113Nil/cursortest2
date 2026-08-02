package V3;

import N3.C3659j;
import N3.z;

/* loaded from: classes8.dex */
final class d extends z {

    /* renamed from: b, reason: collision with root package name */
    private final long f27975b;

    public d(C3659j c3659j, long j11) {
        super(c3659j);
        G10.a.c(c3659j.getPosition() >= j11);
        this.f27975b = j11;
    }

    @Override // N3.z, N3.q
    public final long f() {
        return super.f() - this.f27975b;
    }

    @Override // N3.z, N3.q
    public final long getLength() {
        return super.getLength() - this.f27975b;
    }

    @Override // N3.z, N3.q
    public final long getPosition() {
        return super.getPosition() - this.f27975b;
    }
}

package W;

/* renamed from: W.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4833d extends AbstractC4831b {

    /* renamed from: c, reason: collision with root package name */
    private final int f33019c;

    /* renamed from: d, reason: collision with root package name */
    private final double f33020d;

    /* renamed from: e, reason: collision with root package name */
    private final Throwable f33021e;

    C4833d(int i11, double d11, Throwable th2) {
        this.f33019c = i11;
        this.f33020d = d11;
        this.f33021e = th2;
    }

    @Override // W.AbstractC4831b
    final double a() {
        return this.f33020d;
    }

    @Override // W.AbstractC4831b
    public final int b() {
        return this.f33019c;
    }

    @Override // W.AbstractC4831b
    public final Throwable c() {
        return this.f33021e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4831b)) {
            return false;
        }
        AbstractC4831b abstractC4831b = (AbstractC4831b) obj;
        if (this.f33019c != abstractC4831b.b() || Double.doubleToLongBits(this.f33020d) != Double.doubleToLongBits(abstractC4831b.a())) {
            return false;
        }
        Throwable th2 = this.f33021e;
        return th2 == null ? abstractC4831b.c() == null : th2.equals(abstractC4831b.c());
    }

    public final int hashCode() {
        int i11 = (this.f33019c ^ 1000003) * 1000003;
        double d11 = this.f33020d;
        int doubleToLongBits = (i11 ^ ((int) (Double.doubleToLongBits(d11) ^ (Double.doubleToLongBits(d11) >>> 32)))) * 1000003;
        Throwable th2 = this.f33021e;
        return doubleToLongBits ^ (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.f33019c + ", audioAmplitudeInternal=" + this.f33020d + ", errorCause=" + this.f33021e + "}";
    }
}

package A1;

/* JADX INFO: renamed from: A1.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0014d0 implements InterfaceC0027k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0014d0 f336f = new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f341e;

    public C0014d0(long j, long j3, long j7, float f7, float f8) {
        this.f337a = j;
        this.f338b = j3;
        this.f339c = j7;
        this.f340d = f7;
        this.f341e = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0014d0)) {
            return false;
        }
        C0014d0 c0014d0 = (C0014d0) obj;
        return this.f337a == c0014d0.f337a && this.f338b == c0014d0.f338b && this.f339c == c0014d0.f339c && this.f340d == c0014d0.f340d && this.f341e == c0014d0.f341e;
    }

    public final int hashCode() {
        long j = this.f337a;
        long j3 = this.f338b;
        int i7 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.f339c;
        int i8 = (i7 + ((int) ((j7 >>> 32) ^ j7))) * 31;
        float f7 = this.f340d;
        int iFloatToIntBits = (i8 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
        float f8 = this.f341e;
        return iFloatToIntBits + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
    }
}

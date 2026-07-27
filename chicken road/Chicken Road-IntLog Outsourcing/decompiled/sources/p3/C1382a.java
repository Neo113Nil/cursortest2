package p3;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1382a {

    /* renamed from: a, reason: collision with root package name */
    public final long f11639a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11640b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11641c;

    public C1382a(long j2, long j6, long j7) {
        this.f11639a = j2;
        this.f11640b = j6;
        this.f11641c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1382a)) {
            return false;
        }
        C1382a c1382a = (C1382a) obj;
        return this.f11639a == c1382a.f11639a && this.f11640b == c1382a.f11640b && this.f11641c == c1382a.f11641c;
    }

    public final int hashCode() {
        long j2 = this.f11639a;
        long j6 = this.f11640b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f11641c;
        return ((((i2 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ 1048576) * 1000003) ^ 10485760;
    }

    public final String toString() {
        return "FileStorageConfiguration{maxFileAgeForWriteMillis=" + this.f11639a + ", minFileAgeForReadMillis=" + this.f11640b + ", maxFileAgeForReadMillis=" + this.f11641c + ", maxFileSize=1048576, maxFolderSize=10485760}";
    }
}

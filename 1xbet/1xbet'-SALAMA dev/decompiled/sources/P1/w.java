package P1;

import C1.C0095a;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p151v2.s f5375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f5376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5382i;

    public w(int i7) {
        this.f5374a = i7;
        switch (i7) {
            case 1:
                this.f5375b = new p151v2.s(0L);
                this.f5380g = -9223372036854775807L;
                this.f5381h = -9223372036854775807L;
                this.f5382i = -9223372036854775807L;
                this.f5376c = new C0095a(4, false);
                break;
            default:
                this.f5375b = new p151v2.s(0L);
                this.f5380g = -9223372036854775807L;
                this.f5381h = -9223372036854775807L;
                this.f5382i = -9223372036854775807L;
                this.f5376c = new C0095a(4, false);
                break;
        }
    }

    public static int b(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static long c(C0095a c0095a) {
        int i7 = c0095a.f1463a;
        if (c0095a.d() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c0095a.f(bArr, 0, 9);
        c0095a.D(i7);
        byte b7 = bArr[0];
        if ((b7 & 196) == 68) {
            byte b8 = bArr[2];
            if ((b8 & 4) == 4) {
                byte b9 = bArr[4];
                if ((b9 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b7;
                    long j3 = b8;
                    return ((j3 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j3 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b9) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(F1.h hVar) {
        switch (this.f5374a) {
            case 0:
                byte[] bArr = p151v2.t.f17164f;
                C0095a c0095a = this.f5376c;
                c0095a.getClass();
                c0095a.B(bArr.length, bArr);
                this.f5377d = true;
                hVar.f2536f = 0;
                break;
            default:
                byte[] bArr2 = p151v2.t.f17164f;
                C0095a c0095a2 = this.f5376c;
                c0095a2.getClass();
                c0095a2.B(bArr2.length, bArr2);
                this.f5377d = true;
                hVar.f2536f = 0;
                break;
        }
    }
}

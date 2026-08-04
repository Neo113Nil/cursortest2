package F1;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2576a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2582g;

    public final void a(v vVar, u uVar) {
        if (this.f2578c > 0) {
            vVar.e(this.f2579d, this.f2580e, this.f2581f, this.f2582g, uVar);
            this.f2578c = 0;
        }
    }

    public final void b(v vVar, long j, int i7, int i8, int i9, u uVar) {
        if (!(this.f2582g <= i8 + i9)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f2577b) {
            int i10 = this.f2578c;
            int i11 = i10 + 1;
            this.f2578c = i11;
            if (i10 == 0) {
                this.f2579d = j;
                this.f2580e = i7;
                this.f2581f = 0;
            }
            this.f2581f += i8;
            this.f2582g = i9;
            if (i11 >= 16) {
                a(vVar, uVar);
            }
        }
    }

    public final void c(l lVar) {
        if (this.f2577b) {
            return;
        }
        byte[] bArr = this.f2576a;
        int i7 = 0;
        lVar.y(bArr, 0, 10);
        lVar.p();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b7 = bArr[7];
            if ((b7 & 254) == 186) {
                i7 = 40 << ((bArr[(b7 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i7 == 0) {
            return;
        }
        this.f2577b = true;
    }
}

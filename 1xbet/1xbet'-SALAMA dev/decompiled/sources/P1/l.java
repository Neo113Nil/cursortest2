package P1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F1.v f5237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5244h;

    public l(F1.v vVar) {
        this.f5237a = vVar;
    }

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f5239c) {
            int i9 = this.f5242f;
            int i10 = (i7 + 1) - i9;
            if (i10 >= i8) {
                this.f5242f = (i8 - i7) + i9;
            } else {
                this.f5240d = ((bArr[i10] & 192) >> 6) == 0;
                this.f5239c = false;
            }
        }
    }
}

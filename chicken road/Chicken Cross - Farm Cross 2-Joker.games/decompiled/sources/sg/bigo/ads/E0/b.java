package sg.bigo.ads.E0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f12264a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ c j;

    public b(c cVar, int i, int i2) {
        this.j = cVar;
        this.f12264a = i;
        this.b = i2;
        a();
    }

    public final void a() {
        c cVar = this.j;
        int[] iArr = cVar.f12265a;
        int[] iArr2 = cVar.b;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = this.f12264a; i8 <= this.b; i8++) {
            int i9 = iArr[i8];
            i5 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i2) {
                i2 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i3) {
                i3 = i11;
            }
            if (i11 < i6) {
                i6 = i11;
            }
            if (i12 > i4) {
                i4 = i12;
            }
            if (i12 < i7) {
                i7 = i12;
            }
        }
        this.d = i;
        this.e = i2;
        this.f = i6;
        this.g = i3;
        this.h = i7;
        this.i = i4;
        this.c = i5;
    }
}

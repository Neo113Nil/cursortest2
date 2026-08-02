package N3;

/* loaded from: classes8.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f18527a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18528b;

    /* renamed from: c, reason: collision with root package name */
    private int f18529c;

    /* renamed from: d, reason: collision with root package name */
    private int f18530d;

    public O(byte[] bArr) {
        this.f18527a = bArr;
        this.f18528b = bArr.length;
    }

    public final int a() {
        return (this.f18529c * 8) + this.f18530d;
    }

    public final boolean b() {
        boolean z11 = (((this.f18527a[this.f18529c] & 255) >> this.f18530d) & 1) == 1;
        d(1);
        return z11;
    }

    public final int c(int i11) {
        int i12 = this.f18529c;
        int min = Math.min(i11, 8 - this.f18530d);
        int i13 = i12 + 1;
        byte[] bArr = this.f18527a;
        int i14 = ((bArr[i12] & 255) >> this.f18530d) & (255 >> (8 - min));
        while (min < i11) {
            i14 |= (bArr[i13] & 255) << min;
            min += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i11));
        d(i11);
        return i15;
    }

    public final void d(int i11) {
        int i12;
        int i13 = i11 / 8;
        int i14 = this.f18529c + i13;
        this.f18529c = i14;
        int i15 = (i11 - (i13 * 8)) + this.f18530d;
        this.f18530d = i15;
        boolean z11 = true;
        if (i15 > 7) {
            this.f18529c = i14 + 1;
            this.f18530d = i15 - 8;
        }
        int i16 = this.f18529c;
        if (i16 < 0 || (i16 >= (i12 = this.f18528b) && (i16 != i12 || this.f18530d != 0))) {
            z11 = false;
        }
        G10.a.h(z11);
    }
}

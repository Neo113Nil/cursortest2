package r;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f15978a;

    /* renamed from: b, reason: collision with root package name */
    public int f15979b;

    /* renamed from: c, reason: collision with root package name */
    public int f15980c;

    /* renamed from: d, reason: collision with root package name */
    public int f15981d;

    public d() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f15981d = highestOneBit - 1;
        this.f15978a = new int[highestOneBit];
    }

    public final void a(int i7) {
        int[] iArr = this.f15978a;
        int i8 = this.f15980c;
        iArr[i8] = i7;
        int i9 = this.f15981d & (i8 + 1);
        this.f15980c = i9;
        int i10 = this.f15979b;
        if (i9 == i10) {
            int length = iArr.length;
            int i11 = length - i10;
            int i12 = length << 1;
            if (i12 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f15978a, 0, iArr2, i11, this.f15979b);
            this.f15978a = iArr2;
            this.f15979b = 0;
            this.f15980c = length;
            this.f15981d = i12 - 1;
        }
    }
}

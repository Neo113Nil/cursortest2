package p122r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f15984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15987d;

    public d() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f15987d = iHighestOneBit - 1;
        this.f15984a = new int[iHighestOneBit];
    }

    public final void a(int i7) {
        int[] iArr = this.f15984a;
        int i8 = this.f15986c;
        iArr[i8] = i7;
        int i9 = this.f15987d & (i8 + 1);
        this.f15986c = i9;
        int i10 = this.f15985b;
        if (i9 == i10) {
            int length = iArr.length;
            int i11 = length - i10;
            int i12 = length << 1;
            if (i12 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f15984a, 0, iArr2, i11, this.f15985b);
            this.f15984a = iArr2;
            this.f15985b = 0;
            this.f15986c = length;
            this.f15987d = i12 - 1;
        }
    }
}

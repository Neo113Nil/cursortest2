package N1;

import C1.C0095a;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: d, reason: collision with root package name */
    public int f4649d;

    /* renamed from: a, reason: collision with root package name */
    public int f4646a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f4647b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f4648c = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f4650e = new int[16];

    public e() {
        this.f4649d = r0.length - 1;
    }

    @Override // N1.d
    public int a() {
        return -1;
    }

    @Override // N1.d
    public int b() {
        return this.f4646a;
    }

    @Override // N1.d
    public int c() {
        C0095a c0095a = (C0095a) this.f4650e;
        int i7 = this.f4647b;
        if (i7 == 8) {
            return c0095a.t();
        }
        if (i7 == 16) {
            return c0095a.y();
        }
        int i8 = this.f4648c;
        this.f4648c = i8 + 1;
        if (i8 % 2 != 0) {
            return this.f4649d & 15;
        }
        int t7 = c0095a.t();
        this.f4649d = t7;
        return (t7 & 240) >> 4;
    }

    public void d(int i7) {
        int i8 = this.f4648c;
        int[] iArr = (int[]) this.f4650e;
        if (i8 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i9 = this.f4646a;
            int i10 = length2 - i9;
            System.arraycopy(iArr, i9, iArr2, 0, i10);
            System.arraycopy((int[]) this.f4650e, 0, iArr2, i10, i9);
            this.f4646a = 0;
            this.f4647b = this.f4648c - 1;
            this.f4650e = iArr2;
            this.f4649d = length - 1;
        }
        int i11 = (this.f4647b + 1) & this.f4649d;
        this.f4647b = i11;
        ((int[]) this.f4650e)[i11] = i7;
        this.f4648c++;
    }

    public int e() {
        int i7 = this.f4648c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.f4650e;
        int i8 = this.f4646a;
        int i9 = iArr[i8];
        this.f4646a = (i8 + 1) & this.f4649d;
        this.f4648c = i7 - 1;
        return i9;
    }
}

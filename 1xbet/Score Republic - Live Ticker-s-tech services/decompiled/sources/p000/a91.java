package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a91 implements Comparable {

    /* JADX INFO: renamed from: j */
    public boolean f84j;

    /* JADX INFO: renamed from: n */
    public float f88n;

    /* JADX INFO: renamed from: u */
    public int f95u;

    /* JADX INFO: renamed from: k */
    public int f85k = -1;

    /* JADX INFO: renamed from: l */
    public int f86l = -1;

    /* JADX INFO: renamed from: m */
    public int f87m = 0;

    /* JADX INFO: renamed from: o */
    public boolean f89o = false;

    /* JADX INFO: renamed from: p */
    public final float[] f90p = new float[9];

    /* JADX INFO: renamed from: q */
    public final float[] f91q = new float[9];

    /* JADX INFO: renamed from: r */
    public C0129d8[] f92r = new C0129d8[16];

    /* JADX INFO: renamed from: s */
    public int f93s = 0;

    /* JADX INFO: renamed from: t */
    public int f94t = 0;

    public a91(int i) {
        this.f95u = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m143a(C0129d8 c0129d8) {
        int i = 0;
        while (true) {
            int i2 = this.f93s;
            C0129d8[] c0129d8Arr = this.f92r;
            if (i >= i2) {
                if (i2 >= c0129d8Arr.length) {
                    this.f92r = (C0129d8[]) Arrays.copyOf(c0129d8Arr, c0129d8Arr.length * 2);
                }
                C0129d8[] c0129d8Arr2 = this.f92r;
                int i3 = this.f93s;
                c0129d8Arr2[i3] = c0129d8;
                this.f93s = i3 + 1;
                return;
            }
            if (c0129d8Arr[i] == c0129d8) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m144b(C0129d8 c0129d8) {
        int i = this.f93s;
        int i2 = 0;
        while (i2 < i) {
            if (this.f92r[i2] == c0129d8) {
                while (i2 < i - 1) {
                    C0129d8[] c0129d8Arr = this.f92r;
                    int i3 = i2 + 1;
                    c0129d8Arr[i2] = c0129d8Arr[i3];
                    i2 = i3;
                }
                this.f93s--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m145c() {
        this.f95u = 5;
        this.f87m = 0;
        this.f85k = -1;
        this.f86l = -1;
        this.f88n = 0.0f;
        this.f89o = false;
        int i = this.f93s;
        for (int i2 = 0; i2 < i; i2++) {
            this.f92r[i2] = null;
        }
        this.f93s = 0;
        this.f94t = 0;
        this.f84j = false;
        Arrays.fill(this.f91q, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f85k - ((a91) obj).f85k;
    }

    /* JADX INFO: renamed from: d */
    public final void m146d(gi0 gi0Var, float f) {
        this.f88n = f;
        this.f89o = true;
        int i = this.f93s;
        this.f86l = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f92r[i2].m1137h(gi0Var, this, false);
        }
        this.f93s = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m147e(gi0 gi0Var, C0129d8 c0129d8) {
        int i = this.f93s;
        for (int i2 = 0; i2 < i; i2++) {
            this.f92r[i2].mo1138i(gi0Var, c0129d8, false);
        }
        this.f93s = 0;
    }

    public final String toString() {
        return "" + this.f85k;
    }
}

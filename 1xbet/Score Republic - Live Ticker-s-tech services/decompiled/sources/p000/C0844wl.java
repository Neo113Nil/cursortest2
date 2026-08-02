package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: wl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0844wl {

    /* JADX INFO: renamed from: a */
    public int[] f8569a;

    /* JADX INFO: renamed from: b */
    public int[] f8570b;

    /* JADX INFO: renamed from: c */
    public int f8571c;

    /* JADX INFO: renamed from: d */
    public int[] f8572d;

    /* JADX INFO: renamed from: e */
    public float[] f8573e;

    /* JADX INFO: renamed from: f */
    public int f8574f;

    /* JADX INFO: renamed from: g */
    public int[] f8575g;

    /* JADX INFO: renamed from: h */
    public String[] f8576h;

    /* JADX INFO: renamed from: i */
    public int f8577i;

    /* JADX INFO: renamed from: j */
    public int[] f8578j;

    /* JADX INFO: renamed from: k */
    public boolean[] f8579k;

    /* JADX INFO: renamed from: l */
    public int f8580l;

    /* JADX INFO: renamed from: a */
    public final void m5351a(int i, float f) {
        int i2 = this.f8574f;
        int[] iArr = this.f8572d;
        if (i2 >= iArr.length) {
            this.f8572d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f8573e;
            this.f8573e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f8572d;
        int i3 = this.f8574f;
        iArr2[i3] = i;
        float[] fArr2 = this.f8573e;
        this.f8574f = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m5352b(int i, int i2) {
        int i3 = this.f8571c;
        int[] iArr = this.f8569a;
        if (i3 >= iArr.length) {
            this.f8569a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f8570b;
            this.f8570b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f8569a;
        int i4 = this.f8571c;
        iArr3[i4] = i;
        int[] iArr4 = this.f8570b;
        this.f8571c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m5353c(int i, boolean z) {
        int i2 = this.f8580l;
        int[] iArr = this.f8578j;
        if (i2 >= iArr.length) {
            this.f8578j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f8579k;
            this.f8579k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f8578j;
        int i3 = this.f8580l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f8579k;
        this.f8580l = i3 + 1;
        zArr2[i3] = z;
    }

    /* JADX INFO: renamed from: d */
    public final void m5354d(String str, int i) {
        int i2 = this.f8577i;
        int[] iArr = this.f8575g;
        if (i2 >= iArr.length) {
            this.f8575g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f8576h;
            this.f8576h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f8575g;
        int i3 = this.f8577i;
        iArr2[i3] = i;
        String[] strArr2 = this.f8576h;
        this.f8577i = i3 + 1;
        strArr2[i3] = str;
    }
}

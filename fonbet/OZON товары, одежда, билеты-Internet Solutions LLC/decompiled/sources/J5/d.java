package J5;

import Cd.C2749j;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f14003a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f14004b;

    public d(float[] fArr, int[] iArr) {
        this.f14003a = fArr;
        this.f14004b = iArr;
    }

    public final d a(float[] fArr) {
        int e11;
        int[] iArr = new int[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            float f7 = fArr[i11];
            float[] fArr2 = this.f14003a;
            int binarySearch = Arrays.binarySearch(fArr2, f7);
            int[] iArr2 = this.f14004b;
            if (binarySearch >= 0) {
                e11 = iArr2[binarySearch];
            } else {
                int i12 = -(binarySearch + 1);
                if (i12 == 0) {
                    e11 = iArr2[0];
                } else if (i12 == iArr2.length - 1) {
                    e11 = iArr2[iArr2.length - 1];
                } else {
                    int i13 = i12 - 1;
                    float f11 = fArr2[i13];
                    e11 = C2749j.e((f7 - f11) / (fArr2[i12] - f11), iArr2[i13], iArr2[i12]);
                }
            }
            iArr[i11] = e11;
        }
        return new d(fArr, iArr);
    }

    public final int[] b() {
        return this.f14004b;
    }

    public final float[] c() {
        return this.f14003a;
    }

    public final int d() {
        return this.f14004b.length;
    }

    public final void e(d dVar, d dVar2, float f7) {
        int[] iArr;
        float[] fArr;
        int length = dVar.f14004b.length;
        int length2 = dVar2.f14004b.length;
        int[] iArr2 = dVar.f14004b;
        int[] iArr3 = dVar2.f14004b;
        if (length != length2) {
            StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb2.append(iArr2.length);
            sb2.append(" vs ");
            throw new IllegalArgumentException(K00.b.e(iArr3.length, ")", sb2));
        }
        int i11 = 0;
        while (true) {
            int length3 = iArr2.length;
            iArr = this.f14004b;
            fArr = this.f14003a;
            if (i11 >= length3) {
                break;
            }
            fArr[i11] = O5.f.e(dVar.f14003a[i11], dVar2.f14003a[i11], f7);
            iArr[i11] = C2749j.e(f7, iArr2[i11], iArr3[i11]);
            i11++;
        }
        for (int length4 = iArr2.length; length4 < fArr.length; length4++) {
            fArr[length4] = fArr[iArr2.length - 1];
            iArr[length4] = iArr[iArr2.length - 1];
        }
    }
}

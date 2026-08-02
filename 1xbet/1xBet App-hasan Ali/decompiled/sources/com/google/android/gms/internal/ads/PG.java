package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class PG {

    /* renamed from: a, reason: collision with root package name */
    public final Random f11077a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f11078b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f11079c;

    public PG() {
        this(new Random());
    }

    public final PG a(int i) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i5 = 0;
        while (true) {
            random = this.f11077a;
            iArr = this.f11078b;
            if (i5 >= i) {
                break;
            }
            iArr2[i5] = random.nextInt(iArr.length + 1);
            int i6 = i5 + 1;
            int nextInt = random.nextInt(i6);
            iArr3[i5] = iArr3[nextInt];
            iArr3[nextInt] = i5;
            i5 = i6;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < iArr.length + i; i9++) {
            if (i7 >= i || i8 != iArr2[i7]) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                iArr4[i9] = i11;
                if (i11 >= 0) {
                    iArr4[i9] = i11 + i;
                }
                i8 = i10;
            } else {
                iArr4[i9] = iArr3[i7];
                i7++;
            }
        }
        return new PG(iArr4, new Random(random.nextLong()));
    }

    public PG(Random random) {
        this(new int[0], random);
    }

    public PG(int[] iArr, Random random) {
        this.f11078b = iArr;
        this.f11077a = random;
        this.f11079c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f11079c[iArr[i]] = i;
        }
    }
}

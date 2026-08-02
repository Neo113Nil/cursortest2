package org.bouncycastle.math.raw;

/* loaded from: classes17.dex */
public abstract class Nat512 {
    public static void square(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Nat256.square(iArr, iArr2);
        org.bouncycastle.math.raw.Nat256.square(iArr, 8, iArr2, 16);
        int addToEachOther = org.bouncycastle.math.raw.Nat256.addToEachOther(iArr2, 8, iArr2, 16);
        int addTo = org.bouncycastle.math.raw.Nat256.addTo(iArr2, 24, iArr2, 16, org.bouncycastle.math.raw.Nat256.addTo(iArr2, 0, iArr2, 8, 0) + addToEachOther);
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.raw.Nat256.diff(iArr, 8, iArr, 0, create, 0);
        int[] createExt = org.bouncycastle.math.raw.Nat256.createExt();
        org.bouncycastle.math.raw.Nat256.square(create, createExt);
        org.bouncycastle.math.raw.Nat.addWordAt(32, addToEachOther + addTo + org.bouncycastle.math.raw.Nat.subFrom(16, createExt, 0, iArr2, 8), iArr2, 24);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        org.bouncycastle.math.raw.Nat256.mul(iArr, iArr2, iArr3);
        org.bouncycastle.math.raw.Nat256.mul(iArr, 8, iArr2, 8, iArr3, 16);
        int addToEachOther = org.bouncycastle.math.raw.Nat256.addToEachOther(iArr3, 8, iArr3, 16);
        int addTo = org.bouncycastle.math.raw.Nat256.addTo(iArr3, 24, iArr3, 16, org.bouncycastle.math.raw.Nat256.addTo(iArr3, 0, iArr3, 8, 0) + addToEachOther);
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        int[] create2 = org.bouncycastle.math.raw.Nat256.create();
        boolean z = org.bouncycastle.math.raw.Nat256.diff(iArr, 8, iArr, 0, create, 0) != org.bouncycastle.math.raw.Nat256.diff(iArr2, 8, iArr2, 0, create2, 0);
        int[] createExt = org.bouncycastle.math.raw.Nat256.createExt();
        org.bouncycastle.math.raw.Nat256.mul(create, create2, createExt);
        org.bouncycastle.math.raw.Nat.addWordAt(32, addToEachOther + addTo + (z ? org.bouncycastle.math.raw.Nat.addTo(16, createExt, 0, iArr3, 8) : org.bouncycastle.math.raw.Nat.subFrom(16, createExt, 0, iArr3, 8)), iArr3, 24);
    }
}

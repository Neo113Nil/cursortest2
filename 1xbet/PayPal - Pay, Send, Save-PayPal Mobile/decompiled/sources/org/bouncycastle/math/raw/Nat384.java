package org.bouncycastle.math.raw;

/* loaded from: classes17.dex */
public abstract class Nat384 {
    public static void square(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Nat192.square(iArr, iArr2);
        org.bouncycastle.math.raw.Nat192.square(iArr, 6, iArr2, 12);
        int addToEachOther = org.bouncycastle.math.raw.Nat192.addToEachOther(iArr2, 6, iArr2, 12);
        int addTo = org.bouncycastle.math.raw.Nat192.addTo(iArr2, 18, iArr2, 12, org.bouncycastle.math.raw.Nat192.addTo(iArr2, 0, iArr2, 6, 0) + addToEachOther);
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.raw.Nat192.diff(iArr, 6, iArr, 0, create, 0);
        int[] createExt = org.bouncycastle.math.raw.Nat192.createExt();
        org.bouncycastle.math.raw.Nat192.square(create, createExt);
        org.bouncycastle.math.raw.Nat.addWordAt(24, addToEachOther + addTo + org.bouncycastle.math.raw.Nat.subFrom(12, createExt, 0, iArr2, 6), iArr2, 18);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        org.bouncycastle.math.raw.Nat192.mul(iArr, iArr2, iArr3);
        org.bouncycastle.math.raw.Nat192.mul(iArr, 6, iArr2, 6, iArr3, 12);
        int addToEachOther = org.bouncycastle.math.raw.Nat192.addToEachOther(iArr3, 6, iArr3, 12);
        int addTo = org.bouncycastle.math.raw.Nat192.addTo(iArr3, 18, iArr3, 12, org.bouncycastle.math.raw.Nat192.addTo(iArr3, 0, iArr3, 6, 0) + addToEachOther);
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        int[] create2 = org.bouncycastle.math.raw.Nat192.create();
        boolean z = org.bouncycastle.math.raw.Nat192.diff(iArr, 6, iArr, 0, create, 0) != org.bouncycastle.math.raw.Nat192.diff(iArr2, 6, iArr2, 0, create2, 0);
        int[] createExt = org.bouncycastle.math.raw.Nat192.createExt();
        org.bouncycastle.math.raw.Nat192.mul(create, create2, createExt);
        org.bouncycastle.math.raw.Nat.addWordAt(24, addToEachOther + addTo + (z ? org.bouncycastle.math.raw.Nat.addTo(12, createExt, 0, iArr3, 6) : org.bouncycastle.math.raw.Nat.subFrom(12, createExt, 0, iArr3, 6)), iArr3, 18);
    }
}

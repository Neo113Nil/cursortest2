package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0970Qb implements java.util.Comparator<com.facebook.ads.redexgen.core.C0971Qc> {
    public static java.lang.String[] A00 = {"RlDlwXS4AA55AOqx8zmN7uoMQ4", "FglEZvMIBCB6z", "AxTekMmYmWDdJoDxuavW255zDNKNRAPE", "pDpvZxom4p5NfzWuwibdxFCyrgD8wKok", "A10HdUhRMRjxQ62diLF5JQ0qPoODY0oj", "HiaacAz8KFEe90RKULVJfn7mD15J7Igj", "NHRqTP3H9N0qm1ewn1pnzRz0iIE8sZVk", "d5VyinGL3JDhuqMz7l90vG32rgbNgkhM"};

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(com.facebook.ads.redexgen.core.C0971Qc c0971Qc, com.facebook.ads.redexgen.core.C0971Qc c0971Qc2) {
        if ((c0971Qc.A03 == null) != (c0971Qc2.A03 == null)) {
            com.facebook.ads.redexgen.core.C7M c7m = c0971Qc.A03;
            if (A00[1].length() == 18) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A00;
            strArr[7] = "WTdcF3CBINcFCy4xHoe1W3dXr7HqLtJl";
            strArr[3] = "sYvRb4Jfa5Xca5GLbtDoWdBBrccl9kaR";
            return c7m == null ? 1 : -1;
        }
        if (c0971Qc.A04 != c0971Qc2.A04) {
            return c0971Qc.A04 ? -1 : 1;
        }
        int i = c0971Qc2.A02 - c0971Qc.A02;
        if (i != 0) {
            return i;
        }
        int i2 = c0971Qc.A00;
        int deltaViewVelocity = c0971Qc2.A00;
        int i3 = i2 - deltaViewVelocity;
        if (i3 != 0) {
            return i3;
        }
        return 0;
    }
}

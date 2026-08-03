package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fb extends com.ironsource.adqualitysdk.sdk.i.ev {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2058 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2059 = {com.ironsource.B5.U};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2060 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2061 = 1;

    public fb(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7751(int i) {
        int i2 = 2 % 2;
        int i3 = f2058 + 17;
        int i4 = i3 % 128;
        f2060 = i4;
        int i5 = i3 % 2;
        if (i != 0) {
            return false;
        }
        int i6 = i4 + 23;
        f2058 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ */
    final boolean mo7750(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f2058 + 17;
        f2060 = i2 % 128;
        int i3 = i2 % 2;
        boolean equals = str.equals(str2);
        int i4 = f2058 + 93;
        f2060 = i4 % 128;
        if (i4 % 2 == 0) {
            return equals;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ */
    final boolean mo7749(java.lang.Object obj, java.lang.Object obj2) {
        int i = 2 % 2;
        if (obj == obj2) {
            int i2 = f2058 + 97;
            f2060 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f2058 + 93;
        f2060 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2060 + 105;
        f2058 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7756(android.widget.ExpandableListView.getPackedPositionType(0L) + 2, "¬¬", (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 110)).intern();
        int i4 = f2060 + 17;
        f2058 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7756(int i, java.lang.String str, byte b) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
            char[] cArr3 = f2059;
            char c = f2061;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i) {
                    com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                    com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                    if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b);
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b);
                    } else {
                        com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c;
                        if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c) - 1) % c;
                            int i2 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i2];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i3];
                        } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c) - 1) % c;
                            int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i4];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i5];
                        } else {
                            int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i6];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i7];
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                }
            }
            str2 = new java.lang.String(cArr4);
        }
        return str2;
    }
}

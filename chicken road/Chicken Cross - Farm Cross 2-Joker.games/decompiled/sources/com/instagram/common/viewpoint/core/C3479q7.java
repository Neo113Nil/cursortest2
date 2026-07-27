package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.q7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3479q7 implements AnonymousClass24 {
    public final C3484qC A00;

    @Deprecated
    public final AW A01;
    public final C3482qA A02;
    public final AnonymousClass32 A03;

    @Deprecated
    public final C3481q9 A04;
    public final C3474q2 A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C3479q7 A09 = new C16862u().A05();
    public static final AnonymousClass23<C3479q7> A08 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qE
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C3479q7 A00;
            A00 = C3479q7.A00(bundle);
            return A00;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3479q7 A00(Bundle bundle) {
        String str = (String) AbstractC17143y.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C3482qA A6f = bundle2 == null ? C3482qA.A07 : C3482qA.A06.A6f(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C3474q2 A6f2 = bundle3 == null ? C3474q2.A0Z : C3474q2.A0Y.A6f(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C3479q7(str, bundle4 == null ? AW.A00 : C3484qC.A05.A6f(bundle4), null, A6f, A6f2);
    }

    public C3479q7(String str, AW aw, C3481q9 c3481q9, C3482qA c3482qA, C3474q2 c3474q2) {
        this.A06 = str;
        this.A03 = c3481q9;
        this.A04 = c3481q9;
        this.A02 = c3482qA;
        this.A05 = c3474q2;
        this.A00 = aw;
        this.A01 = aw;
    }

    public static String A02(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3479q7)) {
            return false;
        }
        C3479q7 c3479q7 = (C3479q7) obj;
        if (C5C.A1E(this.A06, c3479q7.A06)) {
            C3484qC c3484qC = this.A00;
            C3484qC c3484qC2 = c3479q7.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c3484qC.equals(c3484qC2) && C5C.A1E(this.A03, c3479q7.A03) && C5C.A1E(this.A02, c3479q7.A02) && C5C.A1E(this.A05, c3479q7.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int hashCode = (((i + result2) * 31) + this.A02.hashCode()) * 31;
        C3484qC c3484qC = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int charAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (charAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c3484qC.hashCode();
        return ((hashCode + result4) * 31) + this.A05.hashCode();
    }
}

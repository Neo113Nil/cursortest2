package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.Format;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.List;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.oH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1796oH implements C1S {
    public static byte[] A05;
    public static final C1R<C1796oH> A06;
    public static final String A07;
    public static final String A08;
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C1830or[] A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{95, Ascii.FS, 16, Ascii.DC2, Ascii.GS, Ascii.SYN, 17, Ascii.SUB, Ascii.ESC, 95, Ascii.SYN, 17, 95, 16, 17, Ascii.SUB, 95, 43, Ascii.CR, Ascii.RS, Ascii.FS, Ascii.DC4, 56, Ascii.CR, 16, 10, Ascii.SI, 69, 95, 88, 100, 99, 107, 55, 49, 34, 32, 40, 99, 112, 119, Byte.MAX_VALUE, 35, 37, 54, 52, 60, 119, 103, 126, 119, 54, 57, 51, 119, 112, 62, 106, 71, 72, 72, 75, 92, 75, 64, 90, Ascii.SO, Ascii.SYN, 48, 35, 33, 41, 5, 48, 45, 55, 50, 50, Utf8.REPLACEMENT_BYTE, 48, 57, 43, Utf8.REPLACEMENT_BYTE, 57, 59, 45, 40, 53, 54, Utf8.REPLACEMENT_BYTE, 122, 60, 54, 59, Base64.padSymbol, 41, Base64.padSymbol, 38, 44};
    }

    static {
        A05();
        A07 = AbstractC01424a.A0h(0);
        A08 = AbstractC01424a.A0h(1);
        A06 = new C1R() { // from class: com.facebook.ads.redexgen.X.oI
            @Override // com.instagram.common.viewpoint.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C1796oH.A01(bundle);
            }
        };
    }

    public C1796oH(String str, C1830or... c1830orArr) {
        C3M.A07(c1830orArr.length > 0);
        this.A03 = str;
        this.A04 = c1830orArr;
        this.A01 = c1830orArr.length;
        int A01 = AbstractC00972h.A01(c1830orArr[0].A0W);
        this.A02 = A01 == -1 ? AbstractC00972h.A01(c1830orArr[0].A0S) : A01;
        A04();
    }

    public C1796oH(C1830or... c1830orArr) {
        this(A02(0, 0, 114), c1830orArr);
    }

    public static int A00(int i) {
        return i | 16384;
    }

    public static /* synthetic */ C1796oH A01(Bundle bundle) {
        List A01;
        List<Format> formats = bundle.getParcelableArrayList(A07);
        if (formats == null) {
            A01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = C3S.A01(C1830or.A0b, formats);
        }
        String id = bundle.getString(A08, A02(0, 0, 114));
        return new C1796oH(id, (C1830or[]) A01.toArray(new C1830or[0]));
    }

    public static String A03(String str) {
        return (str == null || str.equals(A02(96, 3, 71))) ? A02(0, 0, 114) : str;
    }

    private void A04() {
        String A03 = A03(this.A04[0].A0V);
        int A00 = A00(this.A04[0].A0E);
        for (int i = 1; i < this.A04.length; i++) {
            String language = this.A04[i].A0V;
            if (!A03.equals(A03(language))) {
                String str = this.A04[0].A0V;
                String str2 = this.A04[i].A0V;
                String language2 = A02(77, 9, 81);
                A06(language2, str, str2, i);
                return;
            }
            if (A00 != A00(this.A04[i].A0E)) {
                String binaryString = Integer.toBinaryString(this.A04[0].A0E);
                String binaryString2 = Integer.toBinaryString(this.A04[i].A0E);
                String language3 = A02(86, 10, 85);
                A06(language3, binaryString, binaryString2, i);
                return;
            }
        }
    }

    public static void A06(String str, String str2, String str3, int i) {
        AnonymousClass44.A08(A02(67, 10, 77), A02(0, 0, 114), new IllegalStateException(A02(57, 10, 33) + str + A02(0, 30, 112) + str2 + A02(39, 17, 88) + str3 + A02(30, 9, 76) + i + A02(56, 1, 24)));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A07(C1830or c1830or) {
        for (int i = 0; i < i; i++) {
            if (c1830or == this.A04[i]) {
                return i;
            }
        }
        return -1;
    }

    public final C1830or A08(int i) {
        return this.A04[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1796oH c1796oH = (C1796oH) obj;
        return this.A03.equals(c1796oH.A03) && Arrays.equals(this.A04, c1796oH.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A03.hashCode();
            this.A00 = (((17 * 31) + result) * 31) + Arrays.hashCode(this.A04);
        }
        int result2 = this.A00;
        return result2;
    }
}

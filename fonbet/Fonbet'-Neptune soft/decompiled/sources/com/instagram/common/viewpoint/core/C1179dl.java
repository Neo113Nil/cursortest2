package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1179dl implements LA {
    public static byte[] A01;
    public static String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ C1127cu A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-89, -85, -97, -91, -93};
        String[] strArr = A02;
        if (strArr[4].charAt(11) == strArr[0].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "8YVOAkqjlCZIfPO923uAjm7vB9HJVDjx";
        strArr2[0] = "zjuPMStvlm1D7VGZIKzQB2odE0473uv0";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1179dl(C1127cu c1127cu) {
        this.A00 = c1127cu;
    }

    @Override // com.instagram.common.viewpoint.core.LA
    public final void AAq(Throwable th) {
        this.A00.A08().AAy(A00(0, 5, 39), AbstractC0766Sv.A1e, new C0767Sw(th));
    }

    @Override // com.instagram.common.viewpoint.core.LA
    public final void AB4(Throwable th) {
        this.A00.A08().AAy(A00(0, 5, 39), AbstractC0766Sv.A1g, new C0767Sw(th));
    }

    @Override // com.instagram.common.viewpoint.core.LA
    public final void AGk(String str, int i, String str2, Long l, Long l2, C0562Kv c0562Kv) {
        SI.A05(this.A00, c0562Kv.A06, c0562Kv.A08, c0562Kv.A09, c0562Kv.A07, c0562Kv.A03, i, str2, l, l2, null);
    }

    @Override // com.instagram.common.viewpoint.core.LA
    public final void AGl(String str, boolean z, C0562Kv c0562Kv) {
        SI.A04(this.A00, new SH(c0562Kv.A06, c0562Kv.A08, c0562Kv.A07, c0562Kv.A03, str), z);
    }
}

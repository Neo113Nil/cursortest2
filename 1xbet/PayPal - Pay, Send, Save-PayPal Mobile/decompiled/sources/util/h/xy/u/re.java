package util.h.xy.u;

/* loaded from: classes18.dex */
public final class re {
    private static long getHighResolutionOutputSizeshNQ4ISI = -1832003383802470062L;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m27550() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 83) + (i | 83);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        try {
            int i3 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            char[] charArray = "氁汫ᥔO䍁ޕে燃晅䮚\ue97a羚Ꞥﱬ轮叐巀剈ᔼ㗙﯂\ua83b묥꿱釛ื䇑Ȉ༞旓".toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i3);
            aVar.f2623 = 4;
            while (aVar.f2623 < m27721.length) {
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
                aVar.f2623++;
            }
            java.lang.String str = new java.lang.String(m27721, 4, m27721.length - 4);
            java.lang.String str2 = str;
            java.security.SecureRandom secureRandom = (java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            byte[] bArr = new byte[12];
            int nextInt = secureRandom.nextInt(9);
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i4 = ~nextInt;
            int i5 = (i4 & 49) | (i4 ^ 49);
            int i6 = ~currentTimeMillis;
            int i7 = -(-(((i5 ^ i6) | (i5 & i6)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
            int i8 = ~((i4 ^ (-50)) | (i4 & (-50)));
            int i9 = ~((i6 ^ 49) | (i6 & 49));
            bArr[0] = (byte) ((((((nextInt * 185) - 8967) + (((nextInt ^ (-50)) | (nextInt & (-50))) * (-368))) - (~i7)) - 1) + (((~((nextInt ^ 49) | (nextInt & 49))) | (i9 ^ i8) | (i9 & i8)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
            int i10 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = ((i10 & 113) + (i10 | 113)) % 128;
            int i11 = 1;
            while (i11 < 12) {
                int i12 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = (((i12 | 61) << 1) - (i12 ^ 61)) % 128;
                bArr[i11] = (byte) (secureRandom.nextInt(10) + 48);
                i11++;
                int i13 = getHighSpeedVideoSizes;
                int i14 = ((i13 | 83) << 1) - (i13 ^ 83);
                getHighSpeedVideoFpsRanges = i14 % 128;
                int i15 = i14 % 2;
            }
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 63) % 128;
            return bArr;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
